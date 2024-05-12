package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.google.gson.o;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;

/* renamed from: X.Caq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31608Caq {
    public static RoomStruct LIZ(Room room) {
        boolean z;
        StreamUrl streamUrl;
        String str = null;
        if (room == null) {
            return null;
        }
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.id = room.getId();
        roomStruct.ownerUserId = room.getOwnerUserId();
        StreamUrlStruct LIZIZ = LIZIZ(room.getStreamUrl(), room.getMultiStreamDefaultQualitySdkKey());
        if (LIZIZ == null) {
            return null;
        }
        if (room.multiStreamScene == 1 && (streamUrl = room.multiStreamUrl) != null) {
            LiveCoreSDKData liveCoreSDKData = streamUrl.liveCoreSDKData;
            if (liveCoreSDKData != null && liveCoreSDKData.getDefaultQuality() != null) {
                str = room.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
            }
            roomStruct.multiStreamUrl = LIZIZ(room.multiStreamUrl, str);
            roomStruct.multiStreamId = room.multiStreamId;
            roomStruct.multiStreamIdStr = room.multiStreamIdStr;
            roomStruct.multiStreamScene = room.multiStreamScene;
        }
        roomStruct.stream_url = LIZIZ;
        roomStruct.isThirdParty = room.isThirdParty;
        roomStruct.isScreenshot = room.isScreenshot;
        if (room.getStreamType() == LiveMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        roomStruct.liveTypeAudio = z;
        if (room.getStreamType() == LiveMode.LIVE_VOICE) {
            roomStruct.liveRoomMode = 7;
        }
        return roomStruct;
    }

    public static StreamUrlStruct LIZIZ(StreamUrl streamUrl, String str) {
        LiveCoreSDKData liveCoreSDKData;
        String LJJIFFI;
        if (streamUrl == null) {
            return null;
        }
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        streamUrlStruct.sid = streamUrl.id;
        streamUrlStruct.provider = streamUrl.provider;
        streamUrlStruct.rtmp_push_url = streamUrl.LIZ();
        String str2 = streamUrl.rtmpPullUrl;
        streamUrlStruct.rtmp_pull_url = str2;
        if (TextUtils.isEmpty(str2) && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null) {
            String streamData = liveCoreSDKData.getPullData().getStreamData();
            if (streamData != null) {
                try {
                    new o();
                    LJJIFFI = o.LIZ(streamData).LJIIZILJ().LJJIJIL("data").LJJIJIL("origin").LJJIJIL("main").LJJIJ("flv").LJJIFFI();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                streamUrlStruct.rtmp_pull_url = LJJIFFI;
            }
            LJJIFFI = null;
            streamUrlStruct.rtmp_pull_url = LJJIFFI;
        }
        if (TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return null;
        }
        streamUrlStruct.mDefaultResolution = str;
        return streamUrlStruct;
    }
}
