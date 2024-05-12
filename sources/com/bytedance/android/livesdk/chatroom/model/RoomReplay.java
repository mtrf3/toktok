package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class RoomReplay {

    @InterfaceC65349Pkn("available")
    public boolean available;

    @InterfaceC65349Pkn("cover")
    public ImageModel cover;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("fan_ticket")
    public long fanTicket;

    @InterfaceC65349Pkn("finish_time")
    public long finishTime;

    @InterfaceC65349Pkn("fragment_count")
    public long fragmentCount;

    @InterfaceC65349Pkn("generate_duration")
    public long generateDuration;

    @InterfaceC65349Pkn("live_mode")
    public int liveMode;

    @InterfaceC65349Pkn("mark_count")
    public long markCount;

    @InterfaceC65349Pkn("moment_gen_stats")
    public long momentGenStats;

    @InterfaceC65349Pkn("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

    @InterfaceC65349Pkn("punish_type")
    public long punishType;

    @InterfaceC65349Pkn("push_status")
    public long pushStatus;

    @InterfaceC65349Pkn("replay_prompt")
    public int replayPrompt;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("total_user")
    public long totalUser;

    @InterfaceC65349Pkn("video_info")
    public VideoInfo videoInfo;

    @InterfaceC65349Pkn("watch_status")
    public int watchStatus;

    @InterfaceC65349Pkn("id")
    public String id = "";

    @InterfaceC65349Pkn("moments")
    public List<RoomReplayMoment> moments = new ArrayList();

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("fragment_id")
    public String fragmentId = "";

    @InterfaceC65349Pkn("play_url")
    public String playUrl = "";

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl = "";

    @InterfaceC65349Pkn("play_url_vcodec")
    public String playUrlVcodec = "";

    @InterfaceC65349Pkn("failed_reason")
    public String failedReason = "";

    @InterfaceC65349Pkn("m3u8_url")
    public String m3u8Url = "";

    @InterfaceC65349Pkn("vid")
    public String vid = "";

    @InterfaceC65349Pkn("fragment_count_with_type")
    public List<FragmentTypeCount> fragmentCountWithType = new ArrayList();

    @InterfaceC65349Pkn("sprite_list")
    public List<SpriteImageItem> spriteList = new ArrayList();
}
