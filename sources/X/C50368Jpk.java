package X;

import Y.ARunnableS22S0200000_3;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS44S0100000_8;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Jpk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50368Jpk<T extends Fragment> extends AbstractC40311i7<T> {
    public final ActivityC45651qj LJZ;
    public final KEP LJZI;
    public SearchResultParam LJZL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC40311i7
    public final T LLF(int i) {
        boolean lv0;
        if (i == C50605JtZ.LJIIJJI()) {
            ActivityC45651qj context = this.LJZ;
            if (C49500Jbk.LIZ()) {
                o.LJIIIZ(context, "context");
                C38995FSd.LIZJ().execute(new ARunnableS22S0200000_3(KK8.LIZ, context, 52));
            } else if (context instanceof InterfaceC45601Hv3) {
                if (C34082DZe.LJLILLLLZI.LJJII()) {
                    InterfaceC45601Hv3 inflaterOwner = (InterfaceC45601Hv3) context;
                    o.LJIIIZ(inflaterOwner, "inflaterOwner");
                    C37190Eig.LIZ.post(new ARunnableS44S0100000_8(inflaterOwner, 117));
                }
                if (C50086JlC.LIZ().enableVideoLayoutPreInflate) {
                    InterfaceC45601Hv3 inflaterOwner2 = (InterfaceC45601Hv3) context;
                    o.LJIIIZ(inflaterOwner2, "inflaterOwner");
                    C37190Eig.LIZ.post(new ARunnableS43S0100000_7(inflaterOwner2, 127));
                }
            }
            if ((context instanceof InterfaceC45601Hv3) && C34516Dge.LIZ) {
                SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of(context).get(SearchGlobalViewModel.class);
                if (o.LJ(searchGlobalViewModel.hv0(false), "auto")) {
                    lv0 = false;
                } else {
                    lv0 = searchGlobalViewModel.lv0();
                }
                C50365Jph.LIZJ((InterfaceC45601Hv3) context, lv0);
            }
        }
        AbsSearchBaseFragment LIZ = C50003Jjr.LIZ(this.LJZ, this.LJZL, i, this.LJZI);
        LIZ.Dl(i);
        if (!this.LJLLJ.LJLIL.equals(Integer.valueOf(i))) {
            LIZ.setUserVisibleHint(false);
        }
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50368Jpk(Fragment fragment, ActivityC45651qj activity, int i, KEM ecomResultService) {
        super(fragment, activity, i);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(ecomResultService, "ecomResultService");
        this.LJZ = activity;
        this.LJZI = ecomResultService;
    }
}
