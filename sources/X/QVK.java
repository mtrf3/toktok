package X;

/* loaded from: classes12.dex */
public final class QVK extends Exception implements InterfaceC67065QTt {
    public int LJLIL;

    @Override // X.InterfaceC67065QTt
    public String getErrorMsg() {
        return getMessage();
    }

    @Override // X.InterfaceC67065QTt
    public int getErrorCode() {
        return this.LJLIL;
    }

    public void setErrorCode(int i) {
        this.LJLIL = i;
    }

    public QVK(int i, String str) {
        super(str);
        this.LJLIL = i;
    }
}
