package X;

/* renamed from: X.PBb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64031PBb extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PBN LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            PBN pbn = this.LJLJJI;
            if (currentTimeMillis - pbn.LIZLLL >= pbn.LIZJ) {
                try {
                    pbn.LIZJ();
                } catch (Throwable th) {
                    C64028PAy.LIZJ("APM-Slardar", "send", th);
                }
                this.LJLJJI.LIZLLL = System.currentTimeMillis();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64031PBb(PBN pbn) {
        super(0L, 30000L);
        this.LJLJJI = pbn;
    }
}
