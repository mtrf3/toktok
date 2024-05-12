package com.bytedance.ies.ugc.aweme.commercialize.splash.core;

import X.AbstractC55363Lo7;
import X.ActivityC45651qj;
import X.C04270Et;
import X.C09900aA;
import X.C10K;
import X.C16880lQ;
import X.C16970lZ;
import X.C188727au;
import X.C19N;
import X.C1DJ;
import X.C248369ou;
import X.C29S;
import X.C36093EEn;
import X.C54968Lhk;
import X.C55511LqV;
import X.C58096Mr6;
import X.C59835Ne3;
import X.C60192Njo;
import X.C61358O6g;
import X.C61359O6h;
import X.C61360O6i;
import X.C61363O6l;
import X.C75792yF;
import X.C78983UzD;
import X.C79004UzY;
import X.C87549YXp;
import X.EEY;
import X.EF7;
import X.FMX;
import X.M78;
import X.NPQ;
import X.NW4;
import X.NW6;
import X.O6X;
import X.O6Z;
import X.O76;
import X.O77;
import X.O7E;
import X.O7I;
import X.O7L;
import X.VJB;
import X.X1D;
import Y.ACallableS81S0101000_10;
import Y.ARunnableS17S0000000_10;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.RealTimeSplashTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadTask;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SplashAdServiceImpl implements ISplashAdService {
    public C248369ou LIZ;
    public C60192Njo LIZIZ;

    public static ISplashAdService LJJI() {
        Object LIZ = C58096Mr6.LIZ(ISplashAdService.class, false);
        if (LIZ != null) {
            return (ISplashAdService) LIZ;
        }
        if (C58096Mr6.LJIL == null) {
            synchronized (ISplashAdService.class) {
                if (C58096Mr6.LJIL == null) {
                    C58096Mr6.LJIL = new SplashAdServiceImpl();
                }
            }
        }
        return C58096Mr6.LJIL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final RealTimeSplashTask LIZ() {
        return new RealTimeSplashTask();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJFF() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        boolean z = true;
        if (!C19N.LJ("enable_normal_splash_ad", true) || !e1.LIZ(31744, "enable_normal_splash_ad_ab", true, true)) {
            z = false;
        }
        repo.storeBoolean("splash_ad_enable", z);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIIZ() {
        M78 stateWrapper;
        if (C55511LqV.LJIIJJI) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("topview_ban_dialog", true)) {
                    return;
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
            C248369ou c248369ou = this.LIZ;
            if (c248369ou != null && (stateWrapper = c248369ou.getStateWrapper()) != null) {
                stateWrapper.LIZ();
            }
            this.LIZ = null;
            C55511LqV.LJIIJJI = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean LJIILJJIL() {
        if (((Boolean) VJB.LIZIZ.getValue()).booleanValue()) {
            float f = C54968Lhk.LIZJ;
            if (f > 0.0f && f <= 4.5f) {
                return false;
            }
        }
        if (!((Boolean) C87549YXp.LIZIZ.getValue()).booleanValue() || C61358O6g.LJFF()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIZILJ() {
        if (!C61358O6g.LJ) {
            C61358O6g.LJ = true;
            C61358O6g.LIZIZ(EF7.LIZIZ());
            C61360O6i.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final SplashBgInflate LIZIZ() {
        if (LJIILJJIL()) {
            return new SplashBgInflate();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final int LJIILIIL() {
        C61358O6g.LIZIZ(EF7.LIZIZ());
        C61358O6g.LIZIZ.getClass();
        return O76.LJI().LJII();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final String LJIJ() {
        String str;
        NPQ.LIZIZ().getClass();
        Map<String, Aweme> LJ = NPQ.LIZIZ.LJ(null);
        if (LJ == null || LJ.isEmpty()) {
            return null;
        }
        C61360O6i.LIZJ().getClass();
        List<O7E> list = O7I.LIZIZ().LIZ;
        if (C79004UzY.LJJIFFI(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (O7E o7e : list) {
            if (!o7e.LLJJIJIL && !o7e.LLJJIJIIJIL && (str = o7e.LLIILII) != null && LJ.containsKey(str)) {
                long LJII = O77.LJII();
                if (LJII == -1) {
                    LJII = NetworkUtils.getServerTimeMills();
                }
                if (LJII >= o7e.LJII() && LJII <= o7e.LJI()) {
                    arrayList.add(o7e.LLIILII);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C75792yF.LIZJ(arrayList);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final TopViewPreloadJsonTask LJIJJ() {
        if (LJIILJJIL()) {
            return new TopViewPreloadJsonTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final SplashAdManagerPreloadTask LJIJJLI() {
        if (LJIILJJIL()) {
            return new SplashAdManagerPreloadTask();
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIL() {
        File[] listFiles;
        NPQ.LIZIZ().getClass();
        if (NPQ.LIZIZ != null && (listFiles = new File(NPQ.LIZJ).listFiles()) != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isFile()) {
                    C16880lQ.LLLZZIL(file);
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final boolean LIZJ(C29S c29s) {
        if (((Boolean) C87549YXp.LIZIZ.getValue()).booleanValue() && !C61358O6g.LJFF()) {
            return false;
        }
        return O6Z.LIZ.LIZLLL(1, c29s);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJ(boolean z) {
        SharedPreferences sharedPreferences;
        NPQ.LIZIZ().getClass();
        TopViewJsonManager topViewJsonManager = NPQ.LIZIZ;
        if (topViewJsonManager != null && (sharedPreferences = topViewJsonManager.LIZJ) != null) {
            sharedPreferences.edit().putBoolean("awesome_splash_filter_enable", z).apply();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJI(NW4 nw4) {
        if (NW6.LIZ() != null) {
            C09900aA.LJIIJJI("splash_depend_init_question", 2, null);
        } else {
            NW6.LIZ.LIZIZ(nw4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final C60192Njo LJII(ActivityC45651qj activityC45651qj) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C60192Njo(activityC45651qj);
        }
        C60192Njo c60192Njo = this.LIZIZ;
        o.LJII(c60192Njo, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.SplashLoadMaskHelper");
        return c60192Njo;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Drawable LJIIIIZZ(Context context) {
        o.LJIIIZ(context, "context");
        C36093EEn.LIZ.getClass();
        EEY LJI = C36093EEn.LJI(SplashBgInflate.class);
        o.LJII(LJI, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.splash.topview.SplashBgInflate");
        SplashBgInflate splashBgInflate = (SplashBgInflate) LJI;
        Drawable drawable = splashBgInflate.LJLIL;
        if (drawable != null) {
            splashBgInflate.LJLIL = null;
        } else {
            try {
                drawable = C04270Et.LIZIZ(context, R.drawable.splash_bg_normal);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                drawable = null;
            }
        }
        o.LJIIIIZZ(drawable, "getInflate(SplashBgInfla…SplashBgDrawable(context)");
        return drawable;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIIJ(NW4 nw4) {
        if (NW6.LIZ() != null) {
            return;
        }
        NW6.LIZ.LIZIZ(nw4);
        C09900aA.LJIIJJI("splash_depend_init_question", 1, null);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View LJIIL(View view) {
        if (view != null) {
            return view.findViewById(R.id.adz);
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJIILL(String topViewOverDeliveryResult) {
        o.LJIIIZ(topViewOverDeliveryResult, "topViewOverDeliveryResult");
        NPQ.LIZIZ().getClass();
        C10K.LIZJ(new ACallableS81S0101000_10(0, topViewOverDeliveryResult, 1));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final Aweme LJIILLIIL(String str) {
        NPQ.LIZIZ().getClass();
        return NPQ.LIZIZ.LIZJ(str);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final TopViewPreloadTask LJIJI(List list) {
        return new TopViewPreloadTask(list);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.9ou, X.M74] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LJJ(final ActivityC45651qj activityC45651qj) {
        if (!C55511LqV.LJIIJJI) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("topview_ban_dialog", true)) {
                    return;
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
            C55511LqV.LJIIJJI = true;
            ?? r0 = new AbstractC55363Lo7(activityC45651qj) { // from class: X.9ou
                public final ActivityC45651qj LJLIL;
                public final int LJLILLLLZI = 10;

                @Override // X.M72
                public final void LIZLLL(C54082LKk context, M78 wrapper) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(wrapper, "wrapper");
                }

                @Override // X.InterfaceC55641Lsb
                public final C54082LKk getPopupContext() {
                    ActivityC45651qj activityC45651qj2 = this.LJLIL;
                    return C54081LKj.LIZ(activityC45651qj2, activityC45651qj2);
                }

                @Override // X.InterfaceC56321M8n
                public final int getPriority() {
                    return this.LJLILLLLZI;
                }

                {
                    this.LJLIL = activityC45651qj;
                }
            };
            this.LIZ = r0;
            PopupManager.LJIIL(r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final void LIZLLL(Context context, String crash) {
        Object arrayList;
        String deviceId;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(crash, "crash");
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("splash_crash_protect", true)) {
            C61363O6l.LIZIZ(context, null);
            O6X.LIZLLL.getClass();
            try {
                if (!TextUtils.isEmpty(crash)) {
                    ArrayList arrayList2 = new ArrayList();
                    Package r0 = O6X.class.getPackage();
                    if (r0 != null) {
                        arrayList2.add(r0.getName());
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!TextUtils.isEmpty(str) && crash.contains(str)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("crashed，ad array is: ");
                            O7I LIZIZ = O7I.LIZIZ();
                            if (LIZIZ.LIZ == null) {
                                arrayList = Collections.EMPTY_LIST;
                            } else {
                                arrayList = new ArrayList();
                                Iterator it2 = new ArrayList(LIZIZ.LIZ).iterator();
                                while (it2.hasNext()) {
                                    O7E o7e = (O7E) it2.next();
                                    if (o7e != null) {
                                        arrayList.add(String.valueOf(o7e.LJLL));
                                    }
                                }
                            }
                            LIZ.append(arrayList);
                            LIZ.append("\n crash stack is: ");
                            LIZ.append(crash);
                            C1DJ.LJIIIZ(84378473382L, X1D.LIZIZ(LIZ), null);
                            if (O76.LJI().LIZJ.LIZIZ("key_exception_time") + 1 >= C61359O6h.LJII().LIZ) {
                                C61359O6h.LJFF.execute(new ARunnableS17S0000000_10(4));
                                O7L o7l = O76.LJI().LIZJ;
                                o7l.LJ(0, "key_exception_time");
                                o7l.LIZ.LIZIZ();
                            } else {
                                O76 LJI = O76.LJI();
                                O7L o7l2 = LJI.LIZJ;
                                o7l2.LJ(LJI.LIZJ.LIZIZ("key_exception_time") + 1, "key_exception_time");
                                o7l2.LIZ.LIZIZ();
                            }
                            C188727au c188727au = new C188727au();
                            c188727au.LJ(System.currentTimeMillis(), "event_time");
                            IHostContextDepend LIZIZ2 = C59835Ne3.LIZIZ();
                            if (LIZIZ2 != null && (deviceId = LIZIZ2.getDeviceId()) != null) {
                                c188727au.LJI("id", deviceId);
                            }
                            FMX.LJIIL("splash_ad_handle_exception_event", c188727au.LIZ);
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
                C1DJ.LJIIJ(" crashed while processing crash ");
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService
    public final View LJIIJJI(ViewGroup viewGroup, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        System.currentTimeMillis();
        C16970lZ.LIZJ(R.layout.u7, fragment.requireActivity(), viewGroup, true);
        return viewGroup.findViewById(R.id.adx);
    }
}
