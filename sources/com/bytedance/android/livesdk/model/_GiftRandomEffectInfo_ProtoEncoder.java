package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes6.dex */
public final class _GiftRandomEffectInfo_ProtoEncoder implements InterfaceC64604PXc<GiftRandomEffectInfo> {
    public static int LIZJ(GiftRandomEffectInfo giftRandomEffectInfo) {
        int LIZ;
        RandomGiftPanelBanner randomGiftPanelBanner = giftRandomEffectInfo.randomGiftPanelBanner;
        int i = 0;
        if (randomGiftPanelBanner == null) {
            LIZ = 0;
        } else {
            int LIZJ = _RandomGiftPanelBanner_ProtoEncoder.LIZJ(randomGiftPanelBanner);
            LIZ = CD6.LIZ(1) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        List<Long> list = giftRandomEffectInfo.effectIds;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < giftRandomEffectInfo.effectIds.size(); i2++) {
                LIZ += C30957CCz.LJIIJ(2, (Long) ListProtector.get(giftRandomEffectInfo.effectIds, i2));
            }
        }
        int LJIIL = C30957CCz.LJIIL(4, giftRandomEffectInfo.audienceKey) + C30957CCz.LJIIL(3, giftRandomEffectInfo.hostKey) + LIZ;
        RandomGiftBubble randomGiftBubble = giftRandomEffectInfo.randomGiftBubble;
        if (randomGiftBubble != null) {
            int LJ = _ImageModel_ProtoEncoder.LJ(2, randomGiftBubble.image) + C30957CCz.LJIIL(1, randomGiftBubble.bubbleDisplayText);
            i = CD6.LIZ(5) + CD6.LIZIZ(LJ) + LJ;
        }
        return LJIIL + i;
    }

    public static void LIZIZ(CD6 cd6, GiftRandomEffectInfo giftRandomEffectInfo) {
        RandomGiftPanelBanner randomGiftPanelBanner = giftRandomEffectInfo.randomGiftPanelBanner;
        if (randomGiftPanelBanner != null) {
            cd6.LIZLLL(1, 2);
            cd6.LJ(_RandomGiftPanelBanner_ProtoEncoder.LIZJ(randomGiftPanelBanner));
            _RandomGiftPanelBanner_ProtoEncoder.LIZIZ(cd6, randomGiftPanelBanner);
        }
        List<Long> list = giftRandomEffectInfo.effectIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftRandomEffectInfo.effectIds.size(); i++) {
                C30957CCz.LIZJ(cd6, 2, (Long) ListProtector.get(giftRandomEffectInfo.effectIds, i));
            }
        }
        C30957CCz.LIZLLL(cd6, 3, giftRandomEffectInfo.hostKey);
        C30957CCz.LIZLLL(cd6, 4, giftRandomEffectInfo.audienceKey);
        RandomGiftBubble randomGiftBubble = giftRandomEffectInfo.randomGiftBubble;
        if (randomGiftBubble == null) {
            return;
        }
        cd6.LIZLLL(5, 2);
        cd6.LJ(_ImageModel_ProtoEncoder.LJ(2, randomGiftBubble.image) + C30957CCz.LJIIL(1, randomGiftBubble.bubbleDisplayText));
        C30957CCz.LIZLLL(cd6, 1, randomGiftBubble.bubbleDisplayText);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, randomGiftBubble.image);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, GiftRandomEffectInfo giftRandomEffectInfo) {
        LIZIZ(cd6, giftRandomEffectInfo);
    }
}
