package com.bytedance.android.livesdk.broadcast.preview.widget.notify;

import X.BUW;
import X.C28488BGa;
import X.C28913BWj;
import X.C29306Beo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.AgeGateNotifyEvent;
import com.bytedance.android.livesdk.broadcast.BannerNotifyEvent;
import com.bytedance.android.livesdk.broadcast.ColdDownNotifyEvent;
import com.bytedance.android.livesdk.broadcast.NormalNotifyEvent;
import com.bytedance.android.livesdk.broadcast.ShakeBlockTipEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewCommonNotifyWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpu;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        ViewGroup viewGroup;
        super.LJZ();
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && viewGroup.getChildCount() > 0) {
            show();
        } else {
            hide();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, AgeGateNotifyEvent.class, new AqS171S0100000_5(this, 210));
            dataChannel.ov0(this, ColdDownNotifyEvent.class, new AqS171S0100000_5(this, 211));
            dataChannel.ov0(this, NormalNotifyEvent.class, new AqS171S0100000_5(this, 212));
            dataChannel.ov0(this, BannerNotifyEvent.class, new AqS171S0100000_5(this, 213));
            dataChannel.lv0(this, ShakeBlockTipEvent.class, new AqS171S0100000_5(this, 214));
        }
    }

    public final void LL(C28913BWj c28913BWj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (c28913BWj.LJLIL == 0) {
            show();
            View LLF = LLF(c28913BWj.LJLILLLLZI);
            if (LLF != null) {
                C29306Beo.LJJLJLI(LLF);
                return;
            }
            View view = getView();
            if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "getContext()");
                C28488BGa c28488BGa = new C28488BGa(context);
                c28488BGa.setTag(c28913BWj.LJLILLLLZI);
                c28488BGa.setArrowVisibility(c28913BWj.LJLJJI);
                c28488BGa.setNotifyText(c28913BWj.LJLJI);
                viewGroup2.addView(c28488BGa);
                return;
            }
            return;
        }
        View LLF2 = LLF(c28913BWj.LJLILLLLZI);
        if (LLF2 != null) {
            C29306Beo.LJI(LLF2);
        }
        View view2 = getView();
        if (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null || viewGroup.getChildCount() <= 0) {
            hide();
        }
    }

    public final View LLF(BUW buw) {
        ViewGroup viewGroup;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C28488BGa) && childAt.getTag() == buw) {
                    return childAt;
                }
            }
        }
        return null;
    }
}
