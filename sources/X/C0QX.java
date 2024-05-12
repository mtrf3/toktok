package X;

/* renamed from: X.0QX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QX {
    public final InterfaceC65784Pro<Float> LIZ;
    public final InterfaceC65784Pro<Float> LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ScrollAxisRange(value=");
        LIZ.append(this.LIZ.invoke().floatValue());
        LIZ.append(", maxValue=");
        LIZ.append(this.LIZIZ.invoke().floatValue());
        LIZ.append(", reverseScrolling=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C0QX(InterfaceC65784Pro<Float> interfaceC65784Pro, InterfaceC65784Pro<Float> interfaceC65784Pro2, boolean z) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
        this.LIZJ = z;
    }
}
