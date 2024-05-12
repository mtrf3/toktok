package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import defpackage.a1;

/* renamed from: X.HZj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class FragmentC44279HZj extends Fragment implements InterfaceC78896Uxo {
    public final V8O LJLIL = V8O.LJ.Xk();

    @Override // X.InterfaceC78896Uxo
    public final V8O Xk() {
        return this.LJLIL;
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public static FragmentC44279HZj LIZ(Activity activity, String str, boolean z, boolean z2) {
        String LJ = a1.LJ(str, "_", "ScopeHolderFragment");
        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentC44279HZj fragmentC44279HZj = (FragmentC44279HZj) fragmentManager.findFragmentByTag(LJ);
        if (fragmentC44279HZj != null) {
            if (z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(fragmentC44279HZj);
                C78932UyO.LIZ(fragmentManager, beginTransaction, z2);
            } else {
                return fragmentC44279HZj;
            }
        }
        FragmentC44279HZj fragmentC44279HZj2 = new FragmentC44279HZj();
        FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
        beginTransaction2.add(fragmentC44279HZj2, LJ);
        C78932UyO.LIZ(fragmentManager, beginTransaction2, z2);
        return fragmentC44279HZj2;
    }
}
