package com.ss.android.ugc.effectmanager.common.utils;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.effectmanager.common.utils.GPUUtils;

/* loaded from: classes16.dex */
public final class GPUUtils$gpuInfo$2 extends AbstractC65781Prl implements InterfaceC65784Pro<GPUUtils.GPUInfo> {
    public static final GPUUtils$gpuInfo$2 INSTANCE = new GPUUtils$gpuInfo$2();

    public GPUUtils$gpuInfo$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final GPUUtils.GPUInfo invoke() {
        return GPUUtils.INSTANCE.generateGPUInfo();
    }
}
