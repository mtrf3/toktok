package X;

import com.bytedance.android.live.base.model.user.User;

/* renamed from: X.Bfv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29375Bfv implements InterfaceC73463SsN<InterfaceC05190Ih> {
    public final /* synthetic */ InterfaceC05190Ih LJLIL;
    public final /* synthetic */ C29382Bg2 LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(InterfaceC05190Ih interfaceC05190Ih) {
        InterfaceC05190Ih interfaceC05190Ih2 = interfaceC05190Ih;
        C73893SzJ<InterfaceC05190Ih> c73893SzJ = this.LJLILLLLZI.LIZ.LJIIIZ;
        if (c73893SzJ != null) {
            c73893SzJ.onNext(interfaceC05190Ih2);
            this.LJLILLLLZI.LIZ.LJIIIZ.onComplete();
            this.LJLILLLLZI.LIZ.LJIIIZ = null;
        }
        BJ5 bj5 = new BJ5();
        bj5.LIZ = true;
        bj5.LIZIZ = this.LJLIL;
        C73943T0h.LIZ().LIZIZ(bj5);
        this.LJLILLLLZI.LIZ.LJI.onNext(new C29383Bg3(EnumC05180Ig.Login, this.LJLIL));
        this.LJLILLLLZI.LIZ.LJIJ(interfaceC05190Ih2);
    }

    public C29375Bfv(C29382Bg2 c29382Bg2, User user) {
        this.LJLILLLLZI = c29382Bg2;
        this.LJLIL = user;
    }
}
