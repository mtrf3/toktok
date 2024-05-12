package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TopicExtraInfo_ProtoDecoder implements InterfaceC31105CIr<TopicExtraInfo> {
    public static TopicExtraInfo LIZIZ(Q9H q9h) {
        TopicExtraInfo topicExtraInfo = new TopicExtraInfo();
        topicExtraInfo.allRivalsAvatar = new ArrayList();
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
                                topicExtraInfo.allRivalsAvatar.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            topicExtraInfo.allRivals = q9h.LJIIJJI();
                        }
                    } else {
                        topicExtraInfo.endTimeSec = q9h.LJIIJJI();
                    }
                } else {
                    topicExtraInfo.startTimeSec = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return topicExtraInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopicExtraInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
