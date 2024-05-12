package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C71605S8j;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateDecorationTitle implements Parcelable {
    public static final Parcelable.Creator<TemplateDecorationTitle> CREATOR = new C71605S8j();

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color")
    public final TemplateDecorationTitleColor textColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecorationTitle)) {
            return false;
        }
        TemplateDecorationTitle templateDecorationTitle = (TemplateDecorationTitle) obj;
        return o.LJ(this.text, templateDecorationTitle.text) && o.LJ(this.textColor, templateDecorationTitle.textColor);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TemplateDecorationTitleColor templateDecorationTitleColor = this.textColor;
        return hashCode + (templateDecorationTitleColor != null ? templateDecorationTitleColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateDecorationTitle(text=");
        LIZ.append(this.text);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        TemplateDecorationTitleColor templateDecorationTitleColor = this.textColor;
        if (templateDecorationTitleColor == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            templateDecorationTitleColor.writeToParcel(out, i);
        }
    }

    public TemplateDecorationTitle(String str, TemplateDecorationTitleColor templateDecorationTitleColor) {
        this.text = str;
        this.textColor = templateDecorationTitleColor;
    }
}
