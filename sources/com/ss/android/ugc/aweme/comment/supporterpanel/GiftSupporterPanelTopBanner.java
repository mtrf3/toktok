package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftSupporterPanelTopBanner {

    @InterfaceC65349Pkn("gift_and_senders")
    public final GiftAndSenders topGiftAndSenders;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftSupporterPanelTopBanner) && o.LJ(this.topGiftAndSenders, ((GiftSupporterPanelTopBanner) obj).topGiftAndSenders);
    }

    public final int hashCode() {
        GiftAndSenders giftAndSenders = this.topGiftAndSenders;
        if (giftAndSenders == null) {
            return 0;
        }
        return giftAndSenders.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftSupporterPanelTopBanner(topGiftAndSenders=");
        LIZ.append(this.topGiftAndSenders);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GiftSupporterPanelTopBanner(GiftAndSenders giftAndSenders) {
        this.topGiftAndSenders = giftAndSenders;
    }
}
