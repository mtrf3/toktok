package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$send$2", f = "SendMsgUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ov3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63437Ov3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63537Owf LJLIL;
    public final /* synthetic */ C63120Opw LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63437Ov3(C63537Owf c63537Owf, C63120Opw c63120Opw, C109544Rq c109544Rq, InterfaceC67352kd<? super C63437Ov3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63537Owf;
        this.LJLILLLLZI = c63120Opw;
        this.LJLJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63437Ov3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63537Owf c63537Owf = this.LJLIL;
        C63120Opw memoryConv = this.LJLILLLLZI;
        o.LJIIIIZZ(memoryConv, "memoryConv");
        C109544Rq c109544Rq = this.LJLJI;
        c63537Owf.getClass();
        C109544Rq lastShowMessage = memoryConv.getLastShowMessage();
        if (lastShowMessage == null || lastShowMessage.getIndex() < c109544Rq.getIndex()) {
            memoryConv.setLastShowMessage(c109544Rq);
            memoryConv.setLastMessageIndex(c109544Rq.getIndex());
            if (C63308Osy.LJI().LIZLLL().LJJZ) {
                SFS.LJJIJIIJI(memoryConv, c109544Rq.getCreatedAt(), c109544Rq);
            }
            memoryConv.setUpdatedTime(c109544Rq.getCreatedAt());
            C115284fk.LJIILIIL().LJIJI(2, memoryConv);
        }
        C63309Osz.LIZLLL().LJIIIZ(AbstractC63551Owt.LIZ, this.LJLJI, this.LJLIL.LIZJ.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
