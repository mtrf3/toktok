package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.ActivityC45651qj;
import X.C29306Beo;
import X.C31684Cc4;
import X.C31685Cc5;
import X.C31723Cch;
import X.C76800UCe;
import X.C7N;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.InterfaceC31095CIh;
import X.InterfaceC31710CcU;
import X.InterfaceC31718Ccc;
import X.InterfaceC31781Cdd;
import X.InterfaceC88472Yns;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS40S0200000_5;
import Y.AObserverS66S0300000_5;
import Y.AObserverS69S0200000_5;
import Y.AObserverS73S0100000_5;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import o3.IDaS468S0100000_5;
import o3.h0;

/* loaded from: classes6.dex */
public abstract class PreviewBaseSlotWidget extends PreviewWidget implements InterfaceC31718Ccc {
    public InterfaceC31095CIh LJLJI;
    public C31685Cc5 LJLJJI;
    public IIconSlot.SlotViewModel LJLJJL;
    public boolean LJLJJLL;
    public final long LJLJL = SystemClock.uptimeMillis();
    public long LJLJLJ;

    @Override // X.InterfaceC31718Ccc
    public final void LJJII(EnumC31700CcK strategy) {
        o.LJIIIZ(strategy, "strategy");
    }

    public abstract void LL();

    public abstract EnumC31700CcK LLF();

    public abstract EnumC30736C4m LLFF();

    public abstract boolean LLFFF(boolean z);

    public boolean LLFZ(BroadcastSettingResponse broadcastSetting) {
        o.LJIIIZ(broadcastSetting, "broadcastSetting");
        return false;
    }

    public abstract void LLII(BroadcastSettingResponse broadcastSettingResponse);

    public abstract void LLIIII(String str);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dps;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LLFII() {
        InterfaceC31095CIh interfaceC31095CIh = this.LJLJI;
        if (interfaceC31095CIh != null) {
            interfaceC31095CIh.load(this.widgetCallback.getFragment().mo49getActivity(), LLFF());
        }
        InterfaceC31095CIh interfaceC31095CIh2 = this.LJLJI;
        if (interfaceC31095CIh2 != null) {
            this.widgetCallback.getFragment().getLifecycle().addObserver(interfaceC31095CIh2);
        }
    }

    public final ActivityC45651qj getActivity() {
        Fragment fragment;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null) {
            return fragment.mo49getActivity();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        IIconSlot.SlotViewModel slotViewModel;
        Boolean bool;
        String str;
        MutableLiveData<String> mutableLiveData;
        if (this.LJLJJI == null || (slotViewModel = this.LJLJJL) == null) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LJLILLLLZI;
        if (mutableLiveData2 != null) {
            bool = mutableLiveData2.getValue();
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C31685Cc5 c31685Cc5 = this.LJLJJI;
            if (c31685Cc5 != null) {
                c31685Cc5.setVisibility(0);
            }
            super.show();
        }
        LLFF().name();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("slot visible change, visible: true, iconText: ");
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJJL;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LJLLI) != null) {
            str = mutableLiveData.getValue();
        } else {
            str = null;
        }
        LIZ.append(str);
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
        C31684Cc4.LIZLLL("PreviewBaseSlowWidget", message, null);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void LJZL() {
        super.LJZL();
        this.LJLJLJ = SystemClock.uptimeMillis();
        InterfaceC31095CIh createIconSlotController = C7N.LJIJJLI().createIconSlotController(getActivity(), this, LLFF(), LLF());
        this.LJLJI = createIconSlotController;
        if (createIconSlotController != null) {
            createIconSlotController.setDataChannel(this.dataChannel);
        }
        C31685Cc5 c31685Cc5 = new C31685Cc5(getActivity(), 0);
        this.LJLJJI = c31685Cc5;
        c31685Cc5.setId(View.generateViewId());
        C31685Cc5 c31685Cc52 = this.LJLJJI;
        if (c31685Cc52 != null) {
            c31685Cc52.setVisibility(8);
        }
        this.dataChannel.ov0(this, BroadcastSettingResponseChannel.class, new AqS171S0100000_5(this, 629));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        String str;
        MutableLiveData<String> mutableLiveData;
        super.hide();
        if (this.LJLJJI == null || this.LJLJJL == null) {
            return;
        }
        LLFF().name();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("slot visible change, visible: false, iconText: ");
        IIconSlot.SlotViewModel slotViewModel = this.LJLJJL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLLI) != null) {
            str = mutableLiveData.getValue();
        } else {
            str = null;
        }
        LIZ.append(str);
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
        C31684Cc4.LIZLLL("PreviewBaseSlowWidget", message, null);
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLL(InterfaceC31710CcU<?, ?, ?> slotWidget, IIconSlot.SlotViewModel viewModel) {
        TextView alertText;
        TextView alertText2;
        o.LJIIIZ(slotWidget, "slotWidget");
        o.LJIIIZ(viewModel, "viewModel");
        viewModel.LJLIL.setValue(Boolean.TRUE);
        this.LJLJJL = viewModel;
        o.LJIIIIZZ(slotWidget.LIZ(), "slotWidget.bizType()");
        viewModel.LJLILLLLZI.observe(this.widgetCallback.getFragment(), new AObserverS66S0300000_5(slotWidget, viewModel, this, 10));
        viewModel.LJLL.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 16));
        viewModel.LJLJJL.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 17));
        viewModel.LJLJJLL.observe(this.widgetCallback.getFragment(), new AObserverS73S0100000_5(this, 18));
        viewModel.LJLJJI.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 18));
        viewModel.LJLLJ.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 19));
        viewModel.LJLJL.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 20));
        viewModel.LJLLI.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 21));
        viewModel.LJZI.observe(this.widgetCallback.getFragment(), new AObserverS69S0200000_5((Object) viewModel, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 22));
        C31685Cc5 c31685Cc5 = this.LJLJJI;
        if (c31685Cc5 != null) {
            c31685Cc5.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS40S0200000_5(this, slotWidget, 6)));
        }
        C31685Cc5 c31685Cc52 = this.LJLJJI;
        if (c31685Cc52 != null) {
            h0.LJIJI(c31685Cc52, new IDaS468S0100000_5(this, 1));
        }
        Boolean bool = viewModel.LLIFFJFJJ;
        o.LJIIIIZZ(bool, "viewModel.gamePartnershipBusiness");
        if (bool.booleanValue()) {
            C31685Cc5 c31685Cc53 = this.LJLJJI;
            if (c31685Cc53 != null) {
                c31685Cc53.LJJLJLI();
            }
            C31685Cc5 c31685Cc54 = this.LJLJJI;
            if (c31685Cc54 != null && (alertText2 = c31685Cc54.getAlertText()) != null) {
                alertText2.setVisibility(8);
            }
            C31685Cc5 c31685Cc55 = this.LJLJJI;
            if (c31685Cc55 == null || (alertText = c31685Cc55.getAlertText()) == null) {
                return;
            }
            alertText.setText("");
        }
    }

    @Override // X.InterfaceC31718Ccc
    public final void LJLLLL(C31723Cch iIconSlot, IIconSlot.SlotViewModel viewModel) {
        o.LJIIIZ(iIconSlot, "iIconSlot");
        o.LJIIIZ(viewModel, "viewModel");
        InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU = iIconSlot.LIZIZ;
        o.LJIIIIZZ(interfaceC31710CcU, "iIconSlot.slotWidget");
        LJLLL(interfaceC31710CcU, viewModel);
    }
}
