package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: X.PPt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64413PPt extends C08Z {
    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        if (!"androidx.lifecycle.ReportFragment".equalsIgnoreCase(fragment.getClass().getName())) {
            PEI.LIZ(fragment);
        }
    }

    @Override // X.C08Z
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
    }
}
