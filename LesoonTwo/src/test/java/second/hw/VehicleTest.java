package second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {
    Car car = new Car("BMW","M5",2020);
    Motorcycle moto = new Motorcycle("Yamaha","MT",2020);

    @Test
    /* Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    (используя оператор instanceof).
    */
    void instanceOF(){
        assertThat(car instanceof Vehicle);
    }

    @Test
    /* Проверить, что объект Car создается с 4-мя колесами.*/
    void wheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    /* Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    (используя метод testDrive())
    */
    void testDriveCar(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    /*Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    (используя метод testDrive()).*/
    void testDriveMoto(){
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    @Test
    /*Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    машина останавливается (speed = 0).*/
    void testDriveAndParkCar(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    /*Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    мотоцикл останавливается (speed = 0)*/
    void testDriveAndParkMoto(){
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }






}