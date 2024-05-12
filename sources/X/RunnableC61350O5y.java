package X;

/* renamed from: X.O5y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61350O5y implements Runnable {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI = true;

    public final void LIZ() {
        long j;
        try {
            Long l = this.LJLIL;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            OAH.LJ(j, this.LJLJI, this.LJLJJI, this.LJLILLLLZI);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delete old channel version failed，path：");
            LIZ.append(this.LJLILLLLZI);
            C45804HyK.LJJLIIIJJIZ(new RuntimeException(X1D.LIZIZ(LIZ), th));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC61350O5y(Long l, String str, boolean z) {
        this.LJLIL = l;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
