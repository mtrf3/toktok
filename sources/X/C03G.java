package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

/* renamed from: X.03G, reason: invalid class name */
/* loaded from: classes.dex */
public class C03G extends ListView {
    public final Rect LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final Field LJLJL;
    public C19G LJLJLJ;
    public boolean LJLJLLL;
    public final boolean LJLL;
    public boolean LJLLI;
    public C28561Ae LJLLILLLL;
    public C03F LJLLJ;

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLLJ = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.LJLLJ != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.LJLLI && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (this.LJLL || super.hasFocus()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (this.LJLL || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.LJLL || super.isFocused()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.LJLL && this.LJLJLLL) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    private void setSelectorEnabled(boolean z) {
        C19G c19g = this.LJLJLJ;
        if (c19g != null) {
            c19g.LJLILLLLZI = z;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.LJLIL.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.LJLIL);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.LJLLJ == null) {
            C03F c03f = new C03F(this);
            this.LJLLJ = c03f;
            post(c03f);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.LJLLI && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLJJLL = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C03F c03f = this.LJLLJ;
        if (c03f != null) {
            C03G c03g = c03f.LJLIL;
            c03g.LJLLJ = null;
            c03g.removeCallbacks(c03f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C19G c19g;
        if (drawable != null) {
            c19g = new C19G(drawable);
        } else {
            c19g = null;
        }
        this.LJLJLJ = c19g;
        super.setSelector(c19g);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.LJLILLLLZI = rect.left;
        this.LJLJI = rect.top;
        this.LJLJJI = rect.right;
        this.LJLJJL = rect.bottom;
    }

    public C03G(Context context, boolean z) {
        super(context, null, R.attr.aad);
        this.LJLIL = new Rect();
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLL = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.LJLJL = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final int LIZ(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            if (i6 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (1 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r8 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.view.MotionEvent r15, int r16) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03G.LIZIZ(android.view.MotionEvent, int):boolean");
    }
}
