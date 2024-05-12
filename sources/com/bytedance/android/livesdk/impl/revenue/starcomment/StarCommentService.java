package com.bytedance.android.livesdk.impl.revenue.starcomment;

import X.CN1;
import X.CSB;
import X.CVE;
import X.CVF;
import X.CZR;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.landscape.LandscapeStarCommentIconWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class StarCommentService implements IStarCommentService {
    public boolean LJLIL;

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final Class<? extends LiveRecyclableWidget> rU() {
        return LandscapeStarCommentIconWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final StarCommentExtendWidget Dg0() {
        return new StarCommentExtendWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final void initPublicScreenConfiguration() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Yj0(new CSB());
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final StarCommentPaymentDialog sb() {
        StarCommentPaymentDialog starCommentPaymentDialog = new StarCommentPaymentDialog();
        starCommentPaymentDialog.LLIIIJ = "regular_entrance";
        return starCommentPaymentDialog;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final int Ck0() {
        return CVF.LIZLLL;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean LR() {
        return CVE.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean VR() {
        return CVF.LIZJ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean eJ() {
        return CVF.LJ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final boolean FJ(Object obj) {
        StarCommentConfig starCommentConfig;
        if (!(obj instanceof Room) || (starCommentConfig = ((Room) obj).starCommentConfig) == null || !starCommentConfig.starCommentQualification) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r4 != null) goto L16;
     */
    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String dz(com.bytedance.ies.sdk.datachannel.DataChannel r7) {
        /*
            r6 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r4 = r7.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r4
            java.lang.Class<X.CV2> r0 = X.CV2.class
            java.lang.Object r0 = r7.kv0(r0)
            X.CZZ r0 = (X.CZZ) r0
            r3 = 0
            if (r0 == 0) goto L82
            int r0 = r0.LIZ()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L20:
            com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentEnableSetting r0 = com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentEnableSetting.INSTANCE
            boolean r0 = r0.getSettingValue()
            if (r0 != 0) goto L2d
            java.lang.String r0 = "setting_not_enable"
            r2.add(r0)
        L2d:
            r1 = 1
            if (r4 == 0) goto L48
            com.bytedance.android.livesdk.message.proto.StarCommentConfig r0 = r4.starCommentConfig
            if (r0 == 0) goto L3f
            boolean r0 = r0.starCommentQualification
            if (r0 != 0) goto L3f
            java.lang.String r0 = "no_qualification"
            r2.add(r0)
            if (r4 == 0) goto L48
        L3f:
            boolean r0 = r4.showStarCommentEntrance
            if (r0 != 0) goto L48
            java.lang.String r0 = "no_entrance"
            r2.add(r0)
        L48:
            if (r5 != 0) goto L6a
        L4a:
            if (r4 == 0) goto L68
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r4.getStreamType()
        L50:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r1 == r0) goto L63
            if (r4 == 0) goto L5a
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r3 = r4.getStreamType()
        L5a:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r3 == r0) goto L63
            java.lang.String r0 = "not_video_live"
            r2.add(r0)
        L63:
            java.lang.String r0 = r2.toString()
            return r0
        L68:
            r1 = r3
            goto L50
        L6a:
            int r0 = r5.intValue()
            if (r0 != r1) goto L75
            java.lang.String r0 = "is_host"
            r2.add(r0)
        L75:
            int r1 = r5.intValue()
            r0 = 2
            if (r1 != r0) goto L4a
            java.lang.String r0 = "is_admin"
            r2.add(r0)
            goto L4a
        L82:
            r5 = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.StarCommentService.dz(com.bytedance.ies.sdk.datachannel.DataChannel):java.lang.String");
    }

    @Override // com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService
    public final CZR CT(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        return new CZR(fragment, dataChannel);
    }
}
