package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OfB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62453OfB extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC62486Ofi, Boolean> {
    public static final C62453OfB LJLIL = new C62453OfB();

    public C62453OfB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InterfaceC62486Ofi interfaceC62486Ofi) {
        InterfaceC62486Ofi it = interfaceC62486Ofi;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(C62442Of0.LJLJI.contains(it.key()));
    }
}
