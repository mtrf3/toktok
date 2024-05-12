package X;

/* renamed from: X.Gl2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42432Gl2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C42432Gl2 LJLIL = new C42432Gl2();

    public C42432Gl2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "studio_use_cache_in_duet", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
