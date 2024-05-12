package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.o;

/* renamed from: X.EMu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36308EMu {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("comment_filter_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static String LIZ() {
        return AccountService.LJIJ().LJFF().getCurUserId();
    }
}
