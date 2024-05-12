package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GiftRandomEffectInfo extends F9E {

    @InterfaceC65349Pkn("audience_key")
    public String audienceKey;

    @InterfaceC65349Pkn("effect_ids")
    public List<Long> effectIds;

    @InterfaceC65349Pkn("host_key")
    public String hostKey;

    @InterfaceC65349Pkn("random_gift_bubble")
    public RandomGiftBubble randomGiftBubble;

    @InterfaceC65349Pkn("random_gift_panel_banner")
    public RandomGiftPanelBanner randomGiftPanelBanner;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftRandomEffectInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.effectIds, this.randomGiftPanelBanner, this.randomGiftBubble, this.hostKey, this.audienceKey};
    }

    public GiftRandomEffectInfo(List<Long> list, RandomGiftPanelBanner randomGiftPanelBanner, RandomGiftBubble randomGiftBubble, String str, String str2) {
        this.effectIds = list;
        this.randomGiftPanelBanner = randomGiftPanelBanner;
        this.randomGiftBubble = randomGiftBubble;
        this.hostKey = str;
        this.audienceKey = str2;
    }

    public /* synthetic */ GiftRandomEffectInfo(List list, RandomGiftPanelBanner randomGiftPanelBanner, RandomGiftBubble randomGiftBubble, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : randomGiftPanelBanner, (i & 4) != 0 ? null : randomGiftBubble, (i & 8) != 0 ? null : str, (i & 16) == 0 ? str2 : null);
    }
}
