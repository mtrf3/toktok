package com.ss.android.ugc.aweme.video.simkit;

import X.C00F;
import X.C34555DhH;
import X.C46982IcE;
import X.C47436IjY;
import X.C47489IkP;
import X.C47511Ikl;
import X.C49606JdS;
import X.EnumC47488IkO;
import X.InterfaceC47509Ikj;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* loaded from: classes9.dex */
public class SpeedConfigImpl extends C47489IkP {
    public final EnumC47488IkO algorithmType;
    public final int calculatorType;
    public final InterfaceC47509Ikj intelligentAlgoConfig = new C47511Ikl();

    @Override // X.C47489IkP, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public String getSpeedCalculateConfig() {
        C34555DhH.LIZ.getClass();
        return (String) C34555DhH.LIZIZ.getValue();
    }

    @Override // X.C47489IkP, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getSpeedQueueSize() {
        return C00F.LIZ(31744, 10, "video_speed_queue_size", true);
    }

    public SpeedConfigImpl() {
        EnumC47488IkO enumC47488IkO;
        int i;
        MLModel mLModel = C47436IjY.LIZIZ.LIZ;
        if (mLModel == null || TextUtils.isEmpty(mLModel.packageUrl)) {
            enumC47488IkO = EnumC47488IkO.DEFAULT;
        } else {
            enumC47488IkO = EnumC47488IkO.INTELLIGENT;
        }
        this.algorithmType = enumC47488IkO;
        int i2 = 1;
        if (C00F.LIZ(31744, 0, "speed_monitor_sink", true) != 1) {
            i = 1;
        } else {
            i = 2;
        }
        if (C49606JdS.LIZ(i) == null && i != 1) {
            if (C46982IcE.LIZIZ().isDebug()) {
                throw new RuntimeException("no runtime cloud type speed predict module");
            }
        } else {
            i2 = i;
        }
        this.calculatorType = i2;
    }

    @Override // X.C47489IkP, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getCalculatorType() {
        return this.calculatorType;
    }

    @Override // X.C47489IkP, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public InterfaceC47509Ikj getIntelligentAlgoConfig() {
        return this.intelligentAlgoConfig;
    }

    @Override // X.C47489IkP, com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public EnumC47488IkO getSpeedAlgorithmType() {
        return this.algorithmType;
    }
}
