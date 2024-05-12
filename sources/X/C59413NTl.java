package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.NTl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59413NTl {
    public static final Keva LIZ;
    public static final String LIZIZ;

    static {
        Keva repo = Keva.getRepo("promote_share_icon_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
        String uid = ((RBX) HG3.LJIILL()).getCurUser().getUid();
        o.LJIIIIZZ(uid, "userService().curUser.uid");
        LIZIZ = uid;
    }

    public static int LIZ() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            String str = LIZIZ;
            if (!TextUtils.isEmpty(str)) {
                return LIZ.getInt(i0.LJFF("times", str), 0);
            }
        }
        return C59411NTj.LIZIZ.LJIILLIIL().getPromoteIconFlipMaxTimes();
    }
}
