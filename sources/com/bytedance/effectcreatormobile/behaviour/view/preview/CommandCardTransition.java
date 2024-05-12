package com.bytedance.effectcreatormobile.behaviour.view.preview;

import X.AbstractC03490Bt;
import X.C03860De;
import X.C16330kX;
import X.C93454aR8;
import X.C93455aR9;
import X.C93456aRA;
import X.C93457aRB;
import X.C93458aRC;
import X.C94074ab8;
import X.C94526aiQ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class CommandCardTransition extends AbstractC03490Bt {
    public final int[] LLFZ = new int[2];
    public final C93456aRA LLI = new C93456aRA(PointF.class);
    public final C93458aRC LLIFFJFJJ = new C93458aRC(PointF.class);
    public final C93457aRB LLII = new C93457aRB(PointF.class);
    public final C93455aR9 LLIIII = new C93455aR9(Integer.TYPE);

    @Override // X.AbstractC03490Bt
    public final void LIZLLL(C03860De c03860De) {
        LJJIJL(c03860De);
    }

    @Override // X.AbstractC03490Bt
    public final void LJI(C03860De c03860De) {
        LJJIJL(c03860De);
    }

    public final void LJJIJL(C03860De c03860De) {
        View view = c03860De.LIZIZ;
        if (view != null) {
            C94526aiQ c94526aiQ = (C94526aiQ) view;
            Object parent = c94526aiQ.getParent();
            if (parent != null) {
                View view2 = (View) parent;
                if (C16330kX.LIZJ(c94526aiQ) || c94526aiQ.getWidth() != 0 || c94526aiQ.getHeight() != 0) {
                    Map<String, Object> map = c03860De.LIZ;
                    o.LJIIIIZZ(map, "values.values");
                    ((HashMap) map).put("behaviour.view.preview:CommandChangeTransition:bound", new Rect(c94526aiQ.getLeft(), c94526aiQ.getTop(), c94526aiQ.getRight(), c94526aiQ.getBottom()));
                    View pivotView = c94526aiQ.getPivotView();
                    if (pivotView != null) {
                        Map<String, Object> map2 = c03860De.LIZ;
                        o.LJIIIIZZ(map2, "values.values");
                        ((HashMap) map2).put("behaviour.view.preview:CommandChangeTransition:pivotOffset", Integer.valueOf(pivotView.getTop()));
                        view2.getLocationInWindow(this.LLFZ);
                        Map<String, Object> map3 = c03860De.LIZ;
                        o.LJIIIIZZ(map3, "values.values");
                        ((HashMap) map3).put("behaviour.view.preview:CommandChangeTransition:parentLocation", new Point(this.LLFZ[0] - view2.getScrollX(), this.LLFZ[1] - view2.getScrollY()));
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.behaviour.view.card.BehaviourCommandCardView");
    }

    public static void LJJIJLIJ(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
            }
        }
    }

    @Override // X.AbstractC03490Bt
    public final Animator LJIIJ(ViewGroup viewGroup, C03860De c03860De, C03860De c03860De2) {
        Object obj;
        Object obj2;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (c03860De != null && (map2 = c03860De.LIZ) != null) {
            obj = ((HashMap) map2).get("behaviour.view.preview:CommandChangeTransition:bound");
        } else {
            obj = null;
        }
        if (!(obj instanceof Rect)) {
            obj = null;
        }
        Rect rect = (Rect) obj;
        if (rect != null) {
            if (c03860De2 != null && (map = c03860De2.LIZ) != null) {
                obj2 = ((HashMap) map).get("behaviour.view.preview:CommandChangeTransition:bound");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof Rect)) {
                obj2 = null;
            }
            final Rect rect2 = (Rect) obj2;
            if (rect2 != null) {
                Object obj3 = ((HashMap) c03860De.LIZ).get("behaviour.view.preview:CommandChangeTransition:pivotOffset");
                if (!(obj3 instanceof Integer)) {
                    obj3 = null;
                }
                Integer num = (Integer) obj3;
                if (num != null) {
                    int intValue = num.intValue();
                    Object obj4 = ((HashMap) c03860De2.LIZ).get("behaviour.view.preview:CommandChangeTransition:pivotOffset");
                    if (!(obj4 instanceof Integer)) {
                        obj4 = null;
                    }
                    Integer num2 = (Integer) obj4;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        Object obj5 = ((HashMap) c03860De.LIZ).get("behaviour.view.preview:CommandChangeTransition:parentLocation");
                        if (!(obj5 instanceof Point)) {
                            obj5 = null;
                        }
                        Point point = (Point) obj5;
                        if (point != null) {
                            Object obj6 = ((HashMap) c03860De2.LIZ).get("behaviour.view.preview:CommandChangeTransition:parentLocation");
                            if (!(obj6 instanceof Point)) {
                                obj6 = null;
                            }
                            Point point2 = (Point) obj6;
                            if (point2 != null) {
                                int i = rect.left;
                                int i2 = point.x;
                                int i3 = point2.x;
                                rect.left = (i + i2) - i3;
                                rect.right = (rect.right + i2) - i3;
                                int i4 = rect.top;
                                int i5 = point.y;
                                int i6 = point2.y;
                                rect.top = (i4 + i5) - i6;
                                rect.bottom = (rect.bottom + i5) - i6;
                                View view = c03860De2.LIZIZ;
                                if (!(view instanceof C94526aiQ)) {
                                    view = null;
                                }
                                final C94526aiQ c94526aiQ = (C94526aiQ) view;
                                if (c94526aiQ != null) {
                                    int i7 = intValue - intValue2;
                                    c94526aiQ.setOffsetY(i7);
                                    c94526aiQ.setLeft(rect.left);
                                    c94526aiQ.setTop(rect.top);
                                    c94526aiQ.setRight(rect.right);
                                    c94526aiQ.setBottom(rect.bottom);
                                    if (rect.height() == rect2.height() && rect.width() == rect2.width()) {
                                        return ObjectAnimator.ofObject(c94526aiQ, this.LLI, (TypeConverter) null, this.LLF.LLILZ(rect.left, rect.top, rect2.left, rect2.top));
                                    }
                                    Path LLILZ = this.LLF.LLILZ(rect.left, rect.top, rect2.left, rect2.top);
                                    final C93454aR8 c93454aR8 = new C93454aR8(c94526aiQ, i7);
                                    ObjectAnimator ofObject = ObjectAnimator.ofObject(c93454aR8, this.LLIFFJFJJ, (TypeConverter) null, LLILZ);
                                    o.LJIIIIZZ(ofObject, "ObjectAnimator.ofObject(…perty, null, topLeftPath)");
                                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(c93454aR8, this.LLII, (TypeConverter) null, this.LLF.LLILZ(rect.right, rect.bottom, rect2.right, rect2.bottom));
                                    o.LJIIIIZZ(ofObject2, "ObjectAnimator.ofObject(…y, null, bottomRightPath)");
                                    ObjectAnimator ofObject3 = ObjectAnimator.ofObject(c93454aR8, this.LLIIII, (TypeEvaluator) null, Integer.valueOf(i7), 0);
                                    o.LJIIIIZZ(ofObject3, "ObjectAnimator.ofObject(…artOffset - endOffset, 0)");
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.addListener(new AnimatorListenerAdapter(rect2, c93454aR8) { // from class: com.bytedance.effectcreatormobile.behaviour.view.preview.CommandCardTransition$createAnimator$1
                                        public final /* synthetic */ Rect LJLILLLLZI;
                                        public final C93454aR8 innerViewBoundsHolder;

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            super.onAnimationEnd(animator);
                                            C94526aiQ setBounds = C94526aiQ.this;
                                            Rect rect3 = this.LJLILLLLZI;
                                            o.LJIIIZ(setBounds, "$this$setBounds");
                                            o.LJIIIZ(rect3, "rect");
                                            setBounds.setLeft(rect3.left);
                                            setBounds.setTop(rect3.top);
                                            setBounds.setRight(rect3.right);
                                            setBounds.setBottom(rect3.bottom);
                                            C94526aiQ.this.setOffsetY(0);
                                        }

                                        {
                                            this.innerViewBoundsHolder = c93454aR8;
                                        }
                                    });
                                    LJJIJLIJ(c94526aiQ, true);
                                    LIZ(new C94074ab8(this, c94526aiQ));
                                    animatorSet.playTogether(ofObject, ofObject2, ofObject3);
                                    return animatorSet;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
