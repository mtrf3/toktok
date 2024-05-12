package X;

/* loaded from: classes12.dex */
public final class QV9 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public EnumC67115QVr LIZLLL;
    public QW9 LJ;
    public long LJFF;
    public long LJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SyncCursor{did='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", uid='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", syncId='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", topicType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bucket=");
        LIZ.append(this.LJ);
        LIZ.append(", receiveCursor=");
        LIZ.append(this.LJFF);
        LIZ.append(", reportCursor=");
        return C47135Ieh.LIZIZ(LIZ, this.LJI, '}', LIZ);
    }

    public QV9() {
    }

    public QV9(QV9 qv9) {
        this.LIZIZ = qv9.LIZIZ;
        this.LIZJ = qv9.LIZJ;
        this.LIZ = qv9.LIZ;
        this.LIZLLL = qv9.LIZLLL;
        this.LJ = qv9.LJ;
        this.LJFF = qv9.LJFF;
        this.LJI = qv9.LJI;
    }
}
