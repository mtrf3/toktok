package X;

/* renamed from: X.Vqn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81009Vqn extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81009Vqn LJLIL = new C81009Vqn();

    public C81009Vqn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Character ch) {
        boolean z;
        char charValue = ch.charValue();
        if (charValue == 'L' || charValue == 'M') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
