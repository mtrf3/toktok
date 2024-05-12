package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.7pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197707pO {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C197907pi.LJLIL);

    public static File LIZ(Context context) {
        String str;
        if (AnonymousClass636.LJIILJJIL(context)) {
            str = "shortcut_intro_dark";
        } else {
            str = "shortcut_intro_light";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("now_widget");
        LIZ2.append(File.separator);
        LIZ2.append(str);
        LIZ2.append(".png");
        return C198227qE.LIZ(X1D.LIZIZ(LIZ2));
    }
}
