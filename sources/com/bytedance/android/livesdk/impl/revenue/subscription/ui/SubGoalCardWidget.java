package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.BZI;
import X.C03880Dg;
import X.C28787BRn;
import X.C47071t1;
import X.C65300Pk0;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.UFH;
import Y.IDcS94S0200000_13;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SubGoalCardWidget extends SubscriptionExplainCardWidget {
    public final int LJLLLLLL = 2;

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget
    public final void LLF() {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_sub_goal_pin_confirm_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIFFI(this.LJLJJL);
        String lowerCase = this.LJLJJLL.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        LIZ.LJIJJ(lowerCase, "original_card_type");
        C47071t1 c47071t1 = new C47071t1(this.context);
        c47071t1.LJIILLIIL(R.string.obg);
        c47071t1.LJFF(R.string.obf);
        c47071t1.LJIIL(R.string.nn4, new IDcS94S0200000_13(this, LIZ, 5));
        c47071t1.LJIIIZ(R.string.nn3, new IDcS94S0200000_13(this, LIZ, 6));
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-8568988146723779729")).LIZ) {
            return;
        }
        LIZ2.show();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget
    public final int LJZ() {
        return this.LJLLLLLL;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget
    public final void LJZI(UFH reason) {
        o.LJIIIZ(reason, "reason");
        this.LJLJJI = SystemClock.elapsedRealtime();
        if (this.LJLILLLLZI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_sub_goal_pin_duration");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIFFI(this.LJLJJL);
            LIZ.LJIJJ(Long.valueOf((this.LJLJJI - this.LJLJI) / 1000), "anchor_pin_duration");
            String lowerCase = reason.name().toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            LIZ.LJIJJ(lowerCase, "finished_type");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // X.UFJ
    public final void LJJJJIZL(UFH unpinReason, Long l) {
        o.LJIIIZ(unpinReason, "unpinReason");
        if (LLFF(unpinReason, null)) {
            this.dataChannel.rv0(SubGoalCardVisibilityChannel.class, Boolean.FALSE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJLZ(com.bytedance.android.livesdk.chatroom.api.SubPinCard r7, boolean r8) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard r0 = r7.goalPinCard
            r4 = 0
            if (r0 == 0) goto Ldf
            com.bytedance.android.livesdk.chatroom.api.SubPinCardText r0 = r0.desc
            if (r0 == 0) goto Ldf
            int r0 = r0.type
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        Lf:
            r2 = 1
            java.lang.String r3 = ""
            if (r1 != 0) goto Lb1
        L14:
            r0 = r3
        L15:
            r3 = r0
        L16:
            com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting r0 = com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting.INSTANCE
            java.lang.String r0 = r0.getPinCard()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r4 = r0.buildUpon()
            long r0 = r7.id
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "goal_id"
            android.net.Uri$Builder r1 = r4.appendQueryParameter(r0, r1)
            java.lang.String r0 = "description"
            android.net.Uri$Builder r3 = r1.appendQueryParameter(r0, r3)
            com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard r0 = r7.goalPinCard
            r4 = 0
            if (r0 == 0) goto Lae
            long r0 = r0.progress
        L3e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "progress"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r0, r1)
            com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard r0 = r7.goalPinCard
            if (r0 == 0) goto L4e
            long r4 = r0.target
        L4e:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "target"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJLIL
            if (r0 == 0) goto L92
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L92
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L92
            boolean r0 = r0.isSubscribed()
            if (r0 != r2) goto L92
            java.lang.String r1 = "subscribed_not_expired"
        L70:
            java.lang.String r0 = "subscription_state"
            android.net.Uri$Builder r2 = r3.appendQueryParameter(r0, r1)
            com.google.gson.Gson r1 = X.C09650Zl.LIZJ
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LJLJJL
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r0)
            java.lang.String r0 = "logParams"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "parse(SubscribeGoalsLynx…)\n            .toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L92:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJLIL
            if (r0 == 0) goto Lab
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto Lab
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto Lab
            boolean r0 = r0.isInGracePeriod()
            if (r0 != r2) goto Lab
            java.lang.String r1 = "subscribed_expired_grace_period"
            goto L70
        Lab:
            java.lang.String r1 = "not_subscribed"
            goto L70
        Lae:
            r0 = 0
            goto L3e
        Lb1:
            int r0 = r1.intValue()
            if (r0 != r2) goto Lc5
            com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard r0 = r7.goalPinCard
            if (r0 == 0) goto L16
            com.bytedance.android.livesdk.chatroom.api.SubPinCardText r0 = r0.desc
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.content
        Lc1:
            if (r0 != 0) goto L15
            goto L16
        Lc5:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L14
            X.Y7x r1 = X.C86881Y7x.LIZIZ()
            com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard r0 = r7.goalPinCard
            if (r0 == 0) goto Lda
            com.bytedance.android.livesdk.chatroom.api.SubPinCardText r0 = r0.desc
            if (r0 == 0) goto Lda
            java.lang.String r4 = r0.content
        Lda:
            java.lang.String r0 = r1.LIZ(r4)
            goto Lc1
        Ldf:
            r1 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubGoalCardWidget.LJLZ(com.bytedance.android.livesdk.chatroom.api.SubPinCard, boolean):java.lang.String");
    }

    @Override // X.UFJ
    public final void LJJLL(SubPinCard subPinCard, Long l, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (LJZL(subPinCard, l, interfaceC65784Pro)) {
            this.dataChannel.rv0(SubGoalCardVisibilityChannel.class, Boolean.TRUE);
        }
    }
}
