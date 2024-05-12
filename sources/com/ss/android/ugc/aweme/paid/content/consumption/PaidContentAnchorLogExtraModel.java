package com.ss.android.ugc.aweme.paid.content.consumption;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidContentAnchorLogExtraModel {

    @InterfaceC65349Pkn("collection_id")
    public Long collectionID;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidContentAnchorLogExtraModel) && o.LJ(this.collectionID, ((PaidContentAnchorLogExtraModel) obj).collectionID);
    }

    public final int hashCode() {
        Long l = this.collectionID;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentAnchorLogExtraModel(collectionID=");
        return JBR.LJ(LIZ, this.collectionID, ')', LIZ);
    }

    public PaidContentAnchorLogExtraModel(Long l) {
        this.collectionID = l;
    }
}
