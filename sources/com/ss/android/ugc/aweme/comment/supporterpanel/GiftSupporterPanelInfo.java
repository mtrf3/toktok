package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftSupporterPanelInfo {

    @InterfaceC65349Pkn("gift_and_senders")
    public final List<GiftAndSenders> otherGifts;

    @InterfaceC65349Pkn("top_banner")
    public final GiftSupporterPanelTopBanner topBanner;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftSupporterPanelInfo)) {
            return false;
        }
        GiftSupporterPanelInfo giftSupporterPanelInfo = (GiftSupporterPanelInfo) obj;
        return o.LJ(this.topBanner, giftSupporterPanelInfo.topBanner) && o.LJ(this.otherGifts, giftSupporterPanelInfo.otherGifts);
    }

    public final int hashCode() {
        GiftSupporterPanelTopBanner giftSupporterPanelTopBanner = this.topBanner;
        return this.otherGifts.hashCode() + ((giftSupporterPanelTopBanner == null ? 0 : giftSupporterPanelTopBanner.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftSupporterPanelInfo(topBanner=");
        LIZ.append(this.topBanner);
        LIZ.append(", otherGifts=");
        return C1NE.LIZIZ(LIZ, this.otherGifts, ')', LIZ);
    }

    public GiftSupporterPanelInfo(GiftSupporterPanelTopBanner giftSupporterPanelTopBanner, List<GiftAndSenders> otherGifts) {
        o.LJIIIZ(otherGifts, "otherGifts");
        this.topBanner = giftSupporterPanelTopBanner;
        this.otherGifts = otherGifts;
    }
}
