package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
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

/* renamed from: X.KCf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51321KCf extends RecyclerView.ViewHolder implements KCS {
    public static final /* synthetic */ int LJLLI = 0;
    public final K6B LJLIL;
    public final K75 LJLILLLLZI;
    public final KC6 LJLJI;
    public SearchSugEntity LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public LD0 LJLL;

    @Override // X.KCS
    public final void onViewDetachedFromWindow() {
        this.LJLJL = false;
        LD0 ld0 = this.LJLL;
        if (ld0 != null) {
            ld0.LIZLLL();
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
        this.LJLJL = true;
        String str = this.LJLJLLL;
        int layoutPosition = getLayoutPosition();
        SearchSugEntity searchSugEntity = this.LJLJJI;
        String str2 = this.LJLJLJ;
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
        K7T.LJ(str, layoutPosition, searchSugEntity, "enrich_sug", str2, i, LIZIZ);
    }

    public final void L(int i, SearchSugEntity searchSugEntity, String str) {
        C57127MbT avatarImageView;
        String userAvatarUri;
        Integer LIZIZ;
        if (searchSugEntity == null || searchSugEntity.sugExtraInfo == null) {
            return;
        }
        ((C115864gg) this.itemView.findViewById(R.id.mc3)).setBiggerTextSize(17);
        this.LJLJJI = searchSugEntity;
        this.LJLJJL = i;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.LJLJJLL = str;
        TextView textView = (TextView) ((C115864gg) this.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0);
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.f_o).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(C17N.LJIILL(12.0d));
        this.itemView.findViewById(R.id.f_o).setLayoutParams(marginLayoutParams);
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        if (LIZIZ2 != null) {
            ((TuxIconView) this.itemView.findViewById(R.id.f_o)).setTintColor(LIZIZ2.intValue());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.fat);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        c2068389v.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        appCompatImageView.setImageDrawable(c2068389v.LIZ(context));
        this.itemView.findViewById(R.id.nbs).setBackground(this.itemView.getContext().getDrawable(R.drawable.aox));
        this.itemView.findViewById(R.id.nbs).setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.f_o).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(C17N.LJIILL(24.0d));
        marginLayoutParams2.setMarginEnd(C17N.LJIILL(20.0d));
        this.itemView.findViewById(R.id.f_o).setLayoutParams(marginLayoutParams2);
        if (C52197Ke9.LIZ() && (LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu)) != null) {
            ((TextView) ((C115864gg) this.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0)).setTextColor(LIZIZ.intValue());
        }
        C115864gg c115864gg = (C115864gg) this.itemView.findViewById(R.id.mc3);
        Context context2 = this.itemView.getContext();
        Context context3 = this.itemView.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        CharSequence LJIILIIL = C78840Uwu.LJIILIIL(searchSugEntity, context3);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        c115864gg.LJJLJLI(context2, LJIILIIL, C78840Uwu.LJIILLIIL(searchSugEntity, itemView));
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo == null || (userAvatarUri = sugExtraInfo.getUserAvatarUri()) == null || userAvatarUri.length() == 0) {
            C57128MbU c57128MbU = (C57128MbU) this.itemView.findViewById(R.id.eye);
            if (c57128MbU != null && (avatarImageView = c57128MbU.getAvatarImageView()) != null) {
                avatarImageView.setController(null);
            }
        } else {
            C57128MbU c57128MbU2 = (C57128MbU) this.itemView.findViewById(R.id.eye);
            if (c57128MbU2 != null && c57128MbU2.getAvatarImageView() != null) {
                View findViewById = this.itemView.findViewById(R.id.dc_);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (!sugExtraInfo.isCreatorLive()) {
                    ((C57128MbU) this.itemView.findViewById(R.id.eye)).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                } else {
                    ((C57128MbU) this.itemView.findViewById(R.id.eye)).setLayoutParams(new FrameLayout.LayoutParams(C7MY.LIZIZ(34), C7MY.LIZIZ(34), 17));
                }
                String userAvatarUri2 = sugExtraInfo.getUserAvatarUri();
                if (userAvatarUri2 != null) {
                    str2 = userAvatarUri2;
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                LJIIIIZZ.LJJIIJ = ((C57128MbU) this.itemView.findViewById(R.id.eye)).getAvatarImageView();
                LJIIIIZZ.LIZIZ("SearchUserSugViewHolder");
                C16880lQ.LLJJJ(LJIIIIZZ);
                C57128MbU c57128MbU3 = (C57128MbU) this.itemView.findViewById(R.id.eye);
                o.LJIIIIZZ(c57128MbU3, "itemView.iv_avatar");
                C78840Uwu.LJJIJL(c57128MbU3, R.drawable.b0p);
            }
        }
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        LD0 ld0 = this.LJLL;
        if (ld0 != null) {
            ld0.LIZJ();
        }
        if (sugExtraInfo2 == null || !sugExtraInfo2.isCreatorLive()) {
            C57128MbU c57128MbU4 = (C57128MbU) this.itemView.findViewById(R.id.eye);
            if (c57128MbU4 != null) {
                c57128MbU4.LIZIZ(false);
            }
            View findViewById2 = this.itemView.findViewById(R.id.eud);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            this.LJLL = null;
            return;
        }
        if (!sugExtraInfo2.isCreatorLive()) {
            return;
        }
        View findViewById3 = this.itemView.findViewById(R.id.eud);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
        }
        LD0 ld02 = new LD0((C57128MbU) this.itemView.findViewById(R.id.eye), (C57128MbU) this.itemView.findViewById(R.id.eye), (C53873LCj) this.itemView.findViewById(R.id.eud));
        ld02.LJIIJ(false);
        this.LJLL = ld02;
        ((C57128MbU) this.itemView.findViewById(R.id.eye)).LIZIZ(true);
        C57128MbU c57128MbU5 = (C57128MbU) this.itemView.findViewById(R.id.eye);
        o.LJIIIIZZ(c57128MbU5, "itemView.iv_avatar");
        C78840Uwu.LJJIJIL(c57128MbU5, 23.33d, 11.5d);
    }

    public C51321KCf(View view, C51261K9x c51261K9x, KDD kdd, K75 k75, EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew, String str) {
        super(view);
        String searchPosition;
        this.LJLIL = ecAbstractSearchIntermediateFragmentNew;
        this.LJLILLLLZI = k75;
        this.LJLJI = c51261K9x;
        this.LJLJJLL = "";
        this.LJLJLJ = str;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.fat);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        appCompatImageView.setImageDrawable(c2068389v.LIZ(context));
        ((C51340KCy) view.findViewById(R.id.fat)).setKeyboardDismissHandler(kdd);
        view.findViewById(R.id.fat).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 58)));
        Context context2 = this.itemView.getContext();
        if (context2 instanceof ActivityC45651qj) {
            ViewModelProviders.of((ActivityC45651qj) context2).get(EcSearchSugMobHelper.class);
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Context context3 = view.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
        c50651JuJ.getClass();
        C50321Joz LJIIJJI = C50651JuJ.LJIIJJI(LJJIFFI);
        if (LJIIJJI != null && (searchPosition = LJIIJJI.getSearchPosition()) != null && searchPosition.length() > 0) {
            str = searchPosition;
        }
        this.LJLJLLL = str;
        view.setOnTouchListener(new C51332KCq(this, view, kdd));
    }
}
