package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H3w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43460H3w {
    public final Throwable LIZ;

    public String LIZIZ() {
        return "";
    }

    public abstract int LIZJ();

    public abstract H4Z LIZLLL();

    public final Throwable LIZ() {
        Throwable th = this.LIZ;
        if (th instanceof C42360Gjs) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return new C43461H3x();
            }
            return cause;
        }
        return th;
    }

    public AbstractC43460H3w(Throwable error) {
        o.LJIIIZ(error, "error");
        this.LIZ = error;
    }
}
