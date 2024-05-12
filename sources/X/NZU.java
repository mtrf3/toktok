package X;

import com.zhiliaoapp.musically.R;
import java.util.TimerTask;

/* loaded from: classes11.dex */
public final class NZU extends TimerTask {
    public final /* synthetic */ NZQ LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        int i;
        try {
            NZQ nzq = this.LJLIL;
            int i2 = nzq.LLFII + 1;
            nzq.LLFII = i2;
            if (i2 > 2) {
                if (i2 <= 4) {
                    i = (((i2 - 2) * 20) / 2) + 60;
                } else if (i2 <= 10) {
                    i = (((i2 - 4) * 10) / 6) + 80;
                } else {
                    nzq.LJJI();
                    i = 90;
                }
            } else {
                i = (i2 * 60) / 2;
            }
            if (i > nzq.LLFZ) {
                ((C61326O5a) nzq.LJFF(R.id.hju)).setProgress(i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public NZU(NZQ nzq) {
        this.LJLIL = nzq;
    }
}
