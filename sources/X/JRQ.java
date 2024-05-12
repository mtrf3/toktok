package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.SearchListContainer;

/* loaded from: classes9.dex */
public final class JRQ implements View.OnScrollChangeListener {
    public final /* synthetic */ SearchListContainer LIZ;

    public JRQ(SearchListContainer searchListContainer) {
        this.LIZ = searchListContainer;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        JRT jrt;
        C49177JRt c49177JRt;
        JRT jrt2;
        C49177JRt c49177JRt2;
        SearchListContainer searchListContainer = this.LIZ;
        int i5 = searchListContainer.LLFII;
        if (i5 == 0 && i > i5 && (jrt2 = searchListContainer.LJZL) != null && (c49177JRt2 = jrt2.LIZIZ) != null) {
            C49177JRt.LIZ(c49177JRt2, "bounceViewStatus", C51029K0z.LJJIIZI(new OSZ("type", "show")));
        }
        SearchListContainer searchListContainer2 = this.LIZ;
        if (searchListContainer2.LLFII > 0 && i <= 0 && (jrt = searchListContainer2.LJZL) != null && (c49177JRt = jrt.LIZIZ) != null) {
            C49177JRt.LIZ(c49177JRt, "bounceViewStatus", C51029K0z.LJJIIZI(new OSZ("type", "hide")));
        }
        this.LIZ.LLFII = i;
    }
}
