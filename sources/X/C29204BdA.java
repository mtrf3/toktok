package X;

import android.hardware.Camera;
import kotlin.jvm.internal.o;

/* renamed from: X.BdA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29204BdA implements InterfaceC78910Uy2 {
    public final /* synthetic */ InterfaceC67352kd<Boolean> LIZ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    public C29204BdA(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZ;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        if (Camera.getNumberOfCameras() > 0) {
            InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZ;
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            interfaceC67352kd.resumeWith(bool);
            return;
        }
        InterfaceC67352kd<Boolean> interfaceC67352kd2 = this.LIZ;
        Boolean bool2 = Boolean.FALSE;
        C3C5.m7constructorimpl(bool2);
        interfaceC67352kd2.resumeWith(bool2);
    }
}
