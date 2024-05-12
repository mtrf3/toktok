package com.bytedance.android.livesdk.widget;

import X.B4S;
import X.BKU;
import X.BKV;
import X.BKW;
import X.BL6;
import X.BZI;
import X.C05040Hs;
import X.C15380j0;
import X.C15580jK;
import X.C15650jR;
import X.C16880lQ;
import X.C221108m2;
import X.C28186B4k;
import X.C28189B4n;
import X.C28787BRn;
import X.C32151Nz;
import X.C47061t0;
import X.C47121t6;
import X.C56K;
import X.C62822Ol8;
import X.C73943T0h;
import X.C78720Uuy;
import X.C80797VnN;
import X.CN1;
import X.KL2;
import X.X1D;
import Y.ARunnableS11S0110000_5;
import Y.ARunnableS41S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RecommendSwipeNewWidget extends LiveRecyclableWidget {
    public C80797VnN LJLIL;
    public View LJLILLLLZI;
    public C47061t0 LJLJI;
    public C47061t0 LJLJJI;
    public LinearLayout LJLJJL;
    public LinearLayout LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public C47121t6 LJLL;
    public LiveIconView LJLLI;
    public LiveIconView LJLLILLLL;
    public RelativeLayout LJLLJ;
    public RelativeLayout LJLLL;
    public C47061t0 LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public float LJZ;
    public float LJZI;
    public float LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public float LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public int LLI;
    public float LLIFFJFJJ;
    public Handler LLIIII;
    public List<String> LLIIIILZ;
    public View LLIIIJ;
    public boolean LLIIIL;
    public ValueAnimator LLIIJI;
    public ValueAnimator LLIIJLIL;
    public String LLIIL;
    public float LJZL = -1.0f;
    public float LLII = 0.5f;
    public final int LLIIIZ = C15380j0.LIZ(28.0f);
    public final C62822Ol8 LLIILII = C221108m2.LIZIZ(C28189B4n.LJLIL);
    public final C62822Ol8 LLIILZL = C221108m2.LIZIZ(C28186B4k.LJLIL);

    public final void LJZ() {
        this.LLFII = false;
        if (this.LJLLL == null || this.LJLLJ == null || this.LJZ < 0.14f || Math.max(LLIIII().getLayoutParams().height, LLII().getLayoutParams().height) < C15380j0.LIZ(40.0f)) {
            return;
        }
        this.LLFII = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.di7;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZI() {
        if (this.LJLJL == null) {
            return;
        }
        int measuredHeight = LJZL().getMeasuredHeight();
        float f = measuredHeight;
        if (Math.abs(this.LL) > f && measuredHeight > 0) {
            int LIZ = C15380j0.LIZ(16.0f);
            int LIZ2 = C15380j0.LIZ(24.0f);
            ViewGroup.LayoutParams layoutParams = LLII().getLayoutParams();
            layoutParams.height = Math.min(C15380j0.LIZ(8.0f) + LIZ2 + LIZ, (int) (Math.abs(this.LL) - f));
            LLII().setLayoutParams(layoutParams);
            LLII().setVisibility(0);
            int i = measuredHeight + LIZ;
            float f2 = i;
            if (Math.abs(this.LL) > f2) {
                LLF().setAlpha(Math.min(1.0f, (((Math.abs(this.LL) - f2) * 1.0f) / LIZ) + 0.2f));
                int i2 = i + LIZ2;
                float f3 = i2;
                if (Math.abs(this.LL) > f3) {
                    ViewGroup.LayoutParams layoutParams2 = LLII().getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.topMargin = (int) Math.min(C15380j0.LIZ(28.0f) * 1.0f, Math.abs(this.LL) - f3);
                    LLII().setLayoutParams(layoutParams3);
                    LL().setAlpha(Math.min(1.0f, (((Math.abs(this.LL) - f3) * 1.0f) / LIZ2) + 0.2f));
                } else {
                    LL().setAlpha(0.0f);
                    ViewGroup.LayoutParams layoutParams4 = LLII().getLayoutParams();
                    o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                    layoutParams5.topMargin = 0;
                    LLII().setLayoutParams(layoutParams5);
                }
                float LIZ3 = C15380j0.LIZ(28.0f) + i2;
                if (Math.abs(this.LL) > LIZ3) {
                    ViewGroup.LayoutParams layoutParams6 = LLF().getLayoutParams();
                    o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                    layoutParams7.topMargin = (int) Math.min(C15380j0.LIZ(8.0f) * 1.0f, Math.abs(this.LL) - LIZ3);
                    LLF().setLayoutParams(layoutParams7);
                } else {
                    ViewGroup.LayoutParams layoutParams8 = LLF().getLayoutParams();
                    o.LJII(layoutParams8, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                    layoutParams9.topMargin = 0;
                    LLF().setLayoutParams(layoutParams9);
                }
                float LIZ4 = C15380j0.LIZ(36.0f) + i2;
                if (Math.abs(this.LL) > LIZ4) {
                    ViewGroup.LayoutParams layoutParams10 = LLFFF().getLayoutParams();
                    o.LJII(layoutParams10, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams10;
                    layoutParams11.bottomMargin = (int) Math.min(C15380j0.LIZ(20.0f) * 1.0f, Math.abs(this.LL) - LIZ4);
                    LLFFF().setLayoutParams(layoutParams11);
                } else {
                    ViewGroup.LayoutParams layoutParams12 = LLFFF().getLayoutParams();
                    o.LJII(layoutParams12, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) layoutParams12;
                    layoutParams13.bottomMargin = C15380j0.LIZ(2.0f);
                    LLFFF().setLayoutParams(layoutParams13);
                }
                if (Math.abs(this.LL) >= C15380j0.LIZ(54.0f) + i2) {
                    this.LLFFF = (C15380j0.LIZ(56.0f) * 1.0f) + LJZL().getMeasuredHeight() + C15380j0.LIZ(16.0f) + C15380j0.LIZ(24.0f);
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams14 = LLII().getLayoutParams();
        layoutParams14.height = 0;
        LLII().setLayoutParams(layoutParams14);
        LLII().setVisibility(8);
        ViewGroup.LayoutParams layoutParams15 = LLF().getLayoutParams();
        o.LJII(layoutParams15, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) layoutParams15;
        layoutParams16.bottomMargin = 0;
        LLF().setLayoutParams(layoutParams16);
        LLF().setAlpha(0.0f);
        LL().setAlpha(0.0f);
    }

    public final C47121t6 LJZL() {
        C47121t6 c47121t6 = this.LJLJL;
        if (c47121t6 != null) {
            return c47121t6;
        }
        o.LJIJI("bottomDescTv");
        throw null;
    }

    public final C47121t6 LL() {
        C47121t6 c47121t6 = this.LJLL;
        if (c47121t6 != null) {
            return c47121t6;
        }
        o.LJIJI("dragDownTv");
        throw null;
    }

    public final LiveIconView LLF() {
        LiveIconView liveIconView = this.LJLLILLLL;
        if (liveIconView != null) {
            return liveIconView;
        }
        o.LJIJI("imageArrowDown");
        throw null;
    }

    public final LiveIconView LLFF() {
        LiveIconView liveIconView = this.LJLLI;
        if (liveIconView != null) {
            return liveIconView;
        }
        o.LJIJI("imageArrowUp");
        throw null;
    }

    public final LinearLayout LLFFF() {
        LinearLayout linearLayout = this.LJLJJL;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("linearBottom");
        throw null;
    }

    public final LinearLayout LLFII() {
        LinearLayout linearLayout = this.LJLJJLL;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("linearTop");
        throw null;
    }

    public final C47061t0 LLFZ() {
        C47061t0 c47061t0 = this.LJLLLL;
        if (c47061t0 != null) {
            return c47061t0;
        }
        o.LJIJI("liveBackgroundView");
        throw null;
    }

    public final RelativeLayout LLII() {
        RelativeLayout relativeLayout = this.LJLLJ;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("relativeBottomView");
        throw null;
    }

    public final RelativeLayout LLIIII() {
        RelativeLayout relativeLayout = this.LJLLL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        o.LJIJI("relativeTopView");
        throw null;
    }

    public final C47121t6 LLIIIILZ() {
        C47121t6 c47121t6 = this.LJLJLLL;
        if (c47121t6 != null) {
            return c47121t6;
        }
        o.LJIJI("swipeUpTv");
        throw null;
    }

    public final int LLIIIJ() {
        int measuredHeight;
        int measuredHeight2;
        if (this.LLF) {
            measuredHeight = LLIIIILZ().getMeasuredHeight() + LLFF().getMeasuredHeight() + C15380j0.LIZ(76.0f);
            measuredHeight2 = LJZL().getMeasuredHeight();
        } else {
            measuredHeight = LL().getMeasuredHeight() + LLF().getMeasuredHeight() + C15380j0.LIZ(76.0f);
            C47121t6 c47121t6 = this.LJLJLJ;
            if (c47121t6 != null) {
                measuredHeight2 = c47121t6.getMeasuredHeight();
            } else {
                o.LJIJI("topDescTv");
                throw null;
            }
        }
        return measuredHeight2 + measuredHeight;
    }

    public final boolean LLIIIL() {
        return ((Boolean) this.LLIILZL.getValue()).booleanValue();
    }

    public final void LLIIJLIL() {
        if (this.LJLLL == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = LLIIII().getLayoutParams();
        layoutParams.height = 0;
        LLIIII().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = LLII().getLayoutParams();
        layoutParams2.height = 0;
        LLIIII().setLayoutParams(layoutParams2);
        LLFF().setAlpha(0.0f);
        LLF().setAlpha(0.0f);
        ViewGroup.LayoutParams layoutParams3 = LLFF().getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = 0;
        LLFF().setLayoutParams(layoutParams4);
        LLIIIILZ().setAlpha(0.0f);
        LL().setAlpha(0.0f);
        ViewGroup.LayoutParams layoutParams5 = LLF().getLayoutParams();
        o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = 0;
        LLF().setLayoutParams(layoutParams6);
    }

    public final void LLIIL() {
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 == null) {
            return;
        }
        int measuredHeight = c47121t6.getMeasuredHeight();
        if (Math.abs(this.LL) > measuredHeight && measuredHeight > 0) {
            int LIZ = C15380j0.LIZ(16.0f);
            int LIZ2 = C15380j0.LIZ(24.0f);
            LLIIII().setVisibility(0);
            ViewGroup.LayoutParams layoutParams = LLIIII().getLayoutParams();
            layoutParams.height = Math.min(C15380j0.LIZ(8.0f) + LIZ2 + LIZ, ((int) Math.abs(this.LL)) - measuredHeight);
            LLIIII().setLayoutParams(layoutParams);
            int i = measuredHeight + LIZ;
            float f = i;
            if (Math.abs(this.LL) > f && i > 0) {
                LLFF().setAlpha(Math.min(1.0f, (((Math.abs(this.LL) - f) * 1.0f) / LIZ) + 0.2f));
                int i2 = i + LIZ2;
                float f2 = i2;
                if (Math.abs(this.LL) > f2) {
                    ViewGroup.LayoutParams layoutParams2 = LLIIII().getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.bottomMargin = (int) Math.min(C15380j0.LIZ(28.0f) * 1.0f, Math.abs(this.LL) - f2);
                    LLIIII().setLayoutParams(layoutParams3);
                    LLIIIILZ().setAlpha(Math.min(1.0f, (((Math.abs(this.LL) - f2) * 1.0f) / LIZ2) + 0.2f));
                } else {
                    ViewGroup.LayoutParams layoutParams4 = LLIIII().getLayoutParams();
                    o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                    layoutParams5.bottomMargin = 0;
                    LLIIII().setLayoutParams(layoutParams5);
                    LLIIIILZ().setAlpha(0.0f);
                }
                float LIZ3 = C15380j0.LIZ(28.0f) + i2;
                if (Math.abs(this.LL) > LIZ3) {
                    ViewGroup.LayoutParams layoutParams6 = LLFF().getLayoutParams();
                    o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                    layoutParams7.bottomMargin = (int) Math.min(C15380j0.LIZ(8.0f) * 1.0f, Math.abs(this.LL) - LIZ3);
                    LLFF().setLayoutParams(layoutParams7);
                } else {
                    ViewGroup.LayoutParams layoutParams8 = LLFF().getLayoutParams();
                    o.LJII(layoutParams8, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                    layoutParams9.bottomMargin = 0;
                    LLFF().setLayoutParams(layoutParams9);
                }
                float LIZ4 = C15380j0.LIZ(36.0f) + i2;
                if (Math.abs(this.LL) > LIZ4) {
                    ViewGroup.LayoutParams layoutParams10 = LLFII().getLayoutParams();
                    o.LJII(layoutParams10, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams10;
                    layoutParams11.topMargin = (int) Math.min(C15380j0.LIZ(20.0f) * 1.0f, Math.abs(this.LL) - LIZ4);
                    LLFII().setLayoutParams(layoutParams11);
                } else {
                    ViewGroup.LayoutParams layoutParams12 = LLFII().getLayoutParams();
                    o.LJII(layoutParams12, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) layoutParams12;
                    layoutParams13.topMargin = C15380j0.LIZ(2.0f);
                    LLFII().setLayoutParams(layoutParams13);
                }
                if (Math.abs(this.LL) >= C15380j0.LIZ(54.0f) + i2) {
                    if (this.LJLJLJ != null) {
                        this.LLFFF = (C15380j0.LIZ(56.0f) * 1.0f) + r0.getMeasuredHeight() + C15380j0.LIZ(16.0f) + C15380j0.LIZ(24.0f);
                        return;
                    }
                    o.LJIJI("topDescTv");
                    throw null;
                }
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams14 = LLIIII().getLayoutParams();
        layoutParams14.height = 0;
        LLIIII().setLayoutParams(layoutParams14);
        LLIIII().setVisibility(8);
        ViewGroup.LayoutParams layoutParams15 = LLFF().getLayoutParams();
        o.LJII(layoutParams15, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) layoutParams15;
        layoutParams16.bottomMargin = 0;
        LLFF().setLayoutParams(layoutParams16);
        LLFF().setAlpha(0.0f);
        LLIIIILZ().setAlpha(0.0f);
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
        C47061t0 c47061t0 = this.LJLJI;
        if (c47061t0 != null) {
            c47061t0.clearAnimation();
        }
        C47061t0 c47061t02 = this.LJLJJI;
        if (c47061t02 != null) {
            c47061t02.clearAnimation();
        }
        Handler handler = this.LLIIII;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LLIIIJ = null;
        ValueAnimator valueAnimator = this.LLIIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLIIJLIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLFFF = 0.0f;
        this.LLFII = false;
    }

    public final void LJLZ(boolean z) {
        String str;
        long j;
        float f;
        float f2;
        View view;
        if (this.LLFZ < 0) {
            return;
        }
        if (!z) {
            LJZ();
        }
        if (this.LJZ >= this.LLII && this.LLFII) {
            if (this.LLF) {
                this.LLFZ++;
            } else {
                this.LLFZ--;
            }
            if (!z && (view = this.LLIIIJ) != null) {
                view.setTranslationY(0.0f);
            }
            C73943T0h.LIZ().LIZIZ(new B4S(this.LLFZ, this.LLF));
            LLIIJI(z, true);
        } else if (this.LLFII && this.LLFFF > 0.0f && Math.abs(this.LL) > this.LLFFF + C15380j0.LIZ(3.0f)) {
            View view2 = getView();
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            float abs = Math.abs(this.LL);
            float f3 = this.LLFFF;
            if (abs > f3 && f3 > 0.0f) {
                ValueAnimator valueAnimator = this.LLIIJLIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.LLIIIL = false;
                float abs2 = Math.abs(this.LL);
                float f4 = this.LLFFF;
                float f5 = abs2 - f4;
                if (f4 > 0.0f) {
                    j = (f5 / f4) * 300;
                } else {
                    j = 0;
                }
                long abs3 = Math.abs(j);
                C56K c56k = new C56K();
                c56k.element = -1.0f;
                float f6 = this.LL;
                if (f6 > 0.0f) {
                    c56k.element = 1.0f;
                }
                C56K c56k2 = new C56K();
                float f7 = this.LLFFF * c56k.element;
                c56k2.element = f7;
                if (z) {
                    this.LLIIJLIL = ValueAnimator.ofFloat(f6, f7);
                } else {
                    boolean z2 = this.LLF;
                    if (z2) {
                        f = (this.LLIFFJFJJ * this.LJZL) + this.LLIIIZ;
                    } else {
                        f = (this.LLIFFJFJJ * this.LJZL) - this.LLIIIZ;
                    }
                    float f8 = f6 + f;
                    if (z2) {
                        f2 = (this.LLIFFJFJJ * this.LJZL) + this.LLIIIZ;
                    } else {
                        f2 = (this.LLIFFJFJJ * this.LJZL) - this.LLIIIZ;
                    }
                    float f9 = f7 + f2;
                    c56k2.element = f9;
                    this.LLIIJLIL = ValueAnimator.ofFloat(f8, f9);
                }
                ValueAnimator valueAnimator2 = this.LLIIJLIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.setDuration(abs3);
                }
                ValueAnimator valueAnimator3 = this.LLIIJLIL;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new BKW(z, this, c56k2, c56k));
                }
                ValueAnimator valueAnimator4 = this.LLIIJLIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        } else if (this.LLFII) {
            View view3 = getView();
            if (view3 != null) {
                view3.setAlpha(1.0f);
            }
            LLIILII(false);
            BKU.LJIIIIZZ = Math.min(this.LL, this.LLI * 1.0f);
            Handler handler = this.LLIIII;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.LLIIII;
            if (handler2 != null) {
                handler2.postDelayed(new ARunnableS11S0110000_5(this, z, 2), 1500L);
            }
            if (z) {
                BZI LIZ = C28787BRn.LIZ("livesdk_end_to_recommend_guide_show");
                if (!this.LLF) {
                    str = "up";
                } else {
                    str = "down";
                }
                LIZ.LJIJJ(str, "draw_action");
                LIZ.LJIILLIIL(this.dataChannel);
                LIZ.LJJIIJZLJL();
            }
        } else {
            View view4 = getView();
            if (view4 != null) {
                view4.setAlpha(1.0f);
            }
            LLIIJI(z, true);
        }
        this.LLD = false;
    }

    public final void LLIILII(boolean z) {
        if (this.LJLL == null || this.LJLJLLL == null) {
            return;
        }
        if (z) {
            LL().setText(C15380j0.LJIILJJIL(R.string.l0f));
            LLIIIILZ().setText(C15380j0.LJIILJJIL(R.string.l0j));
        } else {
            LL().setText(C15380j0.LJIILJJIL(R.string.l_0));
            LLIIIILZ().setText(C15380j0.LJIILJJIL(R.string.l_1));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.fst);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.linear_top_container)");
        this.LJLJJLL = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.fsg);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.linear_bottom_container)");
        this.LJLJJL = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.ln7);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ttlive_bottom_desc_tv)");
        this.LJLJL = (C47121t6) findViewById3;
        View findViewById4 = findViewById(R.id.lsh);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.ttlive_top_desc_tv)");
        this.LJLJLJ = (C47121t6) findViewById4;
        View findViewById5 = findViewById(R.id.kwv);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.swipe_up_tv)");
        this.LJLJLLL = (C47121t6) findViewById5;
        View findViewById6 = findViewById(R.id.cgw);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.drag_down_tv)");
        this.LJLL = (C47121t6) findViewById6;
        View findViewById7 = findViewById(R.id.egq);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.image_arrow_up)");
        this.LJLLI = (LiveIconView) findViewById7;
        View findViewById8 = findViewById(R.id.egp);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.image_arrow_down)");
        this.LJLLILLLL = (LiveIconView) findViewById8;
        View findViewById9 = findViewById(R.id.ius);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.relative_bottom)");
        this.LJLLJ = (RelativeLayout) findViewById9;
        View findViewById10 = findViewById(R.id.iuv);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.relative_top)");
        this.LJLLL = (RelativeLayout) findViewById10;
        View findViewById11 = findViewById(R.id.fv6);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.live_background_view)");
        this.LJLLLL = (C47061t0) findViewById11;
        View findViewById12 = findViewById(R.id.le8);
        o.LJIIIIZZ(findViewById12, "findViewById(R.id.top_bg)");
        this.LJLLLLLL = findViewById12;
        View findViewById13 = findViewById(R.id.aoy);
        o.LJIIIIZZ(findViewById13, "findViewById(R.id.bottom_bg)");
        this.LJLZ = findViewById13;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String packageName;
        IHostAppContext iHostAppContext;
        Context context;
        LLFII().setVisibility(8);
        LLFFF().setVisibility(8);
        LLFZ().setVisibility(8);
        LLIIIILZ().setAlpha(0.0f);
        LL().setAlpha(0.0f);
        this.LLIIII = new Handler(C16880lQ.LLJJJJ());
        this.LLII = RecommendEndAtFollowingSetting.INSTANCE.getValue().recommendDistance;
        if (BKU.LIZLLL()) {
            LJZL().setText(C15380j0.LJIILJJIL(R.string.kxo));
        }
        String str = null;
        String str2 = "";
        if (BL6.LIZIZ(BKU.LIZIZ()) && !TextUtils.isEmpty(this.LLIIL)) {
            C47121t6 LJZL = LJZL();
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.liv);
            if (LJIILJJIL != null) {
                String str3 = this.LLIIL;
                if (str3 == null) {
                    str3 = "";
                }
                str = ujb.o.LJJJJZ(LJIILJJIL, "{gamename}", str3, false);
            }
            LJZL.setText(str);
        }
        if (this.LJLLLL == null) {
            return;
        }
        if (C32151Nz.LJJIIZI(this.LLIIIILZ)) {
            C78720Uuy LIZ = C15650jR.LIZ().LIZ(this.LLIIIILZ);
            LIZ.LIZIZ(KL2.LJIIJJI(getContext()) / KL2.LJIIIZ(getContext()));
            LIZ.LJIIJJI(LLFZ());
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("res://");
        Context context2 = getContext();
        if (context2 != null ? (packageName = context2.getPackageName()) != null : (iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class)) != null && (context = iHostAppContext.context()) != null && (packageName = context.getPackageName()) != null) {
            str2 = packageName;
        }
        LIZ2.append(str2);
        LIZ2.append('/');
        LIZ2.append(R.drawable.cwn);
        C15650jR.LIZ().LIZ(C05040Hs.LIZIZ(X1D.LIZIZ(LIZ2))).LJIIJJI(LLFZ());
    }

    public final void LLIIJI(boolean z, boolean z2) {
        long j;
        float f;
        ValueAnimator valueAnimator = this.LLIIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.LLFFF > 0.0f) {
            j = (Math.abs(this.LL) / this.LLFFF) * 300;
        } else {
            j = 0;
        }
        long abs = Math.abs(j);
        if (abs <= 0 || !z2) {
            if (!z) {
                View view = this.LLIIIJ;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            } else {
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
                if (LLIIIL()) {
                    if (this.LJLILLLLZI != null) {
                        C47061t0 c47061t0 = this.LJLJJI;
                        if (c47061t0 != null) {
                            c47061t0.setTranslationX(0.0f);
                        }
                        C47061t0 c47061t02 = this.LJLJI;
                        if (c47061t02 != null) {
                            ViewGroup.LayoutParams layoutParams = c47061t02.getLayoutParams();
                            layoutParams.width = 0;
                            c47061t02.setLayoutParams(layoutParams);
                        }
                        C47061t0 c47061t03 = this.LJLJJI;
                        if (c47061t03 != null) {
                            ViewGroup.LayoutParams layoutParams2 = c47061t03.getLayoutParams();
                            layoutParams2.width = 0;
                            c47061t03.setLayoutParams(layoutParams2);
                        }
                    }
                    C47061t0 c47061t04 = this.LJLJI;
                    if (c47061t04 != null) {
                        c47061t04.setTranslationY(0.0f);
                    }
                    C47061t0 c47061t05 = this.LJLJI;
                    if (c47061t05 != null) {
                        c47061t05.setScaleY(1.0f);
                    }
                    C47061t0 c47061t06 = this.LJLJJI;
                    if (c47061t06 != null) {
                        c47061t06.setTranslationY(0.0f);
                    }
                    C47061t0 c47061t07 = this.LJLJJI;
                    if (c47061t07 != null) {
                        c47061t07.setScaleY(1.0f);
                    }
                }
            }
            hide();
            LLIIJLIL();
        } else {
            float f2 = this.LL;
            if (z) {
                this.LLIIJI = ValueAnimator.ofFloat(f2, 0.0f);
            } else {
                if (this.LLF) {
                    f = this.LLIIIZ + 0.0f;
                } else {
                    f = 0.0f - this.LLIIIZ;
                }
                this.LLIIJI = ValueAnimator.ofFloat(f2, f);
            }
            ValueAnimator valueAnimator2 = this.LLIIJI;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(abs);
            }
            ValueAnimator valueAnimator3 = this.LLIIJI;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new BKV(this, z));
            }
            ValueAnimator valueAnimator4 = this.LLIIJI;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
        View view5 = this.LJLILLLLZI;
        if (view5 != null) {
            C15580jK.LIZIZ((int) 0.0f, view5);
        }
        this.LLFZ = -1;
        this.LLI = 0;
        this.LL = 0.0f;
        this.LJZI = 0.0f;
        BKU.LJIIIIZZ = 0.0f;
        Handler handler = this.LLIIII;
        if (handler != null) {
            handler.postDelayed(new ARunnableS41S0100000_5(this, 191), 200L);
        }
    }
}
