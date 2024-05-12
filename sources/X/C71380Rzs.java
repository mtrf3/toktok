package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.OpenResultCallback;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;

/* renamed from: X.Rzs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71380Rzs implements OpenResultCallback {
    public final /* synthetic */ AnchorPanelAdapter LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ ShopWindowAnchorModel LIZJ;

    @Override // com.bytedance.router.OpenResultCallback
    public final void onActionResult(Object obj) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onEmpty() {
        C113134cH.LIZ(this);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final /* synthetic */ void onOpen(Intent intent) {
        C113134cH.LIZIZ(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
        AnchorPanelAdapter anchorPanelAdapter = this.LIZ;
        C71363Rzb.LJIILLIIL(anchorPanelAdapter.LJLIL, ((ShopWindowAnchorModel) ListProtector.get(anchorPanelAdapter.LJLJLLL, this.LIZIZ)).LIZ, "route", "", this.LIZ.LJLJLJ.getPanelStyle(), 32);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
        String str3 = str2;
        AnchorPanelAdapter anchorPanelAdapter = this.LIZ;
        ProductListModel productListModel = anchorPanelAdapter.LJLIL;
        ShopWindowExtraModel shopWindowExtraModel = ((ShopWindowAnchorModel) ListProtector.get(anchorPanelAdapter.LJLJLLL, this.LIZIZ)).LIZ;
        if (str3 == null) {
            str3 = "-1";
        }
        C71363Rzb.LJIILLIIL(productListModel, shopWindowExtraModel, "route", str3, this.LIZ.LJLJLJ.getPanelStyle(), 32);
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LIZJ;
        String eventType = this.LIZ.LJLIL.getEventType();
        c71361RzZ.getClass();
        C71361RzZ.LJI(shopWindowAnchorModel, false, eventType, false);
    }

    public C71380Rzs(AnchorPanelAdapter anchorPanelAdapter, int i, ShopWindowAnchorModel shopWindowAnchorModel) {
        this.LIZ = anchorPanelAdapter;
        this.LIZIZ = i;
        this.LIZJ = shopWindowAnchorModel;
    }
}
