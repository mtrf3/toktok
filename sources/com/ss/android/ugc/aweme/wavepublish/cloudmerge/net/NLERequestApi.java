package com.ss.android.ugc.aweme.wavepublish.cloudmerge.net;

import X.E8L;
import X.E8M;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC30951CCt;
import X.InterfaceC30952CCu;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import X.PVP;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* loaded from: classes7.dex */
public interface NLERequestApi {
    @E8L
    InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC30952CCu Map<String, String> map2);

    @E8M
    InterfaceC37276Ek4<TypedInput> postBody(@ENW int i, @InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC30952CCu Map<String, String> map);
}
