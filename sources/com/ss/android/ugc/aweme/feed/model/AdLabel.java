package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class AdLabel implements Serializable {

    @InterfaceC65349Pkn("ad_label_name")
    public String adLabelName;

    @InterfaceC65349Pkn("ad_label_position")
    public Integer adLabelPosition;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdLabel(adLabelName=");
        LIZ.append(this.adLabelName);
        LIZ.append(", adLabelPosition=");
        return s0.LIZJ(LIZ, this.adLabelPosition, ')', LIZ);
    }

    public final String getAdLabelName() {
        return this.adLabelName;
    }

    public final Integer getAdLabelPosition() {
        return this.adLabelPosition;
    }

    public final void setAdLabelName(String str) {
        this.adLabelName = str;
    }

    public final void setAdLabelPosition(Integer num) {
        this.adLabelPosition = num;
    }
}
