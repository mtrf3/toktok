package X;

/* renamed from: X.Vqi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81004Vqi extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81004Vqi LJLIL = new C81004Vqi();

    public C81004Vqi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Character ch) {
        boolean z;
        char charValue = ch.charValue();
        if (charValue == 'k' || charValue == 'K' || charValue == 'h' || charValue == 'H') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
