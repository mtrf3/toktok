package X;

/* renamed from: X.Vql, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81007Vql extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81007Vql LJLIL = new C81007Vql();

    public C81007Vql() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Character ch) {
        boolean z;
        if (ch.charValue() == 'm') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
