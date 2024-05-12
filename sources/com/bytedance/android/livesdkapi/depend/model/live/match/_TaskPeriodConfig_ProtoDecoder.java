package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _TaskPeriodConfig_ProtoDecoder implements InterfaceC31105CIr<TaskPeriodConfig> {
    public static TaskPeriodConfig LIZIZ(Q9H q9h) {
        TaskPeriodConfig taskPeriodConfig = new TaskPeriodConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 11) {
                            if (LJI != 12) {
                                switch (LJI) {
                                    case 21:
                                        taskPeriodConfig.promptType = q9h.LJIIJ();
                                        break;
                                    case 22:
                                        taskPeriodConfig.taskStaticPrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    case 23:
                                        taskPeriodConfig.progressTarget = q9h.LJIIJJI();
                                        break;
                                    case 24:
                                        taskPeriodConfig.targetType = q9h.LJIIJ();
                                        break;
                                    case 25:
                                        taskPeriodConfig.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                        break;
                                    default:
                                        Q9J.LIZJ(q9h);
                                        break;
                                }
                            } else {
                                taskPeriodConfig.clickToastPrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            taskPeriodConfig.clickAction = q9h.LJIIJ();
                        }
                    } else {
                        taskPeriodConfig.duration = q9h.LJIIJJI();
                    }
                } else {
                    taskPeriodConfig.taskStartTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return taskPeriodConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TaskPeriodConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
