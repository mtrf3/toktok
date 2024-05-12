package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfoResponse;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;

/* renamed from: X.JcP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49541JcP implements InterfaceC65462ha<PollingInfoResponse> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ C49517Jc1 LJLILLLLZI;
    public final /* synthetic */ TakoPollingVM LJLJI;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super PollingInfoResponse> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new C49546JcU(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public C49541JcP(C3C3 c3c3, C49517Jc1 c49517Jc1, TakoPollingVM takoPollingVM) {
        this.LJLIL = c3c3;
        this.LJLILLLLZI = c49517Jc1;
        this.LJLJI = takoPollingVM;
    }
}
