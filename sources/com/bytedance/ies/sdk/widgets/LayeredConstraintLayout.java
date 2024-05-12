package com.bytedance.ies.sdk.widgets;

import X.C018905p;
import X.C62850Ola;
import X.C65777Prh;
import X.C74295TDv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class LayeredConstraintLayout extends ConstraintLayout {
    public Map<Integer, View> _$_findViewCache;
    public final List<C74295TDv> mCompatConstraintHelpers;

    /* loaded from: classes13.dex */
    public static final class LayoutParams extends C018905p {
        public int layer;
        public int order;
        public int weight;

        private final void resolveWeight() {
            this.weight = (this.layer * 1000) + this.order;
        }

        public final int getLayer() {
            return this.layer;
        }

        public final int getOrder() {
            return this.order;
        }

        public final /* synthetic */ int getWeight$live_widget_release() {
            return this.weight;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(LayoutParams source) {
            super((C018905p) source);
            o.LJIIIZ(source, "source");
            setLayer(source.layer);
            setOrder(source.order);
        }

        public final void setLayer(int i) {
            this.layer = i;
            resolveWeight();
        }

        public final void setOrder(int i) {
            this.order = i;
            resolveWeight();
        }

        public final /* synthetic */ void setWeight$live_widget_release(int i) {
            this.weight = i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(C018905p source) {
            super(source);
            o.LJIIIZ(source, "source");
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(Context c, AttributeSet attributeSet) {
            super(c, attributeSet);
            o.LJIIIZ(c, "c");
            TypedArray obtainStyledAttributes = c.obtainStyledAttributes(attributeSet, new int[]{R.attr.ana, R.attr.anh});
            o.LJIIIIZZ(obtainStyledAttributes, "c.obtainStyledAttributes…dConstraintLayout_Layout)");
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                if (obtainStyledAttributes.getIndex(i) == 0) {
                    setLayer(obtainStyledAttributes.getInt(0, 0));
                } else if (obtainStyledAttributes.getIndex(i) == 1) {
                    setOrder(obtainStyledAttributes.getInt(1, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayeredConstraintLayout(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LayeredConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public C018905p generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    private final int getWeightInternal(View view) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof LayoutParams) && (layoutParams = (LayoutParams) layoutParams2) != null) {
            return layoutParams.getWeight$live_widget_release();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        addView(r7, getChildCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addViewByWeight(android.view.View r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L3d
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            boolean r0 = r5 instanceof com.bytedance.ies.sdk.widgets.LayeredConstraintLayout.LayoutParams
            if (r0 == 0) goto L36
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r5 = (com.bytedance.ies.sdk.widgets.LayeredConstraintLayout.LayoutParams) r5
            if (r5 == 0) goto L36
            int r4 = r6.getChildCount()
            r3 = 0
        L13:
            r2 = -1
            if (r3 >= r4) goto L2b
            android.view.View r1 = r6.getChildAt(r3)
            java.lang.String r0 = "getChildAt(i)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r1 = r6.getWeightInternal(r1)
            int r0 = r5.getWeight$live_widget_release()
            if (r1 <= r0) goto L45
            if (r3 != r2) goto L41
        L2b:
            int r0 = r6.getChildCount()
            r6.addView(r7, r0)
        L32:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L39
        L36:
            r6.addView(r7)
        L39:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L40
        L3d:
            r6.addView(r7)
        L40:
            return
        L41:
            r6.addView(r7, r3)
            goto L32
        L45:
            int r3 = r3 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.LayeredConstraintLayout.addViewByWeight(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        attachViewToParent(r7, getChildCount(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attach(android.view.View r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L7
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
        L7:
            boolean r0 = r5 instanceof com.bytedance.ies.sdk.widgets.LayeredConstraintLayout.LayoutParams
            if (r0 == 0) goto L33
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r5 = (com.bytedance.ies.sdk.widgets.LayeredConstraintLayout.LayoutParams) r5
            if (r5 == 0) goto L33
            int r4 = r6.getChildCount()
            r3 = 0
        L14:
            r2 = -1
            if (r3 >= r4) goto L2c
            android.view.View r1 = r6.getChildAt(r3)
            java.lang.String r0 = "getChildAt(i)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r1 = r6.getWeightInternal(r1)
            int r0 = r5.getWeight$live_widget_release()
            if (r1 <= r0) goto L38
            if (r3 != r2) goto L34
        L2c:
            int r0 = r6.getChildCount()
            r6.attachViewToParent(r7, r0, r5)
        L33:
            return
        L34:
            r6.attachViewToParent(r7, r3, r5)
            goto L33
        L38:
            int r3 = r3 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.LayeredConstraintLayout.attach(android.view.View):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void detach(View view) {
        if (view != null) {
            detachViewFromParent(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Iterator<C74295TDv> it = this.mCompatConstraintHelpers.iterator();
        while (it.hasNext()) {
            it.next().updatePreDraw(this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C018905p) {
            return new LayoutParams((C018905p) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        if (view == null) {
            return;
        }
        super.onViewAdded(view);
        if (view instanceof C74295TDv) {
            if (!this.mCompatConstraintHelpers.contains(view)) {
                this.mCompatConstraintHelpers.add(view);
            }
        } else {
            Iterator<C74295TDv> it = this.mCompatConstraintHelpers.iterator();
            while (it.hasNext()) {
                it.next().onViewAdded(view);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (view == null) {
            return;
        }
        super.onViewRemoved(view);
        if (!C65777Prh.LIZ(this.mCompatConstraintHelpers).remove(view)) {
            Iterator<C74295TDv> it = this.mCompatConstraintHelpers.iterator();
            while (it.hasNext()) {
                it.next().onViewRemoved(view);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public C018905p generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayeredConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.mCompatConstraintHelpers = new ArrayList();
    }

    public /* synthetic */ LayeredConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
