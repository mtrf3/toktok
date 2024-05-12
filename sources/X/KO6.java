package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class KO6 implements Runnable {
    public final Context LJLIL;
    public final KO5 LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                C78841Uwv.LJJ(this.LJLIL);
                if (!this.LJLILLLLZI.LIZ()) {
                    this.LJLILLLLZI.LJIIL();
                }
            } catch (Exception unused) {
                C78841Uwv.LJJI(this.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public KO6(Context context, KO5 ko5) {
        this.LJLIL = context;
        this.LJLILLLLZI = ko5;
    }
}
