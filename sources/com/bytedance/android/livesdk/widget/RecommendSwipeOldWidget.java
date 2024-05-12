package com.bytedance.android.livesdk.widget;

import X.BKU;
import X.C15380j0;
import X.C15580jK;
import X.C16880lQ;
import X.C221108m2;
import X.C28187B4l;
import X.C28188B4m;
import X.C47061t0;
import X.C47121t6;
import X.C62822Ol8;
import X.C80797VnN;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RecommendSwipeOldWidget extends LiveRecyclableWidget {
    public C80797VnN LJLIL;
    public View LJLILLLLZI;
    public LinearLayout LJLJI;
    public LinearLayout LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public RelativeLayout LJLLI;
    public RelativeLayout LJLLILLLL;
    public C47061t0 LJLLJ;
    public C47061t0 LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public boolean LLFII;
    public Handler LLFZ;
    public ValueAnimator LLI;
    public boolean LLIFFJFJJ;
    public float LLII;
    public float LJLZ = -1.0f;
    public float LLFFF = 0.5f;
    public final C62822Ol8 LLIIII = C221108m2.LIZIZ(C28187B4l.LJLIL);
    public final C62822Ol8 LLIIIILZ = C221108m2.LIZIZ(C28188B4m.LJLIL);

    public final void LJLZ() {
        this.LLIFFJFJJ = false;
        if (this.LJLLILLLL == null || this.LJLLI == null || this.LJLLLL < 0.14f || Math.max(LLF().getMeasuredHeight(), LL().getMeasuredHeight()) < C15380j0.LIZ(40.0f)) {
            return;
        }
        this.LLIFFJFJJ = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.di6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C47121t6 LJZ() {
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 != null) {
            return c47121t6;
        }
        o.LJIJI("dragDownTv");
        throw null;
    }

    public final TuxIconView LJZI() {
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("imageArrowDown");
        throw null;
    }

    public final TuxIconView LJZL() {
        TuxIconView tuxIconView = this.LJLJLLL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("imageArrowUp");
        throw null;
    }

    public final RelativeLayout LL() {
        RelativeLayout relativeLayout = this.LJLLI;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("relativeBottomView");
        throw null;
    }

    public final RelativeLayout LLF() {
        RelativeLayout relativeLayout = this.LJLLILLLL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("relativeTopView");
        throw null;
    }

    public final C47121t6 LLFF() {
        C47121t6 c47121t6 = this.LJLJL;
        if (c47121t6 != null) {
            return c47121t6;
        }
        o.LJIJI("swipeUpTv");
        throw null;
    }

    public final int LLFFF() {
        int measuredHeight;
        int measuredHeight2;
        if (this.LJZL) {
            measuredHeight = LLFF().getMeasuredHeight() + LJZL().getMeasuredHeight() + C15380j0.LIZ(76.0f);
            C47121t6 c47121t6 = this.LJLJJL;
            if (c47121t6 != null) {
                measuredHeight2 = c47121t6.getMeasuredHeight();
            } else {
                o.LJIJI("bottomDescTv");
                throw null;
            }
        } else {
            measuredHeight = LJZ().getMeasuredHeight() + LJZI().getMeasuredHeight() + C15380j0.LIZ(76.0f);
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                measuredHeight2 = c47121t62.getMeasuredHeight();
            } else {
                o.LJIJI("topDescTv");
                throw null;
            }
        }
        return measuredHeight2 + measuredHeight;
    }

    public final boolean LLFII() {
        return ((Boolean) this.LLIIII.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.clearAnimation();
        }
        Handler handler = this.LLFZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.LLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void LLFZ(boolean z) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.LLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LJLILLLLZI;
        if (view != null) {
            f = view.getTranslationY();
        } else {
            f = 0.0f;
        }
        int i = this.LLF;
        if (i > 0) {
            j = (f / i) * 300;
        } else {
            j = 0;
        }
        long abs = Math.abs(j);
        if (abs <= 0 || !z) {
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                view3.setScaleX(1.0f);
            }
            View view4 = this.LJLILLLLZI;
            if (view4 != null) {
                view4.setScaleY(1.0f);
            }
            if (LLFII()) {
                if (this.LJLILLLLZI != null) {
                    C47061t0 c47061t0 = this.LJLLL;
                    if (c47061t0 != null) {
                        c47061t0.setTranslationX(0.0f);
                    }
                    C47061t0 c47061t02 = this.LJLLJ;
                    if (c47061t02 != null) {
                        ViewGroup.LayoutParams layoutParams = c47061t02.getLayoutParams();
                        layoutParams.width = 0;
                        c47061t02.setLayoutParams(layoutParams);
                    }
                    C47061t0 c47061t03 = this.LJLLL;
                    if (c47061t03 != null) {
                        ViewGroup.LayoutParams layoutParams2 = c47061t03.getLayoutParams();
                        layoutParams2.width = 0;
                        c47061t03.setLayoutParams(layoutParams2);
                    }
                }
                C47061t0 c47061t04 = this.LJLLJ;
                if (c47061t04 != null) {
                    c47061t04.setTranslationY(0.0f);
                }
                C47061t0 c47061t05 = this.LJLLJ;
                if (c47061t05 != null) {
                    c47061t05.setScaleY(1.0f);
                }
                C47061t0 c47061t06 = this.LJLLL;
                if (c47061t06 != null) {
                    c47061t06.setTranslationY(0.0f);
                }
                C47061t0 c47061t07 = this.LJLLL;
                if (c47061t07 != null) {
                    c47061t07.setScaleY(1.0f);
                }
            }
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            this.LLI = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(abs);
            }
            ValueAnimator valueAnimator2 = this.LLI;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS94S0100000_5(this, 22));
            }
            ValueAnimator valueAnimator3 = this.LLI;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
        if (this.LJLJL != null) {
            LLFF().setAlpha(0.0f);
        }
        if (this.LJLJLJ != null) {
            LJZ().setAlpha(0.0f);
        }
        View view5 = this.LJLILLLLZI;
        if (view5 != null) {
            C15580jK.LIZIZ((int) 0.0f, view5);
        }
        hide();
        this.LLD = -1;
        this.LLF = 0;
        this.LJZ = 0.0f;
        this.LJLLLLLL = 0.0f;
        BKU.LJIIIIZZ = 0.0f;
        Handler handler = this.LLFZ;
        if (handler != null) {
            handler.postDelayed(new ARunnableS41S0100000_5(this, 192), 200L);
        }
    }

    public final void LLII(boolean z) {
        if (this.LJLJLJ == null || this.LJLJL == null) {
            return;
        }
        if (z) {
            LJZ().setText(C15380j0.LJIILJJIL(R.string.l0f));
            LLFF().setText(C15380j0.LJIILJJIL(R.string.l0j));
        } else {
            LJZ().setText(C15380j0.LJIILJJIL(R.string.l_0));
            LLFF().setText(C15380j0.LJIILJJIL(R.string.l_1));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.fst);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.linear_top_container)");
        this.LJLJJI = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.fsg);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.linear_bottom_container)");
        this.LJLJI = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.ln7);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ttlive_bottom_desc_tv)");
        this.LJLJJL = (C47121t6) findViewById3;
        View findViewById4 = findViewById(R.id.lsh);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.ttlive_top_desc_tv)");
        this.LJLJJLL = (C47121t6) findViewById4;
        View findViewById5 = findViewById(R.id.kwv);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.swipe_up_tv)");
        this.LJLJL = (C47121t6) findViewById5;
        View findViewById6 = findViewById(R.id.cgw);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.drag_down_tv)");
        this.LJLJLJ = (C47121t6) findViewById6;
        View findViewById7 = findViewById(R.id.egq);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.image_arrow_up)");
        this.LJLJLLL = (TuxIconView) findViewById7;
        View findViewById8 = findViewById(R.id.egp);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.image_arrow_down)");
        this.LJLL = (TuxIconView) findViewById8;
        View findViewById9 = findViewById(R.id.ius);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.relative_bottom)");
        this.LJLLI = (RelativeLayout) findViewById9;
        View findViewById10 = findViewById(R.id.iuv);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.relative_top)");
        this.LJLLILLLL = (RelativeLayout) findViewById10;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                LLFF().setAlpha(0.0f);
                LJZ().setAlpha(0.0f);
                this.LLFZ = new Handler(C16880lQ.LLJJJJ());
                RecommendEndAtFollowingSetting recommendEndAtFollowingSetting = RecommendEndAtFollowingSetting.INSTANCE;
                this.LLFFF = recommendEndAtFollowingSetting.getValue().recommendDistance;
                this.LLFII = recommendEndAtFollowingSetting.getValue().delayHideGuide;
                if (BKU.LIZLLL()) {
                    C47121t6 c47121t6 = this.LJLJJL;
                    if (c47121t6 != null) {
                        c47121t6.setText(C15380j0.LJIILJJIL(R.string.kxo));
                        return;
                    } else {
                        o.LJIJI("bottomDescTv");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("linearBottom");
            throw null;
        }
        o.LJIJI("linearTop");
        throw null;
    }
}
