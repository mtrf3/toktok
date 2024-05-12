package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Smy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73128Smy<T> implements InterfaceC64592gB {
    public static final C73128Smy<T> LJLIL = new C73128Smy<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable error = (Throwable) obj;
        o.LJIIIZ(error, "error");
        C0NB.LIZIZ("MultiGuestMultiTypeAdapter", error.getMessage());
    }
}
