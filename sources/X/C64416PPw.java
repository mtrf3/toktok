package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: X.PPw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64416PPw extends C08Z {
    public final /* synthetic */ PQ0 LIZ;

    public C64416PPw(PQ0 pq0) {
        this.LIZ = pq0;
    }

    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        this.LIZ.LIZ(fragment, "onFragmentDestroy");
    }

    @Override // X.C08Z
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        this.LIZ.LIZ(fragment, "onFragmentPause");
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        this.LIZ.LIZ(fragment, "onFragmentResume");
    }

    @Override // X.C08Z
    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStarted(fragmentManager, fragment);
        this.LIZ.LIZ(fragment, "onFragmentStart");
    }

    @Override // X.C08Z
    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStopped(fragmentManager, fragment);
        this.LIZ.LIZ(fragment, "onFragmentStop");
    }

    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        this.LIZ.LIZ(fragment, "onFragmentCreate");
    }
}
