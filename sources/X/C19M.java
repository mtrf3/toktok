package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.lang.reflect.Method;

/* renamed from: X.19M, reason: invalid class name */
/* loaded from: classes.dex */
public class C19M implements AnonymousClass112 {
    public static final Method LLFII;
    public static final Method LLFZ;
    public static final Method LLI;
    public final Context LJLIL;
    public ListAdapter LJLILLLLZI;
    public C03G LJLJI;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public C03W LJLLL;
    public View LJLLLL;
    public AdapterView.OnItemClickListener LJLLLLLL;
    public final Handler LL;
    public Rect LLF;
    public boolean LLFF;
    public final C013103j LLFFF;
    public int LJLJJI = -2;
    public int LJLJJL = -2;
    public final int LJLJLJ = 1002;
    public final int LJLLJ = Integer.MAX_VALUE;
    public final C03Z LJLZ = new C03Z(this);
    public final C03Y LJZ = new View.OnTouchListener() { // from class: X.03Y
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                C013103j c013103j = C19M.this.LLFFF;
                if (c013103j != null && c013103j.isShowing() && x >= 0 && x < C19M.this.LLFFF.getWidth() && y >= 0 && y < C19M.this.LLFFF.getHeight()) {
                    C19M c19m = C19M.this;
                    c19m.LL.postDelayed(c19m.LJLZ, 250L);
                    return false;
                }
                return false;
            }
            if (action != 1) {
                return false;
            }
            C19M c19m2 = C19M.this;
            c19m2.LL.removeCallbacks(c19m2.LJLZ);
            return false;
        }
    };
    public final C03X LJZI = new AbsListView.OnScrollListener() { // from class: X.03X
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C19M.this.LLFFF.getInputMethodMode() == 2 || C19M.this.LLFFF.getContentView() == null) {
                return;
            }
            C19M c19m = C19M.this;
            c19m.LL.removeCallbacks(c19m.LJLZ);
            C19M.this.LJLZ.run();
        }
    };
    public final C03V LJZL = new Runnable() { // from class: X.03V
        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                C03G c03g = C19M.this.LJLJI;
                if (c03g != null) {
                    c03g.setListSelectionHidden(true);
                    c03g.requestLayout();
                }
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public final Rect LLD = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                LLFII = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                LLI = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                LLFZ = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public final Drawable LIZ() {
        return this.LLFFF.getBackground();
    }

    public final int LJIIIIZZ() {
        if (!this.LJLJLLL) {
            return 0;
        }
        return this.LJLJL;
    }

    @Override // X.AnonymousClass112
    public final void dismiss() {
        this.LLFFF.dismiss();
        this.LLFFF.setContentView(null);
        this.LJLJI = null;
        this.LL.removeCallbacks(this.LJLZ);
    }

    @Override // X.AnonymousClass112
    public final boolean isShowing() {
        return this.LLFFF.isShowing();
    }

    @Override // X.AnonymousClass112
    public final void show() {
        int i;
        boolean z;
        int maxAvailableHeight;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        C03G c03g;
        int i4;
        if (this.LJLJI == null) {
            C03G LJIILJJIL = LJIILJJIL(this.LJLIL, !this.LLFF);
            this.LJLJI = LJIILJJIL;
            LJIILJJIL.setAdapter(this.LJLILLLLZI);
            this.LJLJI.setOnItemClickListener(this.LJLLLLLL);
            this.LJLJI.setFocusable(true);
            this.LJLJI.setFocusableInTouchMode(true);
            this.LJLJI.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: X.03U
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j) {
                    C03G c03g2;
                    if (i5 != -1 && (c03g2 = C19M.this.LJLJI) != null) {
                        c03g2.setListSelectionHidden(false);
                    }
                }
            });
            this.LJLJI.setOnScrollListener(this.LJZI);
            this.LLFFF.setContentView(this.LJLJI);
        } else {
            this.LLFFF.getContentView();
        }
        Drawable background = this.LLFFF.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.LLD);
            Rect rect = this.LLD;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.LJLJLLL) {
                this.LJLJL = -i6;
            }
        } else {
            this.LLD.setEmpty();
            i = 0;
        }
        if (this.LLFFF.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.LJLLLL;
        int i7 = this.LJLJL;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = LLFZ;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.LLFFF, view, Integer.valueOf(i7), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.LLFFF.getMaxAvailableHeight(view, i7);
        } else {
            maxAvailableHeight = this.LLFFF.getMaxAvailableHeight(view, i7, z);
        }
        if (this.LJLJJI == -1) {
            i3 = maxAvailableHeight + i;
        } else {
            int i8 = this.LJLJJL;
            if (i8 != -2) {
                if (i8 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    int i9 = this.LJLIL.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.LLD;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i10 = this.LJLIL.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.LLD;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            int LIZ = this.LJLJI.LIZ(makeMeasureSpec, maxAvailableHeight);
            if (LIZ > 0) {
                i2 = this.LJLJI.getPaddingBottom() + this.LJLJI.getPaddingTop() + i;
            } else {
                i2 = 0;
            }
            i3 = LIZ + i2;
        }
        if (this.LLFFF.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C07W.LIZIZ(this.LLFFF, this.LJLJLJ);
        if (this.LLFFF.isShowing()) {
            if (!C16330kX.LIZIZ(this.LJLLLL)) {
                return;
            }
            int i11 = this.LJLJJL;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.LJLLLL.getWidth();
            }
            int i12 = this.LJLJJI;
            if (i12 == -1) {
                if (z2) {
                    C013103j c013103j = this.LLFFF;
                    if (this.LJLJJL == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    c013103j.setWidth(i4);
                    this.LLFFF.setHeight(0);
                } else {
                    i3 = -1;
                    C013103j c013103j2 = this.LLFFF;
                    if (this.LJLJJL == -1) {
                        i5 = -1;
                    }
                    c013103j2.setWidth(i5);
                    this.LLFFF.setHeight(-1);
                }
            } else if (i12 != -2) {
                i3 = i12;
            }
            this.LLFFF.setOutsideTouchable(true);
            C013103j c013103j3 = this.LLFFF;
            View view2 = this.LJLLLL;
            int i13 = this.LJLJJLL;
            int i14 = this.LJLJL;
            if (i11 < 0) {
                i11 = -1;
            }
            if (i3 < 0) {
                i3 = -1;
            }
            c013103j3.update(view2, i13, i14, i11, i3);
            return;
        }
        int i15 = this.LJLJJL;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.LJLLLL.getWidth();
        }
        int i16 = this.LJLJJI;
        if (i16 == -1) {
            i3 = -1;
        } else if (i16 != -2) {
            i3 = i16;
        }
        this.LLFFF.setWidth(i15);
        this.LLFFF.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = LLFII;
            if (method2 != null) {
                try {
                    method2.invoke(this.LLFFF, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.LLFFF.setIsClippedToScreen(true);
        }
        this.LLFFF.setOutsideTouchable(true);
        this.LLFFF.setTouchInterceptor(this.LJZ);
        if (this.LJLLI) {
            C07W.LIZ(this.LLFFF, this.LJLL);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = LLI;
            if (method3 != null) {
                try {
                    method3.invoke(this.LLFFF, this.LLF);
                } catch (Exception unused3) {
                }
            }
        } else {
            this.LLFFF.setEpicenterBounds(this.LLF);
        }
        C16880lQ.LLJLIL(this.LLFFF, this.LJLLLL, this.LJLJJLL, this.LJLJL, this.LJLLILLLL);
        this.LJLJI.setSelection(-1);
        if ((!this.LLFF || this.LJLJI.isInTouchMode()) && (c03g = this.LJLJI) != null) {
            c03g.setListSelectionHidden(true);
            c03g.requestLayout();
        }
        if (!this.LLFF) {
            this.LL.post(this.LJZL);
        }
    }

    @Override // X.AnonymousClass112
    public final C03G LIZLLL() {
        return this.LJLJI;
    }

    public final int LJIIIZ() {
        return this.LJLJJLL;
    }

    public final void LJFF(Drawable drawable) {
        this.LLFFF.setBackgroundDrawable(drawable);
    }

    public final void LJI(int i) {
        this.LJLJL = i;
        this.LJLJLLL = true;
    }

    public final void LJIIJ(int i) {
        this.LJLJJLL = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.03W] */
    public void LJIILIIL(ListAdapter listAdapter) {
        C03W c03w = this.LJLLL;
        if (c03w == null) {
            this.LJLLL = new DataSetObserver() { // from class: X.03W
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    if (C19M.this.isShowing()) {
                        C19M.this.show();
                    }
                }

                @Override // android.database.DataSetObserver
                public final void onInvalidated() {
                    C19M.this.dismiss();
                }
            };
        } else {
            ListAdapter listAdapter2 = this.LJLILLLLZI;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c03w);
            }
        }
        this.LJLILLLLZI = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.LJLLL);
        }
        C03G c03g = this.LJLJI;
        if (c03g != null) {
            c03g.setAdapter(this.LJLILLLLZI);
        }
    }

    public final void LJIILL(int i) {
        Drawable background = this.LLFFF.getBackground();
        if (background != null) {
            background.getPadding(this.LLD);
            Rect rect = this.LLD;
            this.LJLJJL = rect.left + rect.right + i;
            return;
        }
        this.LJLJJL = i;
    }

    public C03G LJIILJJIL(Context context, boolean z) {
        return new C03G(context, z);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.03Y] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.03X] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.03V] */
    public C19M(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LJLIL = context;
        this.LL = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset}, i, i2);
        this.LJLJJLL = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.LJLJL = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.LJLJLLL = true;
        }
        obtainStyledAttributes.recycle();
        C013103j c013103j = new C013103j(context, attributeSet, i, i2);
        this.LLFFF = c013103j;
        c013103j.setInputMethodMode(1);
    }
}
