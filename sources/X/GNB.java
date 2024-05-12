package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.draft.PostedDraftPageFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class GNB extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DraftFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNB(DraftFragment draftFragment) {
        super(0);
        this.LJLIL = draftFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        String str2;
        DraftFragment draftFragment = this.LJLIL;
        if (!draftFragment.LJLJJLL) {
            Bundle arguments = draftFragment.getArguments();
            PostedDraftPageFragment postedDraftPageFragment = new PostedDraftPageFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_disk_manage_mode", draftFragment.LJLJJL);
            if (arguments != null) {
                str = arguments.getString("star_atlas_object");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (arguments != null) {
                    str2 = arguments.getString("star_atlas_object");
                } else {
                    str2 = null;
                }
                bundle.putString("star_atlas_object", str2);
            }
            postedDraftPageFragment.setArguments(bundle);
            FragmentManager requireFragmentManager = draftFragment.requireFragmentManager();
            requireFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(requireFragmentManager);
            c1b3.LJIIIIZZ(R.id.dm7, 1, postedDraftPageFragment, null);
            c1b3.LJ(null);
            c1b3.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}
