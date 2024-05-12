package X;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import kotlin.jvm.internal.o;

/* renamed from: X.Jnh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50241Jnh extends C0A6 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final RecyclerView LJLIL;
    public final InterfaceC50244Jnk LJLILLLLZI;
    public final C50243Jnj LJLJI;
    public Integer LJLJJI;
    public final C50242Jni LJLJJL;
    public int LJLJJLL;

    static {
        TBV tbv = new TBV(C50241Jnh.class, "isVisible", "isVisible()Z", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbv};
    }

    public final boolean LJIILLIIL() {
        return this.LJLJJL.LIZ(this, LJLJL[0]).booleanValue();
    }

    public final void LJIIZILJ(boolean z) {
        this.LJLJJL.LIZIZ(LJLJL[0], this, Boolean.valueOf(z));
    }

    public C50241Jnh(RecyclerView rv, SearchActivityCardBgController handler, C50243Jnj activityGradientDrawable) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(activityGradientDrawable, "activityGradientDrawable");
        this.LJLIL = rv;
        this.LJLILLLLZI = handler;
        this.LJLJI = activityGradientDrawable;
        this.LJLJJL = new C50242Jni(Boolean.TRUE, this);
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int intValue;
        boolean z;
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutManager");
        Integer num = this.LJLJJI;
        if (num == null || (intValue = num.intValue()) < 0) {
            return;
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        View LJJIJIL = layoutManager.LJJIJIL(intValue);
        if (LJJIJIL == null) {
            LJIIZILJ(false);
            return;
        }
        ActivityC45651qj LJJIJIL2 = C30581Hy.LJJIJIL(recyclerView);
        if (LJJIJIL2 != null) {
            ThemeViewModel themeViewModel = (ThemeViewModel) ViewModelProviders.of(LJJIJIL2).get(ThemeViewModel.class);
            Rect rect = new Rect();
            boolean globalVisibleRect = LJJIJIL.getGlobalVisibleRect(rect);
            int i4 = rect.bottom - themeViewModel.LJLILLLLZI;
            if (globalVisibleRect && i4 > LJJIJIL.getHeight() / 2) {
                z = true;
            } else {
                z = false;
            }
            LJIIZILJ(z);
            if (LJIILLIIL() && (i3 = themeViewModel.LJLJI) > 0) {
                this.LJLJJLL = i3 - i4;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isVisible = ");
            LIZ.append(LJIILLIIL());
            LIZ.append(",  top = ");
            LIZ.append(rect.top);
            LIZ.append(", bottom = ");
            LIZ.append(rect.bottom);
            LIZ.append(",  visible height = ");
            LIZ.append(rect.height());
            LIZ.append(", bgVisibleHeight = ");
            LIZ.append(i4);
            X1D.LIZIZ(LIZ);
        }
        C50243Jnj c50243Jnj = this.LJLJI;
        c50243Jnj.LJII = this.LJLJJLL;
        c50243Jnj.invalidateSelf();
        if (computeVerticalScrollOffset == 0) {
            this.LJLJI.LJII = 0;
        }
    }
}
