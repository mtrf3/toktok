package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.GoLiveChecker$runCheck$1$fetchStreamInfoDone$1$1", f = "GoLiveChecker.kt", l = {73}, m = "invokeSuspend")
/* renamed from: X.Bd1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29195Bd1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C29199Bd5 LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C29199Bd5 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29195Bd1(C29199Bd5 c29199Bd5, InterfaceC67352kd<? super C29195Bd1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c29199Bd5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29195Bd1(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C29199Bd5 c29199Bd5;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c29199Bd5 = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            c29199Bd5 = this.LJLJI;
            XIA xia = C78613UtF.LIZJ;
            C29194Bd0 c29194Bd0 = new C29194Bd0(c29199Bd5, null);
            this.LJLIL = c29199Bd5;
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(xia, c29194Bd0, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c29199Bd5.LIZJ = (String) obj;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
