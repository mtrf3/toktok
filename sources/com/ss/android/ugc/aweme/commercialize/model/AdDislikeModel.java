package com.ss.android.ugc.aweme.commercialize.model;

import X.C40084FoG;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class AdDislikeModel implements Serializable {

    @InterfaceC65349Pkn("dislike_url")
    public String adxUrl;

    @InterfaceC65349Pkn("label_clickable")
    public boolean labelClickable;

    @InterfaceC65349Pkn("name")
    public String name;

    public final String getAdxUrl() {
        return this.adxUrl;
    }

    public final boolean getLabelClickable() {
        return this.labelClickable;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDislikeUrl(int i) {
        if (!TextUtils.isEmpty(this.adxUrl)) {
            StringBuilder LIZ = X1D.LIZ();
            return C40084FoG.LIZ(LIZ, this.adxUrl, "&is_long_press=", i, LIZ);
        }
        return null;
    }

    public final void setAdxUrl(String str) {
        this.adxUrl = str;
    }

    public final void setLabelClickable(boolean z) {
        this.labelClickable = z;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
