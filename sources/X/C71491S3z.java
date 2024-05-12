package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.assem.ProductListAssem;

/* renamed from: X.S3z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71491S3z implements InterfaceC187177Wf {
    public final /* synthetic */ ProductListAssem LJLIL;

    @Override // X.InterfaceC187177Wf
    public final void LLLLLILLIL() {
        this.LJLIL.C3().setInterceptTouchEvent$e_commerce_influencer_release(true);
    }

    @Override // X.InterfaceC187177Wf
    public final void S2() {
        this.LJLIL.C3().setInterceptTouchEvent$e_commerce_influencer_release(false);
        this.LJLIL.F3().getEditTextView().clearFocus();
    }

    public C71491S3z(ProductListAssem productListAssem) {
        this.LJLIL = productListAssem;
    }
}
