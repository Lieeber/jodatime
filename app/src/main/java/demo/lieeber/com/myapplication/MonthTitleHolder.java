package demo.lieeber.com.myapplication;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * Created by lieeber on 16/9/9.
 */
public class MonthTitleHolder extends ViewHolder {
    public MonthTitleHolder(View inflate) {
        super(inflate);

    }

    public void setData(MonthModel monthModel) {
        ((TextView) this.itemView).setText(monthModel.year +"年"+ monthModel.month);
    }
}
