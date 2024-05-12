package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.compliance.business.agecontrol.PNSAgeControlService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LE5 extends C08Z {
    public final /* synthetic */ PNSAgeControlService LIZ;

    public LE5(PNSAgeControlService pNSAgeControlService) {
        this.LIZ = pNSAgeControlService;
    }

    @Override // X.C08Z
    public final void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        String localClassName;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentCreated(fm, f, bundle);
        ActivityC45651qj mo49getActivity = f.mo49getActivity();
        if (mo49getActivity != null && (localClassName = mo49getActivity.getLocalClassName()) != null) {
            this.LIZ.LIZ(localClassName);
        }
    }
}
