package com.ss.android.ugc.aweme.offlinemode.service;

import X.AQO;
import X.AQU;
import X.AQV;
import X.AQW;
import X.AQY;
import X.ActivityC45651qj;
import X.C09160Xo;
import X.C09170Xp;
import X.C09190Xr;
import X.C0NY;
import X.C16880lQ;
import X.C26212AQm;
import X.C26218AQs;
import X.C26222AQw;
import X.C36980EfI;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C8W0;
import X.C9SN;
import X.C9SY;
import X.EE1;
import X.EF7;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.X1D;
import android.app.Activity;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import com.ss.android.ugc.aweme.offlinemode.OfflineModeTask;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import com.ss.android.ugc.aweme.offlinemode.ui.pagestate.OfflineModeDetailPageStateImp;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeServiceImpl implements IOfflineModeService {
    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final InterfaceC65350Pko<? extends UIContentAssem> LJIIIZ() {
        return C65352Pkq.LIZ(OfflineModeDetailPageStateImp.class);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final InterfaceC65350Pko<? extends C8W0> LJIIJ() {
        return C65352Pkq.LIZ(OfflineModeSwitchComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final String getSceneId() {
        return "scene_home_page_offline_mode";
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final String LIZIZ() {
        AQW.LIZ.getClass();
        return AQW.LJII();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJI() {
        AQV.LJLIL.getClass();
        AQV.LJLILLLLZI.LJIIIIZZ("deleteOfflineMode");
        AQV.LJLJJLL.LIZIZ(null);
        AQW.LIZ.getClass();
        C26222AQw c26222AQw = AQW.LIZLLL;
        c26222AQw.LJIIIIZZ("In clearAllCache");
        if (C26212AQm.LIZ()) {
            c26222AQw.LJIIIIZZ("hit offline mode experiment");
            AQO.LJIIIIZZ(C9SN.UNINITIALIZED);
            AQW.LJIIJJI(false);
            AQW.LIZLLL();
            C26218AQs.LIZ("offline_mode_cache_clear", null, null, null, null, null, null, null, null, null, null, AQU.SETTING_PAGE_CLEAR.getValue(), null, null, null, null, null, null, null, null, null, null, null, 8386558);
        } else {
            c26222AQw.LJIIIIZZ("did not hit offline mode experiment");
            AQW.LIZLLL();
        }
        if (C26212AQm.LIZ()) {
            AQY.LIZJ().LJI();
        } else {
            OfflineModeFeedPBDataBase.LJIIL.getValue().LIZLLL();
            EF7.LIZIZ().deleteDatabase("offline_mode_feed_pb");
        }
        C09170Xp LIZ = C09160Xo.LIZ("feed", "offlinemode");
        if (LIZ == null) {
            return;
        }
        o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper());
        Keva keva = C09190Xr.LIZIZ;
        if (keva != null) {
            Iterator<String> it = keva.getAll().keySet().iterator();
            while (it.hasNext()) {
                String lowerCase = (it.next() + '/' + LIZ.LIZ("/") + "/kv/keva/").toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                C09190Xr.LIZIZ(lowerCase);
            }
            String lowerCase2 = (LIZ.LIZ("/") + "/kv/keva/").toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            C09190Xr.LIZIZ(lowerCase2);
            return;
        }
        o.LJIJI("allUserKeva");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final long LJII() {
        AQW.LIZ.getClass();
        return C36980EfI.LIZLLL(new File(AQW.LJFF()));
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final EE1 LIZ() {
        if (!C26212AQm.LIZ()) {
            return null;
        }
        return new OfflineModeTask();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJ() {
        return C26212AQm.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LIZJ(Activity activity) {
        if (activity == null) {
            return;
        }
        C9SY.LIZJ(activity, R.string.j9e, null);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LIZLLL(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (!C26212AQm.LIZ()) {
            return;
        }
        OfflineModeListVM.LJLJI = System.currentTimeMillis();
        SmartRoute buildRoute = SmartRouter.buildRoute(fragment, "aweme://aweme/detail/");
        buildRoute.withParam("event_type", "settings_and_privacy");
        buildRoute.withParam("enter_method", "click_icon");
        buildRoute.withParam("video_type", 50);
        buildRoute.withParam("video_from", "from_offline_mode");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offline_mode_video_list_vm_key");
        LIZ.append(OfflineModeListVM.LJLJI);
        buildRoute.withParam("enter_from", X1D.LIZIZ(LIZ));
        C0NY.LIZJ(buildRoute, "refer", "offline_mode_page", "activity_has_activity_options", true);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final IOfflineModeSwitchAbility LJFF(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        if (!C26212AQm.LIZ()) {
            return null;
        }
        return (IOfflineModeSwitchAbility) C55096Ljo.LIZ(vScope, IOfflineModeSwitchAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJIIIIZZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return;
        }
        C9SY.LIZJ(activityC45651qj, R.string.j9c, null);
    }
}
