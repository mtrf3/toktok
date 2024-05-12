package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescVideoBrickVH;

/* renamed from: X.AtN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27661AtN extends AbstractC85293Wj {
    public final /* synthetic */ ProductDescVideoBrickVH LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    public C27661AtN(ProductDescVideoBrickVH productDescVideoBrickVH) {
        this.LJLIL = productDescVideoBrickVH;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        ProductDescVideoBrickVH productDescVideoBrickVH = this.LJLIL;
        C27606AsU c27606AsU = productDescVideoBrickVH.LJLLILLLL;
        if (c27606AsU != null) {
            c27606AsU.LJFF = bitmap;
        }
        C73062Slu c73062Slu = productDescVideoBrickVH.LJLLI;
        if (c73062Slu == null) {
            return;
        }
        c73062Slu.setParams(c27606AsU);
    }
}
