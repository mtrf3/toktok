package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.preview.widget.partnership.videolive.GamePartnershipBeforeVideoLiveSlotWidget$tryRemovePlugGamesInVideoLive$1", f = "GamePartnershipBeforeVideoLiveSlotWidget.kt", l = {277}, m = "invokeSuspend")
/* renamed from: X.2h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65162h6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C30611Bzr LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65162h6(C30611Bzr c30611Bzr, InterfaceC67352kd<? super C65162h6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c30611Bzr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65162h6(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C30611Bzr c30611Bzr = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c30611Bzr.LJII(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
