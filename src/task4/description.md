### 4 задание

Условие

Ограничение времени

1 секунда

Ограничение памяти

256 МБ

Сегодня у девочки Арины из Санкт-Петербурга выпускной, и она хочет, чтобы её первая дискотека прошла идеально. Для этого нужно воспроизвести плейлист в специфическом порядке по определенным правилам.

Арина очень любит рейв, и для каждой песни может определить её танцевальность − некоторое натуральное число. У девочки n любимых песен, которые можно описать как массив a1,a2,...,an, где ai танцевальность i-й песни. На дискотеке перемешают любимые треки Арины и включат: формально, диджей выберет некоторую перестановку p1,...,pn, тогда i-й по счету будет играть песня с танцевальностью ﻿bi=apib_i = {a_p}_ibi​=ap​i. Арина любит, когда песни сочетаются между собой, и её счастье от проигрывания i-го трека будет равно ci=НОД(b1,...,bi) − наибольший общий делитель значений танцевальности всех ранее проигранных песен. Таким образом, зная порядок проигрывания плейлиста b1,...,bn можно определить массив счастья Арины − последовательность c1,...,cn, где ci=НОД(b1,...,bi).

Диджей Андрей Болконский, друг Арины, хочет, чтобы она была максимально счастлива. Помогите ему выбрать порядок проигрывания таким образом, чтобы массив счастья c1,...,cn был лексикографически максимальным.


Последовательность a лексикографически больше последовательности b, если и только если выполняется один из следующих пунктов: b префикс a, но b != a; в первой позиции, где a и b различны, в последовательности a элемент больше, чем соответствующий элемент в b.


Формат входных данных

Каждый тест содержит несколько наборов входных данных. Первая строка содержит количество наборов входных данных t (1 <= t <= 103). Описание наборов входных данных приведено ниже.

Первая строка каждого набора данных содержит одно целое число - n (1 <= n <= 103) − длину последовательности a.

Вторая строка каждого набора данных содержит n целых чисел a1,...,an(1 <= ai <= 103) − последовательность a значений танцевальности.

Гарантируется, что сумма значений n по всем наборам входных данных не превосходит 10^3.

Формат выходных данных

На каждый набор входных данных выведите ответ в отдельной строке − искомый массив b. Если существует несколько подходящих массивов, выведите любой из них.

Обратите внимание: массив b должен быть перестановкой массива a. Иными словами, если элемент со значением x входит в a ровно k раз, то в b он также входит ровно k раз.

Замечание

В первом примере возможны два порядка b: [2,5] и [5,2]. В первом случае c=[2,1], а во втором c=[5,1].

Во втором примере первым должен идти трек со значением b1=8; среди оставшихся только НОД(8,2)>1, поэтому b2=2; оставшиеся песни можно расположить в любом порядке.

В седьмом примере 4 числа имеют общий делитель хотя бы 2, однако оптимальным будет взять b1=17.

### Примеры данных

### Пример 1
#### ввод
7<br>
2<br>
2 5<br>
4<br>
1 8 2 3<br>
3<br>
3 8 9<br>
5<br>
64 25 75 100 50<br>
1<br>
42<br>
6<br>
96 128 88 80 52 7<br>
5<br>
2 4 8 16 17<br>
#### вывод
5 2<br>
8 2 1 3<br>
9 3 8<br>
100 50 25 75 64<br>
42<br>
128 96 80 88 52 7<br>
17 2 4 8 16<br>