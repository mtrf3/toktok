package X;

import android.content.Intent;

/* renamed from: X.0Cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC03570Cb implements Runnable {
    public final C1D9 LJLIL;
    public final Intent LJLILLLLZI;
    public final int LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZ(this.LJLJI, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC03570Cb(int i, Intent intent, C1D9 c1d9) {
        this.LJLIL = c1d9;
        this.LJLILLLLZI = intent;
        this.LJLJI = i;
    }
}
