package com.bytedance.android.livesdk.client;

import X.AbstractC73672Svk;
import X.C64797Pbt;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC30952CCu;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IMessageApi {
    @E8L
    AbstractC73672Svk<C64797Pbt<TypedInput>> doGetAsync(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC36228EJs Map<String, String> map2);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<TypedInput> doPost(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC36228EJs Map<String, String> map2, @InterfaceC36229EJt Map<String, String> map3);

    @E8M
    AbstractC73672Svk<C64797Pbt<TypedInput>> doPostAsync(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC36228EJs Map<String, String> map2, @InterfaceC195727mC TypedOutput typedOutput);
}
