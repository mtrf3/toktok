package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BCX;
import X.C0N9;
import X.C30441Bx7;
import X.C47261Igj;
import X.C65352Pkq;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.InterfaceC31095CIh;
import X.InterfaceC31710CcU;
import X.ORZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.PartnershipVideoLivePermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewCommercialWidget extends PreviewBaseSlotWidget {
    public final EnumC30736C4m LJLJLLL = EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    public final EnumC31700CcK LJLL = EnumC31700CcK.AGGREGATE;
    public boolean LJLLI;
    public boolean LJLLILLLL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZI() {
        this.LJLILLLLZI = false;
        this.LJLLI = true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void LL() {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final boolean LLFFF(boolean z) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final boolean LLFZ(BroadcastSettingResponse broadcastSetting) {
        o.LJIIIZ(broadcastSetting, "broadcastSetting");
        return true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void LLIIII(String version) {
        o.LJIIIZ(version, "version");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLIIIILZ() {
        InterfaceC31095CIh interfaceC31095CIh;
        InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> slotWidgetByBizType;
        InterfaceC31095CIh interfaceC31095CIh2 = this.LJLJI;
        if (interfaceC31095CIh2 != null && interfaceC31095CIh2.getSlotWidgetByBizType("ba_leads_gen") != null && (interfaceC31095CIh = this.LJLJI) != null && (slotWidgetByBizType = interfaceC31095CIh.getSlotWidgetByBizType("ba_leads_gen")) != null) {
            slotWidgetByBizType.onEvent(Boolean.TRUE);
        }
    }

    public final void LLIIIJ() {
        Object obj;
        boolean z;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        DataChannel dataChannel = this.dataChannel;
        Object obj2 = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BCX.class);
        } else {
            obj = null;
        }
        LiveMode liveMode = LiveMode.VIDEO;
        boolean z2 = false;
        LiveMode liveMode2 = LiveMode.THIRD_PARTY;
        if (ORZ.LJLJJI(obj, C47261Igj.LJJIJIIJI(liveMode, liveMode2)) && this.LJLLILLLL) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC31095CIh interfaceC31095CIh = this.LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.putData("gamecp_video_live_permissions", Boolean.valueOf(z));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            obj2 = dataChannel2.kv0(BCX.class);
        }
        if (!ORZ.LJLJJI(obj2, C47261Igj.LJJIJIIJI(liveMode, liveMode2)) || (slotViewModel = this.LJLJJL) == null || (mutableLiveData = slotViewModel.LJZI) == null) {
            return;
        }
        if (obj2 == liveMode) {
            z2 = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z2));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        PreviewCommercialWidget previewCommercialWidget = (PreviewCommercialWidget) C0N9.LIZIZ(C65352Pkq.LIZ(PreviewCommercialWidget.class));
        if (previewCommercialWidget != null) {
            previewCommercialWidget.LLIIIILZ();
        }
        if (this.LJLLI && this.LJLLILLLL) {
            LLIIIJ();
        }
        this.LJLLI = false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final EnumC31700CcK LLF() {
        return this.LJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final EnumC30736C4m LLFF() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void LLII(BroadcastSettingResponse response) {
        o.LJIIIZ(response, "response");
        InterfaceC31095CIh interfaceC31095CIh = this.LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.putData("param_live_commercial", Boolean.valueOf(response.liveCommercial));
        }
        InterfaceC31095CIh interfaceC31095CIh2 = this.LJLJI;
        if (interfaceC31095CIh2 != null) {
            interfaceC31095CIh2.putData("param_live_ba_link", Boolean.valueOf(response.liveBALink));
        }
        InterfaceC31095CIh interfaceC31095CIh3 = this.LJLJI;
        if (interfaceC31095CIh3 != null) {
            interfaceC31095CIh3.putData("param_live_ba_leads_gen", Boolean.valueOf(response.liveBaLeadsGen));
        }
        InterfaceC31095CIh interfaceC31095CIh4 = this.LJLJI;
        if (interfaceC31095CIh4 != null) {
            interfaceC31095CIh4.putData("param_live_paid_series", Boolean.valueOf(response.livePaidContent));
        }
        C30441Bx7 c30441Bx7 = (C30441Bx7) this.dataChannel.kv0(PartnershipVideoLivePermission.class);
        if (c30441Bx7 != null) {
            boolean z = c30441Bx7.LJLIL;
            this.LJLLILLLL = z;
            if (z) {
                LLIIIJ();
                InterfaceC31095CIh interfaceC31095CIh5 = this.LJLJI;
                if (interfaceC31095CIh5 != null) {
                    interfaceC31095CIh5.putData("gamecp_last_video_live_added", Boolean.valueOf(c30441Bx7.LJLILLLLZI));
                }
            }
            LLFII();
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return;
        }
        dataChannel.ov0(this, PartnershipVideoLivePermission.class, new AqS171S0100000_5(this, 630));
    }
}
