package X;

import android.widget.SeekBar;
import kotlin.jvm.internal.AqS145S0200000_14;

/* renamed from: X.TDf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74279TDf implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C74279TDf(AqS145S0200000_14 aqS145S0200000_14) {
        this.LJLIL = aqS145S0200000_14;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.LJLIL.invoke(Integer.valueOf(i));
    }
}
