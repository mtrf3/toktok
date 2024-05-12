package com.bytedance.android.livesdkapi.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes16.dex */
public final class _ProtoMessageFetchResult_ProtoDecoder implements InterfaceC31105CIr<ProtoMessageFetchResult> {
    @Override // X.InterfaceC31105CIr
    public final ProtoMessageFetchResult LIZ(Q9H q9h) {
        ProtoMessageFetchResult protoMessageFetchResult = new ProtoMessageFetchResult();
        protoMessageFetchResult.routeParams = new HashMap();
        protoMessageFetchResult.messages = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        protoMessageFetchResult.messages.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        protoMessageFetchResult.cursor = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        protoMessageFetchResult.fetchInterval = q9h.LJIIJJI();
                        break;
                    case 4:
                        protoMessageFetchResult.now = q9h.LJIIJJI();
                        break;
                    case 5:
                        protoMessageFetchResult.internalExt = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        protoMessageFetchResult.fetchType = q9h.LJIIJ();
                        break;
                    case 7:
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
                                        protoMessageFetchResult.routeParams.put(str, str2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 8:
                        protoMessageFetchResult.heartbeatDuration = q9h.LJIIJJI();
                        break;
                    case 9:
                        protoMessageFetchResult.needAck = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        protoMessageFetchResult.pushServer = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        protoMessageFetchResult.isFirst = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        protoMessageFetchResult.historyCommentCursor = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        protoMessageFetchResult.historyNoMore = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return protoMessageFetchResult;
            }
        }
    }
}
