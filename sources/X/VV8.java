package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.os.Trace;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.xelement.LynxScrollView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VV8 extends RecyclerView {
    public final /* synthetic */ LynxScrollView LLLF;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LynxScrollView lynxScrollView = this.LLLF;
        VVH vvh = lynxScrollView.LJLLL;
        if (vvh != null) {
            VV8 vv8 = lynxScrollView.LJLLI;
            if (vv8 != null) {
                ViewTreeObserver viewTreeObserver = vv8.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnScrollChangedListener(vvh.LIZJ);
                }
                vvh.LIZJ = null;
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
        super.onDetachedFromWindow();
        this.LLLF.LJLLL = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC030109x itemAnimator = getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJIIZILJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        Boolean valueOf;
        AbstractC029409q adapter;
        if (isLayoutRequested()) {
            return;
        }
        Trace.beginSection("LynxScrollView recyclerview requestLayout");
        LynxScrollView lynxScrollView = this.LLLF;
        if (lynxScrollView.LJLZ) {
            return;
        }
        lynxScrollView.LJLZ = true;
        super.requestLayout();
        if (!isLayoutRequested()) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = this;
            post(new ARunnableS50S0100000_14(c68322mC, 252));
        }
        LynxScrollView lynxScrollView2 = this.LLLF;
        if (lynxScrollView2.LJZL) {
            Iterator<LynxBaseUI> it = lynxScrollView2.mChildren.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LynxBaseUI next = it.next();
                if (next instanceof LynxUI) {
                    T t = ((LynxUI) next).mView;
                    if (t == 0 || (valueOf = Boolean.valueOf(t.isLayoutRequested())) == null) {
                        break;
                    }
                    if (valueOf.booleanValue()) {
                        if (!LJJJLL() && (adapter = getAdapter()) != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
            }
            o.LJIIZILJ();
            throw null;
        }
        this.LLLF.LJLZ = false;
        Trace.endSection();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VV8(Context context, LynxScrollView lynxScrollView) {
        super(context, null);
        this.LLLF = lynxScrollView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (IllegalArgumentException e) {
            String str = this.LLLF.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scrollView onLayout. the error message:");
            LIZ.append(e.getMessage());
            LLog.LIZLLL(4, str, X1D.LIZIZ(LIZ));
        }
    }
}
