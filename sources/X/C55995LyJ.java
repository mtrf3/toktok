package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LyJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55995LyJ extends C81334Vw2 {
    public C80794VnK LLIL;
    public boolean LLILII;
    public RecyclerView LLILIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        return super.dispatchTouchEvent(ev);
    }

    @Override // X.C81334Vw2, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (!this.LLILII) {
            return false;
        }
        C80794VnK c80794VnK = this.LLIL;
        if (c80794VnK != null) {
            o.LJI(c80794VnK);
            if (c80794VnK.getAdapter() != null) {
                C80794VnK c80794VnK2 = this.LLIL;
                o.LJI(c80794VnK2);
                PagerAdapter adapter = c80794VnK2.getAdapter();
                if (adapter == null || adapter.getCount() != 0) {
                    C80794VnK c80794VnK3 = this.LLIL;
                    o.LJI(c80794VnK3);
                    if (c80794VnK3.getCurrentItem() != 0) {
                        return false;
                    }
                }
            }
        }
        RecyclerView recyclerView = this.LLILIL;
        if (recyclerView != null) {
            o.LJI(recyclerView);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            o.LJI(linearLayoutManager);
            if (linearLayoutManager.LLIL() != 0) {
                return false;
            }
        }
        if (!super.onInterceptTouchEvent(ev)) {
            return false;
        }
        return true;
    }

    @Override // X.C81334Vw2, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LLILII && super.onTouchEvent(ev)) {
            return true;
        }
        return false;
    }

    public final void setCanTouch(boolean z) {
        this.LLILII = z;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.LLILIL = recyclerView;
    }

    public final void setViewPager(C80794VnK c80794VnK) {
        this.LLIL = c80794VnK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55995LyJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LLILII = true;
    }
}
