package X;

import android.widget.SeekBar;
import kotlin.jvm.internal.o;

/* renamed from: X.CdW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31774CdW implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C31773CdV LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
    }

    public C31774CdW(C31773CdV c31773CdV) {
        this.LJLIL = c31773CdV;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        o.LJIIIZ(seekBar, "seekBar");
        InterfaceC31772CdU callBack = this.LJLIL.getCallBack();
        if (callBack != null) {
            callBack.LIZJ(i);
        }
    }
}
