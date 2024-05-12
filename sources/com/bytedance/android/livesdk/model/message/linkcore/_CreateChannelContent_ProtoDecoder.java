package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CreateChannelContent_ProtoDecoder implements InterfaceC31105CIr<CreateChannelContent> {
    public static CreateChannelContent LIZIZ(Q9H q9h) {
        CreateChannelContent createChannelContent = new CreateChannelContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        createChannelContent.ownerLinkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    createChannelContent.owner = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createChannelContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreateChannelContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
