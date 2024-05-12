package X;

import X.C0RN;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.LNO;
import Y.AfS32S0201000_11;
import Y.AfS37S0000000_5;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import yq4.a;

/* loaded from: classes10.dex */
public final class LNO implements LM4 {
    public C51588KMm LJLIL;
    public C59613NaT LJLILLLLZI;
    public final LNP LJLJI;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388629;
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onDestroyView() {
    }

    @Override // X.LM4
    public final void onResume() {
    }

    public final boolean LIZLLL() {
        LNP lnp = this.LJLJI;
        if (lnp != null && lnp.getActivity() != null && !this.LJLJI.getActivity().isFinishing() && !this.LJLJI.getActivity().isDestroyed()) {
            return true;
        }
        return false;
    }

    @Override // X.LM4
    public final String getTag() {
        return LMF.SPECIAL.getTag();
    }

    @Override // X.LM4
    public final void onPause() {
        if (this.LJLILLLLZI != null) {
            C54352LUu LIZLLL = C54352LUu.LIZLLL();
            C59613NaT c59613NaT = this.LJLILLLLZI;
            LIZLLL.getClass();
            if (!TextUtils.isEmpty("/ies-cdn-alisg/tiktok_activities/covid19") && c59613NaT != null) {
                synchronized (LIZLLL.LJ) {
                    ViewGroup viewGroup = (ViewGroup) c59613NaT.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c59613NaT, viewGroup);
                    }
                    Context context = c59613NaT.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(EF7.LIZIZ());
                    }
                    ((HashMap) LIZLLL.LIZJ).put("/ies-cdn-alisg/tiktok_activities/covid19", c59613NaT);
                }
            }
            this.LJLILLLLZI = null;
        }
    }

    public static SpecialTopicEntry LJI() {
        try {
            FFL.LJIIIZ().getClass();
            return (SpecialTopicEntry) FFL.LJIILLIIL(SpecialTopicEntry.class, "special_event_entrypoint", true);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.LM4
    public final View LJII() {
        final WebViewPreloadEntry webViewPreloadEntry;
        SpecialTopicEntry LJI = LJI();
        if (LJI == null) {
            return null;
        }
        try {
            FFL.LJIIIZ().getClass();
            webViewPreloadEntry = (WebViewPreloadEntry) FFL.LJIILLIIL(WebViewPreloadEntry.class, "webview_preload_entry_ab", true);
        } catch (Throwable unused) {
            webViewPreloadEntry = null;
        }
        if (webViewPreloadEntry == null) {
            try {
                SettingsManager.LIZLLL().getClass();
                webViewPreloadEntry = (WebViewPreloadEntry) SettingsManager.LJII("webview_preload_entry", WebViewPreloadEntry.class);
            } catch (Throwable unused2) {
            }
        }
        if (webViewPreloadEntry != null && !TextUtils.isEmpty(webViewPreloadEntry.getUrl())) {
            if (webViewPreloadEntry.isBackground()) {
                C84763XOl.LJI().LJJJLIIL(new AfS32S0201000_11(0, this, webViewPreloadEntry, 3), new AfS37S0000000_5(12));
            } else {
                EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
                LIZJ.LIZIZ(new EE1() { // from class: com.bytedance.tiktok.homepage.mainfragment.toolbar.SpecialEventIconGenerator$1
                    @Override // X.EEY
                    public final String key() {
                        return "SpecialEventIconGenerator$1";
                    }

                    @Override // X.EEY
                    public final /* synthetic */ boolean meetTrigger() {
                        return true;
                    }

                    @Override // X.EEY
                    public final /* synthetic */ String prefix() {
                        return "task_";
                    }

                    @Override // X.EE1
                    public final /* synthetic */ boolean serialExecute() {
                        return false;
                    }

                    @Override // X.EEY
                    public final /* synthetic */ int targetProcess() {
                        return C0RN.LIZ();
                    }

                    @Override // X.EEY
                    public final /* synthetic */ List triggerOtherLegoComponents() {
                        return null;
                    }

                    @Override // X.EEY
                    public final /* synthetic */ EnumC36103EEx triggerType() {
                        return C0RN.LIZIZ(this);
                    }

                    @Override // X.EEY
                    public final EnumC36092EEm scenesType() {
                        return EnumC36092EEm.DEFAULT;
                    }

                    @Override // X.EE1
                    public final EFK type() {
                        return EFK.BOOT_FINISH;
                    }

                    @Override // X.EEY
                    public final void run(Context context) {
                        LNO.this.LJIIIIZZ(webViewPreloadEntry.getDelay(), webViewPreloadEntry.getUrl(), webViewPreloadEntry.isNeedRender());
                    }
                }, true);
                LIZJ.LIZJ();
            }
        }
        if (C35056DpM.LIZ == 2) {
            C51588KMm c51588KMm = (C51588KMm) HomePageUIFrameServiceImpl.LIZ().getInflatedSpecialIcon(this.LJLJI.getActivity());
            this.LJLIL = c51588KMm;
            if (c51588KMm == null) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) c51588KMm.getParent();
            if (viewGroup != null) {
                C16880lQ.LJLLL(this.LJLIL, viewGroup);
            }
        } else {
            this.LJLIL = (C51588KMm) HomePageUIFrameServiceImpl.LIZ().buildSpecialIcon(this.LJLJI.getActivity());
        }
        C78765Uvh.LJIIIZ(this.LJLIL, LJI.getIconUrl(), -1, -1);
        String LLLLLZ = this.LJLJI.LLLLLZ();
        if (a.LJIJI().LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", LLLLLZ);
            c188727au.LJIIIZ("type", LJI.getEventName());
            c188727au.LJIIIZ("url", LJI.getLandingRoute());
            FMX.LJIIL("topic_entrance_show", c188727au.LIZ);
        }
        return this.LJLIL;
    }

    @Override // X.LM4
    public final boolean enabled() {
        SpecialTopicEntry LJI = LJI();
        if (LJI != null && LJI.getEnable() && !TextUtils.isEmpty(LJI.getLandingRoute()) && !TextUtils.isEmpty(LJI.getIconUrl()) && (!AV1.LJIIJJI() || LJI.getChildViewable())) {
            return true;
        }
        return false;
    }

    public LNO(LNP lnp) {
        this.LJLJI = lnp;
    }

    @Override // X.LM4
    public final void LJFF(View view) {
        SpecialTopicEntry LJI = LJI();
        if (LJI == null) {
            return;
        }
        SmartRouter.buildRoute(this.LJLJI.getActivity(), LJI.getLandingRoute()).open();
        String LLLLLZ = this.LJLJI.LLLLLZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LLLLLZ);
        c188727au.LJIIIZ("type", LJI.getEventName());
        c188727au.LJIIIZ("url", LJI.getLandingRoute());
        FMX.LJIIL("topic_entrance_click", c188727au.LIZ);
    }

    public final void LJIIIIZZ(long j, final String str, final boolean z) {
        if (this.LJLJI.tj() == null || !LIZLLL()) {
            return;
        }
        this.LJLJI.tj().postDelayed(new Runnable() { // from class: X.LUr
            @Override // java.lang.Runnable
            public final void run() {
                C59613NaT c59613NaT;
                LNO lno = LNO.this;
                boolean z2 = z;
                String str2 = str;
                if (!lno.LIZLLL()) {
                    return;
                }
                if (z2) {
                    C54352LUu LIZLLL = C54352LUu.LIZLLL();
                    ActivityC45651qj activity = lno.LJLJI.getActivity();
                    synchronized (LIZLLL.LJ) {
                        if (((ArrayList) LIZLLL.LIZ).size() > 0) {
                            c59613NaT = (C59613NaT) ((ArrayList) LIZLLL.LIZ).get(0);
                            ((ArrayList) LIZLLL.LIZ).remove(0);
                            if (c59613NaT == null) {
                                c59613NaT = new C59613NaT(new MutableContextWrapper(activity));
                            } else {
                                c59613NaT.setTag("cachedWebView");
                                Context context = c59613NaT.getContext();
                                if (context instanceof MutableContextWrapper) {
                                    ((MutableContextWrapper) context).setBaseContext(activity);
                                }
                            }
                        } else {
                            c59613NaT = new C59613NaT(new MutableContextWrapper(activity));
                        }
                        c59613NaT.initWeb(activity);
                    }
                    lno.LJLILLLLZI = c59613NaT;
                    if (lno.LJLJI.tj() == null || lno.LJLILLLLZI == null) {
                        return;
                    }
                    lno.LJLJI.tj().addView(lno.LJLILLLLZI);
                    C59613NaT c59613NaT2 = lno.LJLILLLLZI;
                    StringBuilder LIZJ = b1.LIZJ(str2, "&cov_webview_prerender_time=");
                    LIZJ.append(System.currentTimeMillis());
                    LIZJ.append("&");
                    LIZJ.append("cov19_render_no_need_load=1");
                    c59613NaT2.loadUrl(X1D.LIZIZ(LIZJ));
                    return;
                }
                final C54352LUu LIZLLL2 = C54352LUu.LIZLLL();
                if (Build.VERSION.SDK_INT < 23) {
                    LIZLLL2.getClass();
                } else {
                    if (LIZLLL2.LIZ() || ((ArrayList) LIZLLL2.LIZ).size() >= LIZLLL2.LIZLLL) {
                        return;
                    }
                    C16880lQ.LJLI(EF7.LIZIZ().getMainLooper().getQueue(), new MessageQueue.IdleHandler() { // from class: X.LUs
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            C54352LUu c54352LUu = C54352LUu.this;
                            c54352LUu.getClass();
                            SystemClock.uptimeMillis();
                            synchronized (c54352LUu.LJ) {
                                for (int i = 0; i < c54352LUu.LIZLLL - ((ArrayList) c54352LUu.LIZ).size(); i++) {
                                    ((ArrayList) c54352LUu.LIZ).add(new C59613NaT(new MutableContextWrapper(EF7.LIZIZ())));
                                }
                            }
                            SystemClock.uptimeMillis();
                            return false;
                        }
                    });
                }
            }
        }, j);
    }
}
