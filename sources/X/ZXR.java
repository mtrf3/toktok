package X;

import android.widget.SeekBar;
import java.util.HashMap;

/* loaded from: classes29.dex */
public class ZXR implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ DialogC90863ZlL LJLIL;

    public ZXR(DialogC90863ZlL dialogC90863ZlL) {
        this.LJLIL = dialogC90863ZlL;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        DialogC90863ZlL dialogC90863ZlL = this.LJLIL;
        if (dialogC90863ZlL.LJZL != null) {
            dialogC90863ZlL.LJLLLL.removeMessages(2);
        }
        this.LJLIL.LJZL = (ZY4) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LJLIL.LJLLLL.sendEmptyMessageDelayed(2, 500L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        boolean z2;
        if (z) {
            ZY4 zy4 = (ZY4) seekBar.getTag();
            AbstractC90587Zgt abstractC90587Zgt = (AbstractC90587Zgt) ((HashMap) this.LJLIL.LJZI).get(zy4.LIZJ);
            if (abstractC90587Zgt != null) {
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                abstractC90587Zgt.setMute(z2);
            }
            zy4.LJIIIZ(i);
        }
    }
}
