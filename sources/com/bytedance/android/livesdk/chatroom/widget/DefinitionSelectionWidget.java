package com.bytedance.android.livesdk.chatroom.widget;

import X.B57;
import X.BNM;
import X.C16880lQ;
import X.C29494Bhq;
import X.C73943T0h;
import X.CN1;
import X.InterfaceC28738BPq;
import X.InterfaceC29856Bng;
import Y.AfS57S0100000_5;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionDegrade;
import com.bytedance.android.livesdk.dataChannel.AudienceShareScreenDefinition;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class DefinitionSelectionWidget extends LiveRecyclableWidget implements View.OnClickListener {
    public LiveIconView LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dny;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r3.equals("hd") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r3.equals("hd_60") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLZ(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 2131235248(0x7f0811b0, float:1.8086685E38)
            switch(r0) {
                case -1008619738: goto L1d;
                case -846238328: goto L2a;
                case 3324: goto L2d;
                case 3448: goto L36;
                case 3665: goto L43;
                case 115761: goto L50;
                case 3005871: goto L56;
                case 99118301: goto L63;
                default: goto La;
            }
        La:
            r1 = 2131235245(0x7f0811ad, float:1.8086679E38)
        Ld:
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r2.LJLIL
            if (r0 == 0) goto L14
            r0.setIcon(r1)
        L14:
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r2.LJLIL
            if (r1 == 0) goto L1c
            r0 = 0
            r1.setIconAutoMirrored(r0)
        L1c:
            return
        L1d:
            java.lang.String r0 = "origin"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto La
        L26:
            r1 = 2131235250(0x7f0811b2, float:1.8086689E38)
            goto Ld
        L2a:
            java.lang.String r0 = "uhd_60"
            goto L52
        L2d:
            java.lang.String r0 = "hd"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Ld
            goto La
        L36:
            java.lang.String r0 = "ld"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3f
            goto La
        L3f:
            r1 = 2131235246(0x7f0811ae, float:1.808668E38)
            goto Ld
        L43:
            java.lang.String r0 = "sd"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
            goto La
        L4c:
            r1 = 2131235247(0x7f0811af, float:1.8086683E38)
            goto Ld
        L50:
            java.lang.String r0 = "uhd"
        L52:
            r3.equals(r0)
            goto La
        L56:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5f
            goto La
        L5f:
            r1 = 2131235249(0x7f0811b1, float:1.8086687E38)
            goto Ld
        L63:
            java.lang.String r0 = "hd_60"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Ld
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget.LJLZ(java.lang.String):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
            ((IDefinitionService) CN1.LIZ(IDefinitionService.class)).bT(fragmentManager, false);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(this, view);
        }
        this.LJLIL = (LiveIconView) getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String currentResolution;
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LIZJ(WidgetExtendsKt.autoDispose(this))).LIZIZ(new AfS57S0100000_5(this, 93));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, AudienceShareScreenDefinition.class, new AqS171S0100000_5(this, 348));
            dataChannel.lv0(this, AudienceResolutionDegrade.class, new AqS171S0100000_5(this, 349));
        }
        String str = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
        if (LIZIZ != null && (currentResolution = LIZIZ.getCurrentResolution()) != null) {
            str2 = currentResolution;
        }
        LJLZ(str2);
    }
}
