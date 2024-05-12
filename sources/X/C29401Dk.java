package X;

/* renamed from: X.1Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29401Dk extends C276516r {
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public Object LJLJJLL;
    public String LJLJL;

    @Override // X.C276516r, java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" TYPE = ApiServerException, errorMsg = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" extra = ");
        LIZ.append(this.LJLJJL);
        LIZ.append(" ");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public String getAlert() {
        return this.LJLJJI;
    }

    public Object getData() {
        return this.LJLJJLL;
    }

    public String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    public String getExtra() {
        return this.LJLJJL;
    }

    public String getLogId() {
        return this.LJLJL;
    }

    public String getPrompt() {
        return this.LJLJI;
    }

    public C29401Dk(int i) {
        super(i);
    }

    public C29401Dk setAlert(String str) {
        this.LJLJJI = str;
        return this;
    }

    public C29401Dk setData(Object obj) {
        this.LJLJJLL = obj;
        return this;
    }

    public C29401Dk setErrorMsg(String str) {
        this.LJLILLLLZI = str;
        return this;
    }

    public C29401Dk setExtra(String str) {
        this.LJLJJL = str;
        return this;
    }

    public C29401Dk setLogId(String str) {
        this.LJLJL = str;
        return this;
    }

    public C29401Dk setPrompt(String str) {
        this.LJLJI = str;
        return this;
    }
}
