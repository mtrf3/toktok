package X;

import ujb.s;

/* renamed from: X.O8i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61412O8i extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C61412O8i LJLIL = new C61412O8i();

    public C61412O8i() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        String str = C61410O8g.LIZ;
        boolean z = false;
        if (s.LJJJLZIJ(str, "oppo", false) || s.LJJJLZIJ(str, "realme", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
