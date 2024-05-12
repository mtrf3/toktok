package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VYM extends VYP {
    public LinkedList<VYZ> LJLJLLL;
    public HashMap<VYZ, VYO> LJLL;
    public LinkedList<VYY> LJLLI;
    public HashMap<VYY, VYN> LJLLILLLL;

    @Override // X.VYP
    public final float LIZ() {
        return 0.0f;
    }

    public final C79916VYa getBean() {
        return null;
    }

    public final VYU getListener() {
        return null;
    }

    public final VYK getLongTimeClickRunnable() {
        return null;
    }

    public final int getXOffset() {
        return 0;
    }

    public final void setListener(VYU vyu) {
    }

    public final void setLongTimeClickRunnable(VYK vyk) {
        o.LJIIIZ(vyk, "<set-?>");
    }

    static {
        C16880lQ.LJLLJ(VYM.class);
    }

    @Override // X.VYP
    public final float LIZIZ() {
        return getParentWidth() + (((float) getRequest().LLZZZZ()) / getScaleRuler());
    }

    @Override // X.VYP
    public final void LIZJ() {
        super.LIZJ();
        throw null;
    }

    public final LinkedList<VYY> getFilterBeans() {
        return this.LJLLI;
    }

    public final HashMap<VYY, VYN> getFilterViewMap() {
        return this.LJLLILLLL;
    }

    public final LinkedList<VYZ> getSlotBeans() {
        return this.LJLJLLL;
    }

    public final HashMap<VYZ, VYO> getSlotViewMap() {
        return this.LJLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float f = 2;
        canvas.drawLine(0.0f, getHopeHeight() - f, getHopeWidth(), getHopeHeight() - f, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        event.getX();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    getHandler().removeCallbacks(null);
                }
            } else {
                getHandler().removeCallbacks(null);
            }
            return true;
        }
        throw null;
    }

    public final void setFilterBeans(LinkedList<VYY> linkedList) {
        o.LJIIIZ(linkedList, "<set-?>");
        this.LJLLI = linkedList;
    }

    public final void setFilterViewMap(HashMap<VYY, VYN> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.LJLLILLLL = hashMap;
    }

    public final void setSlotBeans(LinkedList<VYZ> linkedList) {
        o.LJIIIZ(linkedList, "<set-?>");
        this.LJLJLLL = linkedList;
    }

    public final void setSlotViewMap(HashMap<VYZ, VYO> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.LJLL = hashMap;
    }

    public final void LIZLLL(float f, long j) {
        this.LJLJJI = f;
        this.LJLJJL = j;
        LIZJ();
        Iterator<VYZ> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            VYO vyo = this.LJLL.get(it.next());
            if (vyo != null) {
                vyo.LIZLLL(f, j);
            }
        }
        Iterator<VYY> it2 = this.LJLLI.iterator();
        while (it2.hasNext()) {
            VYN vyn = this.LJLLILLLL.get(it2.next());
            if (vyn != null) {
                vyn.LIZLLL(f, j);
            }
        }
        invalidate();
    }

    @Override // X.VYP, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Iterator<VYZ> it = this.LJLJLLL.iterator();
        while (it.hasNext()) {
            VYO vyo = this.LJLL.get(it.next());
            if (vyo != null) {
                vyo.measure(i, i2);
            }
        }
        Iterator<VYY> it2 = this.LJLLI.iterator();
        while (it2.hasNext()) {
            VYN vyn = this.LJLLILLLL.get(it2.next());
            if (vyn != null) {
                vyn.measure(i, i2);
            }
        }
        View.MeasureSpec.makeMeasureSpec((int) (getParentWidth() / 2), 1073741824);
        View.MeasureSpec.makeMeasureSpec((int) getHopeHeight(), 1073741824);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getParentWidth();
        getHopeHeight();
        throw null;
    }
}
