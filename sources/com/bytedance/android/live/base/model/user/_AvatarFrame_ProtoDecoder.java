package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _AvatarFrame_ProtoDecoder implements InterfaceC31105CIr<AvatarFrame> {
    public static AvatarFrame LIZIZ(Q9H q9h) {
        AvatarFrame avatarFrame = new AvatarFrame();
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
                                    avatarFrame.avatarBackgroundBorderColor = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                avatarFrame.avatarBackgroundColor = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            avatarFrame.personalCardV2 = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        avatarFrame.personalCardV1 = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    avatarFrame.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return avatarFrame;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AvatarFrame LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
