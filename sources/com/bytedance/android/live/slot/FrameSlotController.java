package com.bytedance.android.live.slot;

import X.A72;
import X.ActivityC45651qj;
import X.BCK;
import X.BCM;
import X.BCO;
import X.BCT;
import X.BCX;
import X.BDY;
import X.BJE;
import X.BJL;
import X.BJM;
import X.C09700Zq;
import X.C28246B6s;
import X.C28386BCc;
import X.C28387BCd;
import X.C28835BTj;
import X.C29927Bop;
import X.C31267COx;
import X.C31684Cc4;
import X.C31712CcW;
import X.C31714CcY;
import X.C31723Cch;
import X.C31726Cck;
import X.C32537Cpp;
import X.EnumC31701CcL;
import X.EnumC31730Cco;
import X.InterfaceC31336CRo;
import X.InterfaceC31710CcU;
import X.InterfaceC31721Ccf;
import X.X1D;
import Y.IDComparatorS33S0000000_5;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes6.dex */
public class FrameSlotController implements GenericLifecycleObserver, WeakHandler.IHandler, OnMessageListener {
    public DataChannel dataChannel;
    public ActivityC45651qj mActivity;
    public InterfaceC31721Ccf mFrameSlotView;
    public boolean mIsAnchor;
    public IMessageManager mMessageManager;
    public Room mRoom;
    public long mRoomId;
    public Queue<C31723Cch> mSlotWidgetPriorityQueue;
    public EnumC31701CcL mStrategy;
    public Map<EnumC31730Cco, InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco>> mFrameSlotMap = new HashMap();
    public Map<EnumC31730Cco, IFrameSlot.SlotViewModel> mFrameSlotViewModelMap = new HashMap();
    public WeakHandler mHandler = new WeakHandler(this);
    public Map<String, Object> mSlotDataContainer = new HashMap();
    public A72 mIWidgetGate = new C31714CcY(this);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    private void initLiveEnterInfos() {
        long j;
        BJE bje;
        BJE bje2;
        BJM bjm = BJM.LJLIL;
        putData("param_live_enter_from_merge", BJM.LJFF());
        putData("param_live_enter_method_merge", BJM.LJIIIIZZ());
        putData("param_live_action_type", BJM.LIZLLL());
        putData("param_live_rec_content_id", bjm.LIZ());
        putData("param_live_rec_content_type", bjm.LIZIZ());
        C28246B6s LJIJI = BJM.LJIJI();
        long j2 = -1;
        if (LJIJI != null && (bje2 = LJIJI.LJ) != null) {
            j = bje2.LJII;
        } else {
            j = -1;
        }
        putData("param_live_begin_time", Long.valueOf(j));
        C28246B6s LJIJI2 = BJM.LJIJI();
        if (LJIJI2 != null && (bje = LJIJI2.LJ) != null) {
            j2 = bje.LJIIIIZZ;
        }
        putData("param_live_begin_time_real", Long.valueOf(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> getDataContainerLiveShowTimeMap() {
        /*
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mSlotDataContainer
            java.lang.String r2 = "param_live_show_time"
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto Lf
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L1a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.putData(r2, r1)
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.FrameSlotController.getDataContainerLiveShowTimeMap():java.util.Map");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.HashMap<java.lang.String, java.lang.String>, O] */
    public HashMap<String, String> getLiveShowTimeMap() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.kv0(C28386BCc.class);
        if (hashMap == null) {
            ?? hashMap2 = new HashMap();
            ((C32537Cpp) this.dataChannel.gv0(C28386BCc.class)).LIZ = hashMap2;
            return hashMap2;
        }
        return hashMap;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onCreate(new Bundle());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.mHandler.removeCallbacksAndMessages(null);
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        for (C31723Cch c31723Cch : queue) {
            c31723Cch.LIZIZ.onDestroy();
            c31723Cch.LIZIZ.onDispose();
        }
        if (WatchMemoryLeakOpt.INSTANCE.valueForEc()) {
            this.mMessageManager = null;
            this.dataChannel = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onStop();
        }
    }

    public Map<String, Object> getDataContainer() {
        return this.mSlotDataContainer;
    }

    public void doShowSlot(C31723Cch c31723Cch) {
        if (c31723Cch.LIZIZ.LLJJJIL() instanceof IFrameSlot) {
            IFrameSlot.SlotViewModel hv0 = IFrameSlot.SlotViewModel.hv0(c31723Cch.LIZIZ, this.mActivity);
            this.mFrameSlotView.LJLJLJ(c31723Cch, hv0);
            c31723Cch.LIZIZ.LLJJJJ(hv0, this.mIWidgetGate);
            c31723Cch.LJ = true;
        }
    }

    public IFrameSlot getFrameSlot(EnumC31730Cco enumC31730Cco) {
        InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> slotWidget = getSlotWidget(enumC31730Cco);
        if (slotWidget == null) {
            return null;
        }
        return slotWidget.LLJJJIL();
    }

    public InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> getSlotWidget(EnumC31730Cco enumC31730Cco) {
        return this.mFrameSlotMap.get(enumC31730Cco);
    }

    public IFrameSlot.SlotViewModel getViewModel(EnumC31730Cco enumC31730Cco) {
        return this.mFrameSlotViewModelMap.get(enumC31730Cco);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what != 1 || ((C31723Cch) message.obj).LIZIZ.LLJJJJJIL()) {
            return;
        }
        mediateSlots(message.obj);
    }

    public void init(InterfaceC31336CRo interfaceC31336CRo) {
        DataChannel provideDataChannel = interfaceC31336CRo.provideDataChannel();
        this.dataChannel = provideDataChannel;
        if (provideDataChannel != null) {
            this.mMessageManager = (IMessageManager) provideDataChannel.kv0(C29927Bop.class);
            this.mRoom = (Room) this.dataChannel.kv0(RoomChannel.class);
            this.mIsAnchor = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        }
    }

    public void mediateSlots(Object obj) {
        C31723Cch c31723Cch = (C31723Cch) obj;
        Iterator<C31723Cch> it = this.mSlotWidgetPriorityQueue.iterator();
        while (it.hasNext()) {
            C31723Cch next = it.next();
            if (next.LIZLLL && !next.LIZJ) {
                next.LIZIZ.onDestroy();
                next.LIZIZ.onDispose();
                it.remove();
            }
        }
        if (c31723Cch != null && c31723Cch.LIZJ && !c31723Cch.LJ) {
            doShowSlot(c31723Cch);
        }
        Map<String, String> dataContainerLiveShowTimeMap = getDataContainerLiveShowTimeMap();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(SystemClock.uptimeMillis());
        LIZ.append("");
        dataContainerLiveShowTimeMap.put("PARAM_LIVE_SLOT_ON_CREATE", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        for (C31723Cch c31723Cch : queue) {
            if (c31723Cch.LIZJ) {
                c31723Cch.LIZIZ.onMessage(iMessage);
            }
        }
    }

    public void load(ActivityC45651qj activityC45651qj, EnumC31730Cco enumC31730Cco) {
        int i;
        Integer num;
        String str;
        boolean z;
        BJL bjl;
        Map<String, String> map;
        String str2;
        BJL bjl2;
        Map<String, String> map2;
        this.mSlotWidgetPriorityQueue = new PriorityBlockingQueue(3, new IDComparatorS33S0000000_5(1));
        List<C31726Cck> LIZIZ = C09700Zq.LIZ().LIZIZ(enumC31730Cco);
        initLiveEnterInfos();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            putData("param_room", dataChannel.kv0(RoomChannel.class));
            AdLiveEnterRoomConfig LJII = C28835BTj.LJII(this.dataChannel);
            if (LJII != null) {
                putData("param_effect_ad_extra", LJII.LIZIZ());
                putData("param_effect_ad_id", LJII.adId);
            }
            putData("param_enter_from_effect_ad_bool", this.dataChannel.kv0(BCT.class));
            HashMap<String, String> liveShowTimeMap = getLiveShowTimeMap();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(System.currentTimeMillis());
            String str3 = "";
            LIZ.append("");
            liveShowTimeMap.put("param_live_slot_load_time", X1D.LIZIZ(LIZ));
            getDataContainerLiveShowTimeMap().putAll(getLiveShowTimeMap());
            putData("param_extra_auto_route_schema", this.dataChannel.kv0(C28387BCd.class));
            putData("param_extra_auto_open_product_bag", this.dataChannel.kv0(BCO.class));
            putData("param_extra_opt_auto_route_schema_routing_timing", this.dataChannel.kv0(BCM.class));
            putData("param_extra_auto_open_product_bag_params", this.dataChannel.kv0(BDY.class));
            putData("param_extra_ec_common_extra_param", this.dataChannel.kv0(BCK.class));
            C28246B6s LJIJI = BJM.LJIJI();
            if (LJIJI == null || (bjl2 = LJIJI.LJFF) == null || (map2 = bjl2.LJJIL) == null || (str = map2.get("search_id")) == null) {
                str = "";
            }
            putData("param_search_id", str);
            C28246B6s LJIJI2 = BJM.LJIJI();
            if (LJIJI2 != null && (bjl = LJIJI2.LJFF) != null && (map = bjl.LJJIL) != null && (str2 = map.get("search_result_id")) != null) {
                str3 = str2;
            }
            putData("param_search_result_id", str3);
            if (this.dataChannel.kv0(BCX.class) == LiveMode.LIVE_VOICE) {
                z = true;
            } else {
                z = false;
            }
            putData("param_is_hidden_ec_widget", Boolean.valueOf(z));
        }
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LJFF = ((C31726Cck) it.next()).LIZ.LJFF(activityC45651qj, enumC31730Cco);
            if (LJFF != null) {
                C31723Cch c31723Cch = new C31723Cch();
                EnumC31730Cco LLJJJJLIIL = LJFF.LLJJJJLIIL();
                String LIZ2 = LJFF.LIZ();
                Map map3 = (Map) ((HashMap) C31267COx.LIZIZ).get(LLJJJJLIIL);
                if (map3 == null || (num = (Integer) map3.get(LIZ2)) == null) {
                    i = C31267COx.LIZLLL;
                } else {
                    i = num.intValue();
                }
                c31723Cch.LIZ = i;
                c31723Cch.LIZIZ = LJFF;
                this.mSlotWidgetPriorityQueue.offer(c31723Cch);
                if (this.mMessageManager != null && LJFF.getMessageType() != null) {
                    for (Integer num2 : LJFF.getMessageType()) {
                        if (num2.intValue() > 0) {
                            this.mMessageManager.addMessageListener(num2.intValue(), this);
                        }
                    }
                }
                C31684Cc4.LIZJ("FrameSlotController", LJFF, "prepareToShow", this.mSlotDataContainer);
                LJFF.LLJJLIIIJLLLLLLLZ(this.mSlotDataContainer, new C31712CcW(this, c31723Cch, LJFF));
            }
        }
    }

    public void putData(String str, Object obj) {
        this.mSlotDataContainer.put(str, obj);
    }

    public FrameSlotController(ActivityC45651qj activityC45651qj, InterfaceC31721Ccf interfaceC31721Ccf, EnumC31701CcL enumC31701CcL) {
        this.mActivity = activityC45651qj;
        this.mFrameSlotView = interfaceC31721Ccf;
        this.mStrategy = enumC31701CcL;
        interfaceC31721Ccf.LJLIL(enumC31701CcL);
    }
}
