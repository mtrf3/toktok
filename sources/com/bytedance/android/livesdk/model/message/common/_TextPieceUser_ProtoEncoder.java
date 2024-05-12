package com.bytedance.android.livesdk.model.message.common;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoEncoder;

/* loaded from: classes6.dex */
public final class _TextPieceUser_ProtoEncoder implements InterfaceC64604PXc<TextPieceUser> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, TextPieceUser textPieceUser) {
        TextPieceUser textPieceUser2 = textPieceUser;
        User user = textPieceUser2.user;
        if (user != null) {
            cd6.LIZLLL(1, 2);
            cd6.LJ(_User_ProtoEncoder.LIZJ(user));
            _User_ProtoEncoder.LIZIZ(cd6, user);
        }
        boolean z = textPieceUser2.withColon;
        cd6.LIZLLL(2, 0);
        cd6.LJ(z ? 1 : 0);
    }
}
