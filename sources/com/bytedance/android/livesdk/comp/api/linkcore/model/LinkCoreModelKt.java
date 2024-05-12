package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C025908h;
import X.C29044Baa;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkCoreModelKt {
    public static final boolean currentUserIsAnchor() {
        User user;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (user == null || user.getId() != C025908h.LIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean isAnchor(RtcUserInfo rtcUserInfo) {
        User user;
        o.LJIIIZ(rtcUserInfo, "<this>");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (user == null || user.getId() != rtcUserInfo.getUserId()) {
            return false;
        }
        return true;
    }

    public static final boolean playerIsCurrentUserOrNull(Player player) {
        if (player == null || player.uid == C025908h.LIZ()) {
            return true;
        }
        return false;
    }
}
