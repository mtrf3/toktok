package X;

import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;

/* renamed from: X.NWf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59485NWf implements VN1 {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ AdWebSparkFragment LIZIZ;

    @Override // X.VN1
    public final void LIZ(long j) {
        this.LIZIZ.LLFFF = j;
    }

    public C59485NWf(View view, AdWebSparkFragment adWebSparkFragment) {
        this.LIZ = view;
        this.LIZIZ = adWebSparkFragment;
    }

    @Override // X.VN1
    public final void LIZIZ(int i, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ.getContext(), "//adwebview/blankscreen/log");
        buildRoute.withParam("blankState", i);
        buildRoute.withParam("costTimeInCheckBlank", this.LIZIZ.LLFFF);
        buildRoute.open();
    }
}
