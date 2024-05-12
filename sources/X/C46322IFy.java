package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* renamed from: X.IFy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46322IFy {
    public static final HashMap<String, String> LIZ = new HashMap<>();

    public static void LIZ(Aweme aweme) {
        String aid;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() > 0) {
            LIZ.remove(aid);
        }
    }
}
