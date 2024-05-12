package X;

/* loaded from: classes16.dex */
public final class XAL extends Exception {
    public int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    public XAL() {
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    public final String getErrorUrl() {
        return this.LJLJI;
    }

    public final void setErrorCode(int i) {
        this.LJLIL = i;
    }

    public final void setErrorMsg(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setErrorUrl(String str) {
        this.LJLJI = str;
    }

    public XAL(int i, String str) {
        super(str);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    public XAL(int i, String str, String str2) {
        super(str);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
