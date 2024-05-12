package X;

import android.os.SystemClock;

/* renamed from: X.Qox, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC68155Qox implements Runnable {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public final /* synthetic */ C68074Qne LJLJJI;

    public abstract void LIZ();

    public void LIZIZ() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJJI.LJFF) {
                LIZIZ();
            } else {
                try {
                    LIZ();
                } catch (Exception e) {
                    this.LJLJJI.LIZ(e, false, this.LJLJI);
                    LIZIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public AbstractRunnableC68155Qox(C68074Qne c68074Qne, boolean z) {
        this.LJLJJI = c68074Qne;
        c68074Qne.LIZIZ.getClass();
        this.LJLIL = System.currentTimeMillis();
        c68074Qne.LIZIZ.getClass();
        this.LJLILLLLZI = SystemClock.elapsedRealtime();
        this.LJLJI = z;
    }
}
