package X;

import android.widget.SeekBar;
import com.ss.android.ugc.aweme.filter.FilterBean;

/* loaded from: classes15.dex */
public final class WPH implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C82247WPr LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public WPH(C82247WPr c82247WPr) {
        this.LJLIL = c82247WPr;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C82247WPr c82247WPr = this.LJLIL;
        FilterBean filterBean = c82247WPr.LJIIIIZZ;
        if (filterBean != null) {
            c82247WPr.LJIIL.onNext(new W1T(C9B4.CHANGE_END, Integer.valueOf(c82247WPr.LJIIIZ), filterBean, Boolean.FALSE));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        boolean z2;
        if (!(seekBar instanceof C173626re)) {
            seekBar = null;
        }
        C173626re c173626re = (C173626re) seekBar;
        if (c173626re != null) {
            i2 = c173626re.getDefaultDotProgress();
        } else {
            i2 = -1;
        }
        C82247WPr c82247WPr = this.LJLIL;
        if (i2 == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        c82247WPr.LJIIIZ = i;
        FilterBean filterBean = c82247WPr.LJIIIIZZ;
        if (filterBean != null) {
            c82247WPr.LJIIL.onNext(new W1T(C9B4.CHANGING, Integer.valueOf(i), filterBean, Boolean.valueOf(z2)));
        }
    }
}
