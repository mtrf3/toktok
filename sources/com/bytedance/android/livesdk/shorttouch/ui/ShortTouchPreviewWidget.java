package com.bytedance.android.livesdk.shorttouch.ui;

import X.C0NB;
import X.C29726Bla;
import X.C77111UOd;
import X.InterfaceC77110UOc;
import X.UOH;
import X.UOJ;
import X.UOW;
import X.X1D;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchWidgetRecycleSetting;
import com.bytedance.android.livesdk.shorttouch.ShortTouchMessageEvent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class ShortTouchPreviewWidget extends PerformProcessWidget implements InterfaceC77110UOc {
    public void LJJIJIL(UOW message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveShortTouchWidgetRecycleSetting.INSTANCE.getPreviewWidgetRecycle();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        UOJ uoj = C77111UOd.LIZ;
        uoj.LIZLLL = null;
        uoj.LJFF = false;
    }

    public final void LJLZ(UOW message) {
        o.LJIIIZ(message, "message");
        if (!this.isDestroyed) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Short touch preview] Notify short touch, id = ");
            LIZ.append(message.LJLILLLLZI);
            LIZ.append(", operation = ");
            LIZ.append(message.LJLIL);
            C0NB.LIZIZ("TikTok Live Short Touch", X1D.LIZIZ(LIZ));
            this.dataChannel.qv0(ShortTouchMessageEvent.class, message);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C29726Bla) {
                    UOH.LIZJ = ((C29726Bla) obj).LIZ;
                }
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_short_touch_preview_widget_load_finished")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long j = UOH.LIZJ;
            long j2 = -1;
            if (j != -1) {
                j2 = elapsedRealtime - j;
            }
            linkedHashMap.put("duration", Long.valueOf(j2));
            UOH.LIZ("ttlive_short_touch_preview_widget_load_finished", linkedHashMap);
        }
        UOJ uoj = C77111UOd.LIZ;
        uoj.LIZLLL = this;
        uoj.LJFF = true;
        uoj.LIZJ();
    }
}
