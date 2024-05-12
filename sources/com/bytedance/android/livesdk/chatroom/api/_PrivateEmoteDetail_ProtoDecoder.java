package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PrivateEmoteDetail_ProtoDecoder implements InterfaceC31105CIr<PrivateEmoteDetail> {
    public static PrivateEmoteDetail LIZIZ(Q9H q9h) {
        PrivateEmoteDetail privateEmoteDetail = new PrivateEmoteDetail();
        privateEmoteDetail.emoteList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    privateEmoteDetail.emoteList.add(_EmoteModel_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return privateEmoteDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PrivateEmoteDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
