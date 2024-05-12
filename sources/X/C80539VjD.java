package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import o3.h0;

/* renamed from: X.VjD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80539VjD extends GridView {
    public final Calendar LJLIL;
    public final boolean LJLILLLLZI;

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ListAdapter getAdapter() {
        return (C80541VjF) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int LIZIZ;
        int width;
        int LIZIZ2;
        int width2;
        int i;
        int i2;
        super.onDraw(canvas);
        C80541VjF adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.LJLILLLLZI;
        C80546VjK c80546VjK = adapter2.LJLJJI;
        Long item = adapter2.getItem(adapter2.LIZIZ());
        Long item2 = adapter2.getItem(adapter2.LIZLLL());
        for (C15070iV<Long, Long> c15070iV : dateSelector.e()) {
            Long l = c15070iV.LIZ;
            if (l != null && c15070iV.LIZIZ != null) {
                long longValue = l.longValue();
                long longValue2 = c15070iV.LIZIZ.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                    boolean LIZJ = C80250VeY.LIZJ(this);
                    if (longValue < item.longValue()) {
                        LIZIZ = adapter2.LIZIZ();
                        if (LIZIZ % adapter2.LJLIL.LJLJI == 0) {
                            width = 0;
                        } else if (!LIZJ) {
                            width = getChildAt(LIZIZ - 1).getRight();
                        } else {
                            width = getChildAt(LIZIZ - 1).getLeft();
                        }
                    } else {
                        this.LJLIL.setTimeInMillis(longValue);
                        LIZIZ = (this.LJLIL.get(5) - 1) + adapter2.LIZIZ();
                        View childAt = getChildAt(LIZIZ);
                        width = (childAt.getWidth() / 2) + childAt.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        LIZIZ2 = Math.min(adapter2.LIZLLL(), getChildCount() - 1);
                        if ((LIZIZ2 + 1) % adapter2.LJLIL.LJLJI == 0) {
                            width2 = getWidth();
                        } else if (!LIZJ) {
                            width2 = getChildAt(LIZIZ2).getRight();
                        } else {
                            width2 = getChildAt(LIZIZ2).getLeft();
                        }
                    } else {
                        this.LJLIL.setTimeInMillis(longValue2);
                        LIZIZ2 = (this.LJLIL.get(5) - 1) + adapter2.LIZIZ();
                        View childAt2 = getChildAt(LIZIZ2);
                        width2 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                    }
                    int itemId = (int) adapter2.getItemId(LIZIZ2);
                    for (int itemId2 = (int) adapter2.getItemId(LIZIZ); itemId2 <= itemId; itemId2++) {
                        int numColumns = getNumColumns() * itemId2;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt3 = getChildAt(numColumns);
                        int top = childAt3.getTop() + c80546VjK.LIZ.LIZ.top;
                        int bottom = childAt3.getBottom() - c80546VjK.LIZ.LIZ.bottom;
                        if (!LIZJ) {
                            if (numColumns > LIZIZ) {
                                i = 0;
                            } else {
                                i = width;
                            }
                            if (LIZIZ2 > numColumns2) {
                                i2 = getWidth();
                            } else {
                                i2 = width2;
                            }
                        } else {
                            if (LIZIZ2 > numColumns2) {
                                i = 0;
                            } else {
                                i = width2;
                            }
                            if (numColumns > LIZIZ) {
                                i2 = getWidth();
                            } else {
                                i2 = width;
                            }
                        }
                        canvas.drawRect(i, top, i2, bottom, c80546VjK.LJII);
                    }
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C80541VjF) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%1$s must have its Adapter set to a %2$s", new Object[]{C16880lQ.LJLLILLLL(C80539VjD.class), C16880lQ.LJLLILLLL(C80541VjF.class)}));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().LIZIZ()) {
            super.setSelection(getAdapter2().LIZIZ());
        } else {
            super.setSelection(i);
        }
    }

    public C80539VjD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C80561VjZ.LJIIIIZZ(null);
        if (MaterialDatePicker.wl(getContext())) {
            setNextFocusLeftId(R.id.b3s);
            setNextFocusRightId(R.id.br1);
        }
        this.LJLILLLLZI = MaterialDatePicker.xl(R.attr.b23, getContext());
        h0.LJIJI(this, new C80271Vet());
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().LIZIZ()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().LIZIZ());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLILLLLZI) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, LiveLayoutPreloadThreadPriority.DEFAULT));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            if (i == 33) {
                setSelection(getAdapter2().LIZLLL());
                return;
            } else if (i == 130) {
                setSelection(getAdapter2().LIZIZ());
                return;
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
        }
        super.onFocusChanged(false, i, rect);
    }
}
