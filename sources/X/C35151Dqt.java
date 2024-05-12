package X;

/* renamed from: X.Dqt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35151Dqt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35151Dqt LJLIL = new C35151Dqt();

    public C35151Dqt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35150Dqs.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
