package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OYX extends RuntimeException {
    public static final OYY Companion = new OYY();
    public final String LJLIL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OYX(String message) {
        super(message);
        o.LJIIIZ(message, "message");
        this.LJLIL = message;
    }
}
