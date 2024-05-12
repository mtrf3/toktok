package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C236769Qy;
import X.C237299Sz;
import X.C245599kR;
import X.C73318Sq2;
import X.C73969T1h;
import X.T16;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopicSearchViewModel extends AssemViewModel<C236769Qy> {
    public final List<VideoTrendingTopic> LJLIL = new ArrayList();
    public String LJLILLLLZI = "";
    public final C73318Sq2 LJLJI = new C73318Sq2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C236769Qy defaultState() {
        return new C236769Qy(null, null);
    }

    public final void LLIIIL(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        this.LJLILLLLZI = keyword;
        getState();
        C245599kR c245599kR = new C245599kR(this.LJLILLLLZI);
        VideoTrendingTopicApi.LIZ.getClass();
        C237299Sz.LIZ().searchTrendingTopicList((String) c245599kR.LIZ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 78), new AfS56S0100000_4(this, 79));
    }
}
