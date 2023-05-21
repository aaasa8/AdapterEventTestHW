package ddwu.com.mobile.adaptereventtest

import android.content.Context
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
//BindingFoodAdapter로 이름 바꾸기

class FoodAdapter (val foods : ArrayList<FoodDto>)
	:RecyclerView.Adapter<BindingFoodAdapter.FooodViewHolder>() {

   // RecyclerView 에 표시할 전체 뷰의 개수 == 원본 데이터의 개수, 데이터의 개수 확인이 필요할 때 호출
    override fun getItemCount(): Int = foods.size

    // 각 항목의 뷰를 보관하는 Holder, 각 item view의 view holder 생성 시 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(itemBinding)
    }

    // 항목의 뷰를 생성한 후 멤버변수로 보관하는 ViewHolder
    class FoodViewHolder(val itemBinding: ListItemBinding) : RecyclerView.ViewHolder(itemBinding.root)
           


    // Holder 에 보관중인 View 에 원본 데이터 연결, 각 item view의 항목에 데이터 결합 시 호출
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
			holder.itemBinding.ivPhoto.setImageResource(foods[position].photo)
			holder.itemBinding.tvFood.text = foods[position].food
			holder.itemBinding.tvCount.text = foods[position].count.toString()
    }



}
