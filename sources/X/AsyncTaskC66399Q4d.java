package X;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.internal.WebDialog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Q4d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class AsyncTaskC66399Q4d extends PthreadAsyncTask<Void, Void, String[]> {
    public final String LIZ;
    public final Bundle LIZIZ;
    public Exception[] LIZJ;
    public final /* synthetic */ WebDialog LIZLLL;

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Psf] */
    public final String[] LIZ(Void... p0) {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            if (C40700FyC.LIZ(this)) {
                return null;
            }
            o.LJIIIZ(p0, "p0");
            String[] stringArray = this.LIZIZ.getStringArray("media");
            if (stringArray == null) {
                return null;
            }
            final String[] strArr = new String[stringArray.length];
            this.LIZJ = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken.Companion.getClass();
            AccessToken LIZIZ = C66382Q3m.LIZIZ();
            try {
                int length = stringArray.length - 1;
                if (length >= 0) {
                    final int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTaskC66391Q3v) it.next()).cancel(true);
                            }
                            return null;
                        }
                        android.net.Uri uri = android.net.Uri.parse(stringArray[i]);
                        if (C66373Q3d.LJIJJLI(uri)) {
                            strArr[i] = uri.toString();
                            countDownLatch.countDown();
                        } else {
                            ?? r1 = new BMV() { // from class: X.Psf
                                @Override // X.BMV
                                public final void LIZ(C66381Q3l c66381Q3l) {
                                    FacebookRequestError facebookRequestError;
                                    String str;
                                    String[] results = strArr;
                                    int i3 = i;
                                    AsyncTaskC66399Q4d this$0 = this;
                                    CountDownLatch latch = countDownLatch;
                                    o.LJIIIZ(results, "$results");
                                    o.LJIIIZ(this$0, "this$0");
                                    o.LJIIIZ(latch, "$latch");
                                    try {
                                        facebookRequestError = c66381Q3l.LIZLLL;
                                        str = "Error staging photo.";
                                    } catch (Exception e) {
                                        this$0.LIZJ[i3] = e;
                                    }
                                    if (facebookRequestError != null) {
                                        String LIZ = facebookRequestError.LIZ();
                                        if (LIZ != null) {
                                            str = LIZ;
                                        }
                                        throw new C65835Psd(c66381Q3l, str);
                                    }
                                    JSONObject jSONObject = c66381Q3l.LIZJ;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("uri");
                                        if (optString != null) {
                                            results[i3] = optString;
                                            latch.countDown();
                                            return;
                                        }
                                        throw new Q4W("Error staging photo.");
                                    }
                                    throw new Q4W("Error staging photo.");
                                }
                            };
                            o.LJIIIIZZ(uri, "uri");
                            concurrentLinkedQueue.add(Q6F.LJI(LIZIZ, uri, r1).LIZLLL());
                        }
                        if (i2 > length) {
                            break;
                        }
                        i = i2;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Exception unused) {
                Iterator it2 = concurrentLinkedQueue.iterator();
                while (it2.hasNext()) {
                    ((AsyncTaskC66391Q3v) it2.next()).cancel(true);
                }
                return null;
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LIZIZ(String[] strArr) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (C40700FyC.LIZ(this)) {
                return;
            }
            ProgressDialog progressDialog = this.LIZLLL.LJLJJL;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Exception[] excArr = this.LIZJ;
            int length = excArr.length;
            int i = 0;
            while (i < length) {
                Exception exc = excArr[i];
                i++;
                if (exc != null) {
                    this.LIZLLL.LJ(exc);
                    return;
                }
            }
            if (strArr == null) {
                this.LIZLLL.LJ(new Q4W("Failed to stage photos for web dialog"));
                return;
            }
            List LJIILL = C61898ORa.LJIILL(strArr);
            if (LJIILL.contains(null)) {
                this.LIZLLL.LJ(new Q4W("Failed to stage photos for web dialog"));
                return;
            }
            C66373Q3d.LJJIFFI(this.LIZIZ, new JSONArray((Collection) LJIILL));
            String LIZ = Q4Y.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIL());
            LIZ2.append("/dialog/");
            LIZ2.append(this.LIZ);
            android.net.Uri LIZ3 = C66373Q3d.LIZ(LIZ, X1D.LIZIZ(LIZ2), this.LIZIZ);
            this.LIZLLL.LJLIL = LIZ3.toString();
            ImageView imageView = this.LIZLLL.LJLJJLL;
            if (imageView != null) {
                this.LIZLLL.LJFF((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            if (C40700FyC.LIZ(this)) {
                return null;
            }
            return LIZ((Void[]) objArr);
        } catch (Throwable unused) {
            return null;
        }
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
            LIZIZ((String[]) obj);
        } catch (Throwable unused) {
        }
    }

    public AsyncTaskC66399Q4d(WebDialog this$0, String action, Bundle bundle) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(action, "action");
        this.LIZLLL = this$0;
        this.LIZ = action;
        this.LIZIZ = bundle;
        this.LIZJ = new Exception[0];
    }
}
