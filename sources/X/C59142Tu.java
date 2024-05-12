package X;

/* renamed from: X.2Tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59142Tu extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C59142Tu LJLIL = new C59142Tu();

    public C59142Tu() {
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
