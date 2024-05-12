package com.ss.android.ugc.aweme.miniapp.net;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36318ENe;
import X.InterfaceC36324ENk;
import X.InterfaceC36325ENl;
import X.InterfaceC36326ENm;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IAppbrandNetworkApi {
    @InterfaceC36326ENm(hasBody = true, method = "DELETE")
    @ENX
    InterfaceC37276Ek4<TypedInput> delete(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> getRaw(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z2);

    @ENX
    @InterfaceC36325ENl
    InterfaceC37276Ek4<TypedInput> head(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z);

    @ENX
    @InterfaceC36324ENk
    InterfaceC37276Ek4<TypedInput> options(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> post(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z);

    @E8M
    InterfaceC37276Ek4<String> postBody(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @InterfaceC36318ENe
    @ENX
    InterfaceC37276Ek4<TypedInput> put(@ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj, @InterfaceC30951CCt boolean z);
}
