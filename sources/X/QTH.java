package X;

/* loaded from: classes12.dex */
public final class QTH {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HistoryLoginInfo{uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUid='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", avatarUrl='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", screenName='");
        return C77800Ug8.LIZJ(LIZ, this.LIZLLL, '\'', '}', LIZ);
    }

    public QTH(long j, String str, String str2, String str3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
