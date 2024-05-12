package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43I;
import X.C49517Jc1;
import X.C50201Jn3;
import X.C50209JnB;
import X.C50212JnE;
import X.C76800UCe;
import X.C78613UtF;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;

/* loaded from: classes9.dex */
public class AqS96S0101000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS96S0101000_8 aqS96S0101000_8, Object obj) {
        Boolean bool;
        C49517Jc1 setState = (C49517Jc1) obj;
        o.LJIIIZ(setState, "$this$setState");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePollingInfo limit = ");
        LIZ.append(aqS96S0101000_8.i1);
        LIZ.append(" , enable = ");
        PollingInfo pollingInfo = (PollingInfo) aqS96S0101000_8.l0;
        if (pollingInfo != null) {
            bool = pollingInfo.getEnable();
        } else {
            bool = null;
        }
        LIZ.append(bool);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoPollingVM", X1D.LIZIZ(LIZ));
        return C49517Jc1.LIZIZ(setState, false, (PollingInfo) aqS96S0101000_8.l0, false, 0, 0L, null, null, null, null, null, 1021);
    }

    public static final Object invoke$1(AqS96S0101000_8 aqS96S0101000_8, Object obj) {
        C50201Jn3 state = (C50201Jn3) obj;
        o.LJIIIZ(state, "state");
        SearchLabel searchLabel = (SearchLabel) ORZ.LJLLLLLL(aqS96S0101000_8.i1, state.LJLJL.LIZ);
        if (searchLabel != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope((SearchHubHeaderVM) aqS96S0101000_8.l0), C78613UtF.LIZJ, null, new C50212JnE((SearchHubHeaderVM) aqS96S0101000_8.l0, state, aqS96S0101000_8.i1, searchLabel, null), 2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS96S0101000_8 aqS96S0101000_8, Object obj) {
        C50201Jn3 state = (C50201Jn3) obj;
        o.LJIIIZ(state, "state");
        SearchLabel searchLabel = (SearchLabel) ORZ.LJLLLLLL(aqS96S0101000_8.i1, state.LJLJL.LIZ);
        if (searchLabel != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope((SearchHubHeaderVM) aqS96S0101000_8.l0), C78613UtF.LIZJ, null, new C50209JnB((SearchHubHeaderVM) aqS96S0101000_8.l0, state, aqS96S0101000_8.i1, searchLabel, null), 2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS96S0101000_8 aqS96S0101000_8, Object obj) {
        C50201Jn3 setState = (C50201Jn3) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C50201Jn3.LIZ(setState, aqS96S0101000_8.i1, 0, true, new C43I((SearchLabel) aqS96S0101000_8.l0), null, 3295);
    }

    public static final Object invoke$4(AqS96S0101000_8 aqS96S0101000_8, Object obj) {
        C50201Jn3 it = (C50201Jn3) obj;
        o.LJIIIZ(it, "it");
        SearchLabel searchLabel = (SearchLabel) ORZ.LJLLLLLL(aqS96S0101000_8.i1, it.LJLJL.LIZ);
        if (searchLabel != null) {
            ((SearchHubHeaderVM) aqS96S0101000_8.l0).setState(new AqS96S0101000_8(searchLabel, aqS96S0101000_8.i1, 3));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0101000_8(int i, PollingInfo pollingInfo, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = pollingInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0101000_8(int i, SearchHubHeaderVM searchHubHeaderVM, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = searchHubHeaderVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0101000_8(SearchLabel searchLabel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = searchLabel;
        this.i1 = i;
    }
}
