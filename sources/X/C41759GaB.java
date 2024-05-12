package X;

/* renamed from: X.GaB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41759GaB extends RuntimeException {
    public boolean LJLIL;
    public final boolean LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public String LJLJL;

    public boolean isCauseByNoSpaceLeft() {
        for (Throwable cause = getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof C42990Gu2) {
                if (((C42990Gu2) cause).getCode() != 100101) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public OSZ<Boolean, C38333F2r> retrieveServerError() {
        for (Throwable cause = getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof C38333F2r) {
                return new OSZ<>(Boolean.TRUE, cause);
            }
        }
        return new OSZ<>(Boolean.FALSE, null);
    }

    public OSZ<Boolean, String> retrieveServerErrorInfo() {
        for (Throwable cause = getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof C38333F2r) {
                return new OSZ<>(Boolean.TRUE, ((C38333F2r) cause).getErrorMsg());
            }
        }
        return new OSZ<>(Boolean.FALSE, null);
    }

    public int getErrorCode() {
        return this.LJLJJLL;
    }

    public Object getFailedTaskTag() {
        return this.LJLJJL;
    }

    public int getPublishDuration() {
        return this.LJLJJI;
    }

    public String getServerLogId() {
        return this.LJLJL;
    }

    public boolean isDiscard() {
        return this.LJLJI;
    }

    public boolean isRecover() {
        return this.LJLIL;
    }

    public boolean isUserNetworkBad() {
        return this.LJLILLLLZI;
    }

    public C41759GaB(Throwable th) {
        super(th);
    }

    public void setDiscard(boolean z) {
        this.LJLJI = z;
    }

    public void setErrorCode(int i) {
        this.LJLJJLL = i;
    }

    public void setFailedTaskTag(Object obj) {
        this.LJLJJL = obj;
    }

    public void setPublishDuration(int i) {
        this.LJLJJI = i;
    }

    public void setRecover(boolean z) {
        this.LJLIL = z;
    }

    public void setServerLogId(String str) {
        this.LJLJL = str;
    }

    public C41759GaB(Throwable th, boolean z) {
        super(th);
        this.LJLILLLLZI = z;
    }
}
