package com.ss.android.ugc.aweme.rss.feed.viewmodel;

import X.AJY;
import X.C33W;
import X.C78773Uvp;
import X.InterfaceC68402mK;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RssFeedViewModel extends AssemViewModel<C33W> {
    public final RssFeedParam LJLIL;
    public final InterfaceC68402mK LJLILLLLZI;
    public String LJLJI;
    public RssArticle LJLJJI;
    public final C78773Uvp LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33W defaultState() {
        return new C33W(0);
    }

    public RssFeedViewModel(RssFeedParam rssFeedParam, AJY rssRepo) {
        o.LJIIIZ(rssFeedParam, "rssFeedParam");
        o.LJIIIZ(rssRepo, "rssRepo");
        this.LJLIL = rssFeedParam;
        this.LJLILLLLZI = rssRepo;
        this.LJLJI = rssFeedParam.getRssFeedUrl();
        this.LJLJJL = new C78773Uvp();
    }
}
