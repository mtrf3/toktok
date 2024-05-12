package X;

import android.content.Context;

/* renamed from: X.IHv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC46371IHv implements Runnable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            KL2.LJFF(this.LJLIL, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC46371IHv(Context context, int i, int i2, int i3, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }
}
