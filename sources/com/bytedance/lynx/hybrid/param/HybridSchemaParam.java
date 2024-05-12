package com.bytedance.lynx.hybrid.param;

import X.C60918NvW;
import X.C60932Nvk;
import X.EnumC39924Flg;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class HybridSchemaParam implements Serializable, Parcelable {
    public int _useTtnet;
    public String accessKey;
    public String accessKeyBp;
    public boolean appendCommonParams;
    public int autoPlayBgm;
    public String bid;
    public String bundle;
    public boolean cdnRegionRedirect;
    public String channel;
    public Boolean disableBuiltin;
    public Boolean disableCDN;
    public boolean disableEventCache;
    public Boolean disableGecko;
    public Boolean disableGeckoUpdate;
    public Boolean disableOffline;
    public boolean disableSaveImage;
    public int dynamic;
    public boolean enableCanvas;
    public Boolean enableCanvasOptimization;
    public int enableCodeCache;
    public boolean enableDynamicV8;
    public int enableExtraInfo;
    public boolean enableJSRuntime;
    public Boolean enableMemoryCache;
    public boolean enablePendingJsTask;
    public int enablePreCodeCache;
    public int enablePrefetch;
    public boolean enableScrollWebView;
    public boolean enableSparkLiveOpt;
    public EnumC39924Flg engineType;
    public String fallbackUrl;
    public boolean forceH5;
    public String forceThemeStyle;
    public boolean geckoUrlRedirection;
    public String group;
    public boolean hideSystemVideoPoster;
    public int ignoreCachePolicy;
    public boolean ignoreCachedTheme;
    public String initialData;
    public boolean landscapeScreenSizeAsPortrait;
    public boolean lockResource;
    public Integer lynxviewHeight;
    public Integer lynxviewWidth;
    public boolean needSecLink;
    public Integer netWorker;
    public Boolean onlyLocal;
    public boolean parallelFetchResource;
    public String preloadFonts;
    public String preloadSettingsKeys;
    public String preloadStorageKeys;
    public int presetHeight;
    public boolean presetSafePoint;
    public int presetWidth;
    public boolean proxyEnabledRuntimeType;
    public String redirectRegions;
    public Boolean resourceDynamic;
    public String secLinkScene;
    public String sessionId;
    public boolean shareGroup;
    public int sspConfig;
    public String starlingChannel;
    public boolean starlingFallback;
    public String surl;
    public int threadStrategy;
    public boolean uiRunningMode;
    public String url;
    public boolean useForest;
    public boolean usePreloadResourceH5;
    public Boolean waitGeckoUpdate;
    public boolean waitLowStorageUpdate;
    public static final C60932Nvk Companion = new C60932Nvk();
    public static final Parcelable.Creator<HybridSchemaParam> CREATOR = new C60918NvW();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final String getAccessKeyBp() {
        return this.accessKeyBp;
    }

    public final boolean getAppendCommonParams() {
        return this.appendCommonParams;
    }

    public final int getAutoPlayBgm() {
        return this.autoPlayBgm;
    }

    public final String getBid() {
        return this.bid;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final boolean getCdnRegionRedirect() {
        return this.cdnRegionRedirect;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final Boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final Boolean getDisableCDN() {
        return this.disableCDN;
    }

    public final boolean getDisableEventCache() {
        return this.disableEventCache;
    }

    public final Boolean getDisableGecko() {
        return this.disableGecko;
    }

    public final Boolean getDisableGeckoUpdate() {
        return this.disableGeckoUpdate;
    }

    public final Boolean getDisableOffline() {
        return this.disableOffline;
    }

    public final boolean getDisableSaveImage() {
        return this.disableSaveImage;
    }

    public final int getDynamic() {
        return this.dynamic;
    }

    public final boolean getEnableCanvas() {
        return this.enableCanvas;
    }

    public final Boolean getEnableCanvasOptimization() {
        return this.enableCanvasOptimization;
    }

    public final int getEnableCodeCache() {
        return this.enableCodeCache;
    }

    public final boolean getEnableDynamicV8() {
        return this.enableDynamicV8;
    }

    public final int getEnableExtraInfo() {
        return this.enableExtraInfo;
    }

    public final boolean getEnableJSRuntime() {
        return this.enableJSRuntime;
    }

    public final Boolean getEnableMemoryCache() {
        return this.enableMemoryCache;
    }

    public final boolean getEnablePendingJsTask() {
        return this.enablePendingJsTask;
    }

    public final int getEnablePreCodeCache() {
        return this.enablePreCodeCache;
    }

    public final int getEnablePrefetch() {
        return this.enablePrefetch;
    }

    public final boolean getEnableScrollWebView() {
        return this.enableScrollWebView;
    }

    public final boolean getEnableSparkLiveOpt() {
        return this.enableSparkLiveOpt;
    }

    public final EnumC39924Flg getEngineType() {
        return this.engineType;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final boolean getForceH5() {
        return this.forceH5;
    }

    public final String getForceThemeStyle() {
        return this.forceThemeStyle;
    }

    public final boolean getGeckoUrlRedirection() {
        return this.geckoUrlRedirection;
    }

    public final String getGroup() {
        return this.group;
    }

    public final boolean getHideSystemVideoPoster() {
        return this.hideSystemVideoPoster;
    }

    public final int getIgnoreCachePolicy() {
        return this.ignoreCachePolicy;
    }

    public final boolean getIgnoreCachedTheme() {
        return this.ignoreCachedTheme;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final boolean getLandscapeScreenSizeAsPortrait() {
        return this.landscapeScreenSizeAsPortrait;
    }

    public final boolean getLockResource() {
        return this.lockResource;
    }

    public final Integer getLynxviewHeight() {
        return this.lynxviewHeight;
    }

    public final Integer getLynxviewWidth() {
        return this.lynxviewWidth;
    }

    public final boolean getNeedSecLink() {
        return this.needSecLink;
    }

    public final Integer getNetWorker() {
        return this.netWorker;
    }

    public final Boolean getOnlyLocal() {
        return this.onlyLocal;
    }

    public final boolean getParallelFetchResource() {
        return this.parallelFetchResource;
    }

    public final String getPreloadFonts() {
        return this.preloadFonts;
    }

    public final String getPreloadSettingsKeys() {
        return this.preloadSettingsKeys;
    }

    public final String getPreloadStorageKeys() {
        return this.preloadStorageKeys;
    }

    public final int getPresetHeight() {
        return this.presetHeight;
    }

    public final boolean getPresetSafePoint() {
        return this.presetSafePoint;
    }

    public final int getPresetWidth() {
        return this.presetWidth;
    }

    public final boolean getProxyEnabledRuntimeType() {
        return this.proxyEnabledRuntimeType;
    }

    public final String getRedirectRegions() {
        return this.redirectRegions;
    }

    public final Boolean getResourceDynamic() {
        return this.resourceDynamic;
    }

    public final String getSecLinkScene() {
        return this.secLinkScene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShareGroup() {
        return this.shareGroup;
    }

    public final int getSspConfig() {
        return this.sspConfig;
    }

    public final String getStarlingChannel() {
        return this.starlingChannel;
    }

    public final boolean getStarlingFallback() {
        return this.starlingFallback;
    }

    public final String getSurl() {
        return this.surl;
    }

    public final int getThreadStrategy() {
        return this.threadStrategy;
    }

    public final boolean getUiRunningMode() {
        return this.uiRunningMode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseForest() {
        return this.useForest;
    }

    public final boolean getUsePreloadResourceH5() {
        return this.usePreloadResourceH5;
    }

    public final Boolean getWaitGeckoUpdate() {
        return this.waitGeckoUpdate;
    }

    public final boolean getWaitLowStorageUpdate() {
        return this.waitLowStorageUpdate;
    }

    public final int get_useTtnet() {
        return this._useTtnet;
    }

    public HybridSchemaParam(EnumC39924Flg engineType) {
        o.LJIIJ(engineType, "engineType");
        this.engineType = engineType;
        this.url = "";
        this.fallbackUrl = "";
        this.bid = "hybridkit_default_bid";
        this.dynamic = 1;
        this.bundle = "";
        this.channel = "";
        this.group = "default_lynx_group";
        this.initialData = "";
        this.preloadFonts = "";
        this.presetWidth = -1;
        this.presetHeight = -1;
        this.shareGroup = true;
        this.surl = "";
        this.uiRunningMode = true;
        this._useTtnet = -1;
        this.secLinkScene = "";
        this.preloadSettingsKeys = "";
        this.enableJSRuntime = true;
        this.redirectRegions = "";
        this.preloadStorageKeys = "";
        this.forceThemeStyle = "";
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        o.LJIIJ(parcel, "parcel");
        this.engineType = EnumC39924Flg.values()[parcel.readInt()];
        String readString = parcel.readString();
        String str = "";
        if (readString == null) {
            readString = "";
        }
        this.url = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.fallbackUrl = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this.bid = readString3;
        Class cls = Boolean.TYPE;
        Object readValue = parcel.readValue(cls.getClassLoader());
        Object obj = null;
        if (!(readValue instanceof Boolean)) {
            readValue = null;
        }
        this.disableBuiltin = (Boolean) readValue;
        Object readValue2 = parcel.readValue(cls.getClassLoader());
        if (!(readValue2 instanceof Boolean)) {
            readValue2 = null;
        }
        this.disableOffline = (Boolean) readValue2;
        Object readValue3 = parcel.readValue(cls.getClassLoader());
        if (!(readValue3 instanceof Boolean)) {
            readValue3 = null;
        }
        this.disableGecko = (Boolean) readValue3;
        Object readValue4 = parcel.readValue(cls.getClassLoader());
        if (!(readValue4 instanceof Boolean)) {
            readValue4 = null;
        }
        this.disableGeckoUpdate = (Boolean) readValue4;
        Object readValue5 = parcel.readValue(cls.getClassLoader());
        if (!(readValue5 instanceof Boolean)) {
            readValue5 = null;
        }
        this.disableCDN = (Boolean) readValue5;
        Class cls2 = Integer.TYPE;
        Object readValue6 = parcel.readValue(cls2.getClassLoader());
        if (!(readValue6 instanceof Integer)) {
            readValue6 = null;
        }
        this.netWorker = (Integer) readValue6;
        Object readValue7 = parcel.readValue(cls.getClassLoader());
        if (!(readValue7 instanceof Boolean)) {
            readValue7 = null;
        }
        this.resourceDynamic = (Boolean) readValue7;
        Object readValue8 = parcel.readValue(cls.getClassLoader());
        if (!(readValue8 instanceof Boolean)) {
            readValue8 = null;
        }
        this.onlyLocal = (Boolean) readValue8;
        Object readValue9 = parcel.readValue(cls.getClassLoader());
        if (!(readValue9 instanceof Boolean)) {
            readValue9 = null;
        }
        this.enableMemoryCache = (Boolean) readValue9;
        Object readValue10 = parcel.readValue(cls.getClassLoader());
        if (!(readValue10 instanceof Boolean)) {
            readValue10 = null;
        }
        this.waitGeckoUpdate = (Boolean) readValue10;
        this.accessKey = parcel.readString();
        this.accessKeyBp = parcel.readString();
        boolean z26 = false;
        byte b = (byte) 0;
        if (parcel.readByte() != b) {
            z = true;
        } else {
            z = false;
        }
        this.useForest = z;
        this.dynamic = parcel.readInt();
        String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        this.bundle = readString4;
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        this.channel = readString5;
        if (parcel.readByte() != b) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.lockResource = z2;
        this.sessionId = parcel.readString();
        if (parcel.readByte() != b) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableCanvas = z3;
        if (parcel.readByte() != b) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableDynamicV8 = z4;
        Object readValue11 = parcel.readValue(cls.getClassLoader());
        if (!(readValue11 instanceof Boolean)) {
            readValue11 = null;
        }
        this.enableCanvasOptimization = (Boolean) readValue11;
        if (parcel.readByte() != b) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.forceH5 = z5;
        String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        this.group = readString6;
        String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        }
        this.initialData = readString7;
        Object readValue12 = parcel.readValue(cls2.getClassLoader());
        if (!(readValue12 instanceof Integer)) {
            readValue12 = null;
        }
        this.lynxviewWidth = (Integer) readValue12;
        Object readValue13 = parcel.readValue(cls2.getClassLoader());
        if (readValue13 instanceof Integer) {
            obj = readValue13;
        }
        this.lynxviewHeight = (Integer) obj;
        String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        }
        this.preloadFonts = readString8;
        this.presetWidth = parcel.readInt();
        this.presetHeight = parcel.readInt();
        if (parcel.readByte() != b) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.presetSafePoint = z6;
        if (parcel.readByte() != b) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.shareGroup = z7;
        String readString9 = parcel.readString();
        if (readString9 == null) {
            readString9 = "";
        }
        this.surl = readString9;
        this.threadStrategy = parcel.readInt();
        if (parcel.readByte() != b) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.uiRunningMode = z8;
        if (parcel.readByte() != b) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.disableSaveImage = z9;
        this.ignoreCachePolicy = parcel.readInt();
        this._useTtnet = parcel.readInt();
        String readString10 = parcel.readString();
        if (readString10 == null) {
            readString10 = "";
        }
        this.secLinkScene = readString10;
        if (parcel.readByte() != b) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.needSecLink = z10;
        if (parcel.readByte() != b) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.landscapeScreenSizeAsPortrait = z11;
        this.autoPlayBgm = parcel.readInt();
        if (parcel.readByte() != b) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.hideSystemVideoPoster = z12;
        String readString11 = parcel.readString();
        if (readString11 == null) {
            readString11 = "";
        }
        this.preloadSettingsKeys = readString11;
        if (parcel.readByte() != b) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.enablePendingJsTask = z13;
        this.enablePrefetch = parcel.readInt();
        if (parcel.readByte() != b) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.enableJSRuntime = z14;
        if (parcel.readByte() != b) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.appendCommonParams = z15;
        if (parcel.readByte() != b) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.parallelFetchResource = z16;
        this.enableCodeCache = parcel.readInt();
        this.enablePreCodeCache = parcel.readInt();
        this.sspConfig = parcel.readInt();
        if (parcel.readByte() != b) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.usePreloadResourceH5 = z17;
        if (parcel.readByte() != b) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.cdnRegionRedirect = z18;
        String readString12 = parcel.readString();
        if (readString12 == null) {
            readString12 = "";
        }
        this.redirectRegions = readString12;
        this.starlingChannel = parcel.readString();
        if (parcel.readByte() != b) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.starlingFallback = z19;
        if (parcel.readByte() != b) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.geckoUrlRedirection = z20;
        if (parcel.readByte() != b) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.enableSparkLiveOpt = z21;
        if (parcel.readByte() != b) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.disableEventCache = z22;
        this.enableExtraInfo = parcel.readInt();
        String readString13 = parcel.readString();
        if (readString13 == null) {
            readString13 = "";
        }
        this.preloadStorageKeys = readString13;
        String readString14 = parcel.readString();
        if (readString14 != null) {
            str = readString14;
        }
        this.forceThemeStyle = str;
        if (parcel.readByte() != b) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.ignoreCachedTheme = z23;
        if (parcel.readByte() != b) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.waitLowStorageUpdate = z24;
        if (parcel.readByte() != b) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.proxyEnabledRuntimeType = z25;
        if (parcel.readByte() != b) {
            z26 = true;
        }
        this.enableScrollWebView = z26;
    }

    public final void setAccessKey(String str) {
        this.accessKey = str;
    }

    public final void setAccessKeyBp(String str) {
        this.accessKeyBp = str;
    }

    public final void setAppendCommonParams(boolean z) {
        this.appendCommonParams = z;
    }

    public final void setAutoPlayBgm(int i) {
        this.autoPlayBgm = i;
    }

    public final void setBid(String str) {
        o.LJIIJ(str, "<set-?>");
        this.bid = str;
    }

    public final void setBundle(String str) {
        o.LJIIJ(str, "<set-?>");
        this.bundle = str;
    }

    public final void setCdnRegionRedirect(boolean z) {
        this.cdnRegionRedirect = z;
    }

    public final void setChannel(String str) {
        o.LJIIJ(str, "<set-?>");
        this.channel = str;
    }

    public final void setDisableBuiltin(Boolean bool) {
        this.disableBuiltin = bool;
    }

    public final void setDisableCDN(Boolean bool) {
        this.disableCDN = bool;
    }

    public final void setDisableEventCache(boolean z) {
        this.disableEventCache = z;
    }

    public final void setDisableGecko(Boolean bool) {
        this.disableGecko = bool;
    }

    public final void setDisableGeckoUpdate(Boolean bool) {
        this.disableGeckoUpdate = bool;
    }

    public final void setDisableOffline(Boolean bool) {
        this.disableOffline = bool;
    }

    public final void setDisableSaveImage(boolean z) {
        this.disableSaveImage = z;
    }

    public final void setDynamic(int i) {
        this.dynamic = i;
    }

    public final void setEnableCanvas(boolean z) {
        this.enableCanvas = z;
    }

    public final void setEnableCanvasOptimization(Boolean bool) {
        this.enableCanvasOptimization = bool;
    }

    public final void setEnableCodeCache(int i) {
        this.enableCodeCache = i;
    }

    public final void setEnableDynamicV8(boolean z) {
        this.enableDynamicV8 = z;
    }

    public final void setEnableExtraInfo(int i) {
        this.enableExtraInfo = i;
    }

    public final void setEnableJSRuntime(boolean z) {
        this.enableJSRuntime = z;
    }

    public final void setEnableMemoryCache(Boolean bool) {
        this.enableMemoryCache = bool;
    }

    public final void setEnablePendingJsTask(boolean z) {
        this.enablePendingJsTask = z;
    }

    public final void setEnablePreCodeCache(int i) {
        this.enablePreCodeCache = i;
    }

    public final void setEnablePrefetch(int i) {
        this.enablePrefetch = i;
    }

    public final void setEnableScrollWebView(boolean z) {
        this.enableScrollWebView = z;
    }

    public final void setEnableSparkLiveOpt(boolean z) {
        this.enableSparkLiveOpt = z;
    }

    public final void setEngineType(EnumC39924Flg enumC39924Flg) {
        o.LJIIJ(enumC39924Flg, "<set-?>");
        this.engineType = enumC39924Flg;
    }

    public final void setFallbackUrl(String str) {
        o.LJIIJ(str, "<set-?>");
        this.fallbackUrl = str;
    }

    public final void setForceH5(boolean z) {
        this.forceH5 = z;
    }

    public final void setForceThemeStyle(String str) {
        o.LJIIJ(str, "<set-?>");
        this.forceThemeStyle = str;
    }

    public final void setGeckoUrlRedirection(boolean z) {
        this.geckoUrlRedirection = z;
    }

    public final void setGroup(String str) {
        o.LJIIJ(str, "<set-?>");
        this.group = str;
    }

    public final void setHideSystemVideoPoster(boolean z) {
        this.hideSystemVideoPoster = z;
    }

    public final void setIgnoreCachePolicy(int i) {
        this.ignoreCachePolicy = i;
    }

    public final void setIgnoreCachedTheme(boolean z) {
        this.ignoreCachedTheme = z;
    }

    public final void setInitialData(String str) {
        o.LJIIJ(str, "<set-?>");
        this.initialData = str;
    }

    public final void setLandscapeScreenSizeAsPortrait(boolean z) {
        this.landscapeScreenSizeAsPortrait = z;
    }

    public final void setLockResource(boolean z) {
        this.lockResource = z;
    }

    public final void setLynxviewHeight(Integer num) {
        this.lynxviewHeight = num;
    }

    public final void setLynxviewWidth(Integer num) {
        this.lynxviewWidth = num;
    }

    public final void setNeedSecLink(boolean z) {
        this.needSecLink = z;
    }

    public final void setNetWorker(Integer num) {
        this.netWorker = num;
    }

    public final void setOnlyLocal(Boolean bool) {
        this.onlyLocal = bool;
    }

    public final void setParallelFetchResource(boolean z) {
        this.parallelFetchResource = z;
    }

    public final void setPreloadFonts(String str) {
        o.LJIIJ(str, "<set-?>");
        this.preloadFonts = str;
    }

    public final void setPreloadSettingsKeys(String str) {
        o.LJIIJ(str, "<set-?>");
        this.preloadSettingsKeys = str;
    }

    public final void setPreloadStorageKeys(String str) {
        o.LJIIJ(str, "<set-?>");
        this.preloadStorageKeys = str;
    }

    public final void setPresetHeight(int i) {
        this.presetHeight = i;
    }

    public final void setPresetSafePoint(boolean z) {
        this.presetSafePoint = z;
    }

    public final void setPresetWidth(int i) {
        this.presetWidth = i;
    }

    public final void setProxyEnabledRuntimeType(boolean z) {
        this.proxyEnabledRuntimeType = z;
    }

    public final void setRedirectRegions(String str) {
        o.LJIIJ(str, "<set-?>");
        this.redirectRegions = str;
    }

    public final void setResourceDynamic(Boolean bool) {
        this.resourceDynamic = bool;
    }

    public final void setSecLinkScene(String str) {
        o.LJIIJ(str, "<set-?>");
        this.secLinkScene = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setShareGroup(boolean z) {
        this.shareGroup = z;
    }

    public final void setSspConfig(int i) {
        this.sspConfig = i;
    }

    public final void setStarlingChannel(String str) {
        this.starlingChannel = str;
    }

    public final void setStarlingFallback(boolean z) {
        this.starlingFallback = z;
    }

    public final void setSurl(String str) {
        o.LJIIJ(str, "<set-?>");
        this.surl = str;
    }

    public final void setThreadStrategy(int i) {
        this.threadStrategy = i;
    }

    public final void setUiRunningMode(boolean z) {
        this.uiRunningMode = z;
    }

    public final void setUrl(String str) {
        o.LJIIJ(str, "<set-?>");
        this.url = str;
    }

    public final void setUseForest(boolean z) {
        this.useForest = z;
    }

    public final void setUsePreloadResourceH5(boolean z) {
        this.usePreloadResourceH5 = z;
    }

    public final void setWaitGeckoUpdate(Boolean bool) {
        this.waitGeckoUpdate = bool;
    }

    public final void setWaitLowStorageUpdate(boolean z) {
        this.waitLowStorageUpdate = z;
    }

    public final void set_useTtnet(int i) {
        this._useTtnet = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HybridSchemaParam(Parcel parcel) {
        this(EnumC39924Flg.UNKNOWN);
        o.LJIIJ(parcel, "parcel");
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeInt(this.engineType.ordinal());
        parcel.writeString(this.url);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.bid);
        parcel.writeValue(this.disableBuiltin);
        parcel.writeValue(this.disableOffline);
        parcel.writeValue(this.disableGecko);
        parcel.writeValue(this.disableGeckoUpdate);
        parcel.writeValue(this.disableCDN);
        parcel.writeValue(this.netWorker);
        parcel.writeValue(this.resourceDynamic);
        parcel.writeValue(this.onlyLocal);
        parcel.writeValue(this.enableMemoryCache);
        parcel.writeValue(this.waitGeckoUpdate);
        parcel.writeString(this.accessKey);
        parcel.writeString(this.accessKeyBp);
        parcel.writeByte(this.useForest ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.dynamic);
        parcel.writeString(this.bundle);
        parcel.writeString(this.channel);
        parcel.writeByte(this.lockResource ? (byte) 1 : (byte) 0);
        parcel.writeString(this.sessionId);
        parcel.writeByte(this.enableCanvas ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableDynamicV8 ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.enableCanvasOptimization);
        parcel.writeByte(this.forceH5 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.group);
        parcel.writeString(this.initialData);
        parcel.writeValue(this.lynxviewWidth);
        parcel.writeValue(this.lynxviewHeight);
        parcel.writeString(this.preloadFonts);
        parcel.writeInt(this.presetWidth);
        parcel.writeInt(this.presetHeight);
        parcel.writeByte(this.presetSafePoint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shareGroup ? (byte) 1 : (byte) 0);
        parcel.writeString(this.surl);
        parcel.writeInt(this.threadStrategy);
        parcel.writeByte(this.uiRunningMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableSaveImage ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.ignoreCachePolicy);
        parcel.writeInt(this._useTtnet);
        parcel.writeString(this.secLinkScene);
        parcel.writeByte(this.needSecLink ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.landscapeScreenSizeAsPortrait ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.autoPlayBgm);
        parcel.writeByte(this.hideSystemVideoPoster ? (byte) 1 : (byte) 0);
        parcel.writeString(this.preloadSettingsKeys);
        parcel.writeByte(this.enablePendingJsTask ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enablePrefetch);
        parcel.writeByte(this.enableJSRuntime ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.appendCommonParams ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.parallelFetchResource ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enableCodeCache);
        parcel.writeInt(this.enablePreCodeCache);
        parcel.writeInt(this.sspConfig);
        parcel.writeByte(this.usePreloadResourceH5 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.cdnRegionRedirect ? (byte) 1 : (byte) 0);
        parcel.writeString(this.redirectRegions);
        parcel.writeString(this.starlingChannel);
        parcel.writeByte(this.starlingFallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.geckoUrlRedirection ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableSparkLiveOpt ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableEventCache ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enableExtraInfo);
        parcel.writeString(this.preloadStorageKeys);
        parcel.writeString(this.forceThemeStyle);
        parcel.writeByte(this.ignoreCachedTheme ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.waitLowStorageUpdate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.proxyEnabledRuntimeType ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableScrollWebView ? (byte) 1 : (byte) 0);
    }
}
