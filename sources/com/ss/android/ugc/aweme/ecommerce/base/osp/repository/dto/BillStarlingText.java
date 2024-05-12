package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillStarlingText {

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color")
    public final Integer textColor;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillStarlingText)) {
            return false;
        }
        BillStarlingText billStarlingText = (BillStarlingText) obj;
        return o.LJ(this.key, billStarlingText.key) && o.LJ(this.text, billStarlingText.text) && o.LJ(this.textColor, billStarlingText.textColor);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.textColor;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillStarlingText(key=");
        LIZ.append(this.key);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", textColor=");
        return s0.LIZJ(LIZ, this.textColor, ')', LIZ);
    }

    public BillStarlingText(String str, String str2, Integer num) {
        this.key = str;
        this.text = str2;
        this.textColor = num;
    }
}
