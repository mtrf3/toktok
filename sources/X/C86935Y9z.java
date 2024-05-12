package X;

import android.os.SystemClock;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Y9z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86935Y9z implements RecyclableWidgetEventListener {
    public final java.util.Map<Widget, YA3> LJLIL = new LinkedHashMap();
    public final C1UB<YA3> LJLILLLLZI = new C1UB<>(10);

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onHide(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPostCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZIZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPostDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZLLL(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPreCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJII(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPreDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJIIIZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onShow(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJIILIIL(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onWidgetRequestLoading(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget, boolean z) {
        YA0.LJIILJJIL(this, interfaceC30319Bv9, widget, z);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPostCreateView(InterfaceC30319Bv9 widgetManager, Widget widget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(widget, "widget");
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(widget);
        if (ya3 == null) {
            return;
        }
        ya3.LJ = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostInit(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJ(this, widgetManager, recyclableWidget);
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(recyclableWidget);
        if (ya3 == null) {
            return;
        }
        ya3.LJI = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostLoad(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJFF(this, widgetManager, recyclableWidget);
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(recyclableWidget);
        if (ya3 == null) {
            return;
        }
        ya3.LJIIIIZZ = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostUnload(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJI(this, widgetManager, recyclableWidget);
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(recyclableWidget);
        if (ya3 == null) {
            return;
        }
        this.LJLIL.remove(recyclableWidget);
        ya3.LJIIJ = SystemClock.uptimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LIZLLL().getResources().getResourceEntryName(recyclableWidget.getId()));
        LIZ.append(" createDuration ");
        C48339Iy7.LIZLLL(ya3.LJ, ya3.LIZLLL, LIZ, " initDuration ");
        C48339Iy7.LIZLLL(ya3.LJI, ya3.LJFF, LIZ, " loadDuration ");
        C48339Iy7.LIZLLL(ya3.LJIIIIZZ, ya3.LJII, LIZ, " unloadDuration ");
        LIZ.append(ya3.LJIIJ - ya3.LJIIIZ);
        C0NB.LJ("SlardarRecyclableWidgetEventListener", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPreCreateView(InterfaceC30319Bv9 widgetManager, Widget widget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(widget, "widget");
        String LJLLJ = C16880lQ.LJLLJ(widget.getClass());
        java.util.Map<Widget, YA3> map = this.LJLIL;
        YA3 LIZIZ = this.LJLILLLLZI.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZ();
        } else {
            LIZIZ = new YA3();
        }
        LIZIZ.LIZ = LJLLJ;
        LIZIZ.LIZLLL = SystemClock.uptimeMillis();
        map.put(widget, LIZIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreInit(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJIIJ(this, widgetManager, recyclableWidget);
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(recyclableWidget);
        if (ya3 == null) {
            return;
        }
        ya3.LJFF = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreLoad(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJIIJJI(this, widgetManager, recyclableWidget);
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(recyclableWidget);
        if (ya3 == null) {
            return;
        }
        ya3.LJII = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreUnload(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJIIL(this, widgetManager, recyclableWidget);
        YA3 ya3 = (YA3) ((LinkedHashMap) this.LJLIL).get(recyclableWidget);
        if (ya3 == null) {
            return;
        }
        ya3.LJIIIZ = SystemClock.uptimeMillis();
    }
}
