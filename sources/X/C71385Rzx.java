package X;

import android.content.Intent;
import com.bytedance.router.OpenResultCallback;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;

/* renamed from: X.Rzx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71385Rzx implements OpenResultCallback {
    public final /* synthetic */ C71362Rza LIZ;
    public final /* synthetic */ InterfaceC44105HSr LIZIZ;
    public final /* synthetic */ ShopWindowAnchorModel LIZJ;
    public final /* synthetic */ String LIZLLL;

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
        this.LIZ.LJJIII("route", "", null, this.LIZIZ);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
        C71362Rza c71362Rza = this.LIZ;
        if (str2 == null) {
            str2 = "-1";
        }
        c71362Rza.LJJIII("route", str2, null, this.LIZIZ);
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        ShopWindowAnchorModel shopWindowAnchorModel = this.LIZJ;
        String str3 = this.LIZLLL;
        boolean LJJLJ = this.LIZIZ.LJJLJ();
        c71361RzZ.getClass();
        C71361RzZ.LJI(shopWindowAnchorModel, false, str3, LJJLJ);
    }

    public C71385Rzx(C71362Rza c71362Rza, InterfaceC44105HSr interfaceC44105HSr, ShopWindowAnchorModel shopWindowAnchorModel, String str) {
        this.LIZ = c71362Rza;
        this.LIZIZ = interfaceC44105HSr;
        this.LIZJ = shopWindowAnchorModel;
        this.LIZLLL = str;
    }
}
