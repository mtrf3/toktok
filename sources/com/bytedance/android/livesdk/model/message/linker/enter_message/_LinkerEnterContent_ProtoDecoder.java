package com.bytedance.android.livesdk.model.message.linker.enter_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message._ListUser_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkerEnterContent_ProtoDecoder implements InterfaceC31105CIr<LinkerEnterContent> {
    public static LinkerEnterContent LIZIZ(Q9H q9h) {
        LinkerEnterContent linkerEnterContent = new LinkerEnterContent();
        linkerEnterContent.listUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkerEnterContent.anchorSettingInfo = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        linkerEnterContent.MultiLiveType = q9h.LJIIJ();
                    }
                } else {
                    linkerEnterContent.listUsers.add(_ListUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerEnterContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerEnterContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}