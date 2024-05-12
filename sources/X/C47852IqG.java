package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IqG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47852IqG extends C47854IqI {
    public static String LJI = "";
    public final int LJFF;

    @Override // X.C47854IqI
    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LJ.LIZ();
    }

    @Override // X.C47854IqI
    public final void LJFF() {
        StringBuilder sb = new StringBuilder();
        synchronized (C47856IqK.class) {
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(LJI);
        LIZ.append("/q?host=");
        sb.append(X1D.LIZIZ(LIZ));
        sb.append(this.LIZJ);
        String sb2 = sb.toString();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("http dns parse url is");
        LIZ2.append(sb2);
        TTVideoEngineLog.d("HTTPDNS", X1D.LIZIZ(LIZ2));
        Method[] declaredMethods = this.LJ.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.LJ.LIZIZ(sb2, null, new C47860IqO(this));
        } else {
            this.LJ.LIZLLL(sb2, null, new C47861IqP(this));
        }
    }

    public final void LJI(JSONObject jSONObject, C47789IpF c47789IpF) {
        if (c47789IpF != null) {
            c47789IpF.LIZJ = "kTTVideoErrorDomainHTTPDNS";
        } else {
            String str = "TT_";
            if (jSONObject == null || jSONObject.length() == 0) {
                StringBuilder LIZ = X1D.LIZ();
                if (this.LJFF != 2) {
                    str = "ALI_";
                }
                c47789IpF = new C47789IpF("kTTVideoErrorDomainHTTPDNS", -9997, 0, JBR.LJFF(LIZ, str, "HTTP dns empty", LIZ));
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    if (this.LJFF != 2) {
                        str = "ALI_";
                    }
                    c47789IpF = new C47789IpF("kTTVideoErrorDomainHTTPDNS", -9997, 0, JBR.LJFF(LIZ2, str, "HTTP dns empty", LIZ2));
                } else {
                    try {
                        jSONObject.put("time", System.currentTimeMillis());
                        jSONObject.put("dns_type", "httpDNS");
                    } catch (JSONException e) {
                        TTVideoEngineLog.d(e);
                    }
                    this.LIZ.sendMessage(this.LIZ.obtainMessage(3, jSONObject));
                    return;
                }
            }
        }
        LJ(c47789IpF);
    }

    public C47852IqG(String str, AbstractC47819Ipj abstractC47819Ipj, int i) {
        super(str, abstractC47819Ipj);
        String str2;
        this.LJFF = 2;
        this.LJFF = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DNS use HTTPDNS");
        if (i == 2) {
            str2 = "_TT";
        } else {
            str2 = "_ALI";
        }
        JBR.LJIIIZ(LIZ, str2, LIZ, "HTTPDNS");
    }
}
