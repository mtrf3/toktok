package X;

/* loaded from: classes9.dex */
public final class IY0 {
    public final IY4 LIZ;
    public final String LIZIZ;
    public IY1 LIZJ;
    public boolean LIZLLL;

    public final String toString() {
        String name;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Output{url='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", urlHook=");
        IY4 iy4 = this.LIZ;
        if (iy4 == null) {
            name = "null";
        } else {
            name = iy4.getName();
        }
        LIZ.append(name);
        LIZ.append(", videoProcessedUrl=");
        LIZ.append(this.LIZJ);
        LIZ.append(", forceSoftwareDecode=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public IY0(String str) {
        this.LIZIZ = str;
    }

    public IY0(String str, IY4 iy4) {
        this.LIZIZ = str;
        this.LIZ = iy4;
    }
}
