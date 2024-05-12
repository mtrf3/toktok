package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Jpm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50370Jpm<T extends Fragment> extends AbstractC50369Jpl<T> {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final ActivityC45651qj LJLJLLL;
    public final KEP LJLL;
    public SearchResultParam LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return C50148JmC.LIZ(i, this.LJLJLLL);
    }

    @Override // X.AbstractC51499KJb, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object fragment) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(fragment, "fragment");
        super.LJIL(i, container, fragment);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50370Jpm(FragmentManager fm, ActivityC45651qj activity, int i, KEM ecomResultService) {
        super(fm, i);
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ecomResultService, "ecomResultService");
        this.LJLJLLL = activity;
        this.LJLL = ecomResultService;
    }
}
