package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J3J extends Throwable {
    public final int LJLIL;

    public final int getStateType() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3J(int i, Throwable error) {
        super(error.getMessage(), error);
        o.LJIIIZ(error, "error");
        this.LJLIL = i;
    }
}
