package X;

import Y.AfS17S0001000_5;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.util.rxutils.rxlifecycle.BindingFragment;

/* loaded from: classes6.dex */
public final class BTJ {
    public static final AfS17S0001000_5 LIZ = new AfS17S0001000_5(1, 8);
    public static final AfS17S0001000_5 LIZIZ = new AfS17S0001000_5(1, 21);
    public static final Object LIZJ = new Object();

    public static C31783Cdf LIZIZ(Fragment fragment) {
        EnumC29270BeE enumC29270BeE = EnumC29270BeE.DESTROY;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        BindingFragment bindingFragment = (BindingFragment) childFragmentManager.LJJJIL("_LIFECYCLE_BINDING_FRAGMENT_");
        if (bindingFragment == null) {
            bindingFragment = new BindingFragment();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIIIZZ(0, 1, bindingFragment, "_LIFECYCLE_BINDING_FRAGMENT_");
            c1b3.LJI();
        } else if (bindingFragment.isDetached()) {
            C1B3 c1b32 = new C1B3(childFragmentManager);
            c1b32.LJFF(bindingFragment);
            c1b32.LJI();
        }
        C73849Syb<EnumC29270BeE> c73849Syb = bindingFragment.LJLIL;
        if (enumC29270BeE != null) {
            return new C31783Cdf(c73849Syb, enumC29270BeE);
        }
        throw new NullPointerException("event == null");
    }

    public static <T> C62704OjE<T> LIZJ(Class cls) {
        return new C62704OjE<>(C16880lQ.LJLLJ(cls));
    }

    public static void LIZLLL(InterfaceC92693kP interfaceC92693kP) {
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            interfaceC92693kP.dispose();
        }
    }

    public static <T, R> R LIZ(InterfaceC48038ItG<T, R> interfaceC48038ItG, T t) {
        try {
            return interfaceC48038ItG.apply(t);
        } catch (Throwable th) {
            throw C73864Syq.LIZIZ(th);
        }
    }
}
