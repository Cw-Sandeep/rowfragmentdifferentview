package tv.cloudwalker.rowfragmentdifferentview;

import android.content.Context;

import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;

public class CardPresenterSelector extends PresenterSelector {
    private Context context;

    public CardPresenterSelector(Context context) {
        this.context = context;
    }



    @Override
    public Presenter getPresenter(Object item) {

        return null;
    }
}
