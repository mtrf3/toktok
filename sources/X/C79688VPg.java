package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: X.VPg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79688VPg extends RecyclerView {
    public final WeakReference<VNU> LLLF;
    public final WeakReference<LynxBaseUI> LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;

    public final void LJLJJL(boolean z) {
        VPV vpv;
        HashSet<Integer> hashSet;
        WeakReference<VNU> weakReference = this.LLLF;
        if (weakReference == null || this.LLLFF == null) {
            return;
        }
        VNU vnu = weakReference.get();
        LynxBaseUI lynxBaseUI = this.LLLFF.get();
        if (!z || vnu == null || lynxBaseUI == null || (vpv = vnu.LJLJJLL) == null || (hashSet = vpv.LJIILJJIL) == null) {
            return;
        }
        hashSet.add(Integer.valueOf(lynxBaseUI.getSign()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLLFZ) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLFFI) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public C79688VPg(Context context, LynxBaseUI lynxBaseUI) {
        super(context, null);
        this.LLLFFI = true;
        if (context != null && (context instanceof VNU)) {
            this.LLLF = new WeakReference<>(context);
            this.LLLFF = new WeakReference<>(lynxBaseUI);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        WeakReference<VNU> weakReference = this.LLLF;
        if (weakReference != null && weakReference.get() != null && this.LLLF.get().LJLJLLL != null && this.LLLF.get().LJLJLLL.LJLILLLLZI) {
            return super.requestChildRectangleOnScreen(view, rect, false);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        LJLJJL(dispatchNestedPreScroll);
        return dispatchNestedPreScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        boolean LJJ = super.LJJ(i, i2, i3, iArr, iArr2);
        LJLJJL(LJJ);
        return LJJ;
    }
}
