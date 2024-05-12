package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.viewmodel.NPSSurveyJSBViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Jyx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50939Jyx extends AbstractC60811Ntn {
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ SparkContext LJLJI;
    public final /* synthetic */ C50940Jyy LJLJJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Fragment fragment = this.LJLILLLLZI;
        c50651JuJ.getClass();
        C50321Joz LJ = C50651JuJ.LJ(fragment);
        if (LJ == null) {
            return;
        }
        if (!LJ.isFragmentVisible()) {
            InterfaceC40159FpT LJIILL = this.LJLJI.LJIILL();
            if (LJIILL != null) {
                LJIILL.close();
                return;
            }
            return;
        }
        view.LJIIIZ("onSatisfactionSurveySheetShow", null);
        C50940Jyy c50940Jyy = this.LJLJJI;
        Fragment fragment2 = this.LJLILLLLZI;
        c50940Jyy.getClass();
        C50940Jyy.LIZ(fragment2, true);
        this.LJLJJI.LIZIZ.LIZIZ();
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        F41 f41;
        C50940Jyy c50940Jyy = this.LJLJJI;
        c50940Jyy.LIZJ = false;
        c50940Jyy.LIZLLL = false;
        c50940Jyy.LJ = false;
        ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
        if (mo49getActivity != null && (f41 = ((NPSSurveyJSBViewModel) ViewModelProviders.of(mo49getActivity).get(NPSSurveyJSBViewModel.class)).LJLILLLLZI) != null) {
            boolean z = f41.LIZ;
            String str = f41.LIZIZ;
            long j = f41.LIZJ;
            if (z && str != null && str.length() != 0 && j > 0) {
                Integer LJI = C79045V0n.LJI(R.attr.e8, mo49getActivity);
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
                    c26045AKb.LJIIIZ(str);
                    c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                    c26045AKb.LJI(intValue);
                    c26045AKb.LIZLLL(j);
                    c26045AKb.LJIIJ();
                }
                ((NPSSurveyJSBViewModel) ViewModelProviders.of(mo49getActivity).get(NPSSurveyJSBViewModel.class)).LJLILLLLZI = null;
            }
        }
        C50940Jyy c50940Jyy2 = this.LJLJJI;
        Fragment fragment = this.LJLILLLLZI;
        c50940Jyy2.getClass();
        C50940Jyy.LIZ(fragment, false);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        InterfaceC40159FpT LJIILL = this.LJLJI.LJIILL();
        if (LJIILL != null) {
            LJIILL.close();
        }
    }

    public C50939Jyx(Fragment fragment, SparkContext sparkContext, C50940Jyy c50940Jyy) {
        this.LJLILLLLZI = fragment;
        this.LJLJI = sparkContext;
        this.LJLJJI = c50940Jyy;
    }
}
