package X;

/* renamed from: X.2Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59162Tw extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C59162Tw LJLIL = new C59162Tw();

    public C59162Tw() {
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
