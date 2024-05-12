package X;

import android.view.View;
import defpackage.b1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0De, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03860De {
    public final View LIZIZ;
    public final java.util.Map<String, Object> LIZ = new HashMap();
    public final ArrayList<AbstractC03490Bt> LIZJ = new ArrayList<>();

    public final int hashCode() {
        return this.LIZ.hashCode() + (this.LIZIZ.hashCode() * 31);
    }

    public C03860De() {
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransitionValues@");
        LIZ.append(Integer.toHexString(hashCode()));
        LIZ.append(":\n");
        StringBuilder LIZJ = b1.LIZJ(X1D.LIZIZ(LIZ), "    view = ");
        LIZJ.append(this.LIZIZ);
        LIZJ.append("\n");
        String LJFF = i0.LJFF(X1D.LIZIZ(LIZJ), "    values:");
        for (String str : ((HashMap) this.LIZ).keySet()) {
            StringBuilder LIZLLL = C1FL.LIZLLL(LJFF, "    ", str, ": ");
            LIZLLL.append(((HashMap) this.LIZ).get(str));
            LIZLLL.append("\n");
            LJFF = X1D.LIZIZ(LIZLLL);
        }
        return LJFF;
    }

    public C03860De(View view) {
        this.LIZIZ = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C03860De) {
            C03860De c03860De = (C03860De) obj;
            if (this.LIZIZ == c03860De.LIZIZ && this.LIZ.equals(c03860De.LIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
