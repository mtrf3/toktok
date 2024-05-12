package X;

/* loaded from: classes12.dex */
public final class Q9D {
    public final String LIZ;
    public final String LIZIZ;
    public final java.util.Map<String, Object> LIZJ;
    public final java.util.Map<String, Object> LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SDKCallRequest(sdkDescriptor='");
        LIZ.append(this.LIZ);
        LIZ.append("', methodName='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', methodParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extraParams=");
        return C15890jp.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public Q9D(Q96 q96) {
        this.LIZ = q96.LIZ;
        this.LIZIZ = q96.LIZIZ;
        this.LIZJ = q96.LIZJ;
        this.LIZLLL = q96.LIZLLL;
    }
}
