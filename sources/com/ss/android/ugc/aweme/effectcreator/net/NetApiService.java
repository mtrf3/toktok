package com.ss.android.ugc.aweme.effectcreator.net;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.ENX;
import X.ENY;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import X.InterfaceC64982Pes;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes34.dex */
public interface NetApiService {
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> doPost(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC Map<String, ? extends Object> map2, @InterfaceC195767mG List<EJ6> list);

    @ENY
    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> doPostFile(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC64982Pes Map<String, TypedOutput> map2);
}
