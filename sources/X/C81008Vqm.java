package X;

/* renamed from: X.Vqm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81008Vqm extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81008Vqm LJLIL = new C81008Vqm();

    public C81008Vqm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Character ch) {
        boolean z;
        if (ch.charValue() == 'y') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
