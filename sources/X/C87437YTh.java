package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS177S0200000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YTh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87437YTh extends C08Z {
    public final CopyOnWriteArrayList<InterfaceC87439YTj> LIZ = new CopyOnWriteArrayList<>();

    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 45));
    }

    @Override // X.C08Z
    public final void onFragmentDetached(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 46));
    }

    @Override // X.C08Z
    public final void onFragmentPaused(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 47));
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 49));
    }

    @Override // X.C08Z
    public final void onFragmentStarted(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 50));
    }

    @Override // X.C08Z
    public final void onFragmentStopped(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 51));
    }

    @Override // X.C08Z
    public final void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, 52));
    }

    public final void LIZ(Fragment fragment, boolean z, InterfaceC88471Ynr<? super InterfaceC87439YTj, ? super BaseFragment, C76800UCe> interfaceC88471Ynr) {
        BaseFragment baseFragment;
        if ((fragment instanceof BaseFragment) && (baseFragment = (BaseFragment) fragment) != null) {
            Iterator<InterfaceC87439YTj> it = this.LIZ.iterator();
            while (it.hasNext()) {
                InterfaceC87439YTj callback = it.next();
                o.LJIIIIZZ(callback, "callback");
                interfaceC88471Ynr.invoke(callback, baseFragment);
            }
            if (z) {
                Iterator<G48> it2 = baseFragment.getViewModel().getProcessors().iterator();
                while (it2.hasNext()) {
                    interfaceC88471Ynr.invoke(it2.next(), baseFragment);
                }
            }
        }
    }

    @Override // X.C08Z
    public final void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, bundle, 43));
    }

    @Override // X.C08Z
    public final void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
        LIZ(f, true, new AqS177S0200000_15(context, fm, 1));
    }

    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, bundle, 44));
    }

    @Override // X.C08Z
    public final void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(context, "context");
        LIZ(f, false, new AqS177S0200000_15(context, fm, 2));
    }

    @Override // X.C08Z
    public final void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        LIZ(f, true, new AqS197S0100000_15(fm, bundle, 48));
    }

    @Override // X.C08Z
    public final void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(outState, "outState");
        LIZ(f, true, new AqS177S0200000_15(fm, outState, 3));
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        LIZ(f, true, new C87438YTi(bundle, v, fm));
    }
}
