package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Jms, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50190Jms extends C0A6 {
    public boolean LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;
    public final /* synthetic */ DynamicPatch LJLJI;
    public final /* synthetic */ SearchHubHeaderVM LJLJJI;
    public final /* synthetic */ SearchHubVM LJLJJL;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LJLIL = true;
            return;
        }
        this.LJLIL = false;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LJLILLLLZI.getVisibility() == 8 || this.LJLILLLLZI.getHeight() == 0 || !this.LJLIL) {
            return;
        }
        int i7 = 0;
        ViewGroup.LayoutParams layoutParams = null;
        if (C50269Jo9.LIZ()) {
            if (((Number) DYM.LIZ.getValue()).intValue() != 1) {
                ViewGroup.LayoutParams layoutParams2 = this.LJLILLLLZI.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams != null) {
                    i6 = marginLayoutParams.topMargin;
                } else {
                    i6 = 0;
                }
                int i8 = i6 - i2;
                int LIZIZ = C50191Jmt.LIZIZ(this.LJLJI, this.LJLJJI);
                ViewGroup viewGroup = this.LJLILLLLZI;
                int i9 = -LIZIZ;
                if (i8 < i9) {
                    i8 = i9;
                } else if (i8 > 0) {
                    i8 = 0;
                }
                V1B.LJLLLL(i8, viewGroup);
            }
        } else {
            int height = this.LJLILLLLZI.getHeight() - C50191Jmt.LIZIZ(this.LJLJI, this.LJLJJI);
            if (((Number) DYM.LIZ.getValue()).intValue() == 1) {
                if (i2 > 0) {
                    ViewGroup viewGroup2 = this.LJLILLLLZI;
                    ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams2 != null) {
                        i5 = marginLayoutParams2.topMargin;
                    } else {
                        i5 = 0;
                    }
                    V1B.LJLLLL(Math.max(i5 - i2, -height), viewGroup2);
                } else {
                    int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                    if (computeVerticalScrollOffset <= height) {
                        V1B.LJLLLL(-computeVerticalScrollOffset, this.LJLILLLLZI);
                    }
                }
            } else if (i2 > 0) {
                ViewGroup viewGroup3 = this.LJLILLLLZI;
                ViewGroup.LayoutParams layoutParams4 = viewGroup3.getLayoutParams();
                if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams3 != null) {
                    i4 = marginLayoutParams3.topMargin;
                } else {
                    i4 = 0;
                }
                V1B.LJLLLL(Math.max(i4 - i2, -this.LJLILLLLZI.getHeight()), viewGroup3);
            } else {
                int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset();
                if (computeVerticalScrollOffset2 <= height) {
                    V1B.LJLLLL(-computeVerticalScrollOffset2, this.LJLILLLLZI);
                } else {
                    ViewGroup viewGroup4 = this.LJLILLLLZI;
                    ViewGroup.LayoutParams layoutParams5 = viewGroup4.getLayoutParams();
                    if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams5 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams4 != null) {
                        i3 = marginLayoutParams4.topMargin;
                    } else {
                        i3 = 0;
                    }
                    V1B.LJLLLL(Math.min(i3 - i2, -height), viewGroup4);
                }
            }
        }
        SearchHubVM searchHubVM = this.LJLJJL;
        int height2 = this.LJLILLLLZI.getHeight();
        ViewGroup.LayoutParams layoutParams6 = this.LJLILLLLZI.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = layoutParams6;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams5 != null) {
            i7 = marginLayoutParams5.topMargin;
        }
        searchHubVM.LJLJL.setValue(Integer.valueOf(height2 + i7));
    }

    public C50190Jms(ViewGroup viewGroup, DynamicPatch dynamicPatch, SearchHubHeaderVM searchHubHeaderVM, SearchHubVM searchHubVM) {
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = dynamicPatch;
        this.LJLJJI = searchHubHeaderVM;
        this.LJLJJL = searchHubVM;
    }
}
