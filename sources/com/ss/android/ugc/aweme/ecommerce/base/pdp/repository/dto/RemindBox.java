package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69656RVk;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RemindBox implements Parcelable {
    public static final Parcelable.Creator<RemindBox> CREATOR = new C69656RVk();

    @InterfaceC65349Pkn("background")
    public final Icon background;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("highlight")
    public final String highlight;

    @InterfaceC65349Pkn("highlight_icon")
    public final Icon highlightIcon;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemindBox)) {
            return false;
        }
        RemindBox remindBox = (RemindBox) obj;
        return o.LJ(this.highlight, remindBox.highlight) && o.LJ(this.highlightIcon, remindBox.highlightIcon) && o.LJ(this.content, remindBox.content) && o.LJ(this.buttonText, remindBox.buttonText) && o.LJ(this.background, remindBox.background);
    }

    public final int hashCode() {
        String str = this.highlight;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.highlightIcon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.content;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon2 = this.background;
        return hashCode4 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemindBox(highlight=");
        LIZ.append(this.highlight);
        LIZ.append(", highlightIcon=");
        LIZ.append(this.highlightIcon);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", background=");
        LIZ.append(this.background);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.highlight);
        Icon icon = this.highlightIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.content);
        out.writeString(this.buttonText);
        Icon icon2 = this.background;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
    }

    public RemindBox(String str, Icon icon, String str2, String str3, Icon icon2) {
        this.highlight = str;
        this.highlightIcon = icon;
        this.content = str2;
        this.buttonText = str3;
        this.background = icon2;
    }
}
