package com.bytedance.bdlocation.network;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface INetworkApiInner {
    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPost(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC36229EJt(encode = true) Map<String, String> map2, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z);
}
