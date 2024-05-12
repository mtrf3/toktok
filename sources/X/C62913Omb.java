package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Omb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62913Omb {
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C62924Omm.LJLIL);
    public static final C62914Omc LIZIZ = new C62914Omc();
    public static int LIZJ = 3;
    public static final java.util.Set<String> LJFF = C77275UUl.LJIIIIZZ("uoo", "idfa", "webcast_language", "webcast_locale", "content_language", "allow_sell_data", "longitude", "webcast_sdk_version", "gaid", "gps_access", "address_book_access", "city", "city_name", "latitude", "ad_personality_mode", "search_source", "show_location", "mac_address", "google_aid", "android_id", "bid_ad_params", "ad_user_agent", "ssid", "openudid", "idfv", "vid");

    public static C62915Omd LIZJ() {
        return (C62915Omd) LIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC62956OnI LIZLLL() {
        /*
            X.OnH r3 = X.EnumC62956OnI.Companion
            X.Omc r1 = X.C62913Omb.LIZIZ
            java.lang.Integer r0 = r1.LJII
            if (r0 == 0) goto L20
        L8:
            int r0 = r0.intValue()
        Lc:
            r3.getClass()
            java.util.Map<java.lang.Integer, X.OnI> r1 = X.EnumC62956OnI.MAP
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.OnI r0 = (X.EnumC62956OnI) r0
            if (r0 != 0) goto L1f
            X.OnI r0 = X.EnumC62956OnI.PASS
        L1f:
            return r0
        L20:
            com.bytedance.keva.Keva r2 = r1.LIZIZ
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r0 = r1.LIZ()
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo r0 = r0.getAgeGateInfo()
            if (r0 == 0) goto L3f
            int r1 = r0.getRegisterAgeGateAction()
        L32:
            java.lang.String r0 = "register_age_gate_action"
            int r0 = r2.getInt(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L46
            goto L8
        L3f:
            X.OnI r0 = X.EnumC62956OnI.PASS
            int r1 = r0.getValue()
            goto L32
        L46:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62913Omb.LIZLLL():X.OnI");
    }

    public static boolean LJ() {
        if (!((Boolean) C88087Yhf.LJIIIZ.getValue()).booleanValue()) {
            LIZJ().getClass();
        }
        C62914Omc c62914Omc = LIZIZ;
        Boolean bool = c62914Omc.LJIIIZ;
        if (bool == null && (bool = Boolean.valueOf(c62914Omc.LIZIZ.getBoolean("need_block_af_sharing", false))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LIZ(ComplianceSetting setting) {
        boolean z;
        long j;
        Integer valueOf;
        o.LJIIIZ(setting, "setting");
        C62914Omc c62914Omc = LIZIZ;
        Boolean afSharingBlock = setting.getAfSharingBlock();
        c62914Omc.LJIIIZ = afSharingBlock;
        Keva keva = c62914Omc.LIZIZ;
        if (afSharingBlock != null) {
            z = afSharingBlock.booleanValue();
        } else {
            z = false;
        }
        keva.storeBoolean("need_block_af_sharing", z);
        Long deviceLimitRegisterExpiredTime = setting.getDeviceLimitRegisterExpiredTime();
        c62914Omc.LJIIJ = deviceLimitRegisterExpiredTime;
        Keva keva2 = c62914Omc.LIZIZ;
        if (deviceLimitRegisterExpiredTime != null) {
            j = deviceLimitRegisterExpiredTime.longValue();
        } else {
            j = 0;
        }
        keva2.storeLong("age_gate_block_device_register_expire_time", j);
        AgeGateInfo ageGateInfo = setting.getAgeGateInfo();
        if (ageGateInfo != null) {
            valueOf = Integer.valueOf(ageGateInfo.getRegisterAgeGateAction());
        } else {
            valueOf = Integer.valueOf(EnumC62956OnI.PASS.getValue());
        }
        c62914Omc.LJII = valueOf;
        Keva keva3 = c62914Omc.LIZIZ;
        o.LJI(valueOf);
        keva3.storeInt("register_age_gate_action", valueOf.intValue());
        c62914Omc.LIZIZ(setting);
        String complianceEncrypt = setting.getComplianceEncrypt();
        c62914Omc.LJI = complianceEncrypt;
        c62914Omc.LIZIZ.storeString("cmpl_enc", complianceEncrypt);
    }

    public static void LJFF(int i) {
        int i2;
        C62914Omc c62914Omc = LIZIZ;
        Integer valueOf = Integer.valueOf(i);
        c62914Omc.LJ = valueOf;
        Keva keva = c62914Omc.LIZIZ;
        if (valueOf != null) {
            i2 = valueOf.intValue();
        } else {
            i2 = 0;
        }
        keva.storeInt("remove_photo_sensitive_status", i2);
    }

    public static void LIZIZ(InterfaceC62932Omu interfaceC62932Omu, int i) {
        LIZJ().LIZ(new C62918Omg(interfaceC62932Omu), i);
    }
}
