package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.controller.BackgroundAudioPlayerQueueController$playPrevious$1", f = "BackgroundAudioPlayerQueueController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JCy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48792JCy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C48652J7o LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48792JCy(C48652J7o c48652J7o, InterfaceC67352kd<? super C48792JCy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c48652J7o;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C48792JCy(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IDR LJJJ = this.LJLIL.LIZ().LJJJ();
        if (LJJJ != null) {
            LJJJ.tryMoveToPrevInBg();
        }
        this.LJLIL.LIZ().LJJJJIZL().LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
