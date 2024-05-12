package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class BattleTruthOrDareTips extends F9E {

    @InterfaceC65349Pkn("gift_guide_key")
    public String giftGuideKey;

    @InterfaceC65349Pkn("tips")
    public List<TruthOrDareTip> truthOrDareTips;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.giftGuideKey, this.truthOrDareTips};
    }
}
