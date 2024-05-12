package X;

/* loaded from: classes15.dex */
public final class VJ7 {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchError{method='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", url='");
        LIZ.append(this.LIZIZ);
        LIZ.append('\'');
        LIZ.append(", errorMessage='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", errorCode=");
        LIZ.append(0);
        LIZ.append(", statusCode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", requestErrorCode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", requestErrorMsg='");
        LIZ.append(this.LJ);
        LIZ.append('\'');
        LIZ.append(", jsbReturn=");
        LIZ.append(0);
        LIZ.append(", hitPrefetch=");
        LIZ.append(0);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
