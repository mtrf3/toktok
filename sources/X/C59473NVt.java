package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NVt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59473NVt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C59472NVs commonParams) {
        o.LJIIJ(commonParams, "commonParams");
        Boolean value = commonParams.LJFF.getValue();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(value, bool)) {
            commonParams.LJ.LIZLLL(bool);
        }
    }

    public static void LIZJ(C59472NVs commonParams) {
        boolean z;
        Boolean value;
        Boolean value2;
        EnumC60066Nhm enumC60066Nhm;
        C59439NUl c59439NUl;
        C59439NUl c59439NUl2;
        Boolean value3;
        Boolean value4;
        Boolean value5;
        o.LJIIJ(commonParams, "commonParams");
        C59297NOz c59297NOz = commonParams.LJJIIJ;
        c59297NOz.getValue();
        if (c59297NOz.LIZLLL && (value5 = c59297NOz.getValue()) != null) {
            if (value5.booleanValue()) {
                commonParams.LJIIIIZZ.LIZLLL(EnumC60063Nhj.DARK);
            } else {
                commonParams.LJIIIIZZ.LIZLLL(EnumC60063Nhj.LIGHT);
            }
        }
        Boolean value6 = commonParams.LJIILLIIL.getValue();
        if (value6 != null) {
            z = value6.booleanValue();
        } else {
            z = true;
        }
        C59297NOz c59297NOz2 = commonParams.LJJIIZ;
        c59297NOz2.getValue();
        if (!c59297NOz2.LIZLLL) {
            c59297NOz2 = null;
        }
        if (c59297NOz2 != null && (value4 = c59297NOz2.getValue()) != null) {
            boolean booleanValue = value4.booleanValue();
            if (z && booleanValue) {
                z = true;
            } else {
                z = false;
            }
        }
        C59297NOz c59297NOz3 = commonParams.LJJIIJZLJL;
        c59297NOz3.getValue();
        if (c59297NOz3.LIZLLL && (value3 = c59297NOz3.getValue()) != null) {
            boolean booleanValue2 = value3.booleanValue();
            if (z && !booleanValue2) {
                z = true;
            } else {
                z = false;
            }
        }
        commonParams.LJIILLIIL.LIZLLL(Boolean.valueOf(z));
        C59297NOz c59297NOz4 = commonParams.LJJIIZI;
        c59297NOz4.getValue();
        if (c59297NOz4.LIZLLL) {
            commonParams.LJFF.LIZLLL(c59297NOz4.getValue());
        }
        C59478NVy c59478NVy = commonParams.LJJIJ;
        c59478NVy.getValue();
        if (!c59478NVy.LIZLLL) {
            c59478NVy = null;
        }
        if (c59478NVy != null && (c59439NUl2 = (C59439NUl) c59478NVy.getValue()) != null && c59439NUl2.LJLIL != -2) {
            commonParams.LJIILIIL.LIZLLL(c59439NUl2);
        }
        C59478NVy c59478NVy2 = commonParams.LJJIJIIJI;
        c59478NVy2.getValue();
        if (c59478NVy2.LIZLLL && (c59439NUl = (C59439NUl) c59478NVy2.getValue()) != null && c59439NUl.LJLIL != -2) {
            commonParams.LJI.LIZLLL(c59439NUl);
        }
        C59297NOz c59297NOz5 = commonParams.LJJIJIIJIL;
        c59297NOz5.getValue();
        if (c59297NOz5.LIZLLL && (value2 = c59297NOz5.getValue()) != null) {
            boolean booleanValue3 = value2.booleanValue();
            C59478NVy c59478NVy3 = commonParams.LJIILL;
            if (booleanValue3) {
                enumC60066Nhm = EnumC60066Nhm.BOTTOM;
            } else {
                enumC60066Nhm = EnumC60066Nhm.AUTO;
            }
            c59478NVy3.LIZLLL(enumC60066Nhm);
        }
        C59297NOz c59297NOz6 = commonParams.LJJIJIL;
        c59297NOz6.getValue();
        if (c59297NOz6.LIZLLL) {
            C59297NOz c59297NOz7 = commonParams.LIZLLL;
            c59297NOz7.getValue();
            if (!c59297NOz7.LIZLLL && (value = c59297NOz6.getValue()) != null) {
                commonParams.LIZLLL.LIZLLL(Boolean.valueOf(!value.booleanValue()));
            }
        }
    }

    public static void LIZ(android.net.Uri uri, Bundle bundle, C59472NVs c59472NVs) {
        Object obj;
        Object obj2;
        if (uri != null) {
            C59476NVw c59476NVw = new C59476NVw();
            c59476NVw.LIZJ(android.net.Uri.class, uri, null);
            obj = c59476NVw.LIZLLL.getValue();
            if (obj != null) {
                C59474NVu c59474NVu = new C59474NVu();
                c59474NVu.LIZJ(android.net.Uri.class, obj, null);
                obj2 = c59474NVu.LIZJ.getValue();
            } else {
                obj2 = null;
            }
        } else {
            obj = null;
            obj2 = null;
        }
        if (bundle != null) {
            c59472NVs.LIZJ(Bundle.class, bundle, null);
        }
        if (obj != null) {
            c59472NVs.LIZJ(android.net.Uri.class, obj, null);
        }
        if (obj2 != null) {
            c59472NVs.LIZJ(android.net.Uri.class, obj2, null);
        }
    }
}
