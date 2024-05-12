package X;

import java.io.IOException;

/* renamed from: X.F1s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38308F1s extends IOException {
    public static final long serialVersionUID = -210264743726619965L;

    public C38308F1s() {
    }

    public C38308F1s(Throwable th) {
        initCause(th);
    }

    public C38308F1s(String str) {
        super(str);
    }

    public C38308F1s(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
