package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GB5 extends RuntimeException {
    public static final GB4 Companion = new GB4();

    /* JADX WARN: Multi-variable type inference failed */
    public GB5() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final GB5 from(Exception cause) {
        Companion.getClass();
        o.LJIIIZ(cause, "cause");
        return new GB5("", cause);
    }

    public GB5(String str, Throwable th) {
        super(str, th);
    }

    public static final GB5 from(String str, Throwable th) {
        Companion.getClass();
        return new GB5(str, th);
    }

    public /* synthetic */ GB5(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : th);
    }
}
