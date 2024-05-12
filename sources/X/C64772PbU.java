package X;

import java.io.IOException;

/* renamed from: X.PbU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64772PbU extends IOException {
    public static final long serialVersionUID = -5588326043064908201L;

    public C64772PbU() {
    }

    public C64772PbU(Throwable th) {
        initCause(th);
    }

    public C64772PbU(String str) {
        super(str);
    }

    public C64772PbU(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
