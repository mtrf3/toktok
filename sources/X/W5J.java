package X;

import com.bytedance.lighten.loader.FrescoImageLoaderImpl;

/* loaded from: classes15.dex */
public final class W5J implements InterfaceC47046IdG<Boolean> {
    public final /* synthetic */ W5E LIZ;
    public final /* synthetic */ android.net.Uri LIZIZ;
    public final /* synthetic */ FrescoImageLoaderImpl LIZJ;

    @Override // X.InterfaceC47046IdG
    public final void onResult(Boolean bool) {
        InterfaceC31104CIq interfaceC31104CIq = this.LIZ.LJJIJIIJIL;
        if (bool.booleanValue()) {
            C79083V1z.LIZ(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", "cachedFile hit!!!");
            if (interfaceC31104CIq != null) {
                this.LIZJ.mCache.LJIIIIZZ(this.LIZIZ, new W5W(this, interfaceC31104CIq));
                return;
            }
            return;
        }
        C79083V1z.LJFF(this.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", "cachedFile miss");
        AbstractC48384Iyq LJIILIIL = W8E.LJII().LJI().LJIILIIL(FrescoImageLoaderImpl.buildImageRequest(this.LIZ, this.LIZIZ));
        HWC.LIZ(this.LIZ, new C81720W5k(LJIILIIL));
        LJIILIIL.LJ(new W5K(this, interfaceC31104CIq), this.LIZJ.getCallbackExecutor(this.LIZ));
    }

    public W5J(FrescoImageLoaderImpl frescoImageLoaderImpl, W5E w5e, android.net.Uri uri) {
        this.LIZJ = frescoImageLoaderImpl;
        this.LIZ = w5e;
        this.LIZIZ = uri;
    }
}
