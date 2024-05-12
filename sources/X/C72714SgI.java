package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.widget.WidgetHost;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SgI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72714SgI {
    public static C72713SgH LIZ(View view, Fragment fragment) {
        o.LJIIJ(fragment, "fragment");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.LJFF(childFragmentManager, "fragment!!.childFragmentManager");
        String str = WidgetHost.LJLJJLL;
        Fragment LJJJIL = childFragmentManager.LJJJIL(str);
        if (!(LJJJIL instanceof WidgetHost)) {
            LJJJIL = null;
        }
        WidgetHost widgetHost = (WidgetHost) LJJJIL;
        if (widgetHost == null) {
            widgetHost = new WidgetHost();
            widgetHost.LJLIL = fragment;
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.LJJLIL(new OPC(widgetHost), false);
            }
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIIIZZ(0, 1, widgetHost, str);
            c1b3.LJII();
        }
        C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
        Lifecycle lifecycle = widgetHost.getLifecycle();
        o.LJFF(lifecycle, "it.lifecycle");
        c72714SgI.getClass();
        return LIZIZ(view, lifecycle, widgetHost);
    }

    public static C72713SgH LIZIZ(View view, Lifecycle lifecycle, WidgetHost widgetHost) {
        o.LJIIJ(lifecycle, "lifecycle");
        o.LJIIJ(widgetHost, "widgetHost");
        C72713SgH c72713SgH = (C72713SgH) ((WeakHashMap) widgetHost.LJLJJI).get(lifecycle);
        if (c72713SgH != null) {
            return c72713SgH;
        }
        C72713SgH c72713SgH2 = new C72713SgH(view, lifecycle, widgetHost);
        ((WeakHashMap) widgetHost.LJLJJI).put(lifecycle, c72713SgH2);
        return c72713SgH2;
    }
}
