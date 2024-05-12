package X;

/* loaded from: classes16.dex */
public final class XSX extends Exception {
    public int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    public XSX() {
    }

    public int getErrorCode() {
        return this.LJLIL;
    }

    public String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    public String getErrorUrl() {
        return this.LJLJI;
    }

    public void setErrorCode(int i) {
        this.LJLIL = i;
    }

    public void setErrorMsg(String str) {
        this.LJLILLLLZI = str;
    }

    public void setErrorUrl(String str) {
        this.LJLJI = str;
    }

    public XSX(int i, String str) {
        super(str);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    public XSX(int i, String str, String str2) {
        super(str);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
