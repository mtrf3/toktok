package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShareUrlExtra {

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("link_id")
    public String linkId;

    @InterfaceC65349Pkn("from_uid")
    public String shareUserId;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareUrlExtra() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareUrlExtra copy$default(ShareUrlExtra shareUrlExtra, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareUrlExtra.itemId;
        }
        if ((i & 2) != 0) {
            str2 = shareUrlExtra.linkId;
        }
        if ((i & 4) != 0) {
            str3 = shareUrlExtra.shareUserId;
        }
        return shareUrlExtra.copy(str, str2, str3);
    }

    public final ShareUrlExtra copy(String str, String str2, String str3) {
        return new ShareUrlExtra(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareUrlExtra)) {
            return false;
        }
        ShareUrlExtra shareUrlExtra = (ShareUrlExtra) obj;
        return o.LJ(this.itemId, shareUrlExtra.itemId) && o.LJ(this.linkId, shareUrlExtra.linkId) && o.LJ(this.shareUserId, shareUrlExtra.shareUserId);
    }

    public int hashCode() {
        String str = this.itemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shareUserId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareUrlExtra(itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", linkId=");
        LIZ.append(this.linkId);
        LIZ.append(", shareUserId=");
        return q.LIZIZ(LIZ, this.shareUserId, ')', LIZ);
    }

    public ShareUrlExtra(String str, String str2, String str3) {
        this.itemId = str;
        this.linkId = str2;
        this.shareUserId = str3;
    }

    public /* synthetic */ ShareUrlExtra(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
