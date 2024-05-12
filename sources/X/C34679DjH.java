package X;

/* renamed from: X.DjH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34679DjH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34679DjH LJLIL = new C34679DjH();

    public C34679DjH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34676DjE.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
