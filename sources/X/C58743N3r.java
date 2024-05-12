package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.N3r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58743N3r {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String key) {
        o.LJIIIZ(key, "key");
        if (o.LJ(key, "android.permission.READ_CONTACTS")) {
            return Keva.getRepo("FriendsSharePreferences").getBoolean("read_contact_denied", false);
        }
        return Keva.getRepo("permission_store").getBoolean(key, false);
    }
}
