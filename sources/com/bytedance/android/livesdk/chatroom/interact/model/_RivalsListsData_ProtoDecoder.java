package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _RivalsListsData_ProtoDecoder implements InterfaceC31105CIr<RivalsListsData> {
    public static RivalsListsData LIZIZ(Q9H q9h) {
        RivalsListsData rivalsListsData = new RivalsListsData();
        rivalsListsData.reservedList = new ArrayList();
        rivalsListsData.mixedList = new ArrayList();
        rivalsListsData.recentList = new ArrayList();
        rivalsListsData.bestTeammateList = new ArrayList();
        rivalsListsData.recommendList = new ArrayList();
        rivalsListsData.roomTopHostInfo = new HashMap();
        rivalsListsData.mayKnowList = new ArrayList();
        rivalsListsData.followedList = new ArrayList();
        rivalsListsData.rivalExtraInfos = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                switch (LJI) {
                    case 1:
                        rivalsListsData.followedList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        rivalsListsData.recentList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        rivalsListsData.recommendList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        long LIZJ2 = q9h.LIZJ();
                        RivalExtraInfo rivalExtraInfo = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        rivalExtraInfo = _RivalExtraInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (rivalExtraInfo != null) {
                                        rivalsListsData.rivalExtraInfos.put(l, rivalExtraInfo);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 5:
                        rivalsListsData.autoMatchBanner = _AutoMatchBanner_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        rivalsListsData.tips = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        rivalsListsData.searchBar = _SearchBar_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        rivalsListsData.bannerText = _RivalsListsData_BannerText_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        long LIZJ3 = q9h.LIZJ();
                        RivalsListsData.TopHostInfo topHostInfo = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        topHostInfo = _RivalsListsData_TopHostInfo_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (l != null) {
                                    if (topHostInfo != null) {
                                        rivalsListsData.roomTopHostInfo.put(l, topHostInfo);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 10:
                        rivalsListsData.bestTeammateList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rivalsListsData.reservedList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        rivalsListsData.mayKnowList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rivalsListsData.mixedList.add(_Room_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        switch (LJI) {
                            case 21:
                                rivalsListsData.topicBanner = _CohostTopic_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 22:
                                rivalsListsData.topicExtraInfo = _TopicExtraInfo_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 23:
                                rivalsListsData.guidePopupBanner = _GuidePopupBanner_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return rivalsListsData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalsListsData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
