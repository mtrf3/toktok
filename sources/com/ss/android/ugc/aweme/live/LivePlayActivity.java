package com.ss.android.ugc.aweme.live;

import X.B3D;
import X.B4K;
import X.B4T;
import X.B4Z;
import X.B57;
import X.BKJ;
import X.BLM;
import X.BZI;
import X.BZM;
import X.C08680Vs;
import X.C0NB;
import X.C0RP;
import X.C107794Kx;
import X.C15680jU;
import X.C16880lQ;
import X.C1IZ;
import X.C20910rv;
import X.C259710f;
import X.C259810g;
import X.C28643BLz;
import X.C28655BMl;
import X.C28668BMy;
import X.C28787BRn;
import X.C29121Bbp;
import X.C2U8;
import X.C35692Dzc;
import X.C37179EiV;
import X.C47121t6;
import X.C48697J9h;
import X.C49257JUv;
import X.C54154LNe;
import X.C54427LXr;
import X.C55661Lsv;
import X.C5HC;
import X.C65212Pia;
import X.C65803Ps7;
import X.C75792yF;
import X.C78480Ur6;
import X.C78847Ux1;
import X.C78939UyV;
import X.C78983UzD;
import X.C85827XmJ;
import X.C86145XrR;
import X.CN1;
import X.DIX;
import X.EnumC28203B5b;
import X.FUA;
import X.IG8;
import X.InterfaceC144185lG;
import X.InterfaceC15040iS;
import X.InterfaceC18010nF;
import X.InterfaceC27436Apk;
import X.InterfaceC28161B3l;
import X.InterfaceC28169B3t;
import X.InterfaceC45540Hu4;
import X.InterfaceC86147XrT;
import X.InterfaceC86148XrU;
import X.InterfaceC86394XvS;
import X.KL2;
import X.M6Y;
import X.NTI;
import X.O6U;
import X.OGB;
import X.QD3;
import X.TCS;
import X.VCK;
import X.VCN;
import X.X1D;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS16S0000000_9;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.ViewAutoPreloadOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNotSaveFragmentsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRepetitionTtlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class LivePlayActivity extends O6U implements OGB, InterfaceC28169B3t, InterfaceC18010nF, InterfaceC45540Hu4, InterfaceC28161B3l, TCS, InterfaceC86148XrU {
    public static long LJZI;
    public static volatile C35692Dzc LJZL;
    public Rect LJLIL;
    public B3D LJLILLLLZI;
    public B4K LJLJI;
    public boolean LJLJJI;
    public C85827XmJ LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC27436Apk LJLJL;
    public boolean LJLJLJ;
    public long LJLL;
    public int LJLJLLL = -1;
    public final Handler LJLLI = new Handler(Looper.myLooper());
    public final List<InterfaceC144185lG> LJLLILLLL = new ArrayList();
    public final ArrayList<C5HC> LJLLJ = new ArrayList<>();
    public final C49257JUv LJLLL = new C5HC() { // from class: X.JUv
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            JYH jyh = JYH.LIZIZ;
            if (jyh.LJIIJ() && i == 24) {
                jyh.LIZLLL("other", J1M.TURN_UP_VOLUME, J1O.STYLE_NO_BUTTON);
                return false;
            }
            if (!jyh.LJIIJ() || i != 25) {
                return false;
            }
            jyh.LIZLLL("other", J1M.TURN_DOWN_VOLUME, J1O.STYLE_NO_BUTTON);
            return false;
        }
    };
    public final C86145XrR LJLLLL = new InterfaceC15040iS() { // from class: X.XrR
        @Override // X.InterfaceC15040iS
        public final void accept(Object obj) {
            LivePlayActivity livePlayActivity = LivePlayActivity.this;
            C06W c06w = (C06W) obj;
            if (c06w != null) {
                B3D b3d = livePlayActivity.LJLILLLLZI;
                if (b3d != null) {
                    b3d.LLLIIII(c06w.LIZ);
                    return;
                }
                return;
            }
            livePlayActivity.getClass();
        }
    };
    public final ARunnableS16S0000000_9 LJLLLLLL = new ARunnableS16S0000000_9(1);
    public int LJLZ = -1;
    public boolean LJZ = false;

    @Override // X.O6U
    public final int LLFII() {
        return 0;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b4180";
    }

    @QD3
    public void onEvent(C107794Kx c107794Kx) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static M6Y LLII() {
        if (LJZL == null) {
            synchronized (LivePlayActivity.class) {
                if (LJZL == null) {
                    LJZL = C35692Dzc.LIZJ;
                }
            }
        }
        return LJZL;
    }

    @Override // X.InterfaceC28169B3t
    public final void LIZ() {
        C85827XmJ c85827XmJ = this.LJLJJL;
        if (c85827XmJ != null) {
            c85827XmJ.LJFF = false;
            KL2.LJIILLIIL(8, c85827XmJ.LIZIZ);
            c85827XmJ.LIZ();
        }
    }

    @Override // X.InterfaceC28169B3t
    public final void LJIJ() {
        C85827XmJ c85827XmJ = this.LJLJJL;
        if (c85827XmJ != null) {
            c85827XmJ.LIZLLL = false;
            KL2.LJIILLIIL(8, c85827XmJ.LJII);
            c85827XmJ.LIZ();
            C85827XmJ c85827XmJ2 = this.LJLJJL;
            if (c85827XmJ2.LIZLLL || c85827XmJ2.LJFF || c85827XmJ2.LJ) {
                return;
            }
            this.LJLJJL = null;
        }
    }

    @Override // X.InterfaceC28169B3t
    public final void LJJJJLI() {
        C85827XmJ c85827XmJ = this.LJLJJL;
        if (c85827XmJ != null) {
            c85827XmJ.LJ = false;
            KL2.LJIILLIIL(8, c85827XmJ.LIZJ);
            c85827XmJ.LIZ();
        }
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        long j;
        B4K b4k = this.LJLJI;
        if (b4k != null && b4k.dg()) {
            C08680Vs.LJIILJJIL.LIZJ = "close_btn";
            b4k.T5(false, true);
            return;
        }
        B3D b3d = this.LJLILLLLZI;
        if (b3d != null && (b3d.wc() instanceof InterfaceC86147XrT) && !((InterfaceC86147XrT) this.LJLILLLLZI.wc()).onBackPressed()) {
            super.onBackPressed();
        }
        if (this.LJLILLLLZI == null && this.LJLL == -3) {
            LiveForuTopLivesEnterOptSetting liveForuTopLivesEnterOptSetting = LiveForuTopLivesEnterOptSetting.INSTANCE;
            if (liveForuTopLivesEnterOptSetting.enable()) {
                EnterRoomConfig.TimeStamp timeStamp = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                if (timeStamp != null && timeStamp.enterRoomStarTimeReal > 0) {
                    j = System.currentTimeMillis() - timeStamp.enterRoomStarTimeReal;
                } else {
                    j = -1;
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_toplives_loading_quit");
                LIZ.LJIJJ(Long.valueOf(j), "duration");
                LIZ.LJIJJ("return", "quit_type");
                LIZ.LJJIIJZLJL();
                ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).nu0().getClass();
                if (liveForuTopLivesEnterOptSetting.cancelFeed()) {
                    BLM.LIZIZ();
                }
                BLM.LIZ = false;
                super.onBackPressed();
            }
        }
        C54154LNe.LJ("live_2_feed", C54154LNe.LIZIZ(this));
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        B3D b3d = this.LJLILLLLZI;
        if (b3d != null && b3d.getCurrentFragment() != null) {
            BKJ currentFragment = this.LJLILLLLZI.getCurrentFragment();
            if (currentFragment.B2() != null) {
                Room B2 = currentFragment.B2();
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", Long.toString(B2.getId()));
                if (B2.getOwner() != null && B2.getOwner().getAvatarThumb() != null) {
                    ImageModel avatarThumb = B2.getOwner().getAvatarThumb();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("uri", avatarThumb.mUri);
                    hashMap2.put("url_list", avatarThumb.mUrls);
                    hashMap.put("avatar_thumb", C75792yF.LIZJ(hashMap2));
                }
                if (currentFragment.Jj() != null && currentFragment.Jj().mRoomsData.adLiveEnterRoomConfig != null) {
                    hashMap.put("adLiveJson", C75792yF.LIZJ(currentFragment.Jj().mRoomsData.adLiveEnterRoomConfig));
                }
                return hashMap;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC28161B3l
    public final void LLD() {
        InterfaceC86394XvS liteService = Live.getLiteService();
        if (liteService != null) {
            this.LJLJI = liteService.r6(this, (BZM) findViewById(R.id.j7o), R.id.fxw);
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        String str;
        List<ActivityManager.AppTask> appTasks;
        String str2;
        RoomStatus roomStatus;
        if (getIntent() != null) {
            str = C16880lQ.LLJJIJIIJIL(getIntent(), "backurl");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            Intent intent = getIntent();
            if (intent != null && (roomStatus = (RoomStatus) intent.getParcelableExtra("host_room_status_event")) != null) {
                C1IZ c1iz = new C1IZ();
                c1iz.LJLILLLLZI = roomStatus.anchorId;
                c1iz.LJLIL = roomStatus.roomId;
                c1iz.LJLJI = roomStatus.isFinish;
                C2U8.LIZ(c1iz);
                LiveHostOuterService.LIZJ().LIZIZ(this, c1iz.LJLJI, this.LJLJJI);
            }
            if (this.LJLIL != null && getIntent() != null) {
                long longExtra = getIntent().getLongExtra("current_room_id", 0L);
                boolean booleanExtra = getIntent().getBooleanExtra("has_page_slide", false);
                if (longExtra > 0 && booleanExtra) {
                    C2U8.LIZ(new C54427LXr(longExtra));
                }
            }
        }
        super.finish();
        if (!AwemeApplicationServiceImpl.LIZ().isAppHot() && this.LJLJLJ && isTaskRoot()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//main");
            buildRoute.addFlags(67108864);
            buildRoute.withParam("tab", this.LJLJLLL);
            if (this.LJLJLLL != 0) {
                str2 = "For You";
            } else {
                str2 = "Following";
            }
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", str2);
            buildRoute.open();
            return;
        }
        LiveOuterService.LJJJLL().LJIIJJI();
        if (C55661Lsv.LJIIJJI()) {
            ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Uu();
            SmartRoute buildRoute2 = SmartRouter.buildRoute(this, "//main");
            buildRoute2.withParam("tab", 1);
            buildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            buildRoute2.addFlags(67108864);
            buildRoute2.open();
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            C78939UyV.LJJJJ(this);
            return;
        }
        if (!isTaskRoot() || getIntent() == null) {
            return;
        }
        C78939UyV.LJJJJ(this);
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack == null) {
            return;
        }
        if ((activityStack.length == 1 && activityStack[0].equals(this)) || (appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks()) == null || appTasks.size() <= 1) {
            return;
        }
        ((ActivityManager.AppTask) DIX.LIZJ(appTasks, 1, appTasks)).moveToFront();
    }

    @Override // android.app.Activity
    public final int getRequestedOrientation() {
        if (!RoomSlowFunctionOptSetting.roomBuildOpt()) {
            return super.getRequestedOrientation();
        }
        if (this.LJLZ == -1) {
            this.LJLZ = super.getRequestedOrientation();
        }
        return this.LJLZ;
    }

    @Override // android.app.Activity
    public final boolean isInPictureInPictureMode() {
        if (RoomSlowFunctionOptSetting.roomBuildOpt()) {
            return this.LJZ;
        }
        return super.isInPictureInPictureMode();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        try {
            super.onDestroy();
            C37179EiV.LJFF.post(new ARunnableS15S0101000_11(2, C15680jU.LIZ, 2));
            C20910rv.LJIILLIIL(this);
            C08680Vs.LJIILJJIL.LIZ();
            C28655BMl LIZ = B4T.LIZ();
            LIZ.LIZ = null;
            LIZ.LJII = 0;
            LIZ.LJ = null;
            LIZ.LJFF = null;
            LIZ.LIZJ = false;
            LIZ.LIZIZ = null;
            LIZ.LJI = null;
            LIZ.LIZLLL = true;
            Live.getService().d9();
            Live.getService().LJJLIIIIJ(this);
            Live.getService().LJJIJ();
            Live.getService().LJIILL(false);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "player_tag");
            if (LLJJIJIIJIL != null && Live.getService() != null) {
                Live.getService().LJJLIIIJJI(LLJJIJIIJIL);
            }
            if (this.LJLILLLLZI == null) {
                B57.LIZ.LIZ().LIZIZ(new Event("liveplay_activity_ondestory", 33817, EnumC28203B5b.SdkInterfaceCall));
            }
            if (this.LJLJJLL) {
                C2U8.LIZ(new IG8(true));
            }
            if (LiveRepetitionTtlSetting.INSTANCE.getValue().enableLivePetitionShow > 0) {
                C28668BMy.LIZ.clear();
                C28668BMy.LIZIZ.clear();
                C28668BMy.LJFF(0);
            }
            this.LJLLI.removeCallbacksAndMessages(null);
            VCN.LIZIZ(this, VCK.LIVE_PLAY);
            removeOnPictureInPictureModeChangedListener(this.LJLLLL);
            Live.getLiteService().W5(C16880lQ.LJLLJ(getClass()));
            C29121Bbp.LIZ();
        } catch (Throwable th) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            try {
                List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
                o.LJIIIIZZ(LJJJJLI, "activity.supportFragmentManager.fragments");
                Iterator<Fragment> it = LJJJJLI.iterator();
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Fragment next = it.next();
                    String LJLLILLLL = C16880lQ.LJLLILLLL(next.getClass());
                    if (LJLLILLLL != null) {
                        str = LJLLILLLL;
                    }
                    jSONObject2.put(str, C48697J9h.LIZIZ(next.getView()));
                }
                Iterator it2 = ((ArrayList) C48697J9h.LJI(this)).iterator();
                while (it2.hasNext()) {
                    Fragment fragment = (Fragment) it2.next();
                    String LJLLILLLL2 = C16880lQ.LJLLILLLL(fragment.getClass());
                    if (LJLLILLLL2 == null) {
                        LJLLILLLL2 = "";
                    }
                    jSONObject3.put(LJLLILLLL2, C48697J9h.LIZIZ(fragment.getView()));
                }
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get fragment null view has exception, e:");
                LIZ2.append(e);
                C0NB.LJ("ttlive_exception", X1D.LIZIZ(LIZ2));
                jSONObject.put("exception", e.getMessage());
            }
            jSONObject.put("direct_fragments", jSONObject2);
            jSONObject.put("target_deep_fragments", jSONObject3);
            if (C65212Pia.LIZ != null) {
                try {
                    if (!TextUtils.isEmpty("ttlive_java_exception_log")) {
                        jSONObject.put("service", "ttlive_java_exception_log");
                    }
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                C65212Pia.LIZ.getClass();
                FUA.LIZJ("live_client_monitor_log", jSONObject);
            }
            String LIZLLL = C48697J9h.LIZLLL(this);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("LIVE_PLAY_ON_DESTROY:");
            LIZ3.append(LIZLLL);
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ3));
        }
        C259810g c259810g = C259710f.LIZ;
        c259810g.LJIILL = false;
        C47121t6.LJLLILLLL = false;
        c259810g.LJIILJJIL = false;
        C0RP.LIZIZ = false;
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        unRegisterActivityOnKeyDownListener(this.LJLLL);
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        super.onResume();
        registerActivityOnKeyDownListener(this.LJLLL);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        B3D b3d = this.LJLILLLLZI;
        if (b3d != null) {
            b3d.LJLJJL();
        }
    }

    @Override // X.InterfaceC28161B3l
    public final B4K LJIJJLI() {
        return this.LJLJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x020e, code lost:
    
        if (((java.lang.Integer) r11.getMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE).invoke(r11, new java.lang.String("ro.miui.notch"), new java.lang.Integer(0))).intValue() != 1) goto L61;
     */
    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LivePlayActivity.onCreate(android.os.Bundle):void");
    }

    @QD3
    public void onEvent(NTI nti) {
        if (Live.getService() != null) {
            Live.getService().LJJJJJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if ((r2 instanceof X.B3D) != false) goto L17;
     */
    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LivePlayActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        this.LJZ = z;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        B57.LIZ.LIZIZ(bundle);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (LiveNotSaveFragmentsSetting.INSTANCE.getValue() && bundle != null) {
            bundle.remove("android:support:fragments");
        }
        C28643BLz c28643BLz = B57.LIZ;
        if (bundle != null) {
            bundle.putString("enter_room_session_id", c28643BLz.LIZIZ);
            bundle.putParcelable("enter_room_session", c28643BLz.LIZ());
            bundle.putString("first_enter_room_session_id", c28643BLz.LIZJ);
            bundle.putString("live_session_id", c28643BLz.LIZLLL);
            return;
        }
        c28643BLz.getClass();
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC c5hc) {
        this.LJLLJ.add(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
        ListProtector.add(this.LJLLJ, 0, c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LJLLILLLL).add(interfaceC144185lG);
    }

    @Override // X.OGB
    public final void setActivityResultListener(InterfaceC27436Apk interfaceC27436Apk) {
        this.LJLJL = interfaceC27436Apk;
    }

    @Override // X.C1AU, android.app.Activity
    public final void setRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
        this.LJLZ = i;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (getIntent().getBooleanExtra("smooth_enter_room", false)) {
            super.setTheme(R.style.a91);
        } else {
            super.setTheme(R.style.a90);
        }
        if (C259710f.LIZ.LJII(this)) {
            super.setTheme(R.style.ux);
        }
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC c5hc) {
        this.LJLLJ.remove(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LJLLILLLL).remove(interfaceC144185lG);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)|4|(3:106|107|108)(2:8|(3:10|11|12)(2:101|(7:19|(1:21)|22|(2:24|(1:26))(2:93|(1:97))|27|28|(3:30|31|32)(7:33|(4:35|(1:37)(1:86)|38|(1:40))|87|(1:89)|42|43|(2:84|85)(20:47|(1:83)|51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|(2:65|(1:67))|68|(1:70)|71|(1:73)(1:82)|74|(1:76)|77|(2:79|80)(1:81))))(2:16|17)))|13|(0)|19|(0)|22|(0)(0)|27|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018f, code lost:
    
        if (r7.LLI > 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013f, code lost:
    
        if (r7.LLFII != null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLIIIJ(final android.content.Context r16, final com.bytedance.android.livesdkapi.session.EnterRoomConfig r17) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LivePlayActivity.LLIIIJ(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<C5HC> arrayList = this.LJLLJ;
        if (arrayList != null) {
            Iterator<C5HC> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static void LLIIIILZ(Context context, EnterRoomConfig enterRoomConfig, long j) {
        boolean z;
        HashMap<String, String> hashMap;
        String str;
        if (ViewAutoPreloadOptSetting.INSTANCE.getEnable()) {
            C78480Ur6.LIZ.U();
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        if (roomsData.enterType == null) {
            if (enterRoomConfig.mLogData.loadDuration > 0) {
                str = "draw";
            } else {
                str = "click";
            }
            roomsData.enterType = str;
        }
        B4Z w = Live.getService().w();
        if (w != null) {
            if (C78847Ux1.LJJJIL(enterRoomConfig) && ECommerceLiveServiceImpl.LJFF().V9()) {
                z = true;
                enterRoomConfig.mECData.isPrefetchPinEnabled = 1;
            } else {
                z = false;
                enterRoomConfig.mECData.isPrefetchPinEnabled = 0;
            }
            w.LIZ(context, enterRoomConfig);
            if (z) {
                HashMap<String, String> hashMap2 = new HashMap<>();
                EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
                if (eCWrapData != null && (hashMap = eCWrapData.ecCommonExtraParam) != null) {
                    hashMap2.putAll(hashMap);
                }
                ECommerceLiveServiceImpl.LJFF().p8(j, hashMap2, null);
            }
        }
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((ArrayList) this.LJLLILLLL).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        InterfaceC27436Apk interfaceC27436Apk = this.LJLJL;
        if (interfaceC27436Apk != null) {
            interfaceC27436Apk.onActivityResult(i, i2, intent);
        }
    }
}
