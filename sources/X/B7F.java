package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B7F<T> implements InterfaceC64592gB {
    public static final B7F<T> LJLIL = new B7F<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable e = (Throwable) obj;
        o.LJIIIZ(e, "e");
        C0NB.LJI("userid_watchLive", e);
    }
}
