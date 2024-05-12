package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Oxo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63608Oxo extends Exception {
    public final int LJLIL;
    public final Exception LJLILLLLZI;

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final Exception getOriginalException() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63608Oxo(String errorMessage, int i, Exception originalException) {
        super(errorMessage, originalException);
        o.LJIIIZ(errorMessage, "errorMessage");
        o.LJIIIZ(originalException, "originalException");
        this.LJLIL = i;
        this.LJLILLLLZI = originalException;
    }
}
