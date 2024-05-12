package X;

/* renamed from: X.IRz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46635IRz {
    public final String LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("awemeId ");
        LIZ.append((Object) this.LIZ);
        LIZ.append(" isSr ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" duration ");
        LIZ.append(this.LIZJ);
        LIZ.append(" srFailReason ");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public C46635IRz(int i, long j, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
