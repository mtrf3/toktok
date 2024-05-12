package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Y9x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86933Y9x implements RecyclableWidgetEventListener {
    public final C28282B8c LJLIL;

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

    public C86933Y9x(C28282B8c manager) {
        o.LJIIIZ(manager, "manager");
        this.LJLIL = manager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostLoad(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget recyclableWidget) {
        o.LJIIIZ(widgetManager, "widgetManager");
        o.LJIIIZ(recyclableWidget, "recyclableWidget");
        YA0.LJFF(this, widgetManager, recyclableWidget);
        if (recyclableWidget instanceof YA9) {
            YA9 ya9 = (YA9) recyclableWidget;
            if (this.LJLIL.LIZ(ya9) && this.LJLIL.LIZIZ()) {
                recyclableWidget.hide();
                C28282B8c c28282B8c = this.LJLIL;
                c28282B8c.getClass();
                if (c28282B8c.LIZ(ya9)) {
                    c28282B8c.LIZIZ.add(ya9);
                }
                if (c28282B8c.LIZIZ.size() >= ((ArrayList) c28282B8c.LIZJ).size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<YA9> it = c28282B8c.LIZIZ.iterator();
                    while (it.hasNext()) {
                        YA9 next = it.next();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(next.LJJIZ(), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        if (next instanceof YA7) {
                            ((YA7) next).LJLJI();
                        }
                        ofFloat.addListener(new YA4(next));
                        arrayList.add(ofFloat);
                        ((Widget) next).show();
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList);
                        animatorSet.addListener(new C77576UcW());
                        animatorSet.start();
                    }
                }
            }
        }
    }
}
