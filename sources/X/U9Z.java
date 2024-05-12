package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U9Z<T> implements InterfaceC64592gB {
    public static final U9Z<T> LJLIL = new U9Z<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        U4R.LIZIZ("CoManager", throwable.getMessage());
    }
}
