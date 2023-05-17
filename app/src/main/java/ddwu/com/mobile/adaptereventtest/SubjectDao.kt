package ddwu.com.mobile.adaptereventtest
//이름 FoodDao로 변경하기
class SubjectDao() {
    val foods = ArrayList<FoodDto>()

    init{
        foods.add(FoodDto(R.drawble.food01, "치즈", 10))
        foods.add(FoodDto(R.drawble.food02, "치킨", 5))
        foods.add(FoodDto(R.drawble.food03, "도넛", 15))
        foods.add(FoodDto(R.drawble.food04, "사과", 20))
        foods.add(FoodDto(R.drawble.food05, "핫도그", 3))
        foods.add(FoodDto(R.drawble.food06, "파스타", 5))
        foods.add(FoodDto(R.drawble.food07, "아이스크림", 15))
    }
}

