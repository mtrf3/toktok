package com.ss.android.socialbase.ttnet;

import X.E8L;
import X.EJ6;
import X.ENX;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36325ENl;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

/* loaded from: classes7.dex */
public interface IDownloadApi {
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> get(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);

    @ENX
    @InterfaceC36325ENl
    InterfaceC37276Ek4<Void> head(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC195737mD Object obj);
}
