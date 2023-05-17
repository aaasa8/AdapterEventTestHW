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
	:RecyclerView.Adapter<FoodAdapter.FooodViewHolder>() {

   // RecyclerView 에 표시할 전체 뷰의 개수 == 원본 데이터의 개수, 데이터의 개수 확인이 필요할 때 호출
    override fun getItemCount(): Int = foods.size

    // 각 항목의 뷰를 보관하는 Holder, 각 item view의 view holder 생성 시 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FoodViewHolder(itemView)
    }

    // 항목의 뷰를 생성한 후 멤버변수로 보관하는 ViewHolder
    class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvText : TextView = view.findViewById(R.id.tvText)
        init {
            // adapter의 notifyDatasetChanged 및 adapter의 멤버변수 list 사용하여 이벤트 처리
            view.setOnLongClickListener {
                adapter.list.removeAt(adapterPosition)
                adapter.notifyDataSetChanged()
                true
            }
        }
    }

    // Holder 에 보관중인 View 에 원본 데이터 연결, 각 item view의 항목에 데이터 결합 시 호출
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.photo.setImageResource(foods[position].photo)
				holder.food.text = foods[position].food
				holder.count.text = foods[position].count.toString()
    }



}
