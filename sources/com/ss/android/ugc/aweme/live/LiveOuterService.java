package com.ss.android.ugc.aweme.live;

import X.AbstractC57425MgH;
import X.BBP;
import X.C05590Jv;
import X.C0JT;
import X.C16880lQ;
import X.C1PH;
import X.C26074ALe;
import X.C28838BTm;
import X.C29706BlG;
import X.C31130CJq;
import X.C32186CkA;
import X.C35692Dzc;
import X.C36933EeX;
import X.C38354F3m;
import X.C38957FQr;
import X.C40116Fom;
import X.C40191Fpz;
import X.C40192Fq0;
import X.C40342FsQ;
import X.C40343FsR;
import X.C40925G4j;
import X.C47192Ifc;
import X.C53508KzI;
import X.C54710Lda;
import X.C54742Le6;
import X.C55077LjV;
import X.C55382LoQ;
import X.C58096Mr6;
import X.C62046OWs;
import X.C71272Ry8;
import X.C72929Sjl;
import X.C73994T2g;
import X.C74740TUy;
import X.C78450Uqc;
import X.C78461Uqn;
import X.C78470Uqw;
import X.C78472Uqy;
import X.C78473Uqz;
import X.C78474Ur0;
import X.C78475Ur1;
import X.C78476Ur2;
import X.C78477Ur3;
import X.C78480Ur6;
import X.C78484UrA;
import X.C83575Wr5;
import X.C85990Xow;
import X.C86393XvR;
import X.C88074YhS;
import X.CN1;
import X.EF7;
import X.EnumC28411BDb;
import X.EnumC72797Shd;
import X.HG3;
import X.InterfaceC06390Mx;
import X.InterfaceC12570eT;
import X.InterfaceC30442Bx8;
import X.InterfaceC32188CkC;
import X.InterfaceC39796Fjc;
import X.InterfaceC78482Ur8;
import X.LQF;
import X.RBX;
import X.V2B;
import Y.ARunnableS16S0000000_9;
import Y.IDeS358S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubCenterToolsRedIdSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegradeSettings;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public class LiveOuterService implements ILiveOuterService {
    public C47192Ifc LIZ;
    public final C62046OWs LIZIZ = new C62046OWs();
    public boolean LIZJ = false;

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LIZJ() {
        LJJL(false);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C83575Wr5 LIZLLL() {
        LJJL(false);
        return new C83575Wr5();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C78461Uqn LJIILL() {
        LJJL(false);
        return C78470Uqw.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C71272Ry8 LJIJJ() {
        LJJL(false);
        return C71272Ry8.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIL() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C31130CJq LJJI() {
        LJJL(false);
        return C31130CJq.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C38957FQr LJJIIJ() {
        LJJL(false);
        if (C38957FQr.LIZ == null) {
            synchronized (C38957FQr.class) {
                if (C38957FQr.LIZ == null) {
                    C38957FQr.LIZ = new C38957FQr();
                }
            }
        }
        return C38957FQr.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJIJIIJIL() {
        LJJL(false);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C86393XvR LJJIJIL() {
        LJJL(false);
        return C78480Ur6.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C78473Uqz LJJJIL() {
        LJJL(false);
        return C78476Ur2.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C62046OWs LJJJJIZL() {
        LJJL(false);
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C78484UrA LJJJJJ() {
        LJJL(false);
        return C78484UrA.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJJJJL() {
        LJJL(false);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C54710Lda LJJJJL() {
        LJJL(false);
        return C54710Lda.LIZIZ;
    }

    public final C26074ALe LJJJZ() {
        LJJL(false);
        return C26074ALe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C28838BTm getLivePreloadService() {
        LJJL(false);
        return C28838BTm.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C55077LjV getLiveStateManager() {
        LJJL(false);
        return (C55077LjV) C55077LjV.LJIIJJI.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final V2B startLiveManager() {
        LJJL(false);
        return new V2B();
    }

    public static ILiveOuterService LJJJLL() {
        Object LIZ = C58096Mr6.LIZ(ILiveOuterService.class, false);
        if (LIZ != null) {
            return (ILiveOuterService) LIZ;
        }
        if (C58096Mr6.u2 == null) {
            synchronized (ILiveOuterService.class) {
                if (C58096Mr6.u2 == null) {
                    C58096Mr6.u2 = new LiveOuterService();
                }
            }
        }
        return C58096Mr6.u2;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C47192Ifc LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new C47192Ifc();
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIIL() {
        C78477Ur3.LIZIZ = new C78474Ur0();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C72929Sjl LJIILIIL() {
        return C72929Sjl.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C53508KzI LJJIII() {
        return new C53508KzI();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJIIZI() {
        if (!C29706BlG.LIZ) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            C40191Fpz c40191Fpz = new C40191Fpz();
            c40342FsQ.getClass();
            C40343FsR.LIZLLL.add(c40191Fpz);
            C40342FsQ.LJI(new C40192Fq0());
            C29706BlG.LIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LJJIJ() {
        return LiveCoverCameraSetting.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJIJLIJ() {
        C38354F3m.LIZJ(EF7.LJIILIIL, "local_test");
        LJJL(true);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LJJIL() {
        return FansClubCenterToolsRedIdSettings.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public C55382LoQ LJJIZ() {
        if (C55382LoQ.LJ == null) {
            synchronized (C55382LoQ.class) {
                if (C55382LoQ.LJ == null) {
                    C55382LoQ.LJ = new C55382LoQ();
                }
            }
        }
        return C55382LoQ.LJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C1PH LJJJI() {
        return new C1PH();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LJJJJ() {
        return InterfaceC30442Bx8.q2.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C73994T2g LJJJJLI() {
        return new C73994T2g();
    }

    public final boolean LJJJLZIJ() {
        return LiveAnimationDegradeSettings.INSTANCE.disableEntranceAnim();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean isBroadcastSmoothGoLive() {
        return BroadcastSmoothGoLiveSetting.INSTANCE.enable();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LJ() {
        return C74740TUy.LIZLLL().LJ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LJIILJJIL() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack == null || activityStack.length <= 0) {
            return false;
        }
        boolean z = false;
        for (Activity activity : activityStack) {
            if (activity.getClass() == ((IHostAction) CN1.LIZ(IHostAction.class)).getHostActivity(5) || activity.getClass() == ((IHostAction) CN1.LIZ(IHostAction.class)).getHostActivity(6) || activity.getClass() == ((IHostAction) CN1.LIZ(IHostAction.class)).getHostActivity(7)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LJJIJIIJI() {
        return Live.isInitedLiveSDK();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C54742Le6 LJIJ() {
        return C54742Le6.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C35692Dzc LJIJI() {
        return C35692Dzc.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIJJLI() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C36933EeX LJJIFFI() {
        return C36933EeX.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJII() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final InteractServiceDel LJJIIJZLJL() {
        return InteractServiceDel.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJFF(InterfaceC39796Fjc interfaceC39796Fjc) {
        if (Live.liveSDKInitedListenerSet == null) {
            Live.liveSDKInitedListenerSet = new CopyOnWriteArraySet();
        }
        Live.liveSDKInitedListenerSet.add(interfaceC39796Fjc);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            InterfaceC30442Bx8.q2.LIZJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIIIIZZ(Context context) {
        LiveStrategyManager.inst().doLocalDnsOperator(context);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIIIZ(C40116Fom c40116Fom) {
        ILiveSparkService iLiveSparkService = (ILiveSparkService) CN1.LIZ(ILiveSparkService.class);
        if (iLiveSparkService != null) {
            iLiveSparkService.aH(c40116Fom);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final BasePreviewSettingDialog LJIILLIIL(EnumC28411BDb enumC28411BDb) {
        InterfaceC12570eT broadcastPreviewService = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastPreviewService();
        BBP initialPage = enumC28411BDb.toBroadcastDialogPage();
        broadcastPreviewService.getClass();
        o.LJIIIZ(initialPage, "initialPage");
        BasePreviewSettingDialog basePreviewSettingDialog = new BasePreviewSettingDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("argument_initial_page", initialPage);
        bundle.putString("argument_entrance", "ecommerce_shop_bag");
        basePreviewSettingDialog.setArguments(bundle);
        return basePreviewSettingDialog;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final boolean LJIIZILJ(Activity activity) {
        return activity instanceof LivePlayActivity;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final DialogFragment LJJIJL(EnumC28411BDb enumC28411BDb) {
        return ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).OG(enumC28411BDb.toBroadcastDialogPage(), "ecommerce_shop_bag");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final LQF LJJJJLL(boolean z) {
        if (z) {
            LJJJLL().LJJIJLIJ();
            C78475Ur1.LIZ();
        }
        return LQF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJJJZ(long j) {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).upLoadLiveEcoEvent(j, 6);
    }

    public void LJJL(boolean z) {
        if (((Boolean) C88074YhS.LJ.getValue()).booleanValue() && this.LIZJ) {
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS16S0000000_9(4));
        if (Live.getService(z) != null) {
            this.LIZJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJIIJ(Context context, String schema) {
        o.LJIIIZ(schema, "schema");
        if (!s.LJJJLZIJ(schema, "__live_platform__=webcast", false)) {
            schema = UriProtector.parse(schema).buildUpon().appendQueryParameter("__live_platform__", "webcast").build().toString();
        }
        o.LJIIIIZZ(schema, "if (isLive && !schema.co…         schema\n        }");
        InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
        C05590Jv.LJ((IHybridContainerService) LIZ, context, schema);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final String LJJJ(Context context, Uri uri) {
        return C29706BlG.LIZ(uri);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJJJI(Context context, String str) {
        String str2;
        if (!C85990Xow.LJIIIZ() && TextUtils.equals("amazon", EF7.LJIILIIL)) {
            return;
        }
        String str3 = "";
        if (C78472Uqy.LIZ == null) {
            str3 = SharePrefCache.inst().getSharePref().getString(str, "");
        } else if (TextUtils.equals(str, "page_charge") && !TextUtils.isEmpty(C78472Uqy.LIZ.LIZ())) {
            str3 = C78472Uqy.LIZ.LIZ();
        } else if (TextUtils.equals(str, "page_index") && !TextUtils.isEmpty(C78472Uqy.LIZ.LIZIZ())) {
            str3 = C78472Uqy.LIZ.LIZIZ();
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = C78472Uqy.LIZ(str3);
        } else {
            str2 = "sslocal://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fwallet-main%2Fbalance%3Fuse_spark%3D1%26__live_platform__%3Dwebcast%26hide_status_bar%3D0%26hide_nav_bar%3D1%26trans_status_bar%3D1%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26no_hw%3D1%26awe_falcon%3Dsh%26loading_bg_color_light%3DFFFFFF%26loading_bg_color_dark%3D121212%26variant%3Dv3&bdhm_bid=tiktok_wallet_inapp_hybrid&bdhm_pid=/web-inapp/wallet-main/balance";
            if (TextUtils.equals(str, "page_index")) {
                str2 = C78472Uqy.LIZ("sslocal://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fwallet-main%2Fbalance%3Fuse_spark%3D1%26__live_platform__%3Dwebcast%26hide_status_bar%3D0%26hide_nav_bar%3D1%26trans_status_bar%3D1%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26no_hw%3D1%26awe_falcon%3Dsh%26loading_bg_color_light%3DFFFFFF%26loading_bg_color_dark%3D121212%26variant%3Dv3&bdhm_bid=tiktok_wallet_inapp_hybrid&bdhm_pid=/web-inapp/wallet-main/balance");
            } else if (TextUtils.equals(str, "page_charge")) {
                str2 = "aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fmain%2Fwallet%2Frecharge%3Fhide_status_bar%3D0%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26hide_nav_bar%3D1%26no_hw%3D1&hide_status_bar=0&flag=%2Fwallet%2Fhome&entry=settings&hide_nav_bar=1&no_hw=1&awe_falcon=sh";
            }
        }
        C16880lQ.LIZJ(context, AbstractC57425MgH.LJI(context, UriProtector.parse(str2)));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final C32186CkA LJJJJZI(InterfaceC32188CkC interfaceC32188CkC, EnumC72797Shd enumC72797Shd) {
        LJJL(false);
        return new C32186CkA(interfaceC32188CkC, enumC72797Shd);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJ(Fragment fragment, int i, Uri uri) {
        Intent intent = new Intent(fragment.mo49getActivity(), (Class<?>) LiveCoverCameraActivity.class);
        intent.putExtra("photoUri", uri);
        C16880lQ.LJII(fragment, intent, i);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void LJJJLIIL(Activity activity, int i, Uri uri) {
        Intent intent = new Intent(activity, (Class<?>) LiveCoverCameraActivity.class);
        intent.putExtra("photoUri", uri);
        C16880lQ.LJFF(activity, i, intent);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void jumpLiveSquareWithLogin(Context context, String str, String str2, InterfaceC78482Ur8 interfaceC78482Ur8) {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (context instanceof Activity) {
                Bundle LIZ = C0JT.LIZ("is_fullscreen_dialog", true, "is_skippable_dialog", false);
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZIZ = str;
                c78450Uqc.LIZJ = str2;
                c78450Uqc.LIZ = (Activity) context;
                c78450Uqc.LIZLLL = LIZ;
                c78450Uqc.LJ = new IDeS358S0100000_13(interfaceC78482Ur8, 3);
                C40925G4j.LIZ(c78450Uqc, AccountService.LJIJ().LJI());
                return;
            }
            return;
        }
        if (interfaceC78482Ur8 == null) {
            return;
        }
        interfaceC78482Ur8.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveOuterService
    public final void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager) {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showCppUnlockGuideDialogV2(str, str2, bool, fragmentManager);
    }
}
