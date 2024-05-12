package X;

import android.widget.SeekBar;

/* renamed from: X.aUs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93686aUs implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C94062aaw LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C93686aUs(C94062aaw c94062aaw) {
        this.LJLIL = c94062aaw;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        for (InterfaceC88472Yns<Double, C76800UCe> interfaceC88472Yns : this.LJLIL.LJLILLLLZI) {
            C94062aaw c94062aaw = this.LJLIL;
            double d = c94062aaw.LJLJJI;
            double d2 = c94062aaw.LJLJI;
            double max = ((i / this.LJLIL.getMax()) * (d - d2)) + d2;
            if (max >= d2) {
                d2 = max;
            }
            if (d2 <= d) {
                d = d2;
            }
            interfaceC88472Yns.invoke(Double.valueOf(d));
        }
    }
}
