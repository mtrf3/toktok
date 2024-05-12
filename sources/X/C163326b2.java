package X;

import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163326b2 implements InterfaceC83970WxS {
    public final String LIZ;
    public final AudioAlgorithmModel LIZIZ;
    public final List<C163356b5> LIZJ;

    @Override // X.InterfaceC83970WxS
    public final void LIZ() {
        C6YR.LIZIZ(this.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LIZIZ() {
        C6YR.LJ(this.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LIZLLL() {
        Iterator<C163356b5> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C41877Gc5.LIZ.LJ(it.next());
        }
    }

    @Override // X.InterfaceC83970WxS
    public final void LJ() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        if (C48331Ixz.LIZ()) {
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("AVSecurityMobHelper onCloseFlash creationId: ", creationId, " currentPage ");
        LIZIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_flash_close", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJFF() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onStopPreviewSuccess creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_stop_preview_success", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIIIIZZ() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onReleaseCameraSuccess creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_release_success", c145995oB.LIZ);
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJFF(this.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIIIZ() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onStartPreviewSuccess creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_start_preview_success", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIIJJI() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onOpenCamera creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_open", c145995oB.LIZ);
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJ(this.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIIL() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onOpenFlash creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_flash_open", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIILIIL() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onOpenCameraSuccess creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_open_success", c145995oB.LIZ);
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZJ(this.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIIZILJ() {
        C6YR.LIZLLL(this.LIZ);
        AudioAlgorithmModel audioAlgorithmModel = this.LIZIZ;
        if (audioAlgorithmModel == null) {
            return;
        }
        audioAlgorithmModel.isMicOn = true;
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIJ() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onReleaseMicSuccess creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_mic_release_success", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIJI() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onStopPreview creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_stop_preview", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIJJ() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onReleaseCamera creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_release", c145995oB.LIZ);
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZLLL(this.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIL() {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onStartPreview creationId: ");
        LIZ.append(creationId);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_start_preview", c145995oB.LIZ);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onInitMicFailed creationId: ");
        LIZ.append(this.LIZ);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC83970WxS
    public final void LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onInitMicSuccess creationId: ");
        LIZ.append(this.LIZ);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIILLIIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onInitMic creationId: ");
        LIZ.append(this.LIZ);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public C163326b2(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        this.LIZ = creationId;
        this.LIZJ = new ArrayList();
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIIJ(final InterfaceC163346b4 interfaceC163346b4) {
        C163356b5 c163356b5 = new C163356b5() { // from class: X.6b3
            @Override // X.C163356b5, X.InterfaceC42472Glg
            public final void onAppBackground() {
                InterfaceC163346b4.this.onAppBackground();
            }

            @Override // X.C163356b5, X.InterfaceC42472Glg
            public final void onAppForeground() {
                InterfaceC163346b4.this.onAppForeground();
            }
        };
        ((ArrayList) this.LIZJ).add(c163356b5);
        C41877Gc5.LIZ.LIZLLL(c163356b5);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIILL(int i) {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onReleaseMicFailed creationId: ");
        LIZ.append(creationId);
        LIZ.append(" errCode: ");
        LIZ.append(i);
        LIZ.append(" msg: ");
        LIZ.append("Mic close failed in earlier stage");
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("msg", "Mic close failed in earlier stage");
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_mic_release_fail", c145995oB.LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C163326b2(String creationId, AudioAlgorithmModel audioAlgorithmModel) {
        this(creationId);
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(audioAlgorithmModel, "audioAlgorithmModel");
        this.LIZIZ = audioAlgorithmModel;
    }

    @Override // X.InterfaceC83970WxS
    public final void LIZJ(int i, String str) {
        C6YR.LIZJ(i, this.LIZ, str);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIILJJIL(int i, String msg) {
        o.LJIIIZ(msg, "msg");
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onOpenCameraFailed creationId: ");
        LIZ.append(creationId);
        LIZ.append(" errCode: ");
        LIZ.append(i);
        LIZ.append(" msg: ");
        LIZ.append(msg);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("msg", msg);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_camera_open_fail", c145995oB.LIZ);
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIZ(this.LIZ, msg);
    }

    @Override // X.InterfaceC83970WxS
    public final void LJIJJLI(int i, String str) {
        String creationId = this.LIZ;
        o.LJIIIZ(creationId, "creationId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVSecurityMobHelper onOpenFlashFailed creationId: ");
        LIZ.append(creationId);
        LIZ.append(" errCode: ");
        LIZ.append(i);
        LIZ.append(" msg: ");
        LIZ.append(str);
        LIZ.append(" currentPage ");
        LIZ.append(C6YR.LIZ());
        H78.LJI(X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("msg", str);
        c145995oB.LJI("page", C6YR.LIZ());
        FMX.LJIIL("tool_flash_open_fail", c145995oB.LIZ);
    }
}
