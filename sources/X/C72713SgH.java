package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.widget.Widget;
import com.bytedance.widget.WidgetHost;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS31S0210000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SgH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72713SgH {
    public static final /* synthetic */ InterfaceC74236TBo[] LJII;
    public static final C72714SgI LJIIIIZZ;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final CopyOnWriteArrayList<Widget> LIZJ;
    public final HashMap<Widget, ViewGroup> LIZLLL;
    public WidgetHost LJ;
    public final View LJFF;
    public final Lifecycle LJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C72713SgH.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;");
        C65352Pkq.LIZ.getClass();
        LJII = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C72713SgH.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;")};
        LJIIIIZZ = new C72714SgI();
    }

    public final WidgetHost LIZIZ() {
        WidgetHost widgetHost = this.LJ;
        if (widgetHost != null) {
            return widgetHost;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJ(Widget widget) {
        o.LJIIJ(widget, "widget");
        if (this.LIZJ.contains(widget)) {
            return;
        }
        widget.widgetHost = LIZIZ();
        this.LIZJ.add(widget);
        LIZIZ().vl(widget);
        this.LJI.addObserver(widget);
    }

    public final void LJI(Widget widget) {
        o.LJIIJ(widget, "widget");
        this.LJI.removeObserver(widget);
        int i = C212578Vx.LIZ[this.LJI.getCurrentState().ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        widget.pause$widget_release();
                        widget.stop$widget_release();
                        widget.destroy$widget_release();
                    }
                } else {
                    widget.stop$widget_release();
                    widget.destroy$widget_release();
                }
            } else {
                widget.destroy$widget_release();
            }
        } else if (!widget.isDestroyed) {
            widget.destroy$widget_release();
        }
        widget.widgetHost = null;
        this.LIZJ.remove(widget);
        if (this.LIZLLL.containsKey(widget)) {
            ViewGroup viewGroup = this.LIZLLL.get(widget);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                this.LIZLLL.remove(widget);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        Iterator it = ((ArrayList) LIZIZ().LJLJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC72717SgL) it.next()).LIZIZ();
        }
    }

    public final void LIZLLL(int i, JediBaseWidget widget) {
        o.LJIIJ(widget, "widget");
        LJFF(i, widget, new AqS116S0300000_12(this, widget, 3));
    }

    public C72713SgH(View view, Lifecycle parentLifecycle, WidgetHost widgetHost) {
        o.LJIIJ(widgetHost, "widgetHost");
        o.LJIIJ(parentLifecycle, "parentLifecycle");
        this.LJFF = view;
        this.LJI = parentLifecycle;
        this.LIZ = C221108m2.LIZIZ(new AqS162S0100000_12(widgetHost, 91));
        this.LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(widgetHost, 92));
        this.LIZJ = new CopyOnWriteArrayList<>();
        this.LIZLLL = new HashMap<>();
        this.LJ = widgetHost;
        widgetHost.LJLJJL.add(new AqS162S0100000_12(this, 90));
    }

    public final void LIZ(Widget widget, ViewGroup viewGroup, View view) {
        widget.setContentView$widget_release(view);
        viewGroup.addView(view);
        this.LIZJ.add(widget);
        LIZIZ().vl(widget);
        this.LJI.addObserver(widget);
    }

    public final void LIZJ(int i, Widget widget, boolean z) {
        o.LJIIJ(widget, "widget");
        LJFF(i, widget, new AqS31S0210000_12(this, z, widget, 0));
    }

    public final void LJFF(int i, Widget widget, InterfaceC88472Yns interfaceC88472Yns) {
        if (widget.getLayoutId() <= 0) {
            LJ(widget);
            return;
        }
        View view = this.LJFF;
        if (view != null) {
            widget.widgetHost = LIZIZ();
            ViewGroup container = (ViewGroup) view.findViewById(i);
            o.LJFF(container, "container");
            widget.setContainerView$widget_release(container);
            this.LIZLLL.put(widget, container);
            interfaceC88472Yns.invoke(container);
            return;
        }
        "make sure this WidgetManager is created with rootView".toString();
        throw new IllegalArgumentException("make sure this WidgetManager is created with rootView");
    }
}
