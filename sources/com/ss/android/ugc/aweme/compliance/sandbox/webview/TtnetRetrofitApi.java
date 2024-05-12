package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C64553PVd;
import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENX;
import X.ENY;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC36317ENd;
import X.InterfaceC36318ENe;
import X.InterfaceC36324ENk;
import X.InterfaceC36325ENl;
import X.InterfaceC36337ENx;
import X.InterfaceC37276Ek4;
import X.InterfaceC64977Pen;
import X.InterfaceC64982Pes;
import X.PVP;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface TtnetRetrofitApi {
    @ENX
    @InterfaceC36317ENd
    InterfaceC37276Ek4<TypedInput> deleteStreamRequest(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> getStreamRequest(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @InterfaceC36325ENl
    InterfaceC37276Ek4<Void> headStreamRequest(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @InterfaceC36324ENk
    InterfaceC37276Ek4<TypedInput> optionsStreamRequest(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @InterfaceC36337ENx
    InterfaceC37276Ek4<TypedInput> patchStreamRequest(@InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> postStreamRequest(@InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @InterfaceC36318ENe
    @ENX
    InterfaceC37276Ek4<TypedInput> putStreamRequest(@InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENY
    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> uploadFiles(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC64982Pes Map<String, PVP> map, @InterfaceC195737mD Object obj, @InterfaceC64977Pen C64553PVd... c64553PVdArr);
}
