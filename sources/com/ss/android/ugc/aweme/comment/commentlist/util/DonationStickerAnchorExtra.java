package com.ss.android.ugc.aweme.comment.commentlist.util;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DonationStickerAnchorExtra implements Serializable {

    @InterfaceC65349Pkn("icon_url_list")
    public final List<UrlModel> iconUrlList;

    /* JADX WARN: Multi-variable type inference failed */
    public DonationStickerAnchorExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DonationStickerAnchorExtra copy$default(DonationStickerAnchorExtra donationStickerAnchorExtra, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = donationStickerAnchorExtra.iconUrlList;
        }
        return donationStickerAnchorExtra.copy(list);
    }

    public final DonationStickerAnchorExtra copy(List<? extends UrlModel> list) {
        return new DonationStickerAnchorExtra(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonationStickerAnchorExtra) && o.LJ(this.iconUrlList, ((DonationStickerAnchorExtra) obj).iconUrlList);
    }

    public int hashCode() {
        List<UrlModel> list = this.iconUrlList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DonationStickerAnchorExtra(iconUrlList=");
        return C1NE.LIZIZ(LIZ, this.iconUrlList, ')', LIZ);
    }

    public final List<UrlModel> getIconUrlList() {
        return this.iconUrlList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DonationStickerAnchorExtra(List<? extends UrlModel> list) {
        this.iconUrlList = list;
    }

    public /* synthetic */ DonationStickerAnchorExtra(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
