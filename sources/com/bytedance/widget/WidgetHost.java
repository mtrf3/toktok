package com.bytedance.widget;

import X.C16880lQ;
import X.C72713SgH;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC72717SgL;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class WidgetHost extends Fragment {
    public static final String LJLJJLL = C16880lQ.LJLLILLLL(WidgetHost.class);
    public Fragment LJLIL;
    public final HashMap<Integer, Widget> LJLILLLLZI = new HashMap<>();
    public final List<InterfaceC72717SgL> LJLJI = new ArrayList();
    public final Map<Lifecycle, C72713SgH> LJLJJI = new WeakHashMap();
    public final Set<InterfaceC65784Pro<C76800UCe>> LJLJJL = new LinkedHashSet();

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void vl(Widget widget) {
        o.LJIIJ(widget, "widget");
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC72717SgL) it.next()).LIZ();
        }
        if (widget.isFirstLoadedInternal) {
            widget.isFirstLoadedInternal = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Widget widget = this.LJLILLLLZI.get(Integer.valueOf(i));
        if (widget != null) {
            widget.onActivityResult(i, i2, intent);
        }
        this.LJLILLLLZI.remove(Integer.valueOf(i));
    }

    public final void xl(Intent intent, int i, Widget widget) {
        o.LJIIJ(intent, "intent");
        o.LJIIJ(widget, "widget");
        this.LJLILLLLZI.put(Integer.valueOf(i), widget);
        super.startActivityForResult(intent, i);
    }

    public final void wl(Intent intent, int i, Bundle bundle, Widget widget) {
        o.LJIIJ(intent, "intent");
        o.LJIIJ(widget, "widget");
        this.LJLILLLLZI.put(Integer.valueOf(i), widget);
        super.startActivityForResult(intent, i, bundle);
    }
}
