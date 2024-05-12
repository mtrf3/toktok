package com.bytedance.forest.model;

import X.C48339Iy7;
import X.C61022NxC;
import X.C61023NxD;
import X.C61297O3x;
import X.C61298O3y;
import X.C61878OQg;
import X.EnumC39910FlS;
import X.EnumC61024NxE;
import X.EnumC61028NxI;
import X.InterfaceC61309O4j;
import X.X1D;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.forest.Forest;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Request {
    public boolean allowIOOnMainThread;
    public boolean cdnRegionRedirect;
    public boolean checkGeckoFileAvailable;
    public Map<String, Object> customParams;
    public boolean disableBuiltin;
    public boolean disableCdn;
    public boolean disableGeckoUpdate;
    public boolean disableOffline;
    public boolean enableCDNCache;
    public boolean enableMemoryCache;
    public boolean enableNegotiation;
    public boolean enableRequestReuse;
    public List<String> fallbackDomains;
    public List<String> fetcherSequence;
    public final Forest forest;
    public final C61023NxD geckoModel;
    public EnumC61024NxE geckoSource;
    public boolean geckoUrlRedirect;
    public String groupId;
    public boolean isASync;
    public boolean isPreload;
    public int loadRetryTimes;
    public boolean loadToMemory;
    public long maxExpirationTime;
    public boolean needLocalFile;
    public InterfaceC61309O4j netDepender;
    public boolean onlyLocal;
    public boolean onlyOnline;
    public boolean parallelLoading;
    public List<String> redirectRegions;
    public EnumC61028NxI scene;
    public String sessionId;
    public boolean supportShuffle;
    public final Uri uri;
    public final String url;
    public boolean useInteraction;
    public boolean waitGeckoUpdate;
    public boolean waitLowStorageUpdate;
    public Object webResourceRequest;

    public static /* synthetic */ Request copy$default(Request request, String str, Forest forest, Map map, C61023NxD c61023NxD, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, EnumC61028NxI enumC61028NxI, boolean z11, String str2, boolean z12, boolean z13, boolean z14, long j, List list, boolean z15, boolean z16, String str3, Object obj, boolean z17, boolean z18, boolean z19, List list2, boolean z20, int i2, Object obj2) {
        boolean z21 = z10;
        boolean z22 = z8;
        boolean z23 = z7;
        boolean z24 = z9;
        boolean z25 = z6;
        boolean z26 = z5;
        boolean z27 = z4;
        boolean z28 = z3;
        Forest forest2 = forest;
        String str4 = str;
        Map map2 = map;
        C61023NxD c61023NxD2 = c61023NxD;
        boolean z29 = z;
        boolean z30 = z2;
        List list3 = list2;
        boolean z31 = z13;
        boolean z32 = z17;
        boolean z33 = z12;
        Object obj3 = obj;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        boolean z34 = z11;
        boolean z35 = z16;
        int i3 = i;
        boolean z36 = z20;
        EnumC61028NxI enumC61028NxI2 = enumC61028NxI;
        boolean z37 = z15;
        boolean z38 = z14;
        boolean z39 = z18;
        List list4 = list;
        boolean z40 = z19;
        if ((i2 & 1) != 0) {
            str4 = request.url;
        }
        if ((i2 & 2) != 0) {
            forest2 = request.forest;
        }
        if ((i2 & 4) != 0) {
            map2 = request.customParams;
        }
        if ((i2 & 8) != 0) {
            c61023NxD2 = request.geckoModel;
        }
        if ((i2 & 16) != 0) {
            z29 = request.waitGeckoUpdate;
        }
        if ((i2 & 32) != 0) {
            z30 = request.waitLowStorageUpdate;
        }
        if ((i2 & 64) != 0) {
            z28 = request.onlyLocal;
        }
        if ((i2 & 128) != 0) {
            z27 = request.disableCdn;
        }
        if ((i2 & 256) != 0) {
            z26 = request.disableBuiltin;
        }
        if ((i2 & 512) != 0) {
            z25 = request.disableOffline;
        }
        if ((i2 & 1024) != 0) {
            z23 = request.disableGeckoUpdate;
        }
        if ((i2 & 2048) != 0) {
            z22 = request.loadToMemory;
        }
        if ((i2 & 4096) != 0) {
            z24 = request.allowIOOnMainThread;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            z21 = request.checkGeckoFileAvailable;
        }
        if ((i2 & 16384) != 0) {
            i3 = request.loadRetryTimes;
        }
        if ((32768 & i2) != 0) {
            enumC61028NxI2 = request.scene;
        }
        if ((65536 & i2) != 0) {
            z34 = request.isASync;
        }
        if ((131072 & i2) != 0) {
            str5 = request.groupId;
        }
        if ((262144 & i2) != 0) {
            z33 = request.enableNegotiation;
        }
        if ((524288 & i2) != 0) {
            z31 = request.enableMemoryCache;
        }
        if ((1048576 & i2) != 0) {
            z38 = request.enableCDNCache;
        }
        if ((2097152 & i2) != 0) {
            j2 = request.maxExpirationTime;
        }
        if ((4194304 & i2) != 0) {
            list4 = request.fetcherSequence;
        }
        if ((8388608 & i2) != 0) {
            z37 = request.isPreload;
        }
        if ((16777216 & i2) != 0) {
            z35 = request.enableRequestReuse;
        }
        if ((33554432 & i2) != 0) {
            str6 = request.sessionId;
        }
        if ((67108864 & i2) != 0) {
            obj3 = request.webResourceRequest;
        }
        if ((134217728 & i2) != 0) {
            z32 = request.needLocalFile;
        }
        if ((268435456 & i2) != 0) {
            z39 = request.cdnRegionRedirect;
        }
        if ((536870912 & i2) != 0) {
            z40 = request.geckoUrlRedirect;
        }
        if ((1073741824 & i2) != 0) {
            list3 = request.redirectRegions;
        }
        if ((i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            z36 = request.parallelLoading;
        }
        return request.copy(str4, forest2, map2, c61023NxD2, z29, z30, z28, z27, z26, z25, z23, z22, z24, z21, i3, enumC61028NxI2, z34, str5, z33, z31, z38, j2, list4, z37, z35, str6, obj3, z32, z39, z40, list3, z36);
    }

    public final Request copy(String url, Forest forest, Map<String, Object> customParams, C61023NxD geckoModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, EnumC61028NxI scene, boolean z11, String groupId, boolean z12, boolean z13, boolean z14, long j, List<String> fetcherSequence, boolean z15, boolean z16, String str, Object obj, boolean z17, boolean z18, boolean z19, List<String> list, boolean z20) {
        o.LJIIJ(url, "url");
        o.LJIIJ(forest, "forest");
        o.LJIIJ(customParams, "customParams");
        o.LJIIJ(geckoModel, "geckoModel");
        o.LJIIJ(scene, "scene");
        o.LJIIJ(groupId, "groupId");
        o.LJIIJ(fetcherSequence, "fetcherSequence");
        return new Request(url, forest, customParams, geckoModel, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, i, scene, z11, groupId, z12, z13, z14, j, fetcherSequence, z15, z16, str, obj, z17, z18, z19, list, z20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return o.LJ(this.url, request.url) && o.LJ(this.forest, request.forest) && o.LJ(this.customParams, request.customParams) && o.LJ(this.geckoModel, request.geckoModel) && this.waitGeckoUpdate == request.waitGeckoUpdate && this.waitLowStorageUpdate == request.waitLowStorageUpdate && this.onlyLocal == request.onlyLocal && this.disableCdn == request.disableCdn && this.disableBuiltin == request.disableBuiltin && this.disableOffline == request.disableOffline && this.disableGeckoUpdate == request.disableGeckoUpdate && this.loadToMemory == request.loadToMemory && this.allowIOOnMainThread == request.allowIOOnMainThread && this.checkGeckoFileAvailable == request.checkGeckoFileAvailable && this.loadRetryTimes == request.loadRetryTimes && o.LJ(this.scene, request.scene) && this.isASync == request.isASync && o.LJ(this.groupId, request.groupId) && this.enableNegotiation == request.enableNegotiation && this.enableMemoryCache == request.enableMemoryCache && this.enableCDNCache == request.enableCDNCache && this.maxExpirationTime == request.maxExpirationTime && o.LJ(this.fetcherSequence, request.fetcherSequence) && this.isPreload == request.isPreload && this.enableRequestReuse == request.enableRequestReuse && o.LJ(this.sessionId, request.sessionId) && o.LJ(this.webResourceRequest, request.webResourceRequest) && this.needLocalFile == request.needLocalFile && this.cdnRegionRedirect == request.cdnRegionRedirect && this.geckoUrlRedirect == request.geckoUrlRedirect && o.LJ(this.redirectRegions, request.redirectRegions) && this.parallelLoading == request.parallelLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.url;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Forest forest = this.forest;
        int hashCode2 = (hashCode + (forest != null ? forest.hashCode() : 0)) * 31;
        Map<String, Object> map = this.customParams;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        C61023NxD c61023NxD = this.geckoModel;
        int hashCode4 = (hashCode3 + (c61023NxD != null ? c61023NxD.hashCode() : 0)) * 31;
        boolean z = this.waitGeckoUpdate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.waitLowStorageUpdate;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.onlyLocal;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.disableCdn;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.disableBuiltin;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.disableOffline;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.disableGeckoUpdate;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z8 = this.loadToMemory;
        int i15 = z8;
        if (z8 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z9 = this.allowIOOnMainThread;
        int i17 = z9;
        if (z9 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z10 = this.checkGeckoFileAvailable;
        int i19 = z10;
        if (z10 != 0) {
            i19 = 1;
        }
        int i20 = (((i18 + i19) * 31) + this.loadRetryTimes) * 31;
        EnumC61028NxI enumC61028NxI = this.scene;
        int hashCode5 = (i20 + (enumC61028NxI != null ? enumC61028NxI.hashCode() : 0)) * 31;
        boolean z11 = this.isASync;
        int i21 = z11;
        if (z11 != 0) {
            i21 = 1;
        }
        int i22 = (hashCode5 + i21) * 31;
        String str2 = this.groupId;
        int hashCode6 = (i22 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z12 = this.enableNegotiation;
        int i23 = z12;
        if (z12 != 0) {
            i23 = 1;
        }
        int i24 = (hashCode6 + i23) * 31;
        boolean z13 = this.enableMemoryCache;
        int i25 = z13;
        if (z13 != 0) {
            i25 = 1;
        }
        int i26 = (i24 + i25) * 31;
        boolean z14 = this.enableCDNCache;
        int i27 = z14;
        if (z14 != 0) {
            i27 = 1;
        }
        long j = this.maxExpirationTime;
        int i28 = (((i26 + i27) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        List<String> list = this.fetcherSequence;
        int hashCode7 = (i28 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z15 = this.isPreload;
        int i29 = z15;
        if (z15 != 0) {
            i29 = 1;
        }
        int i30 = (hashCode7 + i29) * 31;
        boolean z16 = this.enableRequestReuse;
        int i31 = z16;
        if (z16 != 0) {
            i31 = 1;
        }
        int i32 = (i30 + i31) * 31;
        String str3 = this.sessionId;
        int hashCode8 = (i32 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.webResourceRequest;
        int hashCode9 = (hashCode8 + (obj != null ? obj.hashCode() : 0)) * 31;
        boolean z17 = this.needLocalFile;
        int i33 = z17;
        if (z17 != 0) {
            i33 = 1;
        }
        int i34 = (hashCode9 + i33) * 31;
        boolean z18 = this.cdnRegionRedirect;
        int i35 = z18;
        if (z18 != 0) {
            i35 = 1;
        }
        int i36 = (i34 + i35) * 31;
        boolean z19 = this.geckoUrlRedirect;
        int i37 = z19;
        if (z19 != 0) {
            i37 = 1;
        }
        int i38 = (i36 + i37) * 31;
        List<String> list2 = this.redirectRegions;
        return ((i38 + (list2 != null ? list2.hashCode() : 0)) * 31) + (this.parallelLoading ? 1 : 0);
    }

    public final boolean isWebRequest() {
        EnumC61028NxI enumC61028NxI;
        if (this.webResourceRequest != null || (enumC61028NxI = this.scene) == EnumC61028NxI.WEB_CHILD_RESOURCE || enumC61028NxI == EnumC61028NxI.WEB_MAIN_DOCUMENT) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request(url='");
        LIZ.append(this.url);
        LIZ.append("', forest=");
        LIZ.append(this.forest);
        LIZ.append(", customParams=");
        LIZ.append(this.customParams);
        LIZ.append(", geckoModel=");
        LIZ.append(this.geckoModel);
        LIZ.append(", waitGeckoUpdate=");
        LIZ.append(this.waitGeckoUpdate);
        LIZ.append(", disableGeckoUpdate=");
        LIZ.append(this.disableGeckoUpdate);
        LIZ.append(", onlyLocal=");
        LIZ.append(this.onlyLocal);
        LIZ.append(", disableCdn=");
        LIZ.append(this.disableCdn);
        LIZ.append(", disableBuiltin=");
        LIZ.append(this.disableBuiltin);
        LIZ.append(", disableOffline=");
        LIZ.append(this.disableOffline);
        LIZ.append(", loadToMemory=");
        LIZ.append(this.loadToMemory);
        LIZ.append(", allowIOOnMainThread=");
        LIZ.append(this.allowIOOnMainThread);
        LIZ.append(", checkGeckoFileAvailable=");
        LIZ.append(this.checkGeckoFileAvailable);
        LIZ.append(", loadRetryTimes=");
        LIZ.append(this.loadRetryTimes);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", isASync=");
        LIZ.append(this.isASync);
        LIZ.append(", groupId='");
        LIZ.append(this.groupId);
        LIZ.append("', enableNegotiation=");
        LIZ.append(this.enableNegotiation);
        LIZ.append(", enableMemoryCache=");
        LIZ.append(this.enableMemoryCache);
        LIZ.append(", enableCDNCache=");
        LIZ.append(this.enableCDNCache);
        LIZ.append(", fetcherSequence=");
        LIZ.append(this.fetcherSequence);
        LIZ.append(", isPreload=");
        LIZ.append(this.isPreload);
        LIZ.append(", enableRequestReuse=");
        LIZ.append(this.enableRequestReuse);
        LIZ.append(", sessionId=");
        LIZ.append(this.sessionId);
        LIZ.append(", geckoSource=");
        LIZ.append(this.geckoSource);
        LIZ.append(", useInteraction=");
        LIZ.append(this.useInteraction);
        LIZ.append(", onlyOnline=");
        LIZ.append(this.onlyOnline);
        LIZ.append(", fallbackDomains=");
        LIZ.append(this.fallbackDomains);
        LIZ.append(", supportShuffle=");
        return C48339Iy7.LIZJ(LIZ, this.supportShuffle, ')', LIZ);
    }

    public final boolean getAllowIOOnMainThread() {
        return this.allowIOOnMainThread;
    }

    public final boolean getCdnRegionRedirect() {
        return this.cdnRegionRedirect;
    }

    public final boolean getCheckGeckoFileAvailable() {
        return this.checkGeckoFileAvailable;
    }

    public final Map<String, Object> getCustomParams() {
        return this.customParams;
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

    public final boolean getEnableCDNCache() {
        return this.enableCDNCache;
    }

    public final boolean getEnableMemoryCache() {
        return this.enableMemoryCache;
    }

    public final boolean getEnableNegotiation() {
        return this.enableNegotiation;
    }

    public final boolean getEnableRequestReuse() {
        return this.enableRequestReuse;
    }

    public final List<String> getFallbackDomains() {
        return this.fallbackDomains;
    }

    public final List<String> getFetcherSequence() {
        return this.fetcherSequence;
    }

    public final Forest getForest() {
        return this.forest;
    }

    public final C61023NxD getGeckoModel() {
        return this.geckoModel;
    }

    public final EnumC61024NxE getGeckoSource() {
        return this.geckoSource;
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

    public final long getMaxExpirationTime() {
        return this.maxExpirationTime;
    }

    public final boolean getNeedLocalFile() {
        return this.needLocalFile;
    }

    public final InterfaceC61309O4j getNetDepender() {
        return this.netDepender;
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

    public final EnumC61028NxI getScene() {
        return this.scene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getSupportShuffle() {
        return this.supportShuffle;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseInteraction() {
        return this.useInteraction;
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

    public final boolean isASync() {
        return this.isASync;
    }

    public final boolean isPreload() {
        return this.isPreload;
    }

    public final void setASync(boolean z) {
        this.isASync = z;
    }

    public final void setAllowIOOnMainThread(boolean z) {
        this.allowIOOnMainThread = z;
    }

    public final void setCdnRegionRedirect(boolean z) {
        this.cdnRegionRedirect = z;
    }

    public final void setCheckGeckoFileAvailable(boolean z) {
        this.checkGeckoFileAvailable = z;
    }

    public final void setCustomParams(Map<String, Object> map) {
        o.LJIIJ(map, "<set-?>");
        this.customParams = map;
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

    public final void setEnableCDNCache(boolean z) {
        this.enableCDNCache = z;
    }

    public final void setEnableMemoryCache(boolean z) {
        this.enableMemoryCache = z;
    }

    public final void setEnableNegotiation(boolean z) {
        this.enableNegotiation = z;
    }

    public final void setEnableRequestReuse(boolean z) {
        this.enableRequestReuse = z;
    }

    public final void setFallbackDomains(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.fallbackDomains = list;
    }

    public final void setFetcherSequence(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.fetcherSequence = list;
    }

    public final void setGeckoSource(EnumC61024NxE enumC61024NxE) {
        o.LJIIJ(enumC61024NxE, "<set-?>");
        this.geckoSource = enumC61024NxE;
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

    public final void setMaxExpirationTime(long j) {
        this.maxExpirationTime = j;
    }

    public final void setNeedLocalFile(boolean z) {
        this.needLocalFile = z;
    }

    public final void setNetDepender(InterfaceC61309O4j interfaceC61309O4j) {
        o.LJIIJ(interfaceC61309O4j, "<set-?>");
        this.netDepender = interfaceC61309O4j;
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

    public final void setPreload(boolean z) {
        this.isPreload = z;
    }

    public final void setRedirectRegions(List<String> list) {
        this.redirectRegions = list;
    }

    public final void setScene(EnumC61028NxI enumC61028NxI) {
        o.LJIIJ(enumC61028NxI, "<set-?>");
        this.scene = enumC61028NxI;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSupportShuffle(boolean z) {
        this.supportShuffle = z;
    }

    public final void setUseInteraction(boolean z) {
        this.useInteraction = z;
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

    public Request(String url, Forest forest, Map<String, Object> customParams, C61023NxD geckoModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, EnumC61028NxI scene, boolean z11, String groupId, boolean z12, boolean z13, boolean z14, long j, List<String> fetcherSequence, boolean z15, boolean z16, String str, Object obj, boolean z17, boolean z18, boolean z19, List<String> list, boolean z20) {
        InterfaceC61309O4j interfaceC61309O4j;
        o.LJIIJ(url, "url");
        o.LJIIJ(forest, "forest");
        o.LJIIJ(customParams, "customParams");
        o.LJIIJ(geckoModel, "geckoModel");
        o.LJIIJ(scene, "scene");
        o.LJIIJ(groupId, "groupId");
        o.LJIIJ(fetcherSequence, "fetcherSequence");
        this.url = url;
        this.forest = forest;
        this.customParams = customParams;
        this.geckoModel = geckoModel;
        this.waitGeckoUpdate = z;
        this.waitLowStorageUpdate = z2;
        this.onlyLocal = z3;
        this.disableCdn = z4;
        this.disableBuiltin = z5;
        this.disableOffline = z6;
        this.disableGeckoUpdate = z7;
        this.loadToMemory = z8;
        this.allowIOOnMainThread = z9;
        this.checkGeckoFileAvailable = z10;
        this.loadRetryTimes = i;
        this.scene = scene;
        this.isASync = z11;
        this.groupId = groupId;
        this.enableNegotiation = z12;
        this.enableMemoryCache = z13;
        this.enableCDNCache = z14;
        this.maxExpirationTime = j;
        this.fetcherSequence = fetcherSequence;
        this.isPreload = z15;
        this.enableRequestReuse = z16;
        this.sessionId = str;
        this.webResourceRequest = obj;
        this.needLocalFile = z17;
        this.cdnRegionRedirect = z18;
        this.geckoUrlRedirect = z19;
        this.redirectRegions = list;
        this.parallelLoading = z20;
        Uri parse = UriProtector.parse(url);
        o.LJFF(parse, "Uri.parse(url)");
        this.uri = parse;
        this.geckoSource = EnumC61024NxE.CLIENT_CONFIG;
        if (forest.getConfig().LIZ == EnumC39910FlS.Downloader) {
            interfaceC61309O4j = C61297O3x.LIZJ;
        } else {
            interfaceC61309O4j = C61298O3y.LIZJ;
        }
        this.netDepender = interfaceC61309O4j;
        this.fallbackDomains = C61878OQg.INSTANCE;
    }

    public Request(String str, Forest forest, Map map, C61023NxD c61023NxD, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, EnumC61028NxI enumC61028NxI, boolean z11, String str2, boolean z12, boolean z13, boolean z14, long j, List list, boolean z15, boolean z16, String str3, Object obj, boolean z17, boolean z18, boolean z19, List list2, boolean z20, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, forest, map, (i2 & 8) != 0 ? new C61023NxD("", "", "") : c61023NxD, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? false : z5, (i2 & 512) != 0 ? false : z6, (i2 & 1024) != 0 ? false : z7, (i2 & 2048) != 0 ? false : z8, (i2 & 4096) != 0 ? false : z9, (i2 & FileUtils.BUFFER_SIZE) != 0 ? true : z10, (i2 & 16384) != 0 ? 0 : i, (32768 & i2) != 0 ? EnumC61028NxI.OTHER : enumC61028NxI, (65536 & i2) != 0 ? false : z11, (131072 & i2) == 0 ? str2 : "", (262144 & i2) != 0 ? false : z12, (524288 & i2) != 0 ? false : z13, (1048576 & i2) != 0 ? C61022NxC.LIZLLL : z14, (2097152 & i2) != 0 ? C61022NxC.LJFF : j, (4194304 & i2) != 0 ? new ArrayList() : list, (8388608 & i2) != 0 ? false : z15, (16777216 & i2) != 0 ? false : z16, (33554432 & i2) != 0 ? null : str3, (67108864 & i2) != 0 ? null : obj, (134217728 & i2) != 0 ? false : z17, (268435456 & i2) != 0 ? false : z18, (536870912 & i2) != 0 ? false : z19, (1073741824 & i2) == 0 ? list2 : null, (i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? false : z20);
    }
}
