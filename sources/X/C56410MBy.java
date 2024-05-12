package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.list.TrendingListFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.MBy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56410MBy implements MC4 {
    public final /* synthetic */ TrendingListFragment LIZ;

    public C56410MBy(TrendingListFragment trendingListFragment) {
        this.LIZ = trendingListFragment;
    }

    @Override // X.MC4
    public final void LIZ(boolean z, TrendingEventModel trendingEventModel) {
        MBO mbo = this.LIZ.LJLILLLLZI;
        if (mbo != null) {
            mbo.LIZJ(z, trendingEventModel);
        }
    }

    @Override // X.MC4
    public final void LIZIZ(View view, MC0 item) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(item, "item");
        MBO mbo = this.LIZ.LJLILLLLZI;
        if (mbo != null) {
            mbo.LIZIZ(item.LJLIL);
        }
    }
}
