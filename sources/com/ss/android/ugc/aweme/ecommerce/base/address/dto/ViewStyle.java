package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ViewStyle {

    @InterfaceC65349Pkn("view_item_highlight_mode")
    public final Integer viewItemHighlightMode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewStyle) && o.LJ(this.viewItemHighlightMode, ((ViewStyle) obj).viewItemHighlightMode);
    }

    public final int hashCode() {
        Integer num = this.viewItemHighlightMode;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewStyle(viewItemHighlightMode=");
        return s0.LIZJ(LIZ, this.viewItemHighlightMode, ')', LIZ);
    }

    public ViewStyle(Integer num) {
        this.viewItemHighlightMode = num;
    }
}
