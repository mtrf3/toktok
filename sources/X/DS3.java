package X;

/* loaded from: classes7.dex */
public final class DS3 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DS3 LJLIL = new DS3();

    public DS3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 1;
        if (C2NW.LIZ().isNewUser()) {
            if (C33827DPj.LIZ()) {
                if (C35478DwA.LIZIZ()) {
                    i = 0;
                }
            } else {
                i = C00F.LIZ(31744, 0, "player_medialoader_enable_file_extend_buffer", true);
            }
        } else {
            i = C00F.LIZ(31744, 0, "player_medialoader_enable_file_extend_buffer", true);
        }
        return Integer.valueOf(i);
    }
}
