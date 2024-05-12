package com.ss.android.ugc.aweme;

import X.AbstractC39351FcR;
import X.C16880lQ;
import X.C35865E5t;
import X.C38986FRu;
import X.C40751Fz1;
import X.C58096Mr6;
import X.C61878OQg;
import X.C65352Pkq;
import X.C8W0;
import X.E1J;
import X.E1L;
import X.EFM;
import X.EH1;
import X.EH3;
import X.EOP;
import X.EOS;
import X.FNO;
import X.FNQ;
import X.FNR;
import X.FNS;
import X.FNY;
import X.FOL;
import X.InterfaceC65350Pko;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.assem.NewUserGuideAssem;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NewUserJourneyService implements INewUserJourneyService {
    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final InterfaceC65350Pko<? extends C8W0> LIZIZ() {
        return C65352Pkq.LIZ(NewUserGuideAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final EFM LJ() {
        return FNO.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJFF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final String LJIIIZ() {
        return "reorder_new_journey_front";
    }

    public static INewUserJourneyService LJIILLIIL() {
        Object LIZ = C58096Mr6.LIZ(INewUserJourneyService.class, false);
        if (LIZ != null) {
            return (INewUserJourneyService) LIZ;
        }
        if (C58096Mr6.LJJLIIIJJI == null) {
            synchronized (INewUserJourneyService.class) {
                if (C58096Mr6.LJJLIIIJJI == null) {
                    C58096Mr6.LJJLIIIJJI = new NewUserJourneyService();
                }
            }
        }
        return C58096Mr6.LJJLIIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LIZ() {
        if (!FNQ.LIZIZ) {
            FNQ.LIZ.storeLong("last_open_time", System.currentTimeMillis());
            FNQ.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIILIIL() {
        if (FNS.LIZ && !C38986FRu.LIZ().LIZ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJII() {
        IPluginService.PluginData LIZ = C35865E5t.LIZ();
        if (LIZ == null || !o.LJ(LIZ.showConfig.shouldShow, Boolean.TRUE)) {
            return;
        }
        C35865E5t.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final int LJI() {
        return C40751Fz1.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final EOS LJIIL() {
        return EOP.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final List<String> LJIILJJIL() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LIZLLL(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || C38986FRu.LIZ().LIZJ() != 1 || NewUserJourneyActivity.LJLLLL) {
            return false;
        }
        FOL.LIZ(activity, false, false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> LJIIIIZZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        intent.putExtra("redirect_from_main", true);
        return FNY.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIIJJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || C38986FRu.LIZ().LIZJ() != 1 || NewUserJourneyActivity.LJLLLL) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final AbstractC39351FcR LJIILL(int i) {
        if (i != 1) {
            if (i == 3) {
                return new EH1();
            }
            throw new IllegalArgumentException("Can't getJourneyStrategyImpl !");
        }
        return new EH3();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJIIJ(Activity activity, Intent intent) {
        if (intent != null && activity != null && intent.getBooleanExtra("reorder_new_journey_front", false) && !Keva.getRepo("new_user_journey").getBoolean("disable_reorder_new_journey", false)) {
            intent.setClassName(activity, NewUserJourneyActivity.class.getName());
            intent.setFlags(131072);
            C16880lQ.LIZIZ(activity, intent);
            if (E1L.LIZ() || E1J.LIZ()) {
                FNS.LIZ = true;
                activity.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(FNR.LJLIL);
            }
        }
        Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LIZJ(Activity activity, boolean z, boolean z2) {
        o.LJIIIZ(activity, "activity");
        FOL.LIZ(activity, z, z2);
    }
}
