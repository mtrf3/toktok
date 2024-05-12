package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JhM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49848JhM extends QZV {
    public final String LIZ;
    public final C49847JhL LIZIZ;
    public final C49849JhN LIZJ;
    public C49848JhM LIZLLL;
    public C49848JhM LJ;
    public C49848JhM LJFF;

    public final C49848JhM LJIJI() {
        Object obj;
        HashMap<String, Object> hashMap;
        C49849JhN c49849JhN = this.LIZJ;
        c49849JhN.LJIL();
        String str = c49849JhN.LJIIIIZZ;
        C49863Jhb c49863Jhb = this.LIZIZ.LJFF;
        String str2 = this.LIZ;
        C49864Jhc c49864Jhc = c49863Jhb.LIZ.get(C65352Pkq.LIZ(C49848JhM.class));
        if (c49864Jhc != null && (hashMap = c49864Jhc.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append(str);
            obj = hashMap.get(X1D.LIZIZ(LIZ));
        } else {
            obj = null;
        }
        return (C49848JhM) obj;
    }

    @Override // X.QZV
    /* renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C49848JhM LJIILLIIL() {
        C49848JhM c49848JhM;
        C49848JhM c49848JhM2 = this.LIZLLL;
        if (c49848JhM2 != null) {
            return c49848JhM2;
        }
        C49849JhN c49849JhN = this.LIZJ;
        if (c49849JhN == null) {
            return null;
        }
        while (true) {
            c49849JhN = c49849JhN.LIZLLL;
            if (c49849JhN != null) {
                c49849JhN.LJIL();
                List<C49848JhM> list = c49849JhN.LJIIJ;
                if (list != null && (c49848JhM = (C49848JhM) ORZ.LJLLLL(list)) != null) {
                    return c49848JhM;
                }
            } else {
                return null;
            }
        }
    }

    public final C49848JhM LJIJJLI() {
        C49848JhM c49848JhM;
        C49848JhM c49848JhM2 = this.LJ;
        if (c49848JhM2 != null) {
            return c49848JhM2;
        }
        C49849JhN c49849JhN = this.LIZJ;
        if (c49849JhN == null) {
            return null;
        }
        while (true) {
            c49849JhN = c49849JhN.LJ;
            if (c49849JhN != null) {
                c49849JhN.LJIL();
                List<C49848JhM> list = c49849JhN.LJIIJ;
                if (list != null && (c49848JhM = (C49848JhM) ORZ.LLFII(list)) != null) {
                    return c49848JhM;
                }
            } else {
                return null;
            }
        }
    }

    public final void LJIL(C49848JhM c49848JhM) {
        C49849JhN c49849JhN = this.LIZJ;
        c49849JhN.LJIL();
        String str = c49849JhN.LJIIIIZZ;
        C49863Jhb c49863Jhb = this.LIZIZ.LJFF;
        String str2 = this.LIZ;
        C49864Jhc c49864Jhc = c49863Jhb.LIZ.get(C65352Pkq.LIZ(C49848JhM.class));
        if (c49864Jhc == null) {
            c49864Jhc = new C49864Jhc();
            c49863Jhb.LIZ.put(C65352Pkq.LIZ(C49848JhM.class), c49864Jhc);
        }
        if (c49848JhM == null) {
            HashMap<String, Object> hashMap = c49864Jhc.LIZIZ;
            if (hashMap != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(str);
                hashMap.remove(X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        HashMap<String, Object> hashMap2 = c49864Jhc.LIZIZ;
        if (hashMap2 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        LIZ2.append(str);
        hashMap2.put(X1D.LIZIZ(LIZ2), c49848JhM);
    }

    public C49848JhM(String id, C49847JhL streamRoot, C49849JhN outerItem) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(streamRoot, "streamRoot");
        o.LJIIIZ(outerItem, "outerItem");
        this.LIZ = id;
        this.LIZIZ = streamRoot;
        this.LIZJ = outerItem;
    }
}
