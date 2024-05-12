package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2SI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SI extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C2SI LJLIL = new C2SI();

    public C2SI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        o.LJIIIZ(it, "it");
        boolean z = true;
        if (C2SG.LIZ() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
