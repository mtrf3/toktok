package Y;

import X.C85108Xai;
import X.C86904Y8u;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public class IDLListenerS11S0300000_15 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS11S0300000_15 iDLListenerS11S0300000_15) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) iDLListenerS11S0300000_15.l0;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            ((ViewTreeObserver) iDLListenerS11S0300000_15.l0).removeOnGlobalLayoutListener(iDLListenerS11S0300000_15);
            C86904Y8u c86904Y8u = (C86904Y8u) iDLListenerS11S0300000_15.l2;
            ViewPager viewPager = (ViewPager) iDLListenerS11S0300000_15.l1;
            View view = c86904Y8u.LJLJI;
            if (viewPager != null && view != null) {
                c86904Y8u.LIZ(0.0f, viewPager.getCurrentItem(), view);
            }
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS11S0300000_15 iDLListenerS11S0300000_15) {
        View findViewById;
        IDLListenerS11S0300000_15 iDLListenerS11S0300000_152;
        if (((WeakReference) iDLListenerS11S0300000_15.l0).get() != null && (findViewById = ((View) ((WeakReference) iDLListenerS11S0300000_15.l0).get()).findViewById(((Integer) iDLListenerS11S0300000_15.l1).intValue())) != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
            ViewTreeObserver viewTreeObserver = ((View) ((WeakReference) iDLListenerS11S0300000_15.l0).get()).getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (iDLListenerS11S0300000_152 = ((C85108Xai) iDLListenerS11S0300000_15.l2).LJLJI) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS11S0300000_152);
            }
            C85108Xai c85108Xai = (C85108Xai) iDLListenerS11S0300000_15.l2;
            ARunnableS34S0200000_15 aRunnableS34S0200000_15 = c85108Xai.LJLJJI;
            if (aRunnableS34S0200000_15 != null) {
                c85108Xai.LJLJJL.removeCallbacks(aRunnableS34S0200000_15);
                ((C85108Xai) iDLListenerS11S0300000_15.l2).LJLJJI = null;
            }
            C85108Xai c85108Xai2 = (C85108Xai) iDLListenerS11S0300000_15.l2;
            c85108Xai2.LJLJI = null;
            if (c85108Xai2.LJLIL > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                C85108Xai c85108Xai3 = (C85108Xai) iDLListenerS11S0300000_15.l2;
                long j = currentTimeMillis - c85108Xai3.LJLIL;
                c85108Xai3.LJLIL = 0L;
                if (j < c85108Xai3.LJLJJLL && j > 0) {
                    AutoPageTraceHelper.reportViewIdStats(currentTimeMillis, c85108Xai3.LJLILLLLZI);
                    MonitorTool.reportTraceTime(((C85108Xai) iDLListenerS11S0300000_15.l2).LJLILLLLZI, "activityOnCreateToViewShow", j);
                }
            }
        }
    }

    public IDLListenerS11S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }
}
