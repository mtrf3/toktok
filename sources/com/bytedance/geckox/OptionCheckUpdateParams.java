package com.bytedance.geckox;

import X.AbstractC61537ODd;
import X.C59125NIj;
import X.C61571OEl;
import X.EnumC61516OCi;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class OptionCheckUpdateParams {
    public C59125NIj cacheConfig;
    public String from;
    public boolean lazyUpdate;
    public AbstractC61537ODd listener;
    public EnumC61516OCi loopLevel;
    public boolean lowStorageUpdate;
    public boolean enableThrottle = true;
    public Map<String, Map<String, Object>> customParam = new HashMap();
    public boolean enableRetry = true;
    public boolean enableDownloadAutoRetry = true;
    public int updatePriority = 1;
    public boolean innerRequestByUser = false;
    public boolean isExpireCleanGroup = false;
    public boolean ignoreLowStorageLimit = false;

    /* loaded from: classes11.dex */
    public interface ChannelUpdatePriority {
    }

    /* loaded from: classes11.dex */
    public interface CustomValue {
        Object getValue();
    }

    public boolean isIgnoreLowStorageLimit() {
        if (this.ignoreLowStorageLimit && C61571OEl.LIZ.LJIIIZ) {
            return true;
        }
        return false;
    }

    public C59125NIj getCacheConfig() {
        return this.cacheConfig;
    }

    public int getChannelUpdatePriority() {
        return this.updatePriority;
    }

    public Map<String, Map<String, Object>> getCustomParam() {
        return this.customParam;
    }

    public String getFrom() {
        return this.from;
    }

    public boolean getInnerRequestByUser() {
        return this.innerRequestByUser;
    }

    public AbstractC61537ODd getListener() {
        return this.listener;
    }

    public EnumC61516OCi getLoopLevel() {
        return this.loopLevel;
    }

    public boolean isEnableDownloadAutoRetry() {
        return this.enableDownloadAutoRetry;
    }

    public boolean isEnableRetry() {
        return this.enableRetry;
    }

    public boolean isEnableThrottle() {
        return this.enableThrottle;
    }

    public boolean isExpireCleanGroup() {
        return this.isExpireCleanGroup;
    }

    public boolean isLazyUpdate() {
        return this.lazyUpdate;
    }

    public boolean isLowStorageUpdate() {
        return this.lowStorageUpdate;
    }

    public OptionCheckUpdateParams setCacheConfig(C59125NIj c59125NIj) {
        this.cacheConfig = c59125NIj;
        return this;
    }

    public OptionCheckUpdateParams setChannelUpdatePriority(int i) {
        this.updatePriority = i;
        return this;
    }

    public OptionCheckUpdateParams setCustomParam(Map<String, Map<String, Object>> map) {
        this.customParam = map;
        return this;
    }

    public OptionCheckUpdateParams setEnableDownloadAutoRetry(boolean z) {
        this.enableDownloadAutoRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableRetry(boolean z) {
        this.enableRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableThrottle(boolean z) {
        this.enableThrottle = z;
        return this;
    }

    public OptionCheckUpdateParams setExpireCleanGroup(boolean z) {
        this.isExpireCleanGroup = z;
        return this;
    }

    public OptionCheckUpdateParams setFrom(String str) {
        this.from = str;
        return this;
    }

    public OptionCheckUpdateParams setIgnoreLowStorageLimit(boolean z) {
        this.ignoreLowStorageLimit = z;
        return this;
    }

    public OptionCheckUpdateParams setInnerRequestByUser(boolean z) {
        this.innerRequestByUser = z;
        return this;
    }

    public OptionCheckUpdateParams setLazyUpdate(boolean z) {
        this.lazyUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setListener(AbstractC61537ODd abstractC61537ODd) {
        this.listener = abstractC61537ODd;
        return this;
    }

    public OptionCheckUpdateParams setLoopLevel(EnumC61516OCi enumC61516OCi) {
        this.loopLevel = enumC61516OCi;
        return this;
    }

    public OptionCheckUpdateParams setLowStorageUpdate(boolean z) {
        this.lowStorageUpdate = z;
        return this;
    }
}
