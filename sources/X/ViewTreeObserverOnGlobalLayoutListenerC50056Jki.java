package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;

/* renamed from: X.Jki, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC50056Jki implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ DynamicPatch LJLJI;
    public final /* synthetic */ RecyclerView LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ SearchHubVM LJLJJLL;

    public ViewTreeObserverOnGlobalLayoutListenerC50056Jki(ViewGroup viewGroup, C76732zl c76732zl, DynamicPatch dynamicPatch, RecyclerView recyclerView, View view, SearchHubVM searchHubVM) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = dynamicPatch;
        this.LJLJJI = recyclerView;
        this.LJLJJL = view;
        this.LJLJJLL = searchHubVM;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int i2 = 0;
        if (this.LJLIL.getVisibility() == 0) {
            i = this.LJLIL.getHeight();
        } else {
            i = 0;
        }
        if (this.LJLILLLLZI.element == i) {
            return;
        }
        if (this.LJLJI != null) {
            int paddingTop = i - this.LJLJJI.getPaddingTop();
            V1B.LJLLI(i, this.LJLJJI);
            if (paddingTop > 0) {
                this.LJLJJI.scrollBy(0, -paddingTop);
            }
        }
        this.LJLILLLLZI.element = i;
        View view = this.LJLJJL;
        if (view != null) {
            view.setTranslationY(i);
        }
        SearchHubVM searchHubVM = this.LJLJJLL;
        int height = this.LJLIL.getHeight();
        ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.topMargin;
        }
        searchHubVM.LJLJL.setValue(Integer.valueOf(height + i2));
    }
}
