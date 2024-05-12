package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WsH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83649WsH implements IAD {
    public final InterfaceC82086WJm LIZ;

    public C83649WsH(InterfaceC82086WJm cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    @Override // X.IAD
    public final void LIZ(boolean z) {
        if (z) {
            this.LIZ.e8().s9(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_CAPTURE_WITH_ENABLE, EnumC158826Le.USER_OPERATION), false);
        } else {
            this.LIZ.e8().u9(C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_CAPTURE_WITH_DISABLE, EnumC158826Le.USER_OPERATION));
        }
    }
}
