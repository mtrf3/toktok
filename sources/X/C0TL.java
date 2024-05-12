package X;

import java.io.IOException;

/* renamed from: X.0TL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TL extends IOException {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public int statusCode;

    public int getCronetError() {
        return this.LJLIL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLILLLLZI;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public C0TL(int i, int i2, String str) {
        this.statusCode = i;
        this.LJLIL = i2;
        this.LJLILLLLZI = str;
    }

    public C0TL(int i, int i2, String str, String str2, Throwable th) {
        super(str2, th);
        this.statusCode = i;
        this.LJLIL = i2;
        this.LJLILLLLZI = str;
    }
}
