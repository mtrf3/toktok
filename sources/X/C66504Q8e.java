package X;

import android.text.TextUtils;
import defpackage.b1;

/* renamed from: X.Q8e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66504Q8e extends Exception {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public boolean LJLJJL;
    public final String LJLJJLL;

    @Override // java.lang.Throwable
    public String getMessage() {
        if (getCause() != null) {
            return super.getMessage();
        }
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() != null) {
            return super.toString();
        }
        StringBuilder LIZJ = b1.LIZJ("LobbyException{", "code: ");
        LIZJ.append(getErrorCode());
        LIZJ.append(", ");
        LIZJ.append("providerCode: ");
        LIZJ.append(getProviderErrorCode());
        LIZJ.append(", ");
        LIZJ.append("message: ");
        LIZJ.append(getMessage());
        LIZJ.append(", ");
        LIZJ.append("cancelled: ");
        LIZJ.append(isCancelled());
        LIZJ.append(", ");
        LIZJ.append("fromLobby: ");
        LIZJ.append(isFromLobby());
        LIZJ.append("}");
        return X1D.LIZIZ(LIZJ);
    }

    public int getErrorCode() {
        return this.LJLIL;
    }

    public String getErrorStage() {
        return this.LJLJJLL;
    }

    public int getProviderErrorCode() {
        return this.LJLJI;
    }

    public boolean isCancelled() {
        return this.LJLJJL;
    }

    public boolean isFromLobby() {
        return this.LJLJJI;
    }

    public C66504Q8e(Exception exc) {
        super(exc);
        this.LJLIL = -999;
    }

    public C66504Q8e setCancelled(boolean z) {
        this.LJLJJL = z;
        return this;
    }

    public C66504Q8e(int i, Exception exc) {
        super(exc);
        this.LJLIL = -999;
        this.LJLIL = i;
    }

    public C66504Q8e(int i, String str) {
        this(i, 0, str, "");
    }

    public C66504Q8e(int i, int i2, String str) {
        this(i, i2, str, "");
    }

    public C66504Q8e(int i, String str, String str2) {
        this(i, 0, str, str2);
    }

    public C66504Q8e(int i, int i2, String str, String str2) {
        this.LJLIL = -999;
        this.LJLIL = i;
        this.LJLJI = i2;
        this.LJLILLLLZI = TextUtils.isEmpty(str) ? "" : str;
        this.LJLJJI = true;
        this.LJLJJLL = str2;
        if (i == 4) {
            setCancelled(true);
        }
    }
}
