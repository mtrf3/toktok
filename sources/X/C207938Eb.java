package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.8Eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207938Eb {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("avatar_nickname_frequency_cache");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static int LIZ(String str) {
        return i0.LIZJ(str, "/_popup_show_cnt", LIZ, 0);
    }
}
