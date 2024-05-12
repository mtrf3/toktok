package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.AnonymousClass391;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftAndSenders {
    public String LIZ;

    @InterfaceC65349Pkn("gift")
    public final GiftPageItem gift;

    @InterfaceC65349Pkn("senders")
    public final List<GiftSender> giftSenders;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftAndSenders)) {
            return false;
        }
        GiftAndSenders giftAndSenders = (GiftAndSenders) obj;
        return o.LJ(this.gift, giftAndSenders.gift) && o.LJ(this.giftSenders, giftAndSenders.giftSenders) && o.LJ(this.LIZ, giftAndSenders.LIZ);
    }

    public final int hashCode() {
        int hashCode;
        GiftPageItem giftPageItem = this.gift;
        if (giftPageItem == null) {
            hashCode = 0;
        } else {
            hashCode = giftPageItem.hashCode();
        }
        return this.LIZ.hashCode() + AnonymousClass391.LIZIZ(this.giftSenders, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftAndSenders(gift=");
        LIZ.append(this.gift);
        LIZ.append(", giftSenders=");
        LIZ.append(this.giftSenders);
        LIZ.append(", selectedType=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public GiftAndSenders(GiftPageItem giftPageItem, List<GiftSender> giftSenders, String selectedType) {
        o.LJIIIZ(giftSenders, "giftSenders");
        o.LJIIIZ(selectedType, "selectedType");
        this.gift = giftPageItem;
        this.giftSenders = giftSenders;
        this.LIZ = selectedType;
    }

    public /* synthetic */ GiftAndSenders(GiftPageItem giftPageItem, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(giftPageItem, list, (i & 4) != 0 ? "" : str);
    }
}
