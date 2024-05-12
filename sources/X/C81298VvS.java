package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.search.common.ui.SearchDialogFragment;

/* renamed from: X.VvS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81298VvS implements InterfaceC81297VvR {
    public final /* synthetic */ SearchDialogFragment LIZ;

    public C81298VvS(SearchDialogFragment searchDialogFragment) {
        this.LIZ = searchDialogFragment;
    }

    @Override // X.InterfaceC81297VvR
    public final void LIZ(boolean z) {
        ActivityC45651qj mo49getActivity;
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        if (!z && (mo49getActivity = this.LIZ.mo49getActivity()) != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null && (LJJJIL = supportFragmentManager.LJJJIL("com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment")) != null && supportFragmentManager != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIIZ(LJJJIL);
            c1b3.LJI();
        }
    }
}
