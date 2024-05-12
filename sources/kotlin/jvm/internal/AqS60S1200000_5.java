package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BAI;
import X.C15650jR;
import X.C1XG;
import X.C32500CpE;
import X.C76800UCe;
import X.C78720Uuy;
import X.CN1;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.widget.ImageView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public class AqS60S1200000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r8 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS60S1200000_5 r9) {
        /*
            java.lang.Object r0 = r9.l1
            X.CpE r0 = (X.C32500CpE) r0
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r0.LJJIIJ()
            r3 = 0
            if (r0 == 0) goto L86
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJLIL
            if (r1 == 0) goto L86
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r8 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r8 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r8
        L17:
            java.lang.Object r4 = r9.l1
            X.CpE r4 = (X.C32500CpE) r4
            android.content.Context r7 = r4.LJLIL
            java.lang.Object r0 = r9.l2
            com.bytedance.android.livesdk.model.GiftPanelBanner r0 = (com.bytedance.android.livesdk.model.GiftPanelBanner) r0
            java.lang.String r5 = r9.s0
            java.lang.String r0 = r0.schemaUrl
            java.lang.String r6 = "gift_bar"
            r2 = 0
            if (r0 == 0) goto L83
            if (r8 == 0) goto L44
            com.bytedance.android.live.base.model.user.User r0 = r8.getOwner()
            if (r0 == 0) goto L72
            boolean r1 = r0.isSubscribed()
            r0 = 1
            if (r1 != r0) goto L72
        L39:
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService r0 = (com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService) r0
            r0.Ee(r7, r8, r6)
        L44:
            java.lang.String r0 = "livesdk_subscribe_icon_click"
            X.BZI r1 = X.C28787BRn.LIZ(r0)
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r4.LJJIIJ()
            if (r0 == 0) goto L70
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LJLIL
        L52:
            r1.LJIILLIIL(r0)
            java.lang.String r0 = "click_position"
            r1.LJIJJ(r6, r0)
            java.lang.String r0 = "user_type"
            r1.LJIJJ(r5, r0)
            com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel r0 = r4.LJJIIJ()
            if (r0 == 0) goto L67
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.LJLIL
        L67:
            X.C62819Ol5.LJJII(r1, r3, r2)
            r1.LJJIIJZLJL()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L70:
            r0 = r3
            goto L52
        L72:
            java.lang.Class<com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService> r0 = com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            java.lang.String r0 = "getService(ISubscribeService::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService r1 = (com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService) r1
            r1.kg0(r7, r8, r6, r3)
            goto L44
        L83:
            if (r8 == 0) goto L44
            goto L39
        L86:
            r8 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS60S1200000_5.invoke$0(kotlin.jvm.internal.AqS60S1200000_5):java.lang.Object");
    }

    public static final Object invoke$1(AqS60S1200000_5 aqS60S1200000_5) {
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
        C1XG.LIZ();
        ((InterfaceC88472Yns) aqS60S1200000_5.l1).invoke(Boolean.TRUE);
        BAI.LJIIJ((DataChannel) aqS60S1200000_5.l2, aqS60S1200000_5.s0, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS60S1200000_5 aqS60S1200000_5) {
        ((InterfaceC88472Yns) aqS60S1200000_5.l1).invoke(Boolean.FALSE);
        BAI.LJIIJ((DataChannel) aqS60S1200000_5.l2, aqS60S1200000_5.s0, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS60S1200000_5 aqS60S1200000_5) {
        C78720Uuy url = C15650jR.LIZ().setUrl(aqS60S1200000_5.s0);
        url.LJIIJJI = ((PreviewGameDropsWidget) aqS60S1200000_5.l1).LJLJLJ;
        url.LJIIJJI((ImageView) aqS60S1200000_5.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1200000_5(C32500CpE c32500CpE, GiftPanelBanner giftPanelBanner, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c32500CpE;
        this.l2 = giftPanelBanner;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS60S1200000_5(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, DataChannel dataChannel, String str) {
        super(0);
        this.$t = str;
        this.l1 = interfaceC88472Yns;
        this.l2 = interfaceC88472Yns2;
        this.s0 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S1200000_5(String str, PreviewGameDropsWidget previewGameDropsWidget, ImageView imageView, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = previewGameDropsWidget;
        this.l2 = imageView;
    }
}
