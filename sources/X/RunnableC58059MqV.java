package X;

/* renamed from: X.MqV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58059MqV implements Runnable {
    public final /* synthetic */ C58049MqL LJLIL;
    public final /* synthetic */ C57749MlV LJLILLLLZI;
    public final /* synthetic */ C58055MqR LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC58059MqV(C58049MqL c58049MqL, C57749MlV c57749MlV, C58055MqR c58055MqR, float f, String str) {
        this.LJLIL = c58049MqL;
        this.LJLILLLLZI = c57749MlV;
        this.LJLJI = c58055MqR;
        this.LJLJJI = f;
        this.LJLJJL = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LJJJJJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
