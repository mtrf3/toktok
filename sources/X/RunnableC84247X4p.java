package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.X4p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC84247X4p implements Runnable {
    public final /* synthetic */ String LJLIL;

    public final void LIZ() {
        C84242X4k c84242X4k;
        List<HttpHeader> LIZ;
        C84243X4l c84243X4l;
        if (TextUtils.isEmpty(this.LJLIL)) {
            return;
        }
        C84242X4k c84242X4k2 = null;
        try {
            LIZ = X4P.LIZ(0L, 0L, null, null);
            c84243X4l = X5I.LIZ;
        } catch (Exception e) {
            e = e;
            c84242X4k = c84242X4k2;
        } catch (Throwable th) {
            th = th;
            c84242X4k = c84242X4k2;
            try {
                c84242X4k.cancel();
            } catch (Throwable unused) {
            }
            throw th;
        }
        if (!c84243X4l.LIZIZ(this.LJLIL) || (c84242X4k2 = c84243X4l.LIZ(this.LJLIL, LIZ)) == null) {
            c84242X4k = new C84242X4k(this.LJLIL, LIZ);
            try {
                c84242X4k.LIZLLL();
                if (c84242X4k.LJI) {
                    String str = this.LJLIL;
                    synchronized (c84243X4l.LIZ) {
                        ((HashMap) c84243X4l.LIZ).put(str, c84242X4k);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    C16880lQ.LLLLIIL(e);
                    c84242X4k2 = c84242X4k;
                    c84242X4k2.cancel();
                } catch (Throwable th2) {
                    th = th2;
                    c84242X4k2 = c84242X4k;
                    c84242X4k = c84242X4k2;
                    c84242X4k.cancel();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c84242X4k.cancel();
                throw th;
            }
            c84242X4k2 = c84242X4k;
        }
        try {
            c84242X4k2.cancel();
        } catch (Throwable unused2) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC84247X4p(String str) {
        this.LJLIL = str;
    }
}
