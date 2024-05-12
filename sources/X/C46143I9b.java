package X;

import Y.AObjectS123S0200000_7;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.io.File;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I9b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46143I9b {
    public final C29S LIZ;
    public final InterfaceC83624Wrs LIZIZ;
    public final I9X<?> LIZJ;
    public final CameraComponentModel LIZLLL;
    public final C46144I9c LJ;
    public final C0IB<Boolean> LJFF;

    public final void LIZ(HYN hyn) {
        boolean z;
        if (this.LJ.LJIILL && Boolean.FALSE.equals(this.LJFF.LIZ())) {
            this.LIZJ.LJJLIIJ(new HYK(hyn));
            return;
        }
        if (this.LJ.LJIIZILJ.invoke().booleanValue()) {
            this.LIZJ.xm();
        }
        CameraComponentModel cameraComponentModel = this.LIZLLL;
        InterfaceC83624Wrs cameraView = this.LIZIZ;
        if (cameraComponentModel.mHardEncode == 1) {
            z = true;
        } else {
            z = false;
        }
        EnumC82528WaC speed = hyn.LIZ;
        C46144I9c recordControlConfig = this.LJ;
        AObjectS123S0200000_7 aObjectS123S0200000_7 = new AObjectS123S0200000_7(hyn, this, 3);
        o.LJIIIZ(cameraView, "cameraView");
        o.LJIIIZ(speed, "speed");
        o.LJIIIZ(recordControlConfig, "recordControlConfig");
        if (cameraComponentModel.recordMode == 1) {
            cameraView.LLZLI(new AqS173S0100000_7(cameraView, 148));
        }
        C46151I9j c46151I9j = recordControlConfig.LIZIZ;
        float f = c46151I9j.LJLILLLLZI;
        int i = c46151I9j.LJLJI;
        int i2 = c46151I9j.LJLJJI;
        if (cameraComponentModel.enableRecordingMp4) {
            Workspace workspace = cameraComponentModel.mWorkspace;
            o.LJIIIIZZ(workspace, "videoContext.mWorkspace");
            File LLZZJLIL = workspace.LJLIL.LLZZJLIL();
            o.LJIIIIZZ(LLZZJLIL, "videoContext.mWorkspace.recordingMp4File");
            String recordingMp4File = LLZZJLIL.getAbsolutePath();
            o.LJIIIIZZ(recordingMp4File, "recordingMp4File");
            cameraView.LLZZZZ(recordingMp4File, speed.value(), aObjectS123S0200000_7);
            return;
        }
        cameraView.LLZLL(speed.value(), !z, f, i, i2, aObjectS123S0200000_7);
    }

    public void onEvent(HYN hyn) {
        String musicPath;
        if (this.LIZLLL.LIZLLL() >= this.LIZLLL.LJ()) {
            this.LIZJ.JE(new C46156I9o("record_full"));
            return;
        }
        if (!this.LIZLLL.mWorkspace.y().exists()) {
            this.LIZLLL.mWorkspace.y().mkdirs();
        }
        if (!this.LJ.LJIIZILJ.invoke().booleanValue() || !this.LIZLLL.LJIILIIL()) {
            CameraComponentModel cameraComponentModel = this.LIZLLL;
            if (cameraComponentModel.recordMode == 0) {
                if (cameraComponentModel.LJIILIIL()) {
                    musicPath = this.LIZLLL.duetContext.duetAudioPath;
                } else {
                    musicPath = this.LIZLLL.getMusicPath();
                }
                if (musicPath != null) {
                    if (this.LIZLLL.LJIIIZ()) {
                        this.LIZIZ.LLZZJLIL(0L, 0L, "", false, true);
                    } else {
                        this.LIZIZ.LLZZJLIL(this.LIZLLL.LJI(), this.LIZLLL.LIZLLL(), musicPath, this.LIZLLL.isLoopSwitchOn, true);
                    }
                }
            }
        }
        this.LIZJ.LLLI(false);
        this.LIZJ.LLLIIIL(false);
        this.LIZJ.LJJLJ();
        this.LJ.LJIIIIZZ.run();
        LIZ(hyn);
    }

    public C46143I9b(C29S c29s, InterfaceC82086WJm interfaceC82086WJm, I9X i9x, C46144I9c c46144I9c) {
        this.LIZ = c29s;
        this.LIZIZ = interfaceC82086WJm.e8();
        this.LIZJ = i9x;
        this.LIZLLL = interfaceC82086WJm.zZ();
        this.LJ = c46144I9c;
        this.LJFF = interfaceC82086WJm.bh();
    }
}
