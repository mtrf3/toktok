package com.ss.android.ugc.aweme.sticker.image;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class TemplateCover {

    @InterfaceC65349Pkn("height")
    public final Integer height;

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
    public final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateCover() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public TemplateCover(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2) {
        this.large = str;
        this.medium = str2;
        this.small = str3;
        this.pngLarge = str4;
        this.pngMedium = str5;
        this.pngSmall = str6;
        this.url = str7;
        this.height = num;
        this.width = num2;
    }

    public /* synthetic */ TemplateCover(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) == 0 ? num2 : null);
    }
}
