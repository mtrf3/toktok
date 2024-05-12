package X;

import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* renamed from: X.NWb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59481NWb implements VN1 {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ NWI LIZIZ;

    @Override // X.VN1
    public final void LIZ(long j) {
        this.LIZIZ.LJLJLJ = j;
    }

    public C59481NWb(View view, NWI nwi) {
        this.LIZ = view;
        this.LIZIZ = nwi;
    }

    @Override // X.VN1
    public final void LIZIZ(int i, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ.getContext(), "//adwebview/blankscreen/log");
        buildRoute.withParam("blankState", i);
        buildRoute.withParam("costTimeInCheckBlank", this.LIZIZ.LJLJLJ);
        buildRoute.open();
    }
}
