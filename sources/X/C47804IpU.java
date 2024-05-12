package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IpU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47804IpU {
    public static HashMap<String, Integer> LJIILLIIL;
    public final HandlerC47813Ipd LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public InterfaceC47844Iq8 LJII;
    public final AbstractC47819Ipj LJIIIIZZ;
    public HashMap<String, EnumC47176IfM> LJIIIZ;
    public int LJIIJ;
    public final Context LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;

    public final void LJI() {
        synchronized (this) {
            this.LIZ.removeCallbacksAndMessages(null);
            InterfaceC47844Iq8 interfaceC47844Iq8 = this.LJII;
            if (interfaceC47844Iq8 == null) {
                return;
            }
            interfaceC47844Iq8.LIZIZ("fetcher cancelled");
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            this.LJIIIIZZ.LIZ();
        }
    }

    public final void LIZIZ() {
        if (this.LJIILIIL && (TextUtils.isEmpty(this.LIZLLL) || !C47850IqE.LIZIZ(this.LJIIJJI) || this.LJIILJJIL)) {
            C78253UnR.LJI("VideoInfoFetcher", "get videomodel from DB");
            EngineThreadPool.addExecuteTask(new ARunnableS44S0100000_8(this, 118));
        } else if (TextUtils.isEmpty(this.LIZLLL)) {
            LIZLLL(new C47789IpF("kTTVideoErrorDomainFetchingInfo", -9999, 0, "apistring empty"));
        } else {
            LIZ(this.LIZLLL);
        }
    }

    public C47804IpU(Context context) {
        this.LIZLLL = "";
        this.LJIILL = -1;
        this.LJIIJJI = context;
        this.LIZ = new HandlerC47813Ipd(this, C47756Ioi.LJII());
        this.LJIIIIZZ = new C47985IsP();
    }

    public static int LJIIIIZZ(JSONObject jSONObject) {
        if (jSONObject.has("CodeN")) {
            return jSONObject.optInt("CodeN");
        }
        if (jSONObject.has("Code")) {
            String optString = jSONObject.optString("Code");
            if (TextUtils.isEmpty(optString)) {
                return -1;
            }
            int indexOf = optString.indexOf(".");
            if (indexOf > 0) {
                optString = optString.substring(0, indexOf);
            }
            if (LJIILLIIL == null) {
                HashMap<String, Integer> hashMap = new HashMap<>();
                LJIILLIIL = hashMap;
                hashMap.put("InvalidClientTokenId", 100009);
                LJIILLIIL.put("SignatureDoesNotMatch", 100010);
                LJIILLIIL.put("MissingSignature", 100005);
                LJIILLIIL.put("InvalidTimestamp", 100006);
                LJIILLIIL.put("LackProjectPolicy", 100012);
                LJIILLIIL.put("AccessDenied", 100013);
                LJIILLIIL.put("InternalServiceError", 100014);
                LJIILLIIL.put("InternalServiceTimeout", 100016);
                LJIILLIIL.put("FlowLimitExceeded", 100018);
                LJIILLIIL.put("ServiceUnavailableTemp", 100019);
                LJIILLIIL.put("MethodNotAllowed", 100020);
            }
            if (LJIILLIIL.containsKey(optString)) {
                try {
                    return LJIILLIIL.get(optString).intValue();
                } catch (NullPointerException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return -1;
    }

    public final void LIZ(String str) {
        HashMap hashMap;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_beginToFetch url ");
        LIZ.append(str);
        C78253UnR.LJI("VideoInfoFetcher", X1D.LIZIZ(LIZ));
        SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(this.LJFF)) {
            hashMap = new HashMap();
            hashMap.put("Authorization", this.LJFF);
        } else {
            hashMap = null;
        }
        Method[] declaredMethods = this.LJIIIIZZ.getClass().getDeclaredMethods();
        if (declaredMethods != null && declaredMethods.length > 0) {
            for (Method method : declaredMethods) {
                if (method != null && method.getName() != null && method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                    this.LJIIIIZZ.LIZIZ(str, hashMap, new C47827Ipr(this));
                    return;
                }
            }
        }
        this.LJIIIIZZ.LIZLLL(str, hashMap, new C47834Ipy(this));
    }

    public final void LIZLLL(C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_notifyError ");
        LIZ.append(c47789IpF);
        C78253UnR.LJI("VideoInfoFetcher", X1D.LIZIZ(LIZ));
        this.LIZ.sendMessage(this.LIZ.obtainMessage(1, c47789IpF));
    }

    public final void LJFF(C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_retryIfNeeded error ");
        LIZ.append(c47789IpF);
        C78253UnR.LJI("VideoInfoFetcher", X1D.LIZIZ(LIZ));
        synchronized (this) {
            if (this.LIZIZ) {
                return;
            }
            if (c47789IpF != null) {
                if (TextUtils.isEmpty(c47789IpF.LIZJ) && c47789IpF.LIZ == -9979) {
                    c47789IpF = new C47789IpF("kTTVideoErrorDomainFetchingInfo", -9979, c47789IpF.LIZIZ, c47789IpF.LIZLLL);
                } else if (TextUtils.isEmpty(c47789IpF.LIZJ)) {
                    c47789IpF = new C47789IpF("kTTVideoErrorDomainFetchingInfo", -9994, c47789IpF.LIZIZ, c47789IpF.LIZLLL);
                }
            } else {
                c47789IpF = new C47789IpF("kTTVideoErrorDomainFetchingInfo", -9994);
            }
            if (c47789IpF.LIZ == -9969) {
                int i = c47789IpF.LIZIZ;
                if (i / 10000 != 10 && i != -9970) {
                    c47789IpF.LIZ = -9990;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("<apiStr:");
                LIZ2.append(this.LIZLLL);
                LIZ2.append(">");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(c47789IpF.LIZLLL);
                LIZ3.append(LIZIZ);
                c47789IpF.LIZLLL = X1D.LIZIZ(LIZ3);
                LIZLLL(c47789IpF);
                return;
            }
            if (this.LIZJ < 1) {
                this.LIZ.sendMessage(this.LIZ.obtainMessage(0, c47789IpF));
                this.LIZJ++;
                LIZIZ();
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("<apiStr:");
                LIZ4.append(this.LIZLLL);
                LIZ4.append(">");
                String LIZIZ2 = X1D.LIZIZ(LIZ4);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(c47789IpF.LIZLLL);
                LIZ5.append(LIZIZ2);
                c47789IpF.LIZLLL = X1D.LIZIZ(LIZ5);
                LIZLLL(c47789IpF);
            }
        }
    }

    public C47804IpU(Context context, AbstractC47819Ipj abstractC47819Ipj) {
        this.LIZLLL = "";
        this.LJIILL = -1;
        this.LJIIJJI = context;
        this.LIZ = new HandlerC47813Ipd(this, C47756Ioi.LJII());
        if (abstractC47819Ipj == null) {
            this.LJIIIIZZ = new C47985IsP();
        } else {
            this.LJIIIIZZ = abstractC47819Ipj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(org.json.JSONObject r11, X.C47870IqY r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47804IpU.LIZJ(org.json.JSONObject, X.IqY):void");
    }

    public final void LJ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("_notifyException ");
        LIZ.append(i);
        LIZ.append(", excMessage ");
        LIZ.append(str);
        C78253UnR.LJI("VideoInfoFetcher", X1D.LIZIZ(LIZ));
        this.LIZ.sendMessage(this.LIZ.obtainMessage(3, i, 0, str));
    }

    public final void LJII(int i, String str, String str2, String str3) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("fetchInfo apiString ", str, ", auth ", str2, ", playversion ");
        LIZLLL.append(i);
        LIZLLL.append(", keyseed ");
        LIZLLL.append(str3);
        C78253UnR.LJI("VideoInfoFetcher", X1D.LIZIZ(LIZLLL));
        this.LIZLLL = str;
        this.LJFF = str2;
        this.LIZJ = 0;
        this.LJIIJ = i;
        this.LJ = str3;
        try {
            new java.net.URL(str).getHost();
        } catch (Throwable unused) {
        }
        LIZIZ();
    }
}
