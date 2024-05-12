package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _FansList_ProtoDecoder implements InterfaceC31105CIr<FansList> {
    public static FansList LIZIZ(Q9H q9h) {
        FansList fansList = new FansList();
        fansList.previewUser = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansList.fansCount = q9h.LJIIJJI();
                    }
                } else {
                    fansList.previewUser.add(_User_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return fansList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
