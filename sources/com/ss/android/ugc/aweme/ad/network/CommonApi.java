package com.ss.android.ugc.aweme.ad.network;

import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC36317ENd;
import X.InterfaceC36318ENe;
import X.InterfaceC37276Ek4;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface CommonApi {
    @InterfaceC36317ENd
    InterfaceC37276Ek4<String> doDelete(@InterfaceC195747mE String str);

    @InterfaceC36317ENd
    InterfaceC37276Ek4<String> doDelete(@InterfaceC195747mE String str, @ENW int i, @InterfaceC195767mG List<EJ6> list);

    @InterfaceC36317ENd
    InterfaceC37276Ek4<String> doDelete(@InterfaceC195747mE String str, @InterfaceC195767mG List<EJ6> list);

    @InterfaceC36317ENd
    InterfaceC37276Ek4<String> doDelete(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map);

    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str);

    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str, @ENW int i);

    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str, @ENW int i, @InterfaceC36228EJs Map<String, String> map);

    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map);

    @E8L
    InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @ENW int i, @InterfaceC36229EJt Map<String, String> map);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @ENW int i, @InterfaceC36229EJt Map<String, String> map, @InterfaceC36228EJs Map<String, String> map2);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);

    @E8M
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map, @InterfaceC195767mG List<EJ6> list);

    @E8M
    InterfaceC37276Ek4<String> postBody(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);

    @InterfaceC36318ENe
    InterfaceC37276Ek4<String> putBody(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list);
}
