package com.bytedance.android.livesdk.interaction.poll.ui.giftwidget;

import X.BGB;
import X.C15380j0;
import X.C16340kY;
import X.C16360ka;
import X.C16880lQ;
import X.C1I;
import X.C1M;
import X.C28329B9x;
import X.C29306Beo;
import X.C2A7;
import X.C30326BvG;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.AnchorPollEndEvent;
import com.bytedance.android.livesdk.dataChannel.QuestionCardVisibilityEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public class AbsPollWidget extends LiveRecyclableWidget implements C1M {
    @Override // X.C1M
    public final void LIZ() {
    }

    public void LL() {
    }

    public void LLF(String str) {
    }

    public void LLFF() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public boolean LJLZ() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(QuestionCardVisibilityEvent.class);
        } else {
            bool = null;
        }
        return C29306Beo.LJJLIIIJLJLI(bool, new AqS155S0100000_5(this, 237));
    }

    public void LJZ() {
        TextView textView = (TextView) this.contentView.findViewById(R.id.e0o);
        if (textView != null) {
            textView.setText(C15380j0.LJIILL(R.string.ki8, String.valueOf(LivePollDurationSetting.INSTANCE.getSecond())));
        }
        View findViewById = this.contentView.findViewById(R.id.dar);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = this.contentView.findViewById(R.id.cwf);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        C2A7 c2a7 = (C2A7) this.contentView.findViewById(R.id.nx);
        if (c2a7 != null) {
            c2a7.setVisibility(0);
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 195));
            c2a7.setText(R.string.lmr);
            c2a7.LJJLL(R.style.a2z);
        }
    }

    public void LJZI() {
        View findViewById = this.contentView.findViewById(R.id.h3j);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = this.contentView.findViewById(R.id.c7x);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        TextView textView = (TextView) this.contentView.findViewById(R.id.c7x);
        if (textView != null) {
            textView.setText(R.string.no0);
        }
        View findViewById3 = this.contentView.findViewById(R.id.hwi);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
        }
        View findViewById4 = this.contentView.findViewById(R.id.hw3);
        if (findViewById4 != null) {
            findViewById4.setVisibility(8);
        }
        View findViewById5 = this.contentView.findViewById(R.id.c0x);
        if (findViewById5 != null) {
            findViewById5.setVisibility(8);
        }
        View findViewById6 = this.contentView.findViewById(R.id.cwf);
        if (findViewById6 != null) {
            findViewById6.setVisibility(8);
        }
        C2A7 c2a7 = (C2A7) this.contentView.findViewById(R.id.nx);
        if (c2a7 != null) {
            c2a7.setVisibility(0);
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 196));
            c2a7.setText(R.string.nnz);
            c2a7.LJJLL(R.style.a2z);
        }
    }

    public void LJZL() {
        View findViewById = this.contentView.findViewById(R.id.h3j);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = this.contentView.findViewById(R.id.c7x);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        View findViewById3 = this.contentView.findViewById(R.id.c0x);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
        }
        View findViewById4 = this.contentView.findViewById(R.id.hw3);
        if (findViewById4 != null) {
            findViewById4.setVisibility(0);
        }
        View findViewById5 = this.contentView.findViewById(R.id.hwi);
        if (findViewById5 != null) {
            findViewById5.setVisibility(8);
        }
        View findViewById6 = this.contentView.findViewById(R.id.nx);
        if (findViewById6 != null) {
            findViewById6.setVisibility(8);
        }
        View findViewById7 = this.contentView.findViewById(R.id.cwf);
        if (findViewById7 != null) {
            findViewById7.setVisibility(0);
        }
        LLFFF(C1I.LIZLLL);
        C1I.LJFF.add(this);
        C2A7 c2a7 = (C2A7) this.contentView.findViewById(R.id.due);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS40S0200000_5(c2a7, this, 23));
            c2a7.LJJLL(R.style.a3a);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, AnchorPollEndEvent.class, new AqS171S0100000_5(this, 453));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1I.LIZIZ(this);
    }

    @Override // X.C1M
    public final void LJIILIIL(long j) {
        LLFFF(j);
    }

    public final void LLFFF(long j) {
        TextView textView = (TextView) this.contentView.findViewById(R.id.hw3);
        int i = ((int) (j / 1000)) % 3600;
        int i2 = i / 60;
        int i3 = i % 60;
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        if (i2 < 10) {
            LIZ2.append('0');
        } else {
            LIZ2.append("");
        }
        LIZ2.append(i2);
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(':');
        StringBuilder LIZ3 = X1D.LIZ();
        if (i3 < 10) {
            LIZ3.append('0');
        } else {
            LIZ3.append("");
        }
        LIZ3.append(i3);
        LIZ.append(X1D.LIZIZ(LIZ3));
        textView.setText(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        enableSubWidgetManager(new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0), C30326BvG.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C28329B9x.LIZJ(getContext()));
        C2A7 c2a7 = (C2A7) this.contentView.findViewById(R.id.nx);
        C16360ka.LJIJJ(c2a7, new BGB(c2a7));
        C16340kY.LIZJ(c2a7);
    }
}
