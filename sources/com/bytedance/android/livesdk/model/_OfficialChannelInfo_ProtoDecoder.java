package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _OfficialChannelInfo_ProtoDecoder implements InterfaceC31105CIr<OfficialChannelInfo> {
    public static OfficialChannelInfo LIZIZ(Q9H q9h) {
        OfficialChannelInfo officialChannelInfo = new OfficialChannelInfo();
        officialChannelInfo.delayEnterTime = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        officialChannelInfo.channelUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        officialChannelInfo.channelName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        officialChannelInfo.endTimeStamp = q9h.LJIIJJI();
                        break;
                    case 4:
                        officialChannelInfo.forbiddenBeforeEnd = q9h.LJIIJJI();
                        break;
                    case 5:
                        officialChannelInfo.maxNextTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        long LIZJ2 = q9h.LIZJ();
                        Long l = null;
                        Long l2 = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        l2 = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (l2 != null) {
                                        officialChannelInfo.delayEnterTime.put(l, l2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 7:
                        officialChannelInfo.backupRoomId = q9h.LJIIJJI();
                        break;
                    case 8:
                        officialChannelInfo.backupRoomIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        officialChannelInfo.startTimeStamp = q9h.LJIIJJI();
                        break;
                    case 10:
                        officialChannelInfo.roleType = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        officialChannelInfo.existLinkmic = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        officialChannelInfo.linkmicType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return officialChannelInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OfficialChannelInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
