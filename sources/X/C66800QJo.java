package X;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.QJo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66800QJo {
    public final Object LIZ = new Object();
    public volatile boolean LIZIZ = false;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final ThreadLocal<Boolean> LIZLLL = new ThreadLocal<>();
    public volatile boolean LJ = false;
    public volatile boolean LJFF = false;

    public final void LIZ(boolean z) {
        if (z) {
            this.LIZLLL.set(Boolean.valueOf(z));
        } else {
            this.LIZLLL.remove();
        }
    }

    public final void LIZIZ(boolean z) {
        this.LJFF = z;
        if (z) {
            this.LIZLLL.set(Boolean.valueOf(z));
        } else {
            this.LIZLLL.remove();
            this.LJ = true;
        }
    }

    public final void LIZJ(Integer num) {
        if (this.LIZJ.compareAndSet(false, true)) {
            C66765QIf LJFF = C66765QIf.LJFF(String.valueOf(num));
            LJFF.LIZ(false, new QKM(this));
            C66799QJn LJ = LJFF.LJ();
            if (LJ != null && !TextUtils.isEmpty(LJ.LJLIL) && !TextUtils.isEmpty(LJ.LJLILLLLZI)) {
                synchronized (this.LIZ) {
                    this.LIZIZ = true;
                    this.LIZ.notifyAll();
                }
            }
        }
    }
}
