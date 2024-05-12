package X;

/* renamed from: X.Vqg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81002Vqg extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81002Vqg LJLIL = new C81002Vqg();

    public C81002Vqg() {
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
