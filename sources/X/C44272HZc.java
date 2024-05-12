package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.bytedance.scene.navigation.NavigationScene;

/* renamed from: X.HZc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44272HZc {
    public static HEP LIZ(Activity activity, Class<? extends WM7> cls) {
        return new HEP(activity, cls);
    }

    public static HXO LIZIZ(Activity activity, int i, HJO hjo, InterfaceC80245VeT interfaceC80245VeT, boolean z, String str, boolean z2) {
        FragmentC44279HZj LIZ;
        C1JI.LJII();
        if (str != null) {
            C44273HZd.LIZ(activity, str);
            NavigationScene navigationScene = (NavigationScene) C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
            if (!C78932UyO.LJ(activity)) {
                return new C44276HZg(navigationScene);
            }
            navigationScene.LJLILLLLZI = interfaceC80245VeT;
            FragmentManager fragmentManager = activity.getFragmentManager();
            FragmentC44278HZi fragmentC44278HZi = (FragmentC44278HZi) fragmentManager.findFragmentByTag(str);
            if (fragmentC44278HZi != null && !z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(fragmentC44278HZi);
                C78932UyO.LIZ(fragmentManager, beginTransaction, z2);
                fragmentC44278HZi = null;
            }
            C42157Ggb c42157Ggb = new C42157Ggb(activity);
            if (fragmentC44278HZi != null) {
                LIZ = FragmentC44279HZj.LIZ(activity, str, false, z2);
                fragmentC44278HZi.LJLILLLLZI = new WMA(i, c42157Ggb, navigationScene, LIZ, z);
            } else {
                fragmentC44278HZi = new FragmentC44278HZi();
                FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.add(i, fragmentC44278HZi, str);
                navigationScene = navigationScene;
                LIZ = FragmentC44279HZj.LIZ(activity, str, !z, z2);
                fragmentC44278HZi.LJLILLLLZI = new WMA(i, c42157Ggb, navigationScene, LIZ, z);
                C78932UyO.LIZ(fragmentManager, beginTransaction2, z2);
            }
            return new C44277HZh(activity, navigationScene, fragmentC44278HZi, LIZ, z2);
        }
        throw new IllegalArgumentException("tag cant be null");
    }
}
