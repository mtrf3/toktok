package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* loaded from: classes11.dex */
public final class OYJ<T> implements InterfaceC73518StG {
    public final /* synthetic */ BaseSharePackage LIZ;
    public final /* synthetic */ InterfaceC62225ObV LIZIZ;

    public OYJ(SharePackage sharePackage, InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ = sharePackage;
        this.LIZIZ = interfaceC62225ObV;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        c73516StE.onSuccess(this.LIZ.LJIIJJI(this.LIZIZ));
    }
}
