package X;

/* renamed from: X.N4u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58772N4u extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C58772N4u LJLIL = new C58772N4u();

    public C58772N4u() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
