package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OcL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62277OcL extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC62225ObV, Boolean> {
    public static final C62277OcL LJLIL = new C62277OcL();

    public C62277OcL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InterfaceC62225ObV interfaceC62225ObV) {
        boolean z;
        InterfaceC62225ObV it = interfaceC62225ObV;
        o.LJIIIZ(it, "it");
        if (C62275OcJ.LIZIZ().isEmpty() || C62423Oeh.LIZIZ.contains(it.key())) {
            z = true;
        } else {
            z = C62275OcJ.LIZIZ().contains(it.key());
        }
        return Boolean.valueOf(z);
    }
}
