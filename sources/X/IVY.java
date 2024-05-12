package X;

/* loaded from: classes9.dex */
public final class IVY implements IU3 {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownProgressEvent{key='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", totalBytes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", downloadedBytes=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, '}', LIZ);
    }

    public IVY(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
