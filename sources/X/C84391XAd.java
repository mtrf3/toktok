package X;

/* renamed from: X.XAd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84391XAd implements InterfaceC10860bi {
    public final C10830bf[] LIZ;
    public final C32611Pt[] LIZIZ;

    @Override // X.InterfaceC10860bi
    public final void close() {
        for (C32611Pt c32611Pt : this.LIZIZ) {
            if (c32611Pt != null) {
                C10820be.LIZIZ(c32611Pt);
            }
        }
    }

    public C84391XAd(String str, C10830bf[] c10830bfArr, C32611Pt[] c32611PtArr, long[] jArr) {
        this.LIZ = c10830bfArr;
        this.LIZIZ = c32611PtArr;
    }
}
