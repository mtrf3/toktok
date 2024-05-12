package X;

import Y.ARunnableS23S0300000_12;
import Y.IDLListenerS62S0200000_12;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import kotlin.jvm.internal.o;

/* renamed from: X.RrN */
/* loaded from: classes13.dex */
public final class C70853RrN {
    public static void LIZJ(InterfaceC27538ArO interfaceC27538ArO, View view) {
        o.LJIIIZ(view, "view");
        ViewTreeObserverOnPreDrawListenerC70854RrO viewTreeObserverOnPreDrawListenerC70854RrO = new ViewTreeObserverOnPreDrawListenerC70854RrO(interfaceC27538ArO, view);
        IDLListenerS62S0200000_12 iDLListenerS62S0200000_12 = new IDLListenerS62S0200000_12(interfaceC27538ArO, view, 2);
        if (C70655RoB.LIZ().drawListener) {
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC70854RrO);
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(iDLListenerS62S0200000_12);
        }
        C1DH.LJJIJIIJIL(10000L, new ARunnableS23S0300000_12(view, viewTreeObserverOnPreDrawListenerC70854RrO, iDLListenerS62S0200000_12, 8));
    }

    public static void LIZ(InterfaceC27538ArO interfaceC27538ArO, View view, LifecycleOwner lifecycleOwner) {
        if (interfaceC27538ArO instanceof Fragment) {
            if (view != null) {
                C78948Uye.LJIJJLI(view, interfaceC27538ArO);
            }
            PageNodeMonitorService.LJIIIZ().LIZLLL((LifecycleOwner) interfaceC27538ArO, interfaceC27538ArO);
        } else if (interfaceC27538ArO instanceof ActivityC45651qj) {
            PageNodeMonitorService.LJIIIZ().LIZLLL((LifecycleOwner) interfaceC27538ArO, interfaceC27538ArO);
        } else {
            if (lifecycleOwner == null) {
                return;
            }
            PageNodeMonitorService.LJIIIZ().LIZLLL(lifecycleOwner, interfaceC27538ArO);
        }
    }

    public static /* synthetic */ void LIZIZ(InterfaceC27538ArO interfaceC27538ArO, View view, LifecycleOwner lifecycleOwner, int i) {
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            lifecycleOwner = null;
        }
        interfaceC27538ArO.setupTrack(view, lifecycleOwner);
    }
}
