package com.bytedance.ies.sdk.widgets;

import X.C0K2;
import X.C16880lQ;
import X.C29306Beo;
import X.C51029K0z;
import X.C76800UCe;
import X.InterfaceC31795Cdr;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class WidgetCreateTimeUtil implements InterfaceC31795Cdr {
    public final InterfaceC88472Yns<com.bytedance.android.widget.Widget, C76800UCe> onWidgetLoadedListener;
    public final Map<String, Object> widgetCreateTimeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetCreateTimeUtil() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void clear() {
        this.widgetCreateTimeMap.clear();
    }

    public final void send() {
        if (!LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_widget_create_cost_time")) {
            return;
        }
        C0K2.LJIILL(0, 1, "ttlive_widget_create_cost_time", C51029K0z.LJJIIZI(new OSZ("widget_time", this.widgetCreateTimeMap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetCreateTimeUtil(InterfaceC88472Yns<? super com.bytedance.android.widget.Widget, C76800UCe> interfaceC88472Yns) {
        this.onWidgetLoadedListener = interfaceC88472Yns;
        this.widgetCreateTimeMap = new HashMap();
    }

    @Override // X.InterfaceC31795Cdr
    public boolean needUploadTime(com.bytedance.android.widget.Widget widget) {
        LiveRecyclableWidget liveRecyclableWidget;
        Boolean bool = null;
        if ((widget instanceof LiveRecyclableWidget) && (liveRecyclableWidget = (LiveRecyclableWidget) widget) != null) {
            bool = Boolean.valueOf(liveRecyclableWidget.isInitialized());
        }
        return C29306Beo.LJIL(bool);
    }

    @Override // X.InterfaceC31795Cdr
    public void onLoad(com.bytedance.android.widget.Widget widget, long j) {
        String LJLLJ;
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            return;
        }
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_widget_create_cost_time")) {
            Map<String, Object> map = this.widgetCreateTimeMap;
            if (widget == null || (LJLLJ = C16880lQ.LJLLJ(widget.getClass())) == null) {
                return;
            } else {
                map.put(LJLLJ, Long.valueOf(j));
            }
        }
        InterfaceC88472Yns<com.bytedance.android.widget.Widget, C76800UCe> interfaceC88472Yns = this.onWidgetLoadedListener;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(widget);
        }
    }

    public /* synthetic */ WidgetCreateTimeUtil(InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC88472Yns);
    }
}
