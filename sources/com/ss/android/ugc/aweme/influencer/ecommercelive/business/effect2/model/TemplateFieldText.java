package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.S8E;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateFieldText implements Parcelable {
    public static final Parcelable.Creator<TemplateFieldText> CREATOR = new S8E();

    @InterfaceC65349Pkn("item_color")
    public final String color;

    @InterfaceC65349Pkn("item_content")
    public final String content;

    @InterfaceC65349Pkn("default_content")
    public final String defaultContent;

    @InterfaceC65349Pkn("item_limit")
    public final int limit;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.content);
        out.writeInt(this.limit);
        out.writeString(this.color);
        out.writeString(this.defaultContent);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.content;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.color, ((hashCode * 31) + this.limit) * 31, 31);
        String str2 = this.defaultContent;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateFieldText(content=");
        LIZ.append(this.content);
        LIZ.append(", limit=");
        LIZ.append(this.limit);
        LIZ.append(", color=");
        LIZ.append(this.color);
        LIZ.append(", defaultContent=");
        return q.LIZIZ(LIZ, this.defaultContent, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TemplateFieldText) || !ujb.o.LJJJJIZL(this.content, ((TemplateFieldText) obj).content, false)) {
            return false;
        }
        return true;
    }

    public TemplateFieldText(String str, int i, String color, String str2) {
        o.LJIIIZ(color, "color");
        this.content = str;
        this.limit = i;
        this.color = color;
        this.defaultContent = str2;
    }
}
