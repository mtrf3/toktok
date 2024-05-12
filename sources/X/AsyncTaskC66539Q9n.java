package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q9n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class AsyncTaskC66539Q9n extends PthreadAsyncTask<Void, Void, C66540Q9o> {
    public final android.net.Uri LIZ;
    public final InterfaceC63926P7a LIZIZ;
    public final InterfaceC66564QAm LIZJ;
    public C66543Q9r LIZLLL;

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0083: MOVE (r7 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:16777347), block:B:20:0x0083 */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            try {
                HttpURLConnection LIZIZ = P7Z.LIZIZ(this.LIZ);
                LIZIZ.setRequestMethod("GET");
                LIZIZ.setDoInput(true);
                LIZIZ.connect();
                inputStream = LIZIZ.getInputStream();
                try {
                    C66540Q9o c66540Q9o = new C66540Q9o(new C66550Q9y(new JSONObject(C36622EYw.LIZIZ(inputStream))));
                    C36622EYw.LIZ(inputStream);
                    return c66540Q9o;
                } catch (QAG e) {
                    e = e;
                    Q6T.LIZIZ().LIZJ(6, "Malformed discovery document", e, new Object[0]);
                    this.LIZLLL = C66543Q9r.fromTemplate(QAI.LIZ, e);
                    C36622EYw.LIZ(inputStream);
                    return null;
                } catch (IOException e2) {
                    e = e2;
                    Q6T.LIZIZ().LIZJ(6, "Network error when retrieving discovery document", e, new Object[0]);
                    this.LIZLLL = C66543Q9r.fromTemplate(QAI.LIZLLL, e);
                    C36622EYw.LIZ(inputStream);
                    return null;
                } catch (JSONException e3) {
                    e = e3;
                    Q6T.LIZIZ().LIZJ(6, "Error parsing discovery document", e, new Object[0]);
                    this.LIZLLL = C66543Q9r.fromTemplate(QAI.LJ, e);
                    C36622EYw.LIZ(inputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream3 = inputStream2;
                C36622EYw.LIZ(inputStream3);
                throw th;
            }
        } catch (QAG e4) {
            e = e4;
            inputStream = null;
        } catch (IOException e5) {
            e = e5;
            inputStream = null;
        } catch (JSONException e6) {
            e = e6;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C36622EYw.LIZ(inputStream3);
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        C66540Q9o c66540Q9o = (C66540Q9o) obj;
        C66543Q9r c66543Q9r = this.LIZLLL;
        if (c66543Q9r != null) {
            this.LIZJ.getClass();
            C16880lQ.LLLLIIL(c66543Q9r);
        } else {
            ((QAM) this.LIZJ).LIZ.LIZ = c66540Q9o;
        }
    }

    public AsyncTaskC66539Q9n(android.net.Uri uri, QAM qam) {
        P7Z p7z = P7Z.LIZ;
        this.LIZ = uri;
        this.LIZIZ = p7z;
        this.LIZJ = qam;
    }
}
