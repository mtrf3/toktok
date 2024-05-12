package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import java.util.List;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPK extends C1CZ {
    public final /* synthetic */ KPI LJLIL;

    public KPK(KPI kpi) {
        this.LJLIL = kpi;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        Aweme aweme;
        List<Aweme> LJJLL = this.LJLIL.LJLIL.LJJLL();
        if (LJJLL != null && (aweme = (Aweme) ORZ.LJLLLLLL(i, LJJLL)) != null) {
            KPI kpi = this.LJLIL;
            boolean LIZIZ = JI4.LIZIZ(aweme);
            FilterVM LJFF = kpi.LJFF();
            LJFF.getClass();
            LJFF.setState(new AqS9S0010000_4(LIZIZ, 33));
            FilterVM LJFF2 = kpi.LJFF();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            LJFF2.getClass();
            LJFF2.setState(new AqS29S1000000_4(aid, 27));
        }
    }
}
