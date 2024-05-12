package com.bytedance.android.livesdk.model.message.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _TextPieceUser_ProtoDecoder implements InterfaceC31105CIr<TextPieceUser> {
    public static TextPieceUser LIZIZ(Q9H q9h) {
        TextPieceUser textPieceUser = new TextPieceUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        textPieceUser.withColon = Q9J.LIZ(q9h);
                    }
                } else {
                    textPieceUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return textPieceUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TextPieceUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
