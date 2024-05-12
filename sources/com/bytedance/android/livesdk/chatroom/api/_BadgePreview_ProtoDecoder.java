package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BadgePreview_ProtoDecoder implements InterfaceC31105CIr<BadgePreview> {
    public static BadgePreview LIZIZ(Q9H q9h) {
        BadgePreview badgePreview = new BadgePreview();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            badgePreview.badgeStruct = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        badgePreview.mixedImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    badgePreview.subLevel = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return badgePreview;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BadgePreview LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
