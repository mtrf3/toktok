package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import X.UPJ;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NativeSiteConfig implements Serializable {

    @InterfaceC65349Pkn("android_page_data_hash")
    public final String androidPageDataHash;

    @InterfaceC65349Pkn("animation_type")
    public final String animationType;

    @InterfaceC65349Pkn("flutter_version")
    public final int flutterVersion;

    @InterfaceC65349Pkn("gecko_channel")
    public final List<String> geckoChannel;

    @InterfaceC65349Pkn("is_support_native_animation")
    public final boolean isSupportNativeAnimation;

    @InterfaceC65349Pkn("lynx_landing_style")
    public final int lynxLandingStyle;

    @InterfaceC65349Pkn("lynx_scheme")
    public final String lynxScheme;

    @InterfaceC65349Pkn("page_data_backup_url")
    public final String pageDataBackupUrl;

    @InterfaceC65349Pkn("page_data_url")
    public final String pageDataUrl;

    @InterfaceC65349Pkn("preload_net_type")
    public final int preloadNetType;

    @InterfaceC65349Pkn("render_type")
    public final String renderType;

    @InterfaceC65349Pkn("second_page_gecko_channel")
    public final List<String> secondPageGeckoChannel;

    @InterfaceC65349Pkn("site_type")
    public final String siteType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeSiteConfig copy$default(NativeSiteConfig nativeSiteConfig, String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List list, List list2, String str6, String str7, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = nativeSiteConfig.renderType;
        }
        if ((i4 & 2) != 0) {
            i = nativeSiteConfig.flutterVersion;
        }
        if ((i4 & 4) != 0) {
            str2 = nativeSiteConfig.pageDataUrl;
        }
        if ((i4 & 8) != 0) {
            str3 = nativeSiteConfig.pageDataBackupUrl;
        }
        if ((i4 & 16) != 0) {
            i2 = nativeSiteConfig.preloadNetType;
        }
        if ((i4 & 32) != 0) {
            str4 = nativeSiteConfig.androidPageDataHash;
        }
        if ((i4 & 64) != 0) {
            z = nativeSiteConfig.isSupportNativeAnimation;
        }
        if ((i4 & 128) != 0) {
            str5 = nativeSiteConfig.animationType;
        }
        if ((i4 & 256) != 0) {
            list = nativeSiteConfig.geckoChannel;
        }
        if ((i4 & 512) != 0) {
            list2 = nativeSiteConfig.secondPageGeckoChannel;
        }
        if ((i4 & 1024) != 0) {
            str6 = nativeSiteConfig.siteType;
        }
        if ((i4 & 2048) != 0) {
            str7 = nativeSiteConfig.lynxScheme;
        }
        if ((i4 & 4096) != 0) {
            i3 = nativeSiteConfig.lynxLandingStyle;
        }
        return nativeSiteConfig.copy(str, i, str2, str3, i2, str4, z, str5, list, list2, str6, str7, i3);
    }

    public final NativeSiteConfig copy(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i3) {
        return new NativeSiteConfig(str, i, str2, str3, i2, str4, z, str5, list, list2, str6, str7, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeSiteConfig)) {
            return false;
        }
        NativeSiteConfig nativeSiteConfig = (NativeSiteConfig) obj;
        return o.LJ(this.renderType, nativeSiteConfig.renderType) && this.flutterVersion == nativeSiteConfig.flutterVersion && o.LJ(this.pageDataUrl, nativeSiteConfig.pageDataUrl) && o.LJ(this.pageDataBackupUrl, nativeSiteConfig.pageDataBackupUrl) && this.preloadNetType == nativeSiteConfig.preloadNetType && o.LJ(this.androidPageDataHash, nativeSiteConfig.androidPageDataHash) && this.isSupportNativeAnimation == nativeSiteConfig.isSupportNativeAnimation && o.LJ(this.animationType, nativeSiteConfig.animationType) && o.LJ(this.geckoChannel, nativeSiteConfig.geckoChannel) && o.LJ(this.secondPageGeckoChannel, nativeSiteConfig.secondPageGeckoChannel) && o.LJ(this.siteType, nativeSiteConfig.siteType) && o.LJ(this.lynxScheme, nativeSiteConfig.lynxScheme) && this.lynxLandingStyle == nativeSiteConfig.lynxLandingStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.renderType;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.flutterVersion) * 31;
        String str2 = this.pageDataUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pageDataBackupUrl;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.preloadNetType) * 31;
        String str4 = this.androidPageDataHash;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.isSupportNativeAnimation;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str5 = this.animationType;
        int hashCode5 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.geckoChannel;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.secondPageGeckoChannel;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.siteType;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lynxScheme;
        return ((hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.lynxLandingStyle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeSiteConfig(renderType=");
        sb.append(this.renderType);
        sb.append(", flutterVersion=");
        sb.append(this.flutterVersion);
        sb.append(", pageDataUrl=");
        sb.append(this.pageDataUrl);
        sb.append(", pageDataBackupUrl=");
        sb.append(this.pageDataBackupUrl);
        sb.append(", preloadNetType=");
        sb.append(this.preloadNetType);
        sb.append(", androidPageDataHash=");
        sb.append(this.androidPageDataHash);
        sb.append(", isSupportNativeAnimation=");
        sb.append(this.isSupportNativeAnimation);
        sb.append(", animationType=");
        sb.append(this.animationType);
        sb.append(", geckoChannel=");
        sb.append(this.geckoChannel);
        sb.append(", secondPageGeckoChannel=");
        sb.append(this.secondPageGeckoChannel);
        sb.append(", siteType=");
        sb.append(this.siteType);
        sb.append(", lynxScheme=");
        sb.append(this.lynxScheme);
        sb.append(", lynxLandingStyle=");
        return UPJ.LIZLLL(sb, this.lynxLandingStyle, ')');
    }

    public final String getAndroidPageDataHash() {
        return this.androidPageDataHash;
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    public final int getFlutterVersion() {
        return this.flutterVersion;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final int getLynxLandingStyle() {
        return this.lynxLandingStyle;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final String getPageDataBackupUrl() {
        return this.pageDataBackupUrl;
    }

    public final String getPageDataUrl() {
        return this.pageDataUrl;
    }

    public final int getPreloadNetType() {
        return this.preloadNetType;
    }

    public final String getRenderType() {
        return this.renderType;
    }

    public final List<String> getSecondPageGeckoChannel() {
        return this.secondPageGeckoChannel;
    }

    public final String getSiteType() {
        return this.siteType;
    }

    public final boolean isSupportNativeAnimation() {
        return this.isSupportNativeAnimation;
    }

    public NativeSiteConfig(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i3) {
        this.renderType = str;
        this.flutterVersion = i;
        this.pageDataUrl = str2;
        this.pageDataBackupUrl = str3;
        this.preloadNetType = i2;
        this.androidPageDataHash = str4;
        this.isSupportNativeAnimation = z;
        this.animationType = str5;
        this.geckoChannel = list;
        this.secondPageGeckoChannel = list2;
        this.siteType = str6;
        this.lynxScheme = str7;
        this.lynxLandingStyle = i3;
    }

    public /* synthetic */ NativeSiteConfig(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List list, List list2, String str6, String str7, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? 0 : i, str2, str3, (i4 & 16) != 0 ? 0 : i2, str4, (i4 & 64) != 0 ? false : z, str5, list, list2, str6, str7, (i4 & 4096) != 0 ? 0 : i3);
    }
}
