package com.bytedance.android.live.publicscreen.impl.widget;

import X.C28329B9x;
import X.C28429BDt;
import X.C29306Beo;
import X.C30326BvG;
import X.C31255COl;
import X.C31319CQx;
import X.C79864VWa;
import X.CN1;
import X.CQQ;
import X.CSW;
import X.InterfaceC29980Bpg;
import X.InterfaceC31781Cdd;
import X.InterfaceC36821cU;
import X.InterfaceC88472Yns;
import Y.ARunnableS41S0100000_5;
import Y.IDDListenerS392S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.IsFromLandscapeData;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightenChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecyclePublicScreenWidgetSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameBottomGradientAlphaSettingSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFreeGestureSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenHeightMaskAdaptivelySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PortraitPublicScreenWidget extends PublicScreenWidget {
    public GestureDetector LLIIJI;
    public InterfaceC29980Bpg LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public int[] LLIILZL;
    public float[] LLIIZ;
    public boolean LLIL;
    public final ARunnableS41S0100000_5 LLILII = new ARunnableS41S0100000_5(this, 36);
    public InterfaceC36821cU LLILIL;

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.CRA
    public final boolean wg0() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LJZI() {
        C31255COl c31255COl = this.LLIIII.LIZ;
        if (c31255COl != null) {
            c31255COl.setHasFixedSize(true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecyclePublicScreenWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        float[] fArr;
        super.onUnload();
        this.LLIL = false;
        int[] iArr = this.LLIILZL;
        if (iArr != null && (fArr = this.LLIIZ) != null) {
            InterfaceC36821cU interfaceC36821cU = this.LLILIL;
            if (interfaceC36821cU != null) {
                interfaceC36821cU.LJIJJLI(fArr, iArr);
            }
            this.LLIILZL = null;
            this.LLIIZ = null;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        boolean z;
        super.onInit(objArr);
        this.LLIILII = LivePublicScreenHeightMaskAdaptivelySetting.enableMaskAlpha(this.dataChannel);
        C79864VWa c79864VWa = this.LJLIL;
        if (LivePublicScreenHeightMaskAdaptivelySetting.heightenWhenScroll(this.dataChannel) || LivePublicScreenHeightMaskAdaptivelySetting.shortenWhenLowHeat(this.dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        c79864VWa.setFixTouchWhenScroll(z);
        if (LivePublicScreenFreeGestureSetting.enableFreeGesture()) {
            this.LLIIJI = new GestureDetector(this.context, new CSW(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback;
        IPublicScreenContextWidget iPublicScreenContextWidget;
        ViewTreeObserver viewTreeObserver;
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback2;
        IPublicScreenContextWidget iPublicScreenContextWidget2;
        C31319CQx c31319CQx;
        Room room;
        Hashtag hashtag;
        Long l;
        C28429BDt c28429BDt;
        Object obj;
        ViewGroup container;
        CQQ cqq;
        super.onLoad(objArr);
        int[] gradientAlphaList = LiveGameBottomGradientAlphaSettingSetting.getGradientAlphaList();
        int i = 1;
        if (gradientAlphaList == null || gradientAlphaList.length == 0) {
            z = false;
        } else {
            z = true;
        }
        InterfaceC88472Yns interfaceC88472Yns = null;
        Object[] objArr2 = 0;
        if (z && (((c31319CQx = this.LJLLI) == null || (cqq = c31319CQx.LLIILZL) == null || !cqq.LJFF) && (room = this.LLD) != null && (hashtag = room.hashtag) != null && (l = hashtag.id) != null && l.longValue() == 5 && (c28429BDt = (C28429BDt) this.dataChannel.kv0(VideoOrientationChangeChannel.class)) != null && (!c28429BDt.LIZ()))) {
            LayeredElementContext layeredElementContext = getLayeredElementContext();
            if (layeredElementContext != null && (container = layeredElementContext.getContainer()) != null) {
                obj = container.findViewById(R.id.if2);
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.shapecontrol.ShapeControllable");
            InterfaceC36821cU interfaceC36821cU = (InterfaceC36821cU) obj;
            this.LLILIL = interfaceC36821cU;
            this.LLIILZL = interfaceC36821cU.getGradientColors();
            this.LLIIZ = interfaceC36821cU.getGradientPositions();
            interfaceC36821cU.LJIJJLI(LiveGameBottomGradientAlphaSettingSetting.getGradientPosArray(), LiveGameBottomGradientAlphaSettingSetting.getGradientAlphaList());
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, LiveExtendedScreenStatus.class, new AqS171S0100000_5(this, 92));
            dataChannel.ov0(this, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 93));
        }
        enableSubWidgetManager(new WidgetCreateTimeUtil(interfaceC88472Yns, i, objArr2 == true ? 1 : 0), C30326BvG.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C28329B9x.LIZJ(getContext()));
        if (C29306Beo.LJJII(this.dataChannel) || (this.LLD != null && ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).xg(this.LLD))) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if ((interfaceC31781Cdd instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC31781Cdd) != null && (iPublicScreenContextWidget = (IPublicScreenContextWidget) recyclableWidgetCallback.load(R.id.hq2, MainScreenCommentPinnedWidget.class, true)) != null) {
                iPublicScreenContextWidget.LJLIL = this.LJLLI.LLIILZL;
            }
        }
        CQQ cqq2 = this.LJLLI.LLIILZL;
        if (!cqq2.LJFF && cqq2.LIZIZ() == 2) {
            InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
            if ((interfaceC31781Cdd2 instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback2 = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC31781Cdd2) != null && (iPublicScreenContextWidget2 = (IPublicScreenContextWidget) recyclableWidgetCallback2.load(R.id.dyg, GreetingAnimWidget.class, true)) != null) {
                iPublicScreenContextWidget2.LJLIL = this.LJLLI.LLIILZL;
            }
        }
        if (LivePublicScreenFreeGestureSetting.enableFreeGesture()) {
            this.LLIIJLIL = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LLD.getId());
        }
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && o.LJ(dataChannel2.kv0(IsFromLandscapeData.class), Boolean.TRUE)) {
                View view = getView();
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new IDDListenerS392S0100000_5(this, 2));
                }
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.rv0(IsFromLandscapeData.class, Boolean.FALSE);
                }
            }
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.rv0(IsFromPortraitData.class, Boolean.TRUE);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLIIJLIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.LLIIJLIL(i, recyclerView);
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LLIL = true;
            this.LJLLI.LJLI();
            if (this.LLIILII) {
                this.LLF.removeCallbacks(this.LLILII);
            }
            if (!LivePublicScreenHeightMaskAdaptivelySetting.heightenWhenScroll(this.dataChannel)) {
                return;
            }
            this.dataChannel.rv0(PublicScreenHeightenChannel.class, Boolean.TRUE);
            return;
        }
        if (!this.LLIL) {
            return;
        }
        this.LLIL = false;
        if (!LivePublicScreenHeightMaskAdaptivelySetting.heightenWhenScroll(this.dataChannel)) {
            return;
        }
        this.LLF.removeCallbacks(this.LLILII);
        this.LLF.postDelayed(this.LLILII, 5000L);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LLIILZL(MotionEvent motionEvent, View view) {
        IDTListenerS115S0100000_5 LJIILLIIL;
        GestureDetector gestureDetector;
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            return;
        }
        if (this.LLIIL && !LivePublicScreenFreeGestureSetting.INSTANCE.enableFreeGestureWhenInput()) {
            return;
        }
        if (motionEvent != null && (gestureDetector = this.LLIIJI) != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        InterfaceC29980Bpg interfaceC29980Bpg = this.LLIIJLIL;
        if (interfaceC29980Bpg != null && (LJIILLIIL = interfaceC29980Bpg.LJIILLIIL()) != null) {
            LJIILLIIL.onTouch(view, motionEvent);
        }
    }
}
