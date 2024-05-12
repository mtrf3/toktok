package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _AnchorPreFinishData_ProtoDecoder implements InterfaceC31105CIr<AnchorPreFinishData> {
    public static AnchorPreFinishData LIZIZ(Q9H q9h) {
        AnchorPreFinishData anchorPreFinishData = new AnchorPreFinishData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorPreFinishData.finishType = q9h.LJIIJ();
                    }
                } else {
                    anchorPreFinishData.confirmBox = _AnchorPreFinishData_ConfirmBox_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorPreFinishData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorPreFinishData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
