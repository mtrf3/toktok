package X;

import java.io.IOException;

/* renamed from: X.F1m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38302F1m extends IOException {
    public static final long serialVersionUID = 1;

    public C38302F1m(Throwable th) {
        initCause(th);
    }

    public C38302F1m(String str) {
        super(str);
    }

    public C38302F1m(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
