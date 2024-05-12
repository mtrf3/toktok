package X;

import android.text.TextUtils;
import android.webkit.WebView;
import ij2.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C276116n {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static final JSONObject LIZ() {
        C276216o c276216o = C276216o.LJIIL;
        if (c276216o.LJII == null) {
            synchronized (c276216o) {
                if (c276216o.LJII == null) {
                    c276216o.LJII = new C0TF(c276216o.LIZ.LIZ);
                }
            }
        }
        C0TF c0tf = c276216o.LJII;
        c0tf.getClass();
        String str = c276216o.LIZ.LIZIZ;
        try {
            String uuid = UUID.randomUUID().toString();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bytedance");
            LIZ.append(uuid);
            String LIZIZ = X1D.LIZIZ(LIZ);
            String uuid2 = UUID.randomUUID().toString();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("executeRiskJsCode with orgId:");
            LIZ2.append("k8vif92e");
            LIZ2.append(" merchantId:");
            LIZ2.append("bytedance");
            LIZ2.append(" sessionID:");
            LIZ2.append(uuid);
            X1D.LIZIZ(LIZ2);
            WebView webView = new WebView(c0tf.LIZ);
            webView.getSettings().setJavaScriptEnabled(true);
            String LIZ3 = C0TK.LIZ(str, uuid2);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("<head>\n    <script type=\"text/javascript\"\n            src=\"https://h.online-metrix.net/fp/tags.js?org_id=");
            LIZ4.append("k8vif92e");
            LIZ4.append("&session_id=");
            LIZ4.append(LIZIZ);
            LIZ4.append("\"></script>\n");
            LIZ4.append(LIZ3);
            LIZ4.append("</head>");
            String LIZIZ2 = X1D.LIZIZ(LIZ4);
            webView.setWebChromeClient(c0tf.LIZIZ);
            webView.loadDataWithBaseURL("https://www.tiktok.com", LIZIZ2, "text/html", "UTF-8", null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_fingerprint_id", LIZIZ);
            jSONObject.put("gp_device_fingerprint_id", uuid2);
            return jSONObject;
        } catch (Throwable th) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("exception in executeRiskJsCode :");
            LIZ5.append(th.getLocalizedMessage());
            X1D.LIZIZ(LIZ5);
            return null;
        }
    }

    public final C24050wz LIZIZ(String str) {
        C1JX.LJIIIIZZ("getCardPaymentMethod with cardNumber: ", str);
        if (this.LIZ.get()) {
            C0RB LIZ = C276216o.LJIIL.LIZ();
            Iterator it = ((ArrayList) LIZ.LIZLLL).iterator();
            while (it.hasNext()) {
                C23980ws c23980ws = (C23980ws) it.next();
                if (Pattern.matches(c23980ws.LIZJ, str)) {
                    C24030wx c24030wx = (C24030wx) ((HashMap) LIZ.LJFF).get(c23980ws.LJI);
                    if (c24030wx == null) {
                        return null;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("getCardPaymentMethod success, bankCardRule is \n");
                    LIZ2.append(c23980ws.toString());
                    LIZ2.append(" \n method is ");
                    LIZ2.append(c24030wx.toString());
                    X1D.LIZIZ(LIZ2);
                    return new C24050wz(c23980ws, c24030wx);
                }
            }
            return null;
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C24020ww LIZJ(C276016m c276016m) {
        try {
            if (!this.LIZ.get()) {
                try {
                    C86806Y5a.LIZ(new C86823Y5r("459695", "1.0.0-rc.51.1-bugfix"), null);
                } catch (Throwable unused) {
                }
            }
            this.LIZ.getAndSet(true);
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init with configuration:\n");
            LIZ.append(c276016m.toString());
            X1D.LIZIZ(LIZ);
            C276216o c276216o = C276216o.LJIIL;
            C24020ww LJFF = c276216o.LJFF(c276016m);
            long currentTimeMillis2 = System.currentTimeMillis();
            C1DJ LIZIZ = c276216o.LIZIZ();
            long j = currentTimeMillis2 - currentTimeMillis;
            LIZIZ.getClass();
            JSONObject LIZLLL = C1DJ.LIZLLL();
            try {
                LIZLLL.put("param_duration", j);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            LIZIZ.onEventV3("ecommerce_init", LIZLLL);
            return LJFF;
        } catch (Throwable th) {
            try {
                PJZ.LIZIZ(th, "pipo ecommerce init error");
            } catch (Throwable unused2) {
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                String stringWriter2 = stringWriter.toString();
                printWriter.close();
                return new C24020ww(11, stringWriter2);
            } catch (Throwable th2) {
                printWriter.close();
                throw th2;
            }
        }
    }

    public final void LJFF(String nonce) {
        if (this.LIZ.get()) {
            C276216o c276216o = C276216o.LJIIL;
            c276216o.LIZ.LJIILL = nonce;
            c276216o.LIZJ().getClass();
            a.LJIJ.getClass();
            o.LJIIIZ(nonce, "nonce");
            a.LJ = nonce;
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C24000wu LIZLLL(String str, String str2, String str3) {
        if (this.LIZ.get()) {
            C276216o c276216o = C276216o.LJIIL;
            C0RB LIZ = c276216o.LIZ();
            C24030wx c24030wx = (C24030wx) ((HashMap) LIZ.LJFF).get(str);
            if (c24030wx != null) {
                C23990wt c23990wt = (C23990wt) ((HashMap) c24030wx.LJIIIIZZ).get(str2);
                if (c23990wt != null) {
                    if (TextUtils.equals("eg_ccdc_global_cvv", str2)) {
                        c23990wt.LJIIIZ = ((HashMap) LIZ.LJIIIZ).get(str);
                    }
                    c23990wt.LJI = str3;
                    if (c276216o.LIZLLL == null) {
                        synchronized (c276216o) {
                            if (c276216o.LIZLLL == null) {
                                c276216o.LIZLLL = new C30991Jn();
                            }
                        }
                    }
                    return c276216o.LIZLLL.LIZ(c23990wt);
                }
                throw new RuntimeException("element is null");
            }
            throw new RuntimeException("methodWithCardBrand is null");
        }
        throw new IllegalArgumentException("please init first");
    }

    public final C24000wu LJ(String str, String str2, String str3) {
        if (this.LIZ.get()) {
            C276216o c276216o = C276216o.LJIIL;
            C24030wx c24030wx = (C24030wx) ((HashMap) c276216o.LIZ().LJFF).get(str);
            if (c24030wx != null) {
                C23990wt c23990wt = (C23990wt) ((HashMap) c24030wx.LJIIIIZZ).get("eg_ccdc_global_expiration_year");
                if (c23990wt != null) {
                    c23990wt.LJI = str2;
                    C23990wt c23990wt2 = (C23990wt) ((HashMap) c24030wx.LJIIIIZZ).get("eg_ccdc_global_expiration_month");
                    if (c23990wt2 != null) {
                        c23990wt2.LJI = str3;
                        if (c276216o.LIZLLL == null) {
                            synchronized (c276216o) {
                                if (c276216o.LIZLLL == null) {
                                    c276216o.LIZLLL = new C30991Jn();
                                }
                            }
                        }
                        return c276216o.LIZLLL.LIZ(c23990wt, c23990wt2);
                    }
                    throw new RuntimeException("monthElement is null");
                }
                throw new RuntimeException("yearElement is null");
            }
            throw new RuntimeException("methodWithCardBrand is null");
        }
        throw new IllegalArgumentException("please init first");
    }
}
