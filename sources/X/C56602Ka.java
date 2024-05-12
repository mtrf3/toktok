package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* renamed from: X.2Ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56602Ka {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static final HashMap<String, Boolean> LIZIZ = new HashMap<>();

    public static String LIZ(Aweme aweme) {
        String aid;
        if (aweme == null) {
            return null;
        }
        if (C54838Lfe.LJIIZILJ(aweme)) {
            aid = aweme.getAuthorUid();
        } else {
            aid = aweme.getAid();
        }
        if (aid == null) {
            return null;
        }
        return aid;
    }

    public static boolean LIZIZ(Aweme aweme) {
        Boolean bool;
        String LIZ2 = LIZ(aweme);
        if (LIZ2 == null || (bool = LIZ.get(LIZ2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LIZJ(Aweme aweme, boolean z) {
        String LIZ2 = LIZ(aweme);
        if (LIZ2 == null) {
            return;
        }
        LIZIZ.put(LIZ2, Boolean.valueOf(z));
    }
}
