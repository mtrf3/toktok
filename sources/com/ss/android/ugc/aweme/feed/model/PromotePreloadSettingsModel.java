package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromotePreloadSettingsModel {

    @InterfaceC65349Pkn("allowSchemaList")
    public final List<String> allowSchemaList;

    @InterfaceC65349Pkn("biz")
    public final String biz;

    @InterfaceC65349Pkn("denySchemaList")
    public final List<Object> denySchemaList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("expiredTimeInSeconds")
    public final long expiredTimeInSeconds;

    @InterfaceC65349Pkn("preloadTimeInterval")
    public final long preloadTimeInterval;

    @InterfaceC65349Pkn("volumn")
    public final long volumn;

    public PromotePreloadSettingsModel(boolean z, long j, long j2, List<String> allowSchemaList, String biz, long j3, List<? extends Object> denySchemaList) {
        o.LJIIIZ(allowSchemaList, "allowSchemaList");
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(denySchemaList, "denySchemaList");
        this.enable = z;
        this.preloadTimeInterval = j;
        this.expiredTimeInSeconds = j2;
        this.allowSchemaList = allowSchemaList;
        this.biz = biz;
        this.volumn = j3;
        this.denySchemaList = denySchemaList;
    }
}
