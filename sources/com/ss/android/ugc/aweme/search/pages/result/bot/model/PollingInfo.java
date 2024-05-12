package com.ss.android.ugc.aweme.search.pages.result.bot.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PollingInfo implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("enable")
    public final Boolean enable;

    @InterfaceC65349Pkn("interval_millisecond")
    public final Long interval;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    @InterfaceC65349Pkn("params")
    public final String params;

    @InterfaceC65349Pkn("path")
    public final String path;

    @InterfaceC65349Pkn("timeout_millisecond")
    public final Long timeout;

    /* JADX WARN: Multi-variable type inference failed */
    public PollingInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PollingInfo copy$default(PollingInfo pollingInfo, Boolean bool, Long l, Integer num, Long l2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = pollingInfo.enable;
        }
        if ((i & 2) != 0) {
            l = pollingInfo.interval;
        }
        if ((i & 4) != 0) {
            num = pollingInfo.limit;
        }
        if ((i & 8) != 0) {
            l2 = pollingInfo.timeout;
        }
        if ((i & 16) != 0) {
            str = pollingInfo.path;
        }
        if ((i & 32) != 0) {
            str2 = pollingInfo.params;
        }
        return pollingInfo.copy(bool, l, num, l2, str, str2);
    }

    public final PollingInfo copy(Boolean bool, Long l, Integer num, Long l2, String str, String str2) {
        return new PollingInfo(bool, l, num, l2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollingInfo)) {
            return false;
        }
        PollingInfo pollingInfo = (PollingInfo) obj;
        return o.LJ(this.enable, pollingInfo.enable) && o.LJ(this.interval, pollingInfo.interval) && o.LJ(this.limit, pollingInfo.limit) && o.LJ(this.timeout, pollingInfo.timeout) && o.LJ(this.path, pollingInfo.path) && o.LJ(this.params, pollingInfo.params);
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.interval;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.limit;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.timeout;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.path;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.params;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PollingInfo(enable=");
        LIZ.append(this.enable);
        LIZ.append(", interval=");
        LIZ.append(this.interval);
        LIZ.append(", limit=");
        LIZ.append(this.limit);
        LIZ.append(", timeout=");
        LIZ.append(this.timeout);
        LIZ.append(", path=");
        LIZ.append(this.path);
        LIZ.append(", params=");
        return q.LIZIZ(LIZ, this.params, ')', LIZ);
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Long getInterval() {
        return this.interval;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getPath() {
        return this.path;
    }

    public final Long getTimeout() {
        return this.timeout;
    }

    public PollingInfo(Boolean bool, Long l, Integer num, Long l2, String str, String str2) {
        this.enable = bool;
        this.interval = l;
        this.limit = num;
        this.timeout = l2;
        this.path = str;
        this.params = str2;
    }

    public /* synthetic */ PollingInfo(Boolean bool, Long l, Integer num, Long l2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 3000L : l, (i & 4) != 0 ? 30 : num, (i & 8) != 0 ? 1000L : l2, (i & 16) != 0 ? "" : str, (i & 32) == 0 ? str2 : "");
    }
}
