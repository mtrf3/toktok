package X;

/* renamed from: X.HyA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45794HyA extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C45794HyA LJLIL = new C45794HyA();

    public C45794HyA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        if (C00F.LIZ(31744, 0, "studio_add_adjust_clip_threshold", true) == 1) {
            f = 60000.0f;
        } else {
            f = 1000.0f;
        }
        return Float.valueOf(f);
    }
}
