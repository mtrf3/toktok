package Y;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ARunnableS0S0104000_3 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i1;
        rect.bottom += this.i2;
        rect.left -= this.i3;
        rect.right += this.i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
        if (((View) this.l0).getParent() instanceof View) {
            ((View) ((View) this.l0).getParent()).setTouchDelegate(touchDelegate);
        }
    }

    public final void LIZ$1() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        rect.top += this.i1;
        rect.bottom += this.i2;
        rect.left += this.i3;
        rect.right += this.i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
        if (View.class.isInstance(((View) this.l0).getParent())) {
            ((View) ((View) this.l0).getParent()).setTouchDelegate(touchDelegate);
        }
    }

    public final void LIZ$2() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i1;
        rect.bottom += this.i2;
        rect.left -= this.i3;
        rect.right += this.i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
        if (View.class.isInstance(((View) this.l0).getParent())) {
            Object parent = ((View) this.l0).getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(touchDelegate);
        }
    }

    public final void LIZ$3() {
        View view = (View) this.l0;
        if (view == null || view.getParent() == null) {
            return;
        }
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i1;
        rect.bottom += this.i2;
        rect.left -= this.i3;
        rect.right += this.i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
        if (!View.class.isInstance(((View) this.l0).getParent())) {
            return;
        }
        ((View) ((View) this.l0).getParent()).setTouchDelegate(touchDelegate);
    }

    public static final void run$0(ARunnableS0S0104000_3 aRunnableS0S0104000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0104000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0104000_3 aRunnableS0S0104000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0104000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0104000_3 aRunnableS0S0104000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0104000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S0104000_3 aRunnableS0S0104000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0104000_3.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0104000_3(TuxTextView tuxTextView, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = tuxTextView;
        this.i1 = 0;
        this.i2 = i;
        this.i3 = 0;
        this.i4 = i2;
    }

    public ARunnableS0S0104000_3(Object obj, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }
}
