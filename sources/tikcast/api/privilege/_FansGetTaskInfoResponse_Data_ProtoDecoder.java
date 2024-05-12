package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;
import tikcast.api.privilege.FansGetTaskInfoResponse;
import webcast.data._FansLevelInfo_ProtoDecoder;
import webcast.data._FansScoreRule_ProtoDecoder;
import webcast.data._FansTask_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FansGetTaskInfoResponse_Data_ProtoDecoder implements InterfaceC31105CIr<FansGetTaskInfoResponse.Data> {
    public static FansGetTaskInfoResponse.Data LIZIZ(Q9H q9h) {
        FansGetTaskInfoResponse.Data data = new FansGetTaskInfoResponse.Data();
        data.levelConfigs = new ArrayList();
        data.tasks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 21) {
                            if (LJI != 22) {
                                if (LJI != 100) {
                                    switch (LJI) {
                                        case 31:
                                            data.tasks.add(_FansTask_ProtoDecoder.LIZIZ(q9h));
                                            break;
                                        case 32:
                                            data.fansGiftId = q9h.LJIIJJI();
                                            break;
                                        case 33:
                                            data.levelConfigs.add(_FansScoreRule_ProtoDecoder.LIZIZ(q9h));
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    data.userLocalMonth = q9h.LJIIJJI();
                                }
                            } else {
                                data.levelInfo = _FansLevelInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            data.userInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        data.anchorFansCount = q9h.LJIIJJI();
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
    public final FansGetTaskInfoResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
