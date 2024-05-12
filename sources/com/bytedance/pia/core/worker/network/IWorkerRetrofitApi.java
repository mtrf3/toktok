package com.bytedance.pia.core.worker.network;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36317ENd;
import X.InterfaceC36318ENe;
import X.InterfaceC36324ENk;
import X.InterfaceC36325ENl;
import X.InterfaceC36337ENx;
import X.InterfaceC37276Ek4;
import X.PVP;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

/* loaded from: classes7.dex */
public interface IWorkerRetrofitApi {
    @ENX
    @InterfaceC36317ENd
    InterfaceC37276Ek4<TypedInput> deleteStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> getStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @InterfaceC36325ENl
    InterfaceC37276Ek4<TypedInput> headStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @InterfaceC36324ENk
    InterfaceC37276Ek4<TypedInput> optionsStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @InterfaceC36337ENx
    InterfaceC37276Ek4<TypedInput> patchStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> postStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list);

    @InterfaceC36318ENe
    @ENX
    InterfaceC37276Ek4<TypedInput> putStreamRequest(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list);
}
