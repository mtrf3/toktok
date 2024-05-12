package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BannerTip extends F9E implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("banner_txt")
    public String bannerTxt;

    @InterfaceC65349Pkn("banner_type")
    public int bannerType;

    @InterfaceC65349Pkn("link_txt")
    public String linkTxt;

    @InterfaceC65349Pkn("link_type")
    public int linkType;

    @InterfaceC65349Pkn("link_url")
    public String linkUrl;

    public BannerTip() {
    }

    public static /* synthetic */ BannerTip copy$default(BannerTip bannerTip, int i, String str, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bannerTip.bannerType;
        }
        if ((i3 & 2) != 0) {
            str = bannerTip.bannerTxt;
        }
        if ((i3 & 4) != 0) {
            i2 = bannerTip.linkType;
        }
        if ((i3 & 8) != 0) {
            str2 = bannerTip.linkUrl;
        }
        if ((i3 & 16) != 0) {
            str3 = bannerTip.linkTxt;
        }
        return bannerTip.copy(i, str, i2, str2, str3);
    }

    public final BannerTip copy(int i, String bannerTxt, int i2, String linkUrl, String linkTxt) {
        o.LJIIIZ(bannerTxt, "bannerTxt");
        o.LJIIIZ(linkUrl, "linkUrl");
        o.LJIIIZ(linkTxt, "linkTxt");
        return new BannerTip(i, bannerTxt, i2, linkUrl, linkTxt);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bannerType), this.bannerTxt, Integer.valueOf(this.linkType), this.linkUrl, this.linkTxt};
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getBannerTxt() {
        return this.bannerTxt;
    }

    public final int getBannerType() {
        return this.bannerType;
    }

    public final String getLinkTxt() {
        return this.linkTxt;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public BannerTip(int i, String str, int i2, String str2, String str3) {
        HH1.LIZ(str, "bannerTxt", str2, "linkUrl", str3, "linkTxt");
        this.bannerType = i;
        this.bannerTxt = str;
        this.linkType = i2;
        this.linkUrl = str2;
        this.linkTxt = str3;
    }

    public /* synthetic */ BannerTip(int i, String str, int i2, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, i2, (i3 & 8) != 0 ? "" : str2, (i3 & 16) == 0 ? str3 : "");
    }
}
