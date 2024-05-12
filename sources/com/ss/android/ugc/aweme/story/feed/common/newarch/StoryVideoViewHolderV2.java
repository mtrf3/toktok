package com.ss.android.ugc.aweme.story.feed.common.newarch;

import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C16880lQ;
import X.C17720mm;
import X.C221108m2;
import X.C222198nn;
import X.C222488oG;
import X.C222498oH;
import X.C222508oI;
import X.C222518oJ;
import X.C222588oQ;
import X.C226108u6;
import X.C2304092m;
import X.C245639kV;
import X.C40010Fn4;
import X.C50420Jqa;
import X.C54333LUb;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C62822Ol8;
import X.C78996UzQ;
import X.C90R;
import X.C92D;
import X.C92W;
import X.C9XU;
import X.G27;
import X.IPH;
import X.IT4;
import X.InterfaceC222528oK;
import X.InterfaceC222698ob;
import X.InterfaceC55100Ljs;
import X.InterfaceC72642tA;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.story.feed.common.newarch.StoryVideoViewHolderV2;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedSubViewHolderScope;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryLongPressMonitorAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component.StoryLongPressMonitorComponent;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerTemp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS15S0000100_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes4.dex */
public class StoryVideoViewHolderV2 extends VideoViewCell implements CommonCellAbility {
    public static final C62822Ol8 b = C221108m2.LIZIZ(C222518oJ.LJLIL);
    public boolean LLZZ;
    public final C62822Ol8 LLZZJLIL;
    public final C62822Ol8 LLZZLLIL;
    public final C222488oG LLZZZIL;
    public final C62822Ol8 LLZZZZ;
    public final C62822Ol8 a;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        return "cell_story_video";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(FeedSubViewHolderScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void n() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLL() {
        if (this.LLLILZ != null && !C40010Fn4.LIZJ().LIZLLL() && !C54333LUb.LIZJ) {
            this.LLLILZ.jv0(Boolean.TRUE, "startPlayAnimation");
            LLLLILI().iv0(true);
        }
    }

    public final ValueAnimator LLLLIL() {
        return (ValueAnimator) this.LLZZJLIL.getValue();
    }

    public final VideoPlayViewModel LLLLILI() {
        return (VideoPlayViewModel) this.LLZZLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJZ() {
        super.LJZ();
        LongPressLayout longPressLayout = this.LLILLJJLI;
        StoryLongPressMonitorComponent storyLongPressMonitorComponent = null;
        StoryLongPressMonitorAbility storyLongPressMonitorAbility = (StoryLongPressMonitorAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), StoryLongPressMonitorAbility.class, null);
        if (storyLongPressMonitorAbility != null) {
            storyLongPressMonitorComponent = storyLongPressMonitorAbility.pv();
        }
        longPressLayout.setLongPressMonitor(storyLongPressMonitorComponent);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222528oK
    public final boolean U() {
        InterfaceC222528oK interfaceC222528oK = (InterfaceC222528oK) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), StoryLongPressMonitorAbility.class, null);
        if (interfaceC222528oK != null) {
            return interfaceC222528oK.U();
        }
        return super.U();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        C9XU.LIZLLL(this.LLZZZIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.8oG] */
    public StoryVideoViewHolderV2(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 881));
        this.LLZZLLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 882));
        this.LLZZZIL = new G27() { // from class: X.8oG
            @Override // X.G27
            public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
                o.LJIIIZ(newConfig, "newConfig");
                StoryVideoViewHolderV2 storyVideoViewHolderV2 = StoryVideoViewHolderV2.this;
                storyVideoViewHolderV2.LLLLIIL(storyVideoViewHolderV2.LJLLL);
            }
        };
        this.LLZZZZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 883));
        C55096Ljo.LJIIJJI(C55096Ljo.LJIJ(this), this, CommonCellAbility.class, null);
        this.a = C221108m2.LIZIZ(new AqS153S0100000_3(this, 880));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIII(int i) {
        super.LJJIII(i);
        C222198nn.LIZ(this.LJLLL, new AqS169S0100000_3(this, 431));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        C222198nn.LIZ(this.LJLLL, new AqS169S0100000_3(this, 432));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (r11 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLIIL(com.ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.LLJJJIL
            if (r0 != 0) goto L5
            return
        L5:
            r11 = 1
            r6 = 0
            if (r13 == 0) goto L1c
            int r1 = r13.getStoryType()
            r0 = 3
            if (r1 != r0) goto L1c
            r10 = 1
        L11:
            X.Ol8 r0 = r12.LLZZZZ
            java.lang.Object r5 = r0.getValue()
            X.TDr r5 = (X.C74291TDr) r5
            if (r5 != 0) goto L1e
            return
        L1c:
            r10 = 0
            goto L11
        L1e:
            android.view.ViewParent r4 = r5.getParent()
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r8 = 0
            if (r0 == 0) goto L2b
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 != 0) goto L2c
        L2b:
            return
        L2c:
            android.content.Context r0 = r12.LLJJJIL
            java.lang.String r9 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJL(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            android.content.Context r0 = r12.LLJJJIL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJJL(r0)
            float r0 = (float) r0
            float r1 = r1 / r0
            r7 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto Lba
        L4c:
            r1 = 0
            if (r10 == 0) goto Lb8
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r2 = X.C32151Nz.LJIIZILJ(r0)
            if (r11 == 0) goto Lb6
        L5b:
            r3 = -1
            if (r10 != 0) goto L91
        L5e:
            r6 = -1
            if (r10 != 0) goto L94
        L61:
            r5.setRadius(r2)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            if (r2 == 0) goto Lbc
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.width = r3
            r2.height = r6
            int r0 = (int) r1
            r2.topMargin = r0
            r5.setLayoutParams(r2)
            X.064 r1 = new X.064
            r1.<init>()
            r1.LJII(r4)
            int r0 = r5.getId()
            r1.LJIJI(r0, r8)
            r1.LIZIZ(r4)
            r4.invalidate()
            com.bytedance.lighten.loader.SmartImageView r0 = r12.LLFII
            r0.invalidate()
            return
        L91:
            if (r11 == 0) goto L5e
            goto L96
        L94:
            if (r11 == 0) goto Lb3
        L96:
            android.content.Context r0 = r12.LLJJJIL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJJL(r0)
            float r1 = (float) r0
            android.content.Context r0 = r12.LLJJJIL
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r9)
            int r0 = X.C63081OpJ.LJJJJL(r0)
            float r0 = (float) r0
            float r0 = r0 / r7
            float r1 = r1 - r0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r0
            java.lang.String r8 = "H, 3:4"
            goto L61
        Lb3:
            java.lang.String r8 = "W, 3:4"
            goto L61
        Lb6:
            r3 = 0
            goto L5e
        Lb8:
            r2 = 0
            goto L5b
        Lba:
            r11 = 0
            goto L4c
        Lbc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.newarch.StoryVideoViewHolderV2.LLLLIIL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void Yc0(C92D c92d) {
        super.Yc0(c92d);
        if (C2304092m.LIZ()) {
            this.LLILLJJLI.setLongPressInterceptor(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void k7(View view) {
        super.k7(view);
        ActivityC45651qj activity = getActivity();
        if (activity != null) {
            C9XU.LIZIZ(activity, this.LLZZZIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        super.l8(i);
        C222198nn.LIZ(this.LJLLL, new AqS169S0100000_3(this, 433));
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        String str2;
        LLJJJJ(2);
        VideoPlayViewModel LLLLILI = LLLLILI();
        LLLLILI.getClass();
        LLLLILI.setState(new AqS28S1000000_3(str, 24));
        LLLF(System.currentTimeMillis());
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPausePlay(str);
        }
        LongPressLayout longPressLayout = this.LLILLJJLI;
        Context context = this.LLJJJIL;
        if (context != null) {
            str2 = context.getString(R.string.a_p);
        } else {
            str2 = null;
        }
        if (longPressLayout != null) {
            try {
                h0.LJIILLIIL(longPressLayout, C17720mm.LJI, str2, null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPlayCompleted(str);
        }
        VideoPlayViewModel LLLLILI = LLLLILI();
        LLLLILI.getClass();
        LLLLILI.setState(new AqS28S1000000_3(str, 25));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        super.onPlayCompletedFirstTime(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        LLJZIJLIL("onPreparePlay");
        this.LLJJL = false;
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        String str;
        this.LLJJIJIL = System.currentTimeMillis();
        LLILLIZIL("onRenderFirstFrame");
        this.LLJJL = true;
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "in_video_view_holder");
        }
        VideoPlayViewModel LLLLILI = LLLLILI();
        if (it4 != null) {
            str = it4.getId();
        } else {
            str = null;
        }
        LLLLILI.getClass();
        LLLLILI.setState(new AqS28S1000000_3(str, 27));
        LLLIIIIL();
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onRenderFirstFrame(it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        this.LLLILZ.jv0(null, "on_render_ready");
        LLLLILI().setState(C222508oI.LJLIL);
        CellStickerManagerTemp cellStickerManagerTemp = this.LLJZ;
        if (cellStickerManagerTemp != null) {
            cellStickerManagerTemp.LIZLLL();
        }
        CellStickerManagerTemp cellStickerManagerTemp2 = this.LLJZ;
        if (cellStickerManagerTemp2 != null) {
            cellStickerManagerTemp2.LIZ();
        }
        this.LLLFZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (this.LJLLILLLL.LJ.awemeFromPage == 2 || this.LLJJL) {
            LLILLIZIL("onResumePlay");
        }
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "in_video_view_holder");
        }
        VideoPlayViewModel LLLLILI = LLLLILI();
        LLLLILI.getClass();
        LLLLILI.setState(new AqS28S1000000_3(str, 28));
        this.LLLFZ = System.currentTimeMillis();
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onResumePlay(str);
        }
        LongPressLayout longPressLayout = this.LLILLJJLI;
        String string = this.LLJJJIL.getString(R.string.a_n);
        if (longPressLayout != null) {
            try {
                h0.LJIILLIIL(longPressLayout, C17720mm.LJI, string, null);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        SmartImageView smartImageView;
        super.t7(z);
        C222198nn.LIZ(this.LJLLL, new AqS169S0100000_3(this, 434));
        if (C55723Ltv.LIZIZ.LJIJ().LJIILJJIL(this.LLLLZLLIL.param.getFrom()) && (smartImageView = this.LLFII) != null) {
            C78996UzQ.LJJJJL(smartImageView);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public void ug(Video video) {
        Aweme aweme = this.LJLLL;
        if (aweme != null && !aweme.isSharedStoryVisible()) {
            return;
        }
        super.ug(video);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLILLL(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        View view;
        LLLLIIL(aweme);
        C222198nn.LIZ(aweme, C222498oH.LJLIL);
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        super.LLLZ(i, aweme);
        if (C226108u6.LIZ() || aweme == null || 2 != aweme.getStoryType() || (view = this.LLIFFJFJJ) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final AnonymousClass901 LLFII(View view, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new C92W();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        C245639kV c245639kV;
        AbsInteractStickerWidget absInteractStickerWidget;
        VideoPlayViewModel LLLLILI = LLLLILI();
        LLLLILI.getClass();
        LLLLILI.setState(new AqS15S0000100_3(j, 7));
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if (interfaceC222698ob != null) {
            interfaceC222698ob.onPlayProgressChange(str, j, j2);
        }
        CellStickerManagerTemp cellStickerManagerTemp = this.LLJZ;
        if (cellStickerManagerTemp == null || C90R.LIZ() || (c245639kV = cellStickerManagerTemp.LJLJJI) == null || (absInteractStickerWidget = c245639kV.LJIILIIL) == null) {
            return;
        }
        absInteractStickerWidget.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void x7(float f, float f2, int i) {
        super.x7(f, f2, i);
        C222198nn.LIZ(this.LJLLL, new AqS169S0100000_3(this, 430));
    }
}
