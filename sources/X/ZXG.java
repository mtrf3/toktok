package X;

import Y.IDRunnableS86S0100000_24;
import android.widget.SeekBar;

/* loaded from: classes29.dex */
public class ZXG implements SeekBar.OnSeekBarChangeListener {
    public final Runnable LJLIL = new IDRunnableS86S0100000_24(this, 2);
    public final /* synthetic */ DialogC90914ZmA LJLILLLLZI;

    public ZXG(DialogC90914ZmA dialogC90914ZmA) {
        this.LJLILLLLZI = dialogC90914ZmA;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        DialogC90914ZmA dialogC90914ZmA = this.LJLILLLLZI;
        if (dialogC90914ZmA.LLIIJI != null) {
            dialogC90914ZmA.LLIIIL.removeCallbacks(this.LJLIL);
        }
        this.LJLILLLLZI.LLIIJI = (ZY4) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LJLILLLLZI.LLIIIL.postDelayed(this.LJLIL, 500L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((ZY4) seekBar.getTag()).LJIIIZ(i);
        }
    }
}
