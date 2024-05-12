package X;

/* renamed from: X.OhZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class RunnableC62601OhZ implements Runnable {
    public boolean LJLIL;
    public final /* synthetic */ ViewOnClickListenerC62596OhU LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLIL) {
                long currentTimeMillis = System.currentTimeMillis();
                ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU = this.LJLILLLLZI;
                if (currentTimeMillis >= viewOnClickListenerC62596OhU.LJLJJL) {
                    viewOnClickListenerC62596OhU.onDismiss();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC62601OhZ(ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU) {
        this.LJLILLLLZI = viewOnClickListenerC62596OhU;
    }
}
