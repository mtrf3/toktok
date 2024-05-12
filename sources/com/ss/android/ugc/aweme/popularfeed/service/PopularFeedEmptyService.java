package com.ss.android.ugc.aweme.popularfeed.service;

import android.content.Context;
import com.ss.android.ugc.aweme.homepage.ui.slide.IXTabScrollProfileStrategy;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PopularFeedEmptyService implements IPopularFeedService {
    public IXTabScrollProfileStrategy getTabScrollProfileStrategy(Context context) {
        o.LJIIIZ(context, "context");
        return null;
    }

    public boolean isPopularEnable() {
        return false;
    }

    public boolean showTopTab() {
        return false;
    }
}
