package com.ss.android.ugc.aweme.prop.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PreLoadBonusH5BannerData extends F9E {

    @InterfaceC65349Pkn("banner_icon")
    public final String bannerIcon;

    @InterfaceC65349Pkn("cross_icon")
    public final String crossIcon;

    @InterfaceC65349Pkn("larger_banner_background_image_url")
    public final String largeBannerBackgroundImageUrl;

    @InterfaceC65349Pkn("large_icon_heigth")
    public final String largeIconHeight;

    @InterfaceC65349Pkn("large_icon_width")
    public final String largeIconWidth;

    @InterfaceC65349Pkn("long_starling_text_key")
    public final String longStarlingTextKey;

    @InterfaceC65349Pkn("middle_banner_background_image_url")
    public final String middleBannerBackgroundImageUrl;

    @InterfaceC65349Pkn("middle_icon_heigth")
    public final String middleIconHeight;

    @InterfaceC65349Pkn("middle_icon_width")
    public final String middleIconWidth;

    @InterfaceC65349Pkn("promo_url")
    public final String promoUrl;

    @InterfaceC65349Pkn("middle_starling_text_key")
    public final String shortStarlingTextKey;

    @InterfaceC65349Pkn("large_icon")
    public final boolean showLargeIcon;

    @InterfaceC65349Pkn("middle_icon")
    public final boolean showMiddleIcon;

    @InterfaceC65349Pkn("small_banner_background_image_url")
    public final String smallBannerBackgroundImageUrl;

    @InterfaceC65349Pkn("space_between_text_icon")
    public final String spaceBetweenTextIcon;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    @InterfaceC65349Pkn("text_size")
    public final String textSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreLoadBonusH5BannerData() {
        /*
            r20 = this;
            r1 = 0
            r9 = 0
            r18 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r20
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r10 = r1
            r11 = r1
            r12 = r9
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r19 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.experiment.PreLoadBonusH5BannerData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.promoUrl, this.largeBannerBackgroundImageUrl, this.middleBannerBackgroundImageUrl, this.smallBannerBackgroundImageUrl, this.bannerIcon, this.crossIcon, this.shortStarlingTextKey, this.longStarlingTextKey, Boolean.valueOf(this.showLargeIcon), this.largeIconWidth, this.largeIconHeight, Boolean.valueOf(this.showMiddleIcon), this.middleIconWidth, this.middleIconHeight, this.spaceBetweenTextIcon, this.textSize, this.textColor};
    }

    public PreLoadBonusH5BannerData(String promoUrl, String largeBannerBackgroundImageUrl, String middleBannerBackgroundImageUrl, String smallBannerBackgroundImageUrl, String bannerIcon, String crossIcon, String shortStarlingTextKey, String longStarlingTextKey, boolean z, String largeIconWidth, String largeIconHeight, boolean z2, String middleIconWidth, String middleIconHeight, String spaceBetweenTextIcon, String textSize, String textColor) {
        o.LJIIIZ(promoUrl, "promoUrl");
        o.LJIIIZ(largeBannerBackgroundImageUrl, "largeBannerBackgroundImageUrl");
        o.LJIIIZ(middleBannerBackgroundImageUrl, "middleBannerBackgroundImageUrl");
        o.LJIIIZ(smallBannerBackgroundImageUrl, "smallBannerBackgroundImageUrl");
        o.LJIIIZ(bannerIcon, "bannerIcon");
        o.LJIIIZ(crossIcon, "crossIcon");
        o.LJIIIZ(shortStarlingTextKey, "shortStarlingTextKey");
        o.LJIIIZ(longStarlingTextKey, "longStarlingTextKey");
        o.LJIIIZ(largeIconWidth, "largeIconWidth");
        o.LJIIIZ(largeIconHeight, "largeIconHeight");
        o.LJIIIZ(middleIconWidth, "middleIconWidth");
        o.LJIIIZ(middleIconHeight, "middleIconHeight");
        o.LJIIIZ(spaceBetweenTextIcon, "spaceBetweenTextIcon");
        o.LJIIIZ(textSize, "textSize");
        o.LJIIIZ(textColor, "textColor");
        this.promoUrl = promoUrl;
        this.largeBannerBackgroundImageUrl = largeBannerBackgroundImageUrl;
        this.middleBannerBackgroundImageUrl = middleBannerBackgroundImageUrl;
        this.smallBannerBackgroundImageUrl = smallBannerBackgroundImageUrl;
        this.bannerIcon = bannerIcon;
        this.crossIcon = crossIcon;
        this.shortStarlingTextKey = shortStarlingTextKey;
        this.longStarlingTextKey = longStarlingTextKey;
        this.showLargeIcon = z;
        this.largeIconWidth = largeIconWidth;
        this.largeIconHeight = largeIconHeight;
        this.showMiddleIcon = z2;
        this.middleIconWidth = middleIconWidth;
        this.middleIconHeight = middleIconHeight;
        this.spaceBetweenTextIcon = spaceBetweenTextIcon;
        this.textSize = textSize;
        this.textColor = textColor;
    }

    public /* synthetic */ PreLoadBonusH5BannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? true : z, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) == 0 ? z2 : true, (i & 4096) != 0 ? "" : str11, (i & FileUtils.BUFFER_SIZE) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (32768 & i) != 0 ? "" : str14, (i & 65536) == 0 ? str15 : "");
    }
}
