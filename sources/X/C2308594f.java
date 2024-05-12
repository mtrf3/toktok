package X;

/* renamed from: X.94f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2308594f extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C2308594f LJLIL = new C2308594f();

    public C2308594f() {
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
        return Boolean.valueOf(z);
    }
}
