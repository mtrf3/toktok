package X;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.google.android.material.internal.CheckableImageButton$SavedState;
import o3.h0;

/* renamed from: X.VgO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80364VgO extends C012503d implements Checkable {
    public static final int[] LJLJL = {R.attr.state_checked};
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.LJLJJI);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CheckableImageButton$SavedState checkableImageButton$SavedState = new CheckableImageButton$SavedState(super.onSaveInstanceState());
        checkableImageButton$SavedState.LJLIL = this.LJLJJI;
        return checkableImageButton$SavedState;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LJLJJI;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.LJLJJI) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + 1), LJLJL);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CheckableImageButton$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CheckableImageButton$SavedState checkableImageButton$SavedState = (CheckableImageButton$SavedState) parcelable;
        super.onRestoreInstanceState(checkableImageButton$SavedState.mSuperState);
        setChecked(checkableImageButton$SavedState.LJLIL);
    }

    public void setCheckable(boolean z) {
        if (this.LJLJJL != z) {
            this.LJLJJL = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.LJLJJL && this.LJLJJI != z) {
            this.LJLJJI = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.LJLJJLL) {
            super.setPressed(z);
        }
    }

    public C80364VgO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.ahc);
    }

    public C80364VgO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJL = true;
        this.LJLJJLL = true;
        h0.LJIJI(this, new C80363VgN(this));
    }
}
