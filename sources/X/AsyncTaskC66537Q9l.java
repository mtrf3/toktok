package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class AsyncTaskC66537Q9l extends PthreadAsyncTask<Void, Void, JSONObject> {
    public final C65474Pmo LIZ;
    public final InterfaceC58399Mvz LIZIZ;
    public final InterfaceC63926P7a LIZJ;
    public final QAN LIZLLL;
    public C66543Q9r LJ;

    public static void LIZ(URLConnection uRLConnection) {
        if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
            uRLConnection.setRequestProperty("Accept", "application/json");
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00bc: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777404), block:B:25:0x00bc */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            try {
                HttpURLConnection LIZIZ = P7Z.LIZIZ(this.LIZ.LIZ.LIZIZ);
                LIZIZ.setRequestMethod("POST");
                LIZIZ.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                LIZ(LIZIZ);
                LIZIZ.setDoOutput(true);
                this.LIZIZ.getRequestHeaders();
                java.util.Map<String, String> LIZ = this.LIZ.LIZ();
                java.util.Map<String, String> LIZ2 = this.LIZIZ.LIZ(this.LIZ.LIZIZ);
                if (LIZ2 != null) {
                    ((HashMap) LIZ).putAll(LIZ2);
                }
                String LIZIZ2 = CHI.LIZIZ(LIZ);
                LIZIZ.setRequestProperty("Content-Length", String.valueOf(LIZIZ2.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(LIZIZ.getOutputStream());
                outputStreamWriter.write(LIZIZ2);
                outputStreamWriter.flush();
                if (LIZIZ.getResponseCode() >= 200 && LIZIZ.getResponseCode() < 300) {
                    inputStream = LIZIZ.getInputStream();
                } else {
                    inputStream = LIZIZ.getErrorStream();
                }
                try {
                    JSONObject jSONObject = new JSONObject(C36622EYw.LIZIZ(inputStream));
                    C36622EYw.LIZ(inputStream);
                    return jSONObject;
                } catch (IOException e) {
                    e = e;
                    Q6T.LIZIZ().LIZJ(3, "Failed to complete exchange request", e, new Object[0]);
                    this.LJ = C66543Q9r.fromTemplate(QAI.LIZLLL, e);
                    C36622EYw.LIZ(inputStream);
                    return null;
                } catch (JSONException e2) {
                    e = e2;
                    Q6T.LIZIZ().LIZJ(3, "Failed to complete exchange request", e, new Object[0]);
                    this.LJ = C66543Q9r.fromTemplate(QAI.LJ, e);
                    C36622EYw.LIZ(inputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream3 = inputStream2;
                C36622EYw.LIZ(inputStream3);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
        } catch (JSONException e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C36622EYw.LIZ(inputStream3);
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        C66543Q9r fromTemplate;
        android.net.Uri parse;
        JSONObject jSONObject = (JSONObject) obj;
        C66543Q9r c66543Q9r = this.LJ;
        if (c66543Q9r != null) {
            this.LIZLLL.LIZ(null, c66543Q9r);
            return;
        }
        if (jSONObject.has("error")) {
            try {
                String string = JSONObjectProtectorUtils.getString(jSONObject, "error");
                C66543Q9r c66543Q9r2 = C66541Q9p.LIZIZ.get(string);
                if (c66543Q9r2 == null) {
                    c66543Q9r2 = C66541Q9p.LIZ;
                }
                String optString = jSONObject.optString("error_description", null);
                String optString2 = jSONObject.optString("error_uri");
                if (optString2 == null) {
                    parse = null;
                } else {
                    parse = UriProtector.parse(optString2);
                }
                fromTemplate = C66543Q9r.fromOAuthTemplate(c66543Q9r2, string, optString, parse);
            } catch (JSONException e) {
                fromTemplate = C66543Q9r.fromTemplate(QAI.LJ, e);
            }
            this.LIZLLL.LIZ(null, fromTemplate);
            return;
        }
        try {
            C66538Q9m c66538Q9m = new C66538Q9m(this.LIZ);
            c66538Q9m.LIZ(jSONObject);
            QA1 qa1 = new QA1(c66538Q9m.LIZ, c66538Q9m.LIZIZ, c66538Q9m.LIZJ, c66538Q9m.LIZLLL, c66538Q9m.LJ, c66538Q9m.LJFF, c66538Q9m.LJI);
            Q6T.LIZ("Token exchange with %s completed", this.LIZ.LIZ.LIZIZ);
            this.LIZLLL.LIZ(qa1, null);
        } catch (JSONException e2) {
            this.LIZLLL.LIZ(null, C66543Q9r.fromTemplate(QAI.LJ, e2));
        }
    }

    public AsyncTaskC66537Q9l(C65474Pmo c65474Pmo, InterfaceC63926P7a interfaceC63926P7a, QAN qan) {
        C58400Mw0 c58400Mw0 = C58400Mw0.LIZ;
        this.LIZ = c65474Pmo;
        this.LIZIZ = c58400Mw0;
        this.LIZJ = interfaceC63926P7a;
        this.LIZLLL = qan;
    }
}
