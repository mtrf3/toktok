package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Gb5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41815Gb5 extends RuntimeException {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Throwable LJLJI;

    public final String getCode() {
        return this.LJLILLLLZI;
    }

    public final String getMsg() {
        return this.LJLIL;
    }

    public final Throwable getT() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41815Gb5(String msg, String code, Throwable th) {
        super(msg);
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(code, "code");
        this.LJLIL = msg;
        this.LJLILLLLZI = code;
        this.LJLJI = th;
    }

    public /* synthetic */ C41815Gb5(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : th);
    }
}
