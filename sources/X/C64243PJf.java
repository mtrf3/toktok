package X;

import java.util.HashMap;

/* renamed from: X.PJf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64243PJf {
    public static final HashMap<Integer, C64243PJf> LIZJ = new HashMap<>();
    public final Object LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64243PJf)) {
            return false;
        }
        C64243PJf c64243PJf = (C64243PJf) obj;
        if (this.LIZIZ != c64243PJf.LIZIZ) {
            return false;
        }
        return this.LIZ.equals(c64243PJf.LIZ);
    }

    public C64243PJf(int i, Object obj) {
        this.LIZ = obj;
        this.LIZIZ = i;
    }

    public static C64243PJf LIZ(C64246PJi c64246PJi, Object obj) {
        int hashCode = obj.hashCode() * 31;
        c64246PJi.getClass();
        int i = hashCode + (c64246PJi instanceof PJX ? 1 : 0);
        HashMap<Integer, C64243PJf> hashMap = LIZJ;
        C64243PJf c64243PJf = hashMap.get(Integer.valueOf(i));
        if (c64243PJf == null) {
            C64243PJf c64243PJf2 = new C64243PJf(c64246PJi instanceof PJX ? 1 : 0, obj);
            hashMap.put(Integer.valueOf(i), c64243PJf2);
            return c64243PJf2;
        }
        return c64243PJf;
    }
}
