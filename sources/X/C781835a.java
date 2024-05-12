package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.35a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C781835a {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("ad_inference_feedback_data");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static void LIZ(String str, Boolean bool, Long l) {
        String LJFF = i0.LJFF("show", str);
        String LJFF2 = i0.LJFF("time", str);
        if (bool != null) {
            LIZ.storeBoolean(LJFF, bool.booleanValue());
        }
        if (l != null) {
            LIZ.storeLong(LJFF2, l.longValue());
        }
    }
}
