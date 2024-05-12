package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CqN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32571CqN extends AbstractC65781Prl implements InterfaceC88472Yns<C32570CqM, Boolean> {
    public static final C32571CqN LJLIL = new C32571CqN();

    public C32571CqN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C32570CqM c32570CqM) {
        boolean z;
        C32570CqM tabItem = c32570CqM;
        o.LJIIIZ(tabItem, "tabItem");
        if (tabItem.LIZJ == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
