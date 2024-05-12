package X;

/* renamed from: X.8lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220968lo extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C220968lo LJLIL = new C220968lo();

    public C220968lo() {
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
