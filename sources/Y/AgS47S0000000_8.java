package Y;

import X.C10I;
import X.C10K;
import X.C36922EeM;
import X.C47636Imm;
import X.C49491Jbb;
import X.C50089JlF;
import X.EF7;
import android.content.Context;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;

/* loaded from: classes9.dex */
public class AgS47S0000000_8 implements C10I {
    public final int $t;

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
            default:
                return null;
        }
    }

    public AgS47S0000000_8(int i) {
        this.$t = i;
    }

    public static final Object then$0(AgS47S0000000_8 agS47S0000000_8, C10K c10k) {
        Context LIZIZ = EF7.LIZIZ();
        float LJ = C47636Imm.LJ(LIZIZ);
        int LJI = C47636Imm.LJI(LIZIZ);
        if (LJ == -1.0f || LJI == -1 || LJI / LJ <= 0.2f) {
            return null;
        }
        int LJ2 = (int) (0.2f * C47636Imm.LJ(LIZIZ));
        if (C47636Imm.LJIIIZ(LIZIZ)) {
            return null;
        }
        try {
            C47636Imm.LIZ.setStreamVolume(3, LJ2, 16);
            return null;
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return null;
        }
    }

    public static final Object then$1(AgS47S0000000_8 agS47S0000000_8, C10K c10k) {
        C49491Jbb.LJIIIZ.compareAndSet(1, 2);
        return c10k;
    }

    public static final Object then$2(AgS47S0000000_8 agS47S0000000_8, C10K c10k) {
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) c10k.LJIIJJI();
        if (searchMixFeedList != null) {
            C50089JlF.LIZ(searchMixFeedList);
        }
        return c10k;
    }

    public static final Object then$3(AgS47S0000000_8 agS47S0000000_8, C10K c10k) {
        if (!c10k.LJIILJJIL()) {
            return null;
        }
        throw c10k.LJIIJ();
    }
}
