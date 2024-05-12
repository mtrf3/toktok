package X;

/* renamed from: X.Dal, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34151Dal extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34151Dal LJLIL = new C34151Dal();

    public C34151Dal() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34158Das.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
