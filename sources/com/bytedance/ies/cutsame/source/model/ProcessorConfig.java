package com.bytedance.ies.cutsame.source.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ProcessorConfig extends F9E {
    public final String algorithm;
    public final String conf;
    public final int inputType;
    public final int outputType;
    public final SpeedConfig speedConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProcessorConfig() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r1
            r5 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.cutsame.source.model.ProcessorConfig.<init>():void");
    }

    public static /* synthetic */ ProcessorConfig copy$default(ProcessorConfig processorConfig, String str, int i, int i2, String str2, SpeedConfig speedConfig, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = processorConfig.algorithm;
        }
        if ((i3 & 2) != 0) {
            i = processorConfig.inputType;
        }
        if ((i3 & 4) != 0) {
            i2 = processorConfig.outputType;
        }
        if ((i3 & 8) != 0) {
            str2 = processorConfig.conf;
        }
        if ((i3 & 16) != 0) {
            speedConfig = processorConfig.speedConfig;
        }
        return processorConfig.copy(str, i, i2, str2, speedConfig);
    }

    public final ProcessorConfig copy(String algorithm, int i, int i2, String conf, SpeedConfig speedConfig) {
        o.LJIIIZ(algorithm, "algorithm");
        o.LJIIIZ(conf, "conf");
        o.LJIIIZ(speedConfig, "speedConfig");
        return new ProcessorConfig(algorithm, i, i2, conf, speedConfig);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.algorithm, Integer.valueOf(this.inputType), Integer.valueOf(this.outputType), this.conf, this.speedConfig};
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getConf() {
        return this.conf;
    }

    public final int getInputType() {
        return this.inputType;
    }

    public final int getOutputType() {
        return this.outputType;
    }

    public final SpeedConfig getSpeedConfig() {
        return this.speedConfig;
    }

    public ProcessorConfig(String algorithm, int i, int i2, String conf, SpeedConfig speedConfig) {
        o.LJIIIZ(algorithm, "algorithm");
        o.LJIIIZ(conf, "conf");
        o.LJIIIZ(speedConfig, "speedConfig");
        this.algorithm = algorithm;
        this.inputType = i;
        this.outputType = i2;
        this.conf = conf;
        this.speedConfig = speedConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ProcessorConfig(String str, int i, int i2, String str2, SpeedConfig speedConfig, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) == 0 ? str2 : "", (i3 & 16) != 0 ? new SpeedConfig(null, 0, 3, 0 == true ? 1 : 0) : speedConfig);
    }
}
