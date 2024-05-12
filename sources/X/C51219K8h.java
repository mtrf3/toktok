package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.K8h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51219K8h<T extends Fragment> extends AbstractC40291i5<T> {
    public final ActivityC45651qj LJZ;
    public final KEP LJZI;
    public SearchResultParam LJZL;

    @Override // X.AbstractC40291i5
    public final T LLF(int i) {
        SearchVisibilityDetectFragmentNew LIZ = KEJ.LIZ(this.LJZL, i, this.LJZI);
        LIZ.Dl(i);
        if (!this.LJLLJ.LJLIL.equals(Integer.valueOf(i))) {
            LIZ.setUserVisibleHint(false);
        }
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51219K8h(Fragment fragment, ActivityC45651qj activity, int i, KEM ecomResultService) {
        super(fragment, activity, i);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ecomResultService, "ecomResultService");
        this.LJZ = activity;
        this.LJZI = ecomResultService;
    }
}
