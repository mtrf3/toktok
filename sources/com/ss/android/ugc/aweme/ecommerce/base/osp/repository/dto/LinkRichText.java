package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C27155AlD;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LinkRichText implements Parcelable {
    public static final Parcelable.Creator<LinkRichText> CREATOR = new C27155AlD();

    @InterfaceC65349Pkn("arguments")
    public final HashMap<String, LinkText> arguments;

    @InterfaceC65349Pkn("dark_text_color")
    public final String darkTextColor;

    @InterfaceC65349Pkn("extra_info")
    public final RichTextExtraInfo extraInfo;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("prefix_icon")
    public final Icon prefixIcon;

    @InterfaceC65349Pkn("suffix_icon")
    public final Icon suffixIcon;

    @InterfaceC65349Pkn("template")
    public final String template;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkRichText)) {
            return false;
        }
        LinkRichText linkRichText = (LinkRichText) obj;
        return o.LJ(this.template, linkRichText.template) && o.LJ(this.arguments, linkRichText.arguments) && o.LJ(this.textColor, linkRichText.textColor) && o.LJ(this.darkTextColor, linkRichText.darkTextColor) && o.LJ(this.link, linkRichText.link) && o.LJ(this.prefixIcon, linkRichText.prefixIcon) && o.LJ(this.suffixIcon, linkRichText.suffixIcon) && o.LJ(this.extraInfo, linkRichText.extraInfo);
    }

    public final int hashCode() {
        String str = this.template;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap<String, LinkText> hashMap = this.arguments;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str2 = this.textColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkTextColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Icon icon = this.prefixIcon;
        int hashCode6 = (hashCode5 + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.suffixIcon;
        int hashCode7 = (hashCode6 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        RichTextExtraInfo richTextExtraInfo = this.extraInfo;
        return hashCode7 + (richTextExtraInfo != null ? richTextExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkRichText(template=");
        LIZ.append(this.template);
        LIZ.append(", arguments=");
        LIZ.append(this.arguments);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", darkTextColor=");
        LIZ.append(this.darkTextColor);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", prefixIcon=");
        LIZ.append(this.prefixIcon);
        LIZ.append(", suffixIcon=");
        LIZ.append(this.suffixIcon);
        LIZ.append(", extraInfo=");
        LIZ.append(this.extraInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.template);
        HashMap<String, LinkText> hashMap = this.arguments;
        if (hashMap == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(hashMap.size());
            for (Map.Entry<String, LinkText> entry : hashMap.entrySet()) {
                out.writeString(entry.getKey());
                LinkText value = entry.getValue();
                if (value == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    value.writeToParcel(out, i);
                }
            }
        }
        out.writeString(this.textColor);
        out.writeString(this.darkTextColor);
        out.writeString(this.link);
        Icon icon = this.prefixIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Icon icon2 = this.suffixIcon;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        RichTextExtraInfo richTextExtraInfo = this.extraInfo;
        if (richTextExtraInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            richTextExtraInfo.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            boolean r0 = X.AnonymousClass636.LJIILJJIL(r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r1.darkTextColor
            if (r0 == 0) goto L2b
            int r0 = X.C30591Hz.LJJIIJZLJL(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L17:
            if (r0 == 0) goto L2b
            int r0 = r0.intValue()
        L1d:
            return r0
        L1e:
            java.lang.String r0 = r1.textColor
            if (r0 == 0) goto L2b
            int r0 = X.C30591Hz.LJJIIJZLJL(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L2b:
            r0 = 2130968757(0x7f0400b5, float:1.7546177E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r2)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText.LIZ(android.content.Context):int");
    }

    public LinkRichText(String str, HashMap<String, LinkText> hashMap, String str2, String str3, String str4, Icon icon, Icon icon2, RichTextExtraInfo richTextExtraInfo) {
        this.template = str;
        this.arguments = hashMap;
        this.textColor = str2;
        this.darkTextColor = str3;
        this.link = str4;
        this.prefixIcon = icon;
        this.suffixIcon = icon2;
        this.extraInfo = richTextExtraInfo;
    }

    public /* synthetic */ LinkRichText(String str, HashMap hashMap, String str2, String str3, String str4, Icon icon, Icon icon2, RichTextExtraInfo richTextExtraInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : hashMap, str2, str3, str4, icon, icon2, richTextExtraInfo);
    }
}
