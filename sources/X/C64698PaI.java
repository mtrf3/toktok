package X;

import java.io.IOException;

/* renamed from: X.PaI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64698PaI extends IOException implements InterfaceC64791Pbn {
    public static final long serialVersionUID = -7281385706782665299L;
    public boolean LJLIL;

    public int getCronetInternalErrorCode() {
        return -106;
    }

    public C64698PaI() {
    }

    @Override // X.InterfaceC64791Pbn
    public boolean shouldReport() {
        return this.LJLIL;
    }

    public C64698PaI(Throwable th) {
        initCause(th);
    }

    public void setShouldReport(boolean z) {
        this.LJLIL = z;
    }

    public C64698PaI(String str) {
        super(str);
    }

    public C64698PaI(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
