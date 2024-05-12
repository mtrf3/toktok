package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Nev, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC59889Nev extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "biz", required = true)
    String getBiz();

    @InterfaceC36563EWp(isGetter = true, keyPath = "cacheKey", required = true)
    String getCacheKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "keepAliveWhenUsed", required = false)
    Boolean getKeepAliveWhenUsed();

    @InterfaceC36563EWp(isGetter = true, keyPath = "matchCacheRegex", required = false)
    String getMatchCacheRegex();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maxCacheKeyCount", required = false)
    Number getMaxCacheKeyCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maxPrerenderCountPerCacheKey", required = false)
    Number getMaxPrerenderCountPerCacheKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "now", required = false)
    Boolean getNow();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pendingLoad", required = false)
    Boolean getPendingLoad();
}
