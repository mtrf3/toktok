package X;

import defpackage.a1;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Prh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65777Prh {
    public static Collection LIZ(Object obj) {
        if ((obj instanceof InterfaceC90533gv) && !(obj instanceof ORN)) {
            LJIIIIZZ(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            o.LJIILJJIL(C65777Prh.class.getName(), e);
            throw e;
        }
    }

    public static List LIZIZ(Object obj) {
        if ((obj instanceof InterfaceC90533gv) && !(obj instanceof ORO)) {
            LJIIIIZZ(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            o.LJIILJJIL(C65777Prh.class.getName(), e);
            throw e;
        }
    }

    public static java.util.Map LIZJ(Object obj) {
        if ((obj instanceof InterfaceC90533gv) && !(obj instanceof EHO)) {
            LJIIIIZZ(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (java.util.Map) obj;
        } catch (ClassCastException e) {
            o.LJIILJJIL(C65777Prh.class.getName(), e);
            throw e;
        }
    }

    public static java.util.Set LIZLLL(Object obj) {
        if ((obj instanceof InterfaceC90533gv) && !(obj instanceof InterfaceC65779Prj)) {
            LJIIIIZZ(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (java.util.Set) obj;
        } catch (ClassCastException e) {
            o.LJIILJJIL(C65777Prh.class.getName(), e);
            throw e;
        }
    }

    public static boolean LJI(Object obj) {
        if ((obj instanceof List) && (!(obj instanceof InterfaceC90533gv) || (obj instanceof ORO))) {
            return true;
        }
        return false;
    }

    public static boolean LJII(Object obj) {
        if ((obj instanceof java.util.Map) && (!(obj instanceof InterfaceC90533gv) || (obj instanceof EHO))) {
            return true;
        }
        return false;
    }

    public static void LJ(int i, Object obj) {
        if (obj == null || LJFF(i, obj)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kotlin.jvm.functions.Function");
        LIZ.append(i);
        LJIIIIZZ(obj, X1D.LIZIZ(LIZ));
        throw null;
    }

    public static boolean LJFF(int i, Object obj) {
        int i2;
        if (!(obj instanceof InterfaceC106334Fh)) {
            return false;
        }
        if (obj instanceof InterfaceC65778Pri) {
            i2 = ((InterfaceC65778Pri) obj).getArity();
        } else if (obj instanceof InterfaceC65784Pro) {
            i2 = 0;
        } else if (obj instanceof InterfaceC88472Yns) {
            i2 = 1;
        } else if (obj instanceof InterfaceC88471Ynr) {
            i2 = 2;
        } else if (obj instanceof InterfaceC88473Ynt) {
            i2 = 3;
        } else if (obj instanceof InterfaceC88474Ynu) {
            i2 = 4;
        } else if (obj instanceof InterfaceC88475Ynv) {
            i2 = 5;
        } else if (obj instanceof InterfaceC88476Ynw) {
            i2 = 6;
        } else if (obj instanceof InterfaceC88477Ynx) {
            i2 = 7;
        } else if (obj instanceof InterfaceC88478Yny) {
            i2 = 8;
        } else if (obj instanceof InterfaceC88479Ynz) {
            i2 = 9;
        } else if (obj instanceof InterfaceC88480Yo0) {
            i2 = 10;
        } else if (obj instanceof InterfaceC88481Yo1) {
            i2 = 11;
        } else if (obj instanceof InterfaceC88482Yo2) {
            i2 = 12;
        } else if (obj instanceof InterfaceC88483Yo3) {
            i2 = 13;
        } else if (obj instanceof InterfaceC88484Yo4) {
            i2 = 14;
        } else if (obj instanceof InterfaceC88485Yo5) {
            i2 = 15;
        } else if (obj instanceof InterfaceC88486Yo6) {
            i2 = 16;
        } else if (obj instanceof InterfaceC88487Yo7) {
            i2 = 17;
        } else if (obj instanceof InterfaceC88488Yo8) {
            i2 = 18;
        } else if (obj instanceof InterfaceC88489Yo9) {
            i2 = 19;
        } else if (obj instanceof InterfaceC88490YoA) {
            i2 = 20;
        } else if (obj instanceof InterfaceC88491YoB) {
            i2 = 21;
        } else if (obj instanceof InterfaceC88492YoC) {
            i2 = 22;
        } else {
            i2 = -1;
        }
        if (i2 != i) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(a1.LJ(name, " cannot be cast to ", str));
        o.LJIILJJIL(C65777Prh.class.getName(), classCastException);
        throw classCastException;
    }
}
