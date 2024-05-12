package X;

import kotlin.jvm.internal.IDqS0S0000001;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09290Yb {
    public static final C50931zF LIZ = new C50931zF(EnumC09390Yl.Horizontal, 1.0f, new IDqS0S0000001(1.0f, 2));
    public static final C50931zF LIZIZ = new C50931zF(EnumC09390Yl.Vertical, 1.0f, new IDqS0S0000001(1.0f, 0));
    public static final C50931zF LIZJ = new C50931zF(EnumC09390Yl.Both, 1.0f, new IDqS0S0000001(1.0f, 1));
    public static final C50911zD LIZLLL;
    public static final C50911zD LJ;
    public static final C50911zD LJFF;
    public static final C50911zD LJI;
    public static final C50911zD LJII;
    public static final C50911zD LJIIIIZZ;

    static {
        InterfaceC07760Se.LJJJ.getClass();
        LIZLLL = LIZJ(C07730Sb.LJIILJJIL, false);
        LJ = LIZJ(C07730Sb.LJIILIIL, false);
        LJFF = LIZ(C07730Sb.LJIIJJI, false);
        LJI = LIZ(C07730Sb.LJIIJ, false);
        LJII = LIZIZ(C07730Sb.LJFF, false);
        LJIIIIZZ = LIZIZ(C07730Sb.LIZIZ, false);
    }

    public static InterfaceC07790Sh LJFF(InterfaceC07790Sh interfaceC07790Sh) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        return interfaceC07790Sh.LLLIIIL(LIZIZ);
    }

    public static InterfaceC07790Sh LJI(InterfaceC07790Sh interfaceC07790Sh) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        return interfaceC07790Sh.LLLIIIL(LIZJ);
    }

    public static InterfaceC07790Sh LJII(InterfaceC07790Sh interfaceC07790Sh) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        return interfaceC07790Sh.LLLIIIL(LIZ);
    }

    public static InterfaceC07790Sh LJIILL(InterfaceC07790Sh interfaceC07790Sh) {
        C50911zD LIZ2;
        C07730Sb c07730Sb = InterfaceC07760Se.LJJJ;
        c07730Sb.getClass();
        C31621Ly align = C07730Sb.LJIIJJI;
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(align, "align");
        c07730Sb.getClass();
        if (o.LJ(align, align)) {
            LIZ2 = LJFF;
        } else if (o.LJ(align, C07730Sb.LJIIJ)) {
            LIZ2 = LJI;
        } else {
            LIZ2 = LIZ(align, false);
        }
        return interfaceC07790Sh.LLLIIIL(LIZ2);
    }

    public static InterfaceC07790Sh LJIIZILJ(InterfaceC07790Sh interfaceC07790Sh) {
        C50911zD LIZJ2;
        C07730Sb c07730Sb = InterfaceC07760Se.LJJJ;
        c07730Sb.getClass();
        C31611Lx align = C07730Sb.LJIILJJIL;
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(align, "align");
        c07730Sb.getClass();
        if (o.LJ(align, align)) {
            LIZJ2 = LIZLLL;
        } else if (o.LJ(align, C07730Sb.LJIILIIL)) {
            LIZJ2 = LJ;
        } else {
            LIZJ2 = LIZJ(align, false);
        }
        return interfaceC07790Sh.LLLIIIL(LIZJ2);
    }

    public static final C50911zD LIZ(InterfaceC07750Sd interfaceC07750Sd, boolean z) {
        return new C50911zD(EnumC09390Yl.Vertical, z, new IDqS443S0100000(interfaceC07750Sd, 17), interfaceC07750Sd, new C50781z0(interfaceC07750Sd, z));
    }

    public static final C50911zD LIZIZ(InterfaceC07760Se interfaceC07760Se, boolean z) {
        return new C50911zD(EnumC09390Yl.Both, z, new IDqS443S0100000(interfaceC07760Se, 18), interfaceC07760Se, new C50791z1(interfaceC07760Se, z));
    }

    public static final C50911zD LIZJ(InterfaceC07740Sc interfaceC07740Sc, boolean z) {
        return new C50911zD(EnumC09390Yl.Horizontal, z, new IDqS443S0100000(interfaceC07740Sc, 19), interfaceC07740Sc, new C50801z2(interfaceC07740Sc, z));
    }

    public static final InterfaceC07790Sh LJIIIIZZ(InterfaceC07790Sh height, float f) {
        o.LJIIIZ(height, "$this$height");
        return height.LLLIIIL(new C50831z5(0.0f, f, 0.0f, f, 5));
    }

    public static final InterfaceC07790Sh LJIIJJI(InterfaceC07790Sh size, float f) {
        o.LJIIIZ(size, "$this$size");
        return size.LLLIIIL(new C50831z5(f, f, f, f, true));
    }

    public static final InterfaceC07790Sh LJIILIIL(InterfaceC07790Sh width, float f) {
        o.LJIIIZ(width, "$this$width");
        return width.LLLIIIL(new C50831z5(f, 0.0f, f, 0.0f, 10));
    }

    public static InterfaceC07790Sh LJIILJJIL(InterfaceC07790Sh widthIn, float f) {
        o.LJIIIZ(widthIn, "$this$widthIn");
        return widthIn.LLLIIIL(new C50831z5(Float.NaN, 0.0f, f, 0.0f, 10));
    }

    public static final InterfaceC07790Sh LIZLLL(InterfaceC07790Sh defaultMinSize, float f, float f2) {
        o.LJIIIZ(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.LLLIIIL(new C50871z9(f, f2));
    }

    public static InterfaceC07790Sh LJ(InterfaceC07790Sh interfaceC07790Sh, float f, int i) {
        float f2;
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        return LIZLLL(interfaceC07790Sh, f2, f);
    }

    public static final InterfaceC07790Sh LJIIJ(InterfaceC07790Sh requiredSize, float f, float f2) {
        o.LJIIIZ(requiredSize, "$this$requiredSize");
        return requiredSize.LLLIIIL(new C50831z5(f, f2, f, f2, false));
    }

    public static final InterfaceC07790Sh LJIIL(InterfaceC07790Sh size, float f, float f2) {
        o.LJIIIZ(size, "$this$size");
        return size.LLLIIIL(new C50831z5(f, f2, f, f2, true));
    }

    public static InterfaceC07790Sh LJIILLIIL(InterfaceC07790Sh interfaceC07790Sh, C31631Lz align, int i) {
        C50911zD LIZIZ2;
        if ((i & 1) != 0) {
            InterfaceC07760Se.LJJJ.getClass();
            align = C07730Sb.LJFF;
        }
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(align, "align");
        InterfaceC07760Se.LJJJ.getClass();
        if (o.LJ(align, C07730Sb.LJFF)) {
            LIZIZ2 = LJII;
        } else if (o.LJ(align, C07730Sb.LIZIZ)) {
            LIZIZ2 = LJIIIIZZ;
        } else {
            LIZIZ2 = LIZIZ(align, false);
        }
        return interfaceC07790Sh.LLLIIIL(LIZIZ2);
    }

    public static InterfaceC07790Sh LJIIIZ(InterfaceC07790Sh heightIn, float f, float f2, int i) {
        float f3 = f2;
        float f4 = f;
        if ((i & 1) != 0) {
            f4 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        o.LJIIIZ(heightIn, "$this$heightIn");
        return heightIn.LLLIIIL(new C50831z5(0.0f, f4, 0.0f, f3, 5));
    }
}
