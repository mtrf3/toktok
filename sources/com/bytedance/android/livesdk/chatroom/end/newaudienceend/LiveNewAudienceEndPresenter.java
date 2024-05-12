package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import X.B83;
import X.BG2;
import X.BG3;
import X.BG4;
import X.BG5;
import X.BG6;
import X.BNU;
import X.C0K2;
import X.C0NB;
import X.C28233B6f;
import X.C29275BeJ;
import X.C29374Bfu;
import X.C29401Dk;
import X.C30868C9o;
import X.C32022ChW;
import X.InterfaceC27469AqH;
import Y.ARunnableS0S0001000_5;
import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class LiveNewAudienceEndPresenter implements WeakHandler.IHandler, InterfaceC27469AqH {
    public InterfaceC27469AqH mBackPressedListener;
    public WeakHandler mHandler = new WeakHandler(this);
    public C29275BeJ mLiveEndFollowHelper = new C29275BeJ();
    public BG4 mView;

    public static /* synthetic */ void lambda$onDestroy$0() {
    }

    @Override // X.InterfaceC27469AqH
    public boolean onBackPressed() {
        InterfaceC27469AqH interfaceC27469AqH = this.mBackPressedListener;
        if (interfaceC27469AqH != null && interfaceC27469AqH.onBackPressed()) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        WeakHandler weakHandler = this.mHandler;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(new ARunnableS0S0001000_5(0, 5));
        }
        C29275BeJ c29275BeJ = this.mLiveEndFollowHelper;
        if (c29275BeJ != null) {
            c29275BeJ.LIZ.LIZLLL();
        }
    }

    public LiveNewAudienceEndPresenter(BG4 bg4) {
        this.mView = bg4;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        BG4 bg4;
        int i = message.what;
        Object obj = message.obj;
        if (obj instanceof Exception) {
            if (i == 21 || i == 22 || !(obj instanceof C29401Dk)) {
                return;
            }
            C30868C9o.LJI(((C29401Dk) obj).getPrompt());
            return;
        }
        if (22 == i || 21 == i) {
            if (obj instanceof List) {
                try {
                    List<Room> list = (List) obj;
                    BG4 bg42 = this.mView;
                    if (bg42 != null) {
                        bg42.T1(list);
                        StringBuilder sb = new StringBuilder();
                        for (Room room : list) {
                            sb.append(room.getIdStr());
                            sb.append(":");
                            sb.append(room.getOwnerUserId());
                            sb.append(";");
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("room", sb.toString());
                        C0K2.LJII(0, "ttlive_live_end_recommend_live", hashMap);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C0NB.LJI("LiveEnd", th);
                    return;
                }
            }
            return;
        }
        if (i == 12) {
            Object obj2 = message.obj;
            if ((obj2 instanceof Room) && (bg4 = this.mView) != null) {
                bg4.R6((Room) obj2);
                this.mView.Ab((Room) message.obj);
            }
        }
    }

    public void setListener(InterfaceC27469AqH interfaceC27469AqH) {
        this.mBackPressedListener = interfaceC27469AqH;
    }

    public void syncRoomStatus(long j) {
        WeakHandler weakHandler = this.mHandler;
        if (weakHandler != null) {
            C32022ChW.LIZIZ().LIZ(weakHandler, new BNU(j), 12);
        }
    }

    public void followAnchor(Room room, String str) {
        if (room == null) {
            return;
        }
        this.mLiveEndFollowHelper.LIZ(room.getOwner().getId(), room, str, new BG6(this));
    }

    public void followOfficial(Room room, String str) {
        OfficialChannelInfo officialChannelInfo;
        User user;
        if (room == null || (officialChannelInfo = room.officialChannelInfo) == null || (user = officialChannelInfo.channelUser) == null) {
            return;
        }
        this.mLiveEndFollowHelper.LIZ(user.getId(), room, str, new BG5(this));
    }

    public void syncRecommendData(long j, long j2) {
        WeakHandler weakHandler = this.mHandler;
        if (weakHandler != null) {
            C28233B6f.LIZ(weakHandler, j, j2);
        }
    }

    public void syncUserPushStatus(HashMap<String, String> hashMap, BG3 bg3) {
        ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIZILJ("audienceEnd_show", hashMap).LIZ(new BG2(bg3));
    }
}
