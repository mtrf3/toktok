package com.bytedance.android.livesdk.broadcast.guide;

import X.C29306Beo;
import X.C30320BvA;
import X.C5H3;
import X.C78996UzQ;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TopGuidanceWidget extends GuidanceBaseWidget {
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 114));

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ddi;
    }

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget
    public final void LJZI(C30320BvA guidanceModel) {
        o.LJIIIZ(guidanceModel, "guidanceModel");
        super.LJZI(guidanceModel);
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-contentTextView>(...)");
        ((TextView) value).setText(guidanceModel.LIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget
    public final void LJZL(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            Object value = this.LJLJJL.getValue();
            o.LJIIIIZZ(value, "<get-titleView>(...)");
            ((TextView) value).setText(charSequence);
            Object value2 = this.LJLJJL.getValue();
            o.LJIIIIZZ(value2, "<get-titleView>(...)");
            C29306Beo.LJJLJLI((View) value2);
            return;
        }
        Object value3 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value3, "<get-titleView>(...)");
        C29306Beo.LJI((View) value3);
    }

    @Override // com.bytedance.android.livesdk.broadcast.guide.GuidanceBaseWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        View view = getView();
        if (view == null) {
            return;
        }
        view.setClickable(true);
    }
}
