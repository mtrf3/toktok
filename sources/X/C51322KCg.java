package X;

import Y.ACListenerS26S0101000_8;
import Y.AObjectS42S0101000_5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.KCg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51322KCg extends RecyclerView.ViewHolder implements KCS {
    public static final int LLF = C32151Nz.LJIILLIIL(48);
    public long LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final C51340KCy LJLJJLL;
    public final TuxIconView LJLJL;
    public final View LJLJLJ;
    public final View LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public final K6B LJLLILLLL;
    public final KDD LJLLJ;
    public final K75 LJLLL;
    public final KC6 LJLLLL;
    public SearchSugEntity LJLLLLLL;
    public final String LJLZ;
    public int LJZ;
    public int LJZI;
    public String LJZL;
    public int LL;
    public EcSearchSugMobHelper LLD;

    @Override // X.KCS
    public final void onViewDetachedFromWindow() {
    }

    @Override // X.KCS
    public final void onViewAttachedToWindow() {
        int i;
        K75 k75 = this.LJLLL;
        if (k75 != null && k75.LIZIZ() != null) {
            i = this.LJLLL.LIZIZ().LIZIZ();
        } else {
            i = 0;
        }
        KC6 kc6 = this.LJLLLL;
        if (kc6 != null && kc6.LLIIIZ() != null && this.LJLLLL.LLIIIZ().Vk0() != null) {
            i = this.LJLLLL.LLIIIZ().Vk0().LIZ;
        }
        K7T.LJ(this.LJZL, this.LL, this.LJLLLLLL, "normal_sug", this.LJLZ, i, JTO.LIZIZ(C45804HyK.LJJIFFI(this.itemView.getContext())));
    }

    public final void L(SearchSugEntity searchSugEntity, String str, int i) {
        int value;
        ForegroundColorSpan foregroundColorSpan;
        int i2;
        if (searchSugEntity == null) {
            return;
        }
        int i3 = LLF;
        if (this.LJZI != i3) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = i3;
            this.LJZI = i3;
            this.itemView.setLayoutParams(layoutParams);
        }
        this.LJLILLLLZI.setTextSize(1, 17.0f);
        this.LJLJI.setTextSize(1, 17.0f);
        this.LJLJJI.setTextSize(1, 13.0f);
        this.LJLJJL.setTextSize(1, 13.0f);
        Integer LJI = C79045V0n.LJI(R.attr.gw, this.itemView.getContext());
        if (LJI != null) {
            this.LJLJJI.setTextColor(LJI.intValue());
            this.LJLJJL.setTextColor(LJI.intValue());
        } else {
            this.LJLJJI.setTextColor(0);
            this.LJLJJL.setTextColor(0);
        }
        int i4 = searchSugEntity.LIZIZ;
        if (i4 < 0) {
            i4 = i;
        }
        this.LL = i4;
        this.LJLLLLLL = searchSugEntity;
        this.LJZ = i;
        this.LJZL = this.LJLZ;
        Context context = this.itemView.getContext();
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null && sugExtraInfo.getSugHint().length() > 0) {
            TextView mSugView = this.LJLILLLLZI;
            View itemView = this.itemView;
            o.LJIIIZ(mSugView, "mSugView");
            o.LJIIIZ(itemView, "itemView");
            Context context2 = itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            CharSequence LJIILIIL = C78840Uwu.LJIILIIL(searchSugEntity, context2);
            Context context3 = mSugView.getContext();
            o.LJIIIIZZ(context3, "mSugView.context");
            CharSequence LJIILIIL2 = C78840Uwu.LJIILIIL(searchSugEntity, context3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJIILIIL2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" · ");
            LIZ.append(searchSugEntity.sugExtraInfo.getSugHint());
            spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
            Context context4 = mSugView.getContext();
            o.LJIIIIZZ(context4, "mSugView.context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gw, context4)), LJIILIIL2.length(), spannableStringBuilder.length(), 34);
            mSugView.setText(spannableStringBuilder);
            if (searchSugEntity.LIZIZ() && searchSugEntity.sugExtraInfo.getSugHint().length() > 0) {
                mSugView.setText("");
                value = KD3.TWO_LINE_ALL.getValue();
            } else {
                Context context5 = mSugView.getContext();
                o.LJIIIIZZ(context5, "mSugView.context");
                float LIZ2 = C47135Ieh.LIZ(124, C32151Nz.LJJII(context5));
                TextPaint paint = mSugView.getPaint();
                o.LJIIIIZZ(paint, "mSugView.paint");
                if (paint.measureText(mSugView.getText().toString()) < LIZ2) {
                    mSugView.setText("");
                    value = KD3.SINGLE_LINE_HINT.getValue();
                } else {
                    mSugView.setText("");
                    value = KD3.TWO_LINE_HINT.getValue();
                }
            }
            if (value == KD3.SINGLE_LINE_HINT.getValue()) {
                itemView.findViewById(R.id.bst).setVisibility(0);
                itemView.findViewById(R.id.bu7).setVisibility(8);
                mSugView.setText(LJIILIIL);
                itemView.findViewById(R.id.mlx).setVisibility(0);
                itemView.findViewById(R.id.mlz).setVisibility(0);
                ((TextView) itemView.findViewById(R.id.mlx)).setText(searchSugEntity.sugExtraInfo.getSugHint());
                ((TextView) itemView.findViewById(R.id.mlz)).setText(" · ");
            } else if (value == KD3.TWO_LINE_HINT.getValue()) {
                itemView.findViewById(R.id.bst).setVisibility(8);
                itemView.findViewById(R.id.bu7).setVisibility(0);
                ((TextView) itemView.findViewById(R.id.mm0)).setText(LJIILIIL);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(searchSugEntity.sugExtraInfo.getSugHint());
                Integer LIZIZ = C19N.LIZIZ(itemView, "itemView.context", R.attr.gw);
                if (LIZIZ != null) {
                    i2 = LIZIZ.intValue();
                } else {
                    i2 = 0;
                }
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(i2), 0, spannableStringBuilder2.length(), 34);
                spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder2.length(), 33);
                ((TextView) itemView.findViewById(R.id.mly)).setText(spannableStringBuilder2);
            } else if (value == KD3.TWO_LINE_ALL.getValue()) {
                TextView textView = (TextView) itemView.findViewById(R.id.mm0);
                Context context6 = itemView.getContext();
                o.LJIIIIZZ(context6, "itemView.context");
                textView.setMaxWidth(C32151Nz.LJJII(context6) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(138)));
                itemView.findViewById(R.id.bst).setVisibility(8);
                itemView.findViewById(R.id.bu7).setVisibility(0);
                ((ImageView) itemView.findViewById(R.id.f4r)).setVisibility(0);
                ((TextView) itemView.findViewById(R.id.mm0)).setText(LJIILIIL);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(searchSugEntity.sugExtraInfo.getSugHint());
                Integer LIZIZ2 = C19N.LIZIZ(itemView, "itemView.context", R.attr.gw);
                if (LIZIZ2 != null) {
                    foregroundColorSpan = new ForegroundColorSpan(LIZIZ2.intValue());
                } else {
                    foregroundColorSpan = null;
                }
                spannableStringBuilder3.setSpan(foregroundColorSpan, 0, spannableStringBuilder3.length(), 34);
                spannableStringBuilder3.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder3.length(), 33);
                ((TextView) itemView.findViewById(R.id.mly)).setText(spannableStringBuilder3);
            }
        } else {
            C78565UsT.LJJIII(searchSugEntity, this.LJLILLLLZI, this.itemView, i3);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJL.getLayoutParams();
        marginLayoutParams.setMarginEnd(C17N.LJIILL(12.0d));
        this.LJLJL.setLayoutParams(marginLayoutParams);
        if (C52197Ke9.LIZ()) {
            TextView textView2 = this.LJLILLLLZI;
            textView2.setTextColor(C79045V0n.LJI(R.attr.gu, textView2.getContext()).intValue());
        }
        this.LJLJL.setTintColor(C79045V0n.LJI(R.attr.gu, this.LJLILLLLZI.getContext()).intValue());
        C51340KCy c51340KCy = this.LJLJJLL;
        AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(1, this, 19);
        C2068389v c2068389v = new C2068389v();
        aObjectS42S0101000_5.invoke(c2068389v);
        c51340KCy.setImageDrawable(c2068389v.LIZ(this.itemView.getContext()));
        this.LJLLI.setBackground(this.LJLILLLLZI.getContext().getDrawable(R.drawable.aox));
        this.LJLLI.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLJL.getLayoutParams();
        marginLayoutParams2.setMarginStart(C17N.LJIILL(24.0d));
        marginLayoutParams2.setMarginEnd(C17N.LJIILL(20.0d));
        this.LJLJL.setLayoutParams(marginLayoutParams2);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            LJJIFFI = null;
        }
        C50321Joz fetchTopFragmentData = C50652JuK.fetchTopFragmentData(LJJIFFI);
        if (fetchTopFragmentData != null && !fetchTopFragmentData.getSearchPosition().isEmpty()) {
            this.LJZL = fetchTopFragmentData.getSearchPosition();
        }
        this.itemView.setOnTouchListener(new C51333KCr(this, Boolean.TRUE, this.LJZL, searchSugEntity, str, i));
    }

    public C51322KCg(View view, C51261K9x c51261K9x, KDD kdd, K75 k75, EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew, String str) {
        super(view);
        this.LJLLILLLL = ecAbstractSearchIntermediateFragmentNew;
        this.LJLZ = str;
        this.LJLLJ = kdd;
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.mlv);
        this.LJLJI = (TextView) view.findViewById(R.id.mm0);
        this.LJLJJI = (TextView) view.findViewById(R.id.mlx);
        this.LJLJJL = (TextView) view.findViewById(R.id.mlz);
        C51340KCy c51340KCy = (C51340KCy) view.findViewById(R.id.fat);
        this.LJLJJLL = c51340KCy;
        this.LJLJL = (TuxIconView) view.findViewById(R.id.f_o);
        this.LJLJLJ = view.findViewById(R.id.apk);
        this.LJLJLLL = view.findViewById(R.id.f4q);
        this.LJLL = view.findViewById(R.id.bst);
        this.LJLLI = view.findViewById(R.id.nbs);
        this.LJLLL = k75;
        this.LJLLLL = c51261K9x;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        c51340KCy.setImageDrawable(c2068389v.LIZ(view.getContext()));
        c51340KCy.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS26S0101000_8(3, this, 4)));
        c51340KCy.setKeyboardDismissHandler(kdd);
        int i = LLF;
        if (this.LJZI != i) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = i;
            this.LJZI = i;
            this.itemView.setLayoutParams(layoutParams);
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.itemView.getContext());
        if (LJJIFFI != null) {
            this.LLD = (EcSearchSugMobHelper) ViewModelProviders.of(LJJIFFI).get(EcSearchSugMobHelper.class);
        }
    }

    public static C51322KCg M(ViewGroup viewGroup, C51261K9x c51261K9x, KDD kdd, K75 k75, EcAbstractSearchIntermediateFragmentNew ecAbstractSearchIntermediateFragmentNew, String str) {
        View LIZ;
        if (C78840Uwu.LJ(viewGroup.getContext()) != null) {
            InterfaceC45601Hv3 LJ = C78840Uwu.LJ(viewGroup.getContext());
            Objects.requireNonNull(LJ);
            LIZ = LJ.getInflater().LIZ(R.layout.ap0);
        } else {
            LIZ = C28289B8j.LIZ(viewGroup, R.layout.ap0, viewGroup, false);
        }
        return new C51322KCg(LIZ, c51261K9x, kdd, k75, ecAbstractSearchIntermediateFragmentNew, str);
    }
}
