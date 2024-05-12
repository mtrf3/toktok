package com.ss.android.ugc.aweme.requesttask.idle;

import X.E8M;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC30952CCu;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface TraceRouterApi {
    @E8M
    InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC36229EJt Map<String, String> map2, @InterfaceC30951CCt boolean z);

    @E8M
    InterfaceC37276Ek4<String> doRegionPost(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC30952CCu Map<String, String> map2, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC30951CCt boolean z);
}
