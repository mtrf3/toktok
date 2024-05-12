package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SlidePage {

    @InterfaceC65349Pkn("left")
    public final SlidePageItem left;

    @InterfaceC65349Pkn("right")
    public final SlidePageItem right;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlidePage)) {
            return false;
        }
        SlidePage slidePage = (SlidePage) obj;
        return o.LJ(this.left, slidePage.left) && o.LJ(this.right, slidePage.right);
    }

    public final int hashCode() {
        SlidePageItem slidePageItem = this.left;
        int hashCode = (slidePageItem == null ? 0 : slidePageItem.hashCode()) * 31;
        SlidePageItem slidePageItem2 = this.right;
        return hashCode + (slidePageItem2 != null ? slidePageItem2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlidePage(left=");
        LIZ.append(this.left);
        LIZ.append(", right=");
        LIZ.append(this.right);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SlidePage(SlidePageItem slidePageItem, SlidePageItem slidePageItem2) {
        this.left = slidePageItem;
        this.right = slidePageItem2;
    }
}
