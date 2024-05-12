package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161756Wl {
    public static String LIZ = "allow_show_keva_key";
    public static final Keva LIZIZ;

    static {
        Keva repo = Keva.getRepo("allow_show_keva_repo");
        o.LJIIIIZZ(repo, "getRepo(ALLOW_REPLY_SHOW_REPO)");
        LIZIZ = repo;
    }

    public static final void LIZ(Context context, Long l, C6GD c6gd) {
        String LJI = C173376rF.LJI(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        o.LJIIIIZZ(LJI, "getMD5String(CameraClien…rvice.getCurrentUserID())");
        LIZ = LJI;
        if (LIZIZ.getInt(LJI, EnumC161766Wm.FORUM_UNKNOWN.ordinal()) != EnumC161766Wm.FORUM_OPEN.ordinal()) {
            if ((l == null || l.longValue() == 0) && context != null) {
                C26227ARb LIZ2 = C3AW.LIZ(context);
                LIZ2.LJII = false;
                LIZ2.LJ(R.string.pqf);
                LIZ2.LIZ(R.string.pqe);
                UC0.LIZJ(LIZ2, new AqS168S0100000_2(c6gd, 616));
                LIZ2.LJI().LIZLLL();
            }
        }
    }
}
