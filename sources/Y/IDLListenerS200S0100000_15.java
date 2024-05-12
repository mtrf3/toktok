package Y;

import X.C86904Y8u;
import X.Y8Z;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;

/* loaded from: classes16.dex */
public class IDLListenerS200S0100000_15 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS200S0100000_15 iDLListenerS200S0100000_15) {
        C86904Y8u c86904Y8u = (C86904Y8u) iDLListenerS200S0100000_15.l0;
        ViewPager viewPager = c86904Y8u.LJLJJI;
        if (viewPager == null || c86904Y8u.LJLJI == null) {
            return;
        }
        viewPager.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS200S0100000_15);
        C86904Y8u c86904Y8u2 = (C86904Y8u) iDLListenerS200S0100000_15.l0;
        ViewPager viewPager2 = c86904Y8u2.LJLJJI;
        View view = c86904Y8u2.LJLJI;
        if (viewPager2 == null || view == null) {
            return;
        }
        c86904Y8u2.LIZ(0.0f, viewPager2.getCurrentItem(), view);
    }

    public static final void onGlobalLayout$1(IDLListenerS200S0100000_15 iDLListenerS200S0100000_15) {
        ((FollowLiveVideoViewHolder) iDLListenerS200S0100000_15.l0).d.getViewTreeObserver().removeGlobalOnLayoutListener(iDLListenerS200S0100000_15);
        View view = ((FollowLiveVideoViewHolder) iDLListenerS200S0100000_15.l0).d;
        view.setTranslationX(FollowLiveVideoViewHolder.LLLLLLL(view));
    }

    public static final void onGlobalLayout$2(IDLListenerS200S0100000_15 iDLListenerS200S0100000_15) {
        Y8Z y8z = (Y8Z) iDLListenerS200S0100000_15.l0;
        if (y8z.LJII) {
            y8z.LJI = y8z.LIZ.getHeight();
            y8z.LJII = false;
        }
        Rect rect = new Rect();
        y8z.LIZ.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != y8z.LJ) {
            int height = y8z.LIZ.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                y8z.LJFF.height = (y8z.LJI - i2) + y8z.LIZJ + y8z.LIZLLL;
            } else {
                y8z.LJFF.height = y8z.LJI;
                if (y8z.LIZJ == 0) {
                    y8z.LIZJ = y8z.LIZIZ.getPaddingBottom();
                }
                if (y8z.LIZLLL == 0) {
                    y8z.LIZLLL = y8z.LIZIZ.getPaddingTop();
                }
            }
            y8z.LIZ.requestLayout();
            y8z.LJ = i;
        }
    }

    public IDLListenerS200S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
