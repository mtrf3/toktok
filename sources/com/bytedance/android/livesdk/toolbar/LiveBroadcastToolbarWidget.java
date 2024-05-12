package com.bytedance.android.livesdk.toolbar;

import X.C15380j0;
import X.C16310kV;
import X.C30230Bti;
import X.CCJ;
import X.EnumC30204BtI;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorBottomToolsRtlSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBroadcastToolbarWidget extends LiveToolbarWidget {
    public List<? extends EnumC30204BtI> LJLJLLL = new ArrayList();

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dl6;
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final void LJLZ() {
        View view;
        View findViewById;
        if (CCJ.LIZ(this.context) && (view = getView()) != null && (findViewById = view.findViewById(R.id.od)) != null) {
            findViewById.setPadding(0, 0, C15380j0.LIZ(8.0f), 0);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final void LJZ() {
        View findViewById;
        View findViewById2;
        View view = getView();
        if (view != null && (findViewById2 = view.findViewById(R.id.od)) != null) {
            findViewById2.setPadding(C15380j0.LIZ(8.0f), 0, 0, 0);
        }
        View view2 = getView();
        if (view2 != null && (findViewById = view2.findViewById(R.id.o4)) != null) {
            findViewById.setPadding(C15380j0.LIZ(8.0f), 0, C15380j0.LIZ(8.0f), 0);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final void LJZI() {
        ViewGroup viewGroup;
        super.LJZI();
        EnumC30206BtK enumC30206BtK = EnumC30206BtK.LEFT;
        DataChannel dataChannel = this.dataChannel;
        View view = getView();
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.od)) == null) {
            return;
        }
        List<? extends EnumC30204BtI> list = this.LJLJLLL;
        EnumC30226Bte toolbarStyle = this.LJLJJLL;
        o.LJIIIIZZ(toolbarStyle, "toolbarStyle");
        enumC30206BtK.createHolder(dataChannel, viewGroup, list, toolbarStyle);
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final LinearLayout LJZL() {
        View view = getView();
        if (view != null) {
            return (LinearLayout) view.findViewById(R.id.o4);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        ((ArrayList) C30230Bti.LIZIZ).clear();
        C30230Bti.LIZ.clear();
        C30230Bti.LIZJ = null;
        C30230Bti.LJIIIZ = null;
        C30230Bti.LJIIJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInit(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.toolbar.LiveBroadcastToolbarWidget.onInit(java.lang.Object[]):void");
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById;
        View view;
        if (LiveAnchorBottomToolsRtlSetting.getValue() == 0 && (view = getView()) != null) {
            C16310kV.LJIIIZ(view, 0);
        }
        if (LiveAnchorBottomToolsRtlSetting.getValue() == 1 || LiveAnchorBottomToolsRtlSetting.getValue() == 2) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.od)) != null) {
                C16310kV.LJIIIZ(findViewById, 2);
            }
            LinearLayout LJZL = LJZL();
            if (LJZL != null) {
                C16310kV.LJIIIZ(LJZL, 2);
            }
        }
        super.onLoad(objArr);
    }
}
