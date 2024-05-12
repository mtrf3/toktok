package X;

/* renamed from: X.8xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228078xH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C228078xH LJLIL = new C228078xH();

    public C228078xH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int LIZ;
        boolean z = true;
        if (C228088xI.LIZ) {
            LIZ = C228068xG.LIZ;
        } else {
            LIZ = C00F.LIZ(31744, 0, "playlist_show_video_length", true);
        }
        if (LIZ != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
