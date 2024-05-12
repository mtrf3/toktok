package X;

/* renamed from: X.Vqh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81003Vqh extends AbstractC65781Prl implements InterfaceC88472Yns<Character, Boolean> {
    public static final C81003Vqh LJLIL = new C81003Vqh();

    public C81003Vqh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Character ch) {
        boolean z;
        if (ch.charValue() == 'a') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
