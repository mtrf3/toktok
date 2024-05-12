package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.C0A6;
import X.C213688a4;
import X.C214298b3;
import X.C2318297y;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.SYL;
import X.TBT;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicCell;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.ui.VideoTrendingTopicListAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopicListAssem extends UIContentAssem {
    public SYL LJLIL;
    public final C214298b3 LJLILLLLZI;

    public VideoTrendingTopicListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTrendingTopicListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 891), C2318297y.INSTANCE, null);
    }

    public final VideoTrendingTopicListViewModel v3() {
        return (VideoTrendingTopicListViewModel) this.LJLILLLLZI.getValue();
    }

    public final void x3() {
        getContainerView().findViewById(R.id.li_).setVisibility(0);
        getContainerView().findViewById(R.id.li9).animate().setInterpolator(new LinearInterpolator()).setDuration(250L).translationY(0.0f);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        o.LJIIIIZZ(getContainerView().findViewById(R.id.kf_), "containerView.status_view");
        VideoTrendingTopicListViewModel v3 = v3();
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.skb);
        } else {
            str = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(R.string.skc);
        } else {
            str2 = null;
        }
        if (str != null) {
            v3.LJLJJLL = str;
        }
        if (str2 != null) {
            v3.LJLJL = str2;
        } else {
            v3.getClass();
        }
        SYL syl = (SYL) getContainerView().findViewById(R.id.li2);
        o.LJIIIIZZ(syl, "containerView.topic_list");
        this.LJLIL = syl;
        syl.LLLF.LJZL(VideoTrendingTopicCell.class);
        syl.setItemAnimator(null);
        syl.LJIIJJI(new C0A6() { // from class: X.9QS
            public int LJLIL;
            public boolean LJLILLLLZI;

            {
                SYL syl2 = VideoTrendingTopicListAssem.this.LJLIL;
                if (syl2 != null) {
                    C0A2 layoutManager = syl2.getLayoutManager();
                    o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    this.LJLIL = ((LinearLayoutManager) layoutManager).LLILL();
                    this.LJLILLLLZI = true;
                    return;
                }
                o.LJIJI("topicList");
                throw null;
            }

            @Override // X.C0A6
            public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
                o.LJIIIZ(recyclerView, "recyclerView");
                C9QU c9qu = (C9QU) C8VC.LJFF(VideoTrendingTopicListAssem.this, C65352Pkq.LIZ(C9QU.class), null);
                if (c9qu != null) {
                    c9qu.LJIJI();
                }
                SYL syl2 = VideoTrendingTopicListAssem.this.LJLIL;
                if (syl2 != null) {
                    C0A2 layoutManager = syl2.getLayoutManager();
                    o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    this.LJLIL = ((LinearLayoutManager) layoutManager).LLILL();
                    if (recyclerView.getScrollState() != 1) {
                        return;
                    }
                    if (this.LJLIL == 0) {
                        if (!this.LJLILLLLZI) {
                            VideoTrendingTopicListAssem.this.x3();
                            this.LJLILLLLZI = true;
                            return;
                        }
                        return;
                    }
                    if (this.LJLILLLLZI) {
                        if (i2 <= 0 || i2 >= 70) {
                            return;
                        }
                        VideoTrendingTopicListAssem videoTrendingTopicListAssem = VideoTrendingTopicListAssem.this;
                        videoTrendingTopicListAssem.getContainerView().findViewById(R.id.li9).animate().setInterpolator(new LinearInterpolator()).setDuration(250L).translationY(-videoTrendingTopicListAssem.getContainerView().findViewById(R.id.li9).getHeight());
                        videoTrendingTopicListAssem.getContainerView().findViewById(R.id.li_).postDelayed(new ARunnableS40S0100000_4(videoTrendingTopicListAssem, 104), 250L);
                        this.LJLILLLLZI = false;
                        return;
                    }
                    if (i2 >= 0 || i2 <= -70) {
                        return;
                    }
                    VideoTrendingTopicListAssem.this.x3();
                    this.LJLILLLLZI = true;
                    return;
                }
                o.LJIJI("topicList");
                throw null;
            }
        });
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9QT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9R4) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 209), 4);
        v3().kv0(null, true);
    }
}
