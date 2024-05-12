package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkInitResult_ProtoDecoder implements InterfaceC31105CIr<LinkInitResult> {
    public static LinkInitResult LIZIZ(Q9H q9h) {
        LinkInitResult linkInitResult = new LinkInitResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkInitResult.accessKey = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        linkInitResult.linkMicId = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        linkInitResult.vendor = q9h.LJIIJ();
                        break;
                    case 4:
                        linkInitResult.appId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        linkInitResult.appSign = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkInitResult.linkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        linkInitResult.rtcExtInfo = Q9J.LIZIZ(q9h);
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
                                        linkInitResult.rtcExtInfoMap.put(l, str);
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
                        linkInitResult.abTestInfo = q9h.LJIIJ();
                        break;
                    case 10:
                        linkInitResult.panelSettings = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkInitResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkInitResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
