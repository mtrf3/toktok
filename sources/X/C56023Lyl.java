package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.Lyl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56023Lyl {
    public static final C56023Lyl LIZ = new C56023Lyl();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.PUBLICATION, C56049LzB.LJLIL);

    public static Keva LIZIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-REPO>(...)");
        return (Keva) value;
    }

    public final synchronized String LIZ(String key) {
        String string;
        o.LJIIIZ(key, "key");
        string = LIZIZ().getString(key, "");
        o.LJIIIIZZ(string, "REPO.getString(key, \"\")");
        return string;
    }

    public final synchronized void LIZLLL(boolean z) {
        C79057V0z.LJJJJJL(LIZIZ(), "ec_mall_main_tool_panel_has_expose", z);
    }

    public final synchronized boolean LIZJ(String key, String str) {
        boolean z;
        o.LJIIIZ(key, "key");
        if (str != null) {
            C79057V0z.LJJJJJ(LIZIZ(), key, str);
            if (C76800UCe.LIZ != null) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
