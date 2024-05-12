package X;

import android.content.Context;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.ui.RssFeedAssem;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class HEI implements IPageToFinish {
    public final /* synthetic */ RssFeedAssem LJLIL;
    public final /* synthetic */ RssArticle LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
    public final void onFinish(boolean z) {
        String str;
        RssFeedAssem rssFeedAssem = this.LJLIL;
        RssArticle rssArticle = this.LJLILLLLZI;
        rssFeedAssem.getClass();
        if (rssArticle.hasMaxImages) {
            C26045AKb c26045AKb = new C26045AKb(rssFeedAssem.getContainerView());
            Context context = rssFeedAssem.getContext();
            if (context != null) {
                str = context.getString(R.string.bsz);
            } else {
                str = null;
            }
            c26045AKb.LJIIIZ(str);
            c26045AKb.LIZ(true);
            c26045AKb.LIZLLL(8000L);
            c26045AKb.LJIIJ();
        }
    }

    public HEI(RssFeedAssem rssFeedAssem, RssArticle rssArticle) {
        this.LJLIL = rssFeedAssem;
        this.LJLILLLLZI = rssArticle;
    }
}
