package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YM2 extends RuntimeException {
    public final String LJLIL;

    public final String getReason() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YM2(String reason, Throwable th) {
        super(reason, th);
        o.LJIIIZ(reason, "reason");
        this.LJLIL = reason;
    }

    public /* synthetic */ YM2(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
