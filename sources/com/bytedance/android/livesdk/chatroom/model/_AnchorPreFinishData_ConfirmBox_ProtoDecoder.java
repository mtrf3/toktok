package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;

/* loaded from: classes6.dex */
public final class _AnchorPreFinishData_ConfirmBox_ProtoDecoder implements InterfaceC31105CIr<AnchorPreFinishData.ConfirmBox> {
    public static AnchorPreFinishData.ConfirmBox LIZIZ(Q9H q9h) {
        AnchorPreFinishData.ConfirmBox confirmBox = new AnchorPreFinishData.ConfirmBox();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        confirmBox.value = q9h.LJIIJJI();
                    }
                } else {
                    confirmBox.title = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return confirmBox;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorPreFinishData.ConfirmBox LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
