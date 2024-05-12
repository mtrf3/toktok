package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CpcPromptResponse_ProtoDecoder implements InterfaceC31105CIr<CpcPromptResponse> {
    @Override // X.InterfaceC31105CIr
    public final CpcPromptResponse LIZ(Q9H q9h) {
        CpcPromptResponse cpcPromptResponse = new CpcPromptResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        cpcPromptResponse.prompt = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        cpcPromptResponse.redirectLinkText = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        cpcPromptResponse.timeIntervalForDisplay = q9h.LJIIJJI();
                        break;
                    case 4:
                        cpcPromptResponse.timeIntervalForNextPrompt = q9h.LJIIJJI();
                        break;
                    case 5:
                        cpcPromptResponse.timeIntervalForNextRequest = q9h.LJIIJJI();
                        break;
                    case 6:
                        cpcPromptResponse.giftFaq = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return cpcPromptResponse;
            }
        }
    }
}
