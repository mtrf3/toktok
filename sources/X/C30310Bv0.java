package X;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.SubWidgetManagerListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Bv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30310Bv0 implements SubWidgetManagerListener {
    public final /* synthetic */ int LIZ;

    public C30310Bv0(int i) {
        this.LIZ = i;
    }

    @Override // com.bytedance.ies.sdk.widgets.SubWidgetManagerListener
    public final void onDestroySubWidgetManager(RecyclableWidgetManager parentWidgetManager, RecyclableWidgetManager widgetManager, LiveWidget widget) {
        o.LJIIIZ(parentWidgetManager, "parentWidgetManager");
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(widget, "widget");
        C30317Bv7.LIZIZ(widgetManager);
    }

    @Override // com.bytedance.ies.sdk.widgets.SubWidgetManagerListener
    public final void onSubWidgetManagerCreated(RecyclableWidgetManager parentWidgetManager, RecyclableWidgetManager widgetManager, LiveWidget widget) {
        o.LJIIIZ(parentWidgetManager, "parentWidgetManager");
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(widget, "widget");
        C30317Bv7.LJI(this.LIZ, widgetManager);
    }
}
