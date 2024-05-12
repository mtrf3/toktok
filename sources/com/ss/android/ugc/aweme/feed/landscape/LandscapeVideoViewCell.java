package com.ss.android.ugc.aweme.feed.landscape;

import X.ActivityC45651qj;
import X.AnonymousClass799;
import X.AnonymousClass901;
import X.C05040Hs;
import X.C09K;
import X.C107794Kx;
import X.C165726eu;
import X.C16880lQ;
import X.C174086sO;
import X.C174366sq;
import X.C187227Wk;
import X.C207668Da;
import X.C208088Eq;
import X.C209108Io;
import X.C209418Jt;
import X.C218158hH;
import X.C221108m2;
import X.C222368o4;
import X.C222448oC;
import X.C222508oI;
import X.C222588oQ;
import X.C222608oS;
import X.C222688oa;
import X.C223778qL;
import X.C2300291a;
import X.C2300591d;
import X.C2300791f;
import X.C2300891g;
import X.C2301091i;
import X.C2313195z;
import X.C232629Ba;
import X.C245639kV;
import X.C26338AVi;
import X.C2MX;
import X.C2U8;
import X.C32151Nz;
import X.C36922EeM;
import X.C38354F3m;
import X.C3A5;
import X.C40438Fty;
import X.C40443Fu3;
import X.C45804HyK;
import X.C4LD;
import X.C50420Jqa;
import X.C56448MDk;
import X.C59222Uc;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C75012wz;
import X.C78939UyV;
import X.C79004UzY;
import X.C79N;
import X.C7G9;
import X.C7MY;
import X.C85C;
import X.C88293dJ;
import X.C8K4;
import X.C8L4;
import X.C8NX;
import X.C8O4;
import X.C8VV;
import X.C8YC;
import X.C90U;
import X.C90V;
import X.C92D;
import X.C94D;
import X.C94E;
import X.C9BZ;
import X.FN7;
import X.HG3;
import X.IPH;
import X.IT4;
import X.IWF;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC223918qZ;
import X.InterfaceC2302191t;
import X.InterfaceC46330IGg;
import X.InterfaceC47247IgV;
import X.InterfaceC54035LIp;
import X.InterfaceC57312Mt;
import X.InterfaceC60152Xr;
import X.InterfaceC72642tA;
import X.InterfaceC74236TBo;
import X.InterfaceC86436Xw8;
import X.J8V;
import X.KL0;
import X.LFH;
import X.O6R;
import X.OSZ;
import X.RBX;
import X.RunnableC37185Eib;
import X.TBR;
import X.W5F;
import X.W5U;
import X.X1D;
import X.Y1Q;
import Y.ARunnableS10S0110000_4;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.LandscapeCellAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class LandscapeVideoViewCell extends VideoBaseCell implements C85C, C7G9, ETParamsProvider<C75012wz> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJL;
    public RelativeLayout LJZL;
    public InterfaceC222698ob LL;
    public View LLD;
    public ViewGroup LLF;
    public View LLFF;
    public View LLFFF;
    public FrameLayout LLFII;
    public C94E LLFZ;
    public LinearLayout LLI;
    public FrameLayout LLIFFJFJJ;
    public C59222Uc LLII;
    public LongPressLayout LLIIII;
    public FrameLayout LLIIIILZ;
    public Context LLIIIJ;
    public InterfaceC72642tA<C50420Jqa> LLIIIL;
    public boolean LLIIIZ;
    public final C2300591d LLIIJI;
    public boolean LLIIJLIL;
    public View.OnTouchListener LLIIL;
    public final C245639kV LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public DataCenter LLIL;
    public View LLILII;
    public VideoViewModel LLILIL;
    public VideoPlayViewModel LLILL;
    public C94D LLILLIZIL;
    public C56448MDk LLILLJJLI;
    public ViewGroup LLILLL;
    public ViewGroup LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public ImageView LLJI;
    public ImageView LLJIJIL;
    public SmartImageView LLJILJIL;
    public C2313195z LLJILJILJ;
    public final Handler LLJILLL;
    public final ConcurrentHashSet LLJJ;
    public LandscapeCellAssem LLJJI;
    public C2301091i LLJJIII;
    public InterfaceC2302191t LLJJIJI;
    public WidgetManager LLJJIJIIJIL;
    public BaseFeedPageParams LLJJIJIL;
    public final double LLJJJ;
    public final Set<View> LLJJJIL;
    public float LLJJJJ;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        TBR tbr = new TBR(LandscapeVideoViewCell.class, "vm", "<v#0>", 0);
        C65352Pkq.LIZ.getClass();
        LLJJL = new InterfaceC74236TBo[]{tbr};
    }

    @Override // X.C2MA
    public final void A7(String labelInfo, String awemeId) {
        o.LJIIIZ(labelInfo, "labelInfo");
        o.LJIIIZ(awemeId, "awemeId");
    }

    @Override // X.C2MA
    public final void B7() {
    }

    @Override // X.InterfaceC222708oc
    public final void F5() {
    }

    @Override // X.InterfaceC222708oc
    public final void G60(int i) {
    }

    @Override // X.C2MA
    public final void H8() {
    }

    @Override // X.C2MA, X.InterfaceC54061LJp
    public final InterfaceC57312Mt LJIIIIZZ() {
        return this;
    }

    @Override // X.C7G9
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJIJ() {
    }

    @Override // X.C85C
    public final void LJIJJLI(boolean z, boolean z2) {
    }

    @Override // X.C85C
    public final void LJIL(boolean z) {
    }

    @Override // X.C7GA
    public final void LJJI() {
    }

    @Override // X.C85C
    public final float LJJII(TuxTextLayoutView tuxTextLayoutView) {
        return 0.0f;
    }

    @Override // X.C2MA
    public void LJJIII(int i) {
    }

    @Override // X.C85C
    public final void LJJIIZI(int i, int i2) {
    }

    @Override // X.C2MA
    public final void LJJIJIIJIL(int i) {
    }

    @Override // X.C85C
    public final int LJJIJIL(TuxTextLayoutView tuxTextLayoutView) {
        return 0;
    }

    @Override // X.C85C
    public final void LJJIZ(boolean z) {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJJIL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC47667InH
    public final void LJJJJ(int i, int i2) {
    }

    @Override // X.C85C
    public final void LJJJJI() {
    }

    @Override // X.C85C
    public final void LJJJJL() {
    }

    @Override // X.InterfaceC222408o8
    public final void LJJJJLL() {
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJJLL(Aweme aweme) {
    }

    @Override // X.C85C
    public final void LJJJLZIJ() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public int LJLJJLL() {
        return 28;
    }

    @Override // X.C2MA
    public final InterfaceC222708oc LLLJ() {
        return this;
    }

    @Override // X.InterfaceC55219Lln
    public final void MJ() {
    }

    @Override // X.C2MA
    public final void P7(C9BZ event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.C2MA
    public final void Q7(String enterMethodValue) {
        o.LJIIIZ(enterMethodValue, "enterMethodValue");
    }

    @Override // X.C2MA
    public final void T7(C187227Wk c187227Wk) {
    }

    @Override // X.C2MA
    public final void U7(C232629Ba event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC222708oc
    public final int UU() {
        return 1;
    }

    @Override // X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
    }

    @Override // X.C2MA
    public final void c2(long j) {
    }

    @Override // X.C2MA
    public final void c7() {
    }

    @Override // X.C2MA
    public final void c9(boolean z) {
    }

    @Override // X.C2MA
    public final void d8() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2L4
    public List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.C2MA
    public final void h7(int i, long j) {
    }

    @Override // X.C2MA
    public final AnonymousClass901 j3() {
        return null;
    }

    @Override // X.C2MA
    public final void j5(C107794Kx shareCompleteEvent) {
        o.LJIIIZ(shareCompleteEvent, "shareCompleteEvent");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void k7(View view) {
    }

    @Override // X.InterfaceC55219Lln
    public final void l6(int i, boolean z) {
    }

    @Override // X.InterfaceC222708oc
    public final void n() {
    }

    @Override // X.InterfaceC57312Mt
    public final void o2() {
    }

    @Override // X.C2MA
    public final void onPageSelected(int i) {
    }

    @Override // X.C2MA
    public final void t8() {
    }

    @Override // X.C2MA
    public final void u8(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC55219Lln
    public final void yy(View.OnTouchListener onTouchListener) {
    }

    @Override // X.InterfaceC222708oc
    public final ViewGroup Dp() {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob == null) {
            return null;
        }
        return interfaceC222698ob.Dp();
    }

    @Override // X.InterfaceC57312Mt
    public final void J3() {
        AbsInteractStickerWidget absInteractStickerWidget = this.LLIILII.LJIILIIL;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC47667InH
    public final void LIZ() {
        if (!this.LLIIJLIL) {
            return;
        }
        this.LLIIJLIL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final void LJIILIIL() {
        DataCenter dataCenter = this.LLIL;
        if (dataCenter != null) {
            dataCenter.jv0(null, "video_hide_share_stay_home_animation");
            VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
            if (LIZJ != null) {
                LIZJ.qv0();
                return;
            }
            return;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final void LJJJI() {
        DataCenter dataCenter = this.LLIL;
        if (dataCenter != null) {
            dataCenter.jv0(null, "video_show_share_guide_animation");
            VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
            if (LIZJ != null) {
                LIZJ.yv0();
                return;
            }
            return;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final void LJJJJJL() {
        DataCenter dataCenter = this.LLIL;
        if (dataCenter != null) {
            dataCenter.jv0(null, "video_show_share_stay_home_animation");
            VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
            if (LIZJ != null) {
                LIZJ.zv0();
                return;
            }
            return;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final ReusedUIAssem LJLJI() {
        LandscapeCellAssem landscapeCellAssem = this.LLJJI;
        if (landscapeCellAssem != null) {
            return landscapeCellAssem;
        }
        BaseFeedPageParams baseFeedPageParams = this.LJLLILLLL.LJ;
        this.LLJJIJIL = baseFeedPageParams;
        if (baseFeedPageParams != null) {
            C8L4 c8l4 = C8L4.LJLIL;
            int LJLJJLL = LJLJJLL();
            ConcurrentHashSet concurrentHashSet = this.LLJJ;
            C8O4 c8o4 = new C8O4();
            c8o4.LIZ = LJLJJLL();
            c8o4.LIZIZ = "cell_landscape";
            C222588oQ c222588oQ = this.LJLLILLLL;
            c8o4.LIZLLL = c222588oQ;
            c8o4.LJ = c222588oQ.LJ;
            o.LJIIIZ(c8l4, "<set-?>");
            c8o4.LJI = c8l4;
            C8VV.LJ(this, new AqS134S0200000_3((AssemReusedContainer) this, (AssemReusedContainer<VideoBaseCell, VideoItemParams>) new C8NX(c8o4), (C8NX) 225));
            LandscapeCellAssem landscapeCellAssem2 = new LandscapeCellAssem(baseFeedPageParams, c8l4, LJLJJLL, concurrentHashSet);
            this.LLJJI = landscapeCellAssem2;
            return landscapeCellAssem2;
        }
        o.LJIJI("baseFeedPageParams");
        throw null;
    }

    public final void LJLLJ() {
        BaseFeedPageParams baseFeedPageParams = this.LLJJIJIL;
        String str = null;
        if (baseFeedPageParams != null) {
            if (baseFeedPageParams.isPlayListCleanMode()) {
                return;
            }
            InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
            this.LLIILII.LJIIJJI(this.LJLLL);
            C245639kV c245639kV = this.LLIILII;
            c245639kV.LJFF = LJJLIIIIJ;
            c245639kV.LIZJ();
            C245639kV c245639kV2 = this.LLIILII;
            Aweme aweme = this.LJLLL;
            if (aweme != null) {
                str = aweme.getAid();
            }
            c245639kV2.LJIIIIZZ(str);
            return;
        }
        o.LJIJI("baseFeedPageParams");
        throw null;
    }

    public final boolean LJLLLLLL() {
        if (this.LLIIZ || C2MX.LIZ().LIZIZ) {
            return true;
        }
        return false;
    }

    public final void LL() {
        this.LLJILLL.removeCallbacksAndMessages(null);
        this.LLJILLL.postDelayed(new ARunnableS40S0100000_4(this, 14), 3000L);
    }

    public final void LLD() {
        this.LLJILLL.removeCallbacksAndMessages(null);
        for (View view : this.LLJJJIL) {
            if (view != null) {
                view.setVisibility(0);
                view.setAlpha(0.99f);
            }
        }
        this.LLIIIZ = false;
    }

    @Override // X.InterfaceC55219Lln
    public final DataCenter LLI() {
        DataCenter dataCenter = this.LLIL;
        if (dataCenter != null) {
            return dataCenter;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // X.InterfaceC222708oc
    public final boolean d4() {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob == null || !interfaceC222698ob.d4()) {
            return false;
        }
        return true;
    }

    @Override // X.C2MA
    public final int getAwemeType() {
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 0;
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC54035LIp getParam() {
        if (d2(C75012wz.class)) {
            return t();
        }
        return null;
    }

    @Override // X.InterfaceC222708oc
    public final Surface getSurface() {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob == null) {
            interfaceC222698ob = LJLLLL(this.LJLLILLLL);
        }
        if (this.LL == null) {
            this.LL = interfaceC222698ob;
        }
        return interfaceC222698ob.getSurface();
    }

    @Override // X.InterfaceC222708oc
    public final View getVideoView() {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            return interfaceC222698ob.getVideoView();
        }
        return null;
    }

    @Override // X.C2MA
    public void onDestroyView() {
        AbsInteractStickerWidget absInteractStickerWidget = this.LLIILII.LJIILIIL;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.onDestroyView();
        }
    }

    @Override // X.C2MA
    public final void onResume() {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.O(true);
        }
    }

    @Override // X.C2MA
    public final void w1() {
        SmartImageView smartImageView = this.LLJILJIL;
        if (smartImageView == null) {
            return;
        }
        smartImageView.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final boolean LJIJI() {
        VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
        if (LIZJ != null) {
            return LIZJ.LJLLILLLL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final OSZ<Boolean, String> LJJIIJZLJL() {
        VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
        if (LIZJ != null) {
            Aweme aweme = this.LJLLL;
            OSZ<Boolean, String> osz = LIZJ.LJLLJ;
            if (osz == null) {
                return C4LD.LIZIZ.LJFF(aweme);
            }
            return osz;
        }
        return null;
    }

    @Override // X.InterfaceC57312Mt
    public final void LJJJJIZL() {
        VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
        if (LIZJ == null) {
            return;
        }
        LIZJ.LJLLILLLL = false;
    }

    public final boolean LJLZ() {
        return IWF.LJJLIIIIJ().isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    /* renamed from: LJZ, reason: merged with bridge method [inline-methods] */
    public final C75012wz t() {
        String str;
        String str2;
        Video video;
        String aid;
        String curUid = ((RBX) HG3.LJIILL()).getCurUserId();
        Aweme aweme = this.LJLLL;
        String str3 = "";
        if (aweme == null || (str = aweme.getAuthorUid()) == null) {
            str = "";
        }
        boolean LIZJ = C38354F3m.LIZJ(curUid, str);
        Aweme aweme2 = this.LJLLL;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str3 = aid;
        }
        o.LJIIIIZZ(curUid, "curUid");
        String str4 = this.LJLLILLLL.LJIIIZ;
        Aweme aweme3 = this.LJLLL;
        if (aweme3 == null || (video = aweme3.getVideo()) == null || (str2 = Integer.valueOf(video.getDuration()).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        return new C75012wz(LIZJ ? 1 : 0, C79004UzY.LJJJIL(this.LLIIIJ, this.LJLLL), str3, curUid, str, str4, str2, TranslationServiceImpl.LJJIJ().LJJIIZI());
    }

    @Override // X.InterfaceC223648q8
    public final long LJZL() {
        return IWF.LJJLIIIIJ().getCurrentPosition();
    }

    @Override // X.C92U
    public final AbsInteractStickerWidget h0() {
        InteractStickerWidget LIZ = StickerServiceImpl.LIZIZ().LIZ();
        LIZ.getClass();
        LIZ.LJLLI = this;
        WidgetManager widgetManager = this.LLJJIJIIJIL;
        if (widgetManager != null) {
            widgetManager.Al(R.id.eq0, LIZ);
            return LIZ;
        }
        o.LJIJI("widgetManagerWithOutDataCenter");
        throw null;
    }

    @Override // X.C2MA
    public final void onPause() {
        J3();
        DataCenter dataCenter = this.LLIL;
        if (dataCenter != null) {
            dataCenter.jv0(null, "video_on_pause");
            InterfaceC222698ob interfaceC222698ob = this.LL;
            if (interfaceC222698ob != null) {
                interfaceC222698ob.onPagePause();
                return;
            }
            return;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final ImageView s7() {
        if (C208088Eq.LIZLLL()) {
            return null;
        }
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean Y8() {
        return this.LLIIIZ;
    }

    @Override // X.InterfaceC55219Lln
    public final double a6() {
        return this.LLJJJ;
    }

    @Override // X.C2MA
    public final Aweme getAweme() {
        return this.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final View getRootView() {
        return this.LLIFFJFJJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeVideoViewCell(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLIIJI = new C2300591d();
        this.LLIILII = new C245639kV(this);
        this.LLJILLL = new Handler(C16880lQ.LLJJJJ());
        this.LLJJ = new ConcurrentHashSet();
        C221108m2.LIZIZ(new AqS154S0100000_4(this, 336));
        this.LLJJJ = -1.0d;
        this.LLJJJIL = new LinkedHashSet();
        View view = params.LIZ;
        this.LLILII = view;
        if (view != null) {
            this.LLIIIILZ = (FrameLayout) view.findViewById(R.id.player_view);
            View view2 = this.LLILII;
            if (view2 != null) {
                view2.findViewById(R.id.hqv);
                View view3 = this.LLILII;
                if (view3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view3.findViewById(R.id.niu);
                    if (relativeLayout != null) {
                        relativeLayout.setAlpha(0.99f);
                    } else {
                        relativeLayout = null;
                    }
                    this.LJZL = relativeLayout;
                    View view4 = this.LLILII;
                    if (view4 != null) {
                        this.LLIIII = (LongPressLayout) view4.findViewById(R.id.long_press_layout);
                        this.LLILL = C222448oC.LIZ(this);
                        this.LLILIL = C8YC.LIZ(this);
                        InterfaceC222698ob LJLLLL = LJLLLL(params);
                        this.LL = LJLLLL;
                        LJLLLL.N7(this);
                        Fragment fragment = params.LIZJ;
                        this.LJLLLLLL = fragment;
                        if (fragment != null) {
                            this.LLIL = DataCenter.gv0(C165726eu.LIZ(fragment, this), fragment);
                        }
                        this.LLIIIL = params.LIZIZ;
                        BaseFeedPageParams baseFeedPageParams = params.LJ;
                        this.LLJJIJIL = baseFeedPageParams;
                        if (baseFeedPageParams != null) {
                            Fragment fragment2 = this.LJLLLLLL;
                            DataCenter dataCenter = this.LLIL;
                            if (dataCenter != null) {
                                if (fragment2 != null) {
                                    this.LJLLJ = VideoItemParams.newBuilder(baseFeedPageParams, null, this, fragment2, "click", dataCenter, this, this);
                                }
                                FN7.LIZIZ(new ARunnableS23S0200000_4(this, params, 10));
                                this.LLJJJJ = 1.0f;
                                return;
                            }
                            o.LJIJI("dataCenter");
                            throw null;
                        }
                        o.LJIJI("baseFeedPageParams");
                        throw null;
                    }
                    o.LJIJI("view");
                    throw null;
                }
                o.LJIJI("view");
                throw null;
            }
            o.LJIJI("view");
            throw null;
        }
        o.LJIJI("view");
        throw null;
    }

    public static void LLFFF(View view) {
        if (C208088Eq.LIZ()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void L5(String sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        w1();
    }

    @Override // X.C85C
    public final void LJIIZILJ(boolean z) {
        int i;
        int i2;
        View childAt;
        View view = this.LLD;
        int i3 = 8;
        if (view != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
        View view2 = this.LLFFF;
        if (view2 != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        ViewGroup viewGroup = this.LLF;
        if (viewGroup != null && viewGroup.getChildCount() > 0 && (childAt = viewGroup.getChildAt(0)) != null) {
            if (z) {
                i3 = 0;
            }
            childAt.setVisibility(i3);
        }
        LL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC57312Mt
    public final void LJJIJL(OSZ<Boolean, String> osz) {
        VideoShareViewModel LIZJ = C88293dJ.LIZJ(this);
        if (LIZJ != null) {
            LIZJ.LJLLJ = osz;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void LJLIIL(C8K4 c8k4) {
        this.LLJJ.add(c8k4);
    }

    public final void LJLLI(boolean z) {
        int i;
        if (z) {
            i = 32;
        } else {
            i = 98;
        }
        int LIZIZ = C7MY.LIZIZ(i);
        FrameLayout frameLayout = this.LLIFFJFJJ;
        if (frameLayout != null) {
            this.LLIILII.LJI(LIZIZ, frameLayout.getHeight());
        }
        FrameLayout frameLayout2 = this.LLFII;
        if (frameLayout2 != null) {
            C26338AVi.LJI(frameLayout2, 0, 0, 0, Integer.valueOf(LIZIZ), false, 16);
        }
    }

    public final InterfaceC222698ob LJLLLL(C222588oQ params) {
        o.LJIIIZ(params, "params");
        ViewGroup viewGroup = this.LLIIIILZ;
        if (viewGroup == null) {
            View findViewById = params.LIZ.findViewById(R.id.player_view);
            o.LJIIIIZZ(findViewById, "params.view.findViewById(R.id.player_view)");
            viewGroup = (ViewGroup) findViewById;
        }
        return C222608oS.LIZ(viewGroup, this, params);
    }

    public final void LLIFFJFJJ(Aweme aweme) {
        this.LJLLL = aweme;
        C2301091i c2301091i = this.LLJJIII;
        if (c2301091i != null) {
            c2301091i.LLZL(aweme);
        }
        VideoItemParams videoItemParams = this.LJLLJ;
        if (videoItemParams != null) {
            videoItemParams.setAweme(aweme);
        }
        if (this.LLJJJJLIIL) {
            C2300291a.LIZ.LIZ(new RunnableC37185Eib(new ARunnableS23S0200000_4(this, aweme, 11)));
        } else {
            VideoItemParams videoItemParams2 = this.LJLLJ;
            if (videoItemParams2 != null) {
                videoItemParams2.setwidgetAweme(aweme);
            }
        }
        int i = J8V.LJLJJI;
        if (C40438Fty.LIZLLL && i == C40438Fty.LIZIZ) {
            C40443Fu3.LIZ("video_play").LIZ("next_video", C40438Fty.LIZ(aweme));
        }
    }

    @Override // X.InterfaceC55219Lln
    public final void Yc0(C92D c92d) {
        LongPressLayout longPressLayout = this.LLIIII;
        if (longPressLayout != null) {
            longPressLayout.setListener(c92d);
        }
    }

    @Override // X.C2MA
    public final void Z1(boolean z) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withStartAction;
        if (z && LJLLLLLL()) {
            return;
        }
        LJLLI(z);
        if (z) {
            if (!this.LLIIIZ) {
                for (View view : this.LLJJJIL) {
                    if (view != null && (!o.LJ(view, this.LLILLIZIL) || !this.LLIILZL)) {
                        C09K.LIZ(view, 0.0f, 200L).withEndAction(new ARunnableS40S0100000_4(view, 54)).start();
                    }
                }
                RelativeLayout relativeLayout = this.LJZL;
                if (relativeLayout != null) {
                    relativeLayout.postDelayed(new ARunnableS40S0100000_4(this, 55), 200L);
                }
                this.LLIIIZ = true;
                return;
            }
            return;
        }
        if (this.LLIIIZ) {
            RelativeLayout relativeLayout2 = this.LJZL;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            for (View view2 : this.LLJJJIL) {
                if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.99f)) != null && (duration = alpha.setDuration(200L)) != null && (withStartAction = duration.withStartAction(new ARunnableS40S0100000_4(view2, 56))) != null) {
                    withStartAction.start();
                }
            }
            this.LLIIIZ = false;
            LL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void Z6(C209108Io event) {
        o.LJIIIZ(event, "event");
        VideoItemParams videoItemParams = this.LJLLJ;
        if (videoItemParams != null) {
            videoItemParams.setFromTab(event.LJLIL);
            videoItemParams.setToTab(event.LJLILLLLZI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    @Override // X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b2(boolean r6) {
        /*
            r5 = this;
            r5.LLIILZL = r6
            android.widget.RelativeLayout r4 = r5.LJZL
            r2 = 0
            r1 = 1
            if (r6 != 0) goto L10
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJLLL
            boolean r0 = X.ONM.LJI(r0)
            if (r0 == 0) goto L3e
        L10:
            r3 = 1
            boolean r0 = r5.LJLLLLLL()
            if (r0 != 0) goto L3f
            LJLLILLLL(r2, r4, r1)
        L1a:
            android.os.Handler r3 = r5.LLJILLL
            r0 = 0
            r3.removeCallbacksAndMessages(r0)
            boolean r0 = r5.LLIIIZ
            if (r0 != 0) goto L29
            android.view.ViewGroup r0 = r5.LLILZ
            LJLLILLLL(r2, r0, r1)
        L29:
            X.94D r0 = r5.LLILLIZIL
            LJLLILLLL(r1, r0, r2)
            android.widget.FrameLayout r0 = r5.LLFII
            LJLLILLLL(r2, r0, r1)
            android.view.View r0 = r5.LLFF
            LJLLILLLL(r1, r0, r2)
            X.94E r0 = r5.LLFZ
            LJLLILLLL(r2, r0, r1)
        L3d:
            return
        L3e:
            r3 = 0
        L3f:
            boolean r0 = r5.LLIIIZ
            if (r0 != 0) goto L46
            LJLLILLLL(r1, r4, r2)
        L46:
            if (r3 == 0) goto L49
            goto L1a
        L49:
            android.widget.FrameLayout r0 = r5.LLFII
            LJLLILLLL(r1, r0, r2)
            android.view.View r0 = r5.LLFF
            LJLLILLLL(r2, r0, r2)
            X.94E r0 = r5.LLFZ
            LJLLILLLL(r1, r0, r2)
            boolean r0 = r5.LLIIIZ
            if (r0 == 0) goto L67
            X.94D r0 = r5.LLILLIZIL
            LJLLILLLL(r2, r0, r1)
        L61:
            r5.LL()
            if (r4 != 0) goto L6d
            goto L3d
        L67:
            android.view.ViewGroup r0 = r5.LLILZ
            LJLLILLLL(r1, r0, r2)
            goto L61
        L6d:
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            r4.setAlpha(r0)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell.b2(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
        o.LJIIIZ(clazz, "clazz");
        return o.LJ(clazz, C75012wz.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void e9(boolean z) {
        if (z) {
            this.LLJILLL.removeCallbacksAndMessages(null);
            Z1(false);
        } else {
            LL();
        }
        this.LLIIZ = z;
    }

    @Override // X.InterfaceC222708oc
    public final void eg(boolean z) {
        InterfaceC222698ob interfaceC222698ob;
        InterfaceC47247IgV surfaceHolder;
        InterfaceC222698ob interfaceC222698ob2;
        InterfaceC47247IgV surfaceHolder2;
        if (z) {
            InterfaceC222698ob interfaceC222698ob3 = this.LL;
            if (interfaceC222698ob3 != null && interfaceC222698ob3.getSurfaceHolder() != null && (interfaceC222698ob2 = this.LL) != null && (surfaceHolder2 = interfaceC222698ob2.getSurfaceHolder()) != null) {
                surfaceHolder2.O7();
                return;
            }
            return;
        }
        InterfaceC222698ob interfaceC222698ob4 = this.LL;
        if (interfaceC222698ob4 == null || interfaceC222698ob4.getSurfaceHolder() == null || (interfaceC222698ob = this.LL) == null || (surfaceHolder = interfaceC222698ob.getSurfaceHolder()) == null) {
            return;
        }
        surfaceHolder.Q7();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void f8(String pageType) {
        o.LJIIIZ(pageType, "pageType");
        VideoItemParams videoItemParams = this.LJLLJ;
        if (videoItemParams != null) {
            videoItemParams.adapterType = pageType;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void g7(Map map) {
        String str;
        o.LJIIIZ(map, "map");
        if (this.LJLLL == null || map.isEmpty()) {
            C36922EeM.LJFF(new IllegalArgumentException("list is empty,should never happen!"));
            return;
        }
        int size = map.size();
        for (int i = 0; i < size; i++) {
            Aweme aweme = this.LJLLL;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            if (map.get(str) != null) {
                if (this.LLIL != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("aid:");
                    LIZ.append(str);
                    LIZ.append(".start to update statistics!");
                    C36922EeM.LIZLLL(4, "FeedBackupHelper", X1D.LIZIZ(LIZ));
                    DataCenter dataCenter = this.LLIL;
                    if (dataCenter != null) {
                        dataCenter.jv0(this.LJLLJ, "awesome_update_backup_data");
                        VideoViewModel videoViewModel = this.LLILIL;
                        if (videoViewModel != null) {
                            videoViewModel.setState(new AqS170S0100000_4(this.LJLLJ, 1379));
                        }
                    } else {
                        o.LJIJI("dataCenter");
                        throw null;
                    }
                } else {
                    o.LJIJI("dataCenter");
                    throw null;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public void l8(int i) {
        VideoViewModel videoViewModel = this.LLILIL;
        if (videoViewModel != null) {
            videoViewModel.iv0(i, null);
        }
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.Qg0(i);
        }
        this.LLJILLL.postDelayed(new ARunnableS40S0100000_4(this, 14), 3000L);
    }

    @Override // X.C2MA
    public final void m6(Aweme aweme) {
        VideoViewModel videoViewModel;
        o.LJIIIZ(aweme, "aweme");
        if (this.LLIIIJ != null && (videoViewModel = this.LLILIL) != null) {
            videoViewModel.setState(new AqS169S0100000_3(aweme, 900));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        Activity LJIJJ;
        String str;
        long j;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 != null) {
            String str2 = c207668Da2.LIZ;
            o.LJIIIIZZ(str2, "kvData.key");
            boolean z = false;
            String str3 = null;
            C50420Jqa c50420Jqa = null;
            String str4 = null;
            Object obj = null;
            switch (str2.hashCode()) {
                case -1935883927:
                    if (!str2.equals("video_favorite_click")) {
                        return;
                    }
                    LL();
                    return;
                case -1618328215:
                    if (!str2.equals("video_digg")) {
                        return;
                    }
                    Aweme aweme = this.LJLLL;
                    if (aweme != null) {
                        String aid = aweme.getAid();
                        o.LJIIIIZZ(aid, "aid");
                        AwemeStatistics statistics = aweme.getStatistics();
                        if (statistics != null) {
                            j = statistics.getDiggCount();
                        } else {
                            j = 0;
                        }
                        C2U8.LIZ(new AnonymousClass799(aid, j, aweme.getUserDigg(), C79N.LIST));
                    }
                    LL();
                    return;
                case -1410821767:
                    if (!str2.equals("video_on_pause_play")) {
                        return;
                    }
                    break;
                case -591633993:
                    if (!str2.equals("click_land_scape_see_more")) {
                        return;
                    }
                    LL();
                    return;
                case -492284990:
                    if (!str2.equals("video_comment_list")) {
                        return;
                    }
                    C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2300791f.LJLIL);
                    Aweme aweme2 = this.LJLLL;
                    if (aweme2 != null) {
                        C174366sq param = new C174366sq(aweme2.getAid());
                        User author = aweme2.getAuthor();
                        if (author == null || (str = author.getUid()) == null) {
                            str = "";
                        }
                        param.setAuthorUid(str);
                        param.setOrientationMode(1);
                        param.setEventType(this.LJLLILLLL.LJIIIZ);
                        param.setEnableComment(!aweme2.isCmtSwt());
                        param.setAdCommentStruct(aweme2.getAdCommentStruct());
                        Object value = LIZIZ.getValue();
                        o.LJIIIIZZ(value, "onChanged$lambda$21(...)");
                        param.setCommentClose(((CommentService) value).LJIILLIIL(aweme2));
                        Object value2 = LIZIZ.getValue();
                        o.LJIIIIZZ(value2, "onChanged$lambda$21(...)");
                        if (((CommentService) value2).LJIILLIIL(aweme2)) {
                            Object value3 = LIZIZ.getValue();
                            o.LJIIIIZZ(value3, "onChanged$lambda$21(...)");
                            if (!((CommentService) value3).LJJIJIIJI(aweme2)) {
                                z = true;
                            }
                        }
                        param.setCommentLimited(z);
                        param.setEnterMethod("click_comment_icon");
                        Object value4 = LIZIZ.getValue();
                        o.LJIIIIZZ(value4, "onChanged$lambda$21(...)");
                        ActivityC45651qj activity = getActivity();
                        o.LJIIIIZZ(param, "param");
                        ((CommentService) value4).LJJIJIL(activity, aweme2, param);
                    }
                    Z1(true);
                    return;
                case -162745511:
                    if (!str2.equals("feed_internal_event")) {
                        return;
                    }
                    InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LLIIIL;
                    if (interfaceC72642tA != null) {
                        Object obj2 = c207668Da2.LIZIZ;
                        if (obj2 != null) {
                            c50420Jqa = obj2;
                        }
                        interfaceC72642tA.onInternalEvent(c50420Jqa);
                    }
                    LL();
                    return;
                case -144973899:
                    if (!str2.equals("title_view_click")) {
                        return;
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/");
                    Aweme aweme3 = this.LJLLL;
                    if (aweme3 != null) {
                        str4 = aweme3.getAuthorUid();
                    }
                    buildRoute.withParam("uid", str4);
                    C05040Hs.LJ(buildRoute, "enter_from", this.LJLLILLLL.LJIIIZ, "extra_from_pre_page", "notification_page");
                    Context context = this.LLIIIJ;
                    if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null) {
                        return;
                    }
                    LJIJJ.finish();
                    return;
                case 578788135:
                    if (!str2.equals("enter_play_mode")) {
                        return;
                    }
                    Object obj3 = c207668Da2.LIZIZ;
                    if (obj3 != null) {
                        obj = obj3;
                    }
                    o.LJIIIIZZ(obj, "kvData.getData()");
                    Z1(((Boolean) obj).booleanValue());
                    return;
                case 1181771620:
                    if (!str2.equals("video_share_click")) {
                        return;
                    }
                    Aweme aweme4 = this.LJLLL;
                    Bundle bundle = new Bundle();
                    bundle.putString("event_type", "landscape");
                    bundle.putBoolean("is_portrait", false);
                    if (getActivity() != null && this.LJLLLLLL != null && aweme4 != null) {
                        ShareService shareService = C4LD.LIZ;
                        ActivityC45651qj activity2 = getActivity();
                        o.LJI(activity2);
                        Fragment fragment = this.LJLLLLLL;
                        o.LJI(fragment);
                        Fragment fragment2 = this.LJLLLLLL;
                        o.LJII(fragment2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedFragment");
                        shareService.LJJJJIZL(activity2, fragment, aweme4, ((LandscapeFeedFragment) fragment2).LJLIL, bundle);
                    }
                    Z1(true);
                    return;
                case 1747137704:
                    if (!str2.equals("click_landscape_caption_toggle")) {
                        return;
                    }
                    break;
                case 1964086245:
                    if (!str2.equals("to_profile")) {
                        return;
                    }
                    SmartRoute buildRoute2 = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/");
                    Aweme aweme5 = this.LJLLL;
                    if (aweme5 != null) {
                        str3 = aweme5.getAuthorUid();
                    }
                    buildRoute2.withParam("uid", str3);
                    C05040Hs.LJ(buildRoute2, "enter_from", this.LJLLILLLL.LJIIIZ, "extra_from_pre_page", "notification_page");
                    ActivityC45651qj activity3 = getActivity();
                    if (activity3 == null) {
                        return;
                    }
                    activity3.finish();
                    return;
                default:
                    return;
            }
            LL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        VideoPlayViewModel videoPlayViewModel = this.LLILL;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AqS28S1000000_3(str, 24));
        }
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPlayCompleted(str);
        }
        VideoPlayViewModel videoPlayViewModel = this.LLILL;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AqS28S1000000_3(str, 25));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        DataCenter dataCenter = this.LLIL;
        if (dataCenter != null) {
            dataCenter.jv0(null, "play_complete_first_time");
            VideoPlayViewModel videoPlayViewModel = this.LLILL;
            if (videoPlayViewModel != null) {
                videoPlayViewModel.setState(C222368o4.LJLIL);
                return;
            }
            return;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        VideoPlayViewModel videoPlayViewModel = this.LLILL;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AqS28S1000000_3(str, 26));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
        w1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH playerEvent) {
        o.LJIIIZ(playerEvent, "playerEvent");
        VideoPlayViewModel videoPlayViewModel = this.LLILL;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(C222508oI.LJLIL);
        }
        BaseFeedPageParams baseFeedPageParams = this.LLJJIJIL;
        if (baseFeedPageParams != null) {
            if (!baseFeedPageParams.isPlayListCleanMode()) {
                this.LLIILII.LJIIJJI(this.LJLLL);
                Context context = this.LLIIIJ;
                if (context != null) {
                    this.LLIILII.LJIIJ(context, this.LJLLLLLL);
                }
            }
            LJLLJ();
            return;
        }
        o.LJIJI("baseFeedPageParams");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        w1();
        VideoPlayViewModel videoPlayViewModel = this.LLILL;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AqS28S1000000_3(str, 28));
        }
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onResumePlay(str);
        }
    }

    @Override // X.C2MA
    public void t7(boolean z) {
        String str;
        String str2;
        DataCenter dataCenter = this.LLIL;
        String str3 = null;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "on_page_unselected");
            Aweme aweme = this.LJLLL;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C2U8.LIZ(new C174086sO(str));
            VideoViewModel videoViewModel = this.LLILIL;
            if (videoViewModel != null) {
                Aweme aweme2 = this.LJLLL;
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = null;
                }
                videoViewModel.jv0(str2, z);
            }
            FeedInteractionAreaContainer feedInteractionAreaContainer = this.LJZ;
            Aweme aweme3 = this.LJLLL;
            if (aweme3 != null) {
                aweme3.getAid();
            }
            feedInteractionAreaContainer.l4();
            C245639kV c245639kV = this.LLIILII;
            Aweme aweme4 = this.LJLLL;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            }
            c245639kV.LJIIIZ(str3);
            InterfaceC222698ob interfaceC222698ob = this.LL;
            if (interfaceC222698ob != null) {
                interfaceC222698ob.Zo(z);
            }
            C2MX.LIZ().LIZ(this.LJLLILLLL.LJIIIZ);
            LLD();
            return;
        }
        o.LJIJI("dataCenter");
        throw null;
    }

    @Override // X.InterfaceC55219Lln
    public final void ug(Video video) {
        o.LJIIIZ(video, "video");
        SmartImageView smartImageView = this.LLJILJIL;
        if (smartImageView != null) {
            smartImageView.setVisibility(0);
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(video.getOriginCover()));
        LJII.LJJI = KL0.HIGH;
        LJII.LIZIZ("landscape_cell");
        LJII.LJJIIJ = this.LLJILJIL;
        C16880lQ.LLJJJ(LJII);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void E8(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLLLL = i;
        LLIFFJFJJ(aweme);
    }

    @Override // X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        Aweme aweme;
        this.LLIIJLIL = true;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LLIIIL;
        if (interfaceC72642tA != null && (aweme = this.LJLLL) != null) {
            interfaceC72642tA.onInternalEvent(new C50420Jqa(0, aweme));
        }
        LJLLJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        String str;
        boolean z;
        Video video;
        View view;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        o.LJIIIZ(aweme, "aweme");
        LLIFFJFJJ(aweme);
        this.LJLLLL = i;
        C2300591d c2300591d = this.LLIIJI;
        Context context = this.LLIIIJ;
        FrameLayout frameLayout = this.LLIIIILZ;
        View videoView = getVideoView();
        SmartImageView smartImageView = this.LLJILJIL;
        c2300591d.getClass();
        if (context != null && aweme.getVideo() != null && frameLayout != null && videoView != null) {
            if (C79004UzY.LJJII(aweme, false)) {
                Video video2 = aweme.getVideo();
                if (video2 != null) {
                    int width = video2.getWidth();
                    int height = video2.getHeight();
                    FakeLandscapeInfo fakeLandscapeInfo = video2.getFakeLandscapeInfo();
                    o.LJIIIIZZ(fakeLandscapeInfo, "it.fakeLandscapeInfo");
                    float right = (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft()) * width;
                    float bottom = (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop()) * height;
                    float f = right / bottom;
                    int i2 = c2300591d.LIZ;
                    float f2 = i2;
                    int i3 = c2300591d.LIZIZ;
                    float f3 = i3;
                    if (f2 / f3 > f) {
                        i2 = (int) (f * f3);
                    } else {
                        i3 = (int) ((bottom / right) * f2);
                    }
                    float right2 = i2 / (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft());
                    float bottom2 = i3 / (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop());
                    int i4 = (int) bottom2;
                    int i5 = (int) right2;
                    C2300591d.LIZ(i4, i5, videoView);
                    ViewGroup.LayoutParams layoutParams4 = videoView.getLayoutParams();
                    if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams4) != null) {
                        layoutParams3.gravity = 8388659;
                    }
                    float f4 = 2;
                    C26338AVi.LJI(videoView, Integer.valueOf((int) ((c2300591d.LIZ - ((fakeLandscapeInfo.getLeft() + fakeLandscapeInfo.getRight()) * right2)) / f4)), Integer.valueOf((int) ((c2300591d.LIZIZ - ((fakeLandscapeInfo.getTop() + fakeLandscapeInfo.getBottom()) * bottom2)) / f4)), null, null, true, 12);
                    C2300591d.LIZ(i4, i5, smartImageView);
                    if (smartImageView != null) {
                        layoutParams = smartImageView.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                        layoutParams2.gravity = 8388659;
                    }
                    if (smartImageView != null) {
                        C26338AVi.LJI(smartImageView, Integer.valueOf((int) ((c2300591d.LIZ - ((fakeLandscapeInfo.getLeft() + fakeLandscapeInfo.getRight()) * right2)) / f4)), Integer.valueOf((int) ((c2300591d.LIZIZ - ((fakeLandscapeInfo.getTop() + fakeLandscapeInfo.getBottom()) * bottom2)) / f4)), null, null, true, 12);
                    }
                }
            } else {
                Video video3 = aweme.getVideo();
                if (video3 != null) {
                    double width2 = video3.getWidth();
                    double height2 = video3.getHeight();
                    double d = width2 / height2;
                    int i6 = c2300591d.LIZ;
                    double d2 = i6;
                    int i7 = c2300591d.LIZIZ;
                    double d3 = i7;
                    if (d2 / d3 > d) {
                        i6 = (int) (d * d3);
                    } else {
                        i7 = (int) ((height2 / width2) * d2);
                    }
                    C2300591d.LIZ(i7, i6, videoView);
                    C2300591d.LIZ(i7, i6, smartImageView);
                }
            }
        }
        if (C209418Jt.LIZ(this.LJLLL).LIZJ()) {
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                viewGroup.post(new ARunnableS23S0200000_4(this, viewGroup, 2));
            }
            TuxTextView tuxTextView = this.LLIZLLLIL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
            }
            if (!LFH.LIZIZ.LIZLLL().LJIILL() && (view = this.LLJ) != null) {
                view.setVisibility(0);
            }
        }
        BaseFeedPageParams baseFeedPageParams = this.LLJJIJIL;
        if (baseFeedPageParams != null) {
            if (!baseFeedPageParams.isPlayListCleanMode()) {
                new C223778qL();
                Aweme aweme2 = this.LJLLL;
                if (aweme2 != null) {
                    aweme2.getAuthorUid();
                }
                Aweme aweme3 = this.LJLLL;
                if (aweme3 != null) {
                    aweme3.getAid();
                }
                C218158hH c218158hH = C3A5.LIZ;
                Aweme aweme4 = this.LJLLL;
                if (aweme4 != null) {
                    str = aweme4.getRequestId();
                } else {
                    str = null;
                }
                c218158hH.LIZIZ(str);
                InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
                o.LJIIIIZZ(LJJLIIIIJ, "inst()");
                C245639kV c245639kV = this.LLIILII;
                c245639kV.LJIIJJI(this.LJLLL);
                c245639kV.LIZJ = new Y1Q() { // from class: X.91c
                    @Override // X.Y1Q
                    public final void LIZIZ(int i8, boolean z2) {
                    }

                    @Override // X.Y1Q
                    public final void LIZJ(MotionEvent event) {
                        o.LJIIIZ(event, "event");
                    }

                    @Override // X.Y1Q
                    public final void handleDoubleClick(MotionEvent event) {
                        o.LJIIIZ(event, "event");
                    }

                    @Override // X.Y1Q
                    public final void LIZ(View stickerView, InteractStickerStruct interactStickerStruct, boolean z2) {
                        o.LJIIIZ(stickerView, "stickerView");
                        o.LJIIIZ(interactStickerStruct, "interactStickerStruct");
                        if (z2) {
                            if (!LandscapeVideoViewCell.this.LJLZ()) {
                                return;
                            }
                        } else if (LandscapeVideoViewCell.this.LJLZ()) {
                            return;
                        }
                        LandscapeVideoViewCell landscapeVideoViewCell = LandscapeVideoViewCell.this;
                        InterfaceC2302191t interfaceC2302191t = landscapeVideoViewCell.LLJJIJI;
                        if (interfaceC2302191t != null) {
                            interfaceC2302191t.handlePlay(landscapeVideoViewCell.LJLLL, false, false);
                        } else {
                            o.LJIJI("iHandlePlay");
                            throw null;
                        }
                    }
                };
                c245639kV.LJFF = LJJLIIIIJ;
                c245639kV.LJI = new InterfaceC86436Xw8() { // from class: X.91b
                    public boolean LIZ;

                    @Override // X.InterfaceC86436Xw8
                    public final void LIZIZ() {
                        this.LIZ = false;
                        if (!LandscapeVideoViewCell.this.LJLZ()) {
                            return;
                        }
                        this.LIZ = true;
                        LandscapeVideoViewCell landscapeVideoViewCell = LandscapeVideoViewCell.this;
                        InterfaceC2302191t interfaceC2302191t = landscapeVideoViewCell.LLJJIJI;
                        if (interfaceC2302191t != null) {
                            interfaceC2302191t.handlePlay(landscapeVideoViewCell.LJLLL, false, false);
                        } else {
                            o.LJIJI("iHandlePlay");
                            throw null;
                        }
                    }

                    @Override // X.InterfaceC86436Xw8
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC86436Xw8
                    public final void LIZ() {
                        if (!this.LIZ) {
                            return;
                        }
                        LandscapeVideoViewCell landscapeVideoViewCell = LandscapeVideoViewCell.this;
                        InterfaceC2302191t interfaceC2302191t = landscapeVideoViewCell.LLJJIJI;
                        if (interfaceC2302191t != null) {
                            interfaceC2302191t.handlePlay(landscapeVideoViewCell.LJLLL, false, false);
                        } else {
                            o.LJIJI("iHandlePlay");
                            throw null;
                        }
                    }

                    @Override // X.InterfaceC86436Xw8
                    public final void LIZLLL() {
                        C2U8.LIZ(new C2IP(false, false));
                    }

                    @Override // X.InterfaceC86436Xw8
                    public final void LJ() {
                        C2U8.LIZ(new C2IP(true, false));
                        if (LandscapeVideoViewCell.this.LJLZ()) {
                            return;
                        }
                        LandscapeVideoViewCell landscapeVideoViewCell = LandscapeVideoViewCell.this;
                        InterfaceC2302191t interfaceC2302191t = landscapeVideoViewCell.LLJJIJI;
                        if (interfaceC2302191t != null) {
                            interfaceC2302191t.handlePlay(landscapeVideoViewCell.LJLLL, true, false);
                        } else {
                            o.LJIJI("iHandlePlay");
                            throw null;
                        }
                    }
                };
                c245639kV.LJIIL = new InterfaceC223918qZ() { // from class: X.91e
                    @Override // X.InterfaceC223918qZ
                    public final void LIZIZ() {
                        LandscapeVideoViewCell landscapeVideoViewCell = LandscapeVideoViewCell.this;
                        InterfaceC2302191t interfaceC2302191t = landscapeVideoViewCell.LLJJIJI;
                        if (interfaceC2302191t != null) {
                            interfaceC2302191t.handlePlay(landscapeVideoViewCell.LJLLL, false, false);
                        } else {
                            o.LJIJI("iHandlePlay");
                            throw null;
                        }
                    }
                };
                BaseFeedPageParams baseFeedPageParams2 = this.LLJJIJIL;
                if (baseFeedPageParams2 != null) {
                    if (baseFeedPageParams2.isShowVote) {
                        Aweme aweme5 = this.LJLLL;
                        o.LJI(aweme5);
                        String aid = aweme5.getAid();
                        InterfaceC2302191t interfaceC2302191t = this.LLJJIJI;
                        if (interfaceC2302191t != null) {
                            if (TextUtils.equals(aid, interfaceC2302191t.getCurrentAwemeId())) {
                                z = true;
                                c245639kV.LJIIIZ = z;
                                c245639kV.LIZIZ();
                                c245639kV.LJIIJ = -1;
                                c245639kV.LJIIJJI = "normal";
                                c245639kV.LJIIIZ = false;
                            }
                        } else {
                            o.LJIJI("iHandlePlay");
                            throw null;
                        }
                    }
                    z = false;
                    c245639kV.LJIIIZ = z;
                    c245639kV.LIZIZ();
                    c245639kV.LJIIJ = -1;
                    c245639kV.LJIIJJI = "normal";
                    c245639kV.LJIIIZ = false;
                } else {
                    o.LJIJI("baseFeedPageParams");
                    throw null;
                }
            }
            BaseFeedPageParams baseFeedPageParams3 = this.LLJJIJIL;
            if (baseFeedPageParams3 != null) {
                if (!baseFeedPageParams3.isPlayListCleanMode()) {
                    this.LLIILII.LJIIJJI(this.LJLLL);
                    this.LLIILII.LIZ(true);
                }
                Aweme aweme6 = this.LJLLL;
                if (aweme6 != null && (video = aweme6.getVideo()) != null) {
                    ug(video);
                }
                LLD();
                LJLJLLL(i, this.LJLLJ);
                C2300891g.LIZ.getClass();
                if (C2300891g.LIZIZ && !LJLLLLLL()) {
                    for (View view2 : this.LLJJJIL) {
                        if (view2 != null) {
                            view2.setVisibility(4);
                        }
                    }
                    this.LLIIIZ = true;
                    ImageView imageView = this.LLJIJIL;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    LJLLI(true);
                    return;
                }
                return;
            }
            o.LJIJI("baseFeedPageParams");
            throw null;
        }
        o.LJIJI("baseFeedPageParams");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    public static void LJLLILLLL(boolean z, View view, boolean z2) {
        if (view != null) {
            if (z) {
                view.setVisibility(0);
                view.animate().alpha(0.99f).setDuration(200L).start();
            } else {
                C09K.LIZ(view, 0.0f, 200L).withEndAction(new ARunnableS10S0110000_4(view, z2, 1)).start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String sourceId, long j, long j2) {
        o.LJIIIZ(sourceId, "sourceId");
        InterfaceC222698ob interfaceC222698ob = this.LL;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPlayProgressChange(sourceId, j, j2);
        }
        AbsInteractStickerWidget absInteractStickerWidget = this.LLIILII.LJIILIIL;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void f7(int i, int i2, String awemeId, String captionText) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(captionText, "captionText");
        C90V c90v = new C90V();
        C90U c90u = c90v.LIZ;
        c90u.LIZ = awemeId;
        c90u.LIZIZ = i;
        c90u.LIZLLL = captionText;
        c90u.LIZJ = true;
        Integer valueOf = Integer.valueOf(i2);
        C90U c90u2 = c90v.LIZ;
        c90u2.LJ = valueOf;
        VideoViewModel videoViewModel = this.LLILIL;
        if (videoViewModel != null) {
            videoViewModel.setState(new AqS170S0100000_4(c90u2, 1382));
        }
    }
}
