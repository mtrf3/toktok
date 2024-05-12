package X;

/* renamed from: X.Iam, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46892Iam extends Exception {
    public final int LJLIL;
    public DTX LJLILLLLZI;

    public int getCode() {
        return this.LJLIL;
    }

    public DTX getShiftInfo() {
        return this.LJLILLLLZI;
    }

    public void setShiftInfo(DTX dtx) {
        this.LJLILLLLZI = dtx;
    }

    public C46892Iam(int i, String str) {
        super(str);
        this.LJLIL = i;
    }
}
