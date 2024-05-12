package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.C188727au;
import X.C221108m2;
import X.C237299Sz;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.C9R4;
import X.C9R5;
import X.FMX;
import X.T16;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.BillboardInfo;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.VideoTrendingTopicApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopicListViewModel extends AssemViewModel<C9R4> {
    public VideoTrendingTopic LJLJLJ;
    public final List<BillboardInfo> LJLIL = new ArrayList();
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LIZLLL(this, C9R5.class, "key"), true);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 883));
    public boolean LJLJJI = true;
    public String LJLJJL = "";
    public String LJLJJLL = "Popular";
    public String LJLJL = "Recent";
    public final C73318Sq2 LJLJLLL = new C73318Sq2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C9R4 defaultState() {
        return new C9R4(null, null, null);
    }

    public final C9R5 gv0() {
        C9R5 c9r5 = (C9R5) this.LJLILLLLZI.getValue();
        if (c9r5 == null) {
            return new C9R5(null, null, null, null, 15, null);
        }
        return c9r5;
    }

    public final int hv0() {
        Integer num;
        List<VideoTrendingTopic> list;
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        int i = 0;
        while (it.hasNext()) {
            BillboardInfo billboardInfo = (BillboardInfo) it.next();
            if (billboardInfo != null && (num = billboardInfo.type) != null && num.equals(Integer.valueOf(iv0())) && (list = billboardInfo.topics) != null) {
                for (VideoTrendingTopic videoTrendingTopic : list) {
                    if (o.LJ(videoTrendingTopic, this.LJLJLJ)) {
                        i = billboardInfo.topics.indexOf(videoTrendingTopic);
                    }
                }
            }
        }
        if (i < 5) {
            return 0;
        }
        return i;
    }

    public final int iv0() {
        if (o.LJ(this.LJLJJL, this.LJLJJLL)) {
            return 1;
        }
        if (o.LJ(this.LJLJJL, this.LJLJL)) {
            return 2;
        }
        return 0;
    }

    public final void jv0(VideoTrendingTopic videoTrendingTopic, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_post_page");
        c188727au.LJIIIZ("enter_method", "trends_selection_panel");
        c188727au.LJ(videoTrendingTopic.getEventId(), "selected_trends");
        c188727au.LJIIIZ("creation_id", gv0().getCreationId());
        c188727au.LJIIIZ("content_type", gv0().getContentType());
        c188727au.LJIIIZ("recall_source", "");
        c188727au.LJIIIZ("choose_type", str);
        FMX.LJIIL("choose_trends_event", c188727au.LIZ);
    }

    public final void kv0(String str, boolean z) {
        if (str != null) {
            this.LJLJJL = str;
        }
        if (this.LJLJJI) {
            this.LJLJLJ = (VideoTrendingTopic) this.LJLJI.getValue();
            this.LJLJJI = false;
        }
        if (!z) {
            setState(new AqS170S0100000_4(this, 798));
            return;
        }
        ((ArrayList) this.LJLIL).clear();
        this.LJLJJL = this.LJLJJLL;
        VideoTrendingTopicApi.LIZ.getClass();
        C78999UzT.LJFF(C237299Sz.LIZ().getTrendingTopicList("[]").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 65), new AfS56S0100000_4(this, 66)), this.LJLJLLL);
    }
}
