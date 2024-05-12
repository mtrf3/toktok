package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _ProfileContent_ProtoDecoder implements InterfaceC31105CIr<ProfileContent> {
    public static ProfileContent LIZIZ(Q9H q9h) {
        ProfileContent profileContent = new ProfileContent();
        profileContent.iconList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            profileContent.numberConfig = _NumberConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        profileContent.iconList.add(_IconConfig_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    profileContent.useContent = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return profileContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProfileContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
