package com.bytedance.android.livesdk.livesetting.other.subscribe;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SubscriptionConfig {

    @InterfaceC65349Pkn("subscription_community_enable")
    public int communityEnable;

    @InterfaceC65349Pkn("live_sub_emote_enable_edit")
    public int emoteEditEnable;

    @InterfaceC65349Pkn("live_sub_emote_enable_preview")
    public int emotePreviewEnable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SubscriptionConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionConfig.<init>():void");
    }

    public SubscriptionConfig(int i, int i2, int i3) {
        this.communityEnable = i;
        this.emoteEditEnable = i2;
        this.emotePreviewEnable = i3;
    }

    public /* synthetic */ SubscriptionConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
