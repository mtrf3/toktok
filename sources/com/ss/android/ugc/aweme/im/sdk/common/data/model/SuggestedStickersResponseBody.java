package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestedStickersResponseBody {

    @InterfaceC65349Pkn("expiry")
    public final Long expiry;

    @InterfaceC65349Pkn("stickers")
    public final List<SuggestedStickerStruct> stickers;

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestedStickersResponseBody() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedStickersResponseBody)) {
            return false;
        }
        SuggestedStickersResponseBody suggestedStickersResponseBody = (SuggestedStickersResponseBody) obj;
        return o.LJ(this.expiry, suggestedStickersResponseBody.expiry) && o.LJ(this.stickers, suggestedStickersResponseBody.stickers);
    }

    public final int hashCode() {
        Long l = this.expiry;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<SuggestedStickerStruct> list = this.stickers;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestedStickersResponseBody(expiry=");
        LIZ.append(this.expiry);
        LIZ.append(", stickers=");
        return C1NE.LIZIZ(LIZ, this.stickers, ')', LIZ);
    }

    public SuggestedStickersResponseBody(Long l, List<SuggestedStickerStruct> list) {
        this.expiry = l;
        this.stickers = list;
    }

    public /* synthetic */ SuggestedStickersResponseBody(Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list);
    }
}
