package X;

import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;

/* renamed from: X.IkP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47489IkP implements ISpeedCalculatorConfig {
    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getCalculatorType() {
        return 1;
    }

    public InterfaceC47490IkQ getCustomSpeedAlgorithm() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public double getDefaultSpeedInBPS() {
        return -1.0d;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public InterfaceC47509Ikj getIntelligentAlgoConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public String getSpeedCalculateConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getSpeedQueueSize() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public EnumC47488IkO getSpeedAlgorithmType() {
        return EnumC47488IkO.DEFAULT;
    }
}
