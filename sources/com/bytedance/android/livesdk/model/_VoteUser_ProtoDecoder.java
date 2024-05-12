package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _VoteUser_ProtoDecoder implements InterfaceC31105CIr<VoteUser> {
    public static VoteUser LIZIZ(Q9H q9h) {
        VoteUser voteUser = new VoteUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            voteUser.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        voteUser.nickName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    voteUser.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return voteUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VoteUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
