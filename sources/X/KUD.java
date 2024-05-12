package X;

import androidx.fragment.app.Fragment;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KUD {
    public static void LIZJ(String data, KRA kra) {
        Fragment fragment;
        o.LJIIIZ(data, "data");
        if (!KUH.LIZ) {
            return;
        }
        KUF<Object> kuf = KUE.LIZ;
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (kra != null) {
            fragment = kra.LJ;
        } else {
            fragment = null;
        }
        Object obj = new Object(data, String.valueOf(fragment)) { // from class: X.2Ou
            public final String LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C57842Ou)) {
                    return false;
                }
                C57842Ou c57842Ou = (C57842Ou) obj2;
                return o.LJ(this.LIZ, c57842Ou.LIZ) && o.LJ(this.LIZIZ, c57842Ou.LIZIZ);
            }

            public final int hashCode() {
                int hashCode = this.LIZ.hashCode() * 31;
                String str = this.LIZIZ;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(this.LIZ);
                LIZ.append("],[");
                return q.LIZIZ(LIZ, this.LIZIZ, ']', LIZ);
            }

            {
                o.LJIIIZ(data, "data");
                this.LIZ = data;
                this.LIZIZ = r3;
            }
        };
        C60392Yp.LIZ("LComponentError", String.valueOf(obj), 12);
        kuf.LIZIZ(valueOf, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(KRA kra, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        Object obj;
        KUG<T> kug;
        if (!KUH.LIZ || kra == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("immutable_scene_");
        LIZ.append(kra.LIZ);
        String key = X1D.LIZIZ(LIZ);
        KUC kuc = new KUC(kra, interfaceC88472Yns, z);
        KUF<KUB> kuf = KUE.LIZIZ;
        kuf.getClass();
        o.LJIIIZ(key, "key");
        if (!kuf.LIZIZ.containsKey(key) || (kug = (KUG) kuf.LIZIZ.get(key)) == 0) {
            obj = null;
        } else {
            KUG<T> kug2 = kug.LIZJ;
            KUG<T> kug3 = kug.LIZLLL;
            if (kug2 != 0 && kug3 != 0) {
                kug3.LIZJ = kug2;
                kug2.LIZLLL = kug3;
            }
            KUG kug4 = kuf.LIZLLL;
            KUG<T> kug5 = kug4.LIZLLL;
            if (kug5 != 0) {
                kug5.LIZJ = kug;
                kug.LIZLLL = kug5;
                kug.LIZJ = kug4;
                kug4.LIZLLL = kug;
            }
            obj = kug.LIZIZ;
        }
        kuc.invoke(obj);
    }

    public static /* synthetic */ void LIZIZ(KRA kra, InterfaceC88472Yns interfaceC88472Yns, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            interfaceC88472Yns = null;
        }
        LIZ(kra, interfaceC88472Yns, z);
    }
}
