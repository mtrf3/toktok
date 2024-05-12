package X;

import com.ss.android.ugc.aweme.port.internal.IFluencyService;
import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Us9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78545Us9 implements IFluencyService {
    @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
    public final void sceneReport(String scene) {
        o.LJIIIZ(scene, "scene");
        C78542Us6 c78542Us6 = C3B0.LIZ;
        ToolsBaseInfoConfig value = (ToolsBaseInfoConfig) C78548UsC.LIZJ.getValue();
        o.LJIIIIZZ(value, "value");
        long sceneCollectDuration = value.getSceneCollectDuration();
        o.LJIIIZ(c78542Us6, "<this>");
        if (!C78547UsB.LIZ()) {
            return;
        }
        C78542Us6 c78542Us62 = new C78542Us6(c78542Us6.LJIILLIIL, c78542Us6.LJIIZILJ, c78542Us6.LJIJ, c78542Us6.LJIJI, c78542Us6.LJIJJ, c78542Us6.LJIJJLI, c78542Us6.LJIL, c78542Us6.LJJ, c78542Us6.LJJI, c78542Us6.LJJIFFI);
        c78542Us62.LJIILJJIL = scene;
        ToolsBaseInfoConfig value2 = (ToolsBaseInfoConfig) C78547UsB.LIZJ.getValue();
        o.LJIIIIZZ(value2, "value");
        c78542Us62.LJIILLIIL = Long.valueOf(value2.getSceneCollectDuration());
        C60903NvH.LJIIJJI().LJJI().getSceneFluencyInfo(scene, sceneCollectDuration, new AqS179S0100000_13(c78542Us62, 359), new AqS179S0100000_13(c78542Us62, 360));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
    public final void getCurrentFluencyInfo(long j, InterfaceC88472Yns<? super JSONObject, C76800UCe> block, InterfaceC88472Yns<? super JSONObject, C76800UCe> fps) {
        o.LJIIIZ(block, "block");
        o.LJIIIZ(fps, "fps");
        C42315Gj9.LIZ().startBlockMonitor("tool_global", C52467KiV.LIZIZ(), j, new C36452ESi(block));
        C42315Gj9.LIZ().startFpsMonitor("tool_global", j, new C36451ESh(fps));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IFluencyService
    public final void getSceneFluencyInfo(String scene, long j, InterfaceC88472Yns<? super JSONObject, C76800UCe> block, InterfaceC88472Yns<? super JSONObject, C76800UCe> fps) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(block, "block");
        o.LJIIIZ(fps, "fps");
        C42315Gj9.LIZ().startBlockMonitor(scene, C52467KiV.LIZIZ(), j, new C36453ESj(block));
        C42315Gj9.LIZ().startFpsMonitor(scene, j, new C42284Gie(fps));
    }
}
