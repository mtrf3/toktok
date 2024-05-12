package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VkV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80619VkV extends View {
    public static final /* synthetic */ int LLFZ = 0;
    public final T5S LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final Rect LJLJL;
    public VelocityTracker LJLJLJ;
    public final Scroller LJLJLLL;
    public final Scroller LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public int LJZI;
    public final List<C80620VkW> LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public final C61996OUu LLFF;
    public InterfaceC80621VkX LLFFF;
    public int LLFII;

    public final void LIZ() {
        if (this.LJLL.isFinished()) {
            this.LJLLLL = 0;
            int i = this.LJZI;
            int i2 = this.LJLJJI;
            int i3 = i - (i2 * ((int) (((i * 1.0f) / i2) + 0.5f)));
            if (i3 != 0) {
                this.LJLL.startScroll(0, 0, 0, i3, 300);
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.LJLJLLL;
        if (scroller.isFinished()) {
            scroller = this.LJLL;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.LJLLLLLL = currY;
        int i = currY - this.LJLLLL;
        this.LJLZ = i;
        LIZIZ(i);
        invalidate();
        this.LJLLLL = this.LJLLLLLL;
    }

    public final InterfaceC80621VkX getCallback() {
        return this.LLFFF;
    }

    public final int getLevel() {
        return this.LLFII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80619VkV(Context context) {
        super(context, null, R.attr.ju);
        new LinkedHashMap();
        T5S t5s = new T5S();
        this.LJLIL = t5s;
        int LIZIZ = C7MY.LIZIZ(40);
        this.LJLJJI = LIZIZ;
        this.LJLJJL = LIZIZ / 4;
        this.LJLJJLL = (LIZIZ * 3) / 4;
        this.LJLJL = new Rect();
        this.LJLJLLL = new Scroller(context, null);
        this.LJLL = new Scroller(context, C55953Lxd.LJIIIZ());
        this.LJLLL = 3;
        this.LJZL = new ArrayList();
        this.LLD = -1;
        this.LLFF = new C61996OUu(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.n_, R.attr.na, R.attr.nb}, R.attr.ju, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…nPicker, defStyleAttr, 0)");
        int i = obtainStyledAttributes.getInt(0, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getColor(1, 0);
        this.LJLJI = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        t5s.LIZ(i);
        t5s.setAntiAlias(true);
        t5s.setTextAlign(Paint.Align.LEFT);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLLI = viewConfiguration.getScaledTouchSlop();
        this.LJLLILLLL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLLJ = viewConfiguration.getScaledMaximumFlingVelocity() / 3;
    }

    public final void LIZIZ(int i) {
        int i2;
        int i3 = this.LJZI - i;
        this.LJZI = i3;
        if (i3 < 0) {
            i3 = 0;
        }
        int size = ((ArrayList) this.LJZL).size() - 1;
        int i4 = this.LJLJJI;
        int i5 = size * i4;
        if (i3 > i5) {
            i3 = i5;
        }
        this.LJZI = i3;
        int i6 = (int) (((i3 * 1.0f) / i4) + 0.5f);
        int i7 = this.LLD;
        if (i7 != i6) {
            if (i7 < 0) {
                this.LLD = i6;
            }
            InterfaceC80621VkX interfaceC80621VkX = this.LLFFF;
            if (interfaceC80621VkX != null) {
                interfaceC80621VkX.LIZ(this.LLFII, ((C80620VkW) ListProtector.get(this.LJZL, this.LLD)).LJLIL, ((C80620VkW) ListProtector.get(this.LJZL, i6)).LJLIL);
            }
            this.LLD = i6;
        }
        int i8 = this.LJZI;
        int i9 = this.LJLJJI;
        int i10 = i8 % i9;
        if ((i10 > this.LJLJJLL || i10 < this.LJLJJL) && (i2 = i8 / i9) != this.LLF) {
            this.LLF = i2;
            this.LLFF.LIZ(0);
        }
        invalidate();
    }

    public final void LIZJ(List<String> list) {
        int i;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<String> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            this.LJLIL.getTextBounds(next, 0, next.length(), this.LJLJL);
            arrayList.add(Integer.valueOf(this.LJLJL.width()));
        }
        Integer num = (Integer) ORZ.LLFZ(arrayList);
        if (num != null) {
            i = num.intValue();
        }
        this.LL = i;
        int LIZIZ = C7MY.LIZIZ(60);
        if (i < LIZIZ) {
            i = LIZIZ;
        }
        this.LL = i;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i < 0) {
            if (this.LJZI <= 0) {
                return false;
            }
        } else if (this.LJZI >= (((ArrayList) this.LJZL).size() - 1) * this.LJLJJI) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float width = getWidth() / 2.0f;
        int i2 = this.LJZI;
        int i3 = this.LJLJJI;
        int i4 = i2 / i3;
        float f = i2 % i3;
        canvas.translate(0.0f, -f);
        int i5 = -2;
        while (true) {
            boolean z = true;
            if (i5 >= 4) {
                break;
            }
            int i6 = i5 + i4;
            if (i6 >= 0 && i6 < ((ArrayList) this.LJZL).size()) {
                String str = ((C80620VkW) ListProtector.get(this.LJZL, i6)).LJLILLLLZI;
                if (f >= this.LJLJJL ? f <= this.LJLJJLL || i5 != 1 : i5 != 0) {
                    z = false;
                }
                T5S t5s = this.LJLIL;
                if (z) {
                    i = this.LJLILLLLZI;
                } else {
                    i = this.LJLJI;
                }
                t5s.setColor(i);
                C1A7.LJII(canvas, str, width, (this.LJLJJI / 2.0f) + ((i5 + 2) * r2 * 1.0f), this.LJLIL, this.LJLJL);
            }
            i5++;
        }
        canvas.translate(0.0f, f);
        if (1 == this.LJLLL && this.LJLJLLL.isFinished()) {
            LIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r2 != 3) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80619VkV.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCallback(InterfaceC80621VkX interfaceC80621VkX) {
        this.LLFFF = interfaceC80621VkX;
    }

    public final void setCurrentFocusItem$tux_theme_release(Object data) {
        o.LJIIIZ(data, "data");
        Iterator it = ((ArrayList) this.LJZL).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(((C80620VkW) it.next()).LJLIL, data)) {
                if (i >= 0) {
                    this.LLD = i;
                    this.LJZI = i * this.LJLJJI;
                    invalidate();
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void setLevel(int i) {
        this.LLFII = i;
    }

    public final void LIZLLL(List<C80620VkW> list, List<String> list2) {
        this.LJLJLLL.forceFinished(true);
        this.LJLL.forceFinished(true);
        ((ArrayList) this.LJZL).clear();
        ((ArrayList) this.LJZL).addAll(list);
        if (((int) (((this.LJZI * 1.0f) / this.LJLJJI) + 0.5f)) >= ((ArrayList) this.LJZL).size()) {
            this.LJZI = (((ArrayList) this.LJZL).size() - 1) * this.LJLJJI;
        }
        if (list2 != null) {
            LIZJ(list2);
        } else {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(((C80620VkW) it.next()).LJLILLLLZI);
            }
            LIZJ(arrayList);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.LL, 5 * this.LJLJJI);
    }
}
