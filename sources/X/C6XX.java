package X;

import Y.ARunnableS5S0201000_2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import defpackage.e1;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* renamed from: X.6XX, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6XX extends C08Z {
    public final /* synthetic */ ChooseCoverActivity LIZ;

    public C6XX(ChooseCoverActivity chooseCoverActivity) {
        this.LIZ = chooseCoverActivity;
    }

    @Override // X.C08Z
    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDetached(fragmentManager, fragment);
        if ((fragment instanceof VEChooseVideoCoverFragment) && !e1.LIZ(31744, "choose_cover_quit", true, false)) {
            this.LIZ.LJLJLLL();
        }
    }

    @Override // X.C08Z
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        if (fragment instanceof VEChooseVideoCoverFragment) {
            C135315St c135315St = this.LIZ.LJLJJI;
            if (c135315St != null && (vEEditorAutoStartStopArbiter = c135315St.LJIIIIZZ) != null) {
                vEEditorAutoStartStopArbiter.LIZJ(true, false);
            }
            View view = fragment.getView();
            if (view != null) {
                ARunnableS5S0201000_2 aRunnableS5S0201000_2 = new ARunnableS5S0201000_2(3, this, fragment, 4);
                if (C161946Xe.LIZ()) {
                    if (this.LIZ.LLIIJI()) {
                        this.LIZ.LLIL();
                    } else {
                        this.LIZ.LJLJLJ.setVisibility(8);
                    }
                    view.post(aRunnableS5S0201000_2);
                    return;
                }
                view.postDelayed(aRunnableS5S0201000_2, 300L);
            }
        }
    }
}
