package X;

import Y.ARunnableS19S0000000_13;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.security.LiveSupportPowerPermissionSetting;
import com.bytedance.bpea.basics.Cert;

/* renamed from: X.Uxr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78899Uxr {
    public final FragmentC78903Uxv LIZ;
    public final FragmentC78904Uxw LIZIZ;

    public C78899Uxr(Activity activity) {
        if (LiveSupportPowerPermissionSetting.INSTANCE.isEnabled()) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            FragmentC78904Uxw fragmentC78904Uxw = (FragmentC78904Uxw) fragmentManager.findFragmentByTag("PowerPermissionsRequest");
            if (fragmentC78904Uxw == null) {
                fragmentC78904Uxw = new FragmentC78904Uxw();
                fragmentManager.beginTransaction().add(fragmentC78904Uxw, "PermissionsRequest").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
            this.LIZIZ = fragmentC78904Uxw;
            return;
        }
        FragmentManager fragmentManager2 = activity.getFragmentManager();
        FragmentC78903Uxv fragmentC78903Uxv = (FragmentC78903Uxv) fragmentManager2.findFragmentByTag("PermissionsRequest");
        if (fragmentC78903Uxv == null) {
            fragmentC78903Uxv = new FragmentC78903Uxv();
            fragmentManager2.beginTransaction().add(fragmentC78903Uxv, "PermissionsRequest").commitAllowingStateLoss();
            fragmentManager2.executePendingTransactions();
        }
        this.LIZ = fragmentC78903Uxv;
    }

    public final void LIZ(Activity activity, InterfaceC77281UUr interfaceC77281UUr, InterfaceC77281UUr interfaceC77281UUr2, InterfaceC78910Uy2 interfaceC78910Uy2, Cert cert, ARunnableS19S0000000_13 aRunnableS19S0000000_13, ARunnableS19S0000000_13 aRunnableS19S0000000_132, String... strArr) {
        if (LiveSupportPowerPermissionSetting.INSTANCE.isEnabled()) {
            FragmentC78904Uxw fragmentC78904Uxw = this.LIZIZ;
            fragmentC78904Uxw.getClass();
            C0NB.LIZIZ("PermissionFragment", "requestPermissions: ");
            C78907Uxz c78907Uxz = new C78907Uxz(activity, interfaceC77281UUr, interfaceC77281UUr2, interfaceC78910Uy2, cert, aRunnableS19S0000000_13, aRunnableS19S0000000_132, strArr);
            String[] LIZ = C76944UHs.LIZ(activity, strArr);
            if (LIZ.length == 0) {
                c78907Uxz.LIZIZ(false);
                return;
            }
            c78907Uxz.LIZLLL = LIZ;
            aRunnableS19S0000000_13.getClass();
            C78908Uy0 c78908Uy0 = C78900Uxs.LIZ;
            c78908Uy0.LIZJ(c78907Uxz.LIZLLL);
            if (Build.VERSION.SDK_INT < 23 || C40221FqT.LIZ.LIZ()) {
                C78906Uxy c78906Uxy = new C78906Uxy(fragmentC78904Uxw, c78907Uxz);
                c78908Uy0.getClass();
                interfaceC77281UUr2.LIZ(activity, c78906Uxy, strArr);
                return;
            }
            interfaceC77281UUr.LIZ(activity, new C78902Uxu(fragmentC78904Uxw, c78907Uxz), strArr);
            return;
        }
        FragmentC78903Uxv fragmentC78903Uxv = this.LIZ;
        fragmentC78903Uxv.getClass();
        C0NB.LIZIZ("PermissionFragment", "requestPermissions: ");
        C78909Uy1 c78909Uy1 = new C78909Uy1(interfaceC77281UUr, interfaceC77281UUr2, interfaceC78910Uy2, aRunnableS19S0000000_13, aRunnableS19S0000000_132, strArr);
        String[] LIZ2 = C76944UHs.LIZ(fragmentC78903Uxv.getActivity(), strArr);
        if (LIZ2.length == 0) {
            c78909Uy1.LIZIZ(false);
            return;
        }
        c78909Uy1.LIZIZ = LIZ2;
        aRunnableS19S0000000_13.getClass();
        C78908Uy0 c78908Uy02 = C78900Uxs.LIZ;
        c78908Uy02.LIZJ(c78909Uy1.LIZIZ);
        if (Build.VERSION.SDK_INT < 23 || C40221FqT.LIZ.LIZ()) {
            C78905Uxx c78905Uxx = new C78905Uxx(fragmentC78903Uxv, c78909Uy1);
            Activity activity2 = fragmentC78903Uxv.getActivity();
            c78908Uy02.getClass();
            interfaceC77281UUr2.LIZ(activity2, c78905Uxx, strArr);
            return;
        }
        interfaceC77281UUr.LIZ(fragmentC78903Uxv.getActivity(), new C78901Uxt(fragmentC78903Uxv, c78909Uy1), strArr);
    }
}
