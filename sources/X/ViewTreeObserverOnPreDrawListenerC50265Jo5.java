package X;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubHeaderComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.Jo5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnPreDrawListenerC50265Jo5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ SearchHubHeaderComponent LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ LinearLayout LJLJL;
    public final /* synthetic */ LinearLayout LJLJLJ;
    public final /* synthetic */ FrameLayout LJLJLLL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        String LIZIZ;
        int height = this.LJLIL.getHeight();
        if (height == 0) {
            return true;
        }
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        Layout layout = this.LJLIL.getLayout();
        if (layout != null) {
            i = layout.getEllipsisCount(0);
        } else {
            i = 0;
        }
        if (i > 0 && this.LJLILLLLZI.length() > 0) {
            TextPaint paint = this.LJLIL.getPaint();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" / ");
            LIZ.append(this.LJLJI);
            float width = this.LJLIL.getWidth() - paint.measureText(X1D.LIZIZ(LIZ));
            int i2 = 0;
            do {
                StringBuilder LIZ2 = X1D.LIZ();
                String str = this.LJLILLLLZI;
                i2++;
                String substring = str.substring(0, str.length() - i2);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                LIZ2.append(substring);
                LIZ2.append("...");
                if (this.LJLIL.getPaint().measureText(X1D.LIZIZ(LIZ2)) <= width) {
                    break;
                }
            } while (i2 < this.LJLILLLLZI.length());
            if (i2 < this.LJLILLLLZI.length()) {
                TuxTextView tvNonOverviewTitle = this.LJLIL;
                o.LJIIIIZZ(tvNonOverviewTitle, "tvNonOverviewTitle");
                if (C26338AVi.LIZLLL(tvNonOverviewTitle)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(this.LJLJI);
                    LIZ3.append(" / ");
                    String str2 = this.LJLILLLLZI;
                    String substring2 = str2.substring(0, str2.length() - i2);
                    o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ3.append(substring2);
                    LIZ3.append("...");
                    LIZIZ = X1D.LIZIZ(LIZ3);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    String str3 = this.LJLILLLLZI;
                    String substring3 = str3.substring(0, str3.length() - i2);
                    o.LJIIIIZZ(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ4.append(substring3);
                    LIZ4.append("... / ");
                    LIZ4.append(this.LJLJI);
                    LIZIZ = X1D.LIZIZ(LIZ4);
                }
                tvNonOverviewTitle.setText(LIZIZ);
            }
        }
        SearchHubHeaderComponent searchHubHeaderComponent = this.LJLJJI;
        View tabsRegion = this.LJLJJL;
        o.LJIIIIZZ(tabsRegion, "tabsRegion");
        int LJJIIZ = height - O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
        boolean z = this.LJLJJLL;
        searchHubHeaderComponent.getClass();
        SearchHubHeaderComponent.I3(tabsRegion, LJJIIZ, z);
        SearchHubHeaderComponent searchHubHeaderComponent2 = this.LJLJJI;
        LinearLayout overviewTitleRegion = this.LJLJL;
        o.LJIIIIZZ(overviewTitleRegion, "overviewTitleRegion");
        boolean z2 = this.LJLJJLL;
        searchHubHeaderComponent2.getClass();
        SearchHubHeaderComponent.H3(overviewTitleRegion, 0.0f, z2);
        SearchHubHeaderComponent searchHubHeaderComponent3 = this.LJLJJI;
        LinearLayout overviewSubtitleRegion = this.LJLJLJ;
        o.LJIIIIZZ(overviewSubtitleRegion, "overviewSubtitleRegion");
        boolean z3 = this.LJLJJLL;
        searchHubHeaderComponent3.getClass();
        SearchHubHeaderComponent.H3(overviewSubtitleRegion, 0.0f, z3);
        SearchHubHeaderComponent searchHubHeaderComponent4 = this.LJLJJI;
        FrameLayout overviewInfoRegion = this.LJLJLLL;
        o.LJIIIIZZ(overviewInfoRegion, "overviewInfoRegion");
        boolean z4 = this.LJLJJLL;
        searchHubHeaderComponent4.getClass();
        SearchHubHeaderComponent.H3(overviewInfoRegion, 0.0f, z4);
        SearchHubHeaderComponent searchHubHeaderComponent5 = this.LJLJJI;
        TuxTextView tvNonOverviewTitle2 = this.LJLIL;
        o.LJIIIIZZ(tvNonOverviewTitle2, "tvNonOverviewTitle");
        boolean z5 = this.LJLJJLL;
        searchHubHeaderComponent5.getClass();
        SearchHubHeaderComponent.H3(tvNonOverviewTitle2, 1.0f, z5);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC50265Jo5(TuxTextView tuxTextView, String str, String str2, SearchHubHeaderComponent searchHubHeaderComponent, View view, long j, boolean z, LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = searchHubHeaderComponent;
        this.LJLJJL = view;
        this.LJLJJLL = z;
        this.LJLJL = linearLayout;
        this.LJLJLJ = linearLayout2;
        this.LJLJLLL = frameLayout;
    }
}
