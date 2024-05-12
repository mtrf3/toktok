package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._LiveSubOnlyConfig_ProtoDecoder;
import webcast.api.sub.SubManagementResponse;

/* loaded from: classes6.dex */
public final class _SubManagementResponse_Data_ProtoDecoder implements InterfaceC31105CIr<SubManagementResponse.Data> {
    public static SubManagementResponse.Data LIZIZ(Q9H q9h) {
        SubManagementResponse.Data data = new SubManagementResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                data.liveSubOnlyConfig = _LiveSubOnlyConfig_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            data.subOnlyLiveStatus = q9h.LJIIJ();
                        }
                    } else {
                        data.subOnlyChatStatus = q9h.LJIIJ();
                    }
                } else {
                    data.activeSubscriberCnt = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubManagementResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
