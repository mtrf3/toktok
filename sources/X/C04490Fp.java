package X;

import java.util.HashMap;

/* renamed from: X.0Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04490Fp {
    public static String LJ(InterfaceC78280Uns interfaceC78280Uns, String str) {
        if (interfaceC78280Uns == null || !interfaceC78280Uns.hasKey(str)) {
            return null;
        }
        InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get(str);
        if (interfaceC78505UrV.getType() != EnumC78522Urm.String) {
            return null;
        }
        try {
            return interfaceC78505UrV.asString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void LIZJ(String str, Object obj, InterfaceC31943CgF interfaceC31943CgF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(" :callback successfully, response is ");
        LIZ.append(obj);
        X1D.LIZIZ(LIZ);
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("data", obj);
        interfaceC31943CgF.LIZ(hashMap);
    }

    public static void LIZLLL(String str, String str2, InterfaceC31943CgF interfaceC31943CgF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(" :callback fail, errorMsg is ");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        HashMap hashMap = new HashMap();
        hashMap.put("code", 0);
        hashMap.put("error_msg", str2);
        interfaceC31943CgF.LIZ(hashMap);
    }

    public static void LIZ(int i, int i2, String str, java.util.Map map, InterfaceC31943CgF interfaceC31943CgF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pipo.getInfoByOcr");
        LIZ.append(" :callback with code:");
        LIZ.append(i);
        LIZ.append(" detailCode:");
        LIZ.append(i2);
        LIZ.append(" msg:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("message", str);
        hashMap.put("data", map);
        interfaceC31943CgF.LIZ(hashMap);
    }

    public static void LIZIZ(String str, int i, int i2, String str2, InterfaceC31943CgF interfaceC31943CgF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(" :callback with code:");
        LIZ.append(i);
        LIZ.append(" detailCode:");
        LIZ.append(i2);
        LIZ.append(" msg:");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("message", str2);
        StringBuilder LIZ2 = X1D.LIZ();
        C1EU.LIZJ(LIZ2, "code:", i, " detailCode:", i2);
        LIZ2.append(" msg:");
        LIZ2.append(str2);
        hashMap.put("msg", X1D.LIZIZ(LIZ2));
        interfaceC31943CgF.LIZ(hashMap);
    }
}
