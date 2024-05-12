package X;

/* loaded from: classes7.dex */
public final class FLZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FLZ LJLIL = new FLZ();

    public FLZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FLX.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
