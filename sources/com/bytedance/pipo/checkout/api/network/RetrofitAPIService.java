package com.bytedance.pipo.checkout.api.network;

import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* loaded from: classes20.dex */
public interface RetrofitAPIService {
    @E8L
    @EKC({"referer: https://tiktok.com"})
    InterfaceC37276Ek4<TypedInput> get(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<TypedInput> post(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);
}
