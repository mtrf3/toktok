package X;

/* loaded from: classes7.dex */
public final class DVC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVC LJLIL = new DVC();

    public DVC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) C86801Y4v.LIZIZ.getValue()).booleanValue() || ((Boolean) C86801Y4v.LIZJ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
