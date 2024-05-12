package Y;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes4.dex */
public class ARunnableS0S0204000_3 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;

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
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$1() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$2() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$3() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public static final void run$0(ARunnableS0S0204000_3 aRunnableS0S0204000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0204000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0204000_3 aRunnableS0S0204000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0204000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0204000_3 aRunnableS0S0204000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0204000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S0204000_3 aRunnableS0S0204000_3) {
        boolean LIZ;
        try {
            aRunnableS0S0204000_3.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S0204000_3(android.view.View r3, int r4, int r5, android.view.View r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.i2 = r4
            r1.i3 = r5
            r0 = 0
            r1.i4 = r0
            r1.i5 = r0
            r1.l1 = r6
        L13:
            r1.<init>()
            return
        L17:
            r1 = r2
            r1.l0 = r3
            r0 = 0
            r1.i2 = r0
            r0 = 4
            r1.i3 = r0
            r1.i4 = r4
            r1.i5 = r5
            r1.l1 = r6
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S0204000_3.<init>(android.view.View, int, int, android.view.View, int):void");
    }

    public ARunnableS0S0204000_3(Object obj, int i, int i2, int i3, int i4, Object obj2, int i5) {
        this.$t = i5;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
        this.i5 = i4;
        this.l1 = obj2;
    }
}
