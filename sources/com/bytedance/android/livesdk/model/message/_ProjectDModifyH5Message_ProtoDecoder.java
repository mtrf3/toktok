package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ProjectDModifyH5Message_ProtoDecoder implements InterfaceC31105CIr<ProjectDModifyH5Message> {
    @Override // X.InterfaceC31105CIr
    public final ProjectDModifyH5Message LIZ(Q9H q9h) {
        ProjectDModifyH5Message projectDModifyH5Message = new ProjectDModifyH5Message();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            projectDModifyH5Message.mBottomRightUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        projectDModifyH5Message.mTopLeftUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    projectDModifyH5Message.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return projectDModifyH5Message;
            }
        }
    }
}
