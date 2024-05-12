package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescVideoViewHolder;

/* renamed from: X.AsP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27601AsP extends AbstractC85293Wj {
    public final /* synthetic */ C27606AsU LJLIL;
    public final /* synthetic */ ProductDescVideoViewHolder LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        C27606AsU c27606AsU = this.LJLIL;
        c27606AsU.LJFF = bitmap;
        C73062Slu c73062Slu = this.LJLILLLLZI.LJLJJLL;
        if (c73062Slu == null) {
            return;
        }
        c73062Slu.setParams(c27606AsU);
    }

    public C27601AsP(C27606AsU c27606AsU, ProductDescVideoViewHolder productDescVideoViewHolder) {
        this.LJLIL = c27606AsU;
        this.LJLILLLLZI = productDescVideoViewHolder;
    }
}
