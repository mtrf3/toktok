package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ApplyResult_ProtoDecoder implements InterfaceC31105CIr<ApplyResult> {
    public static ApplyResult LIZIZ(Q9H q9h) {
        ApplyResult applyResult = new ApplyResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        applyResult.linkMicId = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        applyResult.vendor = q9h.LJIIJ();
                        break;
                    case 3:
                        applyResult.prompts = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        applyResult.linkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        applyResult.autoJoin = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 6:
                        applyResult.decayType = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        applyResult.rtcExtInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        long LIZJ2 = q9h.LIZJ();
                        Long l = null;
                        String str = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        str = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (str != null) {
                                        applyResult.rtcExtInfoMap.put(l, str);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 9:
                        applyResult.linkTypePermission = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return applyResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ApplyResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
