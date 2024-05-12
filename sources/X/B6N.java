package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B6N<T> implements InterfaceC64592gB {
    public static final B6N<T> LJLIL = new B6N<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C0K2.LJII(1, "ttlive_anchor_task_report", C113554cx.LJJJLZIJ(new OSZ("error_msg", throwable.getMessage())));
    }
}
