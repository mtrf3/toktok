package X;

import com.bytedance.bpea.basics.Cert;

/* renamed from: X.Fa4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39204Fa4 {
    public static void LIZ(Cert cert, String[] strArr, String str, String str2) {
        OHW ohw = new OHW(cert, C00F.LIZIZ(str, '_', str2), strArr, Integer.valueOf(EnumC39200Fa0.DIRECT_AUTH.getType()), "Collect");
        ohw.LIZ.put("sdkName", str);
        ohw.LIZ.put("methodName", str2);
        InterfaceC39206Fa6 interfaceC39206Fa6 = C39205Fa5.LIZ;
        if (interfaceC39206Fa6 != null) {
            interfaceC39206Fa6.check(ohw, null);
        }
    }
}
