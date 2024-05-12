package com.bytedance.apm.impl;

import X.E8L;
import X.E8M;
import X.EJ6;
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

/* loaded from: classes7.dex */
public interface RetrofitMonitorService {
    @E8L
    InterfaceC37276Ek4<TypedInput> fetch(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list, @InterfaceC36228EJs Map<String, String> map, @InterfaceC30951CCt boolean z);

    @E8L
    InterfaceC37276Ek4<TypedInput> fetch(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC30951CCt boolean z);

    @E8M
    InterfaceC37276Ek4<TypedInput> report(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC30951CCt boolean z);

    @ENY
    @E8M
    InterfaceC37276Ek4<TypedInput> uploadFiles(@InterfaceC195747mE String str, @InterfaceC64982Pes Map<String, TypedOutput> map, @InterfaceC195767mG List<EJ6> list);
}
