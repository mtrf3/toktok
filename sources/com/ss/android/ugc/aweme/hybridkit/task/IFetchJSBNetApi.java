package com.ss.android.ugc.aweme.hybridkit.task;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedByteArray;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IFetchJSBNetApi {
    @E8L
    InterfaceC37276Ek4<String> fetchGet(@InterfaceC195747mE String str, @InterfaceC30951CCt boolean z, @InterfaceC195767mG List<EJ6> list, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195737mD Object obj);

    @E8M
    InterfaceC37276Ek4<String> fetchPost(@InterfaceC195747mE String str, @InterfaceC30951CCt boolean z, @InterfaceC195767mG List<EJ6> list, @InterfaceC195727mC TypedByteArray typedByteArray, @InterfaceC195737mD Object obj);
}
