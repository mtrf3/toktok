package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KCl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51327KCl extends RecyclerView.ViewHolder implements InterfaceC51130K4w {
    public static final /* synthetic */ int LJLLL = 0;
    public final K6B LJLIL;
    public final KDY LJLILLLLZI;
    public final K75 LJLJI;
    public SearchSugEntity LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public final String LJLJLJ;
    public SearchSugMobHelper LJLJLLL;
    public final String LJLL;
    public LD1 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final int LJLLJ;

    @Override // X.InterfaceC51130K4w
    public final void LLLFZ(boolean z) {
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewAttachedToWindow() {
        int i;
        InterfaceC178696zp LIZIZ;
        this.LJLJL = true;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context))));
        String str = this.LJLL;
        int layoutPosition = getLayoutPosition();
        SearchSugEntity searchSugEntity = this.LJLJJI;
        String str2 = this.LJLJLJ;
        K75 k75 = this.LJLJI;
        if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
            i = LIZIZ.LIZIZ();
        } else {
            i = -1;
        }
        K56.LJI(str, layoutPosition, searchSugEntity, "enrich_sug", str2, i, LJII, C1DG.LJ(this.itemView, "itemView.context"));
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewDetachedFromWindow() {
        this.LJLJL = false;
        LD1 ld1 = this.LJLLI;
        if (ld1 != null) {
            ld1.LIZLLL();
        }
    }

    public C51327KCl(View view, K75 k75, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, K5C k5c, String str) {
        super(view);
        String searchPosition;
        this.LJLIL = abstractSearchIntermediateFragmentNew;
        this.LJLILLLLZI = k5c;
        this.LJLJI = k75;
        this.LJLJJLL = "";
        this.LJLJLJ = str;
        this.LJLLILLLL = C221108m2.LIZIZ(KDF.LJLIL);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.fat);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        appCompatImageView.setImageDrawable(c2068389v.LIZ(context));
        ((C51335KCt) view.findViewById(R.id.fat)).setKeyboardDismissHandler(k5c);
        view.findViewById(R.id.fat).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 8)));
        if (C32151Nz.LJJIL(view)) {
            C78897Uxp.LJJJJJL(view, 0.0f);
            View findViewById = view.findViewById(R.id.fat);
            o.LJIIIIZZ(findViewById, "itemView.iv_sug_completion_new");
            C78897Uxp.LJJJJLI(findViewById, null);
        }
        Context context2 = this.itemView.getContext();
        if (context2 instanceof ActivityC45651qj) {
            this.LJLJLLL = (SearchSugMobHelper) ViewModelProviders.of((ActivityC45651qj) context2).get(SearchSugMobHelper.class);
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Context context3 = view.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
        o.LJI(LJJIFFI);
        c50651JuJ.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJJIFFI);
        if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null && searchPosition.length() > 0) {
            str = searchPosition;
        }
        this.LJLL = str;
        this.LJLLJ = 17;
    }
}
