package tv.cloudwalker.rowfragmentdifferentview;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.FocusHighlight;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;

import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.ByteArrayOutputStream;

public class TitleFragment extends RowsSupportFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadTitle();
    }
    @SuppressLint("UseCompatLoadingForDrawables")
    private void loadTitle() {
        ClassPresenterSelector classPresenterSelector = new ClassPresenterSelector();
        ListRowPresenter listRowPresenter = new ListRowPresenter(FocusHighlight.ZOOM_FACTOR_NONE, false);
        ArrayObjectAdapter listRowsAdapter = new ArrayObjectAdapter(listRowPresenter);
        TitlePresenter titlePresenter = new TitlePresenter();
        LogoPresenter logoPresenter = new LogoPresenter();
        classPresenterSelector.addClassPresenter(ListRow.class,titlePresenter);
        classPresenterSelector.addClassPresenter(ListRow.class,logoPresenter);

        ArrayObjectAdapter rowAdapter = new ArrayObjectAdapter(classPresenterSelector);
        rowAdapter.add(getResources().getDrawable(R.drawable.logo));
        rowAdapter.add("Search");
        rowAdapter.add("For You");
        rowAdapter.add("Movies");
        rowAdapter.add("Apps");
        rowAdapter.add("Library");
        listRowsAdapter.add(new ListRow(rowAdapter));
        setAdapter(listRowsAdapter);



    }

}