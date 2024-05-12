package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _LinkCommon_ProtoDecoder implements InterfaceC31105CIr<LinkCommon> {
    public static LinkCommon LIZIZ(Q9H q9h) {
        LinkCommon linkCommon = new LinkCommon();
        linkCommon.extraMap = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    switch (LJI) {
                        case 200:
                            linkCommon.source = Q9J.LIZIZ(q9h);
                            break;
                        case 201:
                            linkCommon.appId = q9h.LJIIJJI();
                            break;
                        case 202:
                            linkCommon.live_id = q9h.LJIIJJI();
                            break;
                        case 203:
                            long LIZJ2 = q9h.LIZJ();
                            String str = null;
                            String str2 = null;
                            while (true) {
                                int LJI2 = q9h.LJI();
                                if (LJI2 != -1) {
                                    if (LJI2 != 1) {
                                        if (LJI2 == 2) {
                                            str2 = Q9J.LIZIZ(q9h);
                                        }
                                    } else {
                                        str = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    q9h.LJ(LIZJ2);
                                    if (str != null) {
                                        if (str2 != null) {
                                            linkCommon.extraMap.put(str, str2);
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
                    linkCommon.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkCommon;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkCommon LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
