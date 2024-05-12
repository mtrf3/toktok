package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FeedRoomLabel_ProtoDecoder implements InterfaceC31105CIr<FeedRoomLabel> {
    public static FeedRoomLabel LIZIZ(Q9H q9h) {
        FeedRoomLabel feedRoomLabel = new FeedRoomLabel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        feedRoomLabel.location = q9h.LJIIJJI();
                        break;
                    case 2:
                        feedRoomLabel.text = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        feedRoomLabel.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        feedRoomLabel.logExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        feedRoomLabel.backgroundColor = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        feedRoomLabel.bgImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return feedRoomLabel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedRoomLabel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
