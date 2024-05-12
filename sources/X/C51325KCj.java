package X;

import Y.ACListenerS22S0101000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.ui.SugLiveLottieDrawable;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.zhiliaoapp.musically.R;

/* renamed from: X.KCj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51325KCj extends RecyclerView.ViewHolder implements InterfaceC51130K4w {
    public static final int LLFF = C32151Nz.LJIILLIIL(48);
    public long LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final C51335KCt LJLJJLL;
    public final TuxIconView LJLJL;
    public final View LJLJLJ;
    public final View LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public Long LJLLILLLL;
    public final K6B LJLLJ;
    public final KDY LJLLL;
    public final K75 LJLLLL;
    public SearchSugEntity LJLLLLLL;
    public final String LJLZ;
    public int LJZ;
    public int LJZI;
    public String LJZL;
    public int LL;
    public SearchSugMobHelper LLD;
    public SugLiveLottieDrawable LLF;

    @Override // X.InterfaceC51130K4w
    public final void onViewAttachedToWindow() {
        int i;
        K75 k75 = this.LJLLLL;
        if (k75 != null && k75.LIZIZ() != null) {
            i = this.LJLLLL.LIZIZ().LIZIZ();
        } else {
            i = -1;
        }
        K56.LJI(this.LJZL, this.LL, this.LJLLLLLL, "normal_sug", this.LJLZ, i, KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(this.itemView.getContext())))), C45804HyK.LJJIFFI(this.itemView.getContext()));
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewDetachedFromWindow() {
        SugLiveLottieDrawable sugLiveLottieDrawable = this.LLF;
        if (sugLiveLottieDrawable != null) {
            sugLiveLottieDrawable.LIZ();
            this.LLF = null;
        }
    }

    @Override // X.InterfaceC51130K4w
    public final void LLLFZ(boolean z) {
        SugLiveLottieDrawable sugLiveLottieDrawable = this.LLF;
        if (sugLiveLottieDrawable != null) {
            sugLiveLottieDrawable.LIZIZ(z);
        }
    }

    public C51325KCj(View view, K75 k75, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, K5C k5c, String str) {
        super(view);
        this.LJLLILLLL = 0L;
        this.LLF = null;
        this.LJLLJ = abstractSearchIntermediateFragmentNew;
        this.LJLZ = str;
        this.LJLLL = k5c;
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.mlv);
        this.LJLJI = (TextView) view.findViewById(R.id.mm0);
        this.LJLJJI = (TextView) view.findViewById(R.id.mlx);
        this.LJLJJL = (TextView) view.findViewById(R.id.mlz);
        C51335KCt c51335KCt = (C51335KCt) view.findViewById(R.id.fat);
        this.LJLJJLL = c51335KCt;
        this.LJLJL = (TuxIconView) view.findViewById(R.id.f_o);
        this.LJLJLJ = view.findViewById(R.id.apk);
        this.LJLJLLL = view.findViewById(R.id.f4q);
        this.LJLL = view.findViewById(R.id.bst);
        this.LJLLI = view.findViewById(R.id.nbs);
        this.LJLLLL = k75;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        c51335KCt.setImageDrawable(c2068389v.LIZ(view.getContext()));
        c51335KCt.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0101000_3(2, this, 8)));
        c51335KCt.setKeyboardDismissHandler(k5c);
        int i = LLFF;
        if (this.LJZI != i) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = i;
            this.LJZI = i;
            this.itemView.setLayoutParams(layoutParams);
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.itemView.getContext());
        if (LJJIFFI != null) {
            this.LLD = (SearchSugMobHelper) ViewModelProviders.of(LJJIFFI).get(SearchSugMobHelper.class);
        }
        if (C32151Nz.LJJIL(view)) {
            C78897Uxp.LJJJJJL(view, 0.0f);
            C78897Uxp.LJJJJLI(c51335KCt, null);
        }
    }
}
