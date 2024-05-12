package com.ss.android.ugc.aweme.effectplatform;

import X.E8L;
import X.E8M;
import X.EKC;
import X.ENW;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* loaded from: classes7.dex */
public interface EffectNetworkAPI {
    @ENX
    @E8L
    @EKC({"x-tt-dataflow-id: 671089153"})
    InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> doPost(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC195727mC Map<String, Object> map);
}
