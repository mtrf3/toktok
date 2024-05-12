package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import tikcast.api.privilege.FansGetUserDataResponse;
import webcast.data._FansLevelInfo_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FansGetUserDataResponse_Data_ProtoDecoder implements InterfaceC31105CIr<FansGetUserDataResponse.Data> {
    public static FansGetUserDataResponse.Data LIZIZ(Q9H q9h) {
        FansGetUserDataResponse.Data data = new FansGetUserDataResponse.Data();
        data.showDataTypes = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 21) {
                            if (LJI != 22) {
                                if (LJI != 50) {
                                    switch (LJI) {
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                            data.joinFansTimestampSecond = q9h.LJIIJJI();
                                            break;
                                        case 12:
                                            data.sendingGiftNum = q9h.LJIIJJI();
                                            break;
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                            data.watchLiveTimes = q9h.LJIIJJI();
                                            break;
                                        case 14:
                                            data.watchLiveMinute = q9h.LJIIJJI();
                                            break;
                                        case 15:
                                            data.sendCommentNum = q9h.LJIIJJI();
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    data.showDataTypes.add(Integer.valueOf(q9h.LJIIJ()));
                                }
                            } else {
                                data.badge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            data.levelInfo = _FansLevelInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        data.anchorInfo = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    data.userInfo = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansGetUserDataResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
