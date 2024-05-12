package com.bytedance.android.livesdk.function;

import X.B57;
import X.B83;
import X.BJ9;
import X.C1EW;
import X.C1PK;
import X.C28403BCt;
import X.C28657BMn;
import X.C28835BTj;
import X.C29162BcU;
import X.C29374Bfu;
import X.C30079BrH;
import X.C30326BvG;
import X.C39685Fhp;
import X.C73666Sve;
import X.C78847Ux1;
import X.InterfaceC29856Bng;
import X.Q7L;
import Y.ARunnableS17S0101000_13;
import Y.AfS17S0001000_5;
import Y.AfS36S0101000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class UserPermissionCheckWidget extends LiveRecyclableWidget {
    public Room LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public C73666Sve LJLJJL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        Room room = this.LJLIL;
        if (room != null) {
            long j = 0;
            if (room.getId() > 0) {
                EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
                C28657BMn.LIZIZ("check permission error", -105L, -1L, 0L, 0L, "null", C78847Ux1.LJJJI(enterRoomConfig), this.dataChannel);
                C29162BcU c29162BcU = C29162BcU.LIZJ;
                long id = this.LJLIL.getId();
                String requestId = this.LJLIL.getRequestId();
                String str = this.LJLILLLLZI;
                String str2 = this.LJLJI;
                String str3 = this.LJLJJI;
                String str4 = enterRoomConfig.mLogData.liveReason;
                String str5 = enterRoomConfig.mRoomsData.shareFromUserId;
                HashMap<String, String> LJI = C28835BTj.LJI(C28835BTj.LIZIZ(null, this.dataChannel, ""));
                if ("draw".equals(str) && "live_detail-hourly_rank".equals(str3)) {
                    str3 = i0.LJFF(str3, str);
                }
                C39685Fhp c39685Fhp = new C39685Fhp();
                c39685Fhp.LIZJ("common_label_list", str2);
                c39685Fhp.LIZJ("enter_source", str3);
                c39685Fhp.LIZJ("request_id", requestId);
                c39685Fhp.LIZJ("enter_type", str);
                c39685Fhp.LIZJ("live_reason", str4);
                c39685Fhp.LIZJ("enter_from_uid_by_shared", str5);
                HashMap<String, String> hashMap = (HashMap) c39685Fhp.LJLILLLLZI;
                hashMap.putAll(LJI);
                C30326BvG.LIZ.post(new ARunnableS17S0101000_13(0, c29162BcU, 11), null);
                if (((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
                    j = 1;
                }
                ((InterfaceC29856Bng) C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).enterRoom(id, 1L, j, hashMap)).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZJ(new AfS17S0001000_5(1, 11), new C1PK(2, this));
                return;
            }
        }
        C28657BMn.LIZIZ("check permission error", -105L, -1L, 0L, 0L, "null", CardStruct.IStatusCode.DEFAULT, this.dataChannel);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C73666Sve c73666Sve = this.LJLJJL;
        if (c73666Sve != null && !c73666Sve.isDisposed()) {
            this.LJLJJL.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LJLIL = (Room) this.dataChannel.kv0(RoomChannel.class);
        BJ9 bj9 = (BJ9) this.dataChannel.kv0(C28403BCt.class);
        if (bj9 != null) {
            this.LJLILLLLZI = bj9.LJJII;
            this.LJLJI = bj9.LJIIIZ;
            this.LJLJJI = bj9.LJJIII;
        }
        this.LJLJJL = (C73666Sve) ((C29374Bfu) B83.LIZ().LIZIZ()).LJI.LJIIIZ(new AfS36S0101000_5(2, this, 57));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C30079BrH) {
                    LJLZ();
                }
            }
        }
    }
}
