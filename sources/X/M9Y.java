package X;

/* loaded from: classes10.dex */
public final class M9Y extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final M9Y LJLIL = new M9Y();

    public M9Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((M9X.LIZ() & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
