package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162556Zn extends RuntimeException {
    public static final C162566Zo Companion = new Object() { // from class: X.6Zo
    };
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
    public C162556Zn(long j, String errorMsg) {
        super(errorMsg);
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = j;
        this.LJLILLLLZI = errorMsg;
    }
}
