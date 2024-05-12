package X;

/* renamed from: X.0p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19170p7 {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public boolean LIZLLL = true;

    public final C19180p8 LIZ() {
        int i = this.LIZ;
        if (i >= 1) {
            if (this.LIZIZ < 0) {
                this.LIZIZ = i;
            }
            if (this.LIZJ < 0) {
                this.LIZJ = i * 3;
            }
            boolean z = this.LIZLLL;
            if (z || this.LIZIZ != 0) {
                return new C19180p8(i, this.LIZIZ, z, this.LIZJ);
            }
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        throw new IllegalArgumentException("Page size must be a positive number");
    }
}
