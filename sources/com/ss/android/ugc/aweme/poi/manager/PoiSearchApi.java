package com.ss.android.ugc.aweme.poi.manager;

import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC30951CCt;
import X.InterfaceC30952CCu;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* loaded from: classes6.dex */
public interface PoiSearchApi {
    @E8M
    InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC30951CCt boolean z);

    @E8M
    InterfaceC37276Ek4<TypedInput> doPostPb(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC30951CCt boolean z);
}
