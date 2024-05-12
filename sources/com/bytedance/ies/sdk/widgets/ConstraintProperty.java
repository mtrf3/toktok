package com.bytedance.ies.sdk.widgets;

import X.C018905p;
import X.C16530kr;
import X.C74296TDw;
import X.JBR;
import X.X1D;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class ConstraintProperty {
    public float mAlpha;
    public LayeredConstraintLayout.LayoutParams mParams;
    public PropertyResolver mPropertyResolver;
    public float mRotation;
    public float mScaleX;
    public float mScaleY;
    public float mTranslationX;
    public float mTranslationY;
    public View mView;
    public int mVisibility;

    private String sideToString(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public ViewPropertyAnimator animate() {
        return this.mView.animate();
    }

    public void apply() {
        this.mView.setLayoutParams(this.mParams);
    }

    public ConstraintProperty disableNonOverlapping() {
        this.mView.setTag(R.id.g0c, Boolean.FALSE);
        return this;
    }

    public int id() {
        return this.mView.getId();
    }

    public int layer() {
        return this.mParams.getLayer();
    }

    public int order() {
        return this.mParams.getOrder();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r10 == (-1)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r0 = r3.rightToRight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r0 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        r5.connect(2, r0, 2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r0 = r3.leftToLeft;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (r0 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        r4.connect(1, r0, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        if (r6 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.ies.sdk.widgets.ConstraintProperty removeFromHorizontalChain() {
        /*
            r11 = this;
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r0 = r11.mParams
            int r10 = r0.leftToRight
            int r6 = r0.rightToLeft
            r8 = 0
            r7 = -1
            if (r10 != r7) goto Lc
            if (r6 == r7) goto L57
        Lc:
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r10)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r5 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r5.<init>(r0)
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r6)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r4 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r4.<init>(r0)
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r3 = r11.mParams
            r2 = 1
            r1 = 2
            if (r10 == r7) goto L45
            if (r6 == r7) goto L43
            r5.connect(r1, r6, r2, r8)
            r4.connect(r2, r10, r1, r8)
        L3c:
            r11.removeConstraints(r2)
            r11.removeConstraints(r1)
        L42:
            return r11
        L43:
            if (r10 != r7) goto L47
        L45:
            if (r6 == r7) goto L3c
        L47:
            int r0 = r3.rightToRight
            if (r0 == r7) goto L4f
            r5.connect(r1, r0, r1, r8)
            goto L3c
        L4f:
            int r0 = r3.leftToLeft
            if (r0 == r7) goto L3c
            r4.connect(r2, r0, r2, r8)
            goto L3c
        L57:
            int r9 = r0.startToEnd
            int r6 = r0.endToStart
            r5 = 7
            r4 = 6
            if (r9 != r7) goto L61
            if (r6 == r7) goto L8f
        L61:
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r9)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r3 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r3.<init>(r0)
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r6)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r2 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r2.<init>(r0)
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r1 = r11.mParams
            if (r9 == r7) goto L96
            if (r6 == r7) goto L8f
            r3.connect(r5, r6, r4, r8)
            r2.connect(r4, r10, r5, r8)
        L8f:
            r11.removeConstraints(r4)
            r11.removeConstraints(r5)
            goto L42
        L96:
            if (r6 == r7) goto L8f
            int r0 = r1.rightToRight
            if (r0 == r7) goto La0
            r3.connect(r5, r0, r5, r8)
            goto L8f
        La0:
            int r0 = r1.leftToLeft
            if (r0 == r7) goto L8f
            r2.connect(r4, r0, r4, r8)
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.ConstraintProperty.removeFromHorizontalChain():com.bytedance.ies.sdk.widgets.ConstraintProperty");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r9 == (-1)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r0 = r2.bottomToBottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r0 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r4.connect(4, r0, 4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r0 = r2.topToTop;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r0 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r3.connect(3, r0, 3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r8 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.ies.sdk.widgets.ConstraintProperty removeFromVerticalChain() {
        /*
            r10 = this;
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r0 = r10.mParams
            int r9 = r0.topToBottom
            int r8 = r0.bottomToTop
            r7 = 4
            r6 = 3
            r5 = -1
            if (r9 != r5) goto Ld
            if (r8 == r5) goto L3c
        Ld:
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r9)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r4 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r4.<init>(r0)
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r8)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r3 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r3.<init>(r0)
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r2 = r10.mParams
            r1 = 0
            if (r9 == r5) goto L45
            if (r8 == r5) goto L43
            r4.connect(r7, r8, r6, r1)
            r3.connect(r6, r9, r7, r1)
        L3c:
            r10.removeConstraints(r6)
            r10.removeConstraints(r7)
            return r10
        L43:
            if (r9 != r5) goto L47
        L45:
            if (r8 == r5) goto L3c
        L47:
            int r0 = r2.bottomToBottom
            if (r0 == r5) goto L4f
            r4.connect(r7, r0, r7, r1)
            goto L3c
        L4f:
            int r0 = r2.topToTop
            if (r0 == r5) goto L3c
            r3.connect(r6, r0, r6, r1)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.ConstraintProperty.removeFromVerticalChain():com.bytedance.ies.sdk.widgets.ConstraintProperty");
    }

    public float alpha() {
        return this.mAlpha;
    }

    public View getView() {
        return this.mView;
    }

    public float translationX() {
        return this.mTranslationX;
    }

    public float translationY() {
        return this.mTranslationY;
    }

    public int visibility() {
        return this.mVisibility;
    }

    public ConstraintProperty(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C018905p) {
            this.mParams = (LayeredConstraintLayout.LayoutParams) layoutParams;
            this.mView = view;
            this.mAlpha = view.getAlpha();
            this.mScaleX = this.mView.getScaleX();
            this.mScaleY = this.mView.getScaleY();
            this.mRotation = this.mView.getRotation();
            this.mTranslationX = this.mView.getTranslationX();
            this.mTranslationY = this.mView.getTranslationY();
            this.mVisibility = this.mView.getVisibility();
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    public ConstraintProperty addToHorizontalChainHeadRtl(int i) {
        int i2;
        if (i == 0) {
            i2 = 6;
        } else {
            i2 = 7;
        }
        connect(6, i, i2, 0);
        return this;
    }

    public ConstraintProperty addToHorizontalChainTailRtl(int i) {
        int i2;
        if (i == 0) {
            i2 = 7;
        } else {
            i2 = 6;
        }
        connect(7, i, i2, 0);
        return this;
    }

    public ConstraintProperty alpha(float f) {
        this.mAlpha = f;
        View view = this.mView;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedAlpha(view.getId());
        }
        view.setAlpha(f);
        return this;
    }

    public ConstraintProperty centerHorizontally(int i) {
        if (i == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, 2, 0, i, 1, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperty centerHorizontallyRtl(int i) {
        if (i == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, 7, 0, i, 6, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperty centerVertically(int i) {
        if (i == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, 4, 0, i, 3, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperty constrainDefaultHeight(int i) {
        this.mParams.matchConstraintDefaultHeight = i;
        return this;
    }

    public ConstraintProperty constrainDefaultWidth(int i) {
        this.mParams.matchConstraintDefaultWidth = i;
        return this;
    }

    public ConstraintProperty constrainHeight(int i) {
        ((ViewGroup.MarginLayoutParams) this.mParams).height = i;
        return this;
    }

    public ConstraintProperty constrainMaxHeight(int i) {
        this.mParams.matchConstraintMaxHeight = i;
        return this;
    }

    public ConstraintProperty constrainMaxWidth(int i) {
        this.mParams.matchConstraintMaxWidth = i;
        return this;
    }

    public ConstraintProperty constrainMinHeight(int i) {
        this.mParams.matchConstraintMinHeight = i;
        return this;
    }

    public ConstraintProperty constrainMinWidth(int i) {
        this.mParams.matchConstraintMinWidth = i;
        return this;
    }

    public ConstraintProperty constrainWidth(int i) {
        ((ViewGroup.MarginLayoutParams) this.mParams).width = i;
        return this;
    }

    public ConstraintProperty dimensionRatio(String str) {
        this.mParams.dimensionRatio = str;
        return this;
    }

    public ConstraintProperty elevation(float f) {
        this.mView.setElevation(f);
        return this;
    }

    public ConstraintProperty forceHasOverlappingRendering(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mView.forceHasOverlappingRendering(z);
        }
        return this;
    }

    public ConstraintProperty forceHasOverlappingRenderingCompat(boolean z) {
        View view = this.mView;
        if (view instanceof C74296TDw) {
            ((C74296TDw) view).forceHasOverlappingRenderingCompat(z);
        }
        return this;
    }

    public ConstraintProperty horizontalBias(float f) {
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperty horizontalChainStyle(int i) {
        this.mParams.horizontalChainStyle = i;
        return this;
    }

    public ConstraintProperty horizontalWeight(float f) {
        this.mParams.horizontalWeight = f;
        return this;
    }

    public ConstraintProperty layer(int i) {
        this.mParams.setLayer(i);
        return this;
    }

    public int margin(int i) {
        switch (i) {
            case 1:
                return ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin;
            case 2:
                return ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin;
            case 3:
                return ((ViewGroup.MarginLayoutParams) this.mParams).topMargin;
            case 4:
                return ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                return C16530kr.LIZJ(this.mParams);
            case 7:
                return C16530kr.LIZIZ(this.mParams);
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty order(int i) {
        this.mParams.setOrder(i);
        return this;
    }

    public ConstraintProperty removeConstraints(int i) {
        switch (i) {
            case 1:
                LayeredConstraintLayout.LayoutParams layoutParams = this.mParams;
                layoutParams.leftToRight = -1;
                layoutParams.leftToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.goneLeftMargin = -1;
                return this;
            case 2:
                LayeredConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                layoutParams2.rightToRight = -1;
                layoutParams2.rightToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.goneRightMargin = -1;
                return this;
            case 3:
                LayeredConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                layoutParams3.topToBottom = -1;
                layoutParams3.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.goneTopMargin = -1;
                return this;
            case 4:
                LayeredConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                layoutParams4.bottomToTop = -1;
                layoutParams4.bottomToBottom = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.goneBottomMargin = -1;
                return this;
            case 5:
                this.mParams.baselineToBaseline = -1;
                return this;
            case 6:
                LayeredConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                layoutParams5.startToEnd = -1;
                layoutParams5.startToStart = -1;
                C16530kr.LJII(layoutParams5, -1);
                this.mParams.goneStartMargin = -1;
                return this;
            case 7:
                LayeredConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                layoutParams6.endToStart = -1;
                layoutParams6.endToEnd = -1;
                C16530kr.LJI(layoutParams6, -1);
                this.mParams.goneEndMargin = -1;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty rotation(float f) {
        this.mRotation = f;
        this.mView.setRotation(f);
        return this;
    }

    public ConstraintProperty rotationX(float f) {
        this.mView.setRotationX(f);
        return this;
    }

    public ConstraintProperty rotationY(float f) {
        this.mView.setRotationY(f);
        return this;
    }

    public ConstraintProperty scaleX(float f) {
        this.mScaleX = f;
        this.mView.setScaleX(f);
        return this;
    }

    public ConstraintProperty scaleY(float f) {
        this.mScaleY = f;
        this.mView.setScaleY(f);
        return this;
    }

    public ConstraintProperty transformPivotX(float f) {
        this.mView.setPivotX(f);
        return this;
    }

    public ConstraintProperty transformPivotY(float f) {
        this.mView.setPivotY(f);
        return this;
    }

    public ConstraintProperty translationX(float f) {
        this.mTranslationX = f;
        View view = this.mView;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedTranslationX(view.getId());
        }
        view.setTranslationX(f);
        return this;
    }

    public ConstraintProperty translationY(float f) {
        this.mTranslationY = f;
        View view = this.mView;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedTranslationY(view.getId());
        }
        view.setTranslationY(f);
        return this;
    }

    public ConstraintProperty translationZ(float f) {
        this.mView.setTranslationZ(f);
        return this;
    }

    public ConstraintProperty verticalBias(float f) {
        this.mParams.verticalBias = f;
        return this;
    }

    public ConstraintProperty verticalChainStyle(int i) {
        this.mParams.verticalChainStyle = i;
        return this;
    }

    public ConstraintProperty verticalWeight(float f) {
        this.mParams.verticalWeight = f;
        return this;
    }

    public ConstraintProperty visibility(int i) {
        boolean z;
        this.mVisibility = i;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            i = propertyResolver.getResolvedVisibility(this.mView.getId());
        }
        this.mView.setVisibility(i);
        if (i != this.mVisibility) {
            PropertyResolver propertyResolver2 = this.mPropertyResolver;
            int id = id();
            if (i == 8) {
                z = true;
            } else {
                z = false;
            }
            propertyResolver2.onHiddenChanged(id, z);
        }
        return this;
    }

    public ConstraintProperty(View view, ConstraintProperty constraintProperty) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C018905p) {
            this.mParams = (LayeredConstraintLayout.LayoutParams) layoutParams;
            this.mView = view;
            this.mAlpha = constraintProperty.mAlpha;
            this.mScaleX = constraintProperty.mScaleX;
            this.mScaleY = constraintProperty.mScaleY;
            this.mRotation = constraintProperty.mRotation;
            this.mTranslationX = constraintProperty.mTranslationX;
            this.mTranslationY = constraintProperty.mTranslationY;
            this.mVisibility = constraintProperty.mVisibility;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    public ConstraintProperty addToHorizontalChain(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        connect(1, i, i3, 0);
        if (i2 == 0) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        connect(2, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i)).connect(2, this.mView.getId(), 1, 0);
        }
        if (i2 != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i2)).connect(1, this.mView.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperty addToHorizontalChainRtl(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 6;
        } else {
            i3 = 7;
        }
        connect(6, i, i3, 0);
        if (i2 == 0) {
            i4 = 7;
        } else {
            i4 = 6;
        }
        connect(7, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i)).connect(7, this.mView.getId(), 6, 0);
        }
        if (i2 != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i2)).connect(6, this.mView.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperty addToVerticalChain(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 3;
        } else {
            i3 = 4;
        }
        connect(3, i, i3, 0);
        if (i2 == 0) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        connect(4, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i)).connect(4, this.mView.getId(), 3, 0);
        }
        if (i2 != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i2)).connect(3, this.mView.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperty goneMargin(int i, int i2) {
        switch (i) {
            case 1:
                this.mParams.goneLeftMargin = i2;
                return this;
            case 2:
                this.mParams.goneRightMargin = i2;
                return this;
            case 3:
                this.mParams.goneTopMargin = i2;
                return this;
            case 4:
                this.mParams.goneBottomMargin = i2;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.goneStartMargin = i2;
                return this;
            case 7:
                this.mParams.goneEndMargin = i2;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty margin(int i, int i2) {
        switch (i) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i2;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i2;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i2;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i2;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                C16530kr.LJII(this.mParams, i2);
                return this;
            case 7:
                C16530kr.LJI(this.mParams, i2);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty transformPivot(float f, float f2) {
        this.mView.setPivotX(f);
        this.mView.setPivotY(f2);
        return this;
    }

    public ConstraintProperty translation(float f, float f2) {
        translationX(f);
        translationY(f2);
        return this;
    }

    public ConstraintProperty connect(int i, int i2, int i3, int i4) {
        switch (i) {
            case 1:
                if (i3 == 1) {
                    LayeredConstraintLayout.LayoutParams layoutParams = this.mParams;
                    layoutParams.leftToLeft = i2;
                    layoutParams.leftToRight = -1;
                } else if (i3 == 2) {
                    LayeredConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                    layoutParams2.leftToRight = i2;
                    layoutParams2.leftToLeft = -1;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Left to ");
                    throw new IllegalArgumentException(JBR.LJFF(LIZ, sideToString(i3), " undefined", LIZ));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i4;
                return this;
            case 2:
                if (i3 == 1) {
                    LayeredConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                    layoutParams3.rightToLeft = i2;
                    layoutParams3.rightToRight = -1;
                } else if (i3 == 2) {
                    LayeredConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                    layoutParams4.rightToRight = i2;
                    layoutParams4.rightToLeft = -1;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("right to ");
                    throw new IllegalArgumentException(JBR.LJFF(LIZ2, sideToString(i3), " undefined", LIZ2));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i4;
                return this;
            case 3:
                if (i3 == 3) {
                    LayeredConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                    layoutParams5.topToTop = i2;
                    layoutParams5.topToBottom = -1;
                    layoutParams5.baselineToBaseline = -1;
                } else if (i3 == 4) {
                    LayeredConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                    layoutParams6.topToBottom = i2;
                    layoutParams6.topToTop = -1;
                    layoutParams6.baselineToBaseline = -1;
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("right to ");
                    throw new IllegalArgumentException(JBR.LJFF(LIZ3, sideToString(i3), " undefined", LIZ3));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i4;
                return this;
            case 4:
                if (i3 == 4) {
                    LayeredConstraintLayout.LayoutParams layoutParams7 = this.mParams;
                    layoutParams7.bottomToBottom = i2;
                    layoutParams7.bottomToTop = -1;
                    layoutParams7.baselineToBaseline = -1;
                } else if (i3 == 3) {
                    LayeredConstraintLayout.LayoutParams layoutParams8 = this.mParams;
                    layoutParams8.bottomToTop = i2;
                    layoutParams8.bottomToBottom = -1;
                    layoutParams8.baselineToBaseline = -1;
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("right to ");
                    throw new IllegalArgumentException(JBR.LJFF(LIZ4, sideToString(i3), " undefined", LIZ4));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i4;
                return this;
            case 5:
                if (i3 == 5) {
                    LayeredConstraintLayout.LayoutParams layoutParams9 = this.mParams;
                    layoutParams9.baselineToBaseline = i2;
                    layoutParams9.bottomToBottom = -1;
                    layoutParams9.bottomToTop = -1;
                    layoutParams9.topToTop = -1;
                    layoutParams9.topToBottom = -1;
                } else {
                    if (i3 == 3) {
                        LayeredConstraintLayout.LayoutParams layoutParams10 = this.mParams;
                        layoutParams10.bottomToBottom = -1;
                        layoutParams10.bottomToTop = -1;
                        layoutParams10.topToTop = -1;
                        layoutParams10.topToBottom = -1;
                    } else if (i3 == 4) {
                        LayeredConstraintLayout.LayoutParams layoutParams11 = this.mParams;
                        layoutParams11.bottomToBottom = -1;
                        layoutParams11.bottomToTop = -1;
                        layoutParams11.topToTop = -1;
                        layoutParams11.topToBottom = -1;
                    }
                    return this;
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("right to ");
                throw new IllegalArgumentException(JBR.LJFF(LIZ5, sideToString(i3), " undefined", LIZ5));
            case 6:
                if (i3 == 6) {
                    LayeredConstraintLayout.LayoutParams layoutParams12 = this.mParams;
                    layoutParams12.startToStart = i2;
                    layoutParams12.startToEnd = -1;
                } else if (i3 == 7) {
                    LayeredConstraintLayout.LayoutParams layoutParams13 = this.mParams;
                    layoutParams13.startToEnd = i2;
                    layoutParams13.startToStart = -1;
                } else {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("right to ");
                    throw new IllegalArgumentException(JBR.LJFF(LIZ6, sideToString(i3), " undefined", LIZ6));
                }
                this.mParams.setMarginStart(i4);
                return this;
            case 7:
                if (i3 == 7) {
                    LayeredConstraintLayout.LayoutParams layoutParams14 = this.mParams;
                    layoutParams14.endToEnd = i2;
                    layoutParams14.endToStart = -1;
                } else if (i3 == 6) {
                    LayeredConstraintLayout.LayoutParams layoutParams15 = this.mParams;
                    layoutParams15.endToStart = i2;
                    layoutParams15.endToEnd = -1;
                } else {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("right to ");
                    throw new IllegalArgumentException(JBR.LJFF(LIZ7, sideToString(i3), " undefined", LIZ7));
                }
                this.mParams.setMarginEnd(i4);
                return this;
            default:
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(sideToString(i));
                LIZ8.append(" to ");
                throw new IllegalArgumentException(JBR.LJFF(LIZ8, sideToString(i3), " unknown", LIZ8));
        }
    }

    public ConstraintProperty center(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 >= 0) {
            if (i6 >= 0) {
                if (f > 0.0f && f <= 1.0f) {
                    if (i2 == 1 || i2 == 2) {
                        connect(1, i, i2, i3);
                        connect(2, i4, i5, i6);
                        this.mParams.horizontalBias = f;
                    } else if (i2 == 6 || i2 == 7) {
                        connect(6, i, i2, i3);
                        connect(7, i4, i5, i6);
                        this.mParams.horizontalBias = f;
                    } else {
                        connect(3, i, i2, i3);
                        connect(4, i4, i5, i6);
                        this.mParams.verticalBias = f;
                    }
                    return this;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public ConstraintProperty centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(1, i, i2, i3);
        connect(2, i4, i5, i6);
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperty centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(6, i, i2, i3);
        connect(7, i4, i5, i6);
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperty centerVertically(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(3, i, i2, i3);
        connect(4, i4, i5, i6);
        this.mParams.verticalBias = f;
        return this;
    }
}
