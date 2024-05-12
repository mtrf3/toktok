package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.K3m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51094K3m {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(User user) {
        IAccountUserService LJIILL;
        User curUser;
        if (C00F.LIZ(31744, 0, "disable_search_live_tag", true) == 1) {
            return false;
        }
        BusinessComponentServiceUtils.getLiveAllService().getClass();
        if (!Live.showLive(user) && (user == null || !user.isSecret() || !user.isLive() || !UC0.LJJLI() || (LJIILL = HG3.LJIILL()) == null || (curUser = ((RBX) LJIILL).getCurUser()) == null || !o.LJ(user.getUid(), curUser.getUid()))) {
            return false;
        }
        return true;
    }
}
