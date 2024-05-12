package X;

import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121574pt {
    public String LIZ;
    public EnumC121524po LIZIZ;
    public final HashMap<String, C121494pl> LIZJ;
    public final HashMap<String, C121494pl> LIZLLL;
    public final EnumC121534pp LJ;

    public C121574pt() {
        this(EnumC121534pp.Unknown);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("node size ");
        LIZ.append(this.LIZJ.keySet().size());
        LIZ.append(" \n ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        for (String str : this.LIZJ.keySet()) {
            String LIZIZ2 = C00F.LIZIZ(LIZIZ, '[', str);
            C121494pl c121494pl = this.LIZJ.get(str);
            if (c121494pl != null) {
                for (String str2 : c121494pl.LIZIZ.keySet()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ2);
                    LIZ2.append('(');
                    LIZ2.append(str2);
                    LIZ2.append(" : ");
                    LIZ2.append(c121494pl.LIZIZ.get(str2));
                    LIZ2.append(')');
                    LIZIZ2 = X1D.LIZIZ(LIZ2);
                }
            }
            LIZIZ = i0.LJFF(LIZIZ2, "] \n");
        }
        return LIZIZ;
    }

    public C121574pt(EnumC121534pp type) {
        o.LJIIIZ(type, "type");
        this.LJ = type;
        this.LIZIZ = EnumC121524po.ENABLE;
        this.LIZJ = new HashMap<>();
        this.LIZLLL = new HashMap<>();
    }

    public final void LIZ(String nodePath) {
        o.LJIIIZ(nodePath, "nodePath");
        if (this.LIZLLL.get(nodePath) == null) {
            this.LIZLLL.put(nodePath, new C121494pl());
        }
        this.LIZJ.remove(nodePath);
    }

    public final void LIZIZ(String nodePath, String extra) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(extra, "extra");
        if (this.LIZJ.get(nodePath) == null) {
            this.LIZJ.put(nodePath, new C121494pl());
        }
        C121494pl c121494pl = this.LIZJ.get(nodePath);
        o.LJI(c121494pl);
        c121494pl.LIZ = extra;
    }

    public final void LIZLLL(String nodePath, String resId) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(resId, "resId");
        if (this.LIZJ.get(nodePath) == null) {
            this.LIZJ.put(nodePath, new C121494pl());
        }
        C121494pl c121494pl = this.LIZJ.get(nodePath);
        o.LJI(c121494pl);
        c121494pl.LIZJ = resId;
    }

    public final void LIZJ(String nodePath, String tag, Float f) {
        o.LJIIIZ(nodePath, "nodePath");
        o.LJIIIZ(tag, "tag");
        if (this.LIZJ.get(nodePath) == null) {
            this.LIZJ.put(nodePath, new C121494pl());
        }
        C121494pl c121494pl = this.LIZJ.get(nodePath);
        o.LJI(c121494pl);
        C121494pl c121494pl2 = c121494pl;
        if (f == null) {
            c121494pl2.LIZIZ.remove(tag);
        } else {
            c121494pl2.LIZIZ.put(tag, f);
        }
    }
}
