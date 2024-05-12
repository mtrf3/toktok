package X;

import defpackage.e1;

/* renamed from: X.Ha8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44304Ha8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C44304Ha8 LJLIL = new C44304Ha8();

    public C44304Ha8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (e1.LIZ(31744, "tool_forbid_open_camera_background", true, false) && C41877Gc5.LIZ.LIZIZ()) {
            H78.LJI("AVSecurityMobHelper open camera in background be intercepted");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
