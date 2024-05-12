package X;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Iuh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48127Iuh {
    public static final long LJIIIIZZ = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Context LIZ;
    public final QY5 LIZIZ;
    public final QY8 LIZJ;
    public final FirebaseMessaging LIZLLL;
    public final ScheduledExecutorService LJFF;
    public final C48124Iue LJII;
    public final C1HQ LJ = new C1HQ();
    public boolean LJI = false;

    public final boolean LJFF() {
        ETB LIZ;
        while (true) {
            synchronized (this) {
                LIZ = this.LJII.LIZ();
                if (LIZ == null) {
                    return true;
                }
            }
            try {
                String str = LIZ.LIZIZ;
                int hashCode = str.hashCode();
                if (hashCode == 83) {
                    if (str.equals("S")) {
                        LIZIZ(LIZ.LIZ);
                    }
                } else if (hashCode == 85 && str.equals("U")) {
                    LIZJ(LIZ.LIZ);
                }
                this.LJII.LIZJ(LIZ);
                LIZLLL(LIZ);
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage()) || e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public static <T> void LIZ(AbstractC67638Qgc<T> abstractC67638Qgc) {
        try {
            C67637Qgb.LIZIZ(abstractC67638Qgc, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw new IOException(e2);
            }
            throw cause;
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void LIZIZ(String str) {
        QY8 qy8 = this.LIZJ;
        String LIZ = this.LIZLLL.LIZ();
        qy8.getClass();
        Bundle bundle = new Bundle();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/topics/");
        LIZ2.append(str);
        bundle.putString("gcm.topic", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("/topics/");
        LIZ3.append(str);
        LIZ(qy8.LIZ(qy8.LIZJ(LIZ, X1D.LIZIZ(LIZ3), bundle)));
    }

    public final void LIZJ(String str) {
        QY8 qy8 = this.LIZJ;
        String LIZ = this.LIZLLL.LIZ();
        qy8.getClass();
        Bundle bundle = new Bundle();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/topics/");
        LIZ2.append(str);
        bundle.putString("gcm.topic", X1D.LIZIZ(LIZ2));
        bundle.putString("delete", "1");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("/topics/");
        LIZ3.append(str);
        LIZ(qy8.LIZ(qy8.LIZJ(LIZ, X1D.LIZIZ(LIZ3), bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(ETB etb) {
        synchronized (this.LJ) {
            String str = etb.LIZJ;
            if (!this.LJ.containsKey(str)) {
                return;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.LJ.getOrDefault(str, null);
            C67649Qgn c67649Qgn = (C67649Qgn) arrayDeque.poll();
            if (c67649Qgn != null) {
                c67649Qgn.LIZIZ(null);
            }
            if (arrayDeque.isEmpty()) {
                this.LJ.remove(str);
            }
        }
    }

    public final synchronized void LJ(boolean z) {
        this.LJI = z;
    }

    public final void LJI(long j) {
        this.LJFF.schedule(new RunnableC48015Ist(this, this.LIZ, this.LIZIZ, Math.min(Math.max(30L, 2 * j), LJIIIIZZ)), j, TimeUnit.SECONDS);
        synchronized (this) {
            this.LJI = true;
        }
    }

    public C48127Iuh(FirebaseMessaging firebaseMessaging, QY5 qy5, C48124Iue c48124Iue, QY8 qy8, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.LIZLLL = firebaseMessaging;
        this.LIZIZ = qy5;
        this.LJII = c48124Iue;
        this.LIZJ = qy8;
        this.LIZ = context;
        this.LJFF = scheduledExecutorService;
    }
}
