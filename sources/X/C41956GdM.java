package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl$resizeImageIfNeeded$3", f = "VideoChosenResultFromAddSceneImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GdM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41956GdM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C41988Gds LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41956GdM(C41988Gds c41988Gds, InterfaceC67352kd<? super C41956GdM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c41988Gds;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41956GdM(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
