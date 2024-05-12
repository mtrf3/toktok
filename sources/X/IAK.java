package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IAK implements IAD {
    public final InterfaceC82086WJm LIZ;

    public IAK(InterfaceC82086WJm cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    @Override // X.IAD
    public final void LIZ(boolean z) {
        C83627Wrv Bc = this.LIZ.Bc();
        C83728WtY c83728WtY = C83728WtY.LIZIZ;
        EnumC83730Wta enumC83730Wta = EnumC83730Wta.STOP_AUDIO_CAPTURE_COMMAND;
        EnumC158826Le enumC158826Le = EnumC158826Le.USER_OPERATION;
        Bc.LJFF(c83728WtY.LIZJ(enumC83730Wta, enumC158826Le));
        if (C44832Hie.LIZ()) {
            this.LIZ.Bc().LIZLLL(c83728WtY.LIZJ(EnumC83730Wta.STOP_AUDIO_CAPTURE_COMMAND_RELEASE_CAPTURE, enumC158826Le));
        }
    }
}
