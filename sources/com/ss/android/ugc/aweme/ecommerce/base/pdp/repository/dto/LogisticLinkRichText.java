package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27118Akc;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticLinkRichText implements Parcelable {
    public static final Parcelable.Creator<LogisticLinkRichText> CREATOR = new C27118Akc();

    @InterfaceC65349Pkn("arguments")
    public final Map<String, LogisticLinkText> arguments;

    @InterfaceC65349Pkn("template")
    public final String template;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @InterfaceC65349Pkn("text_color_type")
    public final Integer textColorType;

    @InterfaceC65349Pkn("text_dark_color")
    public final String textDarkColor;

    @InterfaceC65349Pkn("text_font_type")
    public final Integer textFontType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticLinkRichText)) {
            return false;
        }
        LogisticLinkRichText logisticLinkRichText = (LogisticLinkRichText) obj;
        return o.LJ(this.template, logisticLinkRichText.template) && o.LJ(this.arguments, logisticLinkRichText.arguments) && o.LJ(this.textColor, logisticLinkRichText.textColor) && o.LJ(this.textDarkColor, logisticLinkRichText.textDarkColor) && o.LJ(this.textColorType, logisticLinkRichText.textColorType) && o.LJ(this.textFontType, logisticLinkRichText.textFontType);
    }

    public final int hashCode() {
        String str = this.template;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, LogisticLinkText> map = this.arguments;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textDarkColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.textColorType;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textFontType;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticLinkRichText(template=");
        LIZ.append(this.template);
        LIZ.append(", arguments=");
        LIZ.append(this.arguments);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", textDarkColor=");
        LIZ.append(this.textDarkColor);
        LIZ.append(", textColorType=");
        LIZ.append(this.textColorType);
        LIZ.append(", textFontType=");
        return s0.LIZJ(LIZ, this.textFontType, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.template);
        Map<String, LogisticLinkText> map = this.arguments;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, LogisticLinkText> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                entry.getValue().writeToParcel(out, i);
            }
        }
        out.writeString(this.textColor);
        out.writeString(this.textDarkColor);
        Integer num = this.textColorType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.textFontType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public LogisticLinkRichText(String str, Map<String, LogisticLinkText> map, String str2, String str3, Integer num, Integer num2) {
        this.template = str;
        this.arguments = map;
        this.textColor = str2;
        this.textDarkColor = str3;
        this.textColorType = num;
        this.textFontType = num2;
    }
}
