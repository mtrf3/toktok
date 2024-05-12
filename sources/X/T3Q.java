package X;

import android.content.Context;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T3Q {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC73672Svk LIZ(Context context, Class ufr, String str, String enterMethod) {
        o.LJIIJ(ufr, "ufr");
        o.LJIIJ(enterMethod, "enterMethod");
        if (TextUtils.isEmpty(str)) {
            return AbstractC73672Svk.LJIIJ(T3N.LJLIL);
        }
        if (str != null) {
            UPC upc = (UPC) ufr.newInstance();
            upc.LJI(context, str, "privacy_setting", enterMethod, false, true, null);
            return C77151UPr.LJFF(upc, new C77150UPq(false, 3, 0, null, 28));
        }
        o.LJIIZILJ();
        throw null;
    }

    public static /* synthetic */ AbstractC73672Svk LIZLLL(Context context, Class cls, String str, String str2, String str3) {
        return LIZJ(context, cls, str, str2, str3, false, null);
    }

    public static AbstractC73672Svk LIZIZ(Context context, Class ufr, String str, String enterFrom, String enterMethod, boolean z, java.util.Map map) {
        o.LJIIJ(context, "context");
        o.LJIIJ(ufr, "ufr");
        o.LJIIJ(enterFrom, "enterFrom");
        o.LJIIJ(enterMethod, "enterMethod");
        if (TextUtils.isEmpty(str)) {
            return AbstractC73672Svk.LJIIJ(T3O.LJLIL);
        }
        C77151UPr c77151UPr = new C77151UPr();
        if (str != null) {
            return c77151UPr.LJ(context, ufr, str, enterFrom, enterMethod, false, z, map);
        }
        o.LJIIZILJ();
        throw null;
    }

    public static AbstractC73672Svk LIZJ(Context context, Class ufr, String str, String str2, String str3, boolean z, java.util.Map map) {
        o.LJIIJ(ufr, "ufr");
        if (TextUtils.isEmpty(str)) {
            return AbstractC73672Svk.LJIIJ(T3P.LJLIL);
        }
        C77151UPr c77151UPr = new C77151UPr();
        if (str != null) {
            return c77151UPr.LJ(context, ufr, str, str2, str3, true, z, map);
        }
        o.LJIIZILJ();
        throw null;
    }
}
