package X;

/* loaded from: classes16.dex */
public final class XSC extends RuntimeException {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public final int getErrorCode() {
        return this.LJLILLLLZI;
    }

    public final int getStep() {
        return this.LJLIL;
    }

    public XSC(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
