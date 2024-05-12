package com.bytedance.android.livesdk.livesetting.hybrid;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class SparkReuseConfig {

    @InterfaceC65349Pkn("allow_schema_list")
    public String[] allowSchemaList;

    @InterfaceC65349Pkn("deny_schema_list")
    public String[] denySchemaList;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("match_rule")
    public int matchRule;

    @InterfaceC65349Pkn("volume")
    public int volume = Integer.MAX_VALUE;

    @InterfaceC65349Pkn("biz")
    public String biz = "";

    @InterfaceC65349Pkn("expired_time_in_seconds")
    public int expiredTimeInSeconds = -1;
}
