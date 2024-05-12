package com.bytedance.android.live.broadcast.extendedscreen;

import X.AbstractC65781Prl;
import X.B43;
import X.BCX;
import X.C018905p;
import X.C15380j0;
import X.C28329B9x;
import X.C28509BGv;
import X.C29306Beo;
import X.C30061Fy;
import X.C30145BsL;
import X.C30183Bsx;
import X.C30326BvG;
import X.C30561Bz3;
import X.C31809Ce5;
import X.C46791sZ;
import X.C5H3;
import X.C73943T0h;
import X.C78996UzQ;
import X.C81185Vtd;
import X.CN1;
import X.EnumC31158CKs;
import X.InterfaceC06390Mx;
import X.InterfaceC15320iu;
import X.InterfaceC17150lr;
import X.InterfaceC18250nd;
import X.InterfaceC30182Bsw;
import X.InterfaceC31491CXn;
import X.InterfaceC31494CXq;
import Y.IDfS292S0100000;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.AddDisplaySourceOptionEvent;
import com.bytedance.android.live.broadcast.api.DisplaySourceOptionsChannel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.RemoveDisplaySourceOptionEvent;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkInRoomWindowCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiCoHostAcceptInvitationEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.broadcast.BroadcastService;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedScreenFilterTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRemoveLimitationForExtendedScreenSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCommentComboTraySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ExtendedScreenWidget extends LiveRecyclableWidget implements InterfaceC18250nd {
    public Room LJLIL;
    public InterfaceC30182Bsw LJLILLLLZI;
    public C30061Fy LJLJI;
    public boolean LJLJJLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public IPublicScreenHolderWidget LJZI;
    public IPublicScreenContextWidget LJZL;
    public InterfaceC31494CXq LL;
    public AbstractC65781Prl LLD;
    public C30561Bz3 LLF;
    public C30183Bsx LLFF;
    public boolean LLFFF;
    public final List<InterfaceC17150lr> LLFII;
    public final C5H3 LLFZ;
    public long LLI;
    public final WidgetCreateTimeUtil LJLJJI = new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0);
    public final int LJLJJL = C81185Vtd.LIZLLL();
    public EnumC31158CKs LJLJL = EnumC31158CKs.HIDE;
    public final int LJLJLJ = C15380j0.LIZ(205.0f);
    public final int LJLJLLL = C15380j0.LIZ(85.0f);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.do2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        BroadcastService broadcastService;
        this.LLFFF = false;
        C30061Fy c30061Fy = this.LJLJI;
        if (c30061Fy != null) {
            c30061Fy.LJJZZI();
        }
        C30561Bz3 c30561Bz3 = this.LLF;
        if (c30561Bz3 != null) {
            c30561Bz3.LIZJ(this.LLFF);
        }
        this.LLD = C46791sZ.LJLIL;
        this.LLF = null;
        this.LLFF = null;
        Room room = this.LJLIL;
        if (room != null) {
            long id = room.getId();
            InterfaceC06390Mx LIZ = CN1.LIZ(IBroadcastService.class);
            if ((LIZ instanceof BroadcastService) && (broadcastService = (BroadcastService) LIZ) != null) {
                broadcastService.LJLJJL.remove(id);
            }
        }
    }

    public final void LJZ() {
        C30061Fy c30061Fy;
        if (!LiveRemoveLimitationForExtendedScreenSetting.INSTANCE.removeLimitation() && (c30061Fy = this.LJLJI) != null) {
            c30061Fy.setShouldHandleMove(false);
        }
        this.LJLLJ = "link_accept";
        this.LJLL = true;
        if (this.LJLJL == EnumC31158CKs.HIDE || this.LJLLI) {
            return;
        }
        this.LJLLI = true;
        C30061Fy c30061Fy2 = this.LJLJI;
        if (c30061Fy2 == null) {
            return;
        }
        c30061Fy2.LJJLJLI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedScreenWidget() {
        C15380j0.LIZ(148.0f);
        this.LJLLJ = "draw";
        this.LJLLL = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 32));
        this.LJLLLL = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 30));
        this.LJLLLLLL = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 29));
        this.LJLZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 31));
        this.LJZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 26));
        this.LLFII = new ArrayList();
        this.LLFZ = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(this, 27));
    }

    @Override // X.InterfaceC18250nd
    public final void LJJLIIIJJI(InterfaceC17150lr option) {
        o.LJIIIZ(option, "option");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(AddDisplaySourceOptionEvent.class, option);
        }
    }

    @Override // X.InterfaceC18250nd
    public final void LJLJL(InterfaceC17150lr option) {
        o.LJIIIZ(option, "option");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(RemoveDisplaySourceOptionEvent.class, option);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Yns, X.Prl] */
    public final void LJLZ(InterfaceC30182Bsw interfaceC30182Bsw) {
        this.LJLILLLLZI = interfaceC30182Bsw;
        C30561Bz3 c30561Bz3 = this.LLF;
        if (c30561Bz3 != null) {
            c30561Bz3.LIZIZ(this.LLFF);
        }
        C30061Fy c30061Fy = this.LJLJI;
        if (c30061Fy != null) {
            c30061Fy.setGestureDetectLayout(interfaceC30182Bsw);
        }
        C30061Fy c30061Fy2 = this.LJLJI;
        if (c30061Fy2 == 0) {
            return;
        }
        ?? r0 = this.LLD;
        if (r0 != 0) {
            c30061Fy2.setOnScrollListener(r0);
        } else {
            o.LJIJI("onScrollListener");
            throw null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJI = (C30061Fy) findViewById(R.id.loq);
        this.LJLIL = (Room) this.dataChannel.kv0(RoomChannel.class);
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        this.LLF = new C30561Bz3(dataChannel);
        this.LLFF = new C30183Bsx(this.LJLILLLLZI, 6, new IDqS416S0100000(this.LJLJI, 36));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.1UF] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        boolean z;
        C018905p c018905p;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LiveMode liveMode;
        LiveMode liveMode2;
        BroadcastService broadcastService;
        Object obj;
        boolean z2;
        Boolean bool2 = null;
        if (objArr != null) {
            if (objArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(!z2);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (objArr != null) {
                obj = objArr[0];
            } else {
                obj = null;
            }
            if (obj instanceof C30145BsL) {
                o.LJII(objArr[0], "null cannot be cast to non-null type com.bytedance.android.livesdk.model.ViewLevelInExtendScreen");
            }
        }
        hide();
        C30561Bz3 c30561Bz3 = this.LLF;
        if (c30561Bz3 != null) {
            c30561Bz3.LIZIZ(this.LLFF);
        }
        C30061Fy c30061Fy = this.LJLJI;
        if (c30061Fy != null) {
            c30061Fy.setGestureDetectLayout(this.LJLILLLLZI);
        }
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 37);
        this.LLD = iDqS416S0100000;
        C30061Fy c30061Fy2 = this.LJLJI;
        if (c30061Fy2 != null) {
            c30061Fy2.setOnScrollListener(iDqS416S0100000);
        }
        C30061Fy c30061Fy3 = this.LJLJI;
        if (c30061Fy3 != null) {
            c30061Fy3.setOnScrollInterceptor(new IDqS420S0100000(this, 28));
        }
        Room room = this.LJLIL;
        if (room != null) {
            long id = room.getId();
            InterfaceC06390Mx LIZ = CN1.LIZ(IBroadcastService.class);
            if ((LIZ instanceof BroadcastService) && (broadcastService = (BroadcastService) LIZ) != null) {
                broadcastService.LJLJJL.put(id, this);
            }
        }
        List<InterfaceC15320iu> onExtendedScreenRegistryReadyListeners = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getOnExtendedScreenRegistryReadyListeners();
        o.LJIIIIZZ(onExtendedScreenRegistryReadyListeners, "getService(\n            …eenRegistryReadyListeners");
        Iterator<InterfaceC15320iu> it = onExtendedScreenRegistryReadyListeners.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(DisplaySourceOptionsChannel.class, this.LLFII);
        }
        enableSubWidgetManager(this.LJLJJI, C30326BvG.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C28329B9x.LIZJ(getContext()));
        IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
        DataChannel dataChannel2 = this.dataChannel;
        o.LJIIIIZZ(dataChannel2, "dataChannel");
        TextView publicScreenGiftTips = (TextView) this.LJLLL.getValue();
        o.LJIIIIZZ(publicScreenGiftTips, "publicScreenGiftTips");
        C31809Ce5 publicScreenGiftContainer = (C31809Ce5) this.LJLZ.getValue();
        o.LJIIIIZZ(publicScreenGiftContainer, "publicScreenGiftContainer");
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (liveMode2 = (LiveMode) dataChannel3.kv0(BCX.class)) != null && C28509BGv.LJ(liveMode2)) {
            z = true;
        } else {
            z = false;
        }
        this.LL = iPublicScreenService.e70(this, dataChannel2, publicScreenGiftTips, publicScreenGiftContainer, z, new InterfaceC31491CXn() { // from class: X.1UF
            @Override // X.InterfaceC31491CXn
            public final void LIZ() {
                C30061Fy c30061Fy4 = ExtendedScreenWidget.this.LJLJI;
                if (c30061Fy4 != null) {
                    c30061Fy4.LJJZ();
                }
            }

            @Override // X.InterfaceC31491CXn
            public final void LJ() {
                IPublicScreenContextWidget iPublicScreenContextWidget = ExtendedScreenWidget.this.LJZL;
                if (iPublicScreenContextWidget != null) {
                    iPublicScreenContextWidget.hide();
                }
            }

            @Override // X.InterfaceC31491CXn
            public final void LJFF() {
                IPublicScreenHolderWidget iPublicScreenHolderWidget = ExtendedScreenWidget.this.LJZI;
                if (iPublicScreenHolderWidget != null) {
                    iPublicScreenHolderWidget.hide();
                }
            }

            @Override // X.InterfaceC31491CXn
            public final void LJII() {
                IPublicScreenContextWidget iPublicScreenContextWidget = ExtendedScreenWidget.this.LJZL;
                if (iPublicScreenContextWidget != null) {
                    iPublicScreenContextWidget.show();
                }
            }

            @Override // X.InterfaceC31491CXn
            public final void LJIIIIZZ() {
                IPublicScreenHolderWidget iPublicScreenHolderWidget = ExtendedScreenWidget.this.LJZI;
                if (iPublicScreenHolderWidget != null) {
                    iPublicScreenHolderWidget.show();
                }
            }

            @Override // X.InterfaceC31491CXn
            public final void LIZJ(LiveWidget liveWidget) {
                if (liveWidget != null) {
                    ExtendedScreenWidget extendedScreenWidget = ExtendedScreenWidget.this;
                    C31729Ccn.LIZ.add(C16880lQ.LJLLJ(liveWidget.getClass()));
                    extendedScreenWidget.subWidgetManager.load(R.id.loj, liveWidget);
                }
            }

            @Override // X.InterfaceC31491CXn
            public final void LJI(LiveWidget liveWidget) {
                if (liveWidget != null) {
                    ExtendedScreenWidget.this.subWidgetManager.unload(liveWidget);
                }
            }

            @Override // X.InterfaceC31491CXn
            public final LiveRecyclableWidget LIZLLL(int i, Class cls) {
                return ExtendedScreenWidget.this.subWidgetManager.load(i, cls);
            }

            @Override // X.InterfaceC31491CXn
            public final LiveRecyclableWidget LIZIZ(int i, C31809Ce5 container, Class cls, Object[] objArr2) {
                o.LJIIIZ(container, "container");
                return ExtendedScreenWidget.this.subWidgetManager.load(i, container, cls, true, objArr2);
            }
        });
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && (liveMode = (LiveMode) dataChannel4.kv0(BCX.class)) != null) {
            bool2 = Boolean.valueOf(C28509BGv.LJI(liveMode));
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            LiveExtendedScreenFilterTypeSetting liveExtendedScreenFilterTypeSetting = LiveExtendedScreenFilterTypeSetting.INSTANCE;
            if (liveExtendedScreenFilterTypeSetting.getEnable()) {
                if (liveExtendedScreenFilterTypeSetting.getEnableSingle()) {
                    this.subWidgetManager.load(R.id.lof, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).KQ());
                } else if (liveExtendedScreenFilterTypeSetting.getEnableMulti()) {
                    this.subWidgetManager.load(R.id.lof, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Lo());
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = ((View) this.LLFZ.getValue()).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = this.LJLJLJ;
        marginLayoutParams2.topMargin = this.LJLJLLL;
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-commentComboTrayContainer>(...)");
        ViewGroup.LayoutParams layoutParams2 = ((View) value).getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.topMargin = i;
            Object value2 = this.LJZ.getValue();
            o.LJIIIIZZ(value2, "<get-commentComboTrayContainer>(...)");
            ((View) value2).setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams3 = ((View) this.LJLLLLLL.getValue()).getLayoutParams();
        if ((layoutParams3 instanceof C018905p) && (c018905p = (C018905p) layoutParams3) != null) {
            c018905p.goneTopMargin = i;
            ((View) this.LJLLLLLL.getValue()).setLayoutParams(c018905p);
        }
        InterfaceC31494CXq interfaceC31494CXq = this.LL;
        if (interfaceC31494CXq != null) {
            interfaceC31494CXq.U7(i);
        }
        ((View) this.LLFZ.getValue()).setLayoutParams(marginLayoutParams2);
        this.LJZI = (IPublicScreenHolderWidget) this.subWidgetManager.load((View) this.LJLLLL.getValue(), ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).sn());
        this.subWidgetManager.addRecyclableWidgetEventListener(new RecyclableWidgetEventListener() { // from class: X.1j6
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onHide(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LIZ(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onPostCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LIZIZ(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onPostCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LIZJ(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onPostDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LIZLLL(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJ(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJI(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onPreCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LJII(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onPreCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LJIIIIZZ(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onPreDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LJIIIZ(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJIIJ(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJIIJJI(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJIIL(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onShow(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
                YA0.LJIILIIL(this, interfaceC30319Bv9, widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public final /* bridge */ /* synthetic */ void onWidgetRequestLoading(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget, boolean z3) {
                YA0.LJIILJJIL(this, interfaceC30319Bv9, widget, z3);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final void onPostLoad(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
                CQQ cqq;
                o.LJIIIZ(widgetManager, "widgetManager");
                o.LJIIIZ(recyclableWidget, "recyclableWidget");
                YA0.LJFF(this, widgetManager, recyclableWidget);
                if (o.LJ(ExtendedScreenWidget.this.LJZI, recyclableWidget) && ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).xg(ExtendedScreenWidget.this.LJLIL)) {
                    ExtendedScreenWidget extendedScreenWidget = ExtendedScreenWidget.this;
                    extendedScreenWidget.LJZL = (IPublicScreenContextWidget) extendedScreenWidget.subWidgetManager.load(R.id.blc, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).BD());
                    ExtendedScreenWidget extendedScreenWidget2 = ExtendedScreenWidget.this;
                    IPublicScreenContextWidget iPublicScreenContextWidget = extendedScreenWidget2.LJZL;
                    if (iPublicScreenContextWidget == null) {
                        return;
                    }
                    IPublicScreenHolderWidget iPublicScreenHolderWidget = extendedScreenWidget2.LJZI;
                    if (iPublicScreenHolderWidget != null) {
                        cqq = iPublicScreenHolderWidget.LJLZ();
                    } else {
                        cqq = null;
                    }
                    iPublicScreenContextWidget.LJLIL = cqq;
                }
            }
        });
        this.subWidgetManager.load((View) this.LLFZ.getValue(), ((IGiftService) CN1.LIZ(IGiftService.class)).getExtendScreenGiftTrayWidget());
        if (LiveCommentComboTraySetting.INSTANCE.enableCommentComboTray()) {
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            Object value3 = this.LJZ.getValue();
            o.LJIIIIZZ(value3, "<get-commentComboTrayContainer>(...)");
            recyclableWidgetManager.load((View) value3, ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).SE());
        }
        DataChannel dataChannel5 = this.dataChannel;
        dataChannel5.lv0(this, LiveCenterStatusChannel.class, new IDqS416S0100000(this, 240));
        dataChannel5.ov0(this, LinkInRoomWindowCountChannel.class, new IDqS416S0100000(this, 241));
        dataChannel5.ov0(this, LinkGuestCountChangeChannel.class, new IDqS416S0100000(this, 242));
        dataChannel5.ov0(this, MultiLiveRTCLayoutChannel.class, new IDqS416S0100000(this, 243));
        dataChannel5.lv0(this, LiveExtendScreenCloseEvent.class, new IDqS416S0100000(this, 244));
        dataChannel5.ov0(this, VoiceChatLayoutChannel.class, new IDqS416S0100000(this, 245));
        LiveRemoveLimitationForExtendedScreenSetting liveRemoveLimitationForExtendedScreenSetting = LiveRemoveLimitationForExtendedScreenSetting.INSTANCE;
        if (!liveRemoveLimitationForExtendedScreenSetting.removeLimitation()) {
            this.dataChannel.ov0(this, LinkCrossRoomStateChangeEvent.class, new IDqS416S0100000(this, 246));
        } else {
            this.dataChannel.ov0(this, MultiCoHostAcceptInvitationEvent.class, new IDqS416S0100000(this, 247));
        }
        if (liveRemoveLimitationForExtendedScreenSetting.removeLimitation()) {
            C73943T0h.LIZ().LIZJ(this, B43.class).LIZIZ(new IDfS292S0100000(this, 30));
        }
    }
}
