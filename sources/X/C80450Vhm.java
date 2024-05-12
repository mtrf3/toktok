package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* renamed from: X.Vhm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80450Vhm extends AnonymousClass038 {
    public final C19M LJLJJL;
    public final AccessibilityManager LJLJJLL;
    public final Rect LJLJL;

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.LJLJJLL;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.LJLJJL.show();
        } else {
            super.showDropDown();
        }
    }

    public final C80315Vfb LIZ() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof C80315Vfb) {
                return (C80315Vfb) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        C80315Vfb LIZ = LIZ();
        if (LIZ != null && LIZ.LLFZ) {
            return LIZ.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C80315Vfb LIZ = LIZ();
        if (LIZ != null && LIZ.LLFZ && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final <T extends ListAdapter & Filterable> void LIZIZ(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.LJLJJL.LJIILIIL(getAdapter());
    }

    public C80450Vhm(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.wf, 0), attributeSet, 0);
        this.LJLJL = new Rect();
        Context context2 = getContext();
        TypedArray LIZLLL = C80244VeS.LIZLLL(context2, attributeSet, new int[]{android.R.attr.inputType}, R.attr.wf, R.style.wa, new int[0]);
        if (LIZLLL.hasValue(0) && LIZLLL.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.LJLJJLL = (AccessibilityManager) C16880lQ.LLILL(context2, "accessibility");
        C19M c19m = new C19M(context2, null, R.attr.ap0, 0);
        this.LJLJJL = c19m;
        c19m.LLFF = true;
        c19m.LLFFF.setFocusable(true);
        c19m.LJLLLL = this;
        c19m.LLFFF.setInputMethodMode(2);
        c19m.LJIILIIL(getAdapter());
        c19m.LJLLLLLL = new C80451Vhn(this);
        LIZLLL.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            C80315Vfb LIZ = LIZ();
            int i3 = 0;
            if (adapter != null && LIZ != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C19M c19m = this.LJLJJL;
                if (!c19m.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c19m.LJLJI.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, LIZ);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable LIZ2 = this.LJLJJL.LIZ();
                if (LIZ2 != null) {
                    LIZ2.getPadding(this.LJLJL);
                    Rect rect = this.LJLJL;
                    i4 += rect.left + rect.right;
                }
                i3 = LIZ.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }
}
