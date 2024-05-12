package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._BriefGameTask_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.partnership.DisplayingTasksResponse;

/* loaded from: classes17.dex */
public final class _DisplayingTasksResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<DisplayingTasksResponse.ResponseData> {
    public static DisplayingTasksResponse.ResponseData LIZIZ(Q9H q9h) {
        DisplayingTasksResponse.ResponseData responseData = new DisplayingTasksResponse.ResponseData();
        responseData.gameTasks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.gameTasks.add(_BriefGameTask_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DisplayingTasksResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
