package X;

import com.ss.android.ugc.aweme.im.service.camera.exp.DMCameraSafetyExperiment;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POF extends AbstractC65781Prl implements InterfaceC65784Pro<DMCameraSafetyExperiment.CameraSafetyExperimentModel> {
    public static final POF LJLIL = new POF();

    public POF() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final DMCameraSafetyExperiment.CameraSafetyExperimentModel invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        DMCameraSafetyExperiment.CameraSafetyExperimentModel cameraSafetyExperimentModel = DMCameraSafetyExperiment.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "dm_camera_safety_for_minors", 31744, DMCameraSafetyExperiment.CameraSafetyExperimentModel.class, cameraSafetyExperimentModel);
        if (LJIJ == 0) {
            DMCameraSafetyExperiment.LIZ.getClass();
        } else {
            cameraSafetyExperimentModel = LJIJ;
        }
        o.LJIIIIZZ(cameraSafetyExperimentModel, "ABManager.getInstance()\n…riment::class.java) ?: V0");
        return cameraSafetyExperimentModel;
    }
}
