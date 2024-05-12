package X;

/* renamed from: X.DZa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34078DZa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34078DZa LJLIL = new C34078DZa();

    public C34078DZa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "enable_search_video_play_memory_leak_fix", true, false);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
