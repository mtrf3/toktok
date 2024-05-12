package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CDi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30966CDi extends AbstractC65781Prl implements InterfaceC88472Yns<CDP, Boolean> {
    public static final C30966CDi LJLIL = new C30966CDi();

    public C30966CDi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(CDP cdp) {
        boolean z;
        CDP it = cdp;
        o.LJIIIZ(it, "it");
        if (it.LIZ == -6) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
