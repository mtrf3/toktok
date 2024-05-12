package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.ReqSong;

/* loaded from: classes14.dex */
public final class KaraokeReqMessage extends CR6 {

    @InterfaceC65349Pkn("req_timestamp_seconds")
    public long reqTimestampSeconds;

    @InterfaceC65349Pkn("song_list")
    public List<ReqSong> songList;

    @InterfaceC65349Pkn("total_req_count")
    public long totalReqCount;

    public KaraokeReqMessage() {
        this.type = EnumC31509CYf.KARAOKE_REQ_MESSAGE;
        this.songList = new ArrayList();
    }
}
