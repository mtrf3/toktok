package X;

import ujb.s;

/* renamed from: X.O8h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61411O8h extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C61411O8h LJLIL = new C61411O8h();

    public C61411O8h() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        String str = C61410O8g.LIZ;
        boolean z = false;
        if (s.LJJJLZIJ(str, "huawei", false) || s.LJJJLZIJ(str, "honor", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
