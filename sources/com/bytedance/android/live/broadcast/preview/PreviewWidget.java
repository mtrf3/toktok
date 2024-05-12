package com.bytedance.android.live.broadcast.preview;

import X.C0N9;
import X.C0NA;
import X.C29306Beo;
import X.C65352Pkq;
import X.C65776Prg;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class PreviewWidget extends LiveWidget {
    public final boolean LJLIL = true;
    public boolean LJLILLLLZI;

    public void LJZ() {
        View view;
        this.LJLILLLLZI = true;
        C65776Prg LIZ = C65352Pkq.LIZ(getClass());
        PreviewWidget LIZIZ = C0N9.LIZIZ(LIZ);
        if (LIZIZ != null && (view = LIZIZ.getView()) != null) {
            C29306Beo.LJJLIIIJJI(view, C29306Beo.LJJIFFI((Boolean) ((LinkedHashMap) C0NA.LJ).get(LIZ)) && C0NA.LIZ(LIZ));
        }
    }

    public void LJZI() {
        this.LJLILLLLZI = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void hide() {
        C65776Prg LIZ = C65352Pkq.LIZ(getClass());
        C0NA.LJ.put(LIZ, Boolean.FALSE);
        C0NA.LIZLLL(LIZ);
    }

    public void onHide() {
    }

    public void onShow() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        C65776Prg LIZ = C65352Pkq.LIZ(getClass());
        C0NA.LJ.put(LIZ, Boolean.TRUE);
        C0NA.LJ(LIZ);
    }

    public void LJZL() {
        C29306Beo.LJI(getView());
        if (!(this instanceof BannerWidget)) {
            show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        LJZL();
        LJZ();
    }

    public boolean LJLZ() {
        return this.LJLIL;
    }
}
