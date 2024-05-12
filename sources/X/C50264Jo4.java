package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubHeaderComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Jo4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50264Jo4 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ SearchHubHeaderComponent LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ LinearLayout LJLJJI;
    public final /* synthetic */ LinearLayout LJLJJL;
    public final /* synthetic */ FrameLayout LJLJJLL;
    public final /* synthetic */ TuxTextView LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50264Jo4(C76732zl c76732zl, SearchHubHeaderComponent searchHubHeaderComponent, View view, LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, TuxTextView tuxTextView) {
        super(2);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = searchHubHeaderComponent;
        this.LJLJI = view;
        this.LJLJJI = linearLayout;
        this.LJLJJL = linearLayout2;
        this.LJLJJLL = frameLayout;
        this.LJLJL = tuxTextView;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem selectSubscribe, Integer num) {
        boolean z;
        String str;
        String LJ;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue != -1) {
            if (this.LJLIL.element != -1) {
                z = true;
            } else {
                z = false;
            }
            if (intValue == 0) {
                SearchHubHeaderComponent searchHubHeaderComponent = this.LJLILLLLZI;
                View tabsRegion = this.LJLJI;
                o.LJIIIIZZ(tabsRegion, "tabsRegion");
                searchHubHeaderComponent.getClass();
                SearchHubHeaderComponent.I3(tabsRegion, 0, z);
                SearchHubHeaderComponent searchHubHeaderComponent2 = this.LJLILLLLZI;
                LinearLayout overviewTitleRegion = this.LJLJJI;
                o.LJIIIIZZ(overviewTitleRegion, "overviewTitleRegion");
                searchHubHeaderComponent2.getClass();
                SearchHubHeaderComponent.H3(overviewTitleRegion, 1.0f, z);
                SearchHubHeaderComponent searchHubHeaderComponent3 = this.LJLILLLLZI;
                LinearLayout overviewSubtitleRegion = this.LJLJJL;
                o.LJIIIIZZ(overviewSubtitleRegion, "overviewSubtitleRegion");
                searchHubHeaderComponent3.getClass();
                SearchHubHeaderComponent.H3(overviewSubtitleRegion, 1.0f, z);
                SearchHubHeaderComponent searchHubHeaderComponent4 = this.LJLILLLLZI;
                FrameLayout overviewInfoRegion = this.LJLJJLL;
                o.LJIIIIZZ(overviewInfoRegion, "overviewInfoRegion");
                searchHubHeaderComponent4.getClass();
                SearchHubHeaderComponent.H3(overviewInfoRegion, 1.0f, z);
                SearchHubHeaderComponent searchHubHeaderComponent5 = this.LJLILLLLZI;
                TuxTextView tvNonOverviewTitle = this.LJLJL;
                o.LJIIIIZZ(tvNonOverviewTitle, "tvNonOverviewTitle");
                searchHubHeaderComponent5.getClass();
                SearchHubHeaderComponent.H3(tvNonOverviewTitle, 0.0f, z);
            } else {
                C50201Jn3 c50201Jn3 = (C50201Jn3) ((AssemViewModel) this.LJLILLLLZI.LJLJLLL.getValue()).getState();
                SearchLabel searchLabel = (SearchLabel) ORZ.LJLLLLLL(intValue, c50201Jn3.LJLJL.LIZ);
                if (searchLabel != null) {
                    str = searchLabel.labelText;
                } else {
                    str = null;
                }
                String str2 = c50201Jn3.LJLILLLLZI;
                TuxTextView tvNonOverviewTitle2 = this.LJLJL;
                o.LJIIIIZZ(tvNonOverviewTitle2, "tvNonOverviewTitle");
                if (C26338AVi.LIZLLL(tvNonOverviewTitle2)) {
                    LJ = a1.LJ(str, " / ", str2);
                } else {
                    LJ = a1.LJ(str2, " / ", str);
                }
                tvNonOverviewTitle2.setText(LJ);
                this.LJLJL.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC50265Jo5(this.LJLJL, str2, str, this.LJLILLLLZI, this.LJLJI, 300L, z, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
            }
            this.LJLIL.element = intValue;
        }
        return C76800UCe.LIZ;
    }
}
