package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$updateModifiedMsgInDbAndNotify$2", f = "SendMsgUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ov4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63438Ov4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ C63537Owf LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63438Ov4(C109544Rq c109544Rq, C63537Owf c63537Owf, InterfaceC67352kd<? super C63438Ov4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = c63537Owf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63438Ov4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(this.LJLIL.getConversationId());
        if (LJIIIZ != null) {
            C109544Rq c109544Rq = this.LJLIL;
            if (LJIIIZ.getLastShowMessage() == null || o.LJ(LJIIIZ.getLastShowMessage().getUuid(), c109544Rq.getUuid())) {
                LJIIIZ.setLastShowMessage(c109544Rq);
                C115284fk.LJIILIIL().LJIJI(2, LJIIIZ);
            }
        }
        C63309Osz.LIZLLL().LJIIIZ(AbstractC63551Owt.LIZ, this.LJLIL, this.LJLILLLLZI.LIZJ.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
