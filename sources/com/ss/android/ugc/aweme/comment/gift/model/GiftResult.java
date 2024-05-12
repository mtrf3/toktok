package com.ss.android.ugc.aweme.comment.gift.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftResult {

    @InterfaceC65349Pkn("pages")
    public final List<GiftPage> giftPageList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftResult copy$default(GiftResult giftResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftResult.giftPageList;
        }
        return giftResult.copy(list);
    }

    public final GiftResult copy(List<GiftPage> list) {
        return new GiftResult(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftResult) && o.LJ(this.giftPageList, ((GiftResult) obj).giftPageList);
    }

    public int hashCode() {
        List<GiftPage> list = this.giftPageList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftResult(giftPageList=");
        return C1NE.LIZIZ(LIZ, this.giftPageList, ')', LIZ);
    }

    public final List<GiftPage> getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResult(List<GiftPage> list) {
        this.giftPageList = list;
    }
}
