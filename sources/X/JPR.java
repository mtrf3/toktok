package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd;
import java.util.List;

/* loaded from: classes9.dex */
public final class JPR implements N6M {
    public final /* synthetic */ JPP LIZ;
    public final /* synthetic */ SearchPreciseAd LIZIZ;

    public final ViewGroup LJI() {
        View view = this.LIZ.itemView;
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // X.InterfaceC58801N5x
    public final Aweme getAweme() {
        List<Aweme> awemeCards = this.LIZIZ.getAwemeCards();
        if (awemeCards != null) {
            return (Aweme) ORZ.LJLLLL(awemeCards);
        }
        return null;
    }

    @Override // X.InterfaceC58801N5x
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.N6M
    public final String getEnterFrom() {
        return this.LIZ.LJLJL().LJFF;
    }

    public JPR(JPP jpp, SearchPreciseAd searchPreciseAd) {
        this.LIZ = jpp;
        this.LIZIZ = searchPreciseAd;
    }
}
