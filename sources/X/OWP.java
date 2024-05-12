package X;

import android.widget.SeekBar;

/* loaded from: classes11.dex */
public final class OWP implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ OWQ LJLIL;

    public OWP(OWQ owq) {
        this.LJLIL = owq;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i;
        if (seekBar != null) {
            i = seekBar.getProgress();
        } else {
            i = 0;
        }
        this.LJLIL.LIZ("seekbegin", C51029K0z.LJJIIZI(new OSZ("currentDuration", Integer.valueOf(i))));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        if (seekBar != null) {
            i = seekBar.getProgress();
        } else {
            i = 0;
        }
        this.LJLIL.LIZ("seekend", C51029K0z.LJJIIZI(new OSZ("currentDuration", Integer.valueOf(i))));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        if (seekBar != null) {
            i2 = seekBar.getProgress();
        } else {
            i2 = 0;
        }
        this.LJLIL.LIZ("seekchanged", C51029K0z.LJJIIZI(new OSZ("currentDuration", Integer.valueOf(i2))));
    }
}
