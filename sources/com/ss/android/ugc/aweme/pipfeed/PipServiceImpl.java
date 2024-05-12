package com.ss.android.ugc.aweme.pipfeed;

import X.ASL;
import X.ActivityC45651qj;
import X.C00F;
import X.C113554cx;
import X.C145105mk;
import X.C26045AKb;
import X.C43131GwJ;
import X.C48769JCb;
import X.C48800JDg;
import X.C58096Mr6;
import X.C60903NvH;
import X.C61878OQg;
import X.C8W0;
import X.EF7;
import X.EnumC145125mm;
import X.INR;
import X.INT;
import X.IVB;
import X.InterfaceC48810JDq;
import X.JCU;
import X.JD9;
import X.JDC;
import X.JDD;
import X.JDE;
import X.JDF;
import X.JDG;
import X.JDK;
import X.JDM;
import X.ORS;
import Y.IDDListenerS147S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.AqS63S1200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PipServiceImpl implements IPipFeedService {
    public static IPipFeedService LJJII() {
        Object LIZ = C58096Mr6.LIZ(IPipFeedService.class, false);
        if (LIZ != null) {
            return (IPipFeedService) LIZ;
        }
        if (C58096Mr6.P3 == null) {
            synchronized (IPipFeedService.class) {
                if (C58096Mr6.P3 == null) {
                    C58096Mr6.P3 = new PipServiceImpl();
                }
            }
        }
        return C58096Mr6.P3;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZ() {
        ORS.LJJLIL(C48769JCb.LJLIL, FeedPipViewModel.LL);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZJ() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.closeWindowOnly$pipfeed_release("click_back_icon");
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJI() {
        PipFeedManager.Companion.getClass();
        return JD9.LIZ.getPlayerControllerNeedReportExtraRenderEvent$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIIIIZZ() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.onFetchedComplianceSetting$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIIJ() {
        if (((Number) JDM.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final List<String> LJIILIIL() {
        PipFeedManager.Companion.getClass();
        return PipFeedManager.sceneWhiteList;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIILJJIL() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.onComplianceTakeDown$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIJ() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.setPlayerControllerNeedReportExtraRenderEvent$pipfeed_release(true);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final C8W0 LJIJJ() {
        return new PipFeedMainActivityAssem();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIJJLI() {
        PipFeedManager.Companion.getClass();
        return JD9.LIZ.isWindowShowing$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJJ() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.onAppQuit$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJJIFFI() {
        PipFeedManager.Companion.getClass();
        return JD9.LIZ.isPipEnabled$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void init() {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.initPip();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean isInPipMode() {
        PipFeedManager.Companion.getClass();
        return JD9.LIZ.isInPipMode$pipfeed_release();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LIZLLL() {
        return JDE.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIIJJI() {
        if (JDE.LIZIZ()) {
            if (C00F.LIZ(31744, 0, "enable_pip_feed_pad", false) != 2) {
                return false;
            }
        } else if (C00F.LIZ(31744, 0, "enable_pip_feed", false) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIIZILJ() {
        if (LJJIFFI() && h.LJFF(EF7.LIZIZ())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJ(InterfaceC48810JDq callback) {
        o.LJIIIZ(callback, "callback");
        PipFeedManager.Companion.getClass();
        JD9.LIZ.getCallbacks$pipfeed_release().add(callback);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJII(String str) {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.setScene$pipfeed_release(str);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIILL(boolean z) {
        PipFeedManager.Companion.getClass();
        JD9.LIZ.setPipEnabled$pipfeed_release(z);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIILLIIL(InterfaceC48810JDq callback) {
        o.LJIIIZ(callback, "callback");
        PipFeedManager.Companion.getClass();
        JD9.LIZ.getCallbacks$pipfeed_release().remove(callback);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIJI(IVB r) {
        o.LJIIIZ(r, "r");
        PipFeedManager.Companion.getClass();
        JD9.LIZ.runWhenThisWindowClose$pipfeed_release(r);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIL(Context context) {
        o.LJIIIZ(context, "context");
        return h.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJJI(String... strArr) {
        INT r4;
        for (String str : strArr) {
            Iterator<INT> it = JCU.LIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    r4 = it.next();
                    if (o.LJ(r4.LIZ, str)) {
                        break;
                    }
                } else {
                    r4 = null;
                    break;
                }
            }
            INT r42 = r4;
            if (r42 != null) {
                String key = r42.LIZ;
                o.LJIIIZ(key, "key");
                List<INT> list = FeedPipViewModel.LL;
                ORS.LJJLIL(new AqS31S1000000_8(key, 0), list);
                ((ArrayList) list).add(r42);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJFF(ActivityC45651qj activityC45651qj, AqS158S0100000_8 aqS158S0100000_8) {
        h.LJIIJ(activityC45651qj, aqS158S0100000_8);
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final boolean LJIIL(Aweme aweme, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (JDE.LIZIZ()) {
            if (C00F.LIZ(31744, 0, "enable_pip_feed_pad", false) != 1) {
                return false;
            }
        } else if (C00F.LIZ(31744, 0, "enable_pip_feed", false) != 1) {
            return false;
        }
        if (!JDE.LIZ()) {
            return false;
        }
        PipFeedManager.Companion.getClass();
        List<String> list = PipFeedManager.sceneWhiteList;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            List<String> list2 = JDC.LIZ.get(it.next());
            if (list2 == null) {
                list2 = C61878OQg.INSTANCE;
            }
            ORS.LJJLIIIJILLIZJL(list2, arrayList);
        }
        if (!arrayList.contains(enterFrom) || aweme == null || aweme.isAd()) {
            return false;
        }
        PipFeedManager.Companion.getClass();
        if (!JD9.LIZ.isCurrentSceneEligible$pipfeed_release()) {
            return false;
        }
        if ((((Number) JDK.LIZ.getValue()).intValue() == 1 || C48800JDg.LIZ()) && !INR.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, String enterFrom, Map<String, String> map) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (JDC.LIZIZ.contains(enterFrom)) {
            PipFeedManager.Companion.getClass();
            Keva keva = JD9.LIZ.getKeva();
            if (h.LJFF(activityC45651qj)) {
                if (!keva.getBoolean("has_opened_pip", false) && !C48800JDg.LIZ()) {
                    AqS63S1200000_8 aqS63S1200000_8 = new AqS63S1200000_8(activityC45651qj, (ActivityC45651qj) enterFrom, (String) map, (Map<String, String>) 2);
                    View LIZ = C145105mk.LIZ(activityC45651qj, EnumC145125mm.TURN_ON_REQUEST, null, JDF.LJLIL);
                    ASL asl = new ASL();
                    asl.LIZ.LJLLI = LIZ;
                    asl.LJI(0);
                    TuxSheet tuxSheet = asl.LIZ;
                    tuxSheet.LJZL = true;
                    tuxSheet.LJLJI = true;
                    tuxSheet.LJLILLLLZI = new IDDListenerS147S0100000_8(aqS63S1200000_8, 3);
                    FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                    o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
                    tuxSheet.show(supportFragmentManager, "pip_intro_sheet_first_time");
                    Map LJJLIL = C113554cx.LJJLIL(map);
                    LJJLIL.put("enter_from", enterFrom);
                    C60903NvH.LJJIJIL("show_floating_window_authorization_propup", LJJLIL);
                    return;
                }
                JDC.LIZ(activityC45651qj, enterFrom, map, false);
                return;
            }
            AqS63S1200000_8 aqS63S1200000_82 = new AqS63S1200000_8(activityC45651qj, (ActivityC45651qj) enterFrom, (String) map, (Map<String, String>) 4);
            View LIZ2 = C145105mk.LIZ(activityC45651qj, EnumC145125mm.PERMISSION_REQUEST, C43131GwJ.LJLIL, JDG.LJLIL);
            ASL asl2 = new ASL();
            asl2.LIZ.LJLLI = LIZ2;
            asl2.LJI(0);
            TuxSheet tuxSheet2 = asl2.LIZ;
            tuxSheet2.LJZL = true;
            tuxSheet2.LJLJI = true;
            tuxSheet2.LJLILLLLZI = new JDD(enterFrom, map, aqS63S1200000_82);
            FragmentManager supportFragmentManager2 = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager2, "context.supportFragmentManager");
            tuxSheet2.show(supportFragmentManager2, "pip_intro_sheet_first_time");
            Map LJJLIL2 = C113554cx.LJJLIL(map);
            LJJLIL2.put("enter_from", enterFrom);
            C60903NvH.LJJIJIL("show_floating_window_system_authorization_propup", LJJLIL2);
            return;
        }
        throw new IllegalAccessException(a1.LJ("current scene ", enterFrom, " does not match any PiP scenes!"));
    }

    @Override // com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService
    public final void LJIIIZ(ActivityC45651qj activityC45651qj, String enterFrom, Map<String, String> map) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (JDC.LIZIZ.contains(enterFrom)) {
            PipFeedManager.Companion.getClass();
            JD9.LIZ.setPipEnabled$pipfeed_release(false);
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIZ(activityC45651qj.getString(R.string.jmf));
            c26045AKb.LIZLLL(3000L);
            c26045AKb.LJIIJ();
            return;
        }
        throw new IllegalAccessException(a1.LJ("current scene ", enterFrom, " does not match any PiP scenes!"));
    }
}
