package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C15380j0;
import X.C2A7;
import X.C30868C9o;
import X.CC3;
import X.CC4;
import X.CC8;
import X.CC9;
import X.CCC;
import X.CCE;
import X.CCK;
import X.CN1;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPollWidget extends AbsPollWidget {
    public final CCE LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dkc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LL() {
        CC3.LIZ(this.dataChannel, CCC.GIFT);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LLFF() {
        C2A7 c2a7 = (C2A7) this.contentView.findViewById(R.id.nx);
        c2a7.LJII();
        if (!CC4.LIZLLL()) {
            CCC ccc = CCC.GIFT;
            CC3.LIZJ(ccc, 1);
            CCE cce = this.LJLIL;
            if (cce != null) {
                cce.q(ccc);
            }
        } else {
            CC3.LIZJ(CCC.GIFT, 0);
            CC3.LJIIJ("is_ongoing");
            C30868C9o.LIZJ(R.string.lmw);
        }
        c2a7.LJL();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final boolean LJLZ() {
        boolean LJLZ = super.LJLZ();
        if (LJLZ) {
            CC3.LJII(this.dataChannel, CCC.GIFT);
        }
        return LJLZ;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LJZI() {
        super.LJZI();
        this.subWidgetManager.load(R.id.hw4, new LiveGiftPollEffectWidget(259));
        CC3.LJIIIZ(this.dataChannel, CCC.GIFT);
    }

    public GiftPollWidget(CCE callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LJLIL = callBack;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LLF(String str) {
        CC3.LJI(this.dataChannel, str, CCC.GIFT);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        CC9 cc9;
        String str;
        Gift gift;
        String str2;
        Gift gift2;
        super.onLoad(objArr);
        if (CC4.LIZJ()) {
            cc9 = CC9.POLLING;
        } else if (CC4.LIZ(this.dataChannel, CCC.GIFT) == null) {
            cc9 = CC9.FIRST;
        } else {
            cc9 = CC9.NOT_POLLING;
        }
        int i = CC8.LIZ[cc9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJZI();
                return;
            } else {
                super.LJZL();
                this.subWidgetManager.load(R.id.hw4, new LiveGiftPollEffectWidget(258));
                CC3.LJIIIZ(this.dataChannel, CCC.GIFT);
                return;
            }
        }
        super.LJZ();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        TextView textView = (TextView) this.contentView.findViewById(R.id.c7x);
        if (textView != null) {
            Object[] objArr2 = new Object[2];
            String str3 = "";
            if (pollGifts == null || (gift2 = pollGifts.LJLIL) == null || (str = gift2.name) == null) {
                str = "";
            }
            objArr2[0] = str;
            if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null && (str2 = gift.name) != null) {
                str3 = str2;
            }
            objArr2[1] = str3;
            textView.setText(C15380j0.LJIILL(R.string.nof, objArr2));
        }
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager == null) {
            return;
        }
        recyclableWidgetManager.load(R.id.jm2, GiftStartPollWidget.class, false);
    }
}
