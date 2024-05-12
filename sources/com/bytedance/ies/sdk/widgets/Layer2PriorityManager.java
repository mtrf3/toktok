package com.bytedance.ies.sdk.widgets;

import X.AbstractC73672Svk;
import X.BTJ;
import X.C18950ol;
import X.C48339Iy7;
import X.C73969T1h;
import X.C76732zl;
import X.InterfaceC64592gB;
import X.T16;
import X.X1D;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class Layer2PriorityManager {
    public boolean animationEnable;
    public Data donationSticker;
    public boolean firstScreenDone;
    public final Fragment fragment;
    public Data hashTag;
    public Data rankEntrance;

    /* loaded from: classes6.dex */
    public static final class Data {
        public boolean show;
        public ILayer2PriorityWidget widget;

        public static /* synthetic */ Data copy$default(Data data, ILayer2PriorityWidget iLayer2PriorityWidget, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                iLayer2PriorityWidget = data.widget;
            }
            if ((i & 2) != 0) {
                z = data.show;
            }
            return data.copy(iLayer2PriorityWidget, z);
        }

        public final Data copy(ILayer2PriorityWidget iLayer2PriorityWidget, boolean z) {
            return new Data(iLayer2PriorityWidget, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.widget, data.widget) && this.show == data.show;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            ILayer2PriorityWidget iLayer2PriorityWidget = this.widget;
            int hashCode = (iLayer2PriorityWidget == null ? 0 : iLayer2PriorityWidget.hashCode()) * 31;
            boolean z = this.show;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(widget=");
            LIZ.append(this.widget);
            LIZ.append(", show=");
            return C48339Iy7.LIZJ(LIZ, this.show, ')', LIZ);
        }

        public final boolean getShow() {
            return this.show;
        }

        public final ILayer2PriorityWidget getWidget() {
            return this.widget;
        }

        public final void setShow(boolean z) {
            this.show = z;
        }

        public final void setWidget(ILayer2PriorityWidget iLayer2PriorityWidget) {
            this.widget = iLayer2PriorityWidget;
        }

        public Data(ILayer2PriorityWidget iLayer2PriorityWidget, boolean z) {
            this.widget = iLayer2PriorityWidget;
            this.show = z;
        }
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final Data getDonationSticker() {
        return this.donationSticker;
    }

    public final boolean getFirstScreenDone() {
        return this.firstScreenDone;
    }

    public final Data getHashTag() {
        return this.hashTag;
    }

    public final Data getRankEntrance() {
        return this.rankEntrance;
    }

    public Layer2PriorityManager(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.fragment = fragment;
        this.donationSticker = new Data(null, false);
        this.rankEntrance = new Data(null, false);
        this.hashTag = new Data(null, false);
    }

    private final void show(Data data) {
        if (this.firstScreenDone && (data.getWidget() instanceof LiveRecyclableWidget) && !isShowing(data.getWidget())) {
            Object widget = data.getWidget();
            o.LJII(widget, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.LiveRecyclableWidget");
            ((com.bytedance.android.widget.Widget) widget).show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void traverse2(ILayer2PriorityWidget iLayer2PriorityWidget) {
        if (this.donationSticker.getShow()) {
            show(this.donationSticker);
            hide(this.rankEntrance, iLayer2PriorityWidget);
            hide(this.hashTag, iLayer2PriorityWidget);
            return;
        }
        if (this.rankEntrance.getShow()) {
            if (this.animationEnable && isShowing(this.hashTag.getWidget()) && !isShowing(this.rankEntrance.getWidget())) {
                change(this.hashTag.getWidget(), this.rankEntrance.getWidget());
                return;
            }
            hide(this.donationSticker, iLayer2PriorityWidget);
            show(this.rankEntrance);
            hide(this.hashTag, iLayer2PriorityWidget);
            return;
        }
        if (this.hashTag.getShow()) {
            if (this.animationEnable && isShowing(this.rankEntrance.getWidget()) && !isShowing(this.hashTag.getWidget())) {
                change(this.rankEntrance.getWidget(), this.hashTag.getWidget());
                return;
            }
            hide(this.donationSticker, iLayer2PriorityWidget);
            hide(this.rankEntrance, iLayer2PriorityWidget);
            show(this.hashTag);
            return;
        }
        if (!(iLayer2PriorityWidget instanceof LiveRecyclableWidget) || !isShowing(iLayer2PriorityWidget)) {
            return;
        }
        ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget).hide();
    }

    public final boolean hideWidget(ILayer2PriorityWidget widget) {
        o.LJIIIZ(widget, "widget");
        traverse1(widget, false);
        traverse2(widget);
        return !isShowing(widget);
    }

    public final boolean isShowing(ILayer2PriorityWidget iLayer2PriorityWidget) {
        View rootView;
        if (iLayer2PriorityWidget == null || (rootView = iLayer2PriorityWidget.rootView()) == null || rootView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void preMeasure(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setDonationSticker(Data data) {
        o.LJIIIZ(data, "<set-?>");
        this.donationSticker = data;
    }

    public final void setFirstScreenDone(boolean z) {
        this.firstScreenDone = z;
        if (z) {
            traverse2(null);
        }
        if (this.fragment.isAdded()) {
            AbstractC73672Svk.LJJLIIIJLJLI(5000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJII(BTJ.LIZIZ(this.fragment)).LJJJJZI(new InterfaceC64592gB() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager$firstScreenDone$1
                @Override // X.InterfaceC64592gB
                public final void accept(Long l) {
                    Layer2PriorityManager.this.setAnimationEnable(true);
                }
            });
        }
    }

    public final void setHashTag(Data data) {
        o.LJIIIZ(data, "<set-?>");
        this.hashTag = data;
    }

    public final void setRankEntrance(Data data) {
        o.LJIIIZ(data, "<set-?>");
        this.rankEntrance = data;
    }

    public final boolean showWidget(ILayer2PriorityWidget widget) {
        o.LJIIIZ(widget, "widget");
        traverse1(widget, true);
        traverse2(null);
        return isShowing(widget);
    }

    private final void change(final ILayer2PriorityWidget iLayer2PriorityWidget, final ILayer2PriorityWidget iLayer2PriorityWidget2) {
        final int i;
        View rootView;
        if (iLayer2PriorityWidget != null && (rootView = iLayer2PriorityWidget.rootView()) != null) {
            i = rootView.getWidth();
        } else {
            i = 0;
        }
        final C76732zl c76732zl = new C76732zl();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager$change$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                View view;
                o.LJIIIZ(it, "it");
                ILayer2PriorityWidget iLayer2PriorityWidget3 = ILayer2PriorityWidget.this;
                if (!(iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) || !this.isShowing(iLayer2PriorityWidget3) || (view = ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).getView()) == null) {
                    return;
                }
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Float) animatedValue).floatValue());
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager$change$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                ILayer2PriorityWidget iLayer2PriorityWidget3 = ILayer2PriorityWidget.this;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3)) {
                    View view = ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).getView();
                    if (view != null) {
                        view.setAlpha(1.0f);
                    }
                    ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).hide();
                }
            }
        });
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setStartDelay(200L);
        ofFloat2.setDuration(400L);
        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 0.58f, 1.0f));
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager$change$3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                View view;
                o.LJIIIZ(it, "it");
                ILayer2PriorityWidget iLayer2PriorityWidget3 = ILayer2PriorityWidget.this;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3) && (view = ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).getView()) != null) {
                    Layer2PriorityManager layer2PriorityManager = this;
                    int i2 = i;
                    C76732zl c76732zl2 = c76732zl;
                    Object animatedValue = it.getAnimatedValue();
                    o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    view.setAlpha(((Float) animatedValue).floatValue());
                    Object animatedValue2 = it.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    layer2PriorityManager.setWidth(view, (int) ((((Float) animatedValue2).floatValue() * (c76732zl2.element - i2)) + i2));
                }
            }
        });
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.ies.sdk.widgets.Layer2PriorityManager$change$4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                View view;
                o.LJIIIZ(animation, "animation");
                ILayer2PriorityWidget iLayer2PriorityWidget3 = ILayer2PriorityWidget.this;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && this.isShowing(iLayer2PriorityWidget3) && (view = ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).getView()) != null) {
                    Layer2PriorityManager layer2PriorityManager = this;
                    view.setAlpha(1.0f);
                    layer2PriorityManager.setWidth(view, -2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
                ILayer2PriorityWidget iLayer2PriorityWidget3 = ILayer2PriorityWidget.this;
                if ((iLayer2PriorityWidget3 instanceof LiveRecyclableWidget) && !this.isShowing(iLayer2PriorityWidget3)) {
                    View view = ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).getView();
                    if (view != null) {
                        view.setAlpha(0.0f);
                    }
                    ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).show();
                    View view2 = ((com.bytedance.android.widget.Widget) ILayer2PriorityWidget.this).getView();
                    if (view2 != null) {
                        Layer2PriorityManager layer2PriorityManager = this;
                        C76732zl c76732zl2 = c76732zl;
                        int i2 = i;
                        layer2PriorityManager.preMeasure(view2);
                        c76732zl2.element = view2.getMeasuredWidth();
                        layer2PriorityManager.setWidth(view2, i2);
                    }
                }
            }
        });
        ofFloat2.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hide(Data data, ILayer2PriorityWidget iLayer2PriorityWidget) {
        ILayer2PriorityWidget iLayer2PriorityWidget2 = iLayer2PriorityWidget;
        if (data.getWidget() != null) {
            iLayer2PriorityWidget2 = data.getWidget();
        }
        if ((iLayer2PriorityWidget2 instanceof LiveRecyclableWidget) && isShowing(iLayer2PriorityWidget2)) {
            ((com.bytedance.android.widget.Widget) iLayer2PriorityWidget2).hide();
        }
    }

    private final void traverse1(ILayer2PriorityWidget iLayer2PriorityWidget, boolean z) {
        if (o.LJ(iLayer2PriorityWidget, this.donationSticker.getWidget())) {
            this.donationSticker.setShow(z);
        } else if (o.LJ(iLayer2PriorityWidget, this.rankEntrance.getWidget())) {
            this.rankEntrance.setShow(z);
        } else {
            if (!o.LJ(iLayer2PriorityWidget, this.hashTag.getWidget())) {
                return;
            }
            this.hashTag.setShow(z);
        }
    }

    public final void setWidth(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }
}
