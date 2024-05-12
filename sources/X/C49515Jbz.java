package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AqS13S0010000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Jbz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49515Jbz extends AbstractC65781Prl implements InterfaceC88472Yns<C49517Jc1, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ TakoPollingVM LJLILLLLZI;
    public final /* synthetic */ SearchBotHolder LJLJI;
    public final /* synthetic */ SearchMixFeed LJLJJI;
    public final /* synthetic */ PollingInfo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49515Jbz(String str, TakoPollingVM takoPollingVM, SearchBotHolder searchBotHolder, SearchMixFeed searchMixFeed, PollingInfo pollingInfo) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = takoPollingVM;
        this.LJLJI = searchBotHolder;
        this.LJLJJI = searchMixFeed;
        this.LJLJJL = pollingInfo;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C49517Jc1 c49517Jc1) {
        C49517Jc1 state = c49517Jc1;
        o.LJIIIZ(state, "state");
        if (C78685UuP.LJJJZ(this.LJLIL) && !o.LJ(this.LJLIL, state.LJLJLJ)) {
            TakoPollingVM takoPollingVM = this.LJLILLLLZI;
            String str = this.LJLIL;
            takoPollingVM.getClass();
            takoPollingVM.setState(new AqS31S1000000_8(str, 7));
            this.LJLJI.U();
        }
        TakoPollingVM takoPollingVM2 = this.LJLILLLLZI;
        TakoInfo takoInfo = this.LJLJJI.bot;
        takoPollingVM2.getClass();
        takoPollingVM2.setState(new AqS174S0100000_8(takoInfo, 218));
        this.LJLILLLLZI.hv0(this.LJLJJL);
        TakoPollingVM takoPollingVM3 = this.LJLILLLLZI;
        takoPollingVM3.getClass();
        takoPollingVM3.setState(new AqS13S0010000_8(4));
        return C76800UCe.LIZ;
    }
}
