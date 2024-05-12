package com.bytedance.android.live.publicscreen.impl.widget;

import X.C15380j0;
import X.C16530kr;
import X.C16880lQ;
import X.C31492CXo;
import X.C5H3;
import X.C78996UzQ;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS49S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.impl.AddDisplaySourceOptionWrapperEvent;
import com.bytedance.android.live.publicscreen.impl.DisplaySourceOptionWrappersChannel;
import com.bytedance.android.live.publicscreen.impl.GiftHistoryEnabledChannel;
import com.bytedance.android.live.publicscreen.impl.RemoveDisplaySourceOptionWrapperEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ExtendedScreenFilterWidget extends LiveRecyclableWidget {
    public RadioButton LJLJJI;
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS165S0100000_15(this, 23));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS165S0100000_15(this, 24));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS165S0100000_15(this, 22));
    public final ACListenerS35S0100000_15 LJLJJL = new ACListenerS35S0100000_15(this, 14);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.do3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLJJI = (RadioButton) this.LJLIL.getValue();
    }

    public final void LJLZ(C31492CXo c31492CXo) {
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = getView();
        if (!(view instanceof LinearLayout) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.d7d, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "from(linearLayout.contex…ter, linearLayout, false)");
        LLLLIILL.setId(c31492CXo.LIZIZ);
        RadioButton radioButton = (RadioButton) LLLLIILL.findViewById(R.id.lot);
        radioButton.setClickable(false);
        ((TextView) LLLLIILL.findViewById(R.id.los)).setText(c31492CXo.LIZ());
        C16880lQ.LJIIJ(new ACListenerS49S0200000_15(this, radioButton, 4), LLLLIILL);
        viewGroup.addView(LLLLIILL);
        ViewGroup.LayoutParams layoutParams = LLLLIILL.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C16530kr.LJII(marginLayoutParams, C15380j0.LIZ(8.0f));
            LLLLIILL.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup()) {
            TextView textView = (TextView) findViewById(R.id.ls1);
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.mbj));
            }
            TextView textView2 = (TextView) findViewById(R.id.ls2);
            if (textView2 != null) {
                textView2.setText(C15380j0.LJIILJJIL(R.string.mbk));
            }
        }
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 12), (View) this.LJLJI.getValue());
        View findViewById = findViewById(R.id.lqb);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 13), findViewById);
        }
        ((View) this.LJLIL.getValue()).setClickable(false);
        ((View) this.LJLILLLLZI.getValue()).setClickable(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        List list;
        List list2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && o.LJ(dataChannel.kv0(GiftHistoryEnabledChannel.class), Boolean.FALSE)) {
            findViewById(R.id.lqb).setVisibility(8);
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (list2 = (List) dataChannel2.kv0(DisplaySourceOptionWrappersChannel.class)) != null && list2.isEmpty()) {
                hide();
            }
        }
        this.LJLJJI = (RadioButton) this.LJLIL.getValue();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (list = (List) dataChannel3.kv0(DisplaySourceOptionWrappersChannel.class)) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LJLZ((C31492CXo) it.next());
            }
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, AddDisplaySourceOptionWrapperEvent.class, new AqS181S0100000_15(this, 6));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, RemoveDisplaySourceOptionWrapperEvent.class, new AqS181S0100000_15(this, 7));
        }
    }

    public final void LJZ(View view, RadioButton radioButton) {
        this.LJLJJL.onClick(view);
        RadioButton radioButton2 = this.LJLJJI;
        if (radioButton2 != null) {
            radioButton2.setChecked(false);
        }
        this.LJLJJI = radioButton;
        radioButton.setChecked(true);
    }
}
