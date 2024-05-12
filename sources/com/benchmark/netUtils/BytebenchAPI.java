package com.benchmark.netUtils;

import X.E8L;
import X.E8M;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC30952CCu;
import X.InterfaceC36228EJs;
import X.InterfaceC37276Ek4;
import X.PVP;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* loaded from: classes.dex */
public interface BytebenchAPI {
    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map);

    @ENX
    @E8M
    InterfaceC37276Ek4<TypedInput> doPost(@InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC30952CCu Map<String, String> map2, @InterfaceC195727mC PVP pvp);

    @ENX
    @E8L
    InterfaceC37276Ek4<TypedInput> downloadFile(@InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC30952CCu Map<String, String> map2);

    @E8L("/bytebench/api/task/group")
    InterfaceC37276Ek4<TypedInput> getDefaultBenchmark(@InterfaceC30952CCu Map<String, String> map, @InterfaceC36228EJs Map<String, String> map2);

    @E8L("/model/api/arithmetics")
    InterfaceC37276Ek4<TypedInput> getModels(@InterfaceC36228EJs Map<String, String> map);

    @E8M("/bytebench/api/sdk/device/strategy/batch/v2")
    InterfaceC37276Ek4<TypedInput> getStrategyCompriseV2(@InterfaceC30952CCu Map<String, String> map, @InterfaceC36228EJs Map<String, String> map2, @InterfaceC195727mC PVP pvp);

    @E8M("/bytebench/api/task/result")
    InterfaceC37276Ek4<TypedInput> reportResult(@InterfaceC36228EJs Map<String, String> map, @InterfaceC195727mC PVP pvp);
}
