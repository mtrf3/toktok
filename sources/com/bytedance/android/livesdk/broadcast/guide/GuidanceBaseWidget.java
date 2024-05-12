package com.bytedance.android.livesdk.broadcast.guide;

import X.C2A7;
import X.C30320BvA;
import X.C31466CWo;
import X.C47061t0;
import X.C5H3;
import X.C78996UzQ;
import X.InterfaceC81252Vui;
import Y.AObserverS73S0100000_5;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.GuidanceVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class GuidanceBaseWidget extends AnimatableRecyclableWidget {
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 112));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 113));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 111));
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 110));

    public void LJZL(CharSequence charSequence) {
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.daw;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C2A7 LJLZ() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-actionView>(...)");
        return (C2A7) value;
    }

    public final C47061t0 LJZ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-imageView>(...)");
        return (C47061t0) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        Animatable LIZ;
        super.hide();
        InterfaceC81252Vui controller = LJZ().getController();
        if (controller != null && (LIZ = controller.LIZ()) != null && LIZ.isRunning()) {
            LIZ.stop();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(GuidanceVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        super.onHideAnimationEnd();
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        super.onShowAnimationStart();
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        cancelShowAnimation();
        cancelHideAnimation();
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(GuidanceVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void animateShow() {
        super.animateShow();
    }

    public void LJZI(C30320BvA guidanceModel) {
        o.LJIIIZ(guidanceModel, "guidanceModel");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = guidanceModel.LIZJ;
        if (str != null) {
            spannableStringBuilder.append((char) 65532);
            spannableStringBuilder.append((CharSequence) "  ");
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            spannableStringBuilder.setSpan(new C31466CWo(context, str), 0, 1, 33);
        }
        spannableStringBuilder.append(guidanceModel.LIZ);
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-contentTextView>(...)");
        ((TextView) value).setText(spannableStringBuilder);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        ((GuidanceViewModel) this.LJLIL.getValue()).LJLJJI.observe(this, new AObserverS73S0100000_5(this, 15));
    }
}
