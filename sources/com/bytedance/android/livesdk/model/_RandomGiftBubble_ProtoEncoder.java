package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes6.dex */
public final class _RandomGiftBubble_ProtoEncoder implements InterfaceC64604PXc<RandomGiftBubble> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, RandomGiftBubble randomGiftBubble) {
        RandomGiftBubble randomGiftBubble2 = randomGiftBubble;
        C30957CCz.LIZLLL(cd6, 1, randomGiftBubble2.bubbleDisplayText);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, randomGiftBubble2.image);
    }
}
