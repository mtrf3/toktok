package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.provider.preload.PreLoader;
import com.bytedance.provider.vm.ScopeViewModel;
import defpackage.i0;
import kotlin.jvm.internal.AqS113S0300000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lly, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55230Lly {
    public static InterfaceC55235Lm3 LJ(View view) {
        InterfaceC55235Lm3 LIZIZ;
        synchronized (C55230Lly.class) {
            o.LJIIIZ(view, "<this>");
            LIZIZ = LIZIZ(view, null, new C55232Lm0(EnumC55244LmC.Single, 2));
            if (LIZIZ == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        return LIZIZ;
    }

    public static final void LIZ(Fragment fragment, String str) {
        o.LJIIIZ(fragment, "<this>");
        PreLoader.LIZIZ(fragment, str);
    }

    public static final InterfaceC55235Lm3 LIZJ(Fragment fragment, String str) {
        InterfaceC55235Lm3 hv0;
        InterfaceC55235Lm3 LIZ;
        o.LJIIIZ(fragment, "<this>");
        if (fragment.getFragmentManager() == null && C55249LmH.LIZJ) {
            return new C55236Lm4(fragment);
        }
        String LIZ2 = C8XR.LIZ(fragment);
        SZE.LIZ(LIZ2, C65352Pkq.LIZ(C88511YoV.class));
        if (C55249LmH.LIZLLL && (LIZ = L9T.LIZ(String.valueOf(fragment.hashCode()))) != null) {
            SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ2, C55228Llw.LJLIL);
            return LIZ;
        }
        ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(fragment).get(ScopeViewModel.class);
        String LJFF = i0.LJFF("fragment_", str);
        AqS62S1100000_9 aqS62S1100000_9 = new AqS62S1100000_9(fragment, str, 6);
        synchronized (scopeViewModel) {
            hv0 = scopeViewModel.hv0(LJFF, aqS62S1100000_9);
        }
        o.LJII(hv0, "null cannot be cast to non-null type com.bytedance.provider.impl.FragmentScope");
        C55241Lm9 c55241Lm9 = (C55241Lm9) hv0;
        c55241Lm9.LJLJJI.LIZIZ(C55241Lm9.LJLJJLL[0], fragment);
        if (C55249LmH.LIZLLL && fragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            String valueOf = String.valueOf(fragment.hashCode());
            Lifecycle lifecycle = fragment.getLifecycle();
            o.LJIIIIZZ(lifecycle, "lifecycle");
            L9T.LIZIZ(valueOf, c55241Lm9, lifecycle);
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ2, C55229Llx.LJLIL);
        return c55241Lm9;
    }

    public static final InterfaceC55235Lm3 LIZLLL(ActivityC45651qj activityC45651qj, String str) {
        InterfaceC55235Lm3 LIZ;
        o.LJIIIZ(activityC45651qj, "<this>");
        synchronized (activityC45651qj) {
            String LIZ2 = C8XR.LIZ(activityC45651qj);
            SZE.LIZ(LIZ2, C65352Pkq.LIZ(C88511YoV.class));
            if (C55249LmH.LIZLLL && (LIZ = L9T.LIZ(String.valueOf(activityC45651qj.hashCode()))) != null) {
                SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ2, C55226Llu.LJLIL);
                return LIZ;
            }
            ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(activityC45651qj).get(ScopeViewModel.class);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("activity_");
            LIZ3.append(str);
            InterfaceC55235Lm3 hv0 = scopeViewModel.hv0(X1D.LIZIZ(LIZ3), new AqS62S1100000_9(activityC45651qj, str, 5));
            o.LJII(hv0, "null cannot be cast to non-null type com.bytedance.provider.impl.ActivityScope");
            C55239Lm7 c55239Lm7 = (C55239Lm7) hv0;
            c55239Lm7.LJLJJI.LIZIZ(C55239Lm7.LJLJJLL[0], activityC45651qj);
            if (C55249LmH.LIZLLL && activityC45651qj.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                String valueOf = String.valueOf(activityC45651qj.hashCode());
                Lifecycle lifecycle = activityC45651qj.getLifecycle();
                o.LJIIIIZZ(lifecycle, "lifecycle");
                L9T.LIZIZ(valueOf, c55239Lm7, lifecycle);
            }
            C55249LmH.LIZ("vprovider_vscope", new AqS156S0200000_9(c55239Lm7, scopeViewModel, 63));
            SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ2, C55227Llv.LJLIL);
            return c55239Lm7;
        }
    }

    public static final InterfaceC55235Lm3 LJFF(Fragment fragment, String str) {
        o.LJIIIZ(fragment, "<this>");
        ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(fragment).get(ScopeViewModel.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fragment_");
        LIZ.append(str);
        return scopeViewModel.gv0(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.1qj] */
    public static final InterfaceC55235Lm3 LIZIZ(View view, String str, C55232Lm0 c55232Lm0) {
        InterfaceC55235Lm3 hv0;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        InterfaceC55235Lm3 LIZ;
        String LIZ2 = C8XR.LIZ(view);
        SZE.LIZ(LIZ2, C65352Pkq.LIZ(C88511YoV.class));
        if (C55249LmH.LIZLLL && (LIZ = L9T.LIZ(String.valueOf(view.hashCode()))) != null) {
            SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ2, C55233Lm1.LJLIL);
            return LIZ;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        Fragment fragment = LJIIIZ;
        if (LJIIIZ == null) {
            ?? LIZ3 = L9U.LIZ(view);
            fragment = LIZ3;
            if (LIZ3 == 0) {
                if (c55232Lm0.LIZIZ) {
                    return null;
                }
                throw new RuntimeException("view not attach to a fragment or activity");
            }
        }
        ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(fragment).get(ScopeViewModel.class);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("view_");
        LIZ4.append(view.hashCode());
        LIZ4.append('_');
        LIZ4.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ4);
        if (c55232Lm0.LIZIZ) {
            interfaceC55235Lm3 = scopeViewModel.gv0(LIZIZ);
        } else {
            AqS113S0300000_9 aqS113S0300000_9 = new AqS113S0300000_9(view, fragment, c55232Lm0, 6);
            synchronized (scopeViewModel) {
                hv0 = scopeViewModel.hv0(LIZIZ, aqS113S0300000_9);
            }
            o.LJII(hv0, "null cannot be cast to non-null type com.bytedance.provider.impl.ViewScope");
            C55240Lm8 c55240Lm8 = (C55240Lm8) hv0;
            c55240Lm8.LJLJJI.LIZIZ(C55240Lm8.LJLJJLL[0], view);
            interfaceC55235Lm3 = c55240Lm8;
            if (C55249LmH.LIZLLL) {
                interfaceC55235Lm3 = c55240Lm8;
                if (fragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    String valueOf = String.valueOf(view.hashCode());
                    Lifecycle lifecycle = fragment.getLifecycle();
                    o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
                    L9T.LIZIZ(valueOf, c55240Lm8, lifecycle);
                    interfaceC55235Lm3 = c55240Lm8;
                }
            }
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ2, C55234Lm2.LJLIL);
        return interfaceC55235Lm3;
    }
}
