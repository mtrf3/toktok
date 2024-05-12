package X;

import Y.IDeS153S0200000_15;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity$onCreate$6", f = "CreatorCaptionEditActivity.kt", l = {544}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XMD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CreatorCaptionEditActivity LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XMD(CreatorCaptionEditActivity creatorCaptionEditActivity, InterfaceC67352kd<? super XMD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = creatorCaptionEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XMD(this.LJLILLLLZI, interfaceC67352kd);
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
            IDeS153S0200000_15 iDeS153S0200000_15 = new IDeS153S0200000_15(this.LJLILLLLZI.LLII().LJLJI, new C85502Xh4(this.LJLILLLLZI, null), 0);
            this.LJLIL = 1;
            if (V1M.LJII(iDeS153S0200000_15, this) == enumC58928NAu) {
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
