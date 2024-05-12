package X;

import ujb.s;

/* renamed from: X.X6s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84302X6s extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C84302X6s LJLIL = new C84302X6s();

    public C84302X6s() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        String str = C84300X6q.LIZ;
        boolean z = false;
        if (s.LJJJLZIJ(str, "huawei", false) || s.LJJJLZIJ(str, "honor", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
