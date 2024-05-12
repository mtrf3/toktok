package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PollEndContent_ProtoDecoder implements InterfaceC31105CIr<PollEndContent> {
    public static PollEndContent LIZIZ(Q9H q9h) {
        PollEndContent pollEndContent = new PollEndContent();
        pollEndContent.optionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pollEndContent.operator = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        pollEndContent.optionList.add(_PollOptionInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    pollEndContent.endType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return pollEndContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollEndContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
