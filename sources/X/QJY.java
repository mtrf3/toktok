package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QJY {
    public static InterfaceC66783QIx LIZ;
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();

    public static boolean LJFF(String str) {
        if (C38354F3m.LJ(str) || str.equalsIgnoreCase("unknown") || str.equalsIgnoreCase("None")) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static void LIZ(StringBuilder sb, java.util.Map<String, String> map) {
        android.net.Uri parse = UriProtector.parse(sb.toString());
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!queryParameterNames.contains(str) && !TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        sb.delete(0, sb.length());
        sb.append(buildUpon.build().toString());
    }

    public static String LIZIZ(String str, boolean z) {
        QKO qko = QKO.L0;
        InterfaceC66783QIx interfaceC66783QIx = LIZ;
        if (C38354F3m.LJ(str) || interfaceC66783QIx == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        LIZLLL(sb, z, qko);
        return sb.toString();
    }

    public static void LIZJ(String str, String str2) {
        QKO qko = QKO.L1;
        if (qko == null || C38354F3m.LJ(str) || C38354F3m.LJ(str2)) {
            return;
        }
        if (DeviceRegisterManager.getSwitchToBdtracker()) {
            C66795QJj.LIZ(str, str2, qko);
            return;
        }
        int i = QKP.LIZ[qko.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZIZ.put(str, str2);
            }
        } else {
            LIZJ.put(str, str2);
        }
        if (C38354F3m.LJ(str) || C38354F3m.LJ(str2)) {
            return;
        }
        if (DeviceRegisterManager.getSwitchToBdtracker()) {
            C66795QJj.LIZ(str, str2, qko);
            return;
        }
        int i2 = QKQ.LIZ[qko.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            QJZ.LJIIIIZZ.put(str, str2);
            return;
        }
        QJZ.LJIIIZ.put(str, str2);
    }

    public static void LJI(java.util.Map map, boolean z) {
        int i;
        C03880Dg c03880Dg = new C03880Dg(2);
        int i2 = 0;
        Object[] objArr = {map, Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/util/Map;Z)V", "1259318953956078326");
        if (c03880Dg.LIZJ(400401, "com/ss/android/common/applog/NetUtil", "putCommonParams", QJY.class, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(400401, "com/ss/android/common/applog/NetUtil", "putCommonParams", null, objArr, QJY.class, c65300Pk0, false);
            return;
        }
        if (map != null) {
            LJII(map, z, QKO.L0);
            Long.valueOf(EF7.LJI()).intValue();
            try {
                String[] split = EF7.LJII().split("\\.");
                int length = split.length;
                i = 0;
                while (i2 < length) {
                    try {
                        i = CastIntegerProtector.valueOf(split[i2]).intValue() + (i * 100);
                        i2++;
                    } catch (Throwable unused) {
                        i2 = i;
                        i = i2;
                        map.put("version_code", String.valueOf(i));
                        c03880Dg.LIZIZ(400401, "com/ss/android/common/applog/NetUtil", "putCommonParams", null, objArr, QJY.class, c65300Pk0, true);
                    }
                }
            } catch (Throwable unused2) {
            }
            map.put("version_code", String.valueOf(i));
        }
        c03880Dg.LIZIZ(400401, "com/ss/android/common/applog/NetUtil", "putCommonParams", null, objArr, QJY.class, c65300Pk0, true);
    }

    public static void LIZLLL(StringBuilder sb, boolean z, QKO qko) {
        if (LIZ == null || sb == null) {
            return;
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(sb2);
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        Uri.Builder buildUpon = parse.buildUpon();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJII(linkedHashMap, z, qko);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!queryParameterNames.contains(str) && !TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        sb.delete(0, sb.length());
        sb.append(buildUpon.build().toString());
    }

    public static void LJII(java.util.Map<String, String> map, boolean z, QKO qko) {
        QKS qks;
        HashMap LIZ2;
        InterfaceC66783QIx interfaceC66783QIx = LIZ;
        if (interfaceC66783QIx == null) {
            return;
        }
        Context context = interfaceC66783QIx.getContext();
        if (DeviceRegisterManager.getSwitchToBdtracker()) {
            C66765QIf c66765QIf = C66795QJj.LIZIZ;
            if (c66765QIf.LIZIZ()) {
                c66765QIf.LJ.LIZIZ(context, z, map, qko);
                return;
            }
            return;
        }
        InterfaceC66783QIx interfaceC66783QIx2 = QJZ.LIZLLL;
        if (map == null || interfaceC66783QIx2 == null || qko == null) {
            return;
        }
        if (DeviceRegisterManager.getSwitchToBdtracker()) {
            Context context2 = interfaceC66783QIx2.getContext();
            C66765QIf c66765QIf2 = C66795QJj.LIZIZ;
            if (!c66765QIf2.LIZIZ()) {
                return;
            }
            c66765QIf2.LJ.LIZIZ(context2, z, map, qko);
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            String LIZ3 = FCD.LIZ(interfaceC66783QIx2.getContext());
            if (LIZ3 != null && LIZ3.endsWith(":push")) {
                Logger.debug();
            } else {
                DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(hashMap);
            }
        } catch (Exception unused) {
            DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(hashMap);
        }
        String str = (String) hashMap.get("install_id");
        if (!C38354F3m.LJ(str)) {
            map.put("iid", str);
        }
        String str2 = (String) hashMap.get("device_id");
        if (!C38354F3m.LJ(str2)) {
            map.put("device_id", str2);
        }
        Context context3 = interfaceC66783QIx2.getContext();
        if (context3 != null) {
            InterfaceC66827QKp interfaceC66827QKp = QJZ.LJIIJJI;
            if (interfaceC66827QKp != null) {
                String name = ((C48305IxZ) interfaceC66827QKp).LIZIZ.name();
                if (!C38354F3m.LJ(name)) {
                    map.put("ac", name);
                    Logger.debug();
                }
            } else {
                String LLJILJILJ = C16880lQ.LLJILJILJ(context3);
                if (!C38354F3m.LJ(LLJILJILJ)) {
                    map.put("ac", LLJILJILJ);
                    Logger.debug();
                }
            }
        }
        String LIZIZ2 = interfaceC66783QIx2.LIZIZ();
        if (LIZIZ2 != null) {
            map.put("channel", LIZIZ2);
        }
        map.put("aid", String.valueOf(interfaceC66783QIx2.getAid()));
        String appName = interfaceC66783QIx2.getAppName();
        if (appName != null) {
            map.put("app_name", appName);
        }
        map.put("version_code", String.valueOf(interfaceC66783QIx2.getVersionCode()));
        map.put("version_name", interfaceC66783QIx2.getVersion());
        String str3 = "android";
        map.put("device_platform", "android");
        if (PCI.LIZLLL()) {
            str3 = "harmony";
        }
        map.put("os", str3);
        try {
            if (PCI.LIZLLL()) {
                map.put("sub_os_api", String.valueOf(C58323Mul.LIZ("hw_sc.build.os.apiversion")));
            }
        } catch (Throwable unused2) {
        }
        String abVersion = interfaceC66783QIx2.getAbVersion();
        if (!C38354F3m.LJ(abVersion)) {
            map.put("ab_version", abVersion);
        }
        interfaceC66783QIx2.getAbClient();
        if (!C38354F3m.LJ(null)) {
            map.put("ab_client", null);
        }
        interfaceC66783QIx2.LIZ();
        if (!C38354F3m.LJ(null)) {
            map.put("ab_group", null);
        }
        interfaceC66783QIx2.getAbFeature();
        if (!C38354F3m.LJ(null)) {
            map.put("ab_feature", null);
        }
        interfaceC66783QIx2.getAbFlag();
        if (z) {
            map.put("ssmix", "a");
        }
        map.put("device_type", Build.MODEL);
        map.put("device_brand", Build.BRAND);
        map.put("language", Locale.getDefault().getLanguage());
        map.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str4 = Build.VERSION.RELEASE;
            if (str4 != null && str4.length() > 10) {
                str4 = str4.substring(0, 10);
            }
            map.put("os_version", str4);
        } catch (Exception unused3) {
        }
        QKO qko2 = QKO.L0;
        if (qko == qko2) {
            if (!DeviceRegisterManager.isChildMode()) {
                String str5 = (String) hashMap.get("openudid");
                if (!C38354F3m.LJ(str5)) {
                    map.put("openudid", str5);
                }
            }
            InterfaceC66830QKs interfaceC66830QKs = QJZ.LJIIL;
            if (interfaceC66830QKs != null) {
                String LIZ4 = interfaceC66830QKs.LIZ();
                if (!TextUtils.isEmpty(LIZ4)) {
                    map.put("aliyun_uuid", LIZ4);
                }
            }
        }
        map.put("manifest_version_code", String.valueOf(interfaceC66783QIx2.getManifestVersionCode()));
        String LJIIJ = KL2.LJIIJ(interfaceC66783QIx2.getContext());
        if (!C38354F3m.LJ(LJIIJ)) {
            map.put("resolution", LJIIJ);
        }
        int LJIIIIZZ = KL2.LJIIIIZZ(interfaceC66783QIx2.getContext());
        if (LJIIIIZZ > 0) {
            map.put("dpi", String.valueOf(LJIIIIZZ));
        }
        map.put("update_version_code", String.valueOf(interfaceC66783QIx2.getUpdateVersionCode()));
        map.put("_rticket", String.valueOf(System.currentTimeMillis()));
        QJZ.LIZJ(QJZ.LJIIIIZZ, map);
        if (qko == qko2) {
            QJZ.LIZJ(QJZ.LJIIIZ, map);
        }
        try {
            if (QJZ.LJIIJ != null && (LIZ2 = QJZ.LJIIJ.LIZ()) != null && !LIZ2.isEmpty()) {
                for (Map.Entry entry : LIZ2.entrySet()) {
                    if (entry != null) {
                        String str6 = (String) entry.getKey();
                        String str7 = (String) entry.getValue();
                        if (!C38354F3m.LJ(str6) && !C38354F3m.LJ(str7) && !map.containsKey(str6)) {
                            map.put(str6, str7);
                        }
                    }
                }
            }
        } catch (Throwable unused4) {
        }
        String LIZ5 = QK5.LIZ(context3);
        if (!C38354F3m.LJ(LIZ5)) {
            map.put("cdid", LIZ5);
        }
        if (!DeviceRegisterManager.isNewUserMode(context3) || (qks = (QKS) C58318Mug.LIZ(QKS.class)) == null) {
            return;
        }
        qks.LIZ();
    }

    public static String LJ(String str, byte[] bArr, boolean z, String str2, java.util.Map map, boolean z2, boolean z3) {
        HashMap hashMap = new HashMap();
        if (z) {
            try {
                bArr = AbstractC66805QJt.LIZ(bArr);
                hashMap.put("Content-Encoding", "gzip");
            } catch (Exception e) {
                throw new C36616EYq(0, e.getMessage());
            }
        }
        if (!C38354F3m.LJ(str2)) {
            hashMap.put("Content-Type", str2);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!z3) {
            C78915Uy7.LJIIIIZZ(hashMap, z2);
        }
        return AbstractC66805QJt.LIZ.LJ(str, bArr, hashMap, new QKY());
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012e, code lost:
    
        if (r3 == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(X.InterfaceC66739QHf r5, java.lang.String r6, byte[] r7, android.content.Context r8, boolean r9, java.lang.String[] r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QJY.LJIIIIZZ(X.QHf, java.lang.String, byte[], android.content.Context, boolean, java.lang.String[], java.util.Map, java.lang.String, boolean, boolean):java.lang.String");
    }
}
