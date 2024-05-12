package com.ss.android.ugc.aweme.base.ui.bottom.banner;

import X.C16880lQ;
import X.C2059186h;
import X.C2068389v;
import X.C32151Nz;
import X.C61593OFh;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O6R;
import X.OM7;
import X.OSZ;
import X.W5F;
import X.W5U;
import Y.IDAListenerS41S0200000_10;
import Y.IDAListenerS78S0100000_10;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedBottomBannerView extends LinearLayout {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public final int LJLIL;
    public final OSZ<Integer, Integer> LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final SmartImageView LJLJJI;
    public InterfaceC88472Yns<? super W5F, C76800UCe> LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxIconView LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public final LinearLayout.LayoutParams LJLL;
    public final FrameLayout LJLLI;
    public FeedBottomBannerConfig.InteractionType LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final ObjectAnimator LJLLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedBottomBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final ValueAnimator getDefaultAnimationAppear() {
        return (ValueAnimator) this.LJLLJ.getValue();
    }

    public final int getBannerHeight() {
        Integer first;
        if (this.LJLJLJ > 1) {
            first = this.LJLILLLLZI.getSecond();
        } else {
            first = this.LJLILLLLZI.getFirst();
        }
        int intValue = first.intValue();
        if (getMeasuredHeight() < this.LJLILLLLZI.getFirst().intValue()) {
            return this.LJLILLLLZI.getFirst().intValue();
        }
        return intValue;
    }

    public final ValueAnimator getDefaultAnimationDisappear() {
        return (ValueAnimator) this.LJLLL.getValue();
    }

    private final void setCurrentMaxLine(int i) {
        if (i == this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = i;
        requestLayout();
    }

    public final void LIZ(LinearLayout.LayoutParams layoutParams) {
        int i = this.LJLIL;
        int marginStart = layoutParams.getMarginStart();
        int marginEnd = layoutParams.getMarginEnd();
        layoutParams.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        layoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
    }

    public final void LIZIZ(AqS160S0100000_10 aqS160S0100000_10) {
        if (this.LJLLILLLL == FeedBottomBannerConfig.InteractionType.BUTTON) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = -getBannerHeight();
                setLayoutParams(layoutParams2);
                getDefaultAnimationAppear().cancel();
                C16880lQ.LJLJL(getDefaultAnimationAppear());
                ValueAnimator defaultAnimatorAppear$lambda$15 = getDefaultAnimationAppear();
                o.LJIIIIZZ(defaultAnimatorAppear$lambda$15, "defaultAnimatorAppear$lambda$15");
                defaultAnimatorAppear$lambda$15.addListener(new IDAListenerS78S0100000_10(aqS160S0100000_10, 2));
                defaultAnimatorAppear$lambda$15.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public final void setIcon(int i) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        this.LJLJI.setTuxIcon(c2068389v);
    }

    public final void setIconType(FeedBottomBannerConfig.IconType iconType) {
        o.LJIIIZ(iconType, "iconType");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        LIZ(layoutParams);
        if (iconType == FeedBottomBannerConfig.IconType.LOCAL) {
            addView(this.LJLJI, 0, layoutParams);
        } else {
            addView(this.LJLJJI, 0, layoutParams);
        }
    }

    public final void setInteractionAction(OM7 action) {
        o.LJIIIZ(action, "action");
        if (action.LIZ()) {
            FrameLayout frameLayout = this.LJLLI;
            LinearLayout.LayoutParams layoutParams = this.LJLL;
            LIZ(layoutParams);
            frameLayout.setLayoutParams(layoutParams);
        }
        this.LJLLI.removeAllViews();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLLI.addView(action.LIZIZ(context));
        if (action instanceof C61593OFh) {
            C61593OFh c61593OFh = (C61593OFh) action;
            if (!c61593OFh.LIZ.isEmpty()) {
                c61593OFh.LIZIZ = new AqS173S0200000_10(this, action, 0);
            }
        }
    }

    public final void setInteractionArea(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLLI.getChildCount() == 0) {
            this.LJLLI.addView(view);
            return;
        }
        ObjectAnimator objectAnimator = this.LJLLLL;
        objectAnimator.setTarget(view);
        objectAnimator.start();
        objectAnimator.addListener(new IDAListenerS78S0100000_10(this, 0));
        objectAnimator.addListener(new IDAListenerS41S0200000_10(this, view, 0));
    }

    public final void setInteractionAreaType(FeedBottomBannerConfig.InteractionType type) {
        o.LJIIIZ(type, "type");
        this.LJLLILLLL = type;
    }

    public final void setLightenBuilder(InterfaceC88472Yns<? super W5F, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.LJLJJL = block;
    }

    public final void setTitle(CharSequence content) {
        o.LJIIIZ(content, "content");
        if (this.LJLJLLL) {
            C2059186h.LIZ(this.LJLJJLL, content);
        } else {
            this.LJLJJLL.setText(content);
        }
    }

    public final void setTitleMaxLines(int i) {
        TuxTextView tuxTextView = this.LJLJJLL;
        setCurrentMaxLine(i);
        tuxTextView.setMaxLines(this.LJLJLJ);
        tuxTextView.setMinTextSize(12.0f);
    }

    public final void setTitleUpdateSync(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setIcon(String url) {
        o.LJIIIZ(url, "url");
        W5F LJIIIIZZ = W5U.LJIIIIZZ(url);
        LJIIIIZZ.LJJIIJ = this.LJLJJI;
        InterfaceC88472Yns<? super W5F, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LJIIIIZZ);
        }
    }

    public final void LIZJ(C2068389v c2068389v, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        this.LJLJL.setTuxIcon(c2068389v);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LJLJL);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer first;
        super.onMeasure(i, i2);
        if (this.LJLJLJ > 1) {
            first = this.LJLILLLLZI.getSecond();
        } else {
            first = this.LJLILLLLZI.getFirst();
        }
        int intValue = first.intValue();
        if (getMeasuredHeight() < this.LJLILLLLZI.getFirst().intValue()) {
            intValue = this.LJLILLLLZI.getFirst().intValue();
        }
        setMeasuredDimension(i, intValue);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeedBottomBannerView(android.content.Context r25, android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
