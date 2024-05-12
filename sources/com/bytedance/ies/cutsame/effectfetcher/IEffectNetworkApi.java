package com.bytedance.ies.cutsame.effectfetcher;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import X.PVP;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IEffectNetworkApi {
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> davResourceGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> davResourcePost(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list);
}
