package X;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9kQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245589kQ {
    public final int LIZ;
    public final HashMap<String, C245609kS> LIZIZ = new HashMap<>();
    public final C245609kS LIZJ;
    public final C245609kS LIZLLL;

    public C245589kQ(int i) {
        this.LIZ = i;
        C245609kS c245609kS = new C245609kS(null, null);
        this.LIZJ = c245609kS;
        C245609kS c245609kS2 = new C245609kS(null, null);
        this.LIZLLL = c245609kS2;
        c245609kS.LIZJ = c245609kS2;
        c245609kS2.LIZLLL = c245609kS;
    }

    public final C86919Y9j LIZ(String key) {
        C245609kS c245609kS;
        o.LJIIIZ(key, "key");
        if (!this.LIZIZ.containsKey(key) || (c245609kS = this.LIZIZ.get(key)) == null) {
            return null;
        }
        return c245609kS.LIZIZ;
    }

    public final ArrayList<C86919Y9j> LIZIZ(int i) {
        C86919Y9j c86919Y9j;
        if (i >= this.LIZIZ.size()) {
            i = this.LIZIZ.size();
        }
        ArrayList<C86919Y9j> arrayList = new ArrayList<>();
        C245609kS c245609kS = this.LIZLLL.LIZLLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (o.LJ(c245609kS, this.LIZJ)) {
                return arrayList;
            }
            if (c245609kS == null || (c86919Y9j = c245609kS.LIZIZ) == null) {
                break;
            }
            arrayList.add(c86919Y9j);
            if (c245609kS != null) {
                c245609kS = c245609kS.LIZLLL;
            } else {
                c245609kS = null;
            }
        }
        return arrayList;
    }

    public final void LIZJ(String str, C86919Y9j c86919Y9j) {
        C245609kS c245609kS;
        C245609kS c245609kS2;
        if (this.LIZIZ.containsKey(str) && (c245609kS2 = this.LIZIZ.get(str)) != null) {
            C245609kS c245609kS3 = c245609kS2.LIZJ;
            C245609kS c245609kS4 = c245609kS2.LIZLLL;
            if (c245609kS3 != null && c245609kS4 != null) {
                c245609kS4.LIZJ = c245609kS3;
                c245609kS3.LIZLLL = c245609kS4;
            }
        }
        C245609kS c245609kS5 = new C245609kS(str, c86919Y9j);
        C245609kS c245609kS6 = this.LIZLLL;
        C245609kS c245609kS7 = c245609kS6.LIZLLL;
        if (c245609kS7 != null) {
            c245609kS7.LIZJ = c245609kS5;
            c245609kS5.LIZLLL = c245609kS7;
            c245609kS5.LIZJ = c245609kS6;
            c245609kS6.LIZLLL = c245609kS5;
        }
        this.LIZIZ.put(str, c245609kS5);
        if (this.LIZIZ.size() <= this.LIZ || (c245609kS = this.LIZJ.LIZJ) == null) {
            return;
        }
        C245609kS c245609kS8 = c245609kS.LIZJ;
        C245609kS c245609kS9 = c245609kS.LIZLLL;
        if (c245609kS8 != null && c245609kS9 != null) {
            c245609kS9.LIZJ = c245609kS8;
            c245609kS8.LIZLLL = c245609kS9;
        }
        C65777Prh.LIZJ(this.LIZIZ).remove(c245609kS.LIZ);
    }
}
