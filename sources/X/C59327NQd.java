package X;

import Y.IDBReceiverS8S0100000_8;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.NQd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59327NQd {
    public static final C59327NQd LJ = new C59327NQd();
    public WeakReference<Context> LIZ;
    public IDBReceiverS8S0100000_8 LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZ(boolean z) {
        if (this.LIZLLL != z) {
            this.LIZLLL = z;
            if (this.LIZJ) {
                if (z) {
                    C59881Nen.LJ.LIZIZ();
                } else {
                    C59881Nen.LJ.LIZ();
                }
            }
        }
    }
}
