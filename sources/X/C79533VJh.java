package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.VJh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79533VJh extends RuntimeException {
    public final int LJLIL;

    public final int getStatusCode() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79533VJh(int i, String message, Exception exc) {
        super(message, exc);
        o.LJIIIZ(message, "message");
        this.LJLIL = i;
    }

    public /* synthetic */ C79533VJh(int i, String str, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : exc);
    }
}
