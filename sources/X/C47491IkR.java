package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.IkR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47491IkR implements ISpeedCalculator {
    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final C47139Iel[] LIZLLL() {
        return new C47139Iel[0];
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LJ(C47139Iel c47139Iel) {
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final double calculateSpeed() {
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final int LIZJ() {
        double LJJIJIIJI = TTVideoEngine.LJJIJIIJI();
        if (LJJIJIIJI == -1.0d) {
            return -1;
        }
        return (int) ((LJJIJIIJI / 8.0d) / 1000.0d);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final double LJI() {
        return TTVideoEngine.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LIZIZ(double d) {
        TTVideoEngine.LJLLJ(739, (float) d);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void LJFF(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
        if (iSpeedCalculatorConfig.getSpeedAlgorithmType() == EnumC47488IkO.INTELLIGENT) {
            C47508Iki c47508Iki = new C47508Iki(iSpeedCalculatorConfig.getIntelligentAlgoConfig());
            C78966Uyw.LJLJLJ = c47508Iki;
            C78966Uyw.LJLJL = c47508Iki;
            TTVideoEngine.LLJJJJ(5);
            return;
        }
        TTVideoEngine.LLJJJJ(4);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void setSpeedQueueSize(int i) {
        TTVideoEngine.LJLLLLLL(676, i);
    }
}
