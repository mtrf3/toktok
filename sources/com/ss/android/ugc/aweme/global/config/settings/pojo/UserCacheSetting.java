package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class UserCacheSetting {

    @InterfaceC65349Pkn("enable_ru_cache")
    public Integer enableRuCache;

    @InterfaceC65349Pkn("enable_ru_insert")
    public Integer enableRuInsert;

    @InterfaceC65349Pkn("ru_cache_intervals")
    public Long ruCacheIntervals;

    public Integer getEnableRuCache() {
        Integer num = this.enableRuCache;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getEnableRuInsert() {
        Integer num = this.enableRuInsert;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Long getRuCacheIntervals() {
        Long l = this.ruCacheIntervals;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }
}
