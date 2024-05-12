package X;

import Y.IDBReceiverS4S0100000;
import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* renamed from: X.01x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC009301x {
    public IDBReceiverS4S0100000 LIZ;
    public final /* synthetic */ AppCompatDelegateImpl LIZIZ;

    public abstract IntentFilter LIZIZ();

    public abstract int LIZJ();

    public abstract void LIZLLL();

    public final void LIZ() {
        IDBReceiverS4S0100000 iDBReceiverS4S0100000 = this.LIZ;
        if (iDBReceiverS4S0100000 != null) {
            try {
                C16880lQ.LJJLIIIJL(this.LIZIZ.LJLJJL, iDBReceiverS4S0100000);
            } catch (IllegalArgumentException unused) {
            }
            this.LIZ = null;
        }
    }

    public final void LJ() {
        LIZ();
        IntentFilter LIZIZ = LIZIZ();
        if (LIZIZ == null || LIZIZ.countActions() == 0) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new IDBReceiverS4S0100000(this, 0);
        }
        C16880lQ.LJJLIIIJILLIZJL(this.LIZ, this.LIZIZ.LJLJJL, LIZIZ);
    }

    public AbstractC009301x(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.LIZIZ = appCompatDelegateImpl;
    }
}
