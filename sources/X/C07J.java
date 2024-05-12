package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.07J, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C07J implements View.OnTouchListener {
    public static final int LJLZ = ViewConfiguration.getTapTimeout();
    public final C07H LJLIL;
    public final Interpolator LJLILLLLZI;
    public final View LJLJI;
    public C07I LJLJJI;
    public final float[] LJLJJL;
    public final float[] LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final float[] LJLJLLL;
    public final float[] LJLL;
    public final float[] LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;

    public static float LIZIZ(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final void LIZLLL() {
        int i = 0;
        if (this.LJLLJ) {
            this.LJLLLL = false;
            return;
        }
        C07H c07h = this.LJLIL;
        c07h.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c07h.LJ);
        int i3 = c07h.LIZIZ;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c07h.LJIIIIZZ = i;
        c07h.LJII = c07h.LIZ(currentAnimationTimeMillis);
        c07h.LJI = currentAnimationTimeMillis;
    }

    public final boolean LJ() {
        ListView listView;
        int count;
        C07H c07h = this.LJLIL;
        float f = c07h.LIZLLL;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c07h.LIZJ);
        if (abs == 0 || (count = (listView = ((C28561Ae) this).LJZ).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
            return false;
        }
        return true;
    }

    public C07J(View view) {
        C07H c07h = new C07H();
        this.LJLIL = c07h;
        this.LJLILLLLZI = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.LJLJJL = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.LJLJJLL = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.LJLJLLL = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.LJLL = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.LJLLI = fArr5;
        this.LJLJI = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        fArr5[0] = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr4[0] = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        this.LJLJL = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr3[0] = 0.001f;
        this.LJLJLJ = LJLZ;
        c07h.LIZ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        c07h.LIZIZ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    public final float LIZJ(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.LJLJL;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.LJLLLL && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r1 != 3) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.07I] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            boolean r0 = r6.LJLLLLLL
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L1a
            if (r1 == r4) goto L16
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 3
            if (r1 == r0) goto L16
        L15:
            return r5
        L16:
            r6.LIZLLL()
            goto L15
        L1a:
            r6.LJLLL = r4
            r6.LJLLILLLL = r5
        L1e:
            float r2 = r8.getX()
            int r0 = r7.getWidth()
            float r1 = (float) r0
            android.view.View r0 = r6.LJLJI
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r6.LIZ(r2, r1, r0, r5)
            float r2 = r8.getY()
            int r0 = r7.getHeight()
            float r1 = (float) r0
            android.view.View r0 = r6.LJLJI
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r6.LIZ(r2, r1, r0, r4)
            X.07H r0 = r6.LJLIL
            r0.LIZJ = r3
            r0.LIZLLL = r1
            boolean r0 = r6.LJLLLL
            if (r0 != 0) goto L15
            boolean r0 = r6.LJ()
            if (r0 == 0) goto L15
            X.07I r0 = r6.LJLJJI
            if (r0 != 0) goto L61
            X.07I r0 = new X.07I
            r0.<init>()
            r6.LJLJJI = r0
        L61:
            r6.LJLLLL = r4
            r6.LJLLJ = r4
            boolean r0 = r6.LJLLILLLL
            if (r0 != 0) goto L78
            int r0 = r6.LJLJLJ
            if (r0 <= 0) goto L78
            android.view.View r3 = r6.LJLJI
            X.07I r2 = r6.LJLJJI
            long r0 = (long) r0
            X.C16300kU.LJIILIIL(r3, r2, r0)
        L75:
            r6.LJLLILLLL = r4
            goto L15
        L78:
            X.07I r0 = r6.LJLJJI
            r0.run()
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07J.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final float LIZ(float f, float f2, float f3, int i) {
        float interpolation;
        float LIZIZ = LIZIZ(this.LJLJJL[i] * f2, 0.0f, this.LJLJJLL[i]);
        float LIZJ = LIZJ(f2 - f, LIZIZ) - LIZJ(f, LIZIZ);
        if (LIZJ < 0.0f) {
            interpolation = -((AccelerateInterpolator) this.LJLILLLLZI).getInterpolation(-LIZJ);
        } else {
            if (LIZJ > 0.0f) {
                interpolation = ((AccelerateInterpolator) this.LJLILLLLZI).getInterpolation(LIZJ);
            }
            return 0.0f;
        }
        float LIZIZ2 = LIZIZ(interpolation, -1.0f, 1.0f);
        if (LIZIZ2 != 0.0f) {
            float f4 = this.LJLJLLL[i];
            float f5 = this.LJLL[i];
            float f6 = this.LJLLI[i];
            float f7 = f4 * f3;
            if (LIZIZ2 > 0.0f) {
                return LIZIZ(LIZIZ2 * f7, f5, f6);
            }
            return -LIZIZ((-LIZIZ2) * f7, f5, f6);
        }
        return 0.0f;
    }
}
