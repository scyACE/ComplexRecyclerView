package scy.com.animotions;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2017/4/10.
 */

public abstract class TypeAbstraceViewHolder extends RecyclerView.ViewHolder{

    public TypeAbstraceViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindHolder(DataModel model);
}
