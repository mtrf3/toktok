package com.ss.android.ugc.aweme.share;

import X.AV1;
import X.C16880lQ;
import X.C29S;
import X.C36922EeM;
import X.C43706HDi;
import X.C43722HDy;
import X.C43723HDz;
import X.C44014HPe;
import X.C45827Hyh;
import X.C45828Hyi;
import X.C45829Hyj;
import X.C45837Hyr;
import X.C45838Hys;
import X.C48841JEv;
import X.C5S1;
import X.C61099NyR;
import X.C64962gm;
import X.C65803Ps7;
import X.C70822qE;
import X.C70832qF;
import X.C78598Ut0;
import X.C78613UtF;
import X.C79004UzY;
import X.EnumC70862qI;
import X.FCD;
import X.FMX;
import X.T2R;
import X.XKX;
import Y.AObserverS75S0100000_7;
import Y.IDeS403S0100000_7;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.openshare.Share$Request;
import com.ss.android.ugc.aweme.openshare.Share$Response;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SystemShareActivity extends C29S {
    public final C45838Hys LJLIL;
    public C43722HDy LJLILLLLZI;
    public Share$Request LJLJI;
    public C45827Hyh LJLJJI;
    public IOpenPlatformService LJLJJL;
    public String LJLJJLL;
    public final C64962gm LJLJL;
    public final CreativeInfo LJLJLJ;
    public final AObserverS75S0100000_7 LJLJLLL;
    public final AObserverS75S0100000_7 LJLL;

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public SystemShareActivity() {
        new LinkedHashMap();
        this.LJLIL = new C45838Hys();
        this.LJLJJLL = "";
        this.LJLJL = C48841JEv.LIZ(T2R.LJIIJJI().plus(C78613UtF.LIZJ));
        this.LJLJLJ = new CreativeInfo(null, 0, null, 7, null);
        this.LJLJLLL = new AObserverS75S0100000_7(this, 18);
        this.LJLL = new AObserverS75S0100000_7(this, 17);
    }

    public final void LLFII() {
        C43722HDy c43722HDy = this.LJLILLLLZI;
        if (c43722HDy != null) {
            c43722HDy.mShareMediaType = this.LJLIL.LIZ();
            String callingPackage = getCallingPackage();
            if (callingPackage == null) {
                Share$Request share$Request = this.LJLJI;
                if (share$Request != null) {
                    callingPackage = share$Request.getCallerPackage();
                } else {
                    o.LJIJI("shareRequest");
                    throw null;
                }
            }
            C45827Hyh c45827Hyh = new C45827Hyh(this.LJLIL, this.LJLJLJ.getCreationId(), callingPackage);
            this.LJLJJI = c45827Hyh;
            C43722HDy c43722HDy2 = this.LJLILLLLZI;
            if (c43722HDy2 != null) {
                c45827Hyh.LIZIZ(this, c43722HDy2);
                c45827Hyh.LJ.observeForever(this.LJLL);
                c45827Hyh.LJI.observeForever(this.LJLJLLL);
                return;
            }
            o.LJIJI("shareContext");
            throw null;
        }
        o.LJIJI("shareContext");
        throw null;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        C45827Hyh c45827Hyh = this.LJLJJI;
        if (c45827Hyh != null) {
            c45827Hyh.LJI.removeObserver(this.LJLJLLL);
            C45827Hyh c45827Hyh2 = this.LJLJJI;
            if (c45827Hyh2 != null) {
                c45827Hyh2.LJ.removeObserver(this.LJLL);
            } else {
                o.LJIJI("shareActionHelper");
                throw null;
            }
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    public final void LLII(C45837Hyr c45837Hyr) {
        String str;
        C43722HDy c43722HDy = this.LJLILLLLZI;
        if (c43722HDy != null) {
            String LIZJ = C43706HDi.LIZJ(c43722HDy);
            if (c45837Hyr.LJLIL) {
                str = "success";
            } else {
                str = "fail";
            }
            C45828Hyi errorStatus = c45837Hyr.LJLILLLLZI;
            String str2 = this.LJLJJLL;
            C43722HDy c43722HDy2 = this.LJLILLLLZI;
            if (c43722HDy2 != null) {
                String sdkNameForServer = c43722HDy2.getSdkNameForServer();
                o.LJIIIIZZ(sdkNameForServer, "shareContext.sdkNameForServer");
                C43722HDy c43722HDy3 = this.LJLILLLLZI;
                if (c43722HDy3 != null) {
                    String str3 = c43722HDy3.mSdkVersion;
                    o.LJIIIIZZ(str3, "shareContext.mSdkVersion");
                    C45838Hys shareDistinctType = this.LJLIL;
                    o.LJIIIZ(errorStatus, "errorStatus");
                    o.LJIIIZ(shareDistinctType, "shareDistinctType");
                    FMX.LJIIL("open_share_check", C45829Hyj.LIZ(LIZJ, str, errorStatus, str2, sdkNameForServer, str3, shareDistinctType.LIZ(), shareDistinctType.LIZIZ.size()).LIZ);
                    IOpenPlatformService iOpenPlatformService = this.LJLJJL;
                    if (iOpenPlatformService != null) {
                        Intent intent = getIntent();
                        o.LJIIIIZZ(intent, "intent");
                        if (iOpenPlatformService.LIZIZ(intent)) {
                            if (!c45837Hyr.LJLIL) {
                                IShareRespSendService LJ = ShareRespSendServiceImpl.LJ();
                                C43722HDy c43722HDy4 = this.LJLILLLLZI;
                                if (c43722HDy4 != null) {
                                    Share$Request share$Request = this.LJLJI;
                                    if (share$Request != null) {
                                        C45828Hyi c45828Hyi = c45837Hyr.LJLILLLLZI;
                                        Share$Response share$Response = new Share$Response();
                                        share$Response.errorCode = c45828Hyi.LIZ;
                                        share$Response.setSubErrorCode(c45828Hyi.LIZIZ);
                                        share$Response.errorMsg = c45828Hyi.LIZJ;
                                        share$Response.setState(share$Request.getMState());
                                        LJ.LIZIZ(this, c43722HDy4, share$Request, share$Response);
                                        return;
                                    }
                                    o.LJIJI("shareRequest");
                                    throw null;
                                }
                                o.LJIJI("shareContext");
                                throw null;
                            }
                            return;
                        }
                        if (c45837Hyr.LJLIL) {
                            return;
                        }
                        C5S1 c5s1 = new C5S1(C16880lQ.LLLLLLIL(this));
                        c5s1.LIZLLL(getString(c45837Hyr.LJLJI));
                        c5s1.LJ();
                        if (e1.LIZ(31744, "should_stay_in_tiktok", true, false)) {
                            Intent LIZIZ = FCD.LIZIZ(this, getPackageName());
                            LIZIZ.addFlags(335544320);
                            C78598Ut0.LJIJJ(LIZIZ, this);
                            startActivity(LIZIZ);
                        }
                        finish();
                        return;
                    }
                    o.LJIJI("openPlatformService");
                    throw null;
                }
                o.LJIJI("shareContext");
                throw null;
            }
            o.LJIJI("shareContext");
            throw null;
        }
        o.LJIJI("shareContext");
        throw null;
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        C61099NyR LIZIZ;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LJLJJL = OpenPlatformServiceImpl.LJ();
        Intent intent = getIntent();
        o.LJIIIIZZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            this.LJLILLLLZI = new C43722HDy(LLJJIJI);
        }
        C43722HDy c43722HDy = this.LJLILLLLZI;
        if (c43722HDy == null) {
            C43723HDz.LIZ();
        } else {
            Share$Request LIZLLL = C43723HDz.LIZLLL(c43722HDy.getShareRequestBundle());
            if (LIZLLL != null) {
                this.LJLJI = LIZLLL;
            }
            if (this.LJLJI == null) {
                C43723HDz.LIZ();
            } else {
                if (AV1.LJIIJJI()) {
                    C45828Hyi c45828Hyi = C45828Hyi.LJIILLIIL;
                    C36922EeM.LJ(c45828Hyi.LIZJ);
                    LLII(new C45837Hyr(false, c45828Hyi, R.string.qb9));
                }
                if (Build.VERSION.SDK_INT < 33) {
                    strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
                    LIZIZ = C61099NyR.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-opensdk_permission"));
                } else {
                    strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO"};
                    LIZIZ = C61099NyR.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-opensdk_sdk33_permission"));
                }
                LIZIZ.LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new IDeS403S0100000_7(this, 1));
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.SystemShareActivity", "onCreate", false);
    }

    public final void LLFZ(ArrayList<String> arrayList, EnumC70862qI enumC70862qI) {
        boolean z;
        if (!C79004UzY.LJJIFFI(arrayList)) {
            int i = 1;
            if (arrayList != null && arrayList.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Uri parse = UriProtector.parse((String) ListProtector.get(arrayList, 0));
                if (ujb.o.LJJJJIZL("content", parse.getScheme(), true)) {
                    XKX.LIZLLL(this.LJLJL, null, null, new C70832qF(this, parse, enumC70862qI, null), 3);
                } else {
                    C45838Hys c45838Hys = this.LJLIL;
                    if (enumC70862qI != EnumC70862qI.IMAGE) {
                        i = 2;
                    }
                    c45838Hys.LIZ = i;
                    o.LJIIIZ(arrayList, "<set-?>");
                    c45838Hys.LIZIZ = arrayList;
                    LLFII();
                }
            } else {
                XKX.LIZLLL(this.LJLJL, null, null, new C70822qE(arrayList, this, enumC70862qI, null), 3);
            }
            C44014HPe.LIZ("system_share");
            return;
        }
        IShareRespSendService LJ = ShareRespSendServiceImpl.LJ();
        C43722HDy c43722HDy = this.LJLILLLLZI;
        if (c43722HDy != null) {
            LJ.LIZJ(this, c43722HDy, C45828Hyi.LJIIIIZZ);
        } else {
            o.LJIJI("shareContext");
            throw null;
        }
    }
}
