package com.facebook.net;

import X.E6L;
import X.E8L;
import X.EJ6;
import X.ENW;
import X.ENX;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IDownloadImage {
    @E6L(2)
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFileForHigh(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E6L(3)
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFileForImmediate(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E6L(0)
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFileForLow(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @E6L(1)
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFileForNormal(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);
}
