package X;

import android.view.Choreographer;

/* renamed from: X.JEk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ChoreographerFrameCallbackC48830JEk implements Choreographer.FrameCallback {
    public final int LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;

    public ChoreographerFrameCallbackC48830JEk(int i) {
        this.LJLIL = i;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        if (!this.LJLILLLLZI) {
            return;
        }
        C16880lQ.LLIIIJ().removeFrameCallback(this);
        C16880lQ.LLIIIJ().postFrameCallback(this);
        try {
            if (this.LJLIL > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.LJLJI <= 0) {
                    this.LJLJI = currentTimeMillis;
                }
                long j2 = this.LJLJJI + 1;
                this.LJLJJI = j2;
                long j3 = currentTimeMillis - this.LJLJI;
                if (j3 >= this.LJLIL) {
                    if (((int) ((((float) j2) * 1000.0f) / ((float) j3))) > 60) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C48833JEn.LIZ(true, z);
                    this.LJLILLLLZI = false;
                    C16880lQ.LLIIIJ().removeFrameCallback(this);
                    return;
                }
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.LJLJI <= 0) {
                this.LJLJI = currentTimeMillis2;
            }
            this.LJLJJI++;
            if (currentTimeMillis2 - this.LJLJI >= 1000) {
                this.LJLJJI = 0L;
                this.LJLJI = currentTimeMillis2;
            }
        } catch (Throwable unused) {
        }
    }
}
