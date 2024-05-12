package com.bytedance.libcore.network;

import X.AbstractC73672Svk;
import X.C36425ERh;
import X.E8M;
import X.EJ6;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195767mG;
import X.PVP;
import java.util.List;

/* loaded from: classes7.dex */
public interface IExploreApi {
    public static final C36425ERh LIZ = C36425ERh.LIZIZ;

    @E8M("/metrics/api/v1/explore")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<String> reportSampled(@InterfaceC195727mC PVP pvp, @InterfaceC195767mG List<EJ6> list);
}
