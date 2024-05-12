package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _QuickChatContent_ProtoDecoder implements InterfaceC31105CIr<QuickChatContent> {
    public static QuickChatContent LIZIZ(Q9H q9h) {
        QuickChatContent quickChatContent = new QuickChatContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                quickChatContent.emote = _EmoteModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            quickChatContent.textStarlingKey = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        quickChatContent.text = Q9J.LIZIZ(q9h);
                    }
                } else {
                    quickChatContent.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return quickChatContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QuickChatContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
