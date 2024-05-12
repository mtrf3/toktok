package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.api.TTKOrbuState;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.compliance.sandbox.offline.IComplianceSandboxOfflineService;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XpP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86019XpP {
    public static String[] LIZ;
    public static volatile boolean LIZIZ;
    public static EnumC40383Ft5 LIZJ = EnumC40383Ft5.COLD_BOOT;
    public static String LIZLLL = "";
    public static String LJ = "";
    public static final IComplianceSandboxOfflineService LJFF = (IComplianceSandboxOfflineService) ServiceManager.get().getService(IComplianceSandboxOfflineService.class);

    static {
        LIZ = new String[0];
        String[] strArr = {"US", "AS", "GU", "MP", "PR", "VI", "UM"};
        try {
            String[] strArr2 = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("ttp_valid_regions", String[].class, C52267KfH.LIZ);
            if (strArr2 == null) {
                strArr2 = strArr;
            }
            LIZ = strArr2;
        } catch (Exception unused) {
        }
        if (LIZ.length == 0) {
            LIZ = strArr;
        }
        PX1.LIZIZ = C65304Pk4.LJLJI;
        C86023XpT c86023XpT = new C86023XpT();
        ((ArrayList) c86023XpT.LIZ).add(new C86024XpU());
        ((ArrayList) c86023XpT.LIZ).add(new C86028XpY());
        C86021XpR.LIZ = new C86022XpS(c86023XpT);
        C64707PaR.LIZ().addObserver(C86020XpQ.LIZ);
        IComplianceSandboxOfflineService iComplianceSandboxOfflineService = LJFF;
        if (iComplianceSandboxOfflineService != null) {
            iComplianceSandboxOfflineService.LIZIZ();
        }
    }

    public static void LIZ(EnumC40383Ft5 userAction) {
        boolean z;
        String upperCase;
        TTKOrbuState tTKOrbuState;
        o.LJIIIZ(userAction, "userAction");
        String str = X9V.LIZLLL;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            upperCase = str.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            String str2 = C64707PaR.LIZJ;
            o.LJIIIIZZ(str2, "getUserRegion()");
            upperCase = str2.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        String storeRegionSource = C64707PaR.LIZLLL;
        LIZJ = userAction;
        LIZLLL = upperCase;
        o.LJIIIIZZ(storeRegionSource, "storeRegionSource");
        LJ = storeRegionSource;
        if (!C19N.LJ("ttp_enabled_switch", true)) {
            tTKOrbuState = TTKOrbuState.DISABLE;
        } else if (!C38245Ezh.LIZIZ(upperCase, storeRegionSource)) {
            String LJ2 = C85990Xow.LJ();
            String[] strArr = LIZ;
            String upperCase2 = LJ2.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (ORY.LJJIJIIJIL(upperCase2, strArr)) {
                tTKOrbuState = TTKOrbuState.ENABLE;
            } else {
                tTKOrbuState = TTKOrbuState.PRE_ACTIVE;
            }
        } else {
            String[] strArr2 = LIZ;
            String upperCase3 = upperCase.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (ORY.LJJIJIIJIL(upperCase3, strArr2)) {
                tTKOrbuState = TTKOrbuState.ENABLE;
            } else {
                tTKOrbuState = TTKOrbuState.DISABLE;
            }
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        String serverDeviceId = AppLog.getServerDeviceId();
        String name = userAction.name();
        Context LIZIZ2 = EF7.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_kids_mode", AV1.LJIILLIIL());
        TTKOrbuContext tTKOrbuContext = new TTKOrbuContext(upperCase, curUserId, serverDeviceId, name, LIZIZ2, jSONObject);
        IComplianceSandboxOfflineService iComplianceSandboxOfflineService = LJFF;
        if (iComplianceSandboxOfflineService != null) {
            tTKOrbuState.name();
            iComplianceSandboxOfflineService.LIZ();
        }
        TTKOrbu.INSTANCE.activeOrbu(tTKOrbuContext, tTKOrbuState);
    }
}
