package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CppTaskInfo_ProtoDecoder implements InterfaceC31105CIr<CppTaskInfo> {
    public static CppTaskInfo LIZIZ(Q9H q9h) {
        CppTaskInfo cppTaskInfo = new CppTaskInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        cppTaskInfo.currentLiveDuration = q9h.LJIIJJI();
                        break;
                    case 2:
                        cppTaskInfo.currentLiveDays = q9h.LJIIJJI();
                        break;
                    case 3:
                        cppTaskInfo.lastLiveDuration = q9h.LJIIJJI();
                        break;
                    case 4:
                        cppTaskInfo.lastLiveDays = q9h.LJIIJJI();
                        break;
                    case 5:
                        cppTaskInfo.liveDurationThreshold = q9h.LJIIJJI();
                        break;
                    case 6:
                        cppTaskInfo.liveDaysThreshold = q9h.LJIIJJI();
                        break;
                    case 7:
                        cppTaskInfo.taskStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        cppTaskInfo.showCppV2Model = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return cppTaskInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CppTaskInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
