package com.ss.android.ugc.aweme.search.pages.result.topsearch.hotspot.core.viewmodel;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class TrendingCardFeedsViewModel extends ViewModel {
    public List<? extends Aweme> LJLIL;

    public final void gv0(List<? extends Aweme> list) {
        this.LJLIL = list;
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            AwemeService.LIZ().R1((Aweme) it.next());
        }
    }
}
