package X;

import java.io.IOException;

/* renamed from: X.F1j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38299F1j extends IOException {
    public C38299F1j() {
    }

    public C38299F1j(Throwable th) {
        initCause(th);
    }

    public C38299F1j(String str) {
        super(str);
    }

    public C38299F1j(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
