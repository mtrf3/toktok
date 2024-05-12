package com.ss.android.ugc.now.interaction.assem;

import X.C770830u;
import X.InterfaceC57784Mm4;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ViewerNoMoreLimitItem implements InterfaceC57784Mm4 {
    public final Aweme aweme;

    public static /* synthetic */ ViewerNoMoreLimitItem copy$default(ViewerNoMoreLimitItem viewerNoMoreLimitItem, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = viewerNoMoreLimitItem.aweme;
        }
        return viewerNoMoreLimitItem.copy(aweme);
    }

    public final ViewerNoMoreLimitItem copy(Aweme aweme) {
        return new ViewerNoMoreLimitItem(aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewerNoMoreLimitItem) && o.LJ(this.aweme, ((ViewerNoMoreLimitItem) obj).aweme);
    }

    public int hashCode() {
        Aweme aweme = this.aweme;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewerNoMoreLimitItem(aweme=");
        return C770830u.LIZ(LIZ, this.aweme, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public ViewerNoMoreLimitItem(Aweme aweme) {
        this.aweme = aweme;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }
}
