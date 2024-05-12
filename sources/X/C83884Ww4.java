package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ww4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83884Ww4 implements YB2 {
    public final InterfaceC83863Wvj LIZ;

    public C83884Ww4(InterfaceC83863Wvj cameraService) {
        o.LJIIIZ(cameraService, "cameraService");
        this.LIZ = cameraService;
    }

    @Override // X.YB2
    public final void LIZLLL(float f) {
        this.LIZ.LJIJJLI(f);
    }

    @Override // X.YB2
    public final void LJ(float[] fArr, double d) {
        this.LIZ.LJJIJIIJIL(fArr, d);
    }
}
