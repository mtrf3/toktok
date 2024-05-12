package com.ss.android.ugc.aweme.aigc;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ResponseAIGCStyle {

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    @InterfaceC65349Pkn("style_image")
    public final String styleImage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAIGCStyle)) {
            return false;
        }
        ResponseAIGCStyle responseAIGCStyle = (ResponseAIGCStyle) obj;
        return this.status_code == responseAIGCStyle.status_code && o.LJ(this.status_msg, responseAIGCStyle.status_msg) && o.LJ(this.name, responseAIGCStyle.name) && o.LJ(this.styleImage, responseAIGCStyle.styleImage) && o.LJ(this.displayName, responseAIGCStyle.displayName);
    }

    public final int hashCode() {
        int hashCode;
        int i = this.status_code * 31;
        String str = this.status_msg;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.displayName.hashCode() + C79062V1e.LJ(this.styleImage, C79062V1e.LJ(this.name, (i + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseAIGCStyle(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", styleImage=");
        LIZ.append(this.styleImage);
        LIZ.append(", displayName=");
        return q.LIZIZ(LIZ, this.displayName, ')', LIZ);
    }

    public ResponseAIGCStyle(int i, String str, String str2, String str3, String str4) {
        HH1.LIZ(str2, "name", str3, "styleImage", str4, "displayName");
        this.status_code = i;
        this.status_msg = str;
        this.name = str2;
        this.styleImage = str3;
        this.displayName = str4;
    }

    public /* synthetic */ ResponseAIGCStyle(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, str2, str3, str4);
    }
}
