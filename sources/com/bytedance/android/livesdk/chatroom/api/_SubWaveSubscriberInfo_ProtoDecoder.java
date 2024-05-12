package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _SubWaveSubscriberInfo_ProtoDecoder implements InterfaceC31105CIr<SubWaveSubscriberInfo> {
    public static SubWaveSubscriberInfo LIZIZ(Q9H q9h) {
        SubWaveSubscriberInfo subWaveSubscriberInfo = new SubWaveSubscriberInfo();
        subWaveSubscriberInfo.badgeList = new ArrayList();
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
                                    subWaveSubscriberInfo.badgeList.add(_BadgeStruct_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                subWaveSubscriberInfo.userIdStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            subWaveSubscriberInfo.displayId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subWaveSubscriberInfo.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subWaveSubscriberInfo.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subWaveSubscriberInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubWaveSubscriberInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
