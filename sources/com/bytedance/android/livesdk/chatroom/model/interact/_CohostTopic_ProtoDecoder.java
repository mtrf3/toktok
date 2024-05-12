package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _CohostTopic_ProtoDecoder implements InterfaceC31105CIr<CohostTopic> {
    public static CohostTopic LIZIZ(Q9H q9h) {
        CohostTopic cohostTopic = new CohostTopic();
        cohostTopic.rivalsAvatar = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            switch (LJI) {
                                case 21:
                                    cohostTopic.liked = Q9J.LIZ(q9h);
                                    break;
                                case 22:
                                    cohostTopic.totalHeat = q9h.LJIIJJI();
                                    break;
                                case 23:
                                    cohostTopic.totalRivals = q9h.LJIIJJI();
                                    break;
                                case 24:
                                    cohostTopic.rivalsAvatar.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                        } else {
                            cohostTopic.titleText = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        cohostTopic.titleKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    cohostTopic.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostTopic;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostTopic LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
