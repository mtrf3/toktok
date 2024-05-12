package X;

import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* loaded from: classes11.dex */
public final class NXH implements VN1 {
    public final /* synthetic */ C61037NxR LIZ;

    public NXH(C61037NxR c61037NxR) {
        this.LIZ = c61037NxR;
    }

    @Override // X.VN1
    public final void LIZ(long j) {
        this.LIZ.LJIIL = j;
    }

    @Override // X.VN1
    public final void LIZIZ(int i, View view) {
        C61037NxR c61037NxR = this.LIZ;
        SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//adwebview/blankscreen/log");
        buildRoute.withParam("blankState", i);
        buildRoute.withParam("costTimeInCheckBlank", c61037NxR.LJIIL);
        buildRoute.open();
    }
}
