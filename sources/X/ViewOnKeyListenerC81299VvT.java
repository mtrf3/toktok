package X;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.search.common.ui.SearchDialogFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.VvT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnKeyListenerC81299VvT implements View.OnKeyListener {
    public final /* synthetic */ SearchDialogFragment LJLIL;

    public ViewOnKeyListenerC81299VvT(SearchDialogFragment searchDialogFragment) {
        this.LJLIL = searchDialogFragment;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C81293VvN c81293VvN;
        if (i != 4) {
            return false;
        }
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity != null && !mo49getActivity.isFinishing()) {
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            SearchDialogFragment searchDialogFragment = (SearchDialogFragment) supportFragmentManager.LJJJIL("com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment");
            if (searchDialogFragment != null && (c81293VvN = searchDialogFragment.LJLIL) != null) {
                c81293VvN.LIZ(false, true);
            }
        }
        return true;
    }
}
