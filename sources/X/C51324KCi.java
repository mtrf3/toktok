package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.ui.SugLiveLottieDrawable;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KCi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51324KCi extends RecyclerView.ViewHolder implements InterfaceC51130K4w {
    public static final int LJLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
    public final K6B LJLIL;
    public final K75 LJLILLLLZI;
    public SearchSugMobHelper LJLJI;
    public int LJLJJI;
    public SearchSugEntity LJLJJL;
    public String LJLJJLL;
    public Integer LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public LD1 LJLL;
    public SugLiveLottieDrawable LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final int LJLLJ;

    public final void L() {
        int i = LJLLL;
        Integer num = this.LJLJL;
        if (num == null || num.intValue() != i) {
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            this.LJLJL = Integer.valueOf(i);
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewAttachedToWindow() {
        int i;
        InterfaceC178696zp LIZIZ;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context))));
        String str = this.LJLJLLL;
        int i2 = this.LJLJJI;
        SearchSugEntity searchSugEntity = this.LJLJJL;
        String str2 = this.LJLJJLL;
        String str3 = this.LJLJLJ;
        K75 k75 = this.LJLILLLLZI;
        if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
            i = LIZIZ.LIZIZ();
        } else {
            i = -1;
        }
        K56.LJI(str, i2, searchSugEntity, str2, str3, i, LJII, C1DG.LJ(this.itemView, "itemView.context"));
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewDetachedFromWindow() {
        LD1 ld1 = this.LJLL;
        if (ld1 != null) {
            ld1.LIZLLL();
        }
        SugLiveLottieDrawable sugLiveLottieDrawable = this.LJLLI;
        if (sugLiveLottieDrawable != null) {
            sugLiveLottieDrawable.LIZ();
        }
        this.LJLLI = null;
    }

    @Override // X.InterfaceC51130K4w
    public final void LLLFZ(boolean z) {
        SugLiveLottieDrawable sugLiveLottieDrawable = this.LJLLI;
        if (sugLiveLottieDrawable != null) {
            sugLiveLottieDrawable.LIZIZ(z);
        }
    }

    public C51324KCi(View view, String str, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, K75 k75) {
        super(view);
        String searchPosition;
        this.LJLIL = abstractSearchIntermediateFragmentNew;
        this.LJLILLLLZI = k75;
        this.LJLJJLL = "normal_sug";
        this.LJLJLJ = str;
        this.LJLLILLLL = C221108m2.LIZIZ(KDG.LJLIL);
        ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
        if (LJ != null) {
            this.LJLJI = (SearchSugMobHelper) ViewModelProviders.of(LJ).get(SearchSugMobHelper.class);
        }
        L();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        c50651JuJ.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJJIFFI);
        if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null && searchPosition.length() > 0) {
            str = searchPosition;
        }
        this.LJLJLLL = str;
        if (C32151Nz.LJJIL(view)) {
            C78897Uxp.LJJJJJL(view, 0.0f);
            View findViewById = view.findViewById(R.id.f1l);
            o.LJIIIIZZ(findViewById, "itemView.iv_delete_new");
            C78897Uxp.LJJJJLI(findViewById, null);
        }
        this.LJLLJ = 17;
    }
}
