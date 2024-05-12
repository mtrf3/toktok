package com.bytedance.android.livesdk.shorttouch.ui;

import X.C76800UCe;
import X.C77111UOd;
import X.CN1;
import X.InterfaceC88472Yns;
import X.UOJ;
import X.UOO;
import X.UOS;
import X.UOU;
import X.UOV;
import X.UOW;
import X.UOX;
import X.UOY;
import Y.ALAdapterS6S0300000_13;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PortraitShortTouchPreviewWidget extends ShortTouchPreviewWidget {
    public ViewGroup LJLIL;
    public UOV LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dih;
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        UOV uov = this.LJLILLLLZI;
        if (uov != null && uov.isRunning()) {
            uov.LIZJ();
        }
        hide();
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, X.InterfaceC77110UOc
    public final void LJJIJIL(UOW message) {
        InterfaceC88472Yns<Animator.AnimatorListener, C76800UCe> LIZ;
        o.LJIIIZ(message, "message");
        UOJ uoj = C77111UOd.LIZ;
        UOX LIZIZ = uoj.LIZIZ(UOS.ID, message.LJLILLLLZI);
        if (LIZIZ != null) {
            int i = UOO.LIZ[message.LJLIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LJLZ(message);
                return;
            }
            UOY uoy = LIZIZ.LIZIZ;
            if (uoy == null) {
                LJLZ(message);
                return;
            }
            View LIZJ = uoy.LIZJ();
            ViewGroup viewGroup = this.LJLIL;
            if (viewGroup == null) {
                return;
            }
            try {
                viewGroup.removeAllViews();
                ViewGroup viewGroup2 = this.LJLIL;
                if (viewGroup2 != null) {
                    viewGroup2.addView(LIZJ);
                }
            } catch (Exception unused) {
            }
            UOV LIZ2 = LIZIZ.LIZIZ.LIZ(viewGroup);
            this.LJLILLLLZI = LIZ2;
            if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
                LIZ.invoke(new ALAdapterS6S0300000_13(this, LIZIZ, message, 0));
            }
            ((IUnityAnimationService) CN1.LIZ(IUnityAnimationService.class)).BQ(this.dataChannel, LIZIZ.LIZLLL, new UOU(this));
            return;
        }
        uoj.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup viewGroup;
        View view = getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LJLIL = viewGroup;
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        hide();
    }
}
