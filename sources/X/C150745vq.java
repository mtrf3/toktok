package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import defpackage.m0;
import kotlin.jvm.internal.o;

/* renamed from: X.5vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150745vq {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("photo_mode_swipe_keva_creation");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static int LIZ() {
        return i0.LIZJ("photo_mode_swipe_hint_show_count_creation|", ((RBX) HG3.LJIILL()).getCurUserId(), LIZ, 0);
    }

    public static void LIZIZ() {
        LIZ.storeInt(i0.LJFF("photo_mode_swipe_hint_show_count_creation|", ((RBX) HG3.LJIILL()).getCurUserId()), LIZ() + 1);
    }

    public static boolean LIZJ() {
        if (m0.LIZLLL("photo_mode_user_has_swiped_creation|", ((RBX) HG3.LJIILL()).getCurUserId(), LIZ, false) || LIZ() >= ((Number) C150755vr.LIZ.getValue()).intValue()) {
            return false;
        }
        return true;
    }
}
