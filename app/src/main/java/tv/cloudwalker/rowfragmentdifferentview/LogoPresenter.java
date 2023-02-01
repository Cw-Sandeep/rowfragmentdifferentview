package tv.cloudwalker.rowfragmentdifferentview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.leanback.widget.Presenter;

import com.bumptech.glide.Glide;

public class LogoPresenter extends Presenter {
    public static Context mContext;
    public class LogoViewHolder extends Presenter.ViewHolder{
        public ImageView logo;
        public LogoViewHolder(View view) {
            super(view);
            logo = view.findViewById(R.id.brandIcon);
        }

        public void updateViewImage(Drawable item) {
            Glide.with(mContext)
                    .load(R.drawable.logo)
                    .into(logo);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        Log.d("TAG", "onCreateViewHolder: ");
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_logo, parent,false);
        view.setFocusable(true);
        return new LogoViewHolder(view);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        Log.d("TAG", "onBindViewHolder: ");
        ((LogoViewHolder) viewHolder).logo.getLayoutParams().width = 50;
        ((LogoViewHolder) viewHolder).logo.getLayoutParams().height = 50;
        ((LogoViewHolder) viewHolder).logo.getResources().getDrawable(R.drawable.logo);
    }

    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {

    }


}
