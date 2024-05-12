package X;

import Y.IDRunnableS92S0100000_42;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.aVs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93748aVs {
    public static boolean LJ;
    public final AtomicBoolean LIZ;
    public final AtomicBoolean LIZIZ;
    public final Handler LIZJ;
    public final long LIZLLL;

    static {
        new C93747aVr();
    }

    public /* synthetic */ C93748aVs() {
        this(800L);
    }

    public C93748aVs(long j) {
        this.LIZLLL = j;
        this.LIZ = new AtomicBoolean(false);
        this.LIZIZ = new AtomicBoolean(true);
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
    }

    public final boolean LIZ(long j) {
        if (this.LIZ.get() || !this.LIZIZ.get()) {
            return false;
        }
        if (j <= 0) {
            j = this.LIZLLL;
        }
        this.LIZIZ.set(false);
        this.LIZJ.postDelayed(new IDRunnableS92S0100000_42(this, 5), j);
        return true;
    }
}
