package com.bytedance.libcore.network;

import X.AbstractC73672Svk;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195767mG;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;

/* loaded from: classes7.dex */
public interface IPerfDataReportApi {
    @E8M("/atom/api/v1/perf")
    AbstractC73672Svk<String> reportPerfData(@InterfaceC195727mC TypedOutput typedOutput, @ENW int i, @InterfaceC195767mG List<EJ6> list);
}
