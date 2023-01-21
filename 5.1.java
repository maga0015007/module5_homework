let a = prompt ('Введите значение');
let num = +a;
if (a == "") {
  console.log('Упс, кажется, вы ошиблись')
} else if (num != num){
  console.log('Упс, кажется, вы ошиблись')
} else if (num % 2 == 0) {
  console.log('четное')
} else {
  console.log('нечотное')
}
