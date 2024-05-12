package X;

/* renamed from: X.TYi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC74828TYi implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public RunnableC74828TYi(String str, long j, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C74824TYe.LJJLIIIJ(0, this.LJLIL, this.LJLJI, this.LJLILLLLZI, this.LJLJJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
