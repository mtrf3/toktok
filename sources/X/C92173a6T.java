package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import com.ss.android.ugc.aweme.bnpl.network.model.StepItem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a6T, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92173a6T extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJJLL() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dh, context);
        if (LJI != null) {
            _$_findCachedViewById(R.id.h0).setBackgroundColor(LJI.intValue());
        }
        Drawable background = _$_findCachedViewById(R.id.h6).getBackground();
        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        ((GradientDrawable) background).setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context2));
        ((ImageView) _$_findCachedViewById(R.id.h7)).setVisibility(8);
        _$_findCachedViewById(R.id.h9).setVisibility(0);
        Drawable background2 = _$_findCachedViewById(R.id.h_).getBackground();
        o.LJII(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        ((GradientDrawable) background2).setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context3));
        ((ImageView) _$_findCachedViewById(R.id.ha)).setVisibility(8);
        _$_findCachedViewById(R.id.hc).setVisibility(0);
        Drawable background3 = _$_findCachedViewById(R.id.hd).getBackground();
        o.LJII(background3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        ((GradientDrawable) background3).setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context4));
        ((ImageView) _$_findCachedViewById(R.id.he)).setVisibility(8);
        _$_findCachedViewById(R.id.hg).setVisibility(0);
        _$_findCachedViewById(R.id.h1).setVisibility(8);
        _$_findCachedViewById(R.id.h2).setVisibility(8);
        _$_findCachedViewById(R.id.h3).setVisibility(8);
        _$_findCachedViewById(R.id.h4).setVisibility(8);
        _$_findCachedViewById(R.id.h0).getLayoutParams().width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        setTitleColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context5));
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        setSubtitleColor(AnonymousClass636.LJIIIIZZ(R.attr.dl, context6));
    }

    private final void setSubtitleColor(int i) {
        ((TextView) _$_findCachedViewById(R.id.hi)).setTextColor(i);
        ((TextView) _$_findCachedViewById(R.id.hj)).setTextColor(i);
        ((TextView) _$_findCachedViewById(R.id.hk)).setTextColor(i);
    }

    private final void setTitleColor(int i) {
        ((TextView) _$_findCachedViewById(R.id.hm)).setTextColor(i);
        ((TextView) _$_findCachedViewById(R.id.hn)).setTextColor(i);
        ((TextView) _$_findCachedViewById(R.id.ho)).setTextColor(i);
    }

    public final void setStepData(BNPLEntryData data) {
        StepItem stepItem;
        StepItem stepItem2;
        boolean z;
        StepItem stepItem3;
        StepItem stepItem4;
        boolean z2;
        o.LJIIIZ(data, "data");
        List<StepItem> completedStepItems = data.getCompletedStepItems();
        List<StepItem> failedStepItems = data.getFailedStepItems();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.h0);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        _$_findCachedViewById.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.dz, context));
        _$_findCachedViewById(R.id.h0).getLayoutParams().width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        _$_findCachedViewById(R.id.h9).setVisibility(8);
        View bnpl_progress_step1_icon = _$_findCachedViewById(R.id.h6);
        o.LJIIIIZZ(bnpl_progress_step1_icon, "bnpl_progress_step1_icon");
        TuxIconView bnpl_progress_step1_icon_inner = (TuxIconView) _$_findCachedViewById(R.id.h7);
        o.LJIIIIZZ(bnpl_progress_step1_icon_inner, "bnpl_progress_step1_icon_inner");
        LJJZ(bnpl_progress_step1_icon, bnpl_progress_step1_icon_inner);
        Iterator<StepItem> it = completedStepItems.iterator();
        while (true) {
            if (it.hasNext()) {
                stepItem = it.next();
                if (o.LJ(stepItem.getStepCode(), "KYC_INFO_COLLECT")) {
                    break;
                }
            } else {
                stepItem = null;
                break;
            }
        }
        Iterator<StepItem> it2 = failedStepItems.iterator();
        while (true) {
            if (it2.hasNext()) {
                stepItem2 = it2.next();
                if (o.LJ(stepItem2.getStepCode(), "KYC_INFO_COLLECT")) {
                    break;
                }
            } else {
                stepItem2 = null;
                break;
            }
        }
        StepItem stepItem5 = stepItem2;
        if (stepItem == null && stepItem5 == null) {
            z = true;
        } else {
            z = false;
        }
        if (stepItem != null) {
            _$_findCachedViewById(R.id.hc).setVisibility(8);
            View bnpl_progress_step2_icon = _$_findCachedViewById(R.id.h_);
            o.LJIIIIZZ(bnpl_progress_step2_icon, "bnpl_progress_step2_icon");
            TuxIconView bnpl_progress_step2_icon_inner = (TuxIconView) _$_findCachedViewById(R.id.ha);
            o.LJIIIIZZ(bnpl_progress_step2_icon_inner, "bnpl_progress_step2_icon_inner");
            LJJZ(bnpl_progress_step2_icon, bnpl_progress_step2_icon_inner);
        } else if (stepItem5 != null) {
            _$_findCachedViewById(R.id.hc).setVisibility(8);
            View bnpl_progress_step2_icon2 = _$_findCachedViewById(R.id.h_);
            o.LJIIIIZZ(bnpl_progress_step2_icon2, "bnpl_progress_step2_icon");
            TuxIconView bnpl_progress_step2_icon_inner2 = (TuxIconView) _$_findCachedViewById(R.id.ha);
            o.LJIIIIZZ(bnpl_progress_step2_icon_inner2, "bnpl_progress_step2_icon_inner");
            LJJLJLI(bnpl_progress_step2_icon2, bnpl_progress_step2_icon_inner2);
            ((TuxTextView) _$_findCachedViewById(R.id.hj)).setTextColorRes(R.attr.e7);
            ((TextView) _$_findCachedViewById(R.id.hj)).setText(stepItem5.getErrorContent());
        } else {
            View bnpl_progress_step2_icon3 = _$_findCachedViewById(R.id.h_);
            o.LJIIIIZZ(bnpl_progress_step2_icon3, "bnpl_progress_step2_icon");
            View bnpl_progress_step2_text_inner = _$_findCachedViewById(R.id.hc);
            o.LJIIIIZZ(bnpl_progress_step2_text_inner, "bnpl_progress_step2_text_inner");
            ImageView bnpl_progress_step2_icon_inner3 = (ImageView) _$_findCachedViewById(R.id.ha);
            o.LJIIIIZZ(bnpl_progress_step2_icon_inner3, "bnpl_progress_step2_icon_inner");
            bnpl_progress_step2_icon3.setBackgroundResource(R.drawable.i4);
            bnpl_progress_step2_text_inner.setVisibility(0);
            bnpl_progress_step2_icon_inner3.setVisibility(8);
        }
        if (z) {
            _$_findCachedViewById(R.id.h1).setVisibility(8);
            _$_findCachedViewById(R.id.h2).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.h1).setVisibility(0);
            _$_findCachedViewById(R.id.h2).setVisibility(8);
        }
        Iterator<StepItem> it3 = completedStepItems.iterator();
        while (true) {
            if (it3.hasNext()) {
                stepItem3 = it3.next();
                if (o.LJ(stepItem3.getStepCode(), "PERSONAL_INFO_COLLECT")) {
                    break;
                }
            } else {
                stepItem3 = null;
                break;
            }
        }
        Iterator<StepItem> it4 = failedStepItems.iterator();
        while (true) {
            if (it4.hasNext()) {
                stepItem4 = it4.next();
                if (o.LJ(stepItem4.getStepCode(), "PERSONAL_INFO_COLLECT")) {
                    break;
                }
            } else {
                stepItem4 = null;
                break;
            }
        }
        StepItem stepItem6 = stepItem4;
        if (stepItem3 == null && stepItem6 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (stepItem3 != null) {
            _$_findCachedViewById(R.id.hg).setVisibility(8);
            View bnpl_progress_step3_icon = _$_findCachedViewById(R.id.hd);
            o.LJIIIIZZ(bnpl_progress_step3_icon, "bnpl_progress_step3_icon");
            TuxIconView bnpl_progress_step3_icon_inner = (TuxIconView) _$_findCachedViewById(R.id.he);
            o.LJIIIIZZ(bnpl_progress_step3_icon_inner, "bnpl_progress_step3_icon_inner");
            LJJZ(bnpl_progress_step3_icon, bnpl_progress_step3_icon_inner);
        } else if (stepItem6 != null) {
            _$_findCachedViewById(R.id.hg).setVisibility(8);
            View bnpl_progress_step3_icon2 = _$_findCachedViewById(R.id.hd);
            o.LJIIIIZZ(bnpl_progress_step3_icon2, "bnpl_progress_step3_icon");
            TuxIconView bnpl_progress_step3_icon_inner2 = (TuxIconView) _$_findCachedViewById(R.id.he);
            o.LJIIIIZZ(bnpl_progress_step3_icon_inner2, "bnpl_progress_step3_icon_inner");
            LJJLJLI(bnpl_progress_step3_icon2, bnpl_progress_step3_icon_inner2);
            ((TuxTextView) _$_findCachedViewById(R.id.hk)).setTextColorRes(R.attr.e7);
            ((TextView) _$_findCachedViewById(R.id.hk)).setText(stepItem6.getErrorContent());
        } else {
            View bnpl_progress_step3_icon3 = _$_findCachedViewById(R.id.hd);
            o.LJIIIIZZ(bnpl_progress_step3_icon3, "bnpl_progress_step3_icon");
            View bnpl_progress_step3_text_inner = _$_findCachedViewById(R.id.hg);
            o.LJIIIIZZ(bnpl_progress_step3_text_inner, "bnpl_progress_step3_text_inner");
            ImageView bnpl_progress_step3_icon_inner3 = (ImageView) _$_findCachedViewById(R.id.he);
            o.LJIIIIZZ(bnpl_progress_step3_icon_inner3, "bnpl_progress_step3_icon_inner");
            bnpl_progress_step3_icon3.setBackgroundResource(R.drawable.i4);
            bnpl_progress_step3_text_inner.setVisibility(0);
            bnpl_progress_step3_icon_inner3.setVisibility(8);
        }
        if (z && z2) {
            _$_findCachedViewById(R.id.h3).setVisibility(8);
            _$_findCachedViewById(R.id.h4).setVisibility(8);
            return;
        }
        if (stepItem != null && z2) {
            _$_findCachedViewById(R.id.h3).setVisibility(8);
            _$_findCachedViewById(R.id.h4).setVisibility(0);
            return;
        }
        if (stepItem5 != null) {
            if (stepItem3 != null) {
                _$_findCachedViewById(R.id.h3).setVisibility(0);
                _$_findCachedViewById(R.id.h4).setVisibility(8);
                return;
            } else if (stepItem6 != null) {
                _$_findCachedViewById(R.id.h3).setVisibility(0);
                _$_findCachedViewById(R.id.h4).setVisibility(8);
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                Integer LJI = C79045V0n.LJI(R.attr.e7, context2);
                if (LJI == null) {
                    return;
                }
                _$_findCachedViewById(R.id.h3).setBackgroundColor(LJI.intValue());
                return;
            }
        }
        if (stepItem == null || stepItem6 == null) {
            return;
        }
        _$_findCachedViewById(R.id.h3).setVisibility(0);
        _$_findCachedViewById(R.id.h4).setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92173a6T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLIL = new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ae, this, true);
    }

    public final void LJJLJLI(View view, TuxIconView tuxIconView) {
        Drawable background = view.getBackground();
        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        ((GradientDrawable) background).setColor(AnonymousClass636.LJIIIIZZ(R.attr.e7, context));
        tuxIconView.setVisibility(0);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        tuxIconView.setTuxIcon(c2068389v);
    }

    public final void LJJZ(View view, TuxIconView tuxIconView) {
        Drawable background = view.getBackground();
        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        ((GradientDrawable) background).setColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context));
        tuxIconView.setVisibility(0);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_tick_fill_small;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        tuxIconView.setTuxIcon(c2068389v);
    }
}
