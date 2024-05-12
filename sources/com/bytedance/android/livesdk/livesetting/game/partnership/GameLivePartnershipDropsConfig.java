package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GameLivePartnershipDropsConfig {

    @InterfaceC65349Pkn("drops_card")
    public String dropsCard;

    @InterfaceC65349Pkn("drops_preview_show_cnt")
    public int dropsPreviewShowCnt;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("enable_permanent_drops_share_item")
    public boolean enablePermanentDropsShareItem;

    @InterfaceC65349Pkn("preview_card")
    public String previewCard;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GameLivePartnershipDropsConfig() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r1
            r5 = r1
            r7 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsConfig.<init>():void");
    }

    public GameLivePartnershipDropsConfig(boolean z, String dropsCard, String previewCard, int i, boolean z2) {
        o.LJIIIZ(dropsCard, "dropsCard");
        o.LJIIIZ(previewCard, "previewCard");
        this.enable = z;
        this.dropsCard = dropsCard;
        this.previewCard = previewCard;
        this.dropsPreviewShowCnt = i;
        this.enablePermanentDropsShareItem = z2;
    }

    public /* synthetic */ GameLivePartnershipDropsConfig(boolean z, String str, String str2, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? true : z2);
    }
}
