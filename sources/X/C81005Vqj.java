package X;

/* renamed from: X.Vqj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81005Vqj extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81005Vqj LJLIL = new C81005Vqj();

    public C81005Vqj() {
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
