# Урок 4. Зависимости в тестах
# Задание 1. Ответьте письменно на вопросы:
1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
Тестовые заглушки используют для упрощения тестирования, так как они передаются тестируемой системе вместо 
реальных зависимостей, что позволяет тестированить ее изолированно. 
Этот подход улучшает скорость и надежность тестов, так как позволяет концентрироваться на одной задаче.

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван 
с определенными аргументами?
Используются тестовые зашлушки (test double), а именно моки (mock,spy). 
Моки помогают эмулировать и проверять выходные взаимодействия — то есть вызовы, совершаемые тестируемой 
системой к её зависимостям для изменения их состояния. Шпионы могут возвращать реальные значения и 
использовать заглушки для контроля. Можно использовать моки и задать ожидаемые аргументы и проверить, 
вызывался ли метод с этим аргументом.

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или 
исключение в ответ на вызов метода?
Stub-обьекты предоставляют готовые ответы на вызовы, они возвращают предопределённое значение. 
Это готовые ответы на вызовы, сделанные во время теста, обычно вообще не реагируя ни на что, 
кроме того, что запрограммировано для теста.

4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
Fake (подделка) — это тестовая заглушка, представляет собой простую и легковесную рабочую реализацию. 
Fake используется, чтобы запускать тесты быстрее. Это замена тяжеловесного внешнего зависимого объекта (например БД)
легковесной реализацией.

# Задание 2.
У вас есть класс BookService, который использует интерфейс BookRepository для получения информации 
о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания 
мок-объекта BookRepository.