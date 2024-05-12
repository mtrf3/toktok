package X;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;

/* renamed from: X.ZeF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90423ZeF {
    public final Context LIZ;
    public final ImageHints LIZIZ;
    public android.net.Uri LIZJ;
    public AsyncTaskC90782Zk2 LIZLLL;
    public InterfaceC90422ZeE LJ;

    public final void LIZIZ() {
        AsyncTaskC90782Zk2 asyncTaskC90782Zk2 = this.LIZLLL;
        if (asyncTaskC90782Zk2 != null) {
            asyncTaskC90782Zk2.cancel(true);
            this.LIZLLL = null;
        }
        this.LIZJ = null;
    }

    public C90423ZeF(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    public final void LIZ(android.net.Uri uri) {
        int i;
        if (uri == null) {
            LIZIZ();
            return;
        }
        if (!uri.equals(this.LIZJ)) {
            LIZIZ();
            this.LIZJ = uri;
            ImageHints imageHints = this.LIZIZ;
            int i2 = imageHints.zzb;
            if (i2 == 0 || (i = imageHints.zzc) == 0) {
                this.LIZLLL = new AsyncTaskC90782Zk2(this.LIZ, 0, 0, this);
            } else {
                this.LIZLLL = new AsyncTaskC90782Zk2(this.LIZ, i2, i, this);
            }
            AsyncTaskC90782Zk2 asyncTaskC90782Zk2 = this.LIZLLL;
            QH7.LJIIIIZZ(asyncTaskC90782Zk2);
            android.net.Uri uri2 = this.LIZJ;
            QH7.LJIIIIZZ(uri2);
            asyncTaskC90782Zk2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public C90423ZeF(Context context, ImageHints imageHints) {
        this.LIZ = context;
        this.LIZIZ = imageHints;
        LIZIZ();
    }
}
