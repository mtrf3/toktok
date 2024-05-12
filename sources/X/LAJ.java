package X;

/* loaded from: classes10.dex */
public final class LAJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final LAJ LJLIL = new LAJ();

    public LAJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (Q7K.LIZIZ("increase_seek_bar_touch_area", 100) > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
