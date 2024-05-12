package com.bytedance.ttnet;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.ENX;
import X.ENY;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.InterfaceC64982Pes;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface INetworkApi {
    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPost(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC36229EJt(encode = true) Map<String, String> map2, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFile(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFile(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E8M
    InterfaceC37276Ek4<String> postBody(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);

    @ENY
    @E8M
    InterfaceC37276Ek4<String> postMultiPart(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC64982Pes Map<String, TypedOutput> map2, @InterfaceC195767mG List<EJ6> list);
}
