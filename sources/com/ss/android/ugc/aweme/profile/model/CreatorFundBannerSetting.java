package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorFundBannerSetting extends F9E implements Serializable {

    @InterfaceC65349Pkn("creator_fund_banner_version")
    public final int bannerVersion;

    @InterfaceC65349Pkn("creator_fund_banner_link_text")
    public final String creatorFundBannerLinkText;

    @InterfaceC65349Pkn("creator_fund_banner_title_text")
    public final String creatorFundBannerTitleText;

    /* JADX WARN: Multi-variable type inference failed */
    public CreatorFundBannerSetting() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreatorFundBannerSetting copy$default(CreatorFundBannerSetting creatorFundBannerSetting, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = creatorFundBannerSetting.bannerVersion;
        }
        if ((i2 & 2) != 0) {
            str = creatorFundBannerSetting.creatorFundBannerTitleText;
        }
        if ((i2 & 4) != 0) {
            str2 = creatorFundBannerSetting.creatorFundBannerLinkText;
        }
        return creatorFundBannerSetting.copy(i, str, str2);
    }

    public final CreatorFundBannerSetting copy(int i, String creatorFundBannerTitleText, String creatorFundBannerLinkText) {
        o.LJIIIZ(creatorFundBannerTitleText, "creatorFundBannerTitleText");
        o.LJIIIZ(creatorFundBannerLinkText, "creatorFundBannerLinkText");
        return new CreatorFundBannerSetting(i, creatorFundBannerTitleText, creatorFundBannerLinkText);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bannerVersion), this.creatorFundBannerTitleText, this.creatorFundBannerLinkText};
    }

    public final int getBannerVersion() {
        return this.bannerVersion;
    }

    public final String getCreatorFundBannerLinkText() {
        return this.creatorFundBannerLinkText;
    }

    public final String getCreatorFundBannerTitleText() {
        return this.creatorFundBannerTitleText;
    }

    public CreatorFundBannerSetting(int i, String creatorFundBannerTitleText, String creatorFundBannerLinkText) {
        o.LJIIIZ(creatorFundBannerTitleText, "creatorFundBannerTitleText");
        o.LJIIIZ(creatorFundBannerLinkText, "creatorFundBannerLinkText");
        this.bannerVersion = i;
        this.creatorFundBannerTitleText = creatorFundBannerTitleText;
        this.creatorFundBannerLinkText = creatorFundBannerLinkText;
    }

    public /* synthetic */ CreatorFundBannerSetting(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
