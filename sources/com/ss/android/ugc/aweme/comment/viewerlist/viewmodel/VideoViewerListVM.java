package com.ss.android.ugc.aweme.comment.viewerlist.viewmodel;

import X.AbstractC72278SYg;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C77N;
import X.C77R;
import X.C77S;
import X.C77T;
import X.C77U;
import X.C77V;
import X.C77W;
import X.C77X;
import X.C77Y;
import X.C78999UzT;
import X.T16;
import Y.AfS0S1111000_3;
import Y.AfS52S0200000_3;
import Y.AfS55S0100000_3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.api.VideoViewerHistoryApiService;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeLoadMoreCell;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoViewerListVM extends ViewModel {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public BubbleVideoViewerViewModel LJLILLLLZI;
    public Aweme LJLJI;
    public final C77N LJLLI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C77X.LJLIL);
    public String LJLJJI = "";
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C77U.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C77V.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C77T.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C77R.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C77S.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C77W.LJLIL);

    public final String gv0() {
        String aid;
        Aweme aweme = this.LJLJI;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    public final NextLiveData<Boolean> hv0() {
        return (NextLiveData) this.LJLJL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.77N] */
    public VideoViewerListVM() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 10;
        c57939MoZ.LIZJ = LikeLoadMoreCell.class;
        this.LJLLI = new AbstractC72278SYg<PaginationCursor>(c57939MoZ) { // from class: X.77N
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC67352kd<? super A2G<PaginationCursor>> continuation) {
                o.LJIIIZ(continuation, "continuation");
                ((java.util.Set) VideoViewerListVM.this.LJLL.getValue()).clear();
                C78999UzT.LJFF(C77O.LIZ(VideoViewerHistoryApiService.LIZIZ, VideoViewerListVM.this.gv0(), 0L, 0L, C77P.PANEL_LIST.getValue()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3(VideoViewerListVM.this, (VideoViewerListVM) continuation, (InterfaceC67352kd<? super A2G<PaginationCursor>>) 2), new AfS55S0100000_3(continuation, 5)), (C73318Sq2) VideoViewerListVM.this.LJLIL.getValue());
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
                PaginationCursor params = (PaginationCursor) obj;
                o.LJIIIZ(continuation, "continuation");
                o.LJIIIZ(params, "params");
                C78999UzT.LJFF(C77O.LIZ(VideoViewerHistoryApiService.LIZIZ, VideoViewerListVM.this.gv0(), params.getCursor(), params.getOffset(), C77P.PANEL_LIST.getValue()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3(VideoViewerListVM.this, (VideoViewerListVM) continuation, (InterfaceC67352kd<? super A2G<PaginationCursor>>) 3), new AfS55S0100000_3(continuation, 6)), (C73318Sq2) VideoViewerListVM.this.LJLIL.getValue());
            }
        };
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }

    /* loaded from: classes4.dex */
    public static final class BubbleVideoViewerViewModel extends DataCenter {
        public final VideoViewerListVM LJLJL;
        public final C62822Ol8 LJLJLJ;

        public BubbleVideoViewerViewModel(VideoViewerListVM videoViewerListVM, LifecycleOwner lifecycleOwner) {
            this.LJLJL = videoViewerListVM;
            new ConcurrentHashMap();
            this.LJLJLJ = C221108m2.LIZIZ(C77Y.LJLIL);
            this.LJLJI = lifecycleOwner;
        }

        public final void lv0(String awemeId, PaginationCursor paginationCursor, int i) {
            boolean z;
            o.LJIIIZ(awemeId, "awemeId");
            o.LJIIIZ(paginationCursor, "paginationCursor");
            if (paginationCursor.getCursor() == 0 && paginationCursor.getOffset() == 0) {
                z = true;
            } else {
                z = false;
            }
            C78999UzT.LJFF(VideoViewerHistoryApiService.LIZIZ.fetchVideoViewerHistory(awemeId, paginationCursor.getCursor(), paginationCursor.getOffset(), 30, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S1111000_3(i, this, awemeId, z, 0), new AfS0S1111000_3(i, this, awemeId, z, 1)), (C73318Sq2) this.LJLJL.LJLIL.getValue());
        }
    }
}
