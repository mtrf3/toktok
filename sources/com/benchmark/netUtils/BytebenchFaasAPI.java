package com.benchmark.netUtils;

import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import X.PVP;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* loaded from: classes.dex */
public interface BytebenchFaasAPI {
    @E8M("/")
    InterfaceC37276Ek4<TypedInput> reportResult(@InterfaceC36228EJs Map<String, String> map, @InterfaceC195727mC PVP pvp);
}
