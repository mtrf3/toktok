package X;

/* loaded from: classes10.dex */
public final class LAH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final LAH LJLIL = new LAH();

    public LAH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Q7K.LIZIZ("allow_long_video_scrubbing", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
