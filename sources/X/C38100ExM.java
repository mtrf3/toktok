package X;

/* renamed from: X.ExM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38100ExM {
    public String LIZ;
    public int LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JSBInfo{bridgeName='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", statusCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", statusDescription='");
        LIZ.append(this.LIZJ);
        LIZ.append('\'');
        LIZ.append(", protocolVersion='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", costTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", invokeTime=");
        LIZ.append(this.LJ);
        LIZ.append(", callbackTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", fireEventTime=");
        LIZ.append(0L);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
