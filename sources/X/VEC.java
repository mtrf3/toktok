package X;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VEC {
    public final java.util.Map<String, VED> LIZ = new HashMap();
    public final List<VEA> LIZIZ = new ArrayList();

    public final synchronized VED LIZIZ(C40052Fnk c40052Fnk) {
        Iterator it = ((ArrayList) c40052Fnk.LIZ).iterator();
        if (it.hasNext()) {
            Pair pair = (Pair) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((EnumC40050Fni) pair.first).name());
            LIZ.append((String) pair.second);
            return (VED) ((HashMap) this.LIZ).get(X1D.LIZIZ(LIZ));
        }
        return null;
    }

    public final synchronized void LIZ(C40052Fnk c40052Fnk, VED ved) {
        Iterator it = ((ArrayList) c40052Fnk.LIZ).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((EnumC40050Fni) pair.first).name());
            LIZ.append((String) pair.second);
            ((HashMap) this.LIZ).put(X1D.LIZIZ(LIZ), ved);
        }
    }

    public final Typeface LIZJ(VNU vnu, String str, int i, VEF vef) {
        boolean z;
        C40052Fnk LIZIZ = vnu.LIZIZ(str);
        if (LIZIZ == null) {
            return null;
        }
        synchronized (this) {
            VED LIZIZ2 = LIZIZ(LIZIZ);
            if (LIZIZ2 != null) {
                if (LIZIZ2.LIZIZ[i] != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return LIZIZ2.LIZ(i);
                }
            }
            VED ved = LIZIZ.LIZIZ;
            Handler handler = new Handler(Looper.myLooper());
            if (ved != null) {
                if (vef != null) {
                    handler.post(new VEE(str, i, vef, ved, handler));
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    return ved.LIZ(i);
                }
                return ved.LIZ(0);
            }
            C64493PSv.LIZ().execute(new VEB(this, vnu, LIZIZ, i, vef, handler));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.VNU r9, X.VEA r10, java.util.Iterator<android.util.Pair<X.EnumC40050Fni, java.lang.String>> r11, android.os.Handler r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VEC.LIZLLL(X.VNU, X.VEA, java.util.Iterator, android.os.Handler):void");
    }
}
