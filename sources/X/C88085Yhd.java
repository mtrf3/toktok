package X;

/* renamed from: X.Yhd, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88085Yhd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88085Yhd LJLIL = new C88085Yhd();

    public C88085Yhd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88087Yhf.LIZ() & 1024) == 1024) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
