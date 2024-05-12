package com.bytedance.android.livesdk.liveroom;

import X.B4G;
import X.B4H;
import X.B57;
import X.B59;
import X.B5F;
import X.B5S;
import X.B5T;
import X.B83;
import X.BL6;
import X.C0K2;
import X.C0NB;
import X.C28643BLz;
import X.C29374Bfu;
import X.C80797VnN;
import X.CN1;
import X.EnumC28203B5b;
import X.X1D;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxSameFlowSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class RoomListener implements ISubController {
    public LiveRoomFragment fragment;
    public B4G mRoomAction;
    public B4H mRoomEventListener;

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    private String getLiveEnterMerge() {
        return B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.enterFromMerge;
    }

    private String getLiveEnterMethod() {
        return B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.enterMethod;
    }

    public boolean initRoomEnvironment() {
        if (this.mRoomAction == null) {
            this.mRoomAction = new B5F(this);
        }
        if (this.mRoomEventListener == null) {
            this.mRoomEventListener = new B59(this);
        }
        if (this.mRoomAction == null || !((C29374Bfu) B83.LIZ().LIZIZ()).LJIIJJI()) {
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", getLiveEnterMerge());
        hashMap.put("enter_method", getLiveEnterMethod());
        hashMap.put("source", "live room fg");
        C0K2.LJII(1, "ttlive_minor_mode_live", hashMap);
        Event event = new Event("room_fg_enter_room_fail", 33028, EnumC28203B5b.BussinessApiCall);
        event.LIZIZ("ftc or delete by age gate.");
        C28643BLz c28643BLz = B57.LIZ;
        c28643BLz.LIZ().LIZIZ(event);
        B5S.LIZJ(c28643BLz.LIZ().mEnterRoomConfig, B5T.IS_MINOR_AGE);
        ((B5F) this.mRoomAction).LIZ("error");
        return false;
    }

    public B4G getRoomAction() {
        return this.mRoomAction;
    }

    public B4H getRoomEventListener() {
        return this.mRoomEventListener;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
        initRoomEnvironment();
    }

    public RoomListener(LiveRoomFragment liveRoomFragment) {
        this.fragment = liveRoomFragment;
    }

    public void trySendExitPosition(String str) {
        LiveRoomFragment liveRoomFragment;
        C80797VnN c80797VnN;
        long j;
        if (InboxSameFlowSetting.INSTANCE.getEnable() && !"error".equals(str)) {
            try {
                if ("message".equals(getLiveEnterMerge()) && "live_cover".equals(getLiveEnterMethod()) && (liveRoomFragment = this.fragment) != null && (c80797VnN = liveRoomFragment.LLF) != null) {
                    EnterRoomConfig LIZLLL = liveRoomFragment.LLFFF.LIZLLL(c80797VnN.getCurrentItem());
                    if (LIZLLL != null) {
                        j = LIZLLL.mRoomsData.roomId;
                    } else {
                        j = -1;
                    }
                    ((IHostWatch) CN1.LIZ(IHostWatch.class)).recordExitRoomId(j);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void trySendRoomLists(String str) {
        if (!GameLiveBottomBarSetting.INSTANCE.isEnable() || "error".equals(str)) {
            return;
        }
        try {
            if (getLiveEnterMethod() != null && getLiveEnterMerge() != null && this.fragment != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(getLiveEnterMerge());
                LIZ.append("_");
                LIZ.append(getLiveEnterMethod());
                if (BL6.LIZIZ(X1D.LIZIZ(LIZ))) {
                    this.fragment.Nl();
                }
            }
        } catch (Exception e) {
            C0NB.LJI("RoomListener", e);
        }
    }
}
