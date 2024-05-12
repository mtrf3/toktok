package X;

import android.widget.SeekBar;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQ7 implements WQ8 {
    public final SeekBar LIZ;

    @Override // X.WQ8
    public final boolean getVisibility() {
        if (this.LIZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.WQ8
    public final SeekBar LIZ() {
        return this.LIZ;
    }

    public WQ7(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
        this.LIZ = seekBar;
        seekBar.setVisibility(0);
    }

    @Override // X.WQ8
    public final void setVisibility(boolean z) {
        int i;
        SeekBar seekBar = this.LIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        seekBar.setVisibility(i);
    }
}
