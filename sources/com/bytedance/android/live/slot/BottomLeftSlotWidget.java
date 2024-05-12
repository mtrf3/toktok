package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.BNK;
import X.C15380j0;
import X.C29306Beo;
import X.C29701Eo;
import X.C31684Cc4;
import X.C31688Cc8;
import X.C31698CcI;
import X.C31723Cch;
import X.C47121t6;
import X.C6H;
import X.C72400SbE;
import X.CN1;
import X.EnumC30208BtM;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.InterfaceC30205BtJ;
import X.InterfaceC31095CIh;
import X.InterfaceC31710CcU;
import X.InterfaceC31718Ccc;
import X.XKQ;
import Y.ACListenerS31S0300000_5;
import Y.ALAdapterS4S0100000_5;
import Y.AObjectS42S0101000_5;
import Y.AObserverS36S0400000_5;
import Y.AObserverS58S0101000_2;
import Y.AObserverS66S0300000_5;
import Y.AObserverS69S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDComparatorS33S0000000_5;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes6.dex */
public class BottomLeftSlotWidget extends RoomRecycleWidget implements WeakHandler.IHandler, InterfaceC31718Ccc {
    public static final List<C31698CcI> LLD;
    public InterfaceC31095CIh LJLIL;
    public ImageView LJLILLLLZI;
    public FrameLayout LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public ImageView LJLJJLL;
    public C47121t6 LJLJL;
    public C29701Eo LJLJLJ;
    public IIconSlot.SlotViewModel LJLJLLL;
    public Queue<C31723Cch> LJLL;
    public Map<C31723Cch, IIconSlot.SlotViewModel> LJLLI;
    public EnumC31700CcK LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public long LJLLLL;
    public ActivityC45651qj LJLLLLLL;
    public C72400SbE LJLZ;
    public ViewGroup.LayoutParams LJZ;
    public final ALAdapterS4S0100000_5 LJZI = new ALAdapterS4S0100000_5(this, 20);
    public int LJZL = 0;
    public int LL = 0;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        ArrayList arrayList = new ArrayList();
        LLD = arrayList;
        arrayList.add(new C31698CcI(C15380j0.LIZ(30.0f), C15380j0.LIZ(30.0f), 0, 255));
        arrayList.add(new C31698CcI(C15380j0.LIZ(28.0f), C15380j0.LIZ(28.0f), C15380j0.LIZ(6.0f), 204));
        arrayList.add(new C31698CcI(C15380j0.LIZ(26.0f), C15380j0.LIZ(26.0f), C15380j0.LIZ(12.0f), 102));
    }

    public final void LJLZ() {
        this.LJLJJLL.setVisibility(8);
        this.LJLJJL.setVisibility(8);
        this.LJLJJI.setVisibility(8);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        boolean z;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Boolean.TRUE.equals(dataChannel.kv0(BNK.class))) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLJ = z;
        if (z) {
            return R.layout.dp0;
        }
        return R.layout.doz;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        XKQ xkq;
        IIconSlot.SlotViewModel slotViewModel = this.LJLJLLL;
        if (slotViewModel != null) {
            slotViewModel.gv0(this);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(EcLiveBarrageEnable.class, Boolean.TRUE);
        }
        Queue<C31723Cch> queue = this.LJLL;
        if (queue != null) {
            ((PriorityBlockingQueue) queue).clear();
        }
        Map<C31723Cch, IIconSlot.SlotViewModel> map = this.LJLLI;
        if (map != null) {
            Iterator it = ((HashMap) map).values().iterator();
            while (it.hasNext()) {
                ((IIconSlot.SlotViewModel) it.next()).gv0(this);
            }
            ((HashMap) this.LJLLI).clear();
        }
        C72400SbE c72400SbE = this.LJLZ;
        if (c72400SbE != null && (xkq = c72400SbE.LIZIZ) != null) {
            xkq.LIZIZ(null);
        }
        this.LJLIL.onDestroy();
        getLifecycle().removeObserver(this.LJLIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel);
        if (pk != null) {
            pk.LJIIJ(EnumC30208BtM.BOTTOM_LEFT_SLOT, this.dataChannel);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel);
        if (pk != null) {
            pk.LJIJI(EnumC30208BtM.BOTTOM_LEFT_SLOT, this.dataChannel);
        }
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJJII(EnumC31700CcK enumC31700CcK) {
        this.LJLLILLLL = enumC31700CcK;
    }

    public final void LJZI(InterfaceC31710CcU interfaceC31710CcU) {
        show();
        HashMap hashMap = new HashMap();
        if (!this.LJLLL) {
            C31688Cc8.LIZ(this.LJLLLL, hashMap, this.LJLIL.getDataContainer());
            C31684Cc4.LJFF(interfaceC31710CcU, hashMap);
        }
        C31684Cc4.LIZJ("BottomLeftSlotWidget", interfaceC31710CcU, "slot visible change, visible: true", hashMap);
        this.LJLLL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        onLoad(null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLILLLLZI = (ImageView) findViewById(R.id.ldg);
        this.LJLJI = (FrameLayout) findViewById(R.id.ldh);
        this.LJLJJL = (TextView) findViewById(R.id.ld8);
        this.LJLJJLL = (ImageView) findViewById(R.id.ld6);
        this.LJLJJI = findViewById(R.id.ldc);
        this.LJLJLJ = (C29701Eo) findViewById(R.id.ld9);
        if (this.LJLLJ) {
            this.LJLJL = (C47121t6) findViewById(R.id.ldm);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        LJLZ();
        LifecycleOwner lifecycleOwner = null;
        this.LJLJJLL.setImageDrawable(null);
        this.LJLJJL.setText((CharSequence) null);
        this.LJLILLLLZI.setImageDrawable(null);
        C47121t6 c47121t6 = this.LJLJL;
        if (c47121t6 != null) {
            c47121t6.setText((CharSequence) null);
        }
        if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
            this.LJLJI.post(new ARunnableS41S0100000_5(this, 41));
            Object obj = this.context;
            if (obj instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) obj;
            }
            this.dataChannel.ov0(lifecycleOwner, CommentCompressOnSmallEvent.class, new AObjectS42S0101000_5(0, this, 5));
        }
        this.LJLLLL = SystemClock.uptimeMillis();
        this.LJLLLLLL = C29306Beo.LIZIZ(getContext());
        ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
        ActivityC45651qj activityC45651qj = this.LJLLLLLL;
        EnumC30736C4m enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
        InterfaceC31095CIh createIconSlotController = iSlotService.createIconSlotController(activityC45651qj, this, enumC30736C4m, EnumC31700CcK.PRIORITY);
        this.LJLIL = createIconSlotController;
        createIconSlotController.setDataChannel(this.dataChannel);
        this.LJLL = new PriorityBlockingQueue(3, new IDComparatorS33S0000000_5(0));
        this.LJLLI = new HashMap();
        this.LJLIL.load(this.LJLLLLLL, enumC30736C4m);
        getLifecycle().addObserver(this.LJLIL);
        if (getView() != null) {
            getView().setTag("BottomLeftSlotWidget");
        }
        this.dataChannel.lv0(this, PublicScreenNewMessageVisible.class, new AObjectS42S0101000_5(0, this, 7));
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLL(InterfaceC31710CcU interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        this.LJLJLLL = slotViewModel;
        if (slotViewModel == null || getView() == null) {
            return;
        }
        this.LJLJLLL.LJLIL.postValue(Boolean.TRUE);
        slotViewModel.LJLILLLLZI.observe(this, new AObserverS66S0300000_5(this, slotViewModel, interfaceC31710CcU, 3));
        LJZL(interfaceC31710CcU, slotViewModel);
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLLL(C31723Cch c31723Cch, IIconSlot.SlotViewModel slotViewModel) {
        ((PriorityBlockingQueue) this.LJLL).add(c31723Cch);
        ((HashMap) this.LJLLI).put(c31723Cch, slotViewModel);
        EnumC31700CcK enumC31700CcK = this.LJLLILLLL;
        if (enumC31700CcK == EnumC31700CcK.FIRST) {
            slotViewModel.LJLILLLLZI.observe(this, new AObserverS66S0300000_5(this, slotViewModel, c31723Cch, 0));
        } else if (enumC31700CcK == EnumC31700CcK.LAST) {
            slotViewModel.LJLILLLLZI.observe(this, new AObserverS66S0300000_5(this, slotViewModel, c31723Cch, 1));
        } else {
            if (enumC31700CcK != EnumC31700CcK.PRIORITY) {
                return;
            }
            slotViewModel.LJLILLLLZI.observe(this, new AObserverS66S0300000_5(this, slotViewModel, c31723Cch, 2));
        }
    }

    public final void LJZ(InterfaceC31710CcU interfaceC31710CcU, boolean z) {
        if (z) {
            LJZI(interfaceC31710CcU);
        } else {
            hide();
            C31684Cc4.LIZIZ("BottomLeftSlotWidget", interfaceC31710CcU, "slot visible change, visible: false");
        }
    }

    public final void LJZL(InterfaceC31710CcU interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        IIconSlot iIconSlot = (IIconSlot) interfaceC31710CcU.LLJJJIL();
        slotViewModel.LJLL.observe(this, new AObserverS69S0200000_5(this, slotViewModel, 1));
        slotViewModel.LJLJJL.observe(this, new AObserverS69S0200000_5(this, slotViewModel, 2));
        slotViewModel.LJLJJI.observe(this, new AObserverS69S0200000_5(this, slotViewModel, 3));
        slotViewModel.LJLJL.observe(this, new AObserverS69S0200000_5(this, slotViewModel, 4));
        slotViewModel.LJLJLJ.observe(this, new AObserverS69S0200000_5(this, slotViewModel, 5));
        slotViewModel.LJLLLL.observe(this, new AObserverS36S0400000_5(this, slotViewModel, iIconSlot, interfaceC31710CcU, 1));
        if (this.LJLLJ) {
            slotViewModel.LJLLI.observe(this, new AObserverS69S0200000_5(this, slotViewModel, 7));
        }
        slotViewModel.LJLLL.observe(this, new AObserverS66S0300000_5(this, slotViewModel, interfaceC31710CcU, 4));
        slotViewModel.LJZL.observe(this, new AObserverS58S0101000_2(0, this, 0));
        C6H.LIZ(new ACListenerS31S0300000_5(this, iIconSlot, interfaceC31710CcU, 4), getView());
    }
}
