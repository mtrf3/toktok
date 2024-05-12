package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AYU<T, R> implements InterfaceC48038ItG {
    public static final AYU<T, R> LJLIL = new AYU<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        EnumC58085Mqv enumC58085Mqv;
        o.LJIIIZ(it, "it");
        if (((RBX) HG3.LJIILL()).isNewUser()) {
            enumC58085Mqv = EnumC58085Mqv.SIGN_UP;
        } else {
            enumC58085Mqv = EnumC58085Mqv.LOGIN;
        }
        return UPT.LIZJ(enumC58085Mqv);
    }
}
