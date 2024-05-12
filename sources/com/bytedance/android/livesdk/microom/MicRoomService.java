package com.bytedance.android.livesdk.microom;

import X.B83;
import X.BM1;
import X.C28210B5i;
import X.C29044Baa;
import X.C29291BeZ;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29432Bgq;
import X.C73943T0h;
import X.InterfaceC29405BgP;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class MicRoomService implements IMicRoomService {
    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> G90() {
        return MicRoomAudienceEnterWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> Rn0() {
        return MicRoomBackUpTipsWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> a20() {
        return MicRoomAudienceExitWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> pT() {
        return MicRoomUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Class<? extends LiveRecyclableWidget> sQ() {
        return MicRoomAnchorTimeControlWidget.class;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean Nl() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final Map<String, String> getRoomInfo() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add("room_id");
        arrayList.add("anchor_id");
        arrayList.add("actual_room_id");
        arrayList.add("actual_anchor_id");
        arrayList.add("live_lineup_type");
        arrayList.add("live_lineup_user_type");
        arrayList.add("live_lineup_change_type");
        BM1.LIZ(arrayList, hashMap);
        return hashMap;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean qt() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return false;
        }
        try {
            if (room.getOwner() != null) {
                InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                if (LIZIZ != null && room.getOwnerUserId() == ((C29374Bfu) LIZIZ).getCurrentUserId()) {
                    return BM1.LIZ;
                }
                if (room.roomLayout != 2) {
                    return false;
                }
                return true;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean rk() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.roomLayout == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final int zd0() {
        return Sf0((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class));
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final String getEnterFromMerge() {
        return BM1.LJIILL;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final String getEnterMethod() {
        return BM1.LJIILLIIL;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean oT() {
        return BM1.LIZ;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean O10(Room room) {
        long j;
        User user;
        if (room != null) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo != null && (user = officialChannelInfo.channelUser) != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            if (j == room.getOwnerUserId()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean Qo(Room room) {
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final int Sf0(Room room) {
        if (room != null && room.roomLayout == 2) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo != null && officialChannelInfo.roleType == 1) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final boolean jT(Room room) {
        if (room != null && room.roomLayout == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final void oM(long j) {
        C73943T0h.LIZ().LIZIZ(new C28210B5i(j, null, true));
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final void Y30(long j, long j2, boolean z) {
        C73943T0h.LIZ().LIZIZ(new C28210B5i(j, Long.valueOf(j2), z));
    }

    @Override // com.bytedance.android.live.microom.IMicRoomService
    public final LiveMicRoomInfoDialog ir0(Context context, boolean z, long j, Room room) {
        o.LJIIIZ(context, "context");
        LiveMicRoomInfoDialog liveMicRoomInfoDialog = new LiveMicRoomInfoDialog();
        liveMicRoomInfoDialog.LJLLJ = z;
        liveMicRoomInfoDialog.LJLLI = j;
        liveMicRoomInfoDialog.LJLJL = room;
        liveMicRoomInfoDialog.LJLJLLL = new C29432Bgq();
        liveMicRoomInfoDialog.LJLL = new C29291BeZ(j, room);
        liveMicRoomInfoDialog.LJLLILLLL = "video_head";
        liveMicRoomInfoDialog.LJLJLJ = C29306Beo.LIZIZ(context);
        return liveMicRoomInfoDialog;
    }
}
