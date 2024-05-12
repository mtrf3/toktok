package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _CohostListChangeContent_ProtoDecoder implements InterfaceC31105CIr<CohostListChangeContent> {
    public static CohostListChangeContent LIZIZ(Q9H q9h) {
        CohostListChangeContent cohostListChangeContent = new CohostListChangeContent();
        cohostListChangeContent.users = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cohostListChangeContent.users.add(_CohostListUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostListChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostListChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
