package com.ss.android.ugc.aweme.account.network;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IAccountNetworkApi {
    @E8L
    InterfaceC37276Ek4<String> getResponse(@InterfaceC195747mE String str, @ENW int i, @InterfaceC195767mG List<EJ6> list);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> getResponse(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map, @ENW int i, @InterfaceC195767mG List<EJ6> list);
}
