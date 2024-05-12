package X;

import Y.ACListenerS34S0300000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KCe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51320KCe extends RecyclerView.ViewHolder implements KCS {
    public static final int LJLLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
    public final K6B LJLIL;
    public final K75 LJLILLLLZI;
    public final KC6 LJLJI;
    public EcSearchSugMobHelper LJLJJI;
    public final int LJLJJL;
    public int LJLJJLL;
    public SearchSugEntity LJLJL;
    public String LJLJLJ;
    public Integer LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public LD0 LJLLILLLL;

    public final void M() {
        int i = LJLLJ;
        Integer num = this.LJLJLLL;
        if (num == null || num.intValue() != i) {
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            this.LJLJLLL = Integer.valueOf(i);
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // X.KCS
    public final void onViewAttachedToWindow() {
        ISearchSugContextAbility LLIIIZ;
        KAN Vk0;
        int i;
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C50948Jz6 LIZIZ = JTO.LIZIZ(C45804HyK.LJJIFFI(context));
        String str = this.LJLLI;
        int i2 = this.LJLJJLL;
        SearchSugEntity searchSugEntity = this.LJLJL;
        String str2 = this.LJLJLJ;
        String str3 = this.LJLL;
        K75 k75 = this.LJLILLLLZI;
        if (k75 != null) {
            InterfaceC178696zp LIZIZ2 = k75.LIZIZ();
            if (LIZIZ2 != null) {
                i = LIZIZ2.LIZIZ();
            }
            i = 0;
        } else {
            KC6 kc6 = this.LJLJI;
            if (kc6 != null && (LLIIIZ = kc6.LLIIIZ()) != null && (Vk0 = LLIIIZ.Vk0()) != null) {
                i = Vk0.LIZ;
            }
            i = 0;
        }
        K7T.LJ(str, i2, searchSugEntity, str2, str3, i, LIZIZ);
    }

    @Override // X.KCS
    public final void onViewDetachedFromWindow() {
        LD0 ld0 = this.LJLLILLLL;
        if (ld0 != null) {
            ld0.LIZLLL();
        }
    }

    public final void L(SearchSugEntity searchSugEntity, String requestId, int i, XWV xwv) {
        String str;
        boolean z;
        int i2;
        String userAvatarUri;
        String userAvatarUri2;
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        o.LJIIIZ(requestId, "requestId");
        M();
        ((AppCompatTextView) this.itemView.findViewById(R.id.m2v)).setTextSize(1, 17.0f);
        ((C115864gg) this.itemView.findViewById(R.id.mc3)).setBiggerTextSize(17);
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.f4l).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(C17N.LJIILL(12.0d));
        this.itemView.findViewById(R.id.f4l).setLayoutParams(marginLayoutParams);
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        if (LIZIZ != null) {
            ((TuxIconView) this.itemView.findViewById(R.id.f4l)).setTintColor(LIZIZ.intValue());
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        if (LIZIZ2 != null) {
            ((TuxIconView) this.itemView.findViewById(R.id.f1l)).setTintColor(LIZIZ2.intValue());
        }
        this.itemView.findViewById(R.id.nbs).setBackground(this.itemView.getContext().getDrawable(R.drawable.aox));
        this.itemView.findViewById(R.id.nbs).setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.f4l).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(C17N.LJIILL(24.0d));
        marginLayoutParams2.setMarginEnd(C17N.LJIILL(20.0d));
        this.itemView.findViewById(R.id.f4l).setLayoutParams(marginLayoutParams2);
        if (C52197Ke9.LIZ()) {
            Integer LIZIZ3 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
            if (LIZIZ3 != null) {
                ((TextView) ((C115864gg) this.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0)).setTextColor(LIZIZ3.intValue());
            }
            Integer LIZIZ4 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
            if (LIZIZ4 != null) {
                ((TextView) this.itemView.findViewById(R.id.m2v)).setTextColor(LIZIZ4.intValue());
            }
        }
        this.LJLJL = searchSugEntity;
        if (C78840Uwu.LJJIFFI(searchSugEntity)) {
            TextView textView = (TextView) ((C115864gg) this.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0);
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.itemView.findViewById(R.id.btg).setVisibility(8);
            this.itemView.findViewById(R.id.mc3).setVisibility(0);
            C115864gg c115864gg = (C115864gg) this.itemView.findViewById(R.id.mc3);
            Context context = this.itemView.getContext();
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            CharSequence LJIILIIL = C78840Uwu.LJIILIIL(searchSugEntity, context2);
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            c115864gg.LJJLJLI(context, LJIILIIL, C78840Uwu.LJIILLIIL(searchSugEntity, itemView));
            str = "enrich_sug";
        } else {
            this.itemView.findViewById(R.id.mc3).setVisibility(8);
            this.itemView.findViewById(R.id.btg).setVisibility(0);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.m2v);
            o.LJIIIIZZ(textView2, "itemView.tv_content");
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            this.itemView.findViewById(R.id.btg);
            C78565UsT.LJJIII(searchSugEntity, textView2, itemView2, LJLLJ);
            str = "normal_sug";
        }
        this.LJLJLJ = str;
        Integer valueOf = Integer.valueOf(searchSugEntity.LIZIZ);
        if (valueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = valueOf.intValue();
        } else {
            i2 = i;
        }
        this.LJLJJLL = i2;
        this.itemView.setOnTouchListener(new C51334KCs(this, searchSugEntity, requestId, i));
        C16880lQ.LJJJ((TuxIconView) this.itemView.findViewById(R.id.f1l), new ACListenerS34S0300000_8(this, searchSugEntity, xwv, 4));
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (this.LJLJJL == 0 || sugExtraInfo == null || !sugExtraInfo.isRichSug() || (userAvatarUri2 = sugExtraInfo.getUserAvatarUri()) == null || userAvatarUri2.length() == 0) {
            this.itemView.findViewById(R.id.dc_).setVisibility(8);
        } else {
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            JTO.LIZIZ(C45804HyK.LJJIFFI(context3));
            C57128MbU c57128MbU = (C57128MbU) this.itemView.findViewById(R.id.eye);
            if (c57128MbU != null && c57128MbU.getAvatarImageView() != null) {
                this.itemView.findViewById(R.id.dc_).setVisibility(0);
                if (!sugExtraInfo.isCreatorLive()) {
                    ((C57128MbU) this.itemView.findViewById(R.id.eye)).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                } else {
                    ((C57128MbU) this.itemView.findViewById(R.id.eye)).setLayoutParams(new FrameLayout.LayoutParams(C7MY.LIZIZ(34), C7MY.LIZIZ(34), 17));
                }
                String userAvatarUri3 = sugExtraInfo.getUserAvatarUri();
                if (userAvatarUri3 == null) {
                    userAvatarUri3 = "";
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(userAvatarUri3);
                LJIIIIZZ.LJJIIJ = ((C57128MbU) this.itemView.findViewById(R.id.eye)).getAvatarImageView();
                LJIIIIZZ.LIZIZ("SearchUserSugViewHolder");
                C16880lQ.LLJJJ(LJIIIIZZ);
                C57128MbU c57128MbU2 = (C57128MbU) this.itemView.findViewById(R.id.eye);
                o.LJIIIIZZ(c57128MbU2, "itemView.iv_avatar");
                C78840Uwu.LJJIJL(c57128MbU2, R.drawable.b0p);
            }
        }
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        LD0 ld0 = this.LJLLILLLL;
        if (ld0 != null) {
            ld0.LIZJ();
        }
        Context context4 = this.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        JTO.LIZIZ(C45804HyK.LJJIFFI(context4));
        if (this.LJLJJL == 0 || sugExtraInfo2 == null || !sugExtraInfo2.isRichSug() || (userAvatarUri = sugExtraInfo2.getUserAvatarUri()) == null || userAvatarUri.length() == 0 || !sugExtraInfo2.isCreatorLive()) {
            C57128MbU c57128MbU3 = (C57128MbU) this.itemView.findViewById(R.id.eye);
            if (c57128MbU3 != null) {
                c57128MbU3.LIZIZ(false);
            }
            View findViewById = this.itemView.findViewById(R.id.eud);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            this.LJLLILLLL = null;
            return;
        }
        if (!sugExtraInfo2.isCreatorLive()) {
            return;
        }
        View findViewById2 = this.itemView.findViewById(R.id.eud);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        LD0 ld02 = new LD0((C57128MbU) this.itemView.findViewById(R.id.eye), (C57128MbU) this.itemView.findViewById(R.id.eye), (C53873LCj) this.itemView.findViewById(R.id.eud));
        ld02.LJIIJ(false);
        this.LJLLILLLL = ld02;
        C57128MbU c57128MbU4 = (C57128MbU) this.itemView.findViewById(R.id.eye);
        if (c57128MbU4 != null) {
            c57128MbU4.LIZIZ(true);
        }
        C57128MbU c57128MbU5 = (C57128MbU) this.itemView.findViewById(R.id.eye);
        if (c57128MbU5 == null) {
            return;
        }
        C78840Uwu.LJJIJIL(c57128MbU5, 23.33d, 11.5d);
    }

    public C51320KCe(View view, String str, EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew, K75 k75, C51261K9x c51261K9x) {
        super(view);
        String searchPosition;
        this.LJLIL = ecAbstractSearchIntermediateFragmentNew;
        this.LJLILLLLZI = k75;
        this.LJLJI = c51261K9x;
        this.LJLJJL = 1;
        this.LJLJLJ = "normal_sug";
        this.LJLL = str;
        ActivityC45651qj LJ = C1DG.LJ(this.itemView, "itemView.context");
        if (LJ != null) {
            this.LJLJJI = (EcSearchSugMobHelper) ViewModelProviders.of(LJ).get(EcSearchSugMobHelper.class);
        }
        M();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        c50651JuJ.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJJIFFI);
        if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null && searchPosition.length() > 0) {
            str = searchPosition;
        }
        this.LJLLI = str;
    }
}
