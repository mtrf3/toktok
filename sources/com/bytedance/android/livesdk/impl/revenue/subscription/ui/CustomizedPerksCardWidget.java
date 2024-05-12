package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.BZI;
import X.C03880Dg;
import X.C28787BRn;
import X.C29306Beo;
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
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CustomizedPerksCardWidget extends SubscriptionExplainCardWidget {
    public final int LJLLLLLL = 1;

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget
    public final void LLF() {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_customized_perk_pin_confirm_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIFFI(this.LJLJJL);
        C47071t1 c47071t1 = new C47071t1(this.context);
        c47071t1.LJIILLIIL(R.string.nn9);
        c47071t1.LJFF(R.string.nn8);
        c47071t1.LJIIL(R.string.nn4, new IDcS94S0200000_13(this, LIZ, 3));
        c47071t1.LJIIIZ(R.string.nn3, new IDcS94S0200000_13(this, LIZ, 4));
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-384537883693012992")).LIZ) {
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
        String str;
        o.LJIIIZ(reason, "reason");
        this.LJLJJI = SystemClock.elapsedRealtime();
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_customized_perk_pin_duration");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJJIFFI(this.LJLJJL);
        LIZ.LJIJJ(Long.valueOf((this.LJLJJI - this.LJLJI) / 1000), "anchor_pin_duration");
        String lowerCase = reason.name().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        LIZ.LJIJJ(lowerCase, "finished_type");
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            str = "anchor";
        } else {
            str = "moderator";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.UFJ
    public final void LJJJJIZL(UFH unpinReason, Long l) {
        o.LJIIIZ(unpinReason, "unpinReason");
        if (LLFF(unpinReason, l)) {
            this.dataChannel.rv0(CustomizedPerksCardVisibilityChannel.class, Boolean.FALSE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
    
        if (r5 == null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    @Override // com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionExplainCardWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJLZ(com.bytedance.android.livesdk.chatroom.api.SubPinCard r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.CustomizedPerksCardWidget.LJLZ(com.bytedance.android.livesdk.chatroom.api.SubPinCard, boolean):java.lang.String");
    }

    @Override // X.UFJ
    public final void LJJLL(SubPinCard subPinCard, Long l, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (LJZL(subPinCard, l, interfaceC65784Pro)) {
            this.dataChannel.rv0(CustomizedPerksCardVisibilityChannel.class, Boolean.TRUE);
        }
    }
}
