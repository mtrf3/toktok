package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sg7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72703Sg7 implements C5ZR {
    public final InterfaceC83624Wrs LIZ;

    public C72703Sg7(InterfaceC83624Wrs cameraView) {
        o.LJIIIZ(cameraView, "cameraView");
        this.LIZ = cameraView;
    }

    @Override // X.C5ZR
    public final void LIZ(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMessage msgID=");
        LIZ.append(i);
        LIZ.append(", arg1=");
        LIZ.append(j);
        C0MT.LIZLLL(LIZ, ", arg2=", j2, ", msg=");
        LIZ.append(msg);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        this.LIZ.LJJIJL(i, j, j2, msg);
    }
}
