package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfoResponse;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS174S0100000_8;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM$startPolling$1$3", f = "TakoPollingVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JcN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49539JcN extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super PollingInfoResponse>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public final /* synthetic */ TakoPollingVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49539JcN(InterfaceC70422pa interfaceC70422pa, TakoPollingVM takoPollingVM, InterfaceC67352kd<? super C49539JcN> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC70422pa;
        this.LJLJI = takoPollingVM;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super PollingInfoResponse> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C49539JcN c49539JcN = new C49539JcN(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c49539JcN.LJLIL = th;
        return c49539JcN.invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Throwable th = (Throwable) this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("catch: exception is ");
        LIZ.append(C16880lQ.LJLLJ(th.getClass()));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoPollingVM", X1D.LIZIZ(LIZ));
        if (C48841JEv.LJIILLIIL(this.LJLILLLLZI)) {
            this.LJLJI.gv0();
            if (!(th instanceof C49531JcF) && !(th instanceof CancellationException)) {
                this.LJLJI.setState(new AqS174S0100000_8(th, 216));
            }
        }
        return C76800UCe.LIZ;
    }
}
