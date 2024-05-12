package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.IProfileService;
import kotlin.jvm.internal.o;

/* renamed from: X.GzZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43333GzZ<T> implements InterfaceC64592gB {
    public static final C43333GzZ<T> LJLIL = new C43333GzZ<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ActivityC45651qj activityC45651qj;
        Aweme aweme = (Aweme) obj;
        o.LJIIIZ(aweme, "aweme");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("This video pass moderation:avid: ");
        LIZ.append(aweme.getAid());
        C36922EeM.LIZLLL(2, "FrontierReeditPushImpl", X1D.LIZIZ(LIZ));
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null) {
            IProfileService iProfileService = (IProfileService) M5B.LJLJL.getValue();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            iProfileService.updateCoverIfMyProfileVisible(activityC45651qj, aid, aweme);
        }
    }
}
