package X;

import com.bytedance.keva.Keva;
import defpackage.m0;
import kotlin.jvm.internal.o;

/* renamed from: X.9RT, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9RT {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("article_mode_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static boolean LIZ() {
        return m0.LIZLLL("article_mode_intro_shown|", ((RBX) HG3.LJIILL()).getCurUserId(), LIZ, false);
    }
}
