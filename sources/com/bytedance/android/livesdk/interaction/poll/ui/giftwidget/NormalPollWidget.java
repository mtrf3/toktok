package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.C15380j0;
import X.C15490jB;
import X.C2A7;
import X.C30868C9o;
import X.CC3;
import X.CC4;
import X.CC9;
import X.CCA;
import X.CCC;
import X.CCE;
import X.CCJ;
import X.CFX;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NormalPollWidget extends AbsPollWidget {
    public final CCE LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dlg;
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
        CC3.LIZ(this.dataChannel, CCC.NORMAL);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LLFF() {
        C2A7 c2a7 = (C2A7) this.contentView.findViewById(R.id.nx);
        c2a7.LJII();
        if (!CC4.LIZJ()) {
            CCC ccc = CCC.NORMAL;
            CC3.LIZJ(ccc, 1);
            CCE cce = this.LJLIL;
            if (cce != null) {
                cce.q(ccc);
            }
        } else {
            CC3.LIZJ(CCC.NORMAL, 0);
            CC3.LJIIJ("is_ongoing");
            C30868C9o.LIZJ(R.string.lmw);
        }
        c2a7.LJL();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final boolean LJLZ() {
        boolean LJLZ = super.LJLZ();
        if (LJLZ) {
            CC3.LJII(this.dataChannel, CCC.NORMAL);
        }
        return LJLZ;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LJZI() {
        super.LJZI();
        this.subWidgetManager.load(R.id.hw4, new LiveNormalPollEffectWidget(259));
        CC3.LJIIIZ(this.dataChannel, CCC.NORMAL);
    }

    public NormalPollWidget(CCE callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LJLIL = callBack;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget
    public final void LLF(String str) {
        CC3.LJI(this.dataChannel, str, CCC.NORMAL);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        CC9 cc9;
        String str;
        super.onLoad(objArr);
        if (CC4.LIZLLL()) {
            cc9 = CC9.POLLING;
        } else if (CC4.LIZ(this.dataChannel, CCC.NORMAL) == null) {
            cc9 = CC9.FIRST;
        } else {
            cc9 = CC9.NOT_POLLING;
        }
        int i = CCA.LIZ[cc9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJZI();
                return;
            } else {
                super.LJZL();
                this.subWidgetManager.load(R.id.hw4, new LiveNormalPollEffectWidget(258));
                CC3.LJIIIZ(this.dataChannel, CCC.NORMAL);
                return;
            }
        }
        super.LJZ();
        TextView textView = (TextView) this.contentView.findViewById(R.id.c7x);
        if (textView != null) {
            LivePollSetting livePollSetting = LivePollSetting.INSTANCE;
            textView.setText(C15380j0.LJIILL(R.string.nof, livePollSetting.getFirstOption(), livePollSetting.getSecondOption()));
        }
        View findViewById = this.contentView.findViewById(R.id.daf);
        String LIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
        if (CCJ.LIZ(this.context)) {
            str = "ttlive_bg_poll_first_guide_rtl.png";
        } else {
            str = "ttlive_bg_poll_first_guide.png";
        }
        C15490jB.LJ(findViewById, LIZ, str);
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager == null) {
            return;
        }
        recyclableWidgetManager.load(R.id.jm2, NormalSelectPollWidget.class, false);
    }
}
