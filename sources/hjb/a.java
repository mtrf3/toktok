package hjb;

import X.C36639EZn;
import X.C36659Ea7;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class a extends C36639EZn {
    @Override // X.C36639EZn
    public final void LIZ(Throwable cause, Throwable exception) {
        o.LJIIIZ(cause, "cause");
        o.LJIIIZ(exception, "exception");
        Integer num = C36659Ea7.LIZ;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.LIZ(cause, exception);
        }
    }
}
