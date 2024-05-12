package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C236669Qo;
import X.C236679Qp;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9QU;
import X.SYL;
import X.TBT;
import Y.IDrS44S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicCell;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchResultListAssem extends UIContentAssem {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;

    public SearchResultListAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 884));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTrendingTopicSearchViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 885), C236679Qp.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoTrendingTopicListViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 886), C236669Qo.INSTANCE, null);
    }

    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        o.LJIIIIZZ(getContainerView().findViewById(R.id.kf_), "containerView.status_view");
        SYL v3 = v3();
        v3.LLLF.LJZL(VideoTrendingTopicCell.class);
        v3.LJIIJJI(new IDrS44S0100000_4(this, 7));
        v3.setItemAnimator(null);
        C8VC.LJIIJ(this, C65352Pkq.LIZ(C9QU.class), new TBT() { // from class: X.9Qr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236729Qu) obj).LIZIZ;
            }
        }, new TBT() { // from class: X.9Qq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236729Qu) obj).LIZ;
            }
        }, new AqS186S0100000_4(this, 204));
        C8YN.LJII(this, this.LJLILLLLZI.getValue(), new TBT() { // from class: X.9Qw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236769Qy) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 205), 4);
    }
}
