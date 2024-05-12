package X;

import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ugc.effectcreator.foundation.view.BottomDialog;
import com.ugc.effectcreator.foundation.view.BottomMultiPageDialog;
import com.ugc.effectcreator.foundation.view.BottomPageFragment;
import java.util.List;

/* renamed from: X.aTl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnKeyListenerC93617aTl implements View.OnKeyListener {
    public final /* synthetic */ BottomPageFragment LJLIL;

    public ViewOnKeyListenerC93617aTl(BottomPageFragment bottomPageFragment) {
        this.LJLIL = bottomPageFragment;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        FragmentManager childFragmentManager;
        FragmentManager childFragmentManager2;
        List<Fragment> LJJJJLI;
        if (i == 4) {
            BottomPageFragment bottomPageFragment = this.LJLIL;
            Fragment parentFragment = bottomPageFragment.getParentFragment();
            if (parentFragment != null && (childFragmentManager2 = parentFragment.getChildFragmentManager()) != null && (LJJJJLI = childFragmentManager2.LJJJJLI()) != null && LJJJJLI.size() == 1) {
                Fragment parentFragment2 = bottomPageFragment.getParentFragment();
                if (!(parentFragment2 instanceof BottomMultiPageDialog)) {
                    parentFragment2 = null;
                }
                BottomDialog bottomDialog = (BottomDialog) parentFragment2;
                if (bottomDialog != null) {
                    BottomDialog.vl(bottomDialog);
                }
            } else {
                Fragment parentFragment3 = bottomPageFragment.getParentFragment();
                if (parentFragment3 != null && (childFragmentManager = parentFragment3.getChildFragmentManager()) != null) {
                    C1B3 c1b3 = new C1B3(childFragmentManager);
                    c1b3.LJJI(bottomPageFragment);
                    c1b3.LJIILJJIL();
                }
            }
            return true;
        }
        return false;
    }
}
