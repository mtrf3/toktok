package com.ss.android.ugc.aweme.hybridkit.forest;

import X.E8L;
import X.ENX;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC30952CCu;
import X.InterfaceC36325ENl;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* loaded from: classes7.dex */
public interface TTNetRetrofitApi {
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> getStreamRequest(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195737mD Object obj);

    @ENX
    @InterfaceC36325ENl
    InterfaceC37276Ek4<Void> headStreamRequest(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195737mD Object obj);
}
