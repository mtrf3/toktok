package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.BCX;
import X.BHT;
import X.BZI;
import X.C0DC;
import X.C113554cx;
import X.C16880lQ;
import X.C28509BGv;
import X.C28787BRn;
import X.C30568BzA;
import X.C30569BzB;
import X.C30574BzG;
import X.C30577BzJ;
import X.C30579BzL;
import X.CN1;
import X.OSZ;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.GamePartnershipEntrance;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import webcast.api.partnership.AnchorInfoResponse;

/* loaded from: classes6.dex */
public final class PreviewPartnershipWidget extends PreviewToolBaseWidget {
    public boolean LJLJI;
    public boolean LJLJJI;
    public AnchorInfoResponse.PunishInfo LJLJJL;
    public AnchorInfoResponse.LabelFilterInfo LJLJL;
    public C30574BzG LJLJLJ;
    public Long LJLJJLL = 0L;
    public final C30568BzA LJLJLLL = new C30568BzA(this);
    public final int LJLL = R.string.las;
    public final int LJLLI = R.drawable.d9i;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LLIIIL() {
        LiveMode liveMode;
        int i;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) == null || ((i = C30569BzB.LIZ[liveMode.ordinal()]) != 1 && i != 2)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LJLJI && LLIIIL()) {
            super.show();
            BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_show");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIFFI(LLIIIJ(""));
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        Context context;
        super.LJZL();
        this.dataChannel.ov0(this, GamePartnershipEntrance.class, new AqS171S0100000_5(this, 219));
        BHT.LIZ().init();
        this.LJLJLJ = new C30574BzG();
        Context context2 = this.context;
        if (context2 != null) {
            context = C16880lQ.LLLLL(context2);
        } else {
            context = null;
        }
        Application application = (Application) context;
        if (application != null) {
            C30574BzG c30574BzG = this.LJLJLJ;
            if (c30574BzG != null) {
                application.registerActivityLifecycleCallbacks(c30574BzG);
            } else {
                o.LJIJI("lifecycleCallback");
                throw null;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        Context context;
        super.onDestroy();
        C30577BzJ.LJFF(this.LJLJLLL);
        BHT.LIZ().destroy();
        C30579BzL S00 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).S00();
        if (S00 != null) {
            S00.LIZJ();
        }
        Context context2 = this.context;
        if (context2 != null) {
            context = C16880lQ.LLLLL(context2);
        } else {
            context = null;
        }
        Application application = (Application) context;
        if (application != null) {
            C30574BzG c30574BzG = this.LJLJLJ;
            if (c30574BzG != null) {
                application.unregisterActivityLifecycleCallbacks(c30574BzG);
            } else {
                o.LJIJI("lifecycleCallback");
                throw null;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLLI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLL;
    }

    public final Map<String, String> LLIIIJ(String str) {
        String str2;
        LiveMode liveMode;
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("btn_name", "icon");
        oszArr[1] = new OSZ("user_type", "host");
        oszArr[2] = new OSZ("user_id", C0DC.LIZ());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = "";
        }
        oszArr[3] = new OSZ("live_type", str2);
        oszArr[4] = new OSZ("page_name", "live_start");
        oszArr[5] = new OSZ("page_from", str);
        return C113554cx.LJJL(oszArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r2 != null) goto L6;
     */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            webcast.api.partnership.AnchorInfoResponse$LabelFilterInfo r2 = r4.LJLJL
            if (r2 == 0) goto L14
            boolean r1 = r2.gpppaAccount
            r0 = 1
            if (r1 != r0) goto L14
        Le:
            java.lang.String r3 = r2.gpppaBanToast
        L10:
            X.C30868C9o.LJI(r3)
            return
        L14:
            r0 = 0
            r3 = 0
            if (r0 == 0) goto L1b
            if (r2 == 0) goto L10
            goto Le
        L1b:
            boolean r0 = r4.LJLJJI
            if (r0 == 0) goto L80
            webcast.api.partnership.AnchorInfoResponse$PunishInfo r0 = r4.LJLJJL
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.punishText
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.C30868C9o.LJI(r0)
            webcast.api.partnership.AnchorInfoResponse$PunishInfo r0 = r4.LJLJJL
            if (r0 != 0) goto L45
        L30:
            java.lang.Long r0 = r4.LJLJJLL
            if (r0 == 0) goto L41
            long r2 = r0.longValue()
            X.J0d<java.lang.Long> r1 = X.InterfaceC30442Bx8.n1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.LIZ(r0)
        L41:
            r4.LLF()
            return
        L45:
            java.lang.String r2 = "livesdk_violation_toast"
            java.lang.String r1 = "violation_type"
            java.lang.String r0 = "handle_revoke"
            X.BZI r2 = X.C0N3.LIZIZ(r2, r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L7e
            java.lang.Class<com.bytedance.android.live.LiveModeChannel> r0 = com.bytedance.android.live.LiveModeChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 == 0) goto L7e
            java.lang.String r1 = r0.logStreamingType
        L5f:
            java.lang.String r0 = "live_type"
            r2.LJIJJ(r1, r0)
            webcast.api.partnership.AnchorInfoResponse$PunishInfo r0 = r4.LJLJJL
            if (r0 == 0) goto L6e
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r0.punishEventInfo
            if (r0 == 0) goto L6e
            java.lang.Long r3 = r0.duration
        L6e:
            java.lang.String r0 = "period"
            r2.LJIJJ(r3, r0)
            java.lang.String r1 = "scene_type"
            java.lang.String r0 = "inapp_go_play"
            r2.LJIJJ(r0, r1)
            r2.LJJIIJZLJL()
            goto L30
        L7e:
            r1 = r3
            goto L5f
        L80:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService) r0
            r0.Ka0()
            android.content.Context r1 = r4.context
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r2 = ""
            java.util.Map r0 = r4.LLIIIJ(r2)
            X.C24150x9.LIZ(r1, r0)
            java.lang.String r0 = "livesdk_gamepad_btn_click"
            X.BZI r1 = X.C28787BRn.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r1.LJIILLIIL(r0)
            java.util.Map r0 = r4.LLIIIJ(r2)
            r1.LJJIFFI(r0)
            r1.LJJIIJZLJL()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget.onClick(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIILZ(java.util.List<webcast.api.partnership.AnchorInfoResponse.TaskPriceUpdate> r8, java.util.List<webcast.api.partnership.AnchorInfoResponse.PunishInfo> r9, webcast.api.partnership.AnchorInfoResponse.LabelFilterInfo r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget.LLIIIILZ(java.util.List, java.util.List, webcast.api.partnership.AnchorInfoResponse$LabelFilterInfo):void");
    }
}
