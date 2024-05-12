package X;

/* renamed from: X.AQg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26206AQg {
    public final int LIZ = Integer.MAX_VALUE;
    public final EnumC26207AQh LIZIZ;
    public final C26210AQk LIZJ;
    public final InterfaceC47119IeR LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadTaskInfo{mSize=");
        LIZ.append(this.LIZ);
        LIZ.append(", mPriority=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mListener=");
        LIZ.append(this.LIZLLL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C26206AQg(EnumC26207AQh enumC26207AQh, C26210AQk c26210AQk, AQX aqx) {
        this.LIZIZ = EnumC26207AQh.PRELOAD_TASK_PRIORITY_DEFAULT;
        this.LIZIZ = enumC26207AQh;
        this.LIZJ = c26210AQk;
        this.LIZLLL = aqx;
    }
}
