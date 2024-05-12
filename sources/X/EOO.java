package X;

import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJPreloadData;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EOO {
    public static String LIZ;
    public static boolean LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(E58.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            r5 = 0
            java.util.Iterator r4 = X.C79061V1d.LJFF(r5)
        L5:
            boolean r0 = r4.hasNext()
            r3 = 1
            if (r0 == 0) goto L48
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r0 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r0
            int r1 = r0.id
            X.E4t r0 = X.EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA
            int r0 = r0.getValue()
            if (r1 != r0) goto L5
        L1d:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginData r2 = (com.ss.android.ugc.aweme.plugin.IPluginService.PluginData) r2
            if (r2 == 0) goto L4a
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data r0 = r0.personalizedNUJV2Data
            if (r0 == 0) goto L35
            java.lang.Boolean r1 = r0.shouldTryAgeGate
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L47
            if (r2 == 0) goto L4a
        L35:
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r2.configData
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data r0 = r0.personalizedNUJV2Data
            if (r0 == 0) goto L4a
            java.lang.Boolean r1 = r0.shouldTrySmartLock
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L4a
        L47:
            return r3
        L48:
            r2 = 0
            goto L1d
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOO.LIZJ():boolean");
    }

    public static boolean LJFF() {
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        return (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || !o.LJ(personalizedNUJV2Data.needNUJInAgeGateFlow, Boolean.FALSE) || !GuestModeServiceImpl.LJIIJJI().LJIIJ()) ? false : true;
    }

    public static boolean LJI() {
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        boolean z = false;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) != null) {
            z = o.LJ(personalizedNUJV2Data.needNUJInQuickLoginFlow, Boolean.TRUE);
        }
        return !z;
    }

    public static boolean LJIIIIZZ() {
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        return !(pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || !o.LJ(personalizedNUJV2Data.shouldTryAgeGate, Boolean.TRUE)) || LJ();
    }

    public static boolean LJIIIZ() {
        Object obj;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Iterator LJFF = C79061V1d.LJFF(false);
        while (true) {
            if (LJFF.hasNext()) {
                obj = LJFF.next();
                if (((IPluginService.PluginData) obj).id == EnumC35839E4t.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IPluginService.PluginData pluginData = (IPluginService.PluginData) obj;
        return !(pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || !o.LJ(personalizedNUJV2Data.shouldTrySmartLock, Boolean.TRUE)) || LJ();
    }

    public static boolean LIZLLL() {
        boolean z;
        String str = LIZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static boolean LIZ() {
        if (LIZJ() || LJ()) {
            return true;
        }
        return false;
    }

    public static final int LIZIZ() {
        boolean LIZJ2 = GuestModeServiceImpl.LJIIJJI().LIZJ();
        if (LIZ() && LIZJ2) {
            return 1;
        }
        return 0;
    }

    public static boolean LJ() {
        IPluginService.PluginData pluginData;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJPreloadData personalizedNUJPreloadData;
        if (!LIZLLL() || (pluginData = (IPluginService.PluginData) LIZJ.getValue()) == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJPreloadData = pluginDataWrapper.personalizedNUJPreloadData) == null || !personalizedNUJPreloadData.LIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJII() {
        IPluginService.PluginData pluginData;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJPreloadData personalizedNUJPreloadData;
        Integer num;
        if (!LIZLLL() || !LIZIZ || (pluginData = (IPluginService.PluginData) LIZJ.getValue()) == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJPreloadData = pluginDataWrapper.personalizedNUJPreloadData) == null || (num = personalizedNUJPreloadData.expABGroup) == null || num.intValue() != 3) {
            return false;
        }
        return true;
    }
}
