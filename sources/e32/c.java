package e32;

import X.C0C3;
import X.C16880lQ;
import X.C78719Uux;
import X.C79862VVy;
import X.VZ7;
import X.VZ8;
import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public final class c extends FrameLayout implements C0C3 {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public final List<View> LLFII;
    public final C79862VVy LLFZ;
    public final LinearLayout LLI;
    public VZ7 LLIFFJFJJ;
    public C0C3 LLII;
    public boolean LLIIII;
    public final List<LynxUI> LLIIIILZ;
    public final ARunnableS50S0100000_14 LLIIIJ;
    public Method LLIIIL;
    public Field LLIIIZ;

    public final void LIZJ() {
        int i;
        if (this.LLIFFJFJJ != null) {
            Iterator it = ((ArrayList) this.LLFII).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setBackground(LIZ(this.LLD));
            }
            int i2 = this.LLF;
            if (i2 >= 0 && i2 < ((ArrayList) this.LLFII).size()) {
                i = this.LLF;
            } else {
                i = 0;
            }
            if (((ArrayList) this.LLFII).size() > 0) {
                ((View) ListProtector.get(this.LLFII, i)).setBackground(LIZ(this.LL));
                this.LLFF = this.LLFZ.getCurrentItem();
            }
        }
    }

    public final boolean LIZLLL() {
        if (this.LLIIII && this.LJLLLL && "normal".equals(this.LJLLJ) && ((CopyOnWriteArrayList) this.LLIIIILZ).size() == 2) {
            return true;
        }
        return false;
    }

    public final void LJ() {
        try {
            if (this.LLIIIZ == null) {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                this.LLIIIZ = declaredField;
                declaredField.setAccessible(true);
            }
            this.LLIIIZ.set(this.LLFZ, Boolean.TRUE);
        } catch (Throwable unused) {
        }
    }

    public final void LJII() {
        int i;
        LJFF(this.LJLJL, this.LJLJLJ, this.LJLLJ, this.LJLJLLL);
        boolean z = this.LJLZ;
        this.LJLZ = z;
        C79862VVy c79862VVy = this.LLFZ;
        if (c79862VVy != null) {
            c79862VVy.setScrollable(z);
        }
        if (this.LLIFFJFJJ == null) {
            this.LLIFFJFJJ = new VZ7(this);
            this.LLFZ.addOnPageChangeListener(this);
            this.LLFZ.setAdapter(this.LLIFFJFJJ);
        }
        int i2 = this.LLF;
        if (i2 < 0 || i2 >= ((CopyOnWriteArrayList) this.LLIIIILZ).size()) {
            this.LLF = 0;
        }
        if (this.LJLLLL) {
            i = (this.LJLIL / 2) + this.LLF;
        } else {
            i = this.LLF;
        }
        boolean z2 = this.LJZI;
        try {
            LJ();
            if (this.LLIIIL == null) {
                Class cls = Boolean.TYPE;
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, cls, cls);
                this.LLIIIL = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.LLIIIL.invoke(this.LLFZ, Integer.valueOf(i), Boolean.valueOf(z2), Boolean.TRUE);
        } catch (Throwable unused) {
            this.LLFZ.setCurrentItem(i, z2);
        }
        if (this.LJLLLLLL) {
            LJIIIIZZ();
        }
    }

    public final void LJIIIIZZ() {
        removeCallbacks(this.LLIIIJ);
        postDelayed(this.LLIIIJ, this.LJLJJL);
    }

    public int getCurrentItem() {
        return this.LLFZ.getCurrentItem();
    }

    public c(Context context) {
        super(context, null, 0);
        this.LJLIL = 5000;
        this.LJLILLLLZI = 5;
        this.LJLJI = 20;
        this.LJLJJI = 20;
        this.LJLJJL = 5000;
        this.LJLJJLL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJLJL = 10;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLL = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = 1;
        this.LJLLJ = "normal";
        this.LJLLL = true;
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        this.LJLZ = true;
        this.LJZ = true;
        this.LJZI = true;
        this.LJZL = Color.argb(128, 0, 0, 0);
        this.LL = Color.argb(255, 255, 255, 255);
        this.LLD = Color.argb(89, 255, 255, 255);
        this.LLF = 0;
        this.LLFF = 0;
        this.LLFFF = 0;
        this.LLIIII = false;
        this.LLIIIILZ = new CopyOnWriteArrayList();
        this.LLIIIJ = new ARunnableS50S0100000_14(this, 150);
        this.LLFII = new ArrayList();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.due, this, true);
        C79862VVy c79862VVy = (C79862VVy) LLLLIILL.findViewById(R.id.agb);
        this.LLFZ = c79862VVy;
        this.LLI = (LinearLayout) LLLLIILL.findViewById(R.id.bbh);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(c79862VVy, new VZ8(this, c79862VVy.getContext()));
        } catch (Exception e) {
            LLog.LIZLLL(4, "Banner", e.getMessage());
        }
    }

    public static final GradientDrawable LIZ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public final void LJI(int i) {
        VZ7 vz7;
        this.LLF = i;
        if (LJIIIZ(this.LLFZ.getCurrentItem()) == i && (vz7 = this.LLIFFJFJJ) != null && vz7.getCount() > 0) {
            return;
        }
        VZ7 vz72 = this.LLIFFJFJJ;
        if (vz72 != null && i < vz72.getCount()) {
            this.LLFZ.post(new ARunnableS18S0101000_14(i, this, 15));
        } else {
            this.LLFZ.postDelayed(new ARunnableS50S0100000_14(this, 149), 200L);
        }
    }

    public final int LJIIIZ(int i) {
        if (((CopyOnWriteArrayList) this.LLIIIILZ).size() == 0) {
            return i;
        }
        if (this.LJLLLL) {
            int i2 = i - (this.LJLIL / 2);
            int abs = Math.abs(i2) % ((CopyOnWriteArrayList) this.LLIIIILZ).size();
            if (i2 < 0) {
                if (abs == 0) {
                    return abs;
                }
                return ((CopyOnWriteArrayList) this.LLIIIILZ).size() - abs;
            }
            return abs;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLLLLLL) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                LJIIIIZZ();
            } else if (action == 0) {
                removeCallbacks(this.LLIIIJ);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        C0C3 c0c3 = this.LLII;
        if (c0c3 != null) {
            c0c3.onPageScrollStateChanged(i);
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C0C3 c0c3 = this.LLII;
        if (c0c3 != null) {
            c0c3.onPageSelected(LJIIIZ(i));
        }
        if (this.LJLLL) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJLJI, this.LJLJJI);
            int i2 = this.LJLILLLLZI;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.LJLJI, this.LJLJJI);
            int i3 = this.LJLILLLLZI;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
            int LJIIIZ = LJIIIZ(this.LLFF);
            int LJIIIZ2 = LJIIIZ(i);
            if (((CopyOnWriteArrayList) this.LLIIIILZ).size() == 0) {
                LJIIIZ2 = 0;
            }
            if (!((ArrayList) this.LLFII).isEmpty()) {
                List<View> list = this.LLFII;
                if (LJIIIZ >= 0 && LJIIIZ < ((ArrayList) list).size()) {
                    List<View> list2 = this.LLFII;
                    if (LJIIIZ2 >= 0 && LJIIIZ2 < ((ArrayList) list2).size()) {
                        ((View) ListProtector.get(this.LLFII, LJIIIZ)).setBackground(LIZ(this.LLD));
                        ((View) ListProtector.get(this.LLFII, LJIIIZ)).setLayoutParams(layoutParams2);
                        ((View) ListProtector.get(this.LLFII, LJIIIZ2)).setBackground(LIZ(this.LL));
                        ((View) ListProtector.get(this.LLFII, LJIIIZ2)).setLayoutParams(layoutParams);
                        this.LLFF = i;
                    }
                }
            }
        }
    }

    public void setLayerTextureType(int i) {
        this.LLFZ.setLayerType(i, null);
    }

    public void setOnPageChangeListener(C0C3 c0c3) {
        this.LLII = c0c3;
    }

    public void setOverflow(int i) {
        boolean z = false;
        if (i == 0) {
            this.LLFZ.setLayerType(0, null);
        } else {
            z = true;
        }
        setClipChildren(z);
    }

    public void setTwoItemCircularSwipe(boolean z) {
        this.LLIIII = z;
    }

    public final void LIZIZ(int i, View view) {
        int LJIIIZ;
        List<LynxUI> list;
        View view2;
        if (!(view instanceof ViewGroup) || view.findViewWithTag("swiper_lynx_view_tag") != null || (LJIIIZ = LJIIIZ(i)) < 0 || (list = this.LLIIIILZ) == null || ((CopyOnWriteArrayList) list).size() == 0 || LJIIIZ >= ((CopyOnWriteArrayList) this.LLIIIILZ).size() || (view2 = ((LynxUI) ListProtector.get(this.LLIIIILZ, LJIIIZ)).mView) == null) {
            return;
        }
        if (view2.getParent() instanceof ViewGroup) {
            C16880lQ.LJLLL(view2, (ViewGroup) view2.getParent());
        }
        ((ViewGroup) view).addView(view2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x006f, code lost:
    
        if (r4 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0056, code lost:
    
        if (r4 >= 0) goto L24;
     */
    @Override // X.C0C3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r8, float r9, int r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e32.c.onPageScrolled(int, float, int):void");
    }

    public final void LJFF(int i, int i2, String str, int i3) {
        int i4;
        VZ7 vz7 = this.LLIFFJFJJ;
        if (vz7 != null) {
            vz7.notifyDataSetChanged();
        }
        if (str.equals("coverflow") || str.equals("flat-coverflow")) {
            this.LLFZ.setClipToPadding(false);
            int i5 = this.LLFFF / 5;
            if (i2 >= 0 && i3 >= 0) {
                this.LLFZ.setPadding(i2 + i, 0, i3 + i, 0);
            } else {
                this.LLFZ.setPadding(i5, 0, i5, 0);
            }
            this.LLFZ.setPageMargin(i);
            this.LLFZ.setOffscreenPageLimit(2);
            if (str.equals("coverflow")) {
                this.LLFZ.setPageTransformer(false, new C78719Uux());
                return;
            }
            return;
        }
        if (str.equals("multi-pages")) {
            this.LLFZ.setClipToPadding(false);
            int i6 = this.LJLL;
            if (i6 >= 0 && (i4 = this.LJLLI) >= 0) {
                this.LLFZ.setPadding(i6, 0, i4, 0);
            }
            this.LLFZ.setPageMargin(i);
            this.LLFZ.setOffscreenPageLimit(1);
            return;
        }
        this.LLFZ.setPageMargin(i);
        ViewGroup.LayoutParams layoutParams = this.LLFZ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        this.LLFZ.setOffscreenPageLimit(1);
        this.LLFZ.setPageTransformer(false, null);
    }
}
