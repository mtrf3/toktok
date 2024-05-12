package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.sendbuffer.SendGiftTransactionTaskBuffer$newSendGiftTask$1", f = "SendGiftTransactionTaskBuffer.kt", l = {148}, m = "invokeSuspend")
/* renamed from: X.UVr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77307UVr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C77311UVv LJLILLLLZI;
    public final /* synthetic */ C32816CuK LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77307UVr(C77311UVv c77311UVv, C32816CuK c32816CuK, InterfaceC67352kd<? super C77307UVr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c77311UVv;
        this.LJLJI = c32816CuK;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77307UVr(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            LIZ.append("newSendGift thread(");
            LIZ.append(C16880lQ.LLLLIIIILLL().getId());
            LIZ.append(") sendInfo: ");
            LIZ.append(this.LJLJI.LIZ());
            C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
            XK4 xk4 = this.LJLILLLLZI.LJIIIZ;
            C77314UVy c77314UVy = new C77314UVy(this.LJLJI);
            this.LJLIL = 1;
            if (xk4.LJIIIZ(c77314UVy, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
