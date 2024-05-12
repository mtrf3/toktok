package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class _LiveEventInfo_ProtoEncoder implements InterfaceC64604PXc<LiveEventInfo> {
    public static int LIZJ(LiveEventInfo liveEventInfo) {
        int LIZ;
        int LJI = C30957CCz.LJI(9, liveEventInfo.payMethod) + C30957CCz.LJIIJ(8, liveEventInfo.ticketAmount) + C30957CCz.LJFF(7, liveEventInfo.isPaidEvent) + C30957CCz.LJFF(6, liveEventInfo.subscribed) + C30957CCz.LJIIL(5, liveEventInfo.description) + C30957CCz.LJIIL(4, liveEventInfo.title) + C30957CCz.LJIIJ(3, liveEventInfo.duration) + C30957CCz.LJIIJ(2, liveEventInfo.startTime) + C30957CCz.LJIIJ(1, liveEventInfo.eventId);
        HashMap<String, WalletPackage> hashMap = liveEventInfo.walletPkgDict;
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<String, WalletPackage> entry : liveEventInfo.walletPkgDict.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int LJIIL = C30957CCz.LJIIL(1, entry.getKey());
                    WalletPackage value = entry.getValue();
                    if (value == null) {
                        LIZ = 0;
                    } else {
                        int LJIIL2 = C30957CCz.LJIIL(2, value.usdPriceShow) + C30957CCz.LJIIL(1, value.iapId);
                        LIZ = CD6.LIZ(2) + CD6.LIZIZ(LJIIL2) + LJIIL2;
                    }
                    int i = LIZ + LJIIL;
                    LJI += CD6.LIZ(10) + CD6.LIZIZ(i) + i;
                }
            }
        }
        return LJI;
    }

    public static void LIZIZ(CD6 cd6, LiveEventInfo liveEventInfo) {
        int LIZ;
        C30957CCz.LIZJ(cd6, 1, liveEventInfo.eventId);
        C30957CCz.LIZJ(cd6, 2, liveEventInfo.startTime);
        C30957CCz.LIZJ(cd6, 3, liveEventInfo.duration);
        C30957CCz.LIZLLL(cd6, 4, liveEventInfo.title);
        C30957CCz.LIZLLL(cd6, 5, liveEventInfo.description);
        C30957CCz.LIZ(cd6, 6, liveEventInfo.subscribed);
        C30957CCz.LIZ(cd6, 7, liveEventInfo.isPaidEvent);
        C30957CCz.LIZJ(cd6, 8, liveEventInfo.ticketAmount);
        int i = liveEventInfo.payMethod;
        cd6.LIZLLL(9, 0);
        cd6.LIZJ(i);
        HashMap<String, WalletPackage> hashMap = liveEventInfo.walletPkgDict;
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<String, WalletPackage> entry : liveEventInfo.walletPkgDict.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    cd6.LIZLLL(10, 2);
                    int LJIIL = C30957CCz.LJIIL(1, entry.getKey());
                    WalletPackage value = entry.getValue();
                    if (value == null) {
                        LIZ = 0;
                    } else {
                        int LJIIL2 = C30957CCz.LJIIL(2, value.usdPriceShow) + C30957CCz.LJIIL(1, value.iapId);
                        LIZ = CD6.LIZ(2) + CD6.LIZIZ(LJIIL2) + LJIIL2;
                    }
                    cd6.LJ(LIZ + LJIIL);
                    C30957CCz.LIZLLL(cd6, 1, entry.getKey());
                    WalletPackage value2 = entry.getValue();
                    if (value2 != null) {
                        cd6.LIZLLL(2, 2);
                        cd6.LJ(C30957CCz.LJIIL(2, value2.usdPriceShow) + C30957CCz.LJIIL(1, value2.iapId));
                        C30957CCz.LIZLLL(cd6, 1, value2.iapId);
                        C30957CCz.LIZLLL(cd6, 2, value2.usdPriceShow);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, LiveEventInfo liveEventInfo) {
        LIZIZ(cd6, liveEventInfo);
    }
}
