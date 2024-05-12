package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import java.util.List;

/* loaded from: classes17.dex */
public final class GameLiveFragment extends F9E {

    @InterfaceC65349Pkn("cover_url")
    public String coverUrl;

    @InterfaceC65349Pkn("create_time")
    public Long createTime;

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl;

    @InterfaceC65349Pkn("encode_status")
    public int encodeStatus;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("fragment_id")
    public Long fragmentId;

    @InterfaceC65349Pkn("fragment_id_str")
    public String fragmentIdStr;

    @InterfaceC65349Pkn("fragment_type")
    public Integer fragmentType;

    @InterfaceC65349Pkn("is_edit")
    public Integer isEdit;

    @InterfaceC65349Pkn("is_muted")
    public boolean isMuted;

    @InterfaceC65349Pkn("mark_time")
    public Long markTime;

    @InterfaceC65349Pkn("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

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

    @InterfaceC65349Pkn("show_info")
    public LiveFragmentShowInfo showInfo;

    @InterfaceC65349Pkn("sprite_list")
    public List<Sprite> spriteList;

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
        Long l = this.fragmentId;
        String str = this.fragmentIdStr;
        Long l2 = this.roomId;
        Integer num = this.fragmentType;
        String str2 = this.vid;
        String str3 = this.downloadUrl;
        String str4 = this.coverUrl;
        Long l3 = this.ownerUserId;
        Long l4 = this.startTime;
        Long l5 = this.endTime;
        String str5 = this.extra;
        Long l6 = this.createTime;
        Long l7 = this.updateTime;
        String str6 = this.title;
        Integer num2 = this.status;
        Long l8 = this.markTime;
        Long l9 = this.opTime;
        String str7 = this.streamUrl;
        String str8 = this.previewPicUrl;
        String str9 = this.roomIdStr;
        String str10 = this.ownerUserIdStr;
        Long l10 = this.replayCreateTime;
        Integer num3 = this.isEdit;
        return new Object[]{l, l, str, str, l2, l2, num, num, str2, str2, str3, str3, str4, str4, l3, l3, l4, l4, l5, l5, str5, str5, l6, l6, l7, l7, str6, str6, num2, num2, l8, l8, l9, l9, str7, str7, str8, str8, str9, str9, str10, str10, l10, l10, num3, num3};
    }

    public final boolean isValid() {
        Long l;
        if (!TextUtils.isEmpty(this.downloadUrl) && (l = this.fragmentId) != null && l.longValue() != 0 && !TextUtils.isEmpty(this.vid)) {
            return true;
        }
        return false;
    }
}
