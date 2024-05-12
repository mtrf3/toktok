package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VVw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79860VVw extends ViewPager {
    public boolean LJLIL;
    public InterfaceC79857VVt LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public final Class<?> LJLJJLL;
    public boolean LJLJL;
    public final HashMap<C0C3, C79861VVx> LJLJLJ;

    public final Field getIsUnableToDrag() {
        Field field = null;
        try {
            Class<?> cls = this.LJLJJLL;
            if (cls == null) {
                return null;
            }
            field = cls.getDeclaredField("mIsUnableToDrag");
            return field;
        } catch (NoSuchFieldException unused) {
            LLog.LIZLLL(4, "Foldview#BaseViewPagerImpl", "no such field mIsUnableToDrag");
            return field;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C80773Vmz c80773Vmz = (C80773Vmz) super.getAdapter();
        if (c80773Vmz != null) {
            return c80773Vmz.LJLJI;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LJLJL) {
            return TB3.LIZ(adapter, currentItem, -1);
        }
        return currentItem;
    }

    public final C80773Vmz getReversingAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (!(adapter instanceof C80773Vmz)) {
            adapter = null;
        }
        return (C80773Vmz) adapter;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Method declaredMethod;
        super.onAttachedToWindow();
        try {
            Class<?> cls = this.LJLJJLL;
            if (cls != null && (declaredMethod = cls.getDeclaredMethod("populate", new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, new Object[0]);
            }
        } catch (NoSuchMethodException unused) {
            LLog.LIZLLL(4, "Foldview#BaseViewPagerImpl", "populate failed");
        }
    }

    public final int getMActivePointerId() {
        return this.LJLJJL;
    }

    public final boolean getMAllowHorizontalGesture() {
        return this.LJLIL;
    }

    public final InterfaceC79857VVt getMInterceptTouchEventListener() {
        return this.LJLILLLLZI;
    }

    public final float getMLastMotionX() {
        return this.LJLJI;
    }

    public final float getMLastMotionY() {
        return this.LJLJJI;
    }

    public final Class<?> getSuperclass() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79860VVw(Context context) {
        super(context);
        Class<? super Object> cls;
        o.LJIIJ(context, "context");
        this.LJLIL = true;
        this.LJLJJL = -1;
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass != null) {
            cls = superclass.getSuperclass();
        } else {
            cls = null;
        }
        this.LJLJJLL = cls;
        this.LJLJLJ = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(C0C3 listener) {
        o.LJIIJ(listener, "listener");
        C79861VVx c79861VVx = new C79861VVx(listener, this, super.getAdapter());
        this.LJLJLJ.put(listener, c79861VVx);
        super.addOnPageChangeListener(c79861VVx);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (!this.LJLIL) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            LLog.LIZLLL(4, "Foldview#BaseViewPagerImpl", e.toString());
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(C0C3 listener) {
        o.LJIIJ(listener, "listener");
        C79861VVx remove = this.LJLJLJ.remove(listener);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C80773Vmz(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
    }

    public final void setMActivePointerId(int i) {
        this.LJLJJL = i;
    }

    public final void setMAllowHorizontalGesture(boolean z) {
        this.LJLIL = z;
    }

    public final void setMInterceptTouchEventListener(InterfaceC79857VVt interfaceC79857VVt) {
        this.LJLILLLLZI = interfaceC79857VVt;
    }

    public final void setMLastMotionX(float f) {
        this.LJLJI = f;
    }

    public final void setMLastMotionY(float f) {
        this.LJLJJI = f;
    }

    public final void setRTL(boolean z) {
        this.LJLJL = z;
    }

    public final void setRTLMode(boolean z) {
        this.LJLJL = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean canScroll(View childView, boolean z, int i, int i2, int i3) {
        o.LJIIJ(childView, "childView");
        if (childView instanceof C79860VVw) {
            if (super.canScroll(childView, z, i, i2, i3) && ((C79860VVw) childView).LJLIL) {
                return true;
            }
            return false;
        }
        return super.canScroll(childView, z, i, i2, i3);
    }
}
