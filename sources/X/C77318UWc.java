package X;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.UWc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77318UWc implements InterfaceC48038ItG {
    public static boolean LJLIL;
    public static boolean LJLILLLLZI;
    public static boolean LJLJI;
    public static boolean LJLJJI;
    public static final C77318UWc LJLJJL = new C77318UWc();

    public static final OSZ LIZLLL(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        HX6 hx6 = (HX6) diContainer.LJ(HX6.class, null);
        HX5 state = HX5.ACTIVITY_ENTER_ANIMATION_END;
        o.LJIIIZ(state, "state");
        C40871j1<Boolean> LIZIZ = hx6.LIZIZ(state.getValue());
        if (o.LJ(LIZIZ.LIZ(), Boolean.TRUE)) {
            return new OSZ(C0I7.IMMEDIATE, null);
        }
        return new OSZ(C45307HqJ.LIZ(C0I7.LAZY), LIZIZ);
    }

    public static final int LJ(ViewGroup viewGroup) {
        int generateViewId = View.generateViewId();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(generateViewId);
        viewGroup.addView(frameLayout);
        return generateViewId;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0) {
            return C76800UCe.LIZ;
        }
        throw new RuntimeException("server error.");
    }

    public static final Object LIZ(AbstractC73638SvC abstractC73638SvC, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        abstractC73638SvC.LIZ(new M2O(xks));
        return xks.LJIIJJI();
    }

    public static final Object LIZIZ(AbstractC73672Svk abstractC73672Svk, InterfaceC67352kd interfaceC67352kd) {
        return LIZJ(abstractC73672Svk, L8D.FIRST, interfaceC67352kd);
    }

    public static void LJFF(boolean z, boolean z2) {
        LJLJI = z;
        Application application = HybridMultiMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(UC0.LJJII(application, "monitor_data_switch"), "is_debug");
            if (z) {
                UC0.LJJJ(file);
                return;
            } else {
                if (!file.exists()) {
                    return;
                }
                C16880lQ.LLLZZIL(file);
                return;
            }
        }
        if (z) {
        }
    }

    public static void LJI(boolean z, boolean z2) {
        LJLJJI = z;
        Application application = HybridMultiMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(UC0.LJJII(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                UC0.LJJJ(file);
            } else {
                if (!file.exists()) {
                    return;
                }
                C16880lQ.LLLZZIL(file);
            }
        }
    }

    public static Object LIZJ(AbstractC73672Svk abstractC73672Svk, L8D l8d, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        abstractC73672Svk.LIZ(new M2A(xks, l8d, null));
        return xks.LJIIJJI();
    }
}
