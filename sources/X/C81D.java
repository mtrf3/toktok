package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.81D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81D {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("photo_mode_swipe_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static int LIZ() {
        return i0.LIZJ("photo_mode_swipe_hint_show_count|", ((RBX) HG3.LJIILL()).getCurUserId(), LIZ, 0);
    }
}
