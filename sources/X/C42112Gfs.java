package X;

/* renamed from: X.Gfs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42112Gfs {
    public long LIZ;

    public final void LIZIZ() {
        this.LIZ = System.currentTimeMillis();
    }

    public final long LIZ(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        this.LIZ = 0L;
        return currentTimeMillis;
    }
}
