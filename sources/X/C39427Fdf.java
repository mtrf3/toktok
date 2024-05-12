package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Fdf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39427Fdf extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public C39427Fdf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39427Fdf(String message) {
        super(message);
        o.LJIIIZ(message, "message");
    }

    public /* synthetic */ C39427Fdf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
