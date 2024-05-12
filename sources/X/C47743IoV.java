package X;

import java.util.TimerTask;

/* renamed from: X.IoV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47743IoV extends TimerTask {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C47739IoR LJLJI;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZIZ(this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47743IoV(C47739IoR c47739IoR, String str, String str2) {
        this.LJLJI = c47739IoR;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
