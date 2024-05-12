package X;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Y9y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86934Y9y implements RecyclableWidgetEventListener {
    public final DataChannel LJLIL;

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onHide(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPostCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZIZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPostCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZJ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPostDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LIZLLL(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final /* synthetic */ void onPostInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA0.LJ(this, interfaceC30319Bv9, liveRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final /* synthetic */ void onPostUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA0.LJI(this, interfaceC30319Bv9, liveRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPreCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJII(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPreCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJIIIIZZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onPreDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJIIIZ(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final /* synthetic */ void onPreInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA0.LJIIJ(this, interfaceC30319Bv9, liveRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final /* synthetic */ void onPreLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA0.LJIIJJI(this, interfaceC30319Bv9, liveRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final /* synthetic */ void onPreUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA0.LJIIL(this, interfaceC30319Bv9, liveRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onShow(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA0.LJIILIIL(this, interfaceC30319Bv9, widget);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final /* bridge */ /* synthetic */ void onWidgetRequestLoading(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget, boolean z) {
        YA0.LJIILJJIL(this, interfaceC30319Bv9, widget, z);
    }

    public C86934Y9y(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostLoad(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJFF(this, widgetManager, recyclableWidget);
        InterfaceC28658BMo.LIZ.getClass();
        String str = C28663BMt.LIZJ.get(C16880lQ.LJLLJ(recyclableWidget.getClass()));
        if (str != null) {
            C28663BMt.LIZ(this.LJLIL, str);
        }
    }
}
