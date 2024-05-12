package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gu5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42993Gu5 extends RuntimeException {
    public long LJLIL;
    public String LJLILLLLZI;

    public final long getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    public final void setErrorCode(long j) {
        this.LJLIL = j;
    }

    public final void setErrorMsg(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42993Gu5(long j, String errorMsg) {
        super(errorMsg);
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = j;
        this.LJLILLLLZI = errorMsg;
    }
}
