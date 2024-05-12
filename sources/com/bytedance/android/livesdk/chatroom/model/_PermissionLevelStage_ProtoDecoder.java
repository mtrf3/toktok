package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PermissionLevelStage_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelStage> {
    public static PermissionLevelStage LIZIZ(Q9H q9h) {
        PermissionLevelStage permissionLevelStage = new PermissionLevelStage();
        permissionLevelStage.tasks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        permissionLevelStage.taskStage = q9h.LJIIJ();
                        break;
                    case 2:
                        permissionLevelStage.stageStartTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        permissionLevelStage.stageEndTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        permissionLevelStage.status = q9h.LJIIJ();
                        break;
                    case 5:
                        permissionLevelStage.abnormalDate = q9h.LJIIJJI();
                        break;
                    case 6:
                        permissionLevelStage.tasks.add(_PermissionLevelStage_PermissionLevelTask_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelStage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelStage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
