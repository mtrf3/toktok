package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TemplateCover {

    @InterfaceC65349Pkn("height")
    public final String height;

    @InterfaceC65349Pkn("large")
    public final String large;

    @InterfaceC65349Pkn("medium")
    public final String medium;

    @InterfaceC65349Pkn("png_large")
    public final String pngLarge;

    @InterfaceC65349Pkn("png_medium")
    public final String pngMedium;

    @InterfaceC65349Pkn("png_small")
    public final String pngSmall;

    @InterfaceC65349Pkn("small")
    public final String small;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("width")
    public final String width;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateCover() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateCover)) {
            return false;
        }
        TemplateCover templateCover = (TemplateCover) obj;
        return o.LJ(this.large, templateCover.large) && o.LJ(this.medium, templateCover.medium) && o.LJ(this.small, templateCover.small) && o.LJ(this.pngLarge, templateCover.pngLarge) && o.LJ(this.pngMedium, templateCover.pngMedium) && o.LJ(this.pngSmall, templateCover.pngSmall) && o.LJ(this.url, templateCover.url) && o.LJ(this.width, templateCover.width) && o.LJ(this.height, templateCover.height);
    }

    public final int hashCode() {
        String str = this.large;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.medium;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.small;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pngLarge;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pngMedium;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pngSmall;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.url;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.width;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.height;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateCover(large=");
        LIZ.append(this.large);
        LIZ.append(", medium=");
        LIZ.append(this.medium);
        LIZ.append(", small=");
        LIZ.append(this.small);
        LIZ.append(", pngLarge=");
        LIZ.append(this.pngLarge);
        LIZ.append(", pngMedium=");
        LIZ.append(this.pngMedium);
        LIZ.append(", pngSmall=");
        LIZ.append(this.pngSmall);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return q.LIZIZ(LIZ, this.height, ')', LIZ);
    }

    public TemplateCover(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.large = str;
        this.medium = str2;
        this.small = str3;
        this.pngLarge = str4;
        this.pngMedium = str5;
        this.pngSmall = str6;
        this.url = str7;
        this.width = str8;
        this.height = str9;
    }

    public /* synthetic */ TemplateCover(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
