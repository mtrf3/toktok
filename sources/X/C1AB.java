package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1AB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AB extends AbstractC019505v implements C05U {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public float LJLJI;
    public View[] LJLJJI;

    @Override // X.C05U
    public final void LIZ() {
    }

    @Override // X.C05U
    public final void LIZIZ(int i) {
    }

    @Override // X.C05U
    public final void LIZJ() {
    }

    @Override // X.C05U
    public final void LIZLLL() {
    }

    public float getProgress() {
        return this.LJLJI;
    }

    @Override // X.AbstractC019505v
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.b38, R.attr.b3a});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.LJLIL = obtainStyledAttributes.getBoolean(index, this.LJLIL);
                } else if (index == 0) {
                    this.LJLILLLLZI = obtainStyledAttributes.getBoolean(index, this.LJLILLLLZI);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.LJLJI = f;
        int i = 0;
        if (this.mCount > 0) {
            this.LJLJJI = getViews((ConstraintLayout) getParent());
            while (i < this.mCount) {
                i++;
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                viewGroup.getChildAt(i);
                i++;
            }
        }
    }
}
