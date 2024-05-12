package X;

import com.bytedance.android.live.base.model.user.CoverImageModel;

/* renamed from: X.BGo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28502BGo implements InterfaceC73463SsN<C28467BFf<CoverImageModel>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ViewOnClickListenerC28501BGn LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        this.LJLILLLLZI.LJ(th);
        C29702BlC LIZIZ = C18210nZ.LIZIZ("ttlive_upload_cover_all", th);
        LIZIZ.LJII = true;
        LIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLILLLLZI.LJLJJLL.LIZ(interfaceC92693kP);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167  */
    @Override // X.InterfaceC73463SsN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(X.C28467BFf<com.bytedance.android.live.base.model.user.CoverImageModel> r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28502BGo.onSuccess(java.lang.Object):void");
    }

    public C28502BGo(ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn, String str) {
        this.LJLILLLLZI = viewOnClickListenerC28501BGn;
        this.LJLIL = str;
    }
}
