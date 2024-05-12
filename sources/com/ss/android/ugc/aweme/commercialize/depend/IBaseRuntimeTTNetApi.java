package com.ss.android.ugc.aweme.commercialize.depend;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC36325ENl;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IBaseRuntimeTTNetApi {
    @E8L
    InterfaceC37276Ek4<TypedInput> doGetForStream(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E8L
    InterfaceC37276Ek4<String> doGetForString(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @InterfaceC36325ENl
    InterfaceC37276Ek4<String> doHead(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E8M
    InterfaceC37276Ek4<TypedInput> doPostForStream(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195737mD Object obj);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<TypedInput> doPostForStream(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC36229EJt(encode = true) Map<String, String> map2, @InterfaceC195737mD Object obj);

    @E8M
    InterfaceC37276Ek4<String> doPostForString(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195737mD Object obj);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPostForString(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC36229EJt(encode = true) Map<String, String> map2, @InterfaceC195737mD Object obj);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFile(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);
}