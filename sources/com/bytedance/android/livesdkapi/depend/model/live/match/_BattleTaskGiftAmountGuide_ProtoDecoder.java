package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BattleTaskGiftAmountGuide_ProtoDecoder implements InterfaceC31105CIr<BattleTaskGiftAmountGuide> {
    public static BattleTaskGiftAmountGuide LIZIZ(Q9H q9h) {
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide = new BattleTaskGiftAmountGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 11) {
                                if (LJI != 12) {
                                    switch (LJI) {
                                        case 21:
                                            battleTaskGiftAmountGuide.recommendGiftId = q9h.LJIIJJI();
                                            break;
                                        case 22:
                                            battleTaskGiftAmountGuide.recommendGiftCount = q9h.LJIIJ();
                                            break;
                                        case 23:
                                            battleTaskGiftAmountGuide.guideContent = _Text_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    battleTaskGiftAmountGuide.giftImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                battleTaskGiftAmountGuide.iconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            battleTaskGiftAmountGuide.disappearDuration = q9h.LJIIJ();
                        }
                    } else {
                        battleTaskGiftAmountGuide.promptType = q9h.LJIIJ();
                    }
                } else {
                    battleTaskGiftAmountGuide.guidePrompt = _BattlePrompt_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleTaskGiftAmountGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleTaskGiftAmountGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
