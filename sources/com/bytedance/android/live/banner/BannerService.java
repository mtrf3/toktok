package com.bytedance.android.live.banner;

import X.C0IZ;
import X.C141335gf;
import X.C29927Bop;
import X.C2R1;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73943T0h;
import X.CA3;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65784Pro;
import X.OSZ;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerFixMicRoomBannerRefreshSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerUseNewArchAnchorSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerUseNewArchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BannerService implements IBannerService, OnMessageListener {
    public final LongSparseArray<ArrayList<C0IZ>> LJLIL = new LongSparseArray<>();
    public final LongSparseArray<DataChannel> LJLILLLLZI = new LongSparseArray<>();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final Class<? extends LiveRecyclableWidget> pc() {
        return LiveGoalsWidget.class;
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final C65776Prg sj() {
        return C65352Pkq.LIZ(BroadcastPreviewBannerWidget.class);
    }

    public static boolean LIZ(Room room) {
        boolean z = false;
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.getBannerState() == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final LiveRecyclableWidget E80(RecyclableWidgetManager manager) {
        o.LJIIIZ(manager, "manager");
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            return manager.getRecyclableWidgetFromCacheOrNew(LiveGoalsWidget.class, null, new InterfaceC65784Pro<LiveRecyclableWidget>() { // from class: X.1ik
                @Override // X.InterfaceC65784Pro
                public final LiveRecyclableWidget invoke() {
                    return new LiveGoalsWidget();
                }
            });
        }
        return new LiveGoalsWidget();
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void H50(long j) {
        InRoomBannerManager.LJLIL.getClass();
        InRoomBannerManager.LIZ(j);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final Class<? extends LiveRecyclableWidget> YS(boolean z) {
        if (z) {
            if (LiveBannerUseNewArchAnchorSetting.INSTANCE.enable()) {
                return NewTopRightBannerWidget.class;
            }
            return TopRightBannerWidget.class;
        }
        if (LiveBannerUseNewArchSetting.INSTANCE.enable()) {
            return NewTopRightBannerWidget.class;
        }
        return TopRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void jj(Uri uri) {
        Object LIZ;
        Object LIZ2;
        String optString;
        String optString2;
        String optString3;
        String queryParameter = UriProtector.getQueryParameter(uri, "banner_id");
        try {
            LIZ = new JSONArray(UriProtector.getQueryParameter(uri, "banner_list"));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        JSONArray jSONArray = (JSONArray) LIZ;
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length >= 0) {
            int i = 0;
            while (true) {
                try {
                    LIZ2 = new JSONObject(jSONArray.optString(i));
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                JSONObject jSONObject = (JSONObject) LIZ2;
                BannerPanelItem.Companion.getClass();
                if (jSONObject != null && (optString = jSONObject.optString("title")) != null && (optString2 = jSONObject.optString("id")) != null && (optString3 = jSONObject.optString("schema_url")) != null) {
                    arrayList.add(new BannerPanelItem(optString, optString2, optString3));
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        OSZ osz = new OSZ(arrayList, queryParameter);
        List list = (List) osz.getFirst();
        String str = (String) osz.getSecond();
        if (list.isEmpty()) {
            return;
        }
        C73943T0h.LIZ().LIZIZ(new C2R1(list, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BaseMessage baseMessage;
        CommonMessageData commonMessageData;
        long j;
        DataChannel dataChannel;
        Room room;
        if (!(iMessage instanceof CR6) || (baseMessage = (BaseMessage) iMessage) == null || (commonMessageData = baseMessage.baseMessage) == null || (dataChannel = this.LJLILLLLZI.get((j = commonMessageData.roomId))) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || !(iMessage instanceof RoomVerifyMessage)) {
            return;
        }
        int i = ((RoomVerifyMessage) iMessage).verifyAction;
        if (i == 25) {
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus != null) {
                roomAuthStatus.setBannerState(1);
            }
            ArrayList<C0IZ> arrayList = this.LJLIL.get(j);
            if (arrayList == null) {
                return;
            }
            Iterator<C0IZ> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZ(LIZ(room));
            }
            return;
        }
        if (i != 24) {
            return;
        }
        RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
        if (roomAuthStatus2 != null) {
            roomAuthStatus2.setBannerState(2);
        }
        ArrayList<C0IZ> arrayList2 = this.LJLIL.get(j);
        if (arrayList2 == null) {
            return;
        }
        Iterator<C0IZ> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(LIZ(room));
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final boolean yj0(long j) {
        Room room;
        DataChannel dataChannel = this.LJLILLLLZI.get(j);
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        return LIZ(room);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void LLFFF(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.LJLILLLLZI.remove(room.getId());
            this.LJLIL.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void Vn(long j, C0IZ c0iz) {
        ArrayList<C0IZ> arrayList = this.LJLIL.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LJLIL.put(j, arrayList);
        }
        arrayList.add(c0iz);
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void bE(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.LJLILLLLZI.put(room.getId(), dataChannel);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.IBannerService
    public final void wS(LifecycleOwner lifecycleOwner, long j, boolean z) {
        LifecycleOwner lifecycleOwner2;
        Lifecycle lifecycle;
        CA3.LIZJ = SystemClock.elapsedRealtime();
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LJLIL;
        inRoomBannerManager.getClass();
        InRoomBannerManager.LJLILLLLZI = new WeakReference<>(lifecycleOwner);
        if (LiveBannerFixMicRoomBannerRefreshSetting.INSTANCE.getValue()) {
            InRoomBannerManager.LJLJI = j;
            InRoomBannerManager.LJLJJI = z;
        }
        WeakReference<LifecycleOwner> weakReference = InRoomBannerManager.LJLILLLLZI;
        if (weakReference != null && (lifecycleOwner2 = weakReference.get()) != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.addObserver(inRoomBannerManager);
        }
        InRoomBannerManager.LJLJI = j;
        InRoomBannerManager.LJLJJI = z;
        InRoomBannerManager.LIZIZ(j, z);
    }
}
