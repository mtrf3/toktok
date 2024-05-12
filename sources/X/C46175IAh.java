package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.IAh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46175IAh implements InterfaceC78918UyA {
    public final InterfaceC82086WJm LIZ;

    public C46175IAh(WRQ cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    @Override // X.InterfaceC78918UyA
    public final void LIZ(AbstractC79069V1l abstractC79069V1l) {
        Cert LJJ;
        if (abstractC79069V1l != null && (LJJ = C32151Nz.LJJ(abstractC79069V1l)) != null) {
            this.LIZ.Bc().LJFF(LJJ);
        }
        if (C44832Hie.LIZ()) {
            this.LIZ.Bc().LIZLLL(C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_VOICE_RECOGNIZE, EnumC158826Le.USER_OPERATION));
        }
    }

    @Override // X.InterfaceC78918UyA
    public final void LIZIZ(AbstractC79069V1l abstractC79069V1l, Runnable runnable) {
        Cert LJJ;
        if (C44832Hie.LIZ()) {
            this.LIZ.Bc().LIZJ();
        }
        if (abstractC79069V1l != null && (LJJ = C32151Nz.LJJ(abstractC79069V1l)) != null) {
            C83627Wrv Bc = this.LIZ.Bc();
            Bc.getClass();
            C83627Wrv.LIZIZ(Bc, "action_name_start_audio_capture", LJJ, new C46174IAg(runnable));
        }
    }
}
