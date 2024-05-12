package X;

import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.Dh2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34540Dh2 {
    public static final C5H3 LIZ;
    public static final C5H3 LIZIZ;
    public static final C5H3 LIZJ;
    public static final C5H3 LIZLLL;
    public static final C5H3 LJ;
    public static final C5H3 LJFF;
    public static final C5H3 LJI;
    public static final C5H3 LJII;
    public static final C5H3 LJIIIIZZ;
    public static final C5H3 LJIIIZ;
    public static final C5H3 LJIIJ;
    public static final C5H3 LJIIJJI;
    public static final C5H3 LJIIL;
    public static final C5H3 LJIILIIL;
    public static final C5H3 LJIILJJIL;
    public static final C5H3 LJIILL;
    public static final C5H3 LJIILLIIL;
    public static final C5H3 LJIIZILJ;
    public static final C5H3 LJIJ;
    public static final C5H3 LJIJI;

    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        LIZ = C221108m2.LIZ(enumC221088m0, C34543Dh5.LJLIL);
        LIZIZ = C221108m2.LIZ(enumC221088m0, C36249EKn.LJLIL);
        LIZJ = C221108m2.LIZ(enumC221088m0, C34533Dgv.LJLIL);
        LIZLLL = C221108m2.LIZ(enumC221088m0, C34535Dgx.LJLIL);
        LJ = C221108m2.LIZ(enumC221088m0, C36247EKl.LJLIL);
        LJFF = C221108m2.LIZ(enumC221088m0, C36248EKm.LJLIL);
        LJI = C221108m2.LIZ(enumC221088m0, C34537Dgz.LJLIL);
        LJII = C221108m2.LIZ(enumC221088m0, C34548DhA.LJLIL);
        LJIIIIZZ = C221108m2.LIZ(enumC221088m0, C34538Dh0.LJLIL);
        LJIIIZ = C221108m2.LIZ(enumC221088m0, C34536Dgy.LJLIL);
        LJIIJ = C221108m2.LIZ(enumC221088m0, C34549DhB.LJLIL);
        LJIIJJI = C221108m2.LIZ(enumC221088m0, C34547Dh9.LJLIL);
        LJIIL = C221108m2.LIZ(enumC221088m0, C34539Dh1.LJLIL);
        LJIILIIL = C221108m2.LIZ(enumC221088m0, C34534Dgw.LJLIL);
        LJIILJJIL = C221108m2.LIZ(enumC221088m0, C34531Dgt.LJLIL);
        LJIILL = C221108m2.LIZ(enumC221088m0, C34532Dgu.LJLIL);
        LJIILLIIL = C221108m2.LIZ(enumC221088m0, C34546Dh8.LJLIL);
        LJIIZILJ = C221108m2.LIZ(enumC221088m0, C34545Dh7.LJLIL);
        LJIJ = C221108m2.LIZ(enumC221088m0, C34544Dh6.LJLIL);
        LJIJI = C221108m2.LIZ(enumC221088m0, C34529Dgr.LJLIL);
    }

    public static final String LIZ(m mVar) {
        int i;
        int i2;
        int i3;
        j LJJIJ = mVar.LJJIJ("min_open_timeout");
        int i4 = 2;
        if (LJJIJ != null) {
            i = LJJIJ.LJIILJJIL();
        } else {
            i = 2;
        }
        j LJJIJ2 = mVar.LJJIJ("max_open_timeout");
        int i5 = 8;
        if (LJJIJ2 != null) {
            i2 = LJJIJ2.LJIILJJIL();
        } else {
            i2 = 8;
        }
        j LJJIJ3 = mVar.LJJIJ("min_rw_timeout");
        if (LJJIJ3 != null) {
            i4 = LJJIJ3.LJIILJJIL();
        }
        j LJJIJ4 = mVar.LJJIJ("max_rw_timeout");
        if (LJJIJ4 != null) {
            i5 = LJJIJ4.LJIILJJIL();
        }
        j LJJIJ5 = mVar.LJJIJ("sample_internal");
        if (LJJIJ5 != null) {
            i3 = LJJIJ5.LJIILJJIL();
        } else {
            i3 = 30;
        }
        m mVar2 = new m();
        mVar2.LJJIIJ("min_open_timeout", Integer.valueOf(i));
        mVar2.LJJIIJ("max_open_timeout", Integer.valueOf(i2));
        mVar2.LJJIIJ("min_rw_timeout", Integer.valueOf(i4));
        mVar2.LJJIIJ("max_rw_timeout", Integer.valueOf(i5));
        mVar2.LJJIIJ("sample_internal", Integer.valueOf(i3));
        String jVar = mVar2.toString();
        o.LJIIIIZZ(jVar, "res.toString()");
        return jVar;
    }
}
