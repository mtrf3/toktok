package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class QVL extends IOException implements InterfaceC67065QTt {
    public final int LJLIL;

    @Override // X.InterfaceC67065QTt
    public String getErrorMsg() {
        return getMessage();
    }

    @Override // X.InterfaceC67065QTt
    public int getErrorCode() {
        return this.LJLIL;
    }

    public QVL(int i, String str, Throwable th) {
        super(str, th);
        this.LJLIL = i;
    }
}
