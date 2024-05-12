package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;

/* renamed from: X.PPv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64415PPv extends C08Z {
    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
    }

    @Override // X.C08Z
    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStopped(fragmentManager, fragment);
    }

    @Override // X.C08Z
    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        if (fragment instanceof InterfaceC45040Hm0) {
            new WeakReference(fragment);
        }
    }
}
