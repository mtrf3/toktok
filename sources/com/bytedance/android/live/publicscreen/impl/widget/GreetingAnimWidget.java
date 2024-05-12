package com.bytedance.android.live.publicscreen.impl.widget;

import X.C03510Bv;
import X.C5H3;
import X.C78996UzQ;
import Y.IDCListenerS254S0100000_5;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.impl.GreetingReceivedEvent;
import com.bytedance.android.livesdk.watch.StartClearScreenEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class GreetingAnimWidget extends IPublicScreenContextWidget {
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 58));
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 59));
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 60));
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 61));
    public AnimatorSet LJLJJLL;
    public boolean LJLJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dav;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        AnimatorSet animatorSet;
        ViewGroup viewGroup;
        this.LJLJL = false;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C03510Bv.LIZIZ(viewGroup);
        }
        AnimatorSet animatorSet2 = this.LJLJJLL;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LJLJJLL) != null) {
            animatorSet.cancel();
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new IDCListenerS254S0100000_5(this, 0));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, GreetingReceivedEvent.class, new AqS171S0100000_5(this, 90));
            dataChannel.lv0(this, StartClearScreenEvent.class, new AqS171S0100000_5(this, 91));
        }
    }
}
