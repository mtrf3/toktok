package X;

import android.widget.SeekBar;
import kotlin.jvm.internal.o;

/* renamed from: X.CdS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31770CdS implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C31768CdQ LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
    }

    public C31770CdS(C31768CdQ c31768CdQ) {
        this.LJLIL = c31768CdQ;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        o.LJIIIZ(seekBar, "seekBar");
        InterfaceC31772CdU callBack = this.LJLIL.getCallBack();
        if (callBack != null) {
            callBack.LIZ(i);
        }
        this.LJLIL.LJJLJLI(i);
    }
}