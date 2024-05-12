package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.BIK;
import X.BX4;
import X.BX5;
import X.BX6;
import X.BX8;
import X.BZI;
import X.C03880Dg;
import X.C06490Nh;
import X.C15380j0;
import X.C15610jN;
import X.C16880lQ;
import X.C23010vJ;
import X.C28787BRn;
import X.C28915BWl;
import X.C28922BWs;
import X.C29050Bag;
import X.C29163BcV;
import X.C29164BcW;
import X.C29306Beo;
import X.C31767CdP;
import X.C47071t1;
import X.C5H3;
import X.C65300Pk0;
import X.C78996UzQ;
import X.DialogC31813Ce9;
import X.InterfaceC28344BAm;
import X.InterfaceC31781Cdd;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class TryModeGoLiveWidget extends LiveWidget implements InterfaceC28344BAm {
    public C28915BWl LJLILLLLZI;
    public DialogC31813Ce9 LJLJI;
    public LiveDialog LJLJJI;
    public C29164BcW LJLJJL;
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 118));
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 117));
    public final ARunnableS41S0100000_5 LJLJL = new ARunnableS41S0100000_5(this, 48);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.djf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZL() {
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        DataChannel dataChannel = this.dataChannel;
        Fragment fragment = this.widgetCallback.getFragment();
        o.LJIIIIZZ(fragment, "widgetCallback.fragment");
        BIK bik = new BIK(context, fragment, dataChannel);
        C29163BcV c29163BcV = new C29163BcV();
        if (this.LJLJI == null) {
            C31767CdP c31767CdP = new C31767CdP(this.context);
            c31767CdP.LIZIZ = C15380j0.LJIILJJIL(R.string.sur);
            this.LJLJI = c31767CdP.LIZ();
        }
        C29306Beo.LJJJJIZL(this.LJLJI);
        Fragment fragment2 = this.widgetCallback.getFragment();
        o.LJIIIIZZ(fragment2, "widgetCallback.fragment");
        C29306Beo.LJJIIJZLJL(fragment2, null, new C28922BWs(c29163BcV, this, bik, null), 3);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C29164BcW c29164BcW = (C29164BcW) dataChannelGlobal.mv0(C29050Bag.class);
        if (c29164BcW != null) {
            c29164BcW.LIZ = (Handler) this.LJLIL.getValue();
            this.LJLJJL = c29164BcW;
            ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C29050Bag.class);
            View view = getView();
            if (view != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 89), view);
            }
            C15610jN.LIZJ(this.LJLJL, LiveTryModeCountDownThresholdSetting.INSTANCE.threshold() * 1000);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C15610jN.LIZ().removeCallbacks(this.LJLJL);
        ((CountDownTimer) this.LJLJJLL.getValue()).cancel();
    }

    public static SpannableString LJLZ(int i) {
        String countDownStr = C15380j0.LJIIIIZZ(R.plurals.mv, i, Integer.valueOf(i));
        SpannableString spannableString = new SpannableString(C15380j0.LJIILL(R.string.mco, countDownStr));
        o.LJIIIIZZ(countDownStr, "countDownStr");
        int LJJLIIIJL = s.LJJLIIIJL(spannableString, countDownStr, 0, false, 6);
        if (LJJLIIIJL > 0) {
            C23010vJ.LJFF(spannableString, LJJLIIIJL, countDownStr.length() + LJJLIIIJL, 17, 700);
        }
        return spannableString;
    }

    public final void LJZI(String str) {
        Boolean bool;
        if (this.LJLJJI == null) {
            C47071t1 c47071t1 = new C47071t1(this.context);
            c47071t1.LJIILL = false;
            c47071t1.LJIILJJIL = false;
            c47071t1.LJIILLIIL(R.string.mcp);
            c47071t1.LJII(LJLZ(LiveTryModeCountDownDurationSetting.INSTANCE.duration()));
            c47071t1.LJIIIZ(R.string.mcn, new BX6(this, str));
            c47071t1.LJIIL(R.string.soa, new BX8(this, str));
            this.LJLJJI = c47071t1.LIZ();
        }
        LiveDialog liveDialog = this.LJLJJI;
        if (liveDialog != null) {
            bool = Boolean.valueOf(liveDialog.isShowing());
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            LJZ(str, "show");
            LiveDialog liveDialog2 = this.LJLJJI;
            if (liveDialog2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog2, new Object[0], "void", new C65300Pk0(false, "()V", "-1293868573063061463")).LIZ) {
                liveDialog2.show();
            }
            ((CountDownTimer) this.LJLJJLL.getValue()).start();
        }
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        InterfaceC31781Cdd interfaceC31781Cdd;
        if (this.dataChannel == null || (interfaceC31781Cdd = this.widgetCallback) == null || interfaceC31781Cdd.getFragment() == null) {
            return;
        }
        if (this.LJLILLLLZI == null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            Fragment fragment = this.widgetCallback.getFragment();
            o.LJIIIIZZ(fragment, "widgetCallback.fragment");
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            this.LJLILLLLZI = new C28915BWl(context, fragment, dataChannel);
        }
        C28915BWl c28915BWl = this.LJLILLLLZI;
        if (c28915BWl == null) {
            return;
        }
        c28915BWl.LIZJ(message, LiveMode.VIDEO, new BX4(this), new BX5(this), null, true);
    }

    public final void LJZ(String str, String str2) {
        BZI LIZ = C28787BRn.LIZ("livesdk_trymode_practice_end_popup");
        LIZ.LJIILLIIL(this.dataChannel);
        C06490Nh.LIZLLL(LIZ, str, "show_type", str2, "action_type");
    }
}
