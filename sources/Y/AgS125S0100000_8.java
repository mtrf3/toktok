package Y;

import X.C10I;
import X.C10K;
import X.C49914JiQ;
import X.C50764Jw8;
import X.C76800UCe;
import X.J7M;
import X.J7Q;
import X.T16;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.choosemusic.sug.model.MusicSearchSugResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.kids.homepage.compliance.ComplianceApi;
import com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicTrendingViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.MusicSugViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes9.dex */
public class AgS125S0100000_8 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            default:
                return null;
        }
    }

    public AgS125S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS125S0100000_8 agS125S0100000_8, C10K c10k) {
        if (c10k.LJIILIIL()) {
            ((MusicTrendingViewModel) agS125S0100000_8.l0).LJLIL.setValue(new C50764Jw8<>(c10k.LJIIJJI()));
        } else if (c10k.LJIILJJIL()) {
            NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData = ((MusicTrendingViewModel) agS125S0100000_8.l0).LJLIL;
            c10k.LJIIJ();
            nextLiveData.setValue(new C50764Jw8<>());
        } else {
            NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData2 = ((MusicTrendingViewModel) agS125S0100000_8.l0).LJLIL;
            c10k.LJIIJ();
            nextLiveData2.setValue(new C50764Jw8<>());
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS125S0100000_8 agS125S0100000_8, C10K c10k) {
        ((SearchJediMixFeedFragment) agS125S0100000_8.l0).Pm();
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS125S0100000_8 agS125S0100000_8, C10K c10k) {
        ((TopFeedFragment) agS125S0100000_8.l0).Pm();
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS125S0100000_8 agS125S0100000_8, C10K c10k) {
        KidsMainActivity kidsMainActivity = (KidsMainActivity) agS125S0100000_8.l0;
        kidsMainActivity.getClass();
        AVExternalServiceImpl.LIZ().publishService().tryRestorePublish(kidsMainActivity, new AqS173S0100000_7(kidsMainActivity, 256));
        J7Q j7q = J7M.LIZIZ;
        j7q.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ((ComplianceApi) j7q.LIZ.getValue()).checkIn().LJJL(T16.LIZ()).LJJJLIIL(new AfS2S0000100_8(currentTimeMillis, 0), new AfS2S0000100_8(currentTimeMillis, 1));
        return null;
    }

    public static final Object then$4(AgS125S0100000_8 agS125S0100000_8, C10K c10k) {
        if (c10k.LJIILIIL()) {
            ((MusicSugViewModel) agS125S0100000_8.l0).LJLIL.setValue(new C50764Jw8<>(c10k.LJIIJJI()));
        } else if (c10k.LJIILJJIL()) {
            NextLiveData<C50764Jw8<MusicSearchSugResponse>> nextLiveData = ((MusicSugViewModel) agS125S0100000_8.l0).LJLIL;
            c10k.LJIIJ();
            nextLiveData.setValue(new C50764Jw8<>());
        } else {
            NextLiveData<C50764Jw8<MusicSearchSugResponse>> nextLiveData2 = ((MusicSugViewModel) agS125S0100000_8.l0).LJLIL;
            c10k.LJIIJ();
            nextLiveData2.setValue(new C50764Jw8<>());
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS125S0100000_8 agS125S0100000_8, C10K c10k) {
        C49914JiQ c49914JiQ = (C49914JiQ) agS125S0100000_8.l0;
        c49914JiQ.getClass();
        if (c49914JiQ.mHandler == null || c10k == null) {
            c49914JiQ.LJLJLJ = false;
            return null;
        }
        if (!c10k.LJIIL()) {
            if (!c10k.LJIILJJIL()) {
                return null;
            }
            c49914JiQ.LJLJLJ = false;
            c49914JiQ.LJJJ(c10k.LJIIJ(), c10k);
            return null;
        }
        c49914JiQ.LJLJLJ = false;
        c49914JiQ.LJJJJ(0);
        return null;
    }
}
