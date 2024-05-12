package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GOB extends RuntimeException {
    public final String LJLIL;

    public final String getMsg() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GOB(String msg) {
        super(msg);
        o.LJIIIZ(msg, "msg");
        this.LJLIL = msg;
    }
}
