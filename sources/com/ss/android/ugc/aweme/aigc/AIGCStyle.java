package com.ss.android.ugc.aweme.aigc;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AIGCStyle {

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("style_image")
    public final String styleImage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCStyle)) {
            return false;
        }
        AIGCStyle aIGCStyle = (AIGCStyle) obj;
        return o.LJ(this.name, aIGCStyle.name) && o.LJ(this.styleImage, aIGCStyle.styleImage) && o.LJ(this.displayName, aIGCStyle.displayName);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.styleImage, this.name.hashCode() * 31, 31);
        String str = this.displayName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIGCStyle(name=");
        LIZ.append(this.name);
        LIZ.append(", styleImage=");
        LIZ.append(this.styleImage);
        LIZ.append(", displayName=");
        return q.LIZIZ(LIZ, this.displayName, ')', LIZ);
    }

    public AIGCStyle(String name, String styleImage, String str) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(styleImage, "styleImage");
        this.name = name;
        this.styleImage = styleImage;
        this.displayName = str;
    }
}
