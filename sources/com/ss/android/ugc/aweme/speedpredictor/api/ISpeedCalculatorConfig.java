package com.ss.android.ugc.aweme.speedpredictor.api;

import X.EnumC47488IkO;
import X.InterfaceC47509Ikj;

/* loaded from: classes9.dex */
public interface ISpeedCalculatorConfig {
    int getCalculatorType();

    double getDefaultSpeedInBPS();

    InterfaceC47509Ikj getIntelligentAlgoConfig();

    EnumC47488IkO getSpeedAlgorithmType();

    String getSpeedCalculateConfig();

    int getSpeedQueueSize();
}
