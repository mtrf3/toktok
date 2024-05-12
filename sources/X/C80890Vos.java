package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.tools.view.widget.AbstractLoadingLayout$SavedState;

/* renamed from: X.Vos, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80890Vos extends FrameLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public int LJLJJL;

    public View LIZ(Context context) {
        return null;
    }

    public View LIZIZ(Context context) {
        return null;
    }

    public View LIZJ(Context context, AttributeSet attributeSet) {
        return null;
    }

    public void LIZLLL(int i) {
    }

    public final void setListener(InterfaceC80892Vou interfaceC80892Vou) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = new AbstractLoadingLayout$SavedState(super.onSaveInstanceState());
        abstractLoadingLayout$SavedState.LJLIL = this.LJLJJL;
        return abstractLoadingLayout$SavedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AbstractLoadingLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = (AbstractLoadingLayout$SavedState) parcelable;
        setState(abstractLoadingLayout$SavedState.LJLIL);
        super.onRestoreInstanceState(abstractLoadingLayout$SavedState.getSuperState());
    }

    public final void setState(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            if (this.LJLJJL != i) {
                this.LJLJJL = i;
                LIZLLL(i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public C80890Vos(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = LIZJ(context, attributeSet);
        this.LJLJI = LIZ(context);
        this.LJLJJI = LIZIZ(context);
        View view = this.LJLILLLLZI;
        if (view != null) {
            addView(view);
        }
        View view2 = this.LJLJI;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.LJLJJI;
        if (view3 != null) {
            addView(view3);
        }
        setState(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view == this.LJLILLLLZI || view == this.LJLJI || view == this.LJLJJI) {
            super.addView(view, i, layoutParams);
        } else {
            if (getChildCount() <= 4) {
                super.addView(view, i, layoutParams);
                this.LJLIL = view;
                return;
            }
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
    }
}
