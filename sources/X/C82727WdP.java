package X;

import Y.IDhS107S0100000_14;
import Y.IDhS65S0200000_1;
import Y.IDhS99S0100000_6;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetVendorInfoResponse;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.IRuInstantLoginApi;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSettingsObject;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WdP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82727WdP {
    public static boolean LIZ;
    public static InterfaceC92693kP LJFF;
    public static TelephonyManager LJIIIIZZ;
    public static final HashMap<String, List<GetVendorInfoResponse.VendorInfo>> LIZIZ = new HashMap<>();
    public static final java.util.Set<String> LIZJ = new LinkedHashSet();
    public static String LIZLLL = "";
    public static final List<Integer> LJ = C47261Igj.LJJIJIIJI(3, 4, 6, 22, 1002, Integer.valueOf(LiveEffectMusicFadeDurationSetting.DEFAULT), 6001, 6002);
    public static String LJI = "";
    public static String LJII = "";

    public static String LIZJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        String str = LJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ2.append(str);
        String str3 = LJII;
        if (str3 != null) {
            str2 = str3;
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }

    public static AbstractC73638SvC LIZLLL(String str) {
        boolean LJ2 = LJ(str);
        if (str != null) {
            C85579XiJ.LIZIZ(true, LJ2);
        }
        if (!LJ2) {
            return AbstractC73638SvC.LJIILJJIL(new Throwable("carrier not supported"));
        }
        List<GetVendorInfoResponse.VendorInfo> list = LIZIZ.get(LIZJ());
        if (list != null && (!list.isEmpty())) {
            if (str == null || str.length() == 0) {
                return AbstractC73638SvC.LJIJ(ORZ.LJLLJ(list));
            }
            GetVendorInfoResponse.VendorInfo LIZIZ2 = LIZIZ(str, list);
            if (LIZIZ2 != null) {
                return AbstractC73638SvC.LJIJ(LIZIZ2);
            }
        }
        XJ3 xj3 = IRuInstantLoginApi.LIZ;
        String mcc = LJI;
        String mnc = LJII;
        xj3.getClass();
        o.LJIIIZ(mcc, "mcc");
        o.LJIIIZ(mnc, "mnc");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mcc", mcc);
        linkedHashMap.put("mnc", mnc);
        return XJ3.LIZIZ.getVendorInfo(linkedHashMap).LJJIIJ(T16.LIZ()).LJIILL(new C82728WdQ(str));
    }

    public static boolean LJ(String str) {
        RuInstantLoginSettingsObject.RealConfig LIZ2;
        List<String> list;
        if ((str != null && str.length() != 0 && !o.LJ(str, "si")) || (LIZ2 = C35368DuO.LIZ()) == null || (list = LIZ2.mccmncList) == null || !list.contains(LIZJ())) {
            return false;
        }
        return true;
    }

    public static void LJFF(Context context) {
        String str;
        o.LJIIIZ(context, "context");
        try {
            if (LJIIIIZZ == null) {
                Object LLILL = C16880lQ.LLILL(context, "phone");
                o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                LJIIIIZZ = (TelephonyManager) LLILL;
            }
            TelephonyManager telephonyManager = LJIIIIZZ;
            if (telephonyManager != null) {
                C39405FdJ.LJFF.getClass();
                str = C39571Ffz.LJI(telephonyManager);
            } else {
                str = "";
            }
            if (C78685UuP.LJJJZ(str)) {
                String substring = str.substring(0, 3);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                LJI = substring;
                String substring2 = str.substring(3, str.length());
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                LJII = substring2;
            }
        } catch (Exception unused) {
        }
        java.util.Set<String> set = LIZJ;
        if (set.contains(LIZJ())) {
            return;
        }
        set.add(LIZJ());
        LIZLLL(null).LJJII(C82729WdR.LJLIL, C82730WdS.LJLIL);
    }

    public static C73480Sse LIZ(BaseAccountFlowFragment fragment, String str) {
        o.LJIIIZ(fragment, "fragment");
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        C68322mC c68322mC3 = new C68322mC();
        LIZLLL = str;
        return LIZLLL("si").LJIJI(new IDhS65S0200000_1(c68322mC, c68322mC2, 2)).LJIILL(new C82725WdN(c68322mC, str, c68322mC2)).LJIJI(new IDhS99S0100000_6(c68322mC3, 3)).LJIILL(new C41345GKn(c68322mC, c68322mC3, c68322mC2)).LJIILL(new C82723WdL(fragment, c68322mC3)).LJIILL(new IDhS107S0100000_14(fragment, 0)).LJIIIZ(C82726WdO.LIZ);
    }

    public static GetVendorInfoResponse.VendorInfo LIZIZ(String str, List list) {
        if (list == null || str == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GetVendorInfoResponse.VendorInfo vendorInfo = (GetVendorInfoResponse.VendorInfo) it.next();
            if (o.LJ(vendorInfo.mode, str)) {
                return vendorInfo;
            }
        }
        return null;
    }
}
