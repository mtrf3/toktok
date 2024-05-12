package com.ss.android.ugc.aweme.dsp.service;

import X.AbstractC53764L8e;
import X.C1DH;
import X.C2U8;
import X.C3C8;
import X.C51645KOr;
import X.C65352Pkq;
import X.C70502pi;
import X.C76800UCe;
import X.C78685UuP;
import X.C84339X8d;
import X.C84340X8e;
import X.C87691YbH;
import X.C91189Zqb;
import X.C91198Zqk;
import X.C91204Zqq;
import X.C91208Zqu;
import X.C91211Zqx;
import X.C91237ZrN;
import X.C91249ZrZ;
import X.C91347Zt9;
import X.C91432ZuW;
import X.C91433ZuX;
import X.FFL;
import X.HG3;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.L41;
import X.RBY;
import X.RunnableC91238ZrO;
import X.SVF;
import X.X1D;
import X.YBK;
import Y.IDRunnableS88S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.experiment.MusicDspNewEntranceConfig;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonTrigger;
import com.ss.android.ugc.aweme.dsp.ui.MusicDspXTabProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.TTMBrand;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MusicDspServiceImpl implements IMusicDspService {
    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LIZ() {
        return C65352Pkq.LIZ(MusicDspUGCButtonTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LIZJ(String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void e6(String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final AbstractC53764L8e LIZIZ() {
        return new C91347Zt9();
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LJIIJJI() {
        if (C91198Zqk.LJI) {
            return false;
        }
        int i = C91198Zqk.LIZ.getInt("show_xtab_menu", 0);
        C87691YbH c87691YbH = C87691YbH.LIZ;
        c87691YbH.getClass();
        c87691YbH.getClass();
        MusicDspNewEntranceConfig value = (MusicDspNewEntranceConfig) C87691YbH.LIZJ.getValue();
        o.LJIIIIZZ(value, "value");
        if (i >= value.getSwitchGuideCount()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final TopTabProtocol LJIJ() {
        return new MusicDspXTabProtocol();
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LIZLLL() {
        if (C91211Zqx.LIZ() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LJIIIZ() {
        boolean z;
        if (!((RBY) HG3.LJIILL()).isChildrenMode()) {
            L41.LIZ.getClass();
            if (L41.LIZLLL()) {
                z = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("showMusicDspEntranceInXTab ");
                LIZ.append(z);
                LIZ.append(' ');
                LIZ.append(true ^ ((RBY) HG3.LJIILL()).isChildrenMode());
                X1D.LIZIZ(LIZ);
                return z;
            }
        }
        z = false;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showMusicDspEntranceInXTab ");
        LIZ2.append(z);
        LIZ2.append(' ');
        LIZ2.append(true ^ ((RBY) HG3.LJIILL()).isChildrenMode());
        X1D.LIZIZ(LIZ2);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LJIILJJIL() {
        if (!((RBY) HG3.LJIILL()).isChildrenMode()) {
            L41.LIZ.getClass();
            if ((L41.LJ() || L41.LJFF()) && YBK.LIZ().ugcCollect.getEnableUgcButton()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LJIILL() {
        boolean z = false;
        if (!((RBY) HG3.LJIILL()).isChildrenMode()) {
            L41.LIZ.getClass();
            if (L41.LIZIZ().getDspEntrance() == 6) {
                z = true;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showMusicDspEntranceInMeTab ");
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(true ^ ((RBY) HG3.LJIILL()).isChildrenMode());
        X1D.LIZIZ(LIZ);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (X.YBM.LIZIZ() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJJ(java.lang.String r5) {
        /*
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r1 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r0 = r1.isTodayPlayableLimited()
            r4 = 0
            if (r0 == 0) goto L54
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            boolean r0 = X.YBM.LIZJ()
            if (r0 != 0) goto L54
            r3 = 1
        L15:
            boolean r0 = r1.isPlayableExpiredTodayByClipId(r5)
            if (r0 != 0) goto L2c
            boolean r0 = r1.isPreviewPlayableExpiredTodayByClipId(r5)
            if (r0 == 0) goto L52
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            boolean r0 = X.YBM.LIZIZ()
            if (r0 != 0) goto L52
        L2c:
            r2 = 1
        L2d:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "the fullClipId: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "  isTodayLimited:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", isSongLimited:"
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            if (r3 != 0) goto L50
            if (r2 == 0) goto L51
        L50:
            r4 = 1
        L51:
            return r4
        L52:
            r2 = 0
            goto L2d
        L54:
            r3 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl.LJIJJ(java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C91189Zqb.LIZ.remove(interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJII(String str) {
        BaseDspFeedResponse baseDspFeedResponse;
        if (str == null) {
            return;
        }
        boolean z = false;
        if (C91432ZuW.LJLJL == -1) {
            FFL.LJIIIZ().getClass();
            C91432ZuW.LJLJL = FFL.LJIIJ(31744, 0, "music_dsp_preload_opt", true);
        }
        long j = 3000;
        if (C91432ZuW.LJLJL == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preloadDspVideoAfterFeedLoaded,in control group,sourceId:");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            if (C91432ZuW.LJLILLLLZI) {
                return;
            }
            C91432ZuW.LJLILLLLZI = true;
            long videoPreloadDelayTime = YBK.LIZ().firstFrameOpt.getVideoPreloadDelayTime();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preloadDspVideoAfterFeedLoaded ");
            LIZ2.append(videoPreloadDelayTime);
            X1D.LIZIZ(LIZ2);
            if (videoPreloadDelayTime >= 0) {
                j = videoPreloadDelayTime;
            }
            C1DH.LJJIJIIJIL(j, RunnableC91238ZrO.LJLIL);
            return;
        }
        if (o.LJ(str, C91432ZuW.LJLJLJ)) {
            return;
        }
        C91432ZuW.LJLJLJ = str;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("counter is ");
        LIZ3.append(C91432ZuW.LJLJJLL);
        LIZ3.append(" ,max is ");
        LIZ3.append(C91432ZuW.LJLJL);
        LIZ3.append(" ,sourceId is ");
        LIZ3.append(str);
        LIZ3.append(" is disabled :");
        LIZ3.append(C91432ZuW.LJLIL);
        LIZ3.append(" ,is response null ");
        if (C91432ZuW.LJLJJI == null) {
            z = true;
        }
        LIZ3.append(z);
        X1D.LIZIZ(LIZ3);
        if (C91432ZuW.LJLIL) {
            return;
        }
        C91432ZuW.LJLJI = true;
        int i = C91432ZuW.LJLJJLL;
        C91432ZuW.LJLJJLL = i + 1;
        if (i % C91432ZuW.LJLJL != 0 || (baseDspFeedResponse = C91432ZuW.LJLJJI) == null || !C91237ZrN.LIZIZ()) {
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("counter is ");
        LIZ4.append(C91432ZuW.LJLJJLL - 1);
        LIZ4.append(",max is ");
        LIZ4.append(C91432ZuW.LJLJL);
        LIZ4.append(",will preload audio resource.");
        X1D.LIZIZ(LIZ4);
        long videoPreloadDelayTime2 = YBK.LIZ().firstFrameOpt.getVideoPreloadDelayTime();
        if (videoPreloadDelayTime2 >= 0) {
            j = videoPreloadDelayTime2;
        }
        C1DH.LJJIJIIJIL(j, new IDRunnableS88S0100000_29(baseDspFeedResponse, 17));
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final TuxIconView LJIIIIZZ(View view) {
        if (view != null) {
            return (TuxIconView) view.findViewById(R.id.e6d);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJIIJ(Context context) {
        o.LJIIIZ(context, "context");
        C91249ZrZ.LJIILIIL("x_tab", "1");
        if (!C91432ZuW.LJLJJL) {
            return;
        }
        C91432ZuW.LJLJJL = false;
        if (C91432ZuW.LJLL == null) {
            C91432ZuW.LJLL = new WeakReference<>(context);
        }
        if (!YBK.LIZ().firstFrameOpt.getEnableApiPreload()) {
            return;
        }
        C84340X8e c84340X8e = C84339X8d.LIZJ;
        C91433ZuX c91433ZuX = new C91433ZuX();
        c84340X8e.getClass();
        C84340X8e.LIZIZ(c91433ZuX);
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJIIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ArrayList<InterfaceC65784Pro<C76800UCe>> arrayList = C91189Zqb.LIZ;
        if (arrayList.contains(interfaceC65784Pro)) {
            return;
        }
        arrayList.add(interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LJIILLIIL(String str) {
        L41.LIZ.getClass();
        if (L41.LIZIZ().getDspUgcEntrance() != 2 || ((RBY) HG3.LJIILL()).isChildrenMode() || LJIJJ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final boolean LJIIZILJ(Aweme aweme) {
        Dsp dsp;
        TTMBrand brand;
        if (aweme == null || (dsp = aweme.getDsp()) == null || !dsp.shouldShowAnchor() || ((RBY) HG3.LJIILL()).isChildrenMode()) {
            return false;
        }
        String fullClipId = dsp.getFullClipId();
        if (fullClipId == null) {
            fullClipId = "";
        }
        if (LJIJJ(fullClipId)) {
            return false;
        }
        TTMInfo ttmInfo = aweme.getTtmInfo();
        if (ttmInfo != null && (brand = ttmInfo.getBrand()) != null && brand.isInExp()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJFF(long j, String str) {
        SVF.LJII(String.valueOf(j));
        C91208Zqu.LIZ.LIZJ(str);
        C91204Zqq.LIZ.put(str, Long.valueOf(j));
        C91249ZrZ.LJIILIIL("full_song_anchor", "1");
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJI(long j, Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dailyMixAnchorClick musicId:");
        LIZ.append(j);
        LIZ.append(",fullClipId:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C51645KOr.LIZIZ.LJIILIIL(j, activity, "full_song_anchor", "track_reco", str);
        SVF.LJI(String.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJIJI(int i, int i2, String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        C2U8.LIZ(new C70502pi(awemeId, i, i2));
    }

    @Override // com.ss.android.ugc.aweme.dsp.service.IMusicDspService
    public final void LJIILIIL(long j, Context context, String str, String str2, String str3) {
        o.LJIIIZ(context, "context");
        L41.LIZ.getClass();
        if (L41.LIZJ()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//music/dsp_v2");
            buildRoute.withParam("enter_from", "");
            buildRoute.withParam("enter_method", str);
            if (C78685UuP.LJJJZ(str2)) {
                buildRoute.withParam("target_tab", str2);
            }
            if (C78685UuP.LJJJZ(str3)) {
                buildRoute.withParam("full_clip_id", str3);
            }
            if (j != 0) {
                buildRoute.withParam("music_id", j);
            }
            buildRoute.open();
            return;
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "//music/dsp");
        buildRoute2.withParam("enter_from", "");
        buildRoute2.withParam("enter_method", str);
        buildRoute2.open();
    }
}
