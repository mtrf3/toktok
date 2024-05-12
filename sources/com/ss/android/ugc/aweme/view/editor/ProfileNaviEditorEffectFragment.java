package com.ss.android.ugc.aweme.view.editor;

import android.view.View;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ProfileNaviEditorEffectFragment extends ProfileNaviViewPagerFragment implements SeekBar.OnSeekBarChangeListener {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final int getLayout() {
        return R.layout.c75;
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // com.ss.android.ugc.aweme.view.editor.ProfileNaviViewPagerFragment
    public final void wl() {
    }
}
