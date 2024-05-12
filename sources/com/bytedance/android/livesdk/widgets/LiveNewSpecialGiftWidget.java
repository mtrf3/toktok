package com.bytedance.android.livesdk.widgets;

import X.C16880lQ;
import X.C29306Beo;
import X.C32694CsM;
import X.C32805Cu9;
import X.C32826CuU;
import X.C77557UcD;
import X.EnumC77563UcJ;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS24S0300000_13;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.SpecialGiftComboVisibilityChannel;
import com.bytedance.android.livesdk.SpecialGiftCombEvent;
import com.bytedance.android.livesdk.SpecialGiftCombEventNewSender;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class LiveNewSpecialGiftWidget extends LiveWidget {
    public C77557UcD LJLIL;
    public View LJLILLLLZI;
    public C32805Cu9 LJLJI;
    public C32826CuU LJLJJI;
    public boolean LJLJJL;
    public final AqS171S0100000_5 LJLJJLL = new AqS171S0100000_5(this, 503);
    public final AqS171S0100000_5 LJLJL = new AqS171S0100000_5(this, 504);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View view;
        super.onCreate();
        this.LJLILLLLZI = findViewById(R.id.ffp);
        C77557UcD c77557UcD = (C77557UcD) findViewById(R.id.d4w);
        this.LJLIL = c77557UcD;
        if (c77557UcD != null) {
            c77557UcD.setAnimationType(EnumC77563UcJ.SPECIAL);
        }
        C77557UcD c77557UcD2 = this.LJLIL;
        if (c77557UcD2 != null) {
            C29306Beo.LJI(c77557UcD2);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            C29306Beo.LJI(view2);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(SpecialGiftComboVisibilityChannel.class, Boolean.FALSE);
        }
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            view = this.LJLILLLLZI;
        } else {
            view = this.LJLIL;
        }
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 261), view);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, SpecialGiftCombEvent.class, this.LJLJJLL);
            if (LiveGiftSenderRefactorV1Setting.INSTANCE.enable()) {
                this.dataChannel.lv0(this, SpecialGiftCombEventNewSender.class, this.LJLJL);
            }
        }
    }

    public final void LJLZ(long j, String str) {
        View view;
        C77557UcD c77557UcD = this.LJLIL;
        if (c77557UcD == null || (view = this.LJLILLLLZI) == null) {
            return;
        }
        c77557UcD.LIZJ(new ARunnableS24S0300000_13(c77557UcD, view, this, 8), new ARunnableS24S0300000_13(c77557UcD, view, this, 9), j, "live_stream", str, SystemClock.uptimeMillis() - C32694CsM.LJJIJIIJI);
    }
}
