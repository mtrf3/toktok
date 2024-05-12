package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.BZI;
import X.C113554cx;
import X.C29306Beo;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C86326XuM;
import X.C86343Xud;
import X.C86393XvR;
import X.InterfaceC54761LeP;
import X.OSZ;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.feed.model.live.PunishEventInfo;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MaskLayerWidget extends LiveWatchPreviewWidget {
    public C86326XuM LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;

    public MaskLayerWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 344);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MaskLayerAndWarningVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 345), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 346), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bq7;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final MaskLayerAndWarningVM LJZ() {
        return (MaskLayerAndWarningVM) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
    }

    public final void LJZI(String str) {
        LiveRoomStruct liveRoomStruct;
        MaskLayer maskLayer;
        PunishEventInfo punish_info;
        String str2;
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZIZ;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null && (maskLayer = liveRoomStruct.maskLayer) != null && (punish_info = maskLayer.getPunish_info()) != null) {
            String str3 = punish_info.punishId;
            Object obj = "";
            if (str3 == null) {
                str3 = "";
            }
            String str4 = punish_info.punishType;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = punish_info.punishReason;
            if (str5 == null) {
                str5 = "";
            }
            C86343Xud LJLZ2 = LJLZ();
            if (LJLZ2 == null || (liveRoomStruct3 = LJLZ2.LIZIZ) == null || (user = liveRoomStruct3.owner) == null || (str2 = user.getUid()) == null) {
                str2 = "";
            }
            C86343Xud LJLZ3 = LJLZ();
            if (LJLZ3 != null && (liveRoomStruct2 = LJLZ3.LIZIZ) != null) {
                obj = Long.valueOf(liveRoomStruct2.id);
            }
            String violationRoomId = obj.toString();
            o.LJIIIZ(violationRoomId, "violationRoomId");
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_violation_mask_layer")) != null && (LIZIZ = LJJLIIJ.LIZIZ(C113554cx.LJJL(new OSZ("action_type", str), new OSZ("violation_type", str4), new OSZ("record_id", str3), new OSZ("violation_reason", str5), new OSZ("violation_anchor_id", str2), new OSZ("violation_room_id", violationRoomId), new OSZ("user_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())))) != null) {
                LIZIZ.LJJIIJZLJL();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLILLLLZI = (C86326XuM) findViewById(R.id.d7s);
        C29306Beo.LJJLIIIJJI(this.containerView, true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData3 = viewHolderStatusVM.LJLJLJ) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 47));
        }
        MaskLayerAndWarningVM LJZ = LJZ();
        if (LJZ != null && (mutableLiveData2 = LJZ.LJLJJL) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 48));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData = viewHolderStatusVM2.LJLJL) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 49));
        }
        MaskLayerAndWarningVM LJZ2 = LJZ();
        if (LJZ2 != null) {
            Boolean value = LJZ2.LJLJJL.getValue();
            Boolean bool = Boolean.TRUE;
            if (o.LJ(value, bool)) {
                LJZ2.LJLJJL.setValue(bool);
            }
        }
    }
}
