package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SpotlightItem_ProtoDecoder implements InterfaceC31105CIr<SpotlightItem> {
    public static SpotlightItem LIZIZ(Q9H q9h) {
        SpotlightItem spotlightItem = new SpotlightItem();
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
                                    spotlightItem.createTimeSecond = q9h.LJIIJJI();
                                }
                            } else {
                                spotlightItem.isPinned = Q9J.LIZ(q9h);
                            }
                        } else {
                            spotlightItem.reviewStatus = q9h.LJIIJ();
                        }
                    } else {
                        spotlightItem.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    spotlightItem.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SpotlightItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
