package tv.cloudwalker.rowfragmentdifferentview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.leanback.widget.Presenter;

import com.bumptech.glide.Glide;

public class TitlePresenter extends Presenter {
    private static Context mContext;

    public class ViewHolder extends Presenter.ViewHolder{
        public TextView title;
        public ImageView logoImage;

        public ViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.Titletextview);
            logoImage =view.findViewById(R.id.logo);
        }
        public void updateViewImage() {
            Glide.with(mContext)
                    .load(R.drawable.logo)
                    .into(logoImage);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.fragment_title, parent,false);
        view.setFocusable(true);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        ((ViewHolder) viewHolder).logoImage.getLayoutParams().width = 100;
        ((ViewHolder) viewHolder).logoImage.getLayoutParams().height = 100;
        ((ViewHolder) viewHolder).updateViewImage();
        ((ViewHolder) viewHolder).title.setText((String) item);

    }

    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {

    }

}
