package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PollStartContent_ProtoDecoder implements InterfaceC31105CIr<PollStartContent> {
    public static PollStartContent LIZIZ(Q9H q9h) {
        PollStartContent pollStartContent = new PollStartContent();
        pollStartContent.optionList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    pollStartContent.operator = _User_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                pollStartContent.title = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            pollStartContent.optionList.add(_PollOptionInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        pollStartContent.endTime = q9h.LJIIJJI();
                    }
                } else {
                    pollStartContent.startTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pollStartContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PollStartContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
