package com.ss.android.ugc.aweme.arch.widgets.base;

import X.ActivityC45651qj;
import X.C08Z;
import X.C15X;
import X.C15Y;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C212568Vw;
import X.C220988lq;
import X.C220998lr;
import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class WidgetManager extends Fragment {
    public static final String LJLLI = C16880lQ.LJLLILLLL(WidgetManager.class);
    public Thread LJLIL;
    public Fragment LJLJJI;
    public View LJLJJL;
    public Context LJLJJLL;
    public C15Y LJLJL;
    public DataCenter LJLJLLL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C220998lr LJLJI = new C220998lr(this);
    public final List<Widget> LJLJLJ = new CopyOnWriteArrayList();
    public final C220988lq LJLL = new C08Z() { // from class: X.8lq
        @Override // X.C08Z
        public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            WidgetManager widgetManager = WidgetManager.this;
            if (fragment == widgetManager.LJLJJI) {
                fragmentManager.LJLJJLL(widgetManager.LJLL);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                childFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJJI(WidgetManager.this);
                c1b3.LJII();
            }
        }
    };

    public final void Dl(ListItemWidget listItemWidget) {
        if (listItemWidget == null) {
            return;
        }
        listItemWidget.LJLJJL = this.LJLJI;
        listItemWidget.LJLIL = this.LJLJJLL;
        listItemWidget.LJLJJI = this.LJLJLLL;
        ((CopyOnWriteArrayList) this.LJLJLJ).add(listItemWidget);
        getLifecycle().addObserver(listItemWidget);
    }

    public final void Hl(DataCenter dataCenter) {
        this.LJLJLLL = dataCenter;
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).LJLJJI = dataCenter;
        }
    }

    public final void Il(Widget widget) {
        if (widget == null) {
            return;
        }
        getLifecycle().removeObserver(widget);
        int i = C212568Vw.LIZ[getLifecycle().getCurrentState().ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    widget.onPause();
                    widget.onStop();
                    widget.onDestroy();
                }
            } else {
                widget.onStop();
                widget.onDestroy();
            }
        } else {
            widget.onDestroy();
        }
        widget.LJLJJL = null;
        widget.LJLJJI = null;
        ((CopyOnWriteArrayList) this.LJLJLJ).remove(widget);
        View view = widget.LJLILLLLZI;
        if (view != widget.LJLJI && (view instanceof ViewGroup)) {
            ((ViewGroup) view).removeAllViews();
        }
    }

    public static WidgetManager Gl(View view, Fragment fragment) {
        return xl(null, fragment, view, fragment.getContext());
    }

    public final void Al(int i, final Widget widget) {
        if (widget == null) {
            return;
        }
        widget.LJLJJL = this.LJLJI;
        widget.LJLIL = this.LJLJJLL;
        widget.LJLJJI = this.LJLJLLL;
        final ViewGroup viewGroup = (ViewGroup) this.LJLJJL.findViewById(i);
        widget.LJLILLLLZI = viewGroup;
        if (widget.LJIIJ() == 0) {
            widget.LJLJI = null;
            ((CopyOnWriteArrayList) this.LJLJLJ).add(widget);
            getLifecycle().addObserver(widget);
            return;
        }
        this.LJLJL.LIZ(widget.LJIIJ(), viewGroup, new C15X() { // from class: X.8lp
            @Override // X.C15X
            public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                if (WidgetManager.this.isRemoving() || WidgetManager.this.isDetached() || WidgetManager.this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                WidgetManager widgetManager = WidgetManager.this;
                Widget widget2 = widget;
                ViewGroup viewGroup3 = viewGroup;
                widgetManager.getClass();
                widget2.LJLJI = view;
                if ((viewGroup3 instanceof ViewGroup) && view != null) {
                    viewGroup3.addView(view);
                }
                ((CopyOnWriteArrayList) widgetManager.LJLJLJ).add(widget2);
                widgetManager.getLifecycle().addObserver(widget2);
            }
        });
    }

    public final void vl(int i, Widget widget) {
        if (widget == null) {
            return;
        }
        wl(this.LJLJJL.findViewById(i), widget);
    }

    public final void wl(View view, Widget widget) {
        if (widget == null) {
            return;
        }
        widget.LJLJJL = this.LJLJI;
        widget.LJLIL = this.LJLJJLL;
        widget.LJLJJI = this.LJLJLLL;
        widget.LJLJI = view;
        ((CopyOnWriteArrayList) this.LJLJLJ).add(widget);
        if (this.LJLIL == null) {
            this.LJLIL = C16880lQ.LLJJJJ().getThread();
        }
        if (C16880lQ.LLLLIIIILLL() == this.LJLIL) {
            getLifecycle().addObserver(widget);
        } else {
            this.LJLILLLLZI.post(new ARunnableS22S0200000_3(widget, this, 75));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLJ).iterator();
        while (it.hasNext()) {
            ((Widget) it.next()).LJIIJJI(i, i2, intent);
        }
    }

    public static WidgetManager xl(ActivityC45651qj activityC45651qj, Fragment fragment, View view, Context context) {
        FragmentManager childFragmentManager;
        if (activityC45651qj != null) {
            childFragmentManager = activityC45651qj.getSupportFragmentManager();
        } else if (fragment != null) {
            childFragmentManager = fragment.getChildFragmentManager();
        } else {
            return null;
        }
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.LJLJJI = fragment;
        widgetManager.LJLJJL = view;
        widgetManager.LJLJJLL = context;
        widgetManager.LJLJL = new C15Y(context);
        C16880lQ.LLZIL(widgetManager.LJLJJLL);
        if (fragment != null && fragment.getFragmentManager() != null) {
            fragment.getFragmentManager().LJJLIL(widgetManager.LJLL, false);
        }
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIIIZZ(0, 1, widgetManager, LJLLI);
        LIZ.LJII();
        return widgetManager;
    }
}
