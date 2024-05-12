package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.sendbuffer.SendGiftTransactionTaskBuffer$requestFlushSendGift$1", f = "SendGiftTransactionTaskBuffer.kt", l = {163}, m = "invokeSuspend")
/* renamed from: X.UVt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77309UVt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C77311UVv LJLILLLLZI;
    public final /* synthetic */ UW0 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77309UVt(C77311UVv c77311UVv, UW0 uw0, InterfaceC67352kd<? super C77309UVt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c77311UVv;
        this.LJLJI = uw0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77309UVt(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            String str = this.LJLILLLLZI.LJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("requestFlushSendGift thread(");
            LIZ.append(C16880lQ.LLLLIIIILLL().getId());
            LIZ.append(')');
            C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
            XK4 xk4 = this.LJLILLLLZI.LJIIIZ;
            C77313UVx c77313UVx = new C77313UVx(this.LJLJI);
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c77313UVx, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
