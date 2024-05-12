package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.subscribe.model.goal._SubGoalInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ToolsInfo_ProtoDecoder implements InterfaceC31105CIr<ToolsInfo> {
    public static ToolsInfo LIZIZ(Q9H q9h) {
        ToolsInfo toolsInfo = new ToolsInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                toolsInfo.goalInfo = _SubGoalInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            toolsInfo.noteInfo = _NoteInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        toolsInfo.aboutMeInfo = _AboutMeInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    toolsInfo.figures = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return toolsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ToolsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
