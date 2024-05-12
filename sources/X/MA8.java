package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class MA8 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(MA9.LJLIL);

    public static void LIZIZ() {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("guide_");
        LIZ2.append("function_entry_medium");
        keva.erase(X1D.LIZIZ(LIZ2));
    }

    public static String LIZ(String str) {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("guide_");
        LIZ2.append(str);
        if (keva.contains(X1D.LIZIZ(LIZ2))) {
            return "page_button";
        }
        return "manual";
    }
}
