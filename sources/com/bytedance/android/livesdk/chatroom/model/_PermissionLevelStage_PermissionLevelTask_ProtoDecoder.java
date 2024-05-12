package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.PermissionLevelStage;

/* loaded from: classes17.dex */
public final class _PermissionLevelStage_PermissionLevelTask_ProtoDecoder implements InterfaceC31105CIr<PermissionLevelStage.PermissionLevelTask> {
    public static PermissionLevelStage.PermissionLevelTask LIZIZ(Q9H q9h) {
        PermissionLevelStage.PermissionLevelTask permissionLevelTask = new PermissionLevelStage.PermissionLevelTask();
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
                                    permissionLevelTask.status = q9h.LJIIJ();
                                }
                            } else {
                                permissionLevelTask.completeValue = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            permissionLevelTask.currentValue = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        permissionLevelTask.text = Q9J.LIZIZ(q9h);
                    }
                } else {
                    permissionLevelTask.taskType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return permissionLevelTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PermissionLevelStage.PermissionLevelTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
