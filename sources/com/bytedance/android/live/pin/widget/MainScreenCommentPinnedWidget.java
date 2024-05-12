package com.bytedance.android.live.pin.widget;

import X.C006900z;
import X.C0KY;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C31402CUc;
import X.C47061t0;
import X.C5H3;
import X.C76800UCe;
import X.C78720Uuy;
import X.C78996UzQ;
import X.CQQ;
import X.CUG;
import X.CUK;
import X.CUN;
import X.CUX;
import X.CUZ;
import X.InterfaceC31781Cdd;
import Y.AObserverS73S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.dialogoeventbserver.LiveDialogStatusEventObserverManager;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.MainScreenPinnedWidgetLoadedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class MainScreenCommentPinnedWidget extends BaseCommentPinnedWidget {
    public final C5H3 LJZL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 45));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dc3;
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final int LLFZ() {
        return C15380j0.LIZ(20.0f);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final CUN LLII() {
        return new C31402CUc();
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void LLIIII() {
        MutableLiveData<C006900z> mutableLiveData;
        Fragment fragment;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null && fragment.mo49getActivity() != null) {
            this.LJLJJL = (PinMessageViewModel) ViewModelProviders.of(interfaceC31781Cdd.getFragment()).get(PinMessageViewModel.class);
        }
        InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
        if (interfaceC31781Cdd2 != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            Fragment fragment2 = interfaceC31781Cdd2.getFragment();
            o.LJIIIIZZ(fragment2, "fragment");
            LiveDialogStatusEventObserverManager LIZ = C0KY.LIZ(fragment2, dataChannel);
            if (LIZ != null && (mutableLiveData = LIZ.LJLJI) != null) {
                mutableLiveData.observe(this, new AObserverS73S0100000_5(this, 12));
            }
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
        View pinView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.context), R.layout.dbi, viewGroup, false);
        viewGroup.addView(pinView);
        o.LJIIIIZZ(pinView, "pinView");
        PinMessageViewModel pinMessageViewModel = this.LJLJJL;
        if (pinMessageViewModel != null) {
            cqq = pinMessageViewModel.LJLIL;
        }
        return new CUK(pinView, cqq, 0);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final CUG LJZL() {
        ViewGroup viewGroup;
        View view = getView();
        CQQ cqq = null;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        View pinView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.context), R.layout.dbj, viewGroup, false);
        viewGroup.addView(pinView);
        o.LJIIIIZZ(pinView, "pinView");
        PinMessageViewModel pinMessageViewModel = this.LJLJJL;
        if (pinMessageViewModel != null) {
            cqq = pinMessageViewModel.LJLIL;
        }
        return new CUG(pinView, cqq, false);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget
    public final void LLIIIILZ(CUX cux) {
        ImageModel imageModel;
        Object value = this.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-indicatorStartIcon>(...)");
        C47061t0 c47061t0 = (C47061t0) value;
        if (cux != null && (imageModel = cux.LIZIZ) != null) {
            c47061t0.setVisibility(0);
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            LJIIIZ.LJIIJJI = new CUZ(c47061t0);
            LJIIIZ.LJIIJJI(c47061t0);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        c47061t0.setVisibility(8);
    }

    @Override // com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onLoad(objArr);
        View view = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(C15380j0.LIZ(8.0f));
            marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginStart());
            View view2 = getView();
            if (view2 != null) {
                view2.requestLayout();
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(MainScreenPinnedWidgetLoadedChannel.class, Boolean.TRUE);
        }
    }
}
