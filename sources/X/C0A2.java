package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchFlowLayoutManager;
import com.ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;

/* renamed from: X.0A2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0A2 {
    public C0AW LJLIL;
    public RecyclerView LJLILLLLZI;
    public final C03270Ax LJLJI;
    public final C03270Ax LJLJJI;
    public C0AB LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;

    public boolean LJIJJLI() {
        return this instanceof SearchFlowLayoutManager;
    }

    public boolean LJIL() {
        return this instanceof SpannedGridLayoutManager;
    }

    public boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams != null;
    }

    public void LJJII(int i, int i2, C0AC c0ac, C0A0 c0a0) {
    }

    public void LJJIII(int i, C0A0 c0a0) {
    }

    public int LJJIIJ(C0AC c0ac) {
        return 0;
    }

    public int LJJIIJZLJL(C0AC c0ac) {
        return 0;
    }

    public int LJJIIZ(C0AC c0ac) {
        return 0;
    }

    public int LJJIIZI(C0AC c0ac) {
        return 0;
    }

    public int LJJIJ(C0AC c0ac) {
        return 0;
    }

    public int LJJIJIIJI(C0AC c0ac) {
        return 0;
    }

    public abstract RecyclerView.LayoutParams LJJIJL();

    public int LJJJJI(C0A7 c0a7, C0AC c0ac) {
        return -1;
    }

    public int LJJL(C0A7 c0a7, C0AC c0ac) {
        return -1;
    }

    public void LJJLIIJ(AbstractC029409q abstractC029409q) {
    }

    public void LJJLIL(RecyclerView recyclerView) {
    }

    public void LJJLJ(RecyclerView recyclerView, C0A7 c0a7) {
    }

    public View LJJLJLI(View view, int i, C0A7 c0a7, C0AC c0ac) {
        return null;
    }

    public void LJJZZIII(C0A7 c0a7, C0AC c0ac, View view, C17760mq c17760mq) {
    }

    public View LJL(int i, View view) {
        return null;
    }

    public void LJLI(int i, int i2) {
    }

    public void LJLIIIL() {
    }

    public void LJLIIL(int i, int i2) {
    }

    public void LJLIL(RecyclerView recyclerView, int i, int i2) {
    }

    public void LJLILLLLZI(int i) {
    }

    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
    }

    public void LJLJJL(C0AC c0ac) {
    }

    public void LJLJL(Parcelable parcelable) {
    }

    public Parcelable LJLJLJ() {
        return null;
    }

    public void LJLJLLL(int i) {
    }

    public int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        return 0;
    }

    public void LJZL(int i) {
    }

    public int LL(int i, C0A7 c0a7, C0AC c0ac) {
        return 0;
    }

    public boolean LLIFFJFJJ() {
        return false;
    }

    public void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
    }

    public boolean LLIIIJ() {
        return this instanceof SearchFlowLayoutManager;
    }

    public final int LJJJI() {
        C0AW c0aw = this.LJLIL;
        if (c0aw != null) {
            return c0aw.LJ();
        }
        return 0;
    }

    public final boolean LJJJJ() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null && recyclerView.LJLJL) {
            return true;
        }
        return false;
    }

    public final int LJJJJZ() {
        AbstractC029409q adapter;
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int LJJJJZI() {
        return C16310kV.LIZLLL(this.LJLILLLLZI);
    }

    public final void LJZ() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return C16310kV.LJ(recyclerView);
        }
        return 0;
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return C16310kV.LJFF(recyclerView);
        }
        return 0;
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public C0A2() {
        InterfaceC03260Aw interfaceC03260Aw = new InterfaceC03260Aw() { // from class: X.1BV
            @Override // X.InterfaceC03260Aw
            public final int LIZ() {
                C0A2 c0a2 = C0A2.this;
                return c0a2.LJLLLL - c0a2.getPaddingRight();
            }

            @Override // X.InterfaceC03260Aw
            public final int LIZLLL() {
                return C0A2.this.getPaddingLeft();
            }

            @Override // X.InterfaceC03260Aw
            public final View LIZIZ(int i) {
                return C0A2.this.LJJJ(i);
            }

            @Override // X.InterfaceC03260Aw
            public final int LIZJ(View view) {
                return C0A2.this.LJJJJJ(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
            }

            @Override // X.InterfaceC03260Aw
            public final int LJ(View view) {
                return C0A2.this.LJJJJLI(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
            }
        };
        InterfaceC03260Aw interfaceC03260Aw2 = new InterfaceC03260Aw() { // from class: X.1BW
            @Override // X.InterfaceC03260Aw
            public final int LIZ() {
                C0A2 c0a2 = C0A2.this;
                return c0a2.LJLLLLLL - c0a2.getPaddingBottom();
            }

            @Override // X.InterfaceC03260Aw
            public final int LIZLLL() {
                return C0A2.this.getPaddingTop();
            }

            @Override // X.InterfaceC03260Aw
            public final View LIZIZ(int i) {
                return C0A2.this.LJJJ(i);
            }

            @Override // X.InterfaceC03260Aw
            public final int LIZJ(View view) {
                return C0A2.this.LJJJJLL(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
            }

            @Override // X.InterfaceC03260Aw
            public final int LJ(View view) {
                return C0A2.this.LJJJJIZL(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };
        this.LJLJI = new C03270Ax(interfaceC03260Aw);
        this.LJLJJI = new C03270Ax(interfaceC03260Aw2);
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = false;
        this.LJLJLLL = true;
        this.LJLL = true;
    }

    public final void LJLLI() {
        int LJJJI = LJJJI();
        while (true) {
            LJJJI--;
            if (LJJJI >= 0) {
                this.LJLIL.LJIIJJI(LJJJI);
            } else {
                return;
            }
        }
    }

    public boolean LJJLIIIJ() {
        return this.LJLJLJ;
    }

    public static int LJJIZ(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
    }

    public static int LJJJLIIL(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.left;
    }

    public static int LJJJLL(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
    }

    public static int LJJJZ(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.right;
    }

    public static int LJJLI(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.top;
    }

    public final void LJIIZILJ(View view) {
        LJIJ(-1, view, false);
    }

    public void LJIJI(String str) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            recyclerView.LJIIL(str);
        }
    }

    public final void LJJIJIIJIL(C0A7 c0a7) {
        int LJJJI = LJJJI();
        while (true) {
            LJJJI--;
            if (LJJJI >= 0) {
                View LJJJ = LJJJ(LJJJI);
                RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(LJJJ);
                if (!LJJJJL.shouldIgnore()) {
                    if (LJJJJL.isInvalid() && !LJJJJL.isRemoved() && !this.LJLILLLLZI.LJLLILLLL.mHasStableIds) {
                        if (LJJJ(LJJJI) != null) {
                            this.LJLIL.LJIIJJI(LJJJI);
                        }
                        c0a7.LJIIIZ(LJJJJL);
                    } else {
                        LJJJ(LJJJI);
                        this.LJLIL.LIZJ(LJJJI);
                        c0a7.LJIIJ(LJJJ);
                        this.LJLILLLLZI.LJLJJLL.LIZLLL(LJJJJL);
                    }
                }
            } else {
                return;
            }
        }
    }

    public View LJJIJIL(int i) {
        int LJJJI = LJJJI();
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = LJJJ(i2);
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(LJJJ);
            if (LJJJJL != null && LJJJJL.getLayoutPosition() == i && !LJJJJL.shouldIgnore() && (this.LJLILLLLZI.LLJIJIL.LJI || !LJJJJL.isRemoved())) {
                return LJJJ;
            }
        }
        return null;
    }

    public RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new RecyclerView.LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new RecyclerView.LayoutParams(layoutParams);
    }

    public final View LJJJ(int i) {
        C0AW c0aw = this.LJLIL;
        if (c0aw != null) {
            return c0aw.LIZLLL(i);
        }
        return null;
    }

    public int LJJJJIZL(View view) {
        return LJJIZ(view) + view.getBottom();
    }

    public int LJJJJJ(View view) {
        return view.getLeft() - LJJJLIIL(view);
    }

    public int LJJJJJL(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int LJJJJL(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int LJJJJLI(View view) {
        return LJJJZ(view) + view.getRight();
    }

    public int LJJJJLL(View view) {
        return view.getTop() - LJJLI(view);
    }

    public void LJJLIIIJLJLI(int i) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            int LJ = recyclerView.LJLJJL.LJ();
            for (int i2 = 0; i2 < LJ; i2++) {
                recyclerView.LJLJJL.LIZLLL(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void LJJLIIIJLLLLLLLZ(int i) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView != null) {
            int LJ = recyclerView.LJLJJL.LJ();
            for (int i2 = 0; i2 < LJ; i2++) {
                recyclerView.LJLJJL.LIZLLL(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void LJJLL(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.LJLILLLLZI.canScrollVertically(-1) && !this.LJLILLLLZI.canScrollHorizontally(-1) && !this.LJLILLLLZI.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC029409q abstractC029409q = this.LJLILLLLZI.LJLLILLLL;
        if (abstractC029409q == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC029409q.getItemCount());
    }

    public final void LJLLILLLL(C0A7 c0a7) {
        int LJJJI = LJJJI();
        while (true) {
            LJJJI--;
            if (LJJJI >= 0) {
                if (!RecyclerView.LJJJJL(LJJJ(LJJJI)).shouldIgnore()) {
                    LJLLLL(LJJJI, c0a7);
                }
            } else {
                return;
            }
        }
    }

    public final void LJLLJ(C0A7 c0a7) {
        int size = c0a7.LIZ.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((RecyclerView.ViewHolder) ListProtector.get(c0a7.LIZ, i)).itemView;
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
            if (!LJJJJL.shouldIgnore()) {
                LJJJJL.setIsRecyclable(false);
                if (LJJJJL.isTmpDetached()) {
                    this.LJLILLLLZI.removeDetachedView(view, false);
                }
                AbstractC030109x abstractC030109x = this.LJLILLLLZI.LLIIL;
                if (abstractC030109x != null) {
                    abstractC030109x.LJIIIZ(LJJJJL);
                }
                LJJJJL.setIsRecyclable(true);
                RecyclerView.ViewHolder LJJJJL2 = RecyclerView.LJJJJL(view);
                LJJJJL2.mScrapContainer = null;
                LJJJJL2.mInChangeScrap = false;
                LJJJJL2.clearReturnedFromScrapFlag();
                c0a7.LJIIIZ(LJJJJL2);
            }
        }
        c0a7.LIZ.clear();
        ArrayList<RecyclerView.ViewHolder> arrayList = c0a7.LIZIZ;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.LJLILLLLZI.invalidate();
        }
    }

    public final void LLD(RecyclerView recyclerView) {
        LLFF(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void LLF(boolean z) {
        if (z != this.LJLL) {
            this.LJLL = z;
            this.LJLLI = 0;
            RecyclerView recyclerView = this.LJLILLLLZI;
            if (recyclerView != null) {
                recyclerView.LJLILLLLZI.LJIILIIL();
            }
        }
    }

    public final void LLFZ(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.LJLILLLLZI = null;
            this.LJLIL = null;
            this.LJLLLL = 0;
            this.LJLLLLLL = 0;
        } else {
            this.LJLILLLLZI = recyclerView;
            this.LJLIL = recyclerView.LJLJJL;
            this.LJLLLL = recyclerView.getWidth();
            this.LJLLLLLL = recyclerView.getHeight();
        }
        this.LJLLJ = 1073741824;
        this.LJLLL = 1073741824;
    }

    public final void LLIIIILZ(C0AB c0ab) {
        C0AB c0ab2 = this.LJLJJL;
        if (c0ab2 != null && c0ab != c0ab2 && c0ab2.LJ) {
            c0ab2.LJI();
        }
        this.LJLJJL = c0ab;
        RecyclerView recyclerView = this.LJLILLLLZI;
        c0ab.getClass();
        C0AE c0ae = recyclerView.LLIZLLLIL;
        c0ae.LJLJL.removeCallbacks(c0ae);
        c0ae.LJLJI.abortAnimation();
        c0ab.LIZIZ = recyclerView;
        c0ab.LIZJ = this;
        int i = c0ab.LIZ;
        if (i != -1) {
            recyclerView.LLJIJIL.LIZ = i;
            c0ab.LJ = true;
            c0ab.LIZLLL = true;
            c0ab.LJFF = recyclerView.LJLLJ.LJJIJIL(i);
            c0ab.LIZLLL();
            c0ab.LIZIZ.LLIZLLLIL.LIZIZ();
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void LJIJJ(Rect rect, View view) {
        RecyclerView recyclerView = this.LJLILLLLZI;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.LJJJJLL(view));
        }
    }

    public RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new RecyclerView.LayoutParams(context, attributeSet);
    }

    public final void LJJLIIIIJ(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.LJLILLLLZI != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.LJLILLLLZI.LJLLI;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void LJJZZI(View view, C17760mq c17760mq) {
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        if (LJJJJL != null && !LJJJJL.isRemoved() && !this.LJLIL.LJIIJ(LJJJJL.itemView)) {
            RecyclerView recyclerView = this.LJLILLLLZI;
            LJJZZIII(recyclerView.LJLILLLLZI, recyclerView.LLJIJIL, view, c17760mq);
        }
    }

    public final void LJLLL(View view, C0A7 c0a7) {
        C0AW c0aw = this.LJLIL;
        int indexOfChild = ((C28891Bl) c0aw.LIZ).LIZ.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (c0aw.LIZIZ.LJFF(indexOfChild)) {
                c0aw.LJIIL(view);
            }
            ((C28891Bl) c0aw.LIZ).LIZIZ(indexOfChild);
        }
        c0a7.LJIIIIZZ(view);
    }

    public final void LJLLLL(int i, C0A7 c0a7) {
        View LJJJ = LJJJ(i);
        if (LJJJ(i) != null) {
            this.LJLIL.LJIIJJI(i);
        }
        c0a7.LJIIIIZZ(LJJJ);
    }

    public final void LLFF(int i, int i2) {
        this.LJLLLL = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.LJLLJ = mode;
        if (mode == 0 && !RecyclerView.LLJLLIL) {
            this.LJLLLL = 0;
        }
        this.LJLLLLLL = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.LJLLL = mode2;
        if (mode2 == 0 && !RecyclerView.LLJLLIL) {
            this.LJLLLLLL = 0;
        }
    }

    public final void LLFII(int i, int i2) {
        int LJJJI = LJJJI();
        if (LJJJI == 0) {
            this.LJLILLLLZI.LJIIZILJ(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = LiveLayoutPreloadThreadPriority.DEFAULT;
        int i6 = LiveLayoutPreloadThreadPriority.DEFAULT;
        for (int i7 = 0; i7 < LJJJI; i7++) {
            View LJJJ = LJJJ(i7);
            Rect rect = this.LJLILLLLZI.LJLJLLL;
            RecyclerView.LJJJJLI(rect, LJJJ);
            int i8 = rect.left;
            if (i8 < i3) {
                i3 = i8;
            }
            int i9 = rect.right;
            if (i9 > i5) {
                i5 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i6) {
                i6 = i11;
            }
        }
        this.LJLILLLLZI.LJLJLLL.set(i3, i4, i5, i6);
        LLFFF(i, i2, this.LJLILLLLZI.LJLJLLL);
    }

    public static int LJJI(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public static boolean LJJLIIIJILLIZJL(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public final void LJIJ(int i, View view, boolean z) {
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        if (z || LJJJJL.isRemoved()) {
            C0B0 c0b0 = this.LJLILLLLZI.LJLJJLL;
            C03290Az orDefault = c0b0.LIZ.getOrDefault(LJJJJL, null);
            if (orDefault == null) {
                orDefault = C03290Az.LIZ();
                c0b0.LIZ.put(LJJJJL, orDefault);
            }
            orDefault.LIZ |= 1;
        } else {
            this.LJLILLLLZI.LJLJJLL.LIZLLL(LJJJJL);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (LJJJJL.wasReturnedFromScrap() || LJJJJL.isScrap()) {
            if (LJJJJL.isScrap()) {
                LJJJJL.unScrap();
            } else {
                LJJJJL.clearReturnedFromScrapFlag();
            }
            this.LJLIL.LIZIZ(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.LJLILLLLZI) {
            int LJIIIZ = this.LJLIL.LJIIIZ(view);
            if (i == -1) {
                i = this.LJLIL.LJ();
            }
            if (LJIIIZ != -1) {
                if (LJIIIZ != i) {
                    C0A2 c0a2 = this.LJLILLLLZI.LJLLJ;
                    View LJJJ = c0a2.LJJJ(LJIIIZ);
                    if (LJJJ != null) {
                        c0a2.LJJJ(LJIIIZ);
                        c0a2.LJLIL.LIZJ(LJIIIZ);
                        ViewGroup.LayoutParams layoutParams2 = LJJJ.getLayoutParams();
                        RecyclerView.ViewHolder LJJJJL2 = RecyclerView.LJJJJL(LJJJ);
                        if (LJJJJL2.isRemoved()) {
                            C0B0 c0b02 = c0a2.LJLILLLLZI.LJLJJLL;
                            C03290Az orDefault2 = c0b02.LIZ.getOrDefault(LJJJJL2, null);
                            if (orDefault2 == null) {
                                orDefault2 = C03290Az.LIZ();
                                c0b02.LIZ.put(LJJJJL2, orDefault2);
                            }
                            orDefault2.LIZ = 1 | orDefault2.LIZ;
                        } else {
                            c0a2.LJLILLLLZI.LJLJJLL.LIZLLL(LJJJJL2);
                        }
                        c0a2.LJLIL.LIZIZ(LJJJ, i, layoutParams2, LJJJJL2.isRemoved());
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Cannot move a child from non-existing index:");
                        LIZ.append(LJIIIZ);
                        LIZ.append(c0a2.LJLILLLLZI.toString());
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                LIZ2.append(this.LJLILLLLZI.indexOfChild(view));
                LIZ2.append(this.LJLILLLLZI.LJJIIZ());
                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
            }
        } else {
            this.LJLIL.LIZ(i, view, false);
            layoutParams.mInsetsDirty = true;
            C0AB c0ab = this.LJLJJL;
            if (c0ab != null && c0ab.LJ) {
                c0ab.LIZIZ.getClass();
                if (RecyclerView.LJJJJJ(view) == c0ab.LIZ) {
                    c0ab.LJFF = view;
                }
            }
        }
        if (layoutParams.mPendingInvalidate) {
            LJJJJL.itemView.invalidate();
            layoutParams.mPendingInvalidate = false;
        }
    }

    public final void LJJLIIIJL(int i, int i2, View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect LJJJJLL = this.LJLILLLLZI.LJJJJLL(view);
        int i3 = LJJJJLL.left + LJJJJLL.right + i;
        int i4 = LJJJJLL.top + LJJJJLL.bottom + i2;
        int LJJJIL = LJJJIL(this.LJLLLL, this.LJLLJ, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, LJIJJLI());
        int LJJJIL2 = LJJJIL(this.LJLLLLLL, this.LJLLL, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, LJIL());
        if (LLI(view, LJJJIL, LJJJIL2, layoutParams)) {
            view.measure(LJJJIL, LJJJIL2);
        }
    }

    public void LJJZ(C0A7 c0a7, C0AC c0ac, C17760mq c17760mq) {
        if (this.LJLILLLLZI.canScrollVertically(-1) || this.LJLILLLLZI.canScrollHorizontally(-1)) {
            c17760mq.LIZ(FileUtils.BUFFER_SIZE);
            c17760mq.LJJII(true);
        }
        if (this.LJLILLLLZI.canScrollVertically(1) || this.LJLILLLLZI.canScrollHorizontally(1)) {
            c17760mq.LIZ(4096);
            c17760mq.LJJII(true);
        }
        c17760mq.LJIILLIIL(C17730mn.LIZ(LJJL(c0a7, c0ac), LJJJJI(c0a7, c0ac), 0));
    }

    public void LJLJI(RecyclerView recyclerView, int i, int i2) {
        LJLILLLLZI(i);
    }

    public void LLFFF(int i, int i2, Rect rect) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        RecyclerView.LJFF(this.LJLILLLLZI, LJJI(i, paddingRight, C16300kU.LJ(this.LJLILLLLZI)), LJJI(i2, paddingBottom, C16300kU.LIZLLL(this.LJLILLLLZI)));
    }

    public static C0A1 LJJJLZIJ(Context context, AttributeSet attributeSet, int i, int i2) {
        C0A1 c0a1 = new C0A1();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, com.zhiliaoapp.musically.R.attr.acy, com.zhiliaoapp.musically.R.attr.acz, com.zhiliaoapp.musically.R.attr.ad0, com.zhiliaoapp.musically.R.attr.ad1, com.zhiliaoapp.musically.R.attr.ad2, com.zhiliaoapp.musically.R.attr.aky, com.zhiliaoapp.musically.R.attr.b7s, com.zhiliaoapp.musically.R.attr.bbw, com.zhiliaoapp.musically.R.attr.be3}, i, i2);
        c0a1.LIZ = obtainStyledAttributes.getInt(0, 1);
        c0a1.LIZIZ = obtainStyledAttributes.getInt(10, 1);
        c0a1.LIZJ = obtainStyledAttributes.getBoolean(9, false);
        c0a1.LIZLLL = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0a1;
    }

    public void LJLJJLL(int i, int i2, C0A7 c0a7, C0AC c0ac) {
        this.LJLILLLLZI.LJIIZILJ(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJLL(X.C0A7 r10, X.C0AC r11, int r12, android.os.Bundle r13) {
        /*
            r9 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r9.LJLILLLLZI
            r3 = 0
            if (r1 != 0) goto L6
            return r3
        L6:
            r0 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            if (r12 == r0) goto L3c
            r0 = 8192(0x2000, float:1.148E-41)
            if (r12 == r0) goto L10
        Lf:
            return r3
        L10:
            r2 = -1
            boolean r0 = r1.canScrollVertically(r2)
            if (r0 == 0) goto L3a
            int r1 = r9.LJLLLLLL
            int r0 = r9.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r9.getPaddingBottom()
            int r1 = r1 - r0
            int r5 = -r1
        L24:
            androidx.recyclerview.widget.RecyclerView r0 = r9.LJLILLLLZI
            boolean r0 = r0.canScrollHorizontally(r2)
            if (r0 == 0) goto L67
            int r1 = r9.LJLLLL
            int r0 = r9.getPaddingLeft()
            int r1 = r1 - r0
            int r0 = r9.getPaddingRight()
            int r1 = r1 - r0
            int r4 = -r1
            goto L62
        L3a:
            r5 = 0
            goto L24
        L3c:
            boolean r0 = r1.canScrollVertically(r8)
            if (r0 == 0) goto L69
            int r5 = r9.LJLLLLLL
            int r0 = r9.getPaddingTop()
            int r5 = r5 - r0
            int r0 = r9.getPaddingBottom()
            int r5 = r5 - r0
        L4e:
            androidx.recyclerview.widget.RecyclerView r0 = r9.LJLILLLLZI
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L67
            int r4 = r9.LJLLLL
            int r0 = r9.getPaddingLeft()
            int r4 = r4 - r0
            int r0 = r9.getPaddingRight()
            int r4 = r4 - r0
        L62:
            if (r5 != 0) goto L6b
            if (r4 != 0) goto L6b
            goto Lf
        L67:
            r4 = 0
            goto L62
        L69:
            r5 = 0
            goto L4e
        L6b:
            androidx.recyclerview.widget.RecyclerView r3 = r9.LJLILLLLZI
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.LJLIIL(r4, r5, r6, r7, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A2.LJLL(X.0A7, X.0AC, int, android.os.Bundle):boolean");
    }

    public final boolean LLI(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !this.LJLJLLL || !LJJLIIIJILLIZJL(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) || !LJJLIIIJILLIZJL(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return true;
        }
        return false;
    }

    public final boolean LLII(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (!this.LJLJLLL || !LJJLIIIJILLIZJL(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) || !LJJLIIIJILLIZJL(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r5 == 1073741824) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJJIL(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L17
            if (r7 < 0) goto L29
        L10:
            r5 = 1073741824(0x40000000, float:2.0)
        L12:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L17:
            if (r7 < 0) goto L1a
            goto L10
        L1a:
            if (r7 != r2) goto L1e
        L1c:
            r7 = r4
            goto L12
        L1e:
            if (r7 != r3) goto L31
            if (r5 == r1) goto L24
            if (r5 != r0) goto L27
        L24:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1c
        L27:
            r5 = 0
            goto L1c
        L29:
            if (r7 != r2) goto L31
            if (r5 == r1) goto L1c
            if (r5 == 0) goto L31
            if (r5 == r0) goto L1c
        L31:
            r5 = 0
            r7 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A2.LJJJIL(int, int, int, int, boolean):int");
    }

    public static void LJJLIIIJJI(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void LJJLIIIJJIZ(View view, int i, int i2, int i3, int i4) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        if ((r1.bottom - r5) > r7) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJLLLLLL(androidx.recyclerview.widget.RecyclerView r12, android.view.View r13, android.graphics.Rect r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            int r2 = r11.getPaddingLeft()
            int r4 = r11.getPaddingTop()
            int r3 = r11.LJLLLL
            int r0 = r11.getPaddingRight()
            int r3 = r3 - r0
            int r1 = r11.LJLLLLLL
            int r0 = r11.getPaddingBottom()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r14.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r8 = r13.getTop()
            int r0 = r14.top
            int r8 = r8 + r0
            int r0 = r13.getScrollY()
            int r8 = r8 - r0
            int r7 = r14.width()
            int r7 = r7 + r9
            int r0 = r14.height()
            int r0 = r0 + r8
            int r9 = r9 - r2
            r6 = 0
            int r2 = java.lang.Math.min(r6, r9)
            int r8 = r8 - r4
            int r5 = java.lang.Math.min(r6, r8)
            int r7 = r7 - r3
            int r4 = java.lang.Math.max(r6, r7)
            int r0 = r0 - r1
            int r1 = java.lang.Math.max(r6, r0)
            int r0 = r11.LJJJJZI()
            r3 = 1
            if (r0 != r3) goto Lab
            if (r4 == 0) goto La6
        L56:
            if (r5 == 0) goto La1
        L58:
            if (r16 == 0) goto L93
            android.view.View r10 = r12.getFocusedChild()
            if (r10 != 0) goto L61
        L60:
            return r6
        L61:
            int r8 = r11.getPaddingLeft()
            int r7 = r11.getPaddingTop()
            int r9 = r11.LJLLLL
            int r0 = r11.getPaddingRight()
            int r9 = r9 - r0
            int r2 = r11.LJLLLLLL
            int r0 = r11.getPaddingBottom()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.LJLILLLLZI
            android.graphics.Rect r1 = r0.LJLJLLL
            androidx.recyclerview.widget.RecyclerView.LJJJJLI(r1, r10)
            int r0 = r1.left
            int r0 = r0 - r4
            if (r0 >= r9) goto L60
            int r0 = r1.right
            int r0 = r0 - r4
            if (r0 <= r8) goto L60
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto L60
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r7) goto L93
            goto L60
        L93:
            if (r4 != 0) goto L97
            if (r5 == 0) goto L60
        L97:
            if (r15 == 0) goto L9d
            r12.scrollBy(r4, r5)
        L9c:
            return r3
        L9d:
            r12.LJLIIIL(r4, r5)
            goto L9c
        La1:
            int r5 = java.lang.Math.min(r8, r1)
            goto L58
        La6:
            int r4 = java.lang.Math.max(r2, r7)
            goto L56
        Lab:
            if (r2 == 0) goto Laf
        Lad:
            r4 = r2
            goto L56
        Laf:
            int r2 = java.lang.Math.min(r9, r4)
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0A2.LJLLLLLL(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }
}
