package X;

import android.content.Intent;
import com.bytedance.router.OpenResultCallback;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;

/* renamed from: X.Rzy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71386Rzy implements OpenResultCallback {
    public final /* synthetic */ ECommerceAnchorPanelViewModel LIZ;
    public final /* synthetic */ ShopWindowAnchorModel LIZIZ;

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
        this.LIZ.gv0("route", "");
    }

    public C71386Rzy(ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, ShopWindowAnchorModel shopWindowAnchorModel) {
        this.LIZ = eCommerceAnchorPanelViewModel;
        this.LIZIZ = shopWindowAnchorModel;
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
        String str3;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZ;
        if (str2 == null) {
            str2 = "-1";
        }
        eCommerceAnchorPanelViewModel.gv0("route", str2);
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LIZIZ;
        ProductListModel productListModel = this.LIZ.LJLILLLLZI;
        if (productListModel != null) {
            str3 = productListModel.getEventType();
        } else {
            str3 = null;
        }
        c71361RzZ.getClass();
        C71361RzZ.LJI(shopWindowAnchorModel, false, str3, true);
    }
}
