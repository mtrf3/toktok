package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.ropa.encrypt.EncryptResult;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q0A {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[LOOP:1: B:39:0x00f4->B:41:0x00fa, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(double r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0A.LIZLLL(double):java.lang.String");
    }

    public static C2T9 LIZ(Cert cert, String methodName) {
        JSONObject jSONObject;
        int i;
        o.LJIIJ(methodName, "methodName");
        C66300Q0i checkCert = CertAuthEntry.Companion.checkCert(cert, new String[]{"location"}, "locationSDK", methodName, "Collect");
        String str = null;
        if (checkCert != null) {
            jSONObject = C78923UyF.LJIIIIZZ(checkCert);
        } else {
            jSONObject = null;
        }
        C35861aw c35861aw = new C35861aw(jSONObject);
        if (checkCert != null) {
            i = checkCert.LIZLLL;
            str = checkCert.LJ;
        } else {
            i = 0;
        }
        return new C2T9(i, str, c35861aw);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[LOOP:1: B:41:0x00ea->B:43:0x00f0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.bytedance.bpea.basics.Cert r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0A.LIZIZ(com.bytedance.bpea.basics.Cert, java.lang.String):java.lang.String");
    }

    public static Q0B LIZJ(String latitude, String longitude, Cert cert) {
        o.LJIIJ(latitude, "latitude");
        o.LJIIJ(longitude, "longitude");
        o.LJIIJ(cert, "cert");
        CertAuthEntry.Companion.checkCert(cert, new String[]{"location"}, "locationSDK", "Decrypt", "Collect");
        try {
            return new Q0B(CastDoubleProtector.parseDouble(LIZIZ(cert, latitude)), CastDoubleProtector.parseDouble(LIZIZ(cert, longitude)));
        } catch (Q0C e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            throw new Q0C(-1, message);
        }
    }

    public static C27433Aph LJFF(double d, double d2, Cert cert) {
        JSONObject LIZ;
        String optString;
        o.LJIIJ(cert, "cert");
        try {
            String certToken = cert.certToken();
            Q09 q09 = C66236Pz6.LIZIZ;
            int i = 1;
            if (q09 != null && (LIZ = q09.LIZ(cert)) != null && (optString = LIZ.optString("ropaId")) != null && optString.length() != 0) {
                i = 2;
                certToken = optString;
            }
            return new C27433Aph(LJ(d, cert, i, certToken), LJ(d2, cert, i, certToken));
        } catch (Q0C e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            throw new Q0C(-1, message);
        }
    }

    public static String LJ(double d, Cert cert, int i, String str) {
        String str2;
        EncryptResult encryptResult;
        int code;
        int i2;
        String str3;
        long nanoTime = System.nanoTime();
        boolean z = false;
        try {
            try {
                try {
                    encryptResult = RopaEncrypt.getEncryptSeqV2(String.valueOf(d), i, str);
                    o.LJFF(encryptResult, "encryptResult");
                    code = encryptResult.getCode();
                    try {
                        if (encryptResult.getCode() < 0) {
                            encryptResult = RopaEncrypt.getEncryptSeqV2(String.valueOf(d), i, str);
                            o.LJFF(encryptResult, "encryptResult");
                            i2 = encryptResult.getCode();
                        } else {
                            i2 = 0;
                        }
                    } catch (Q0C e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Q0C e2) {
                e = e2;
            }
            try {
                if (encryptResult.getCode() >= 0) {
                    String data = encryptResult.getData();
                    if (data == null || data.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        String data2 = encryptResult.getData();
                        o.LJFF(data2, "encryptResult.data");
                        float nanoTime2 = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
                        Iterator it = ((ArrayList) C66236Pz6.LIZ).iterator();
                        while (it.hasNext()) {
                            InterfaceC771330z interfaceC771330z = (InterfaceC771330z) it.next();
                            if (cert != null) {
                                str3 = cert.certToken();
                            } else {
                                str3 = null;
                            }
                            interfaceC771330z.LIZ(nanoTime2, code, i2, "", str3, "encrypt");
                        }
                        return data2;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("result data is null, error ");
                    LIZ.append(encryptResult.getCode());
                    throw new Q0C(-1, X1D.LIZIZ(LIZ));
                }
                int code2 = encryptResult.getCode();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("encrypt error ");
                LIZ2.append(encryptResult.getCode());
                throw new Q0C(code2, X1D.LIZIZ(LIZ2));
            } catch (Q0C e3) {
                e = e3;
                e.getErrorCode();
                e.getErrorMsg();
                throw e;
            } catch (Throwable th2) {
                th = th2;
                String str4 = "";
                if (th.getMessage() == null) {
                }
                String message = th.getMessage();
                if (message != null) {
                    str4 = message;
                }
                throw new Q0C(-1, str4);
            }
        } catch (Throwable th3) {
            float nanoTime3 = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
            Iterator it2 = ((ArrayList) C66236Pz6.LIZ).iterator();
            while (it2.hasNext()) {
                InterfaceC771330z interfaceC771330z2 = (InterfaceC771330z) it2.next();
                if (cert != null) {
                    str2 = cert.certToken();
                } else {
                    str2 = null;
                }
                interfaceC771330z2.LIZ(nanoTime3, -1, 0, "", str2, "encrypt");
            }
            throw th3;
        }
    }
}
