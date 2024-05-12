package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.result.SendGiftResultHandlerManager$onSuccessResult$1$1", f = "SendGiftResultHandlerManager.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UVL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UVO LJLILLLLZI;
    public final /* synthetic */ UVN LJLJI;
    public final /* synthetic */ UV7 LJLJJI;
    public final /* synthetic */ C32816CuK LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVL(UVO uvo, UVN uvn, UV7 uv7, C32816CuK c32816CuK, InterfaceC67352kd<? super UVL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = uvo;
        this.LJLJI = uvn;
        this.LJLJJI = uv7;
        this.LJLJJL = c32816CuK;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UVL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                String str = this.LJLILLLLZI.LIZJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("thread(");
                LIZ.append(C16880lQ.LLLLIIIILLL().getId());
                LIZ.append(") handler(");
                LIZ.append(this.LJLJI.getClass().getName());
                LIZ.append(") onSuccessResult: ");
                LIZ.append(this.LJLJJI);
                LIZ.append("task: ");
                LIZ.append(this.LJLJJL.LIZ());
                C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
                UVN uvn = this.LJLJI;
                C32816CuK c32816CuK = this.LJLJJL;
                UV7 uv7 = this.LJLJJI;
                this.LJLIL = 1;
                if (uvn.LIZLLL(c32816CuK, uv7, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C0NB.LJI(this.LJLILLLLZI.LIZJ, e);
        }
        return C76800UCe.LIZ;
    }
}
