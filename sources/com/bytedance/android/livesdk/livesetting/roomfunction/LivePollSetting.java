package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C47261Igj;
import X.C61878OQg;
import X.X1D;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

@SettingsKey("live_room_poll_type")
/* loaded from: classes6.dex */
public final class LivePollSetting {
    public static final LivePollSetting INSTANCE = new LivePollSetting();

    @Group(isDefault = true, value = "default group")
    public static final List<String> DEFAULT = C61878OQg.INSTANCE;

    public final List<String> getOptionList() {
        List<String> list = (List) SettingsManager.INSTANCE.getValueSafely(LivePollSetting.class);
        if (list != null && list.size() > 1) {
            return list;
        }
        return C47261Igj.LJJIJIIJI("😁", "😭");
    }

    public final String getFirstOption() {
        return (String) ListProtector.get(getOptionList(), 0);
    }

    public final String getOptionListString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[\"");
        LIZ.append(getFirstOption());
        LIZ.append("\", \"");
        LIZ.append(getSecondOption());
        LIZ.append("\"]");
        return X1D.LIZIZ(LIZ);
    }

    public final String getSecondOption() {
        return (String) ListProtector.get(getOptionList(), 1);
    }

    public final boolean enable(DataChannel dataChannel) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enablePoll != 1) {
            return false;
        }
        return true;
    }
}
