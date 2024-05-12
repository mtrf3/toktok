package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RoomStats_ProtoDecoder implements InterfaceC31105CIr<RoomStats> {
    public static RoomStats LIZIZ(Q9H q9h) {
        RoomStats roomStats = new RoomStats();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 5) {
                                if (LJI != 6) {
                                    if (LJI != 7) {
                                        if (LJI != 9) {
                                            if (LJI != 11) {
                                                if (LJI != 16) {
                                                    if (LJI != 17) {
                                                        Q9J.LIZJ(q9h);
                                                    } else {
                                                        roomStats.shareCount = (int) q9h.LJIIJJI();
                                                    }
                                                } else {
                                                    roomStats.replayViewers = (int) q9h.LJIIJJI();
                                                }
                                            } else {
                                                roomStats.enterCount = (int) q9h.LJIIJJI();
                                            }
                                        } else {
                                            roomStats.watermelon = (int) q9h.LJIIJJI();
                                        }
                                    } else {
                                        roomStats.followCount = (int) q9h.LJIIJJI();
                                    }
                                } else {
                                    roomStats.giftUVCount = (int) q9h.LJIIJJI();
                                }
                            } else {
                                roomStats.totalUser = (int) q9h.LJIIJJI();
                            }
                        } else {
                            roomStats.ticket = q9h.LJIIJJI();
                        }
                    } else {
                        roomStats.idStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    roomStats.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomStats;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomStats LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
