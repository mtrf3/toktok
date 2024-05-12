package X;

import X.C0M9;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.applog.ConfigModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Pza, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66266Pza {
    public static final boolean LIZ;
    public static final java.util.Set<String> LIZIZ;
    public static final HashMap<String, String> LIZJ;
    public static final C1HQ<String, String> LIZLLL;
    public static final Keva LJ;
    public static final boolean LJFF;
    public static String LJI;
    public static String LJII;
    public static volatile String LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static final RunnableC66265PzZ LJIIJ;
    public static final C66267Pzb LJIIJJI;
    public static final C66264PzY LJIIL;

    static {
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        ConfigModel configModel = E1M.LIZ;
        ConfigModel configModel2 = (ConfigModel) LIZLLL2.LJIIIIZZ("app_log_isolation_settings", ConfigModel.class, configModel);
        if (configModel2 == null) {
            configModel2 = configModel;
        }
        LIZ = configModel2.enabled;
        ConfigModel configModel3 = (ConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("app_log_isolation_settings", ConfigModel.class, configModel);
        if (configModel3 != null) {
            configModel = configModel3;
        }
        LIZIZ = configModel.isolationType;
        LIZJ = new HashMap<>();
        LIZLLL = new C1HQ<>();
        LJ = KevaImpl.getRepo("pns_user_region_map", 0);
        LJFF = o.LJ(EF7.LJIILIIL, "local_test");
        LJII = "";
        LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
        LJIIIZ = true;
        LJIIJ = new RunnableC66265PzZ();
        LJIIJJI = C66267Pzb.LIZ;
        LJIIL = new C66264PzY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ() {
        String str;
        User curUser;
        if (!LIZ) {
            return;
        }
        U49.LIZ.getClass();
        java.util.Set<Map.Entry<String, String>> entrySet = U49.LJFF.entrySet();
        o.LJIIIIZZ(entrySet, "TikTokIdcManager.regionIdcMap.entries");
        Iterator it = ((C0M9.b) entrySet).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o.LJIIIIZZ(entry, "(k, v)");
            Object k = entry.getKey();
            Object v = entry.getValue();
            if (o.LJ(v, "us") && LIZIZ.contains("us")) {
                HashMap<String, String> hashMap = LIZJ;
                o.LJIIIIZZ(k, "k");
                o.LJIIIIZZ(v, "v");
                hashMap.put(k, v);
            }
            if (o.LJ(v, "eu") && LIZIZ.contains("eu")) {
                HashMap<String, String> hashMap2 = LIZJ;
                o.LJIIIIZZ(k, "k");
                o.LJIIIIZZ(v, "v");
                hashMap2.put(k, v);
            }
        }
        for (Map.Entry<String, ?> entry2 : LJ.getAll().entrySet()) {
            LIZLLL.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            String key = entry2.getKey();
            o.LJIIIIZZ(key, "it.key");
            U49.LJ.put(key, String.valueOf(entry2.getValue()));
        }
        RBY LJFF2 = AccountService.LJIJ().LJFF();
        if (!LJFF2.isLogin() || (curUser = LJFF2.getCurUser()) == null || (str = curUser.getUid()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ = str;
        C66260PzU.LIZ(LJIIL);
        AppLog.setUserIdIsolateEnabled(true);
        AppLog.setUserIdIsolateCallback(LJIIJJI);
    }
}
