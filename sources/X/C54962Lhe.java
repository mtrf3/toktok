package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Lhe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54962Lhe extends C80769Vmv {
    public final boolean LLJJIJIL;
    public C56597MJd LLJJJ;
    public final C1HQ<C0C3, LPV> LLJJJIL;

    public static /* synthetic */ void getForceFlag$annotations() {
    }

    @Override // X.C80769Vmv
    public void setOnPageChangeListener(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.C80769Vmv
    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (adapter instanceof C56597MJd) {
            return ((C56597MJd) adapter).LJLILLLLZI;
        }
        o.LJIIIIZZ(adapter, "adapter");
        return adapter;
    }

    @Override // X.C80769Vmv
    public int getCurrentItem() {
        return super.getCurrentItem();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54962Lhe(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LLJJJIL = new C1HQ<>();
        this.LLJJIJIL = C012403c.LIZ(context) == 1;
    }

    @Override // X.C80769Vmv
    public final void LJFF(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        LPV lpv = new LPV(this, listener);
        this.LLJJJIL.put(listener, lpv);
        super.LJFF(lpv);
    }

    @Override // X.C80769Vmv
    public final void LJJIIJ(C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        LPV remove = this.LLJJJIL.remove(listener);
        if (remove != null) {
            super.LJJIIJ(remove);
        }
    }

    public final int LJJIJIIJIL(int i) {
        int i2;
        if (this.LLJJIJIL) {
            PagerAdapter adapter = getAdapter();
            if (adapter != null) {
                i2 = adapter.getCount();
            } else {
                i2 = 0;
            }
            if (i >= 0 && i < i2) {
                return (i2 - i) - 1;
            }
            return i;
        }
        return i;
    }

    @Override // X.C80769Vmv, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.C80769Vmv, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        try {
            return super.onTouchEvent(event);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.C80769Vmv
    public void setAdapter(PagerAdapter pagerAdapter) {
        C56597MJd c56597MJd = this.LLJJJ;
        if (c56597MJd != null) {
            try {
                c56597MJd.LJLILLLLZI.LJJII(c56597MJd.LJLJI);
            } catch (Throwable unused) {
            }
            this.LLJJJ = null;
        }
        if (this.LLJJIJIL && pagerAdapter != null) {
            C56597MJd c56597MJd2 = new C56597MJd(pagerAdapter);
            this.LLJJJ = c56597MJd2;
            pagerAdapter = c56597MJd2;
        }
        super.setAdapter(pagerAdapter);
        if (this.LLJJIJIL) {
            setCurrentItem(0, false);
        }
    }

    @Override // X.C80769Vmv
    public void setCurrentItem(int i) {
        super.setCurrentItem(LJJIJIIJIL(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54962Lhe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLJJJIL = new C1HQ<>();
        this.LLJJIJIL = C012403c.LIZ(context) == 1;
    }

    @Override // X.C80769Vmv
    public final void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(LJJIJIIJIL(i), z);
    }
}
