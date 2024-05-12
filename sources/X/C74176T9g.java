package X;

import kotlin.jvm.internal.o;

/* renamed from: X.T9g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74176T9g implements InterfaceC69602oG {
    public final /* synthetic */ InterfaceC88471Ynr<T39, T39, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C74176T9g(InterfaceC88471Ynr<? super T39, ? super T39, C76800UCe> interfaceC88471Ynr) {
        this.LJLIL = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC69602oG
    public final void onChange(EnumC111394Yt pre, EnumC111394Yt cur) {
        InterfaceC88471Ynr<T39, T39, C76800UCe> interfaceC88471Ynr = this.LJLIL;
        o.LJIIIIZZ(pre, "pre");
        T39 LJIIIZ = C74177T9h.LJIIIZ(pre);
        o.LJIIIIZZ(cur, "cur");
        interfaceC88471Ynr.invoke(LJIIIZ, C74177T9h.LJIIIZ(cur));
    }
}
