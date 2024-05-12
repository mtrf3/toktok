package X;

/* loaded from: classes16.dex */
public final class XLS extends XLT<XLL<?>> {
    public long LIZ = -1;
    public XKS LIZIZ;

    @Override // X.XLT
    public final boolean LIZ(XLN xln) {
        XLL xll = (XLL) xln;
        if (this.LIZ >= 0) {
            return false;
        }
        long j = xll.LJLJLLL;
        if (j < xll.LJLL) {
            xll.LJLL = j;
        }
        this.LIZ = j;
        return true;
    }

    @Override // X.XLT
    public final InterfaceC67352kd[] LIZIZ(XLN xln) {
        long j = this.LIZ;
        this.LIZ = -1L;
        this.LIZIZ = null;
        return ((XLL) xln).LJIJ(j);
    }
}
