package X;

/* renamed from: X.Dqu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35152Dqu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35152Dqu LJLIL = new C35152Dqu();

    public C35152Dqu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C35150Dqs.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
