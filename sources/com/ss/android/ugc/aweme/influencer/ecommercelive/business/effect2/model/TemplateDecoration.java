package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C1FJ;
import X.C71604S8i;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateDecoration implements Parcelable {
    public static final Parcelable.Creator<TemplateDecoration> CREATOR = new C71604S8i();

    @InterfaceC65349Pkn("bg_image")
    public final String bgImage;

    @InterfaceC65349Pkn("bg_image_dark")
    public final String bgImageDark;

    @InterfaceC65349Pkn("bg_image_9_patch")
    public final String bgImageNinePatch;

    @InterfaceC65349Pkn("bg_image_dark_9_patch")
    public final String bgImageNinePatchDark;

    @InterfaceC65349Pkn("title")
    public final TemplateDecorationTitle decorationTitle;

    @InterfaceC65349Pkn("decoration_type")
    public final Integer decorationType;

    @InterfaceC65349Pkn("position")
    public final TemplateDecorationPosition position;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecoration)) {
            return false;
        }
        TemplateDecoration templateDecoration = (TemplateDecoration) obj;
        return o.LJ(this.decorationType, templateDecoration.decorationType) && o.LJ(this.decorationTitle, templateDecoration.decorationTitle) && o.LJ(this.bgImage, templateDecoration.bgImage) && o.LJ(this.bgImageDark, templateDecoration.bgImageDark) && o.LJ(this.bgImageNinePatch, templateDecoration.bgImageNinePatch) && o.LJ(this.bgImageNinePatchDark, templateDecoration.bgImageNinePatchDark) && o.LJ(this.position, templateDecoration.position);
    }

    public final int hashCode() {
        Integer num = this.decorationType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        TemplateDecorationTitle templateDecorationTitle = this.decorationTitle;
        int hashCode2 = (hashCode + (templateDecorationTitle == null ? 0 : templateDecorationTitle.hashCode())) * 31;
        String str = this.bgImage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgImageDark;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgImageNinePatch;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bgImageNinePatchDark;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TemplateDecorationPosition templateDecorationPosition = this.position;
        return hashCode6 + (templateDecorationPosition != null ? templateDecorationPosition.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateDecoration(decorationType=");
        LIZ.append(this.decorationType);
        LIZ.append(", decorationTitle=");
        LIZ.append(this.decorationTitle);
        LIZ.append(", bgImage=");
        LIZ.append(this.bgImage);
        LIZ.append(", bgImageDark=");
        LIZ.append(this.bgImageDark);
        LIZ.append(", bgImageNinePatch=");
        LIZ.append(this.bgImageNinePatch);
        LIZ.append(", bgImageNinePatchDark=");
        LIZ.append(this.bgImageNinePatchDark);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.decorationType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        TemplateDecorationTitle templateDecorationTitle = this.decorationTitle;
        if (templateDecorationTitle == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            templateDecorationTitle.writeToParcel(out, i);
        }
        out.writeString(this.bgImage);
        out.writeString(this.bgImageDark);
        out.writeString(this.bgImageNinePatch);
        out.writeString(this.bgImageNinePatchDark);
        TemplateDecorationPosition templateDecorationPosition = this.position;
        if (templateDecorationPosition == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            templateDecorationPosition.writeToParcel(out, i);
        }
    }

    public TemplateDecoration(Integer num, TemplateDecorationTitle templateDecorationTitle, String str, String str2, String str3, String str4, TemplateDecorationPosition templateDecorationPosition) {
        this.decorationType = num;
        this.decorationTitle = templateDecorationTitle;
        this.bgImage = str;
        this.bgImageDark = str2;
        this.bgImageNinePatch = str3;
        this.bgImageNinePatchDark = str4;
        this.position = templateDecorationPosition;
    }
}
