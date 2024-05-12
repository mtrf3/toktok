package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UIL {
    public static UIM LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
        if (e instanceof UIM) {
            return (UIM) e;
        }
        if (e instanceof C276516r) {
            return new UIM(Integer.valueOf(((C276516r) e).getErrorCode()), 0, e.getMessage());
        }
        return new UIM(-1, -1, e.getMessage());
    }
}
