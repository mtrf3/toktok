package com.ss.android.ugc.aweme.ui.feed;

import X.AnonymousClass826;
import X.AnonymousClass827;
import X.AnonymousClass901;
import X.C200787uM;
import X.C200797uN;
import X.C201467vS;
import X.C209108Io;
import X.C217638gR;
import X.C221108m2;
import X.C222588oQ;
import X.C222688oa;
import X.C50420Jqa;
import X.C56682Ki;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C78996UzQ;
import X.C88Q;
import X.C92W;
import X.IT4;
import X.InterfaceC72642tA;
import X.JBR;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.feed.AdAssemblerServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.IAssemblerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseSimpleFeedViewCell extends VideoViewCell {
    public Aweme LLZZ;
    public String LLZZJLIL;
    public final C62822Ol8 LLZZLLIL;

    public C88Q LLLLIIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void LJLJJL() {
        if (this.LJLZ != null) {
            return;
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        BaseFeedPageParams mBaseFeedPageParams = feedPhotosViewHolder.LLLLZLLIL;
        o.LJIIIIZZ(mBaseFeedPageParams, "mBaseFeedPageParams");
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(feedPhotosViewHolder, 1724);
        ConcurrentHashSet assemblers = feedPhotosViewHolder.LLZLL;
        o.LJIIIIZZ(assemblers, "assemblers");
        this.LJLZ = new FeedPhotoModeAssem(mBaseFeedPageParams, aqS153S0100000_3, assemblers, feedPhotosViewHolder.LLZZZZ);
    }

    public final C88Q LLLLILI() {
        return (C88Q) this.LLZZLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final Aweme O1() {
        Aweme aweme = this.LLZZ;
        if (aweme == null) {
            return this.LJLLL;
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZJ() {
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LIZJ();
        }
        ((FeedPhotosViewHolder) this).LLLLLLLZIL(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void n() {
        super.n();
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.n();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.onDestroyView();
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        PhotoViewModelV2 LLLLLLL = feedPhotosViewHolder.LLLLLLL();
        LLLLLLL.setState(AnonymousClass826.LJLIL);
        LLLLLLL.LLD = false;
        LLLLLLL.LLF = false;
        LLLLLLL.LJLZ = false;
        LLLLLLL.setState(AnonymousClass827.LJLIL);
        LLLLLLL.qv0();
        feedPhotosViewHolder.LLLLLLLZIL(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onPause() {
        super.onPause();
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onResume() {
        super.onResume();
        fadeInWidgetContainer();
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.onResume();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSimpleFeedViewCell(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZLLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1136));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void B8(boolean z) {
        LJJIJIIJIL(2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onHolderResume, mode: ");
        LIZ.append(2);
        LIZ.append(", userVisibleHint: ");
        LIZ.append(z);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        this.LLZZ = aweme;
        if (aweme != null && aweme.isAd()) {
            AnonymousClass901 LLFII = super.LLFII(this.LLLLIL, this.LLJJJJ, this.LJLLLLLL);
            this.LLJLILLLLZIIL = LLFII;
            LLFII.S2(this.LLLLZLLIL.param);
            this.LLJLILLLLZIIL.LJJIFFI(this.LLLILZ);
            this.LLJLILLLLZIIL.s2(this.LLLILZJ);
            Fragment fragment = this.LJLLLLLL;
            if (fragment != null) {
                this.LJLLJ = VideoItemParams.newBuilder(this.LLLLZLLIL, this.LLJLILLLLZIIL, this, fragment, this.LLLIL, this.LLLILZ, this, this);
            }
        }
        super.LIZLLL(C78996UzQ.LJIILJJIL(aweme));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LJII(C56682Ki c56682Ki) {
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onTabSwitchEvent isFeedPage: ");
        if (c56682Ki != null) {
            bool = Boolean.valueOf(c56682Ki.LJLIL);
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        if (c56682Ki != null) {
            C88Q LLLLILI = LLLLILI();
            if (LLLLILI != null) {
                LLLLILI.LJII(c56682Ki);
            }
            LLLLL(c56682Ki.LJLIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        ((com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder) r5).LLLLLLLZIL(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (2 != r6) goto L17;
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(int r6) {
        /*
            r5 = this;
            super.LJJIII(r6)
            java.lang.String r1 = "BaseSimpleFeedViewCell onHolderPause, mode: "
            java.lang.String r0 = ", userVisibleHint: "
            java.lang.StringBuilder r1 = X.C7MY.LJ(r1, r6, r0)
            androidx.fragment.app.Fragment r0 = r5.LJLLLLLL
            boolean r0 = r0.getUserVisibleHint()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C201467vS.LJIIJ(r0)
            X.88Q r0 = r5.LLLLILI()
            if (r0 == 0) goto L24
            r0.LIZLLL()
        L24:
            r3 = 0
            r0 = 2
            if (r0 != r6) goto L87
            X.1qj r1 = r5.getActivity()
            if (r1 == 0) goto L85
            java.lang.String r0 = "page_profile"
            boolean r4 = X.KNV.LJFF(r1, r0)
        L34:
            java.lang.String r1 = r5.LLZZJLIL
            X.1qj r0 = r5.getActivity()
            if (r0 == 0) goto L83
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C116694i1.LIZ(r0)
            java.lang.String r0 = r0.nv0()
        L44:
            boolean r2 = kotlin.jvm.internal.o.LJ(r1, r0)
            java.lang.String r1 = "BaseSimpleFeedViewCell isVisibleForUser, isProfilePage: "
            java.lang.String r0 = ", fromBottomTabName: "
            java.lang.StringBuilder r1 = X.JBR.LJI(r1, r4, r0)
            java.lang.String r0 = r5.LLZZJLIL
            r1.append(r0)
            java.lang.String r0 = ", isCurrentBottomTab: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C201467vS.LJIIJ(r0)
            androidx.fragment.app.Fragment r0 = r5.LJLLLLLL
            boolean r0 = r0.getUserVisibleHint()
            if (r0 == 0) goto L76
            if (r4 != 0) goto L76
            if (r2 == 0) goto L76
        L70:
            r0 = r5
            com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder r0 = (com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder) r0
            r0.LLLLLLLZIL(r3)
        L76:
            r0 = r5
            com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder r0 = (com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder) r0
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r1 = r0.LLLLLLL()
            X.7uN r0 = X.C200797uN.LJLIL
            r1.setState(r0)
            return
        L83:
            r0 = 0
            goto L44
        L85:
            r4 = 0
            goto L34
        L87:
            if (r0 == r6) goto L76
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.BaseSimpleFeedViewCell.LJJIII(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onHolderResume, mode: ");
        LIZ.append(i);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LJ();
        }
        ((FeedPhotosViewHolder) this).LLLLLLLZIL(true);
    }

    public void LLLLL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onPageChanged isFeedPage: ");
        LIZ.append(z);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void Z6(C209108Io event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onTabChangeEvent: ");
        LIZ.append(event.LJLIL);
        LIZ.append(" -> ");
        LIZ.append(event.LJLILLLLZI);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.Z6(event);
        }
        if (o.LJ(event.LJLILLLLZI, "HOME")) {
            LLLLIL(true, event);
        } else {
            LLLLIL(false, event);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        if ((!r4.getBoolean(X.X1D.LIZIZ(r3), false)) != false) goto L57;
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l8(int r13) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.BaseSimpleFeedViewCell.l8(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        String str2;
        VideoUrlModel playAddr;
        super.onPausePlay(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onPausePlay ");
        LIZ.append(str);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LJJJJZI();
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        String str3 = null;
        if (str != null) {
            Aweme aweme = feedPhotosViewHolder.LJLLL;
            if (aweme != null && !o.LJ(str, aweme.getAid())) {
                Video video = feedPhotosViewHolder.LJLLL.getVideo();
                if (video != null && (playAddr = video.getPlayAddr()) != null) {
                    str2 = playAddr.getSourceId();
                } else {
                    str2 = null;
                }
                if (!o.LJ(str, str2)) {
                    return;
                }
            }
            if (!o.LJ(feedPhotosViewHolder.O1(), feedPhotosViewHolder.LJLLL)) {
                Aweme O1 = feedPhotosViewHolder.O1();
                if (O1 != null) {
                    str3 = O1.getAid();
                }
                if (!o.LJ(str3, str)) {
                    return;
                }
            }
        }
        feedPhotosViewHolder.LLLLLLL().setState(C200797uN.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onPlaying ");
        LIZ.append(str);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        super.onRenderFirstFrame(it4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell photomode onRenderFirstFrame sourceId：");
        LIZ.append(it4.getId());
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LIZ();
        }
        ((FeedPhotosViewHolder) this).LLLLLLL().setState(C200787uM.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        super.onResumePlay(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onResumePlay ");
        LIZ.append(str);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LJJJJJL();
        }
        ((FeedPhotosViewHolder) this).LLLLLLL().setState(C200787uM.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LJJIIZ();
        }
        FeedPhotosViewHolder feedPhotosViewHolder = (FeedPhotosViewHolder) this;
        feedPhotosViewHolder.LLLLLLLZIL(false);
        PhotoViewModelV2 LLLLLLL = feedPhotosViewHolder.LLLLLLL();
        LLLLLLL.setState(AnonymousClass826.LJLIL);
        LLLLLLL.LLD = false;
        LLLLLLL.LLF = false;
        LLLLLLL.LJLZ = false;
        LLLLLLL.setState(AnonymousClass827.LJLIL);
        LLLLLLL.qv0();
    }

    public void LLLLIL(boolean z, C209108Io event) {
        o.LJIIIZ(event, "event");
        StringBuilder LJI = JBR.LJI("BaseSimpleFeedViewCell isHomeTab: ", z, ", onTabChangeEvent: ");
        LJI.append(event.LJLIL);
        LJI.append(" -> ");
        LJI.append(event.LJLILLLLZI);
        C201467vS.LJIIJ(X1D.LIZIZ(LJI));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseSimpleFeedViewCell onRenderFirstFrame ");
        LIZ.append(str);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        C88Q LLLLILI = LLLLILI();
        if (LLLLILI != null) {
            LLLLILI.LJFF();
        }
        ((FeedPhotosViewHolder) this).LLLLLLL().setState(C200787uM.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final AnonymousClass901 LLFII(View view, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment) {
        IAssemblerService iAssemblerService;
        C217638gR c217638gR;
        Object LIZ = C58096Mr6.LIZ(IAssemblerService.class, false);
        if (LIZ != null) {
            iAssemblerService = (IAssemblerService) LIZ;
        } else {
            if (C58096Mr6.LLLLILI == null) {
                synchronized (IAssemblerService.class) {
                    if (C58096Mr6.LLLLILI == null) {
                        C58096Mr6.LLLLILI = new AdAssemblerServiceImpl();
                    }
                }
            }
            iAssemblerService = C58096Mr6.LLLLILI;
        }
        if (iAssemblerService != null) {
            c217638gR = iAssemblerService.LIZ();
        } else {
            c217638gR = null;
        }
        LJLIIL(c217638gR);
        return new C92W();
    }
}
