package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class EUH {
    public static final List<EUJ> LIZ;
    public static EUJ LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.addAll(C86034Xpe.LIZIZ.providePushSettingCallbackList());
        Object LJIILL = a.LJFF().LJIILL();
        if ((LJIILL instanceof EUJ) && LJIILL != null) {
            arrayList.add(LJIILL);
        }
        Object pushSettingCallback = Z8A.LIZIZ.getPushSettingCallback();
        if ((pushSettingCallback instanceof EUJ) && pushSettingCallback != null) {
            arrayList.add(pushSettingCallback);
        }
        Iterator<EUJ> it = SettingsRequestServiceImpl.LJIILLIIL().LJII().iterator();
        while (it.hasNext()) {
            ((ArrayList) LIZ).add(it.next());
        }
        Object LJII = a.LJFF().LJII();
        if ((LJII instanceof EUJ) && LJII != null) {
            ((ArrayList) LIZ).add(LJII);
        }
        if (FCD.LJI(EF7.LIZIZ())) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        }
        LIZJ = C221108m2.LIZIZ(C36808EcW.LJLIL);
    }

    public static void LIZ(Exception exc) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            ((EUJ) it.next()).onFailed(exc);
        }
        EUJ euj = LIZIZ;
        if (euj != null) {
            euj.onFailed(exc);
        }
        LIZIZ = null;
    }

    public static void LIZIZ(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            ((EUJ) it.next()).A1(settings);
        }
        EUJ euj = LIZIZ;
        if (euj != null) {
            euj.A1(settings);
        }
        LIZIZ = null;
    }

    public static void LIZJ(EUJ euj, boolean z) {
        LIZIZ = euj;
        try {
            ((C8BR) LIZJ.getValue()).LJIILL(new Object[0]);
        } catch (Exception unused) {
            if (!z) {
                XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C75212xJ(euj, null), 2);
            } else {
                LIZ(new Exception());
            }
        }
    }
}
