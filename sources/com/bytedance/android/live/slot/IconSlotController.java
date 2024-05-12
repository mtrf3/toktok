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
import X.BZR;
import X.C09690Zp;
import X.C09700Zq;
import X.C28246B6s;
import X.C28386BCc;
import X.C28387BCd;
import X.C28835BTj;
import X.C29927Bop;
import X.C31267COx;
import X.C31684Cc4;
import X.C31711CcV;
import X.C31713CcX;
import X.C31723Cch;
import X.C31724Cci;
import X.C31725Ccj;
import X.C31726Cck;
import X.C32537Cpp;
import X.EnumC29188Bcu;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.InterfaceC31095CIh;
import X.InterfaceC31336CRo;
import X.InterfaceC31710CcU;
import X.InterfaceC31715CcZ;
import X.InterfaceC31718Ccc;
import X.InterfaceC31722Ccg;
import X.X1D;
import Y.IDComparatorS33S0000000_5;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IconSlotController implements InterfaceC31095CIh {
    public DataChannel dataChannel;
    public ActivityC45651qj mActivity;
    public C31725Ccj mAggregateSlotWidgetWrapper;
    public InterfaceC31718Ccc mIconSlotView;
    public IMessageManager mMessageManager;
    public EnumC30736C4m mSlotID;
    public Queue<C31723Cch> mSlotWidgetPriorityQueue;
    public EnumC31700CcK mStrategy;
    public Map<String, Object> mDataContainer = new HashMap();
    public Map<EnumC30736C4m, InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m>> mIconSlotMap = new HashMap();
    public Map<String, InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m>> mWidgetMap = new HashMap();
    public Map<EnumC30736C4m, IIconSlot.SlotViewModel> mIconSlotViewModelMap = new HashMap();
    public WeakHandler mHandler = new WeakHandler(this);
    public A72 mIWidgetGate = new C31713CcX(this);

    private void initLiveEnterInfos() {
        String str;
        long j;
        BJE bje;
        BJE bje2;
        BJL bjl;
        Map<String, String> map;
        String str2;
        BJL bjl2;
        Map<String, String> map2;
        BJM bjm = BJM.LJLIL;
        putData("param_live_enter_from_merge", BJM.LJFF());
        putData("param_live_enter_method_merge", BJM.LJIIIIZZ());
        putData("param_live_action_type", BJM.LIZLLL());
        putData("param_live_rec_content_id", bjm.LIZ());
        putData("param_live_rec_content_type", bjm.LIZIZ());
        C28246B6s LJIJI = BJM.LJIJI();
        String str3 = "";
        if (LJIJI == null || (bjl2 = LJIJI.LJFF) == null || (map2 = bjl2.LJJIL) == null || (str = map2.get("search_id")) == null) {
            str = "";
        }
        putData("param_search_id", str);
        C28246B6s LJIJI2 = BJM.LJIJI();
        if (LJIJI2 != null && (bjl = LJIJI2.LJFF) != null && (map = bjl.LJJIL) != null && (str2 = map.get("search_result_id")) != null) {
            str3 = str2;
        }
        putData("param_search_result_id", str3);
        C28246B6s LJIJI3 = BJM.LJIJI();
        long j2 = -1;
        if (LJIJI3 != null && (bje2 = LJIJI3.LJ) != null) {
            j = bje2.LJII;
        } else {
            j = -1;
        }
        putData("param_live_begin_time", Long.valueOf(j));
        C28246B6s LJIJI4 = BJM.LJIJI();
        if (LJIJI4 != null && (bje = LJIJI4.LJ) != null) {
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
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mDataContainer
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.IconSlotController.getDataContainerLiveShowTimeMap():java.util.Map");
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

    @Override // X.InterfaceC31095CIh, X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        InterfaceC31715CcZ interfaceC31715CcZ;
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onCreate(new Bundle());
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onCreate(new Bundle());
        }
    }

    @Override // X.InterfaceC31095CIh, X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        InterfaceC31715CcZ interfaceC31715CcZ;
        List<EnumC29188Bcu> LLJJJ;
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
            if (WatchMemoryLeakOpt.INSTANCE.valueForEc() && this.mActivity != null && c31723Cch.LJ && (LLJJJ = c31723Cch.LIZIZ.LLJJJ()) != null && LLJJJ.contains(EnumC29188Bcu.LIVE_ROOM_EC_LIVE_STATUS)) {
                IIconSlot.SlotViewModel viewModel = IIconSlot.SlotViewModel.hv0(c31723Cch.LIZIZ, this.mActivity);
                ActivityC45651qj activity = this.mActivity;
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(viewModel, "viewModel");
                Map<EnumC29188Bcu, MutableLiveData<Object>> map = viewModel.LJLLLLLL;
                if (map != null) {
                    LiveData liveData = (LiveData) ((ConcurrentHashMap) map).get(EnumC29188Bcu.LIVE_ROOM_EC_LIVE_STATUS);
                    if (liveData != null) {
                        liveData.removeObservers(activity);
                    }
                }
            }
            c31723Cch.LIZIZ.onDestroy();
            c31723Cch.LIZIZ.onDispose();
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onDestroy();
            this.mAggregateSlotWidgetWrapper.LIZ.onDispose();
        }
        this.mAggregateSlotWidgetWrapper = null;
        if (WatchMemoryLeakOpt.INSTANCE.valueForEc()) {
            this.dataChannel = null;
            this.mMessageManager = null;
        }
    }

    @Override // X.InterfaceC31095CIh, X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        InterfaceC31715CcZ interfaceC31715CcZ;
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onPause();
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onPause();
        }
    }

    @Override // X.InterfaceC31095CIh, X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        InterfaceC31715CcZ interfaceC31715CcZ;
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onResume();
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onResume();
        }
    }

    @Override // X.InterfaceC31095CIh, X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        InterfaceC31715CcZ interfaceC31715CcZ;
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onStart();
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onStart();
        }
    }

    @Override // X.InterfaceC31095CIh, X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        InterfaceC31715CcZ interfaceC31715CcZ;
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        Iterator<C31723Cch> it = queue.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ.onStop();
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onStop();
        }
    }

    @Override // X.InterfaceC31095CIh
    public Map<String, Object> getDataContainer() {
        return this.mDataContainer;
    }

    private void doShowMultiSlot(C31723Cch c31723Cch) {
        if (c31723Cch.LIZIZ.LLJJJIL() instanceof IIconSlot) {
            IIconSlot.SlotViewModel hv0 = IIconSlot.SlotViewModel.hv0(c31723Cch.LIZIZ, this.mActivity);
            this.mIconSlotView.LJLLLL(c31723Cch, hv0);
            BZR.LIZ(this.mActivity, this.dataChannel, c31723Cch.LIZIZ.LLJJJ(), hv0);
            c31723Cch.LIZIZ.LLJJJJ(hv0, this.mIWidgetGate);
            c31723Cch.LJ = true;
        }
    }

    public void doShowSingleSlot(C31723Cch c31723Cch) {
        if (c31723Cch.LIZIZ.LLJJJIL() instanceof IIconSlot) {
            IIconSlot.SlotViewModel hv0 = IIconSlot.SlotViewModel.hv0(c31723Cch.LIZIZ, this.mActivity);
            this.mIconSlotView.LJLLL(c31723Cch.LIZIZ, hv0);
            BZR.LIZ(this.mActivity, this.dataChannel, c31723Cch.LIZIZ.LLJJJ(), hv0);
            c31723Cch.LIZIZ.LLJJJJ(hv0, this.mIWidgetGate);
            c31723Cch.LJ = true;
        }
    }

    public void doShowSlotAggregate(List<C31723Cch> list) {
        if (this.mAggregateSlotWidgetWrapper == null) {
            C31725Ccj c31725Ccj = new C31725Ccj();
            this.mAggregateSlotWidgetWrapper = c31725Ccj;
            C09700Zq LIZ = C09700Zq.LIZ();
            EnumC30736C4m enumC30736C4m = this.mSlotID;
            C09690Zp c09690Zp = LIZ.LIZ;
            c09690Zp.LIZ();
            c31725Ccj.LIZ = ((InterfaceC31722Ccg) ((HashMap) c09690Zp.LIZJ).get(enumC30736C4m)).LIZJ(this.mActivity, this.mSlotID);
            C31684Cc4.LIZJ("IconSlotController", this.mAggregateSlotWidgetWrapper.LIZ, "prepareToShow", this.mDataContainer);
            this.mAggregateSlotWidgetWrapper.LIZ.LLJJLIIIJLLLLLLLZ(this.mDataContainer, new C31724Cci());
        }
        for (C31723Cch c31723Cch : list) {
            if (!c31723Cch.LJ) {
                IIconSlot.SlotViewModel hv0 = IIconSlot.SlotViewModel.hv0(c31723Cch.LIZIZ, this.mActivity);
                BZR.LIZ(this.mActivity, this.dataChannel, c31723Cch.LIZIZ.LLJJJ(), hv0);
                c31723Cch.LIZIZ.LLJJJJ(hv0, this.mIWidgetGate);
                c31723Cch.LJ = true;
                this.mAggregateSlotWidgetWrapper.LIZ.LIZIZ(c31723Cch.LIZIZ, hv0);
            }
        }
        IIconSlot.SlotViewModel hv02 = IIconSlot.SlotViewModel.hv0(this.mAggregateSlotWidgetWrapper.LIZ, this.mActivity);
        BZR.LIZ(this.mActivity, this.dataChannel, this.mAggregateSlotWidgetWrapper.LIZ.LLJJJ(), hv02);
        C31725Ccj c31725Ccj2 = this.mAggregateSlotWidgetWrapper;
        if (!c31725Ccj2.LIZIZ) {
            c31725Ccj2.LIZIZ = true;
        }
        c31725Ccj2.LIZ.LLJJJJ(hv02, this.mIWidgetGate);
    }

    public IIconSlot getIconSlot(EnumC30736C4m enumC30736C4m) {
        InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> slotWidget = getSlotWidget(enumC30736C4m);
        if (slotWidget == null) {
            return null;
        }
        return slotWidget.LLJJJIL();
    }

    public InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> getSlotWidget(EnumC30736C4m enumC30736C4m) {
        return this.mIconSlotMap.get(enumC30736C4m);
    }

    @Override // X.InterfaceC31095CIh
    public InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> getSlotWidgetByBizType(String str) {
        return this.mWidgetMap.get(str);
    }

    public IIconSlot.SlotViewModel getViewModel(EnumC30736C4m enumC30736C4m) {
        return this.mIconSlotViewModelMap.get(enumC30736C4m);
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
        }
    }

    public void mediateSlots(Object obj) {
        C31723Cch c31723Cch = (C31723Cch) obj;
        Iterator<C31723Cch> it = this.mSlotWidgetPriorityQueue.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            C31723Cch next = it.next();
            if (next.LIZLLL && !next.LIZJ) {
                next.LIZIZ.onDestroy();
                next.LIZIZ.onDispose();
                it.remove();
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1 && this.mStrategy == EnumC31700CcK.AGGREGATE) {
            doShowSlotAggregate(arrayList);
        } else if (c31723Cch.LIZJ && !c31723Cch.LJ) {
            doShowMultiSlot(c31723Cch);
        }
        Map<String, String> dataContainerLiveShowTimeMap = getDataContainerLiveShowTimeMap();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(SystemClock.uptimeMillis());
        LIZ.append("");
        dataContainerLiveShowTimeMap.put("PARAM_LIVE_SLOT_ON_CREATE", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        InterfaceC31715CcZ interfaceC31715CcZ;
        Queue<C31723Cch> queue = this.mSlotWidgetPriorityQueue;
        if (queue == null) {
            return;
        }
        for (C31723Cch c31723Cch : queue) {
            if (c31723Cch.LIZJ) {
                c31723Cch.LIZIZ.onMessage(iMessage);
            }
        }
        C31725Ccj c31725Ccj = this.mAggregateSlotWidgetWrapper;
        if (c31725Ccj != null && (interfaceC31715CcZ = c31725Ccj.LIZ) != null) {
            interfaceC31715CcZ.onMessage(iMessage);
        }
    }

    @Override // X.InterfaceC31095CIh
    public IconSlotController setDataChannel(DataChannel dataChannel) {
        this.dataChannel = dataChannel;
        if (dataChannel != null) {
            this.mMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        }
        return this;
    }

    @Override // X.InterfaceC31095CIh
    public /* bridge */ /* synthetic */ InterfaceC31095CIh setDataChannel(DataChannel dataChannel) {
        setDataChannel(dataChannel);
        return this;
    }

    @Override // X.InterfaceC31095CIh
    public void load(ActivityC45651qj activityC45651qj, EnumC30736C4m enumC30736C4m) {
        boolean z;
        this.mSlotWidgetPriorityQueue = new PriorityBlockingQueue(3, new IDComparatorS33S0000000_5(3));
        List<C31726Cck> LIZJ = C09700Zq.LIZ().LIZJ(enumC30736C4m);
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
            LIZ.append("");
            liveShowTimeMap.put("param_live_slot_load_time", X1D.LIZIZ(LIZ));
            getDataContainerLiveShowTimeMap().putAll(getLiveShowTimeMap());
            putData("param_extra_auto_route_schema", this.dataChannel.kv0(C28387BCd.class));
            putData("param_extra_auto_open_product_bag", this.dataChannel.kv0(BCO.class));
            putData("param_extra_opt_auto_route_schema_routing_timing", this.dataChannel.kv0(BCM.class));
            putData("param_extra_auto_open_product_bag_params", this.dataChannel.kv0(BDY.class));
            putData("param_extra_ec_common_extra_param", this.dataChannel.kv0(BCK.class));
            if (this.dataChannel.kv0(BCX.class) == LiveMode.LIVE_VOICE) {
                z = true;
            } else {
                z = false;
            }
            putData("param_is_hidden_ec_widget", Boolean.valueOf(z));
        }
        Iterator it = ((ArrayList) LIZJ).iterator();
        while (it.hasNext()) {
            InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LIZLLL = ((C31726Cck) it.next()).LIZ.LIZLLL(activityC45651qj, enumC30736C4m);
            if (LIZLLL != null) {
                this.mWidgetMap.put(LIZLLL.LIZ(), LIZLLL);
                C31723Cch c31723Cch = new C31723Cch();
                c31723Cch.LIZ = C31267COx.LIZJ(LIZLLL.LLJJJJLIIL(), LIZLLL.LIZ());
                c31723Cch.LIZIZ = LIZLLL;
                this.mSlotWidgetPriorityQueue.offer(c31723Cch);
                if (this.mMessageManager != null && LIZLLL.getMessageType() != null) {
                    for (Integer num : LIZLLL.getMessageType()) {
                        if (num.intValue() > 0) {
                            this.mMessageManager.addMessageListener(num.intValue(), this);
                        }
                    }
                }
                C31684Cc4.LIZJ("IconSlotController", LIZLLL, "prepareToShow", this.mDataContainer);
                LIZLLL.LLJJLIIIJLLLLLLLZ(this.mDataContainer, new C31711CcV(this, c31723Cch));
            }
        }
    }

    @Override // X.InterfaceC31095CIh
    public void putData(String str, Object obj) {
        this.mDataContainer.put(str, obj);
    }

    public IconSlotController(ActivityC45651qj activityC45651qj, InterfaceC31718Ccc interfaceC31718Ccc, EnumC30736C4m enumC30736C4m, EnumC31700CcK enumC31700CcK) {
        this.mActivity = activityC45651qj;
        this.mIconSlotView = interfaceC31718Ccc;
        this.mSlotID = enumC30736C4m;
        this.mStrategy = enumC31700CcK;
        interfaceC31718Ccc.LJJII(enumC31700CcK);
    }
}
