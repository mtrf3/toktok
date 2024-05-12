package X;

import kotlin.jvm.internal.AqS74S1100000_7;
import ujb.o;

/* loaded from: classes9.dex */
public final class J9E implements XUM {
    @Override // X.XUM
    public final String LIZIZ(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return null;
        }
        return H6X.LIZ(str);
    }

    @Override // X.XUM
    public final boolean LIZJ(String str) {
        boolean z = false;
        if (str == null || o.LJJJJJL(str)) {
            return false;
        }
        String LIZ = H6X.LIZ(str);
        if (LIZ == null || o.LJJJJJL(LIZ)) {
            z = true;
        }
        return !z;
    }

    @Override // X.XUM
    public final void LIZLLL(String url, XZP xzp) {
        if (url == null || o.LJJJJJL(url)) {
            xzp.onError();
            return;
        }
        J9I j9i = new J9I(xzp);
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        C2VQ.LIZ(new AqS74S1100000_7(j9i, url, 9));
    }

    @Override // X.XUM
    public final void LJ(long j, String str, String str2, boolean z) {
        int i;
        J9C.LIZ = str;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        J9C.LIZJ = i;
        J9C.LIZIZ = str2;
        J9C.LIZLLL = false;
        if (j == -1) {
            j = System.currentTimeMillis();
        }
        J9C.LJ = j;
    }
}
