package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.controller.BackgroundAudioPlayer$resume$1", f = "BackgroundAudioPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class JD2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C48649J7l LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JD2(C48649J7l c48649J7l, InterfaceC67352kd<? super JD2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c48649J7l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new JD2(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LIZJ()) {
            this.LJLIL.LIZ();
            this.LJLIL.LIZ().LJJJJIZL().LIZIZ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
