package X;

/* renamed from: X.3IO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C3IO LJLIL = new C3IO();

    public C3IO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "user_profile_video_cache", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
