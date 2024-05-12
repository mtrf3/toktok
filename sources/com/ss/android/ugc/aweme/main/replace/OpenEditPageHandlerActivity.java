package com.ss.android.ugc.aweme.main.replace;

import X.AV1;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C26045AKb;
import X.C2NU;
import X.C38816FLg;
import X.C39579Fg7;
import X.C42278GiY;
import X.C42279GiZ;
import X.C42393GkP;
import X.C42402GkY;
import X.C65803Ps7;
import X.HG3;
import X.MEX;
import X.ProgressDialogC43241Gy5;
import X.RBX;
import Y.ARunnableS2S2100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OpenEditPageHandlerActivity extends ActivityC86117Xqz {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onResume", false);
    }

    public static void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(OpenEditPageHandlerActivity openEditPageHandlerActivity) {
        openEditPageHandlerActivity.com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                openEditPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(OpenEditPageHandlerActivity openEditPageHandlerActivity) {
        com_ss_android_ugc_aweme_main_replace_OpenEditPageHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(openEditPageHandlerActivity);
        try {
            openEditPageHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onCreate", true);
        super.onCreate(bundle);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "type");
        if (LLJJIJIIJIL != null) {
            int hashCode = LLJJIJIIJIL.hashCode();
            if (hashCode != -2117777931) {
                if (hashCode == -1039745817 && LLJJIJIIJIL.equals("normal")) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(this, "//openVideoEdit");
                    buildRoute.withParam("media_path", C16880lQ.LLJJIJIIJIL(getIntent(), "media_path"));
                    buildRoute.withParam("upload_type", C16880lQ.LLJJIJIIJIL(getIntent(), "upload_type"));
                    buildRoute.withParam("assets", C16880lQ.LLJJIJIIJIL(getIntent(), "assets"));
                    buildRoute.withParam("shoot_way", C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way"));
                    buildRoute.withParam("anchors", C16880lQ.LLJJIJIIJIL(getIntent(), "anchors"));
                    buildRoute.withParam("challenge_id", C16880lQ.LLJJIJIIJIL(getIntent(), "challenge_id"));
                    buildRoute.withParam("challenge_name", C16880lQ.LLJJIJIIJIL(getIntent(), "challenge_name"));
                    buildRoute.withParam("creation_id", C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id"));
                    buildRoute.withParam("extra", C16880lQ.LLJJIJIIJIL(getIntent(), "extra"));
                    buildRoute.withParam("from_deeplink", getIntent().getBooleanExtra("from_deeplink", false));
                    buildRoute.withParam("creative_initial_model", C16880lQ.LLJJIJIIJIL(getIntent(), "creative_initial_model"));
                    buildRoute.open();
                }
            } else if (LLJJIJIIJIL.equals("ban_music")) {
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "aweme_id");
                String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
                if (LLJJIJIIJIL3 == null) {
                    LLJJIJIIJIL3 = "";
                }
                if (TextUtils.isEmpty(LLJJIJIIJIL2)) {
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onCreate", false);
                    return;
                }
                if (LLJJIJIIJIL2 != null) {
                    C42393GkP c42393GkP = new C42393GkP();
                    c42393GkP.LIZ = this;
                    c42393GkP.LIZIZ = LLJJIJIIJIL3;
                    if (!AV1.LJIIJJI()) {
                        if (!C39579Fg7.LJIILL()) {
                            Activity activity = c42393GkP.LIZ;
                            if (activity != null) {
                                C26045AKb c26045AKb = new C26045AKb(activity);
                                c26045AKb.LJIIIIZZ(R.string.qb7);
                                c26045AKb.LJIIJ();
                            } else {
                                o.LJIJI("mContext");
                                throw null;
                            }
                        } else if (C39579Fg7.LJIILIIL() < 20971520) {
                            Activity activity2 = c42393GkP.LIZ;
                            if (activity2 != null) {
                                C26045AKb c26045AKb2 = new C26045AKb(activity2);
                                c26045AKb2.LJIIIIZZ(R.string.qb7);
                                c26045AKb2.LJIIJ();
                            } else {
                                o.LJIJI("mContext");
                                throw null;
                            }
                        } else if (((RBX) HG3.LJIILL()).isLogin()) {
                            if (C2NU.LIZ.LIZIZ()) {
                                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
                                if (MEX.LJFF()) {
                                    if (c42393GkP.LIZLLL == null) {
                                        C42279GiZ c42279GiZ = C42279GiZ.LIZ;
                                        Activity activity3 = c42393GkP.LIZ;
                                        if (activity3 != null) {
                                            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                                            creativeLoadingDialogBuilder.showProgress(false);
                                            creativeLoadingDialogBuilder.backCanCancel(true);
                                            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
                                            Activity activity4 = c42393GkP.LIZ;
                                            if (activity4 != null) {
                                                String string = activity4.getResources().getString(R.string.f0g);
                                                o.LJIIIIZZ(string, "mContext.resources.getSt…g.duet_downloading_video)");
                                                creativeLoadingDialogBuilder.loadingMessage(string);
                                                creativeLoadingDialogBuilder.clickCancelListener(C42402GkY.LJLIL);
                                                c42393GkP.LIZLLL = (C42278GiY) c42279GiZ.createLoadingDialog(activity3, 1901, creativeLoadingDialogBuilder);
                                            } else {
                                                o.LJIJI("mContext");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("mContext");
                                            throw null;
                                        }
                                    }
                                    C42278GiY c42278GiY = c42393GkP.LIZLLL;
                                    if (c42278GiY != null) {
                                        c42278GiY.show();
                                    }
                                } else {
                                    if (c42393GkP.LIZJ == null) {
                                        Activity activity5 = c42393GkP.LIZ;
                                        if (activity5 != null) {
                                            c42393GkP.LIZJ = ProgressDialogC43241Gy5.LIZIZ(activity5, activity5.getResources().getString(R.string.f0g));
                                        } else {
                                            o.LJIJI("mContext");
                                            throw null;
                                        }
                                    }
                                    ProgressDialogC43241Gy5 progressDialogC43241Gy5 = c42393GkP.LIZJ;
                                    if (progressDialogC43241Gy5 != null) {
                                        progressDialogC43241Gy5.setIndeterminate(false);
                                    }
                                    ProgressDialogC43241Gy5 progressDialogC43241Gy52 = c42393GkP.LIZJ;
                                    if (progressDialogC43241Gy52 != null) {
                                        progressDialogC43241Gy52.setProgress(0);
                                    }
                                }
                                C38816FLg.LJ(new ARunnableS2S2100000_7(c42393GkP, LLJJIJIIJIL2, LLJJIJIIJIL3, 3));
                            } else {
                                Activity activity6 = c42393GkP.LIZ;
                                if (activity6 != null) {
                                    C26045AKb c26045AKb3 = new C26045AKb(activity6);
                                    c26045AKb3.LJIIIIZZ(R.string.imh);
                                    c26045AKb3.LJIIJ();
                                } else {
                                    o.LJIJI("mContext");
                                    throw null;
                                }
                            }
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onCreate", false);
                    throw illegalArgumentException;
                }
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onCreate", false);
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity", "onCreate", false);
    }
}
