package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1xU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49841xU extends AbstractC65781Prl implements InterfaceC88472Yns<C11P, Boolean> {
    public static final C49841xU LJLIL = new C49841xU();

    public C49841xU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C11P c11p) {
        boolean z;
        C11P down = c11p;
        o.LJIIIZ(down, "down");
        if (down.LJII == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
