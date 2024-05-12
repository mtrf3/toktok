package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HvV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC45629HvV extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean LJLIL;
    public final ViewGroup.MarginLayoutParams LJLILLLLZI;
    public final ViewGroup.MarginLayoutParams LJLJI;
    public RecyclerView LJLJJI;
    public C45700Hwe LJLJJL;
    public float LJLJJLL;
    public MyMediaModel LJLJL;
    public int LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
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

    public final C45700Hwe getPreviewVideoClipAdapter() {
        C45700Hwe c45700Hwe = this.LJLJJL;
        if (c45700Hwe == null) {
            return null;
        }
        return c45700Hwe;
    }

    public final C45874HzS getScrollCoverView() {
        C45874HzS realScrollView = (C45874HzS) LIZ(R.id.ip6);
        o.LJIIIIZZ(realScrollView, "realScrollView");
        return realScrollView;
    }

    public final int getScrollRange() {
        if (LIZ(R.id.et1).getWidth() > 0) {
            return LIZ(R.id.et1).getWidth();
        }
        return KL2.LJIIJJI(getContext()) - SFS.LJI(32.0d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.LJLIL = true;
    }

    public final MyMediaModel getCurrentSelectTimeMedia() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTreeObserverOnGlobalLayoutListenerC45629HvV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        float f;
        this.LJLJLLL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.dqy, C16880lQ.LLZIL(getContext()), this);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.ewo).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        this.LJLILLLLZI = marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2 = LIZ(R.id.ip6).getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        this.LJLJI = marginLayoutParams2;
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        ((C72559Sdn) LIZ(R.id.et1)).setRadius(SFS.LJI(6.0d));
        View findViewById = findViewById(R.id.dn7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.frame_recycler_view)");
        this.LJLJJI = (RecyclerView) findViewById;
        float scrollRange = getScrollRange();
        this.LJLJJLL = scrollRange;
        this.LJLJLJ = (int) (scrollRange / C32151Nz.LJIIZILJ(Float.valueOf(30.0f)));
        if (this.LJLJJLL % O6R.LJJIIZ(C32151Nz.LJIIZILJ(r3)) < O6R.LJJIIZ(C32151Nz.LJIIZILJ(r3)) / 2.0f) {
            f = this.LJLJJLL / this.LJLJLJ;
        } else {
            int i = this.LJLJLJ + 1;
            this.LJLJLJ = i;
            f = this.LJLJJLL / i;
        }
        int i2 = this.LJLJLJ;
        Context context2 = getContext();
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
        if (LJJIFFI != null) {
            Lifecycle lifecycle = LJJIFFI.getLifecycle();
            o.LJIIIIZZ(context2, "context");
            o.LJIIIIZZ(lifecycle, "lifecycle");
            this.LJLJJL = new C45700Hwe(true, f, i2, null, context2, lifecycle, 8);
            RecyclerView recyclerView = this.LJLJJI;
            if (recyclerView != null) {
                recyclerView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.VideoClipView$initView$1$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                    public final boolean LJIJJLI() {
                        return false;
                    }
                };
                linearLayoutManager.LLJJIII(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                C45700Hwe c45700Hwe = this.LJLJJL;
                if (c45700Hwe != null) {
                    recyclerView.setAdapter(c45700Hwe);
                    C40171ht c40171ht = new C40171ht();
                    c40171ht.LJFF = 300L;
                    recyclerView.setItemAnimator(c40171ht);
                    return;
                }
                o.LJIJI("frameAdapter");
                throw null;
            }
            o.LJIJI("frameRecyclerView");
            throw null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZIZ(int i, int i2) {
        if (this.LJLIL) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.LJLJI;
            if (marginLayoutParams != null) {
                marginLayoutParams.width = SFS.LJI(32.0d) + i;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = this.LJLJI;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginStart(i2);
            }
            LIZ(R.id.ip6).setLayoutParams(this.LJLJI);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = this.LJLILLLLZI;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMarginStart(i2);
            }
            LIZ(R.id.ewo).setLayoutParams(this.LJLILLLLZI);
            requestLayout();
        }
    }
}
