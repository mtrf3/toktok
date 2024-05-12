package com.bytedance.android.livesdk.impl.revenue;

import X.C28817BSr;
import X.C32580CqW;
import X.EnumC28819BSt;
import X.InterfaceC31781Cdd;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TreasureBoxRootWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ddk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C32580CqW LJLZ;
        if (WatchMemoryLeakOpt.INSTANCE.settingValue() && (LJLZ = LJLZ()) != null) {
            LJLZ.setFragment(null);
        }
        int zIndex = EnumC28819BSt.PORTAL_LEAF.getZIndex();
        C32580CqW LJLZ2 = LJLZ();
        if (LJLZ2 != null) {
            LJLZ2.LJJZ(zIndex);
        }
    }

    public final C32580CqW LJLZ() {
        if (getView() instanceof C32580CqW) {
            View view = getView();
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.ui.framework.LeafHostLayout");
            return (C32580CqW) view;
        }
        View view2 = getView();
        if (view2 != null) {
            return (C32580CqW) view2.findViewById(R.id.fo8);
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Fragment fragment;
        C32580CqW LJLZ = LJLZ();
        if (LJLZ != null) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if (interfaceC31781Cdd != null) {
                fragment = interfaceC31781Cdd.getFragment();
            } else {
                fragment = null;
            }
            LJLZ.setFragment(fragment);
        }
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        C28817BSr c28817BSr = new C28817BSr(context, this.dataChannel);
        C32580CqW LJLZ2 = LJLZ();
        if (LJLZ2 != null) {
            LJLZ2.LJJLJLI(c28817BSr, null);
        }
    }
}
