package com.bytedance.android.live.publicscreen.impl.widget;

import X.C28329B9x;
import X.C30326BvG;
import X.C31255COl;
import X.CN1;
import X.InterfaceC31781Cdd;
import Y.IDDListenerS392S0100000_5;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pin.widget.LandscapeCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.IsFromLandscapeData;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecyclePublicScreenWidgetSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LandscapePublicScreenWidget extends PublicScreenWidget {
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.CRA
    public final boolean wg0() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void LJZI() {
        C31255COl c31255COl = this.LLIIII.LIZ;
        if (c31255COl != null) {
            c31255COl.setHasFixedSize(true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecyclePublicScreenWidgetSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback;
        IPublicScreenContextWidget iPublicScreenContextWidget;
        ViewTreeObserver viewTreeObserver;
        super.onLoad(objArr);
        if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldOptimize()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && o.LJ(dataChannel.kv0(IsFromPortraitData.class), Boolean.TRUE)) {
                View view = getView();
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new IDDListenerS392S0100000_5(this, 1));
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(IsFromPortraitData.class, Boolean.FALSE);
                }
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.rv0(IsFromLandscapeData.class, Boolean.TRUE);
            }
        }
        enableSubWidgetManager(new WidgetCreateTimeUtil(null, 1, 0 == true ? 1 : 0), C30326BvG.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C28329B9x.LIZJ(getContext()));
        if (this.LLD != null && ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).xg(this.LLD)) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if ((interfaceC31781Cdd instanceof LiveRecyclableWidget.RecyclableWidgetCallback) && (recyclableWidgetCallback = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC31781Cdd) != null && (iPublicScreenContextWidget = (IPublicScreenContextWidget) recyclableWidgetCallback.load(R.id.hq2, LandscapeCommentPinnedWidget.class, true)) != null) {
                iPublicScreenContextWidget.LJLIL = this.LJLLI.LLIILZL;
            }
        }
    }
}
