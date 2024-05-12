package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class RoomFeedCellStruct implements Serializable {

    @InterfaceC65349Pkn("deduplication_type")
    public int deduplicationType;

    @InterfaceC65349Pkn("distance")
    public String distance;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("fans_struct")
    public FansStruct mFansStruct;

    @InterfaceC65349Pkn("rawdata")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public NewLiveRoomStruct newLiveRoomData;

    @InterfaceC65349Pkn("room")
    public LiveRoomStruct room;

    @InterfaceC65349Pkn("tag")
    public String tag;

    @InterfaceC65349Pkn("tag_id")
    public long tagId;

    @InterfaceC65349Pkn("type")
    public int type;

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            if (LiveRoomStruct.isValid(this.room)) {
                LiveRoomStruct liveRoomStruct = this.room;
                liveRoomStruct.liveRoomMode = this.newLiveRoomData.liveRoomMode;
                return liveRoomStruct;
            }
            NewLiveRoomStruct newLiveRoomStruct = this.newLiveRoomData;
            if (newLiveRoomStruct != null) {
                newLiveRoomStruct.init();
                LiveRoomStruct roomStructConstructor = this.newLiveRoomData.roomStructConstructor();
                this.room = roomStructConstructor;
                return roomStructConstructor;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setMockNewLiveRoomData(NewLiveRoomStruct newLiveRoomStruct) {
        this.newLiveRoomData = newLiveRoomStruct;
    }
}
