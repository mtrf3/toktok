package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.discover.adapter.AbstractLoadingLayout$SavedState;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Vor, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80889Vor extends FrameLayout {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public int LJLJJL;

    public View LIZ(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public View LIZIZ(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public View LIZJ(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    public void LIZLLL(int i) {
    }

    public final void setListener(InterfaceC80894Vow interfaceC80894Vow) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = new AbstractLoadingLayout$SavedState(super.onSaveInstanceState());
        abstractLoadingLayout$SavedState.state = this.LJLJJL;
        return abstractLoadingLayout$SavedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        o.LJIIIZ(state, "state");
        if (!(state instanceof AbstractLoadingLayout$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        AbstractLoadingLayout$SavedState abstractLoadingLayout$SavedState = (AbstractLoadingLayout$SavedState) state;
        setState(abstractLoadingLayout$SavedState.state);
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
        "state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.".toString();
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80889Vor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLILLLLZI = LIZJ(context, attributeSet, i);
        this.LJLJI = LIZ(context, attributeSet, i);
        this.LJLJJI = LIZIZ(context, attributeSet, i);
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
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
        if (child == this.LJLILLLLZI || child == this.LJLJI || child == this.LJLJJI) {
            super.addView(child, i, params);
        } else if (getChildCount() <= 4) {
            super.addView(child, i, params);
            this.LJLIL = child;
        } else {
            "LoadingLayout can only contain one direct custom child.".toString();
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
    }
}
