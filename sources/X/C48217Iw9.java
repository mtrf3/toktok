package X;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Iw9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48217Iw9 {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ = System.currentTimeMillis();
    public final int LIZLLL;
    public java.util.Map<String, String> LJ;

    public final void LIZ(String str, String str2) {
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        ((HashMap) this.LJ).put(str, str2);
    }

    public C48217Iw9(String str, String str2, int i) {
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZLLL = i;
    }

    public static C48217Iw9 LIZIZ(String str, YDG ydg, int i) {
        if (i >= 6 && ((HashSet) C48218IwA.LIZ).contains(ydg)) {
            return new C48217Iw9(str, ydg.name(), i);
        }
        return null;
    }
}
