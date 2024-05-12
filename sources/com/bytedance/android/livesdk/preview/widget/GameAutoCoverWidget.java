package com.bytedance.android.livesdk.preview.widget;

import X.BDW;
import X.C221108m2;
import X.C30326BvG;
import X.C48459J0d;
import X.C62822Ol8;
import X.C73411SrX;
import X.InterfaceC30442Bx8;
import X.InterfaceC31781Cdd;
import Y.ARunnableS41S0100000_5;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class GameAutoCoverWidget extends LiveWidget {
    public final String LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 258));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 257));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(BDW.LJLIL);
    public C73411SrX LJLJJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.doa;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 181), this);
    }

    public GameAutoCoverWidget(String str) {
        this.LJLIL = str;
    }

    public final void LJLZ(boolean z) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.q;
        if (!c48459J0d.LIZJ().booleanValue() && z) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                new GameAutoCoverAnimationDialog().show(childFragmentManager, "GameAutoCoverAnimationDialog");
            }
            c48459J0d.LIZ(Boolean.TRUE);
        }
    }
}
