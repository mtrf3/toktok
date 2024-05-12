package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KCk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51326KCk extends RecyclerView.ViewHolder implements InterfaceC51130K4w {
    public static final /* synthetic */ int LJLLLL = 0;
    public final String LJLIL;
    public final K6B LJLILLLLZI;
    public final KDY LJLJI;
    public final K75 LJLJJI;
    public View LJLJJL;
    public C51335KCt LJLJJLL;
    public TextView LJLJL;
    public SearchSugEntity LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public boolean LJLLI;
    public SearchSugMobHelper LJLLILLLL;
    public String LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // X.InterfaceC51130K4w
    public final void LLLFZ(boolean z) {
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewAttachedToWindow() {
        String str;
        int i;
        InterfaceC178696zp LIZIZ;
        this.LJLLI = true;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context))));
        String str2 = this.LJLLJ;
        int layoutPosition = getLayoutPosition();
        SearchSugEntity searchSugEntity = this.LJLJLJ;
        if (C78841Uwv.LJIL(searchSugEntity)) {
            str = "enrich_sug";
        } else {
            str = "normal_sug";
        }
        String str3 = this.LJLIL;
        K75 k75 = this.LJLJJI;
        if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
            i = LIZIZ.LIZIZ();
        } else {
            i = -1;
        }
        K56.LJI(str2, layoutPosition, searchSugEntity, str, str3, i, LJII, C1DG.LJ(this.itemView, "itemView.context"));
    }

    @Override // X.InterfaceC51130K4w
    public final void onViewDetachedFromWindow() {
        this.LJLLI = false;
    }

    public C51326KCk(View view, K75 k75, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, K5C k5c, String str) {
        super(view);
        ActivityC45651qj LJJIFFI;
        String searchPosition;
        Context context;
        Integer LJI;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LJLIL = str;
        this.LJLILLLLZI = abstractSearchIntermediateFragmentNew;
        this.LJLJI = k5c;
        this.LJLJJI = k75;
        this.LJLL = "";
        this.LJLLL = C221108m2.LIZIZ(KDE.LJLIL);
        View findViewById = this.itemView.findViewById(R.id.f_o);
        this.LJLJJL = findViewById;
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            }
        }
        C51335KCt c51335KCt = (C51335KCt) this.itemView.findViewById(R.id.fat);
        this.LJLJJLL = c51335KCt;
        if (c51335KCt != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
            c2068389v.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            c51335KCt.setImageDrawable(c2068389v.LIZ(context2));
            c51335KCt.setKeyboardDismissHandler(k5c);
            c51335KCt.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 7)));
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.mlw);
        this.LJLJL = textView;
        if (textView != null) {
            if (C52197Ke9.LIZ() && (context = this.itemView.getContext()) != null && (LJI = C79045V0n.LJI(R.attr.gu, context)) != null) {
                textView.setTextColor(LJI.intValue());
            }
            textView.setTextSize(1, 17.0f);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (C32151Nz.LJJIL(itemView)) {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C78897Uxp.LJJJJJL(itemView2, 0.0f);
            C51335KCt c51335KCt2 = this.LJLJJLL;
            if (c51335KCt2 != null) {
                C78897Uxp.LJJJJLI(c51335KCt2, null);
            }
        }
        Context context3 = this.itemView.getContext();
        if (context3 != null && (LJJIFFI = C45804HyK.LJJIFFI(context3)) != null) {
            this.LJLLILLLL = (SearchSugMobHelper) ViewModelProviders.of(LJJIFFI).get(SearchSugMobHelper.class);
            C50652JuK.Companion.getClass();
            C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJJIFFI);
            if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null) {
                if (Boolean.valueOf(searchPosition.length() > 0).booleanValue()) {
                    str = searchPosition;
                }
            }
            this.LJLLJ = str;
        }
    }
}
