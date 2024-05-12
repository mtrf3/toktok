package X;

/* renamed from: X.Dmi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34892Dmi extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34892Dmi LJLIL = new C34892Dmi();

    public C34892Dmi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34891Dmh.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
