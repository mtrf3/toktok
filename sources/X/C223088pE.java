package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

/* renamed from: X.8pE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223088pE {
    public static final C223088pE LIZ = new C223088pE();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C223118pH.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C223108pG.LJLIL);

    public static LinkedHashMap LIZ() {
        return (LinkedHashMap) LIZIZ.getValue();
    }

    public static boolean LIZIZ(Aweme aweme) {
        String str;
        Boolean bool;
        Aweme LIZJ2 = C210408No.LIZJ(aweme);
        if (LIZJ2 != null) {
            str = LIZJ2.getAid();
        } else {
            str = null;
        }
        if (str == null || (bool = (Boolean) ((LinkedHashMap) LIZJ.getValue()).get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
