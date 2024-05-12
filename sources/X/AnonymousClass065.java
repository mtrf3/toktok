package X;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.065, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass065 extends ViewGroup {
    public AnonymousClass064 LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1AI();
    }

    public AnonymousClass064 getConstraintSet() {
        if (this.LJLIL == null) {
            this.LJLIL = new AnonymousClass064();
        }
        AnonymousClass064 anonymousClass064 = this.LJLIL;
        anonymousClass064.getClass();
        int childCount = getChildCount();
        anonymousClass064.LIZJ.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1AI c1ai = (C1AI) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!anonymousClass064.LIZIZ || id != -1) {
                if (!anonymousClass064.LIZJ.containsKey(Integer.valueOf(id))) {
                    anonymousClass064.LIZJ.put(Integer.valueOf(id), new C019905z());
                }
                C019905z c019905z = anonymousClass064.LIZJ.get(Integer.valueOf(id));
                if (childAt instanceof AbstractC019505v) {
                    AbstractC019505v abstractC019505v = (AbstractC019505v) childAt;
                    c019905z.LIZJ(id, c1ai);
                    if (abstractC019505v instanceof C1AF) {
                        AnonymousClass060 anonymousClass060 = c019905z.LIZLLL;
                        anonymousClass060.LJJJLZIJ = 1;
                        C1AF c1af = (C1AF) abstractC019505v;
                        anonymousClass060.LJJJLIIL = c1af.getType();
                        c019905z.LIZLLL.LJJJZ = c1af.getReferencedIds();
                        c019905z.LIZLLL.LJJJLL = c1af.getMargin();
                    }
                }
                c019905z.LIZJ(id, c1ai);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1AI(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C018905p(layoutParams);
    }
}
