package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Wc5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82645Wc5 implements InterfaceC82128WLc {
    public final InterfaceC82128WLc LIZ = C83735Wtf.LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C82645Wc5() {
        boolean z;
        if (C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        boolean LIZIZ = C82646Wc6.LIZIZ();
        this.LIZJ = LIZIZ;
        if (z) {
            H78.LIZIZ("CameraAntiShakeV1", " -> initialize: The user is not logged in or in FTC mode");
        }
        if (LIZIZ) {
            H78.LIZIZ("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v2");
        }
        if (LIZJ() && !LIZIZ) {
            H78.LIZIZ("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v1");
        }
    }

    @Override // X.InterfaceC82128WLc
    public final boolean LIZJ() {
        if (C82646Wc6.LIZ() || C82646Wc6.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC82128WLc
    public final boolean LIZ(Context context, InterfaceC83863Wvj cameraService) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cameraService, "cameraService");
        if (this.LIZIZ) {
            return false;
        }
        if (this.LIZJ) {
            return true;
        }
        return this.LIZ.LIZ(context, cameraService);
    }

    @Override // X.InterfaceC82128WLc
    public final boolean LIZIZ(InterfaceC83863Wvj cameraService, boolean z) {
        o.LJIIIZ(cameraService, "cameraService");
        if (this.LIZ.LIZIZ(cameraService, z) && !z) {
            return true;
        }
        return false;
    }
}
