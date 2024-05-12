package X;

import ujb.o;

/* loaded from: classes16.dex */
public final class XCB {
    public static boolean LIZ;
    public static final C40601ia<String, String> LIZIZ = new C40601ia<>(true);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C45248HpM.LJLIL);
    public static final C0FT LIZLLL = new C0FT((Object) null);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(XCC.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(XCD.LJLIL);

    public static String LIZJ() {
        return (String) LIZJ.getValue();
    }

    public static String LIZ(String str) {
        if (str != null) {
            if (o.LJJJJJL(str)) {
                return "";
            }
            if (LIZ) {
                C40601ia<String, String> c40601ia = LIZIZ;
                String str2 = c40601ia.get(str);
                if (str2 == null) {
                    String LIZIZ2 = LIZIZ(str);
                    if (LIZIZ2 != null) {
                        c40601ia.put(str, LIZIZ2);
                        return LIZIZ2;
                    }
                    return LIZIZ2;
                }
                return str2;
            }
            return LIZIZ(str);
        }
        return null;
    }

    public static String LIZIZ(String str) {
        Object LIZ2;
        String str2;
        boolean z;
        int i;
        try {
            if (C44180HVo.LIZ) {
                str2 = C09080Xg.LIZ(str, (byte[]) LJFF.getValue());
            } else {
                C09060Xe c09060Xe = C09070Xf.LJIIZILJ;
                byte[] LIZ3 = C0ZZ.LIZ(str);
                C62822Ol8 c62822Ol8 = LJ;
                byte[] bArr = (byte[]) c62822Ol8.getValue();
                byte[] bArr2 = (byte[]) c62822Ol8.getValue();
                EnumC09150Xn enumC09150Xn = EnumC09150Xn.PKCS7Padding;
                c09060Xe.getClass();
                str2 = XC9.LIZ(C09060Xe.LIZ(LIZ3, bArr, bArr2, enumC09150Xn), EnumC10800bc.Utf8);
            }
        } catch (Exception e) {
            try {
                if (C44180HVo.LIZ) {
                    C09060Xe c09060Xe2 = C09070Xf.LJIIZILJ;
                    byte[] LIZ4 = C0ZZ.LIZ(str);
                    C62822Ol8 c62822Ol82 = LJ;
                    byte[] bArr3 = (byte[]) c62822Ol82.getValue();
                    byte[] bArr4 = (byte[]) c62822Ol82.getValue();
                    EnumC09150Xn enumC09150Xn2 = EnumC09150Xn.PKCS7Padding;
                    c09060Xe2.getClass();
                    LIZ2 = XC9.LIZ(C09060Xe.LIZ(LIZ4, bArr3, bArr4, enumC09150Xn2), EnumC10800bc.Utf8);
                } else {
                    LIZ2 = C09080Xg.LIZ(str, (byte[]) LJFF.getValue());
                }
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            str2 = null;
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            String str3 = (String) LIZ2;
            if (str3 == null || o.LJJJJJL(str3)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return str3;
            }
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZIZ2 = C07780Sg.LIZIZ("decrypt failed!, content: ", str, ", platformVersion: ");
            LIZIZ2.append(LIZJ());
            String sb = LIZIZ2.toString();
            c12310e3.getClass();
            C12310e3.LIZIZ("EffectPlatformAES", sb, e);
            if (C44180HVo.LIZ) {
                i = 3;
            } else {
                i = 2;
            }
            InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) LIZLLL.LIZ;
            if (interfaceC58749N3x != null) {
                String message = e.getMessage();
                String LIZJ2 = LIZJ();
                OSZ[] oszArr = new OSZ[6];
                if (str == null) {
                    str = "";
                }
                oszArr[0] = new OSZ("content", str);
                if (message == null) {
                    message = "";
                }
                oszArr[1] = new OSZ("error_msg", message);
                oszArr[2] = new OSZ("stack_trace", "");
                oszArr[3] = new OSZ("effect_platform_type", Integer.valueOf(i));
                if (LIZJ2 == null) {
                    LIZJ2 = "";
                }
                oszArr[4] = new OSZ("platform_sdk_version", LIZJ2);
                oszArr[5] = new OSZ("is_third_party_business", 0);
                interfaceC58749N3x.monitorStatusRate("effectplatform_decrypt_fail", 1, C113554cx.LJJLIIIIJ(oszArr));
            }
        }
        return str2;
    }
}
