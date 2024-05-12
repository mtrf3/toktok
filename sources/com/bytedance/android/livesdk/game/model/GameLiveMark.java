package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class GameLiveMark extends F9E {

    @InterfaceC65349Pkn("cover_url")
    public String coverUrl;

    @InterfaceC65349Pkn("create_time")
    public Long createTime;

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("is_edit")
    public Integer isEdit;

    @InterfaceC65349Pkn("mark_id")
    public Long markId;

    @InterfaceC65349Pkn("mark_id_str")
    public String markIdStr;

    @InterfaceC65349Pkn("mark_time")
    public Long markTime;

    @InterfaceC65349Pkn("op_time")
    public Long opTime;

    @InterfaceC65349Pkn("owner_user_id")
    public Long ownerUserId;

    @InterfaceC65349Pkn("owner_user_id_str")
    public String ownerUserIdStr;

    @InterfaceC65349Pkn("preview_pic_url")
    public String previewPicUrl;

    @InterfaceC65349Pkn("replay_create_time")
    public Long replayCreateTime;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("room_id_str")
    public String roomIdStr;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("status")
    public Integer status;

    @InterfaceC65349Pkn("stream_url")
    public String streamUrl;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("update_time")
    public Long updateTime;

    @InterfaceC65349Pkn("vid")
    public String vid;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.markId;
        String str = this.markIdStr;
        Long l2 = this.roomId;
        String str2 = this.roomIdStr;
        String str3 = this.vid;
        String str4 = this.coverUrl;
        String str5 = this.downloadUrl;
        String str6 = this.streamUrl;
        Long l3 = this.ownerUserId;
        String str7 = this.ownerUserIdStr;
        Long l4 = this.markTime;
        Long l5 = this.startTime;
        Long l6 = this.endTime;
        Long l7 = this.replayCreateTime;
        String str8 = this.title;
        Integer num = this.status;
        Integer num2 = this.isEdit;
        Long l8 = this.opTime;
        String str9 = this.previewPicUrl;
        String str10 = this.extra;
        Long l9 = this.createTime;
        Long l10 = this.updateTime;
        return new Object[]{l, l, str, str, l2, l2, str2, str2, str3, str3, str4, str4, str5, str5, str6, str6, l3, l3, str7, str7, l4, l4, l5, l5, l6, l6, l7, l7, str8, str8, num, num, num2, num2, l8, l8, str9, str9, str10, str10, l9, l9, l10, l10};
    }
}
