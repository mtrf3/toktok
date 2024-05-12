package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveEventInfo_ProtoDecoder implements InterfaceC31105CIr<LiveEventInfo> {
    public static LiveEventInfo LIZIZ(Q9H q9h) {
        LiveEventInfo liveEventInfo = new LiveEventInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveEventInfo.eventId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        liveEventInfo.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        liveEventInfo.duration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        liveEventInfo.title = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        liveEventInfo.description = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        liveEventInfo.subscribed = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 7:
                        liveEventInfo.isPaidEvent = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 8:
                        liveEventInfo.ticketAmount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        liveEventInfo.payMethod = q9h.LJIIJ();
                        break;
                    case 10:
                        long LIZJ2 = q9h.LIZJ();
                        String str = null;
                        WalletPackage walletPackage = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        walletPackage = _WalletPackage_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (str != null) {
                                    if (walletPackage != null) {
                                        liveEventInfo.walletPkgDict.put(str, walletPackage);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveEventInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveEventInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
