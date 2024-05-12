package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;

/* loaded from: classes14.dex */
public final class _RivalExtraInfo_Tag_ProtoDecoder implements InterfaceC31105CIr<RivalExtraInfo.Tag> {
    public static RivalExtraInfo.Tag LIZIZ(Q9H q9h) {
        RivalExtraInfo.Tag tag = new RivalExtraInfo.Tag();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            tag.tagText = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        tag.tagValue = Q9J.LIZIZ(q9h);
                    }
                } else {
                    tag.tagType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return tag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalExtraInfo.Tag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
