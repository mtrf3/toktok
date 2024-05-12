package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes16.dex */
public final class _LinkmicAudienceEmoji_ProtoDecoder implements InterfaceC31105CIr<LinkmicAudienceEmoji> {
    @Override // X.InterfaceC31105CIr
    public final LinkmicAudienceEmoji LIZ(Q9H q9h) {
        LinkmicAudienceEmoji linkmicAudienceEmoji = new LinkmicAudienceEmoji();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkmicAudienceEmoji.emojiId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        linkmicAudienceEmoji.isRandom = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 3:
                        linkmicAudienceEmoji.emojiImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkmicAudienceEmoji.emojiDynamicImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        linkmicAudienceEmoji.emojiName = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkmicAudienceEmoji.animationDurationMs = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        linkmicAudienceEmoji.emojiResultDurationMs = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicAudienceEmoji;
            }
        }
    }
}
