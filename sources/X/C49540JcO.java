package X;

import Y.IDeS151S0200000_10;
import Y.IDfS129S0100000_8;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM$startPolling$1", f = "TakoPollingVM.kt", l = {384}, m = "invokeSuspend")
/* renamed from: X.JcO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49540JcO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ TakoPollingVM LJLJI;
    public final /* synthetic */ C49517Jc1 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49540JcO(TakoPollingVM takoPollingVM, C49517Jc1 c49517Jc1, InterfaceC67352kd<? super C49540JcO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = takoPollingVM;
        this.LJLJJI = c49517Jc1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C49540JcO c49540JcO = new C49540JcO(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c49540JcO.LJLILLLLZI = obj;
        return c49540JcO;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoPollingVM", "startPolling before request");
            C3C3 c3c3 = new C3C3(new C49542JcQ(this.LJLJI, this.LJLJJI, null));
            C49517Jc1 c49517Jc1 = this.LJLJJI;
            TakoPollingVM takoPollingVM = this.LJLJI;
            IDeS151S0200000_10 iDeS151S0200000_10 = new IDeS151S0200000_10(new C49541JcP(c3c3, c49517Jc1, takoPollingVM), new C49539JcN(interfaceC70422pa, takoPollingVM, null), 0);
            IDfS129S0100000_8 iDfS129S0100000_8 = new IDfS129S0100000_8(this.LJLJI, 2);
            this.LJLIL = 1;
            if (iDeS151S0200000_10.collect(iDfS129S0100000_8, this) == enumC58928NAu) {
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
