package X;

/* renamed from: X.Vqo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81010Vqo extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81010Vqo LJLIL = new C81010Vqo();

    public C81010Vqo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Character ch) {
        boolean z;
        if (ch.charValue() == 'd') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
