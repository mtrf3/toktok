package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Xdj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85295Xdj {
    public static C7IJ LIZIZ;
    public static boolean LIZLLL;
    public static Boolean LJ;
    public static final C85295Xdj LIZ = new C85295Xdj();
    public static EnumC85294Xdi LIZJ = EnumC85294Xdi.SCENE_BOOT;

    public static String LIZLLL() {
        String str;
        C85296Xdk.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        Config[] LIZIZ2 = C85296Xdk.LIZIZ();
        if (LIZIZ2 != null) {
            for (Config config : LIZIZ2) {
                List<PopupSceneV2> list = config.popupSceneV2;
                if (list != null && C78866UxK.LJJ("fyp", list)) {
                    C85296Xdk.LIZ.getClass();
                    if (!C85296Xdk.LJI(config) && (str = config.business) != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return (String) ListProtector.get(arrayList, 0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (X.C85296Xdk.LJ(r1, "fyp") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (LIZ() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (X.C52190Ke2.LIZ() != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        LJIIIIZZ(r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (X.C52190Ke2.LIZ() == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (X.C52190Ke2.LIZ() != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (X.C35908E7k.LIZIZ().getBoolean("has_consented_location_permission", false) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        LJIIIZ(r2, new kotlin.jvm.internal.AqS165S0100000_15(r2, 785));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        X.C85299Xdn.LJFF(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0060, code lost:
    
        if (X.C52190Ke2.LIZ() > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (X.C85296Xdk.LJ(r1, "fyp") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        if (LIZ() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
    
        if (X.C52190Ke2.LIZ() != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        LJIIIIZZ(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
    
        if (X.C52190Ke2.LIZ() != 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ec, code lost:
    
        if (X.C35908E7k.LIZIZ().getBoolean("has_deny_location_permission_manually", false) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        X.C85299Xdn.LJFF(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
    
        LJIIIZ(r2, new kotlin.jvm.internal.AqS165S0100000_15(r2, 786));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
    
        if (X.C52190Ke2.LIZ() != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
    
        if (X.C35908E7k.LIZIZ().getBoolean("has_deny_location_permission_manually", false) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        X.C85299Xdn.LJFF(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0114, code lost:
    
        LJIIIZ(r2, new kotlin.jvm.internal.AqS165S0100000_15(r2, 787));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
    
        if (X.C52190Ke2.LIZ() == 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012a, code lost:
    
        if (X.C52190Ke2.LIZ() != 4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
    
        if (X.C35908E7k.LIZIZ().getBoolean("has_deny_location_permission_manually", false) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0136, code lost:
    
        X.C85299Xdn.LJFF(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013b, code lost:
    
        LJIIIZ(r2, new kotlin.jvm.internal.AqS165S0100000_15(r2, 789));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0147, code lost:
    
        LJII(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c7, code lost:
    
        if (X.C52190Ke2.LIZ() > 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85295Xdj.LJI():void");
    }

    public static boolean LIZ() {
        String LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            C85296Xdk.LIZ.getClass();
            return C85296Xdk.LIZLLL(LIZLLL2, "fyp");
        }
        return false;
    }

    public static void LIZIZ() {
        LocationServiceImpl.LJIJJ().LIZJ();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get()\n                .g…LoginService::class.java)");
            if (createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false)) {
                LIZLLL = true;
                return;
            }
        }
        LJI();
    }

    public static boolean LIZJ() {
        boolean z;
        boolean z2 = true;
        if (a.LJIJI().LIZ()) {
            z = true;
        } else {
            z = false;
        }
        boolean LJIIJ = GuestModeServiceImpl.LJIIJJI().LJIIJ();
        if (Build.VERSION.SDK_INT >= 23 ? !z || LJIIJ || AV1.LJIILLIIL() : !z || LJIIJ || !C35908E7k.LIZIZ().getBoolean("key_has_pre_popup_deny_location", false) || AV1.LJIILLIIL()) {
            z2 = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isInAllowLocationMode:");
        LIZ2.append(z2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", X1D.LIZIZ(LIZ2));
        return z2;
    }

    public static void LJII(ActivityC45651qj activityC45651qj) {
        if (C35908E7k.LIZIZ().getBoolean("has_deny_location_permission_manually", false)) {
            C85299Xdn.LJFF(9);
        } else {
            LJIIIZ(activityC45651qj, new AqS165S0100000_15(activityC45651qj, 784));
        }
    }

    @QD3
    public final void onUserStateChangeEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LIZJ = EnumC85294Xdi.SCENE_LOGOUT;
                return;
            }
            LIZJ = EnumC85294Xdi.SCENE_SWITCH;
            return;
        }
        LIZJ = EnumC85294Xdi.SCENE_LOGIN;
    }

    public static void LJ(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        TokenCert with;
        C85299Xdn.LJFF(11);
        long currentTimeMillis = System.currentTimeMillis();
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps()) {
            with = TokenCert.Companion.with("bpea-fyp_request_location_permission_for_precise");
        } else {
            with = TokenCert.Companion.with("bpea-fyp_request_location_permission");
        }
        C61099NyR LIZIZ2 = C61099NyR.LIZIZ.LIZIZ(activityC45651qj, with);
        String[] strArr = (String[]) ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).locationPermissions().toArray(new String[0]);
        LIZIZ2.LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C85301Xdp(interfaceC65784Pro, currentTimeMillis));
        C85299Xdn.LJ(Boolean.FALSE, "homepage_hot", null, null);
        Boolean bool = LJ;
        if (bool != null) {
            FRW.LIZIZ(bool.booleanValue() ? 1L : 0L, "system_location_show_location_status");
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        FRW.LIZIZ(2, "system_location_show_location_status");
    }

    public static void LJIIIIZZ(ActivityC45651qj activityC45651qj, boolean z) {
        String str;
        int i;
        if (C35908E7k.LIZIZ().getBoolean("has_consented_location_permission", false)) {
            if (z) {
                LJII(activityC45651qj);
            }
            if (z) {
                i = 12;
            } else {
                i = 5;
            }
            C85299Xdn.LJFF(i);
            return;
        }
        C85299Xdn.LJFF(6);
        String LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            C85296Xdk.LIZ.getClass();
            str = C85296Xdk.LIZJ(LIZLLL2, "fyp");
        } else {
            str = null;
        }
        PopupManager.LJIIL(new C85309Xdx(activityC45651qj, z, str, C85305Xdt.LJLIL));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.M74, X.7IJ] */
    public static void LJIIIZ(final ActivityC45651qj activityC45651qj, final InterfaceC65784Pro interfaceC65784Pro) {
        ?? r0 = new AbstractC55363Lo7(activityC45651qj, interfaceC65784Pro) { // from class: X.7IJ
            public final ActivityC45651qj LJLIL;
            public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
            public final int LJLJI;

            @Override // X.InterfaceC55641Lsb
            public final C54082LKk getPopupContext() {
                ActivityC45651qj activityC45651qj2 = this.LJLIL;
                return C54081LKj.LIZ(activityC45651qj2, activityC45651qj2);
            }

            @Override // X.InterfaceC56321M8n
            public final int getPriority() {
                return this.LJLJI;
            }

            {
                o.LJIIIZ(activityC45651qj, "activity");
                this.LJLIL = activityC45651qj;
                this.LJLILLLLZI = interfaceC65784Pro;
                this.LJLJI = 220;
            }

            @Override // X.M72
            public final void LIZLLL(C54082LKk context, M78 wrapper) {
                o.LJIIIZ(context, "context");
                o.LJIIIZ(wrapper, "wrapper");
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLILLLLZI;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
            }
        };
        LIZIZ = r0;
        PopupManager.LJIIL(r0);
    }

    public static void LJFF(ActivityC45651qj activityC45651qj, C85307Xdv c85307Xdv, InterfaceC65784Pro interfaceC65784Pro, C85306Xdu c85306Xdu) {
        String string;
        long currentTimeMillis = System.currentTimeMillis();
        C26227ARb LIZ2 = C3AW.LIZ(activityC45651qj);
        FFL.LJIIIZ().getClass();
        if (C78685UuP.LJJJZ(FFL.LJIILJJIL(31744, "pre_location_popup_text", "", false))) {
            string = C47959Irz.LIZLLL(31744, "pre_location_popup_text", "", false);
        } else {
            string = activityC45651qj.getString(R.string.gsp);
        }
        LIZ2.LIZIZ(string);
        LIZ2.LJII = false;
        UC0.LIZJ(LIZ2, new LAS(activityC45651qj, interfaceC65784Pro, currentTimeMillis, c85307Xdv));
        LIZ2.LIZJ(new AqS181S0100000_15(c85306Xdu, 233));
        LIZ2.LJI().LIZLLL();
        long currentTimeMillis2 = System.currentTimeMillis();
        long j = C35908E7k.LIZIZ().getLong("pre_location_permission_show_ts", 0L);
        C35908E7k.LIZIZ().storeInt("pre_location_permission_show_count", C35908E7k.LIZIZ().getInt("pre_location_permission_show_count", 0) + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_index", String.valueOf(C35908E7k.LIZIZ().getInt("pre_location_permission_show_count", 0) - 1));
        linkedHashMap.put("previous_page", "homepage_hot");
        if (j > 0) {
            linkedHashMap.put("time_int", String.valueOf((currentTimeMillis2 - j) / 86400000));
        } else {
            linkedHashMap.put("time_int", "-1");
        }
        FMX.LJIIL("pre_location_permission_show", linkedHashMap);
        C85299Xdn.LIZJ();
        C35908E7k.LIZIZ().storeLong("pre_location_permission_show_ts", System.currentTimeMillis());
    }
}
