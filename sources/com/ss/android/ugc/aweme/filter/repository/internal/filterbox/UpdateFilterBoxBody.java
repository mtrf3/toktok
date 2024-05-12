package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UpdateFilterBoxBody {

    @InterfaceC65349Pkn("access_key")
    public final String accessKey;

    @InterfaceC65349Pkn("app_version")
    public final String appVersion;

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("device_id")
    public final String deviceId;

    @InterfaceC65349Pkn("effect_ids")
    public final String effectIds;

    @InterfaceC65349Pkn("panel")
    public final String panel;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("type")
    public final int removeType;

    @InterfaceC65349Pkn("sdk_version")
    public final String sdkVersion;

    public UpdateFilterBoxBody(String effectIds, int i, String deviceId, String panel, String sdkVersion, String channel, String region, String accessKey, String appVersion) {
        o.LJIIIZ(effectIds, "effectIds");
        o.LJIIIZ(deviceId, "deviceId");
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(region, "region");
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(appVersion, "appVersion");
        this.effectIds = effectIds;
        this.removeType = i;
        this.deviceId = deviceId;
        this.panel = panel;
        this.sdkVersion = sdkVersion;
        this.channel = channel;
        this.region = region;
        this.accessKey = accessKey;
        this.appVersion = appVersion;
    }
}
