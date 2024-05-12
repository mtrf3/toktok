package com.bytedance.bdturing.ttnet;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface INetworkApi {
    @E8L
    InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> doPost(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);
}
