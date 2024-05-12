package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AY3 extends C247289nA {
    @Override // X.C247289nA
    public final int LIZIZ() {
        if (C57092Lx.LIZ.LJFF) {
            return 0;
        }
        return C61447O9r.LIZ();
    }

    @Override // X.C247289nA
    public final boolean LJIIIIZZ() {
        return LFH.LIZIZ.LIZLLL().LIZLLL();
    }

    @Override // X.C247289nA
    public final boolean LIZJ() {
        return NowsTabServiceImpl.LJJIIJ().LJIJJ();
    }

    @Override // X.C247289nA
    public final boolean LJ() {
        return NowsTabServiceImpl.LJJIIJ().LIZJ();
    }

    @Override // X.C247289nA
    public final void LJI() {
        CommonFeedServiceImpl.LJJIJLIJ().LJ();
    }

    @Override // X.C247289nA
    public final void LJII() {
        CommonFeedServiceImpl.LJJIJLIJ().LJJ();
    }

    @Override // X.C247289nA
    public final boolean LJIIIZ() {
        return CommonFeedServiceImpl.LJJIJLIJ().LJIJI();
    }

    @Override // X.C247289nA
    public final boolean LIZLLL(ActivityC45651qj activityC45651qj) {
        return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).hasSocialNow2Tab(activityC45651qj);
    }

    @Override // X.C247289nA
    public final void LJFF(Context context) {
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).Cv0(C0JT.LIZ("is_nows", true, "now_card", true), "FRIENDS_TAB");
        }
    }
}
