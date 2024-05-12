package com.bytedance.android.live.pin.widget;

import X.C15380j0;
import X.C16880lQ;
import X.C31401CUb;
import X.CQQ;
import X.CUG;
import X.CUK;
import X.CUN;
import X.InterfaceC31781Cdd;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ExtendScreenCommentPinnedWidget extends BaseCommentPinnedWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dam;
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final int LLFZ() {
        return C15380j0.LIZ(24.0f);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final CUN LLII() {
        return new C31401CUb();
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void LLIIII() {
        Fragment fragment;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null && fragment.mo49getActivity() != null) {
            this.LJLJJL = (PinMessageViewModel) ViewModelProviders.of(interfaceC31781Cdd.getFragment()).get("extended", PinMessageViewModel.class);
        }
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final CUK LJZI() {
        ViewGroup viewGroup;
        View view = getView();
        CQQ cqq = null;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        View pinView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.context), R.layout.daj, viewGroup, false);
        viewGroup.addView(pinView);
        o.LJIIIIZZ(pinView, "pinView");
        PinMessageViewModel pinMessageViewModel = this.LJLJJL;
        if (pinMessageViewModel != null) {
            cqq = pinMessageViewModel.LJLIL;
        }
        return new CUK(pinView, cqq);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final CUG LJZL() {
        ViewGroup viewGroup;
        View view = getView();
        CQQ cqq = null;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        View pinView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.context), R.layout.dak, viewGroup, false);
        viewGroup.addView(pinView);
        o.LJIIIIZZ(pinView, "pinView");
        PinMessageViewModel pinMessageViewModel = this.LJLJJL;
        if (pinMessageViewModel != null) {
            cqq = pinMessageViewModel.LJLIL;
        }
        return new CUG(pinView, cqq, true);
    }
}
