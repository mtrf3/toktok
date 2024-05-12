package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar$SavedState;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Vhz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80463Vhz extends C011902x implements C06B {
    public Animator LLILIL;
    public Animator LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public BottomAppBar$Behavior LLILZLL;

    private AnonymousClass191 getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AnonymousClass191) {
                return (AnonymousClass191) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return 0;
    }

    public int getLeftInset() {
        return 0;
    }

    public int getRightInset() {
        return 0;
    }

    @Override // X.C011902x
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // X.C011902x
    public void setTitle(CharSequence charSequence) {
    }

    @Override // X.C06B
    public BottomAppBar$Behavior getBehavior() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new BottomAppBar$Behavior();
        }
        return this.LLILZLL;
    }

    public float getFabTranslationX() {
        return LJIJJ(this.LLILLIZIL);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().LJLJI;
    }

    public final View LJIJ() {
        if (!(getParent() instanceof C45621qg)) {
            return null;
        }
        C45621qg c45621qg = (C45621qg) getParent();
        ArrayList<View> orDefault = c45621qg.LJLILLLLZI.LIZIZ.getOrDefault(this, null);
        ((ArrayList) c45621qg.LJLJJI).clear();
        if (orDefault != null) {
            ((ArrayList) c45621qg.LJLJJI).addAll(orDefault);
        }
        Iterator it = ((ArrayList) c45621qg.LJLJJI).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof C80474ViA) || (view instanceof C80376Vga)) {
                return view;
            }
        }
        return null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().LJLJI;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().LJLILLLLZI;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLJ(this, null);
        throw null;
    }

    @Override // X.C011902x, android.view.View
    public final Parcelable onSaveInstanceState() {
        BottomAppBar$SavedState bottomAppBar$SavedState = new BottomAppBar$SavedState((Toolbar$SavedState) super.onSaveInstanceState());
        bottomAppBar$SavedState.LJLIL = this.LLILLIZIL;
        bottomAppBar$SavedState.LJLILLLLZI = this.LLILZIL;
        return bottomAppBar$SavedState;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.LLILLIZIL;
    }

    public int getFabAnimationMode() {
        return this.LLILLJJLI;
    }

    public boolean getHideOnScroll() {
        return this.LLILLL;
    }

    public C80473Vi9 getTopEdgeTreatment() {
        throw null;
    }

    public final float LJIJJ(int i) {
        boolean LIZJ = C80250VeY.LIZJ(this);
        int i2 = 1;
        if (i == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (LIZJ) {
                i2 = -1;
            }
            return measuredWidth * i2;
        }
        return 0.0f;
    }

    @Override // X.C011902x, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BottomAppBar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BottomAppBar$SavedState bottomAppBar$SavedState = (BottomAppBar$SavedState) parcelable;
        super.onRestoreInstanceState(bottomAppBar$SavedState.mSuperState);
        this.LLILLIZIL = bottomAppBar$SavedState.LJLIL;
        this.LLILZIL = bottomAppBar$SavedState.LJLILLLLZI;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C07820Sk.LJII(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C80473Vi9 topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.LJLJI = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        C80474ViA c80474ViA;
        C80474ViA c80474ViA2;
        this.LLILZ = 0;
        boolean z = this.LLILZIL;
        View view = null;
        if (!C16330kX.LIZJ(this)) {
            int i3 = this.LLILZ;
            if (i3 != 0) {
                this.LLILZ = 0;
                getMenu().clear();
                LJIIJ(i3);
            }
        } else {
            Animator animator = this.LLILL;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            View LJIJ = LJIJ();
            if ((LJIJ instanceof C80474ViA) && (c80474ViA = (C80474ViA) LJIJ) != null && c80474ViA.LJII()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            AnonymousClass191 actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - LJIJI(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new C80464Vi0(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.LLILL = animatorSet2;
            animatorSet2.addListener(new C80469Vi5(this));
            this.LLILL.start();
        }
        if (this.LLILLIZIL != i && C16330kX.LIZJ(this)) {
            Animator animator2 = this.LLILIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.LLILLJJLI == 1) {
                View LJIJ2 = LJIJ();
                if (LJIJ2 instanceof C80474ViA) {
                    view = LJIJ2;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", LJIJJ(i));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                View LJIJ3 = LJIJ();
                if ((LJIJ3 instanceof C80474ViA) && (c80474ViA2 = (C80474ViA) LJIJ3) != null && !c80474ViA2.LJI()) {
                    c80474ViA2.LJFF(new C80471Vi7(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.LLILIL = animatorSet3;
            animatorSet3.addListener(new C80468Vi4(this));
            this.LLILIL.start();
        }
        this.LLILLIZIL = i;
    }

    public void setFabAnimationMode(int i) {
        this.LLILLJJLI = i;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().LJLILLLLZI = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().LJLIL = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.LLILLL = z;
    }

    public final int LJIJI(AnonymousClass191 anonymousClass191, int i, boolean z) {
        int i2;
        int left;
        if (i != 1 || !z) {
            return 0;
        }
        boolean LIZJ = C80250VeY.LIZJ(this);
        if (LIZJ) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof AnonymousClass199) && (((C009401y) childAt.getLayoutParams()).LIZ & 8388615) == 8388611) {
                if (LIZJ) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (LIZJ) {
            left = anonymousClass191.getRight();
        } else {
            left = anonymousClass191.getLeft();
        }
        return i2 - left;
    }

    public final void LJIJJLI(AnonymousClass191 anonymousClass191, int i, boolean z, boolean z2) {
        RunnableC80466Vi2 runnableC80466Vi2 = new RunnableC80466Vi2(this, anonymousClass191, i, z);
        if (z2) {
            anonymousClass191.post(runnableC80466Vi2);
        } else {
            runnableC80466Vi2.run();
        }
    }

    @Override // X.C011902x, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C80474ViA c80474ViA = null;
        if (z) {
            Animator animator = this.LLILL;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.LLILIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            C80473Vi9 topEdgeTreatment = getTopEdgeTreatment();
            getFabTranslationX();
            topEdgeTreatment.getClass();
            LJIJ();
            if (this.LLILZIL) {
                View LJIJ = LJIJ();
                if (LJIJ instanceof C80474ViA) {
                    C80474ViA c80474ViA2 = (C80474ViA) LJIJ;
                    if (c80474ViA2 != null) {
                        c80474ViA2.LJII();
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        AnonymousClass191 actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.LLILL == null) {
            actionMenuView.setAlpha(1.0f);
            View LJIJ2 = LJIJ();
            if (LJIJ2 instanceof C80474ViA) {
                c80474ViA = (C80474ViA) LJIJ2;
            }
            if (c80474ViA != null && c80474ViA.LJII()) {
                LJIJJLI(actionMenuView, this.LLILLIZIL, this.LLILZIL, false);
            } else {
                LJIJJLI(actionMenuView, 0, false, false);
            }
        }
    }
}
