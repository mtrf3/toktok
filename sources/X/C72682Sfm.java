package X;

import android.widget.SeekBar;

/* renamed from: X.Sfm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72682Sfm implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C72678Sfi LJLIL;
    public final /* synthetic */ C72588SeG LJLILLLLZI;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C72682Sfm(C72678Sfi c72678Sfi, C72588SeG c72588SeG) {
        this.LJLIL = c72678Sfi;
        this.LJLILLLLZI = c72588SeG;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C72678Sfi c72678Sfi = this.LJLIL;
        InterfaceC72697Sg1 interfaceC72697Sg1 = c72678Sfi.LJLIL;
        if (interfaceC72697Sg1 != null) {
            C72588SeG c72588SeG = this.LJLILLLLZI;
            c72678Sfi.getClass();
            int i2 = (int) ((((c72588SeG.LIZLLL - r1) * i) / 100.0f) + c72588SeG.LIZJ);
            interfaceC72697Sg1.LIZ(c72588SeG, i2 - (i2 % c72588SeG.LJ));
        }
    }
}
