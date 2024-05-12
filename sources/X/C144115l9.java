package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5l9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144115l9 extends RuntimeException {
    public final int LJLIL;

    public final int getErrorCode() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144115l9(int i, String message) {
        super(message);
        o.LJIIIZ(message, "message");
        this.LJLIL = i;
    }
}
