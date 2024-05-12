package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _StreamUrl_ProtoDecoder implements InterfaceC31105CIr<StreamUrl> {
    public static StreamUrl LIZIZ(Q9H q9h) {
        StreamUrl streamUrl = new StreamUrl();
        streamUrl.resolutionName = new HashMap();
        streamUrl.flvPullUrl = new HashMap();
        streamUrl.pullSdkParams = new HashMap();
        streamUrl.pushUrlList = new ArrayList();
        streamUrl.completePushUrls = new ArrayList();
        streamUrl.candidateResolution = new ArrayList();
        streamUrl.hlsPullUrlMap = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                String str = null;
                switch (LJI) {
                    case 1:
                        streamUrl.provider = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        streamUrl.id = q9h.LJIIJJI();
                        break;
                    case 3:
                        streamUrl.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        long LIZJ2 = q9h.LIZJ();
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
                                        streamUrl.resolutionName.put(str, str2);
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
                        streamUrl.defaultResolution = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        streamUrl.extra = _StreamUrlExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        streamUrl.rtmpPushUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        streamUrl.rtmpPullUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        long LIZJ3 = q9h.LIZJ();
                        String str3 = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        str3 = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (str != null) {
                                    if (str3 != null) {
                                        streamUrl.flvPullUrl.put(str, str3);
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
                        streamUrl.candidateResolution.add(Q9J.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        streamUrl.hlsPullUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        streamUrl.hlsPullUrlParams = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        streamUrl.defaultPullSdkParams = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        long LIZJ4 = q9h.LIZJ();
                        String str4 = null;
                        while (true) {
                            int LJI4 = q9h.LJI();
                            if (LJI4 != -1) {
                                if (LJI4 != 1) {
                                    if (LJI4 == 2) {
                                        str4 = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ4);
                                if (str != null) {
                                    if (str4 != null) {
                                        streamUrl.pullSdkParams.put(str, str4);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 15:
                        streamUrl.pushSdkParams = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        streamUrl.pushUrlList.add(Q9J.LIZIZ(q9h));
                        break;
                    case 17:
                        streamUrl.liveCoreSDKData = _LiveCoreSDKData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 18:
                        long LIZJ5 = q9h.LIZJ();
                        String str5 = null;
                        while (true) {
                            int LJI5 = q9h.LJI();
                            if (LJI5 != -1) {
                                if (LJI5 != 1) {
                                    if (LJI5 == 2) {
                                        str5 = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ5);
                                if (str != null) {
                                    if (str5 != null) {
                                        streamUrl.hlsPullUrlMap.put(str, str5);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 19:
                        streamUrl.completePushUrls.add(Q9J.LIZIZ(q9h));
                        break;
                    case 20:
                        streamUrl.streamControlType = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 21:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 22:
                        streamUrl.streamDelayMs = q9h.LJIIJJI();
                        break;
                    case 23:
                        streamUrl.pushResolution = Q9J.LIZIZ(q9h);
                        break;
                    case 24:
                        streamUrl.streamAppId = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return streamUrl;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StreamUrl LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
