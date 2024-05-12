package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class PartnershipTask extends F9E {

    @InterfaceC65349Pkn("anchor_show_status")
    public int anchorShowStatus;

    @InterfaceC65349Pkn("anchor_start_promote_ts")
    public long anchorStartPromoteTs;

    @InterfaceC65349Pkn("android_age_limit")
    public int androidAgeLimit;

    @InterfaceC65349Pkn("android_share_ratio")
    public String androidShareRatio;

    @InterfaceC65349Pkn("android_unit_price")
    public String androidUnitPrice;

    @InterfaceC65349Pkn("apply_ts")
    public long applyTs;

    @InterfaceC65349Pkn("attribution_info")
    public TaskAttributionInfo attributionInfo;

    @InterfaceC65349Pkn("exclusive_task")
    public boolean exclusiveTask;

    @InterfaceC65349Pkn("game_id")
    public Long gameId;

    @InterfaceC65349Pkn("game_id_str")
    public String gameIdStr;

    @InterfaceC65349Pkn("game_tag_id")
    public long gameTagId;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("ios_age_limit")
    public int iosAgeLimit;

    @InterfaceC65349Pkn("ios_share_ratio")
    public String iosShareRatio;

    @InterfaceC65349Pkn("ios_unit_price")
    public String iosUnitPrice;

    @InterfaceC65349Pkn("last_android_share_ratio")
    public String lastAndroidShareRatio;

    @InterfaceC65349Pkn("last_android_unit_price")
    public String lastAndroidUnitPrice;

    @InterfaceC65349Pkn("last_ios_share_ratio")
    public String lastIosShareRatio;

    @InterfaceC65349Pkn("last_ios_unit_price")
    public String lastIosUnitPrice;

    @InterfaceC65349Pkn("last_price_update_timestamp")
    public long lastPriceUpdateTimestamp;

    @InterfaceC65349Pkn("open_gll")
    public int openGll;

    @InterfaceC65349Pkn("show_duration")
    public Long showDuration;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("task_description")
    public List<String> taskDescription;

    @InterfaceC65349Pkn("task_mode")
    public int taskMode;

    @InterfaceC65349Pkn("last_android_unit_price_usd")
    public String lastAndroidUnitPriceUsd = "";

    @InterfaceC65349Pkn("cpp_url")
    public String cppUrl = "";

    @InterfaceC65349Pkn("last_ios_unit_price_usd")
    public String lastIosUnitPriceUsd = "";

    @InterfaceC65349Pkn("android_unit_price_usd")
    public String androidUnitPriceUsd = "";

    @InterfaceC65349Pkn("ios_unit_price_usd")
    public String iosUnitPriceUsd = "";

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.id;
        String str = this.idStr;
        Long l2 = this.gameId;
        String str2 = this.gameIdStr;
        String str3 = this.iosUnitPrice;
        String str4 = this.androidUnitPrice;
        String str5 = this.iosShareRatio;
        String str6 = this.androidShareRatio;
        List<String> list = this.taskDescription;
        Long l3 = this.showDuration;
        return new Object[]{l, l, str, str, l2, l2, str2, str2, Integer.valueOf(this.taskMode), Integer.valueOf(this.status), str3, str3, str4, str4, str5, str5, str6, str6, list, list, list, l3, l3};
    }
}
