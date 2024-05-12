package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.02f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C010102f extends LinearLayout {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.LJLILLLLZI != z) {
            if (!z || this.LJLIL) {
                this.LJLILLLLZI = z;
                setOrientation(z ? 1 : 0);
                if (z) {
                    i = 8388613;
                } else {
                    i = 80;
                }
                setGravity(i);
                View findViewById = findViewById(R.id.k8o);
                if (findViewById != null) {
                    if (z) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                    findViewById.setVisibility(i2);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.LJLIL != z) {
            this.LJLIL = z;
            if (!z && this.LJLILLLLZI) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public C010102f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vj});
        h0.LJIJ(this, context, new int[]{R.attr.vj}, attributeSet, obtainStyledAttributes, 0);
        this.LJLIL = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.LJLIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (r2 != false) goto L22;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            boolean r0 = r5.LJLIL
            r3 = 0
            if (r0 == 0) goto L16
            int r0 = r5.LJLJI
            if (r2 <= r0) goto L14
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L14
            r5.setStacked(r3)
        L14:
            r5.LJLJI = r2
        L16:
            boolean r0 = r5.LJLILLLLZI
            r4 = 1
            if (r0 != 0) goto Lc0
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto Lc0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L2a:
            super.onMeasure(r0, r7)
            boolean r0 = r5.LJLIL
            if (r0 == 0) goto Lbd
            boolean r0 = r5.LJLILLLLZI
            if (r0 != 0) goto Lbd
            int r1 = r5.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto Lbd
            r5.setStacked(r4)
        L43:
            super.onMeasure(r6, r7)
        L46:
            int r1 = r5.getChildCount()
            r4 = 0
        L4b:
            if (r4 >= r1) goto La3
            android.view.View r0 = r5.getChildAt(r4)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lba
            if (r4 < 0) goto La3
            android.view.View r1 = r5.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r0 = r5.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r0
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            int r1 = r1 + r0
            int r3 = r3 + r1
            boolean r0 = r5.LJLILLLLZI
            if (r0 == 0) goto Lb5
            int r2 = r4 + 1
            int r1 = r5.getChildCount()
        L7d:
            if (r2 >= r1) goto La3
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb2
            if (r2 < 0) goto La3
            android.view.View r0 = r5.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 + r0
        La2:
            int r3 = r3 + r2
        La3:
            int r0 = X.C16300kU.LIZLLL(r5)
            if (r0 == r3) goto Lb1
            r5.setMinimumHeight(r3)
            if (r7 != 0) goto Lb1
            super.onMeasure(r6, r7)
        Lb1:
            return
        Lb2:
            int r2 = r2 + 1
            goto L7d
        Lb5:
            int r2 = r5.getPaddingBottom()
            goto La2
        Lba:
            int r4 = r4 + 1
            goto L4b
        Lbd:
            if (r2 == 0) goto L46
            goto L43
        Lc0:
            r0 = r6
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010102f.onMeasure(int, int):void");
    }
}
