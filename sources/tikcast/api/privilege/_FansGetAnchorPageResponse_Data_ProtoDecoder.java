package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import tikcast.api.privilege.FansGetAnchorPageResponse;

/* loaded from: classes17.dex */
public final class _FansGetAnchorPageResponse_Data_ProtoDecoder implements InterfaceC31105CIr<FansGetAnchorPageResponse.Data> {
    public static FansGetAnchorPageResponse.Data LIZIZ(Q9H q9h) {
        FansGetAnchorPageResponse.Data data = new FansGetAnchorPageResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        switch (LJI) {
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                data.topFans = _FansList_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 12:
                                data.newFans = _FansList_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                data.quickUpgradeFans = _FansList_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                switch (LJI) {
                                    case 21:
                                        data.fansGiftNum = q9h.LJIIJJI();
                                        break;
                                    case 22:
                                        data.watchLiveNum = q9h.LJIIJJI();
                                        break;
                                    case 23:
                                        data.giftCoins = q9h.LJIIJJI();
                                        break;
                                    case 24:
                                        data.commentFans = q9h.LJIIJJI();
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                        }
                    } else {
                        data.fansCount = q9h.LJIIJJI();
                    }
                } else {
                    data.anchorInfo = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansGetAnchorPageResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
