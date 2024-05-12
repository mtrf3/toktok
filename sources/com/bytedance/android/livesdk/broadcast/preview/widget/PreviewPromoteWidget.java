package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C29306Beo;
import X.C30444BxA;
import X.C31685Cc5;
import X.EnumC30410Bwc;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.InterfaceC31095CIh;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewPromoteWidget extends PreviewBaseSlotWidget {
    public final EnumC30736C4m LJLJLLL = EnumC30736C4m.SLOT_BROADCAST_PREVIEW_PROMOTE;
    public final EnumC31700CcK LJLL = EnumC31700CcK.PRIORITY;
    public String LJLLI = "";

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void LL() {
        C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_PROMOTE);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        DataChannelGlobal.LJLJJI.nv0(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AqS171S0100000_5(this, 186));
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
    public final boolean LLFFF(boolean z) {
        View redDotView;
        View view;
        if (C29306Beo.LJJIFFI(Boolean.valueOf(z))) {
            EnumC30410Bwc enumC30410Bwc = EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_PROMOTE;
            C30444BxA.LIZLLL(enumC30410Bwc, this.LJLLI);
            C31685Cc5 c31685Cc5 = this.LJLJJI;
            if (c31685Cc5 != null) {
                view = c31685Cc5.getRedDotView();
            } else {
                view = null;
            }
            C30444BxA.LIZJ(enumC30410Bwc, this, view, null, 4);
            return true;
        }
        C31685Cc5 c31685Cc52 = this.LJLJJI;
        if (c31685Cc52 == null || (redDotView = c31685Cc52.getRedDotView()) == null) {
            return true;
        }
        redDotView.setVisibility(8);
        return true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void LLII(BroadcastSettingResponse response) {
        o.LJIIIZ(response, "response");
        InterfaceC31095CIh interfaceC31095CIh = this.LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.putData("param_broadcast_preview_promote_bool", Boolean.valueOf(response.showPromote));
        }
        InterfaceC31095CIh interfaceC31095CIh2 = this.LJLJI;
        if (interfaceC31095CIh2 != null) {
            interfaceC31095CIh2.putData("param_broadcast_preview_promote_dot_badge_bool", Boolean.valueOf(response.promoteDotBadge));
        }
        InterfaceC31095CIh interfaceC31095CIh3 = this.LJLJI;
        if (interfaceC31095CIh3 != null) {
            interfaceC31095CIh3.putData("param_broadcast_preview_promote_dot_badge_version_string", response.promoteDotBadgeVersion);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void LLIIII(String version) {
        o.LJIIIZ(version, "version");
        this.LJLLI = version;
    }
}
