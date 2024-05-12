package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1jO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41101jO extends C131765Fc {
    public int LLF;
    public final int LLFF;
    public final RectF LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public final List<InterfaceC05750Kl> LLI;
    public final Rect LLIFFJFJJ;
    public final RectF LLII;
    public final C62822Ol8 LLIIII;
    public final Paint LLIIIILZ;
    public boolean LLIIIJ;

    public final Paint getGradientPaint() {
        return (Paint) this.LLIIII.getValue();
    }

    public final Paint getDrawBackPaint() {
        return this.LLIIIILZ;
    }

    public final boolean getForbidPendingLine() {
        return this.LLIIIJ;
    }

    public final Rect getFullRect() {
        return this.LLIFFJFJJ;
    }

    public final RectF getFullRectF() {
        return this.LLII;
    }

    public final RectF getLastDynamicRectF() {
        return this.LLFFF;
    }

    public final int getPendingLine() {
        return this.LLF;
    }

    public final void LJI(long j) {
        setCurrMusicProcess(j);
        final int LIZLLL = LIZLLL(j);
        setLastMusicProcess(j);
        if (getCurShowIndex() != LIZLLL && !this.LJLLILLLL) {
            if (LIZLLL <= 0 || LIZLLL >= getCurShowIndex()) {
                ValueAnimator scrollAnimator = getScrollAnimator();
                if (scrollAnimator != null && scrollAnimator.isRunning()) {
                    ValueAnimator scrollAnimator2 = getScrollAnimator();
                    if (scrollAnimator2 != null) {
                        scrollAnimator2.cancel();
                    }
                    ValueAnimator scrollAnimator3 = getScrollAnimator();
                    if (scrollAnimator3 != null) {
                        scrollAnimator3.removeAllUpdateListeners();
                    }
                    ValueAnimator scrollAnimator4 = getScrollAnimator();
                    if (scrollAnimator4 != null) {
                        C16880lQ.LJLJL(scrollAnimator4);
                    }
                    setAnimationY(0);
                }
                setAnimating(true);
                final C76732zl c76732zl = new C76732zl();
                c76732zl.element = -1;
                final C76732zl c76732zl2 = new C76732zl();
                setScrollAnimator(ValueAnimator.ofInt(0, getLyricsRect().height()));
                ValueAnimator scrollAnimator5 = getScrollAnimator();
                if (scrollAnimator5 != null) {
                    scrollAnimator5.setDuration(230L);
                }
                ValueAnimator scrollAnimator6 = getScrollAnimator();
                if (scrollAnimator6 != null) {
                    scrollAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.135
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator it) {
                            o.LJIIIZ(it, "it");
                            C41101jO.this.setInScroll(true);
                            C76732zl c76732zl3 = c76732zl2;
                            Object animatedValue = it.getAnimatedValue();
                            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            c76732zl3.element = ((Integer) animatedValue).intValue();
                            C76732zl c76732zl4 = c76732zl;
                            int i = c76732zl4.element;
                            C76732zl c76732zl5 = c76732zl2;
                            int i2 = c76732zl5.element;
                            if (i != i2) {
                                C41101jO c41101jO = C41101jO.this;
                                if (i2 <= i + c41101jO.LLFF) {
                                    return;
                                }
                                c76732zl4.element = i2;
                                c41101jO.setAnimationY(c76732zl5.element);
                                C41101jO.this.invalidate();
                            }
                        }
                    });
                }
                ValueAnimator scrollAnimator7 = getScrollAnimator();
                if (scrollAnimator7 != null) {
                    scrollAnimator7.addListener(new AnimatorListenerAdapter() { // from class: X.136
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                            C41101jO.this.setInScroll(false);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animation) {
                            o.LJIIIZ(animation, "animation");
                            C41101jO.this.setAnimationY(0);
                            C41101jO.this.setAnimating(false);
                            C41101jO.this.setCurShowIndex(LIZLLL);
                            C41101jO.this.setInScroll(false);
                            C41101jO.this.getDynamicRectF().left = 0.0f;
                            C41101jO.this.invalidate();
                        }
                    });
                }
                ValueAnimator scrollAnimator8 = getScrollAnimator();
                if (scrollAnimator8 != null) {
                    scrollAnimator8.start();
                }
            }
        } else if (this.LLFZ) {
            invalidate();
            this.LLFZ = false;
        }
        if (!o.LJ(getDynamicRectF(), this.LLFFF) && !getInScroll()) {
            invalidate();
            this.LLFFF.set(getDynamicRectF());
        }
        getCurrMusicProcess();
        Iterator it = ((ArrayList) this.LLI).iterator();
        while (it.hasNext()) {
            ((InterfaceC05750Kl) it.next()).LIZIZ();
        }
    }

    @Override // X.C131765Fc, android.view.View
    public final void onDraw(Canvas canvas) {
        C14H c14h;
        int i;
        if (getCurrMusicProcess() < 0 || getCurShowIndex() >= getLyricsLineInfos().size() || (c14h = (C14H) ListProtector.get(getLyricsLineInfos(), getCurShowIndex())) == null) {
            return;
        }
        if (canvas != null) {
            canvas.getClipBounds(this.LLIFFJFJJ);
        }
        this.LLII.set(this.LLIFFJFJJ);
        String str = c14h.LIZJ;
        if (str == null) {
            str = "";
        }
        getLyricsRect().set(LJ(str));
        C17C c17c = getConfig().LIZLLL;
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        float LIZJ = c17c.LIZJ(measuredWidth);
        C17C c17c2 = getConfig().LIZLLL;
        getMeasuredWidth();
        getMeasuredHeight();
        float LIZLLL = c17c2.LIZLLL(getAnimationY(), getLyricsRect());
        if (getInScroll()) {
            this.LLF = getConfig().LIZJ + 1;
        } else {
            this.LLF = getConfig().LIZJ;
        }
        if (this.LLIIIJ) {
            this.LLF = 0;
        }
        if (canvas != null) {
            i = canvas.saveLayer(this.LLII, this.LLIIIILZ);
        } else {
            i = 1;
        }
        int i2 = this.LLF;
        for (int i3 = 1; i3 < i2; i3++) {
            LIZJ(canvas, i3, LIZJ, LIZLLL);
        }
        if (canvas == null) {
            return;
        }
        canvas.drawRect(this.LLIFFJFJJ, getGradientPaint());
        canvas.restoreToCount(i);
        int saveLayer = canvas.saveLayer(this.LLII, this.LLIIIILZ);
        getConfig().getClass();
        canvas.clipRect(0.0f, 0.0f, getDynamicRectF().left, getDynamicRectF().bottom);
        canvas.drawText(str, LIZJ, LIZLLL, getConfig().LJI);
        canvas.restoreToCount(saveLayer);
        int saveLayer2 = canvas.saveLayer(this.LLII, this.LLIIIILZ);
        canvas.clipRect(getDynamicRectF());
        canvas.drawText(str, LIZJ, LIZLLL, getConfig().LJFF);
        canvas.restoreToCount(saveLayer2);
    }

    public final void setForbidPendingLine(boolean z) {
        invalidate();
        this.LLIIIJ = z;
    }

    public final void setPendingLine(int i) {
        this.LLF = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && !this.LLFII && (!getLyricsLineInfos().isEmpty())) {
            this.LLFII = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41101jO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLF = 3;
        this.LLFF = 4;
        this.LLFFF = new RectF();
        this.LLI = new ArrayList();
        this.LLIFFJFJJ = new Rect();
        this.LLII = new RectF();
        this.LLIIII = C221108m2.LIZIZ(new IDqS420S0100000(this, 45));
        this.LLIIIILZ = new Paint();
    }

    @Override // X.C131765Fc
    public final void LIZ(long j, List list) {
        super.LIZ(j, list);
        if (C15380j0.LJIIZILJ()) {
            getConfig().LIZ(Paint.Align.LEFT, this.LLF);
        } else {
            getConfig().LIZ(Paint.Align.RIGHT, this.LLF);
        }
        getConfig().LIZLLL.LIZ(getDynamicRectF(), getMeasuredHeight(), getMeasuredWidth(), getMeasuredWidth(), 0.0f, true);
        this.LLFZ = true;
    }
}
