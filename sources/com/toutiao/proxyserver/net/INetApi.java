package com.toutiao.proxyserver.net;

import X.E8L;
import X.EJ6;
import X.ENX;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC36228EJs;
import X.InterfaceC36325ENl;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface INetApi {
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> get(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @InterfaceC36325ENl
    InterfaceC37276Ek4<Void> head(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);
}
