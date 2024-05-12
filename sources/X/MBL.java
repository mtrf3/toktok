package X;

import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBL implements MBO {
    public final /* synthetic */ BottomBarAssem LIZ;

    @Override // X.MBO
    public final void LIZJ(boolean z, TrendingEventModel trendingEventModel) {
    }

    @Override // X.MBO
    public final void LIZ() {
        this.LIZ.A3().LJL();
    }

    public MBL(BottomBarAssem bottomBarAssem) {
        this.LIZ = bottomBarAssem;
    }

    @Override // X.MBO
    public final void LIZIZ(TrendingEventModel model) {
        o.LJIIIZ(model, "model");
        if (this.LIZ.x3() instanceof TrendingDetailOperatorWrapper) {
            TrendingDetailSharedVM x3 = this.LIZ.x3();
            o.LJII(x3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper");
            TrendingDetailOperatorWrapper trendingDetailOperatorWrapper = (TrendingDetailOperatorWrapper) x3;
            trendingDetailOperatorWrapper.LL = null;
            trendingDetailOperatorWrapper.LLFF = true;
        }
        this.LIZ.A3().LJ();
        this.LIZ.x3().kv0(1, model.getEventId());
    }
}
