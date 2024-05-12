package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import defpackage.b1;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q3v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class AsyncTaskC66391Q3v extends PthreadAsyncTask<Void, Void, List<? extends C66381Q3l>> {
    public final HttpURLConnection LIZ = null;
    public final C66390Q3u LIZIZ;
    public Exception LIZJ;

    static {
        C16880lQ.LJLLILLLL(AsyncTaskC66391Q3v.class);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (C40700FyC.LIZ(this)) {
                return;
            }
            super.onPreExecute();
            if (this.LIZIZ.LJLIL == null) {
                if (C16880lQ.LLLLIIIILLL() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(C16880lQ.LLJJJJ());
                }
                this.LIZIZ.LJLIL = handler;
            }
        } catch (Throwable unused) {
        }
    }

    public final String toString() {
        StringBuilder LIZJ = b1.LIZJ("{RequestAsyncTask: ", " connection: ");
        LIZJ.append(this.LIZ);
        LIZJ.append(", requests: ");
        LIZJ.append(this.LIZIZ);
        LIZJ.append("}");
        String LIZIZ = X1D.LIZIZ(LIZJ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return LIZIZ;
    }

    public AsyncTaskC66391Q3v(C66390Q3u c66390Q3u) {
        this.LIZIZ = c66390Q3u;
    }

    public final void LIZ(List<C66381Q3l> result) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (C40700FyC.LIZ(this)) {
                return;
            }
            o.LJIIIZ(result, "result");
            super.onPostExecute(result);
            Exception exc = this.LIZJ;
            if (exc != null) {
                o.LJIIIIZZ(C16880lQ.LLLZ("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        List list = null;
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        Void[] params = (Void[]) objArr;
        if (!C40700FyC.LIZ(this) && !C40700FyC.LIZ(this)) {
            o.LJIIIZ(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.LIZ;
                if (httpURLConnection == null) {
                    C66390Q3u c66390Q3u = this.LIZIZ;
                    c66390Q3u.getClass();
                    list = C66388Q3s.LIZJ(c66390Q3u);
                } else {
                    list = C66388Q3s.LIZLLL(this.LIZIZ, httpURLConnection);
                }
            } catch (Exception e) {
                this.LIZJ = e;
            }
        }
        return list;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (C40700FyC.LIZ(this)) {
                return;
            }
            LIZ((List) obj);
        } catch (Throwable unused) {
        }
    }
}
