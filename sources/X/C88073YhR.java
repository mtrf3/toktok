package X;

/* renamed from: X.YhR, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88073YhR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88073YhR LJLIL = new C88073YhR();

    public C88073YhR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88074YhS.LIZ() & 4096) == 4096) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
