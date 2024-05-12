package X;

/* renamed from: X.Vqe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81000Vqe extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81000Vqe LJLIL = new C81000Vqe();

    public C81000Vqe() {
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
