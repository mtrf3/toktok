package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashSet;

/* renamed from: X.TDv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74295TDv extends AbstractC019505v {
    public java.util.Set<Integer> mIdSet;
    public View[] mViews;

    public void invalidateHelper() {
        this.mViews = null;
    }

    public void onViewAdded(View view) {
    }

    public void onViewRemoved(View view) {
    }

    @Override // X.AbstractC019505v
    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public C74295TDv(Context context) {
        super(context);
        this.mIdSet = new HashSet();
    }

    @Override // X.AbstractC019505v
    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
            for (int i = 0; i < this.mCount; i++) {
                this.mViews[i] = constraintLayout.getViewById(this.mIds[i]);
            }
        }
        return this.mViews;
    }

    public boolean isReferenced(int i) {
        if (this.mIds != null && this.mIdSet.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC019505v
    public void setReferencedIds(int[] iArr) {
        super.setReferencedIds(iArr);
        if (iArr != null && iArr.length > 0) {
            this.mIdSet = new HashSet();
            for (int i : iArr) {
                this.mIdSet.add(Integer.valueOf(i));
            }
        }
    }

    public C74295TDv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIdSet = new HashSet();
    }

    public C74295TDv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIdSet = new HashSet();
    }

    public static void fixReferencedIds(ConstraintLayout constraintLayout, int i, int... iArr) {
        if (constraintLayout == null || iArr == null || iArr.length == 0) {
            return;
        }
        View findViewById = constraintLayout.findViewById(i);
        if (!(findViewById instanceof AbstractC019505v)) {
            return;
        }
        ((AbstractC019505v) findViewById).setReferencedIds(iArr);
    }
}
