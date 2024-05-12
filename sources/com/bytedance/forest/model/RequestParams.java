package com.bytedance.forest.model;

import X.C221108m2;
import X.C38520F9w;
import X.C5H3;
import X.C61022NxC;
import X.EnumC39910FlS;
import X.EnumC61028NxI;
import X.F9E;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RequestParams extends F9E {
    public String accessKey;
    public boolean allowIOOnMainThread;
    public String bundle;
    public boolean cdnRegionRedirect;
    public String channel;
    public boolean checkGeckoFileAvailable;
    public final C5H3 customParams$delegate;
    public boolean disableBuiltin;
    public boolean disableCdn;
    public boolean disableGeckoUpdate;
    public boolean disableOffline;
    public boolean disablePrefixParser;
    public Boolean enableCDNCache;
    public Boolean enableMemoryCache;
    public Boolean enableNegotiation;
    public boolean enableRequestReuse;
    public long fetchPreloadedCacheTimeout;
    public List<String> fetcherSequence;
    public boolean geckoUrlRedirect;
    public String groupId;
    public boolean isPreload;
    public int loadRetryTimes;
    public boolean loadToMemory;
    public Long maxExpirationTime;
    public Boolean needLocalFile;
    public EnumC39910FlS netWorker;
    public boolean onlyLocal;
    public boolean onlyOnline;
    public boolean parallelLoading;
    public List<String> redirectRegions;
    public EnumC61028NxI resourceScene;
    public String sessionId;
    public boolean waitGeckoUpdate;
    public boolean waitLowStorageUpdate;
    public Object webResourceRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, EnumC61028NxI enumC61028NxI, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC61028NxI = requestParams.resourceScene;
        }
        return requestParams.copy(enumC61028NxI);
    }

    public final RequestParams copy(EnumC61028NxI resourceScene) {
        o.LJIIJ(resourceScene, "resourceScene");
        return new RequestParams(resourceScene);
    }

    public final Map<String, Object> getCustomParams() {
        return (Map) this.customParams$delegate.getValue();
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.resourceScene};
    }

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final boolean getAllowIOOnMainThread() {
        return this.allowIOOnMainThread;
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

    public final boolean getCheckGeckoFileAvailable() {
        return this.checkGeckoFileAvailable;
    }

    public final boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final boolean getDisableCdn() {
        return this.disableCdn;
    }

    public final boolean getDisableGeckoUpdate() {
        return this.disableGeckoUpdate;
    }

    public final boolean getDisableOffline() {
        return this.disableOffline;
    }

    public final boolean getDisablePrefixParser() {
        return this.disablePrefixParser;
    }

    public final Boolean getEnableCDNCache() {
        return this.enableCDNCache;
    }

    public final Boolean getEnableMemoryCache() {
        return this.enableMemoryCache;
    }

    public final Boolean getEnableNegotiation() {
        return this.enableNegotiation;
    }

    public final boolean getEnableRequestReuse() {
        return this.enableRequestReuse;
    }

    public final long getFetchPreloadedCacheTimeout() {
        return this.fetchPreloadedCacheTimeout;
    }

    public final List<String> getFetcherSequence() {
        return this.fetcherSequence;
    }

    public final boolean getGeckoUrlRedirect() {
        return this.geckoUrlRedirect;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final int getLoadRetryTimes() {
        return this.loadRetryTimes;
    }

    public final boolean getLoadToMemory() {
        return this.loadToMemory;
    }

    public final Long getMaxExpirationTime() {
        return this.maxExpirationTime;
    }

    public final Boolean getNeedLocalFile() {
        return this.needLocalFile;
    }

    public final EnumC39910FlS getNetWorker() {
        return this.netWorker;
    }

    public final boolean getOnlyLocal() {
        return this.onlyLocal;
    }

    public final boolean getOnlyOnline() {
        return this.onlyOnline;
    }

    public final boolean getParallelLoading() {
        return this.parallelLoading;
    }

    public final List<String> getRedirectRegions() {
        return this.redirectRegions;
    }

    public final EnumC61028NxI getResourceScene() {
        return this.resourceScene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getWaitGeckoUpdate() {
        return this.waitGeckoUpdate;
    }

    public final boolean getWaitLowStorageUpdate() {
        return this.waitLowStorageUpdate;
    }

    public final Object getWebResourceRequest() {
        return this.webResourceRequest;
    }

    public final boolean isPreload$forest_release() {
        return this.isPreload;
    }

    public RequestParams(EnumC61028NxI resourceScene) {
        o.LJIIJ(resourceScene, "resourceScene");
        this.resourceScene = resourceScene;
        this.fetcherSequence = C61022NxC.LJII;
        this.accessKey = "";
        this.checkGeckoFileAvailable = true;
        this.loadRetryTimes = 0;
        this.groupId = "";
        this.customParams$delegate = C221108m2.LIZIZ(C38520F9w.LJLIL);
        this.fetchPreloadedCacheTimeout = C61022NxC.LJI;
    }

    public final void setAccessKey(String str) {
        o.LJIIJ(str, "<set-?>");
        this.accessKey = str;
    }

    public final void setAllowIOOnMainThread(boolean z) {
        this.allowIOOnMainThread = z;
    }

    public final void setBundle(String str) {
        this.bundle = str;
    }

    public final void setCdnRegionRedirect(boolean z) {
        this.cdnRegionRedirect = z;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setCheckGeckoFileAvailable(boolean z) {
        this.checkGeckoFileAvailable = z;
    }

    public final void setDisableBuiltin(boolean z) {
        this.disableBuiltin = z;
    }

    public final void setDisableCdn(boolean z) {
        this.disableCdn = z;
    }

    public final void setDisableGeckoUpdate(boolean z) {
        this.disableGeckoUpdate = z;
    }

    public final void setDisableOffline(boolean z) {
        this.disableOffline = z;
    }

    public final void setDisablePrefixParser(boolean z) {
        this.disablePrefixParser = z;
    }

    public final void setEnableCDNCache(Boolean bool) {
        this.enableCDNCache = bool;
    }

    public final void setEnableMemoryCache(Boolean bool) {
        this.enableMemoryCache = bool;
    }

    public final void setEnableNegotiation(Boolean bool) {
        this.enableNegotiation = bool;
    }

    public final void setEnableRequestReuse(boolean z) {
        this.enableRequestReuse = z;
    }

    public final void setFetchPreloadedCacheTimeout(long j) {
        this.fetchPreloadedCacheTimeout = j;
    }

    public final void setFetcherSequence(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.fetcherSequence = list;
    }

    public final void setGeckoUrlRedirect(boolean z) {
        this.geckoUrlRedirect = z;
    }

    public final void setGroupId(String str) {
        o.LJIIJ(str, "<set-?>");
        this.groupId = str;
    }

    public final void setLoadRetryTimes(int i) {
        this.loadRetryTimes = i;
    }

    public final void setLoadToMemory(boolean z) {
        this.loadToMemory = z;
    }

    public final void setMaxExpirationTime(Long l) {
        this.maxExpirationTime = l;
    }

    public final void setNeedLocalFile(Boolean bool) {
        this.needLocalFile = bool;
    }

    public final void setNetWorker(EnumC39910FlS enumC39910FlS) {
        this.netWorker = enumC39910FlS;
    }

    public final void setOnlyLocal(boolean z) {
        this.onlyLocal = z;
    }

    public final void setOnlyOnline(boolean z) {
        this.onlyOnline = z;
    }

    public final void setParallelLoading(boolean z) {
        this.parallelLoading = z;
    }

    public final void setPreload$forest_release(boolean z) {
        this.isPreload = z;
    }

    public final void setRedirectRegions(List<String> list) {
        this.redirectRegions = list;
    }

    public final void setResourceScene(EnumC61028NxI enumC61028NxI) {
        o.LJIIJ(enumC61028NxI, "<set-?>");
        this.resourceScene = enumC61028NxI;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setWaitGeckoUpdate(boolean z) {
        this.waitGeckoUpdate = z;
    }

    public final void setWaitLowStorageUpdate(boolean z) {
        this.waitLowStorageUpdate = z;
    }

    public final void setWebResourceRequest(Object obj) {
        this.webResourceRequest = obj;
    }

    public /* synthetic */ RequestParams(EnumC61028NxI enumC61028NxI, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC61028NxI.OTHER : enumC61028NxI);
    }
}
