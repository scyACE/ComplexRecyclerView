package scy.com.animotions;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/4/10.
 */

public class TypeThreeViewHolder extends TypeAbstraceViewHolder{

    public ImageView avatar,contentColor;
    public TextView name,content;

    public TypeThreeViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar);
        contentColor = (ImageView) itemView.findViewById(R.id.contentColor);
        name = (TextView) itemView.findViewById(R.id.name);
        content = (TextView) itemView.findViewById(R.id.content);
    }


    @Override
    public void bindHolder(DataModel model){
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        content.setText(model.content);
        contentColor.setBackgroundResource(model.contentColor);
    }


}
