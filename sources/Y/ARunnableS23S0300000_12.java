package Y;

import X.C00F;
import X.C119774mz;
import X.C123674tH;
import X.C16530kr;
import X.C16880lQ;
import X.C188727au;
import X.C39468FeK;
import X.C45804HyK;
import X.C55953Lxd;
import X.C70676RoW;
import X.C70677RoX;
import X.C70759Rpr;
import X.C71065Run;
import X.C71076Ruy;
import X.C71079Rv1;
import X.C71361RzZ;
import X.C71395S0h;
import X.C74065T4z;
import X.C74199TAd;
import X.C74206TAk;
import X.C74391THn;
import X.C76542zS;
import X.C76602zY;
import X.C78866UxK;
import X.C92013jJ;
import X.ED2;
import X.ES4;
import X.EnumC44267HYx;
import X.InterfaceC46204IBk;
import X.InterfaceC74398THu;
import X.OUP;
import X.S09;
import X.S1E;
import X.S1F;
import X.S1G;
import X.S1T;
import X.S1U;
import X.TE8;
import X.TEZ;
import X.TF5;
import X.TGH;
import X.TIF;
import X.ViewTreeObserverOnPreDrawListenerC70854RrO;
import X.W5F;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.vm.DefaultFeedEcCardBizVM;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS23S0300000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$1() {
        int i;
        int i2;
        int i3;
        int i4;
        ShopWindowExtraModel shopWindowExtraModel;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((S09) this.l1).LIZ(R.id.a3m).measure(makeMeasureSpec, makeMeasureSpec2);
        ((S09) this.l1).LIZ(R.id.a3n).measure(makeMeasureSpec, makeMeasureSpec2);
        ((S09) this.l1).LIZ(R.id.a3l).measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = ((S09) this.l1).LIZ(R.id.a3n).getMeasuredHeight();
        int width = ((S09) this.l1).LIZ(R.id.a3l).getWidth() + ((S09) this.l1).LIZ(R.id.a3n).getMeasuredWidth();
        View anchor_privilege_div = ((S09) this.l1).LIZ(R.id.a3l);
        o.LJIIIIZZ(anchor_privilege_div, "anchor_privilege_div");
        ViewGroup.LayoutParams layoutParams = anchor_privilege_div.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        int i5 = width + i;
        View anchor_privilege_div2 = ((S09) this.l1).LIZ(R.id.a3l);
        o.LJIIIIZZ(anchor_privilege_div2, "anchor_privilege_div");
        ViewGroup.LayoutParams layoutParams2 = anchor_privilege_div2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            i2 = 0;
        }
        int measuredWidth = ((S09) this.l1).LIZ(R.id.a3m).getMeasuredWidth() + i5 + i2;
        View anchor_promotion_flow = ((S09) this.l1).LIZ(R.id.a3s);
        o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
        ViewGroup.LayoutParams layoutParams3 = anchor_promotion_flow.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i3 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i3 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(266L);
        ofFloat.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat.addUpdateListener(new AUListenerS9S0102000_12((S09) this.l1, measuredHeight, measuredWidth + i3, 1));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((S09) this.l1).LIZ(R.id.a3s), "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(266L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(((S09) this.l1).LIZ(R.id.a2b), "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(150L);
        ofFloat3.setInterpolator(C55953Lxd.LIZLLL());
        ValueAnimator ofInt = ValueAnimator.ofInt(C45804HyK.LJJI(20), C45804HyK.LJJI(31));
        ofInt.setDuration(166L);
        ofInt.setStartDelay(100L);
        ofInt.setInterpolator(C55953Lxd.LIZLLL());
        ofInt.addUpdateListener(new AUListenerS72S0101000_12(makeMeasureSpec2, (S09) this.l1, 2));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(((S09) this.l1).LIZ(R.id.a2a), "alpha", 0.85f, 1.0f);
        ofFloat4.setStartDelay(100L);
        ofFloat4.setDuration(166L);
        ofFloat4.setInterpolator(C55953Lxd.LIZLLL());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setStartOffset(166L);
        alphaAnimation.setInterpolator(C55953Lxd.LIZLLL());
        ((S09) this.l1).LIZ(R.id.a1y).setAnimation(alphaAnimation);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofInt);
        animatorSet.addListener(new IDAListenerS79S0100000_12((S09) this.l1, 8));
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) this.l2;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            C71361RzZ.LIZ.getClass();
            W5F LIZLLL = C70759Rpr.LIZLLL(C71361RzZ.LJJIJLIJ(shopWindowExtraModel, 0));
            S09 s09 = (S09) this.l1;
            i4 = R.id.a2a;
            LIZLLL.LJJIIJ = (SmartImageView) s09.LIZ(R.id.a2a);
            C16880lQ.LLJJJ(LIZLLL);
        } else {
            i4 = R.id.a2a;
        }
        ((S09) this.l1).LIZ(i4).setAlpha(0.0f);
        View anchor_img_cover = ((S09) this.l1).LIZ(i4);
        o.LJIIIIZZ(anchor_img_cover, "anchor_img_cover");
        OUP.LJJLIIIJ(anchor_img_cover);
        S09 s092 = (S09) this.l1;
        C71395S0h.LIZ.getClass();
        s092.LIZIZ(C71395S0h.LIZIZ());
        animatorSet.start();
        ((S09) this.l1).LJLJJL = animatorSet;
    }

    public final void LIZ$2() {
        List<String> list;
        String str;
        FeedEcCardConfig feedEcCardConfig;
        FeedEcCardStyle feedEcCardStyle;
        List<String> list2;
        FeedEcCardConfig feedEcCardConfig2;
        List<String> list3;
        C71076Ruy c71076Ruy = ((DefaultFeedEcCardBizView) this.l0).LJLJJI;
        FeedEcCardConfig feedEcCardConfig3 = null;
        if (c71076Ruy != null) {
            list = c71076Ruy.LJFF;
        } else {
            list = null;
        }
        if (c71076Ruy != null) {
            str = c71076Ruy.LJI;
        } else {
            str = null;
        }
        String LIZ = ED2.LIZ(str);
        boolean z = ((DefaultFeedEcCardBizView) this.l0).LJLJL;
        Aweme aweme = (Aweme) this.l1;
        FeedEcCardData feedEcCardData = (FeedEcCardData) this.l2;
        if (feedEcCardData != null) {
            feedEcCardConfig = feedEcCardData.getCardConfig();
        } else {
            feedEcCardConfig = null;
        }
        FeedEcCardData feedEcCardData2 = (FeedEcCardData) this.l2;
        if (feedEcCardData2 != null) {
            feedEcCardStyle = feedEcCardData2.getCardStyle();
        } else {
            feedEcCardStyle = null;
        }
        C76542zS.LIZ("tiktokec_card_show", C71065Run.LJIIIIZZ(list, LIZ, z, aweme, feedEcCardConfig, feedEcCardStyle));
        DefaultFeedEcCardBizView defaultFeedEcCardBizView = (DefaultFeedEcCardBizView) this.l0;
        C71076Ruy c71076Ruy2 = defaultFeedEcCardBizView.LJLJJI;
        if (c71076Ruy2 != null) {
            list2 = c71076Ruy2.LJFF;
        } else {
            list2 = null;
        }
        boolean z2 = defaultFeedEcCardBizView.LJLJL;
        Aweme aweme2 = (Aweme) this.l1;
        FeedEcCardData feedEcCardData3 = (FeedEcCardData) this.l2;
        if (feedEcCardData3 != null) {
            feedEcCardConfig2 = feedEcCardData3.getCardConfig();
        } else {
            feedEcCardConfig2 = null;
        }
        C76542zS.LIZ("tiktokec_button_show", C71065Run.LJII(list2, z2, aweme2, feedEcCardConfig2, "no_interest"));
        DefaultFeedEcCardBizView defaultFeedEcCardBizView2 = (DefaultFeedEcCardBizView) this.l0;
        C71076Ruy c71076Ruy3 = defaultFeedEcCardBizView2.LJLJJI;
        if (c71076Ruy3 != null) {
            list3 = c71076Ruy3.LJFF;
        } else {
            list3 = null;
        }
        boolean z3 = defaultFeedEcCardBizView2.LJLJL;
        Aweme aweme3 = (Aweme) this.l1;
        FeedEcCardData feedEcCardData4 = (FeedEcCardData) this.l2;
        if (feedEcCardData4 != null) {
            feedEcCardConfig3 = feedEcCardData4.getCardConfig();
        }
        C76542zS.LIZ("tiktokec_button_show", C71065Run.LJII(list3, z3, aweme3, feedEcCardConfig3, "see_more"));
        C76602zY.LIZJ(0, true, 1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        S1E s1e = (S1E) this.l0;
        if (!((S1T) s1e).LJLLI) {
            String LIZ = s1e.LIZ();
            TextView LJIIIIZZ = ((S1F) this.l1).LJIIIIZZ();
            S1U s1u = ((S1T) ((S1E) this.l0)).LJLJLLL;
            if (s1u != null) {
                str = s1u.LIZJ();
            } else {
                str = null;
            }
            C92013jJ.LIZ(LIZ, LJIIIIZZ, str, ((S1F) this.l1).LJI(), false, new S1G((C188727au) this.l2, (S1F) this.l1, (S1E) this.l0));
            return;
        }
        s1e.LJ((C188727au) this.l2);
    }

    public final void LIZ$3() {
        TGH tgh;
        int intValue = ((Integer) this.l2).intValue() + (((EffectTemplateCategoryFragment) this.l0).LJZI.getItemCount() - ((List) this.l1).size());
        Effect effect = (Effect) ListProtector.get((List) this.l1, ((Integer) this.l2).intValue());
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) this.l0;
        RecyclerView recyclerView = effectTemplateCategoryFragment.LJLLL;
        if (recyclerView != null) {
            recyclerView.LJLI(intValue);
            TEZ tez = effectTemplateCategoryFragment.LJLJL;
            if (tez != null) {
                if (C78866UxK.LJJJJZI(tez, effect) && (effect instanceof DraftEffect)) {
                    TF5 tf5 = effectTemplateCategoryFragment.LJLJLLL;
                    if (tf5 != null) {
                        InterfaceC46204IBk interfaceC46204IBk = tf5.LIZIZ;
                        EnumC44267HYx requestSource = EnumC44267HYx.UI_CLICK;
                        o.LJIIIZ(requestSource, "requestSource");
                        interfaceC46204IBk.LIZJ(new TIF(effect, intValue, requestSource, null));
                    } else {
                        o.LJIJI("requiredDependency");
                        throw null;
                    }
                }
                effectTemplateCategoryFragment.Gl().fX(new TE8(effect, intValue, effectTemplateCategoryFragment.LJLJJLL, false, false, null, null, null, null, 1016));
                if (C00F.LIZ(31744, 0, "ame_drop_submit_page", true) == 2 && ES4.LIZ() && (tgh = effectTemplateCategoryFragment.LJLJI) != null) {
                    tgh.hide();
                    return;
                }
                return;
            }
            o.LJIJI("stickerDataManager");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final void LIZ$4() {
        C123674tH c123674tH;
        int i;
        int height = ((C74065T4z) this.l0).LJFF().getHeight();
        TextView LJFF = ((C74065T4z) this.l0).LJFF();
        SpannableString text = (SpannableString) this.l1;
        o.LJIIIZ(text, "text");
        if (LJFF.getWidth() <= 0) {
            c123674tH = new C123674tH(0);
        } else {
            DmtTextView dmtTextView = new DmtTextView(LJFF.getContext(), null);
            dmtTextView.setTextSize(0, LJFF.getTextSize());
            dmtTextView.setLineSpacing(LJFF.getLineSpacingExtra(), LJFF.getLineSpacingMultiplier());
            dmtTextView.setTypeface(LJFF.getTypeface());
            dmtTextView.setIncludeFontPadding(LJFF.getIncludeFontPadding());
            dmtTextView.setText(text);
            dmtTextView.measure(View.MeasureSpec.makeMeasureSpec(LJFF.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            c123674tH = new C123674tH(Integer.valueOf(dmtTextView.getMeasuredWidth()), Integer.valueOf(dmtTextView.getMeasuredHeight()), Integer.valueOf(dmtTextView.getLineCount()));
        }
        Integer num = c123674tH.LIZIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = height;
        }
        if (height == i) {
            ((C74065T4z) this.l0).LJFF().setText((SpannableString) this.l1);
            ((C74065T4z) this.l0).LJ().setVisibility(8);
            ((C74065T4z) this.l0).LIZLLL().setVisibility(8);
        } else {
            ((C74065T4z) this.l0).LIZLLL().setSelected(true);
            C16880lQ.LJIILLIIL(((C74065T4z) this.l0).LIZLLL(), new ACListenerS37S0300000_12((SpannableString) this.l2, (C74065T4z) this.l0, (SpannableString) this.l1, 11));
        }
    }

    public final void LIZ$5() {
        if (C00F.LIZ(31744, 0, "ttec_new_review_UI", true) != 0) {
            ReviewCellViewHolder reviewCellViewHolder = (ReviewCellViewHolder) this.l0;
            C70676RoW c70676RoW = (C70676RoW) ((View) this.l1).findViewById(R.id.j0z);
            o.LJIIIIZZ(c70676RoW, "it.review_item_image_group");
            reviewCellViewHolder.M(c70676RoW, (C70677RoX) this.l2, false);
            return;
        }
        ReviewCellViewHolder reviewCellViewHolder2 = (ReviewCellViewHolder) this.l0;
        C119774mz c119774mz = (C119774mz) ((View) this.l1).findViewById(R.id.j16);
        o.LJIIIIZZ(c119774mz, "it.review_pics");
        reviewCellViewHolder2.L(c119774mz, (C70677RoX) this.l2, false);
    }

    public static final void run$0(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            aRunnableS23S0300000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            aRunnableS23S0300000_12.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            ((C74391THn) aRunnableS23S0300000_12.l0).LIZIZ((Effect) aRunnableS23S0300000_12.l1, (InterfaceC74398THu) aRunnableS23S0300000_12.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            aRunnableS23S0300000_12.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        PageSourceInfo pageSourceInfo;
        boolean LIZ;
        try {
            pageSourceInfo = C39468FeK.LIZJ();
        } catch (Throwable unused) {
            pageSourceInfo = null;
        }
        try {
            Aweme aweme = (Aweme) aRunnableS23S0300000_12.l0;
            FeedEcCardData feedEcCardData = (FeedEcCardData) aRunnableS23S0300000_12.l1;
            C71079Rv1.LIZ(aweme, feedEcCardData, pageSourceInfo, new AqS116S0300000_12(aweme, feedEcCardData, (DefaultFeedEcCardBizVM) aRunnableS23S0300000_12.l2, 36));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            aRunnableS23S0300000_12.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            aRunnableS23S0300000_12.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            C74199TAd c74199TAd = ((PollDetailFragment) aRunnableS23S0300000_12.l0).LJLJL;
            if (c74199TAd != null) {
                C74206TAk c74206TAk = (C74206TAk) aRunnableS23S0300000_12.l1;
                o.LJIIIZ(c74206TAk, "<set-?>");
                c74199TAd.LJFF = c74206TAk;
            }
            ((PollDetailFragment) aRunnableS23S0300000_12.l0).J5((List) aRunnableS23S0300000_12.l2, ((C74206TAk) aRunnableS23S0300000_12.l1).LIZIZ);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            ((View) aRunnableS23S0300000_12.l0).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserverOnPreDrawListenerC70854RrO) aRunnableS23S0300000_12.l1);
            ((View) aRunnableS23S0300000_12.l0).getViewTreeObserver().removeOnGlobalLayoutListener((IDLListenerS62S0200000_12) aRunnableS23S0300000_12.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS23S0300000_12 aRunnableS23S0300000_12) {
        boolean LIZ;
        try {
            aRunnableS23S0300000_12.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS23S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
