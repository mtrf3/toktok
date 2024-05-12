package X;

import Y.ACListenerS34S0100000_14;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WUr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnTouchListenerC82377WUr extends FrameLayout implements View.OnTouchListener {
    public boolean LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public Paint LJLJLJ;
    public Paint LJLJLLL;
    public C82622Wbi LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public float LJZI;
    public float LJZL;
    public long LL;
    public long LLD;
    public int LLF;
    public final int LLFF;
    public final RectF LLFFF;
    public boolean LLFII;
    public long LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public long LLII;
    public long LLIIII;
    public final int[] LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public HXI LLIIIZ;
    public Activity LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public final ArgbEvaluator LLIILII;
    public DashPathEffect LLIILZL;
    public boolean LLIIZ;
    public ScaleGestureDetector LLIL;
    public WXG LLILII;
    public WV3 LLILIL;
    public final ACListenerS34S0100000_14 LLILL;
    public boolean LLILLIZIL;

    public static int LIZJ(float f, int i, int i2) {
        double d = f;
        double d2 = 1.0d - d;
        double d3 = d * d;
        double d4 = d2 * d2;
        return i + ((int) ((i2 - i) * ((d3 * d * 1.0d) + C67399Qcl.LIZ(d2, 3.0d, d3, 1.0d, C67399Qcl.LIZ(d4, 3.0d, d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, d4 * d2 * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)))));
    }

    public final void LJIIJJI() {
        int i = this.LLF;
        if (i != -1) {
            this.LJLJJL = i;
            this.LLF = -1;
            invalidate();
        }
        int i2 = this.LJLJJI;
        if (i2 == 3 || i2 == 2) {
            LJIIIIZZ(4);
            this.LLILLIZIL = false;
            invalidate();
        }
    }

    public final void LJIIL() {
        int i = this.LLF;
        if (i != -1) {
            this.LJLJJL = i;
            this.LLF = -1;
            invalidate();
        }
        setHasBeenMoveScaled(false);
        this.LLILIL.LJJIJIIJIL();
        int i2 = this.LJLJJI;
        if (i2 == 3 || i2 == 2) {
            LJIIIIZZ(4);
        }
        this.LLILIL.LLJJJJJIL();
        this.LLII = System.currentTimeMillis();
        invalidate();
    }

    public final void LJIILJJIL() {
        Paint paint = this.LJLJLJ;
        if (paint == null || this.LJLJLLL == null) {
            return;
        }
        paint.setColor(this.LJLLI);
        this.LJLJLLL.setColor(this.LJLLILLLL);
    }

    public final void LJIILL() {
        Paint paint = this.LJLJLJ;
        if (paint == null || this.LJLJLLL == null) {
            return;
        }
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext()));
        this.LJLJLLL.setColor(C04330Ez.LIZIZ(getContext(), R.color.sh));
    }

    public final void LJIILLIIL() {
        Paint paint = this.LJLJLJ;
        if (paint == null || this.LJLJLLL == null) {
            return;
        }
        paint.setColor(this.LJLLJ);
        this.LJLJLLL.setColor(this.LJLLL);
    }

    public final void LJIIZILJ() {
        int i = this.LJLJJI;
        if (i == 1) {
            LJIIIIZZ(2);
            invalidate();
        } else if (i == 3 || i == 2) {
            LJIIIIZZ(4);
        }
    }

    public long getActionDownTime() {
        TikTokCameraBaseGroupScene LIZ = HK4.LIZ(this.LLIIJI);
        if (LIZ != null) {
            ShortVideoContext LLLILZ = LIZ.LLLILZ();
            if (LLLILZ != null) {
                return LLLILZ.actionDownTime;
            }
            return 0L;
        }
        return this.LLIIII;
    }

    public DashPathEffect getDashPathEffect() {
        if (this.LLIILZL == null) {
            this.LLIILZL = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.LLIILZL;
    }

    public int getCurrentScaleMode() {
        return this.LJLJJLL;
    }

    public int getMode() {
        return this.LJLJJL;
    }

    public final int LIZLLL(long j) {
        int i;
        int i2;
        if (this.LLIIIL) {
            i = this.LJLLJ;
            i2 = this.LJLLI;
        } else {
            if (this.LLIIIJ) {
                i = this.LJLLI;
            } else {
                i = this.LJLLJ;
            }
            i2 = this.LJLLJ;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LL > 300) {
            return i2;
        }
        return ((Integer) this.LLIILII.evaluate((((float) (uptimeMillis - j)) * 1.0f) / 300.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final int LJI(long j) {
        int i;
        int i2;
        if (this.LLIIIL) {
            i = this.LJLLL;
            i2 = this.LJLLILLLL;
        } else {
            if (this.LLIIIJ) {
                i = this.LJLLILLLL;
            } else {
                i = this.LJLLL;
            }
            i2 = this.LJLLL;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis > 300) {
            return i2;
        }
        return ((Integer) this.LLIILII.evaluate((((float) uptimeMillis) * 1.0f) / 300.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final void LJII(int i) {
        this.LJLJL = i;
        this.LLD = SystemClock.uptimeMillis();
    }

    public final void LJIIIIZZ(int i) {
        this.LJLJJI = i;
        this.LL = SystemClock.uptimeMillis();
    }

    public final void LJIIJ(int i) {
        super.setOnClickListener(this.LLILL);
        this.LLF = this.LJLJJL;
        this.LJLJJL = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0259, code lost:
    
        if (r17.LJLJL != 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0348, code lost:
    
        if (r6 == 1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x034a, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0344, code lost:
    
        if (r6 == 2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03b3, code lost:
    
        if (r6 == 1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b5, code lost:
    
        r0 = 2;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03af, code lost:
    
        if (r6 == 2) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82377WUr.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x002e, code lost:
    
        if (r1 == 0) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82377WUr.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setActionDownTime(long j) {
        this.LLIIII = j;
    }

    public void setActivity(Activity activity) {
        this.LLIIJI = activity;
    }

    public void setCanTouch(Boolean bool) {
        this.LLIIJLIL = bool.booleanValue();
    }

    public void setCurrentScaleMode(int i) {
        this.LJLJJLL = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.LLFII = z;
        this.LLFZ = System.currentTimeMillis();
    }

    public void setObjectContainer(C82622Wbi c82622Wbi) {
        this.LJLL = c82622Wbi;
        if (this.LLIIIZ == null && c82622Wbi != null) {
            this.LLIIIZ = new HXI(c82622Wbi);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnGestureListener(WXG wxg) {
        this.LLILII = wxg;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setRecordListener(WV3 wv3) {
        this.LLILIL = new C82384WUy(this, wv3);
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.LLIL = scaleGestureDetector;
    }

    public ViewOnTouchListenerC82377WUr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = true;
        this.LJLJJL = 3;
        this.LLF = -1;
        this.LLFF = (int) KL2.LIZJ(getContext(), 100.0f);
        this.LLFFF = new RectF();
        this.LLFZ = 0L;
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLIIIILZ = new int[]{0, 0};
        this.LLIIJLIL = true;
        this.LLIIL = true;
        this.LLIILII = new ArgbEvaluator();
        this.LLILIL = new C73994T2g();
        this.LLILL = new ACListenerS34S0100000_14(this, 40);
        this.LJLLLL = (int) KL2.LIZJ(context, 50.0f);
        this.LJLLLLLL = (int) KL2.LIZJ(context, 40.0f);
        KL2.LIZJ(context, 45.0f);
        KL2.LIZJ(context, 2.5f);
        this.LJLZ = (int) KL2.LIZJ(context, 40.0f);
        this.LJLJJI = 1;
        Paint paint = new Paint();
        this.LJLJLJ = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.LJLJLJ.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LJLJLLL = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.LJLJLLL.setAntiAlias(true);
        this.LJLLJ = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
        this.LJLLL = C04330Ez.LIZIZ(getContext(), R.color.sh);
        this.LJLLI = C04330Ez.LIZIZ(getContext(), R.color.acm);
        this.LJLLILLLL = C04330Ez.LIZIZ(getContext(), R.color.acm);
        LJIILLIIL();
        setOnTouchListener(this);
    }

    public final int LIZ(int i, long j) {
        int i2;
        int i3;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            i2 = this.LJLLLLLL;
            i3 = (int) (((uptimeMillis - j) * (this.LJLLLL - i2)) / 300);
        } else {
            if (i == 3) {
                int i4 = this.LJLLLLLL;
                return (this.LJLLLL - i4) + i4;
            }
            if (i == 4) {
                i2 = this.LJLLLLLL;
                i3 = (int) ((1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)) * (this.LJLLLL - i2));
            } else {
                if (i == 1) {
                    return this.LJLLLLLL;
                }
                return 0;
            }
        }
        return i2 + i3;
    }

    public final int LIZIZ(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            return (int) (((uptimeMillis - j) * this.LJLZ) / 300);
        }
        if (i == 3) {
            double sin = Math.sin(((uptimeMillis - j) * 3.141592653589793d) / 700) + 1.0d;
            int i2 = this.LJLJL;
            if (i2 != 2) {
                if (i2 != 1) {
                    return (int) C207798Dn.LIZ(sin, this.LJLLLL - this.LJLLLLLL, 0.30000001192092896d, this.LJLZ);
                }
            } else if (this.LJZ == 0) {
                this.LJZ = (int) C207798Dn.LIZ(sin, this.LJLLLL - this.LJLLLLLL, 0.30000001192092896d, this.LJLZ);
            }
            return this.LJZ;
        }
        if (i == 4) {
            return (int) ((1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)) * this.LJLZ);
        }
        return 0;
    }

    public final int LJ(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            int i2 = this.LJLZ;
            return (int) (((1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)) * i2 * 0.7f) + (i2 * 0.1f));
        }
        if (i == 3) {
            return (int) (this.LJLZ * 0.1f);
        }
        if (i == 4) {
            int i3 = this.LJLZ;
            return (int) C6D8.LIZ(i3 * 0.7f, (float) (uptimeMillis - j), 300.0f, i3 * 0.1f);
        }
        if (i == 1) {
            return (int) (this.LJLZ * 0.8f);
        }
        return 0;
    }

    public final int LJFF(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 2) {
            int i2 = this.LJLZ;
            return (int) (((1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)) * i2 * 0.4f) + (i2 * 0.4f));
        }
        if (i == 3) {
            return (int) (this.LJLZ * 0.4f);
        }
        if (i == 4) {
            int i3 = this.LJLZ;
            return (int) C6D8.LIZ(i3 * 0.4f, (float) (uptimeMillis - j), 300.0f, i3 * 0.4f);
        }
        if (i == 1) {
            return (int) (this.LJLZ * 0.8f);
        }
        return 0;
    }

    public final void LJIIIZ(Canvas canvas, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float min = (int) (((this.LJLZ * 0.85f) * ((float) Math.min(300L, SystemClock.uptimeMillis() - this.LL))) / 300.0f);
        long j = this.LL;
        float f = this.LJLLLLLL;
        float f2 = ((1.0f - ((((float) (uptimeMillis - j)) * 1.0f) / 300.0f)) * f * 0.2f) + (0.8f * f);
        this.LJLJLLL.setStrokeWidth(f - min);
        this.LJLJLLL.setPathEffect(null);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (f + min) / 2.0f, this.LJLJLLL);
        this.LJLJLJ.setStrokeWidth(f2);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, f2 / 2.0f, this.LJLJLJ);
        if (uptimeMillis - this.LL > 300) {
            LJIIIIZZ(1);
            if (z) {
                this.LJLJJL = 3;
            } else {
                this.LJLJJL = 1;
            }
        }
        invalidate();
    }

    public final void LJIILIIL(int i, boolean z) {
        this.LLIIIJ = this.LLIIIL;
        int i2 = this.LJLJJL;
        this.LJLJJL = i;
        this.LLIIIL = z;
        this.LLIIL = true;
        if (!this.LLI) {
            invalidate();
            super.setOnClickListener(this.LLILL);
            this.LLI = !this.LLI;
        } else {
            if (i == i2) {
                return;
            }
            if (i == 1) {
                LJIILJJIL();
                super.setOnClickListener(this.LLILL);
                LJIIIIZZ(6);
            } else if (i == 3) {
                LJIILLIIL();
                super.setOnClickListener(this.LLILL);
                LJIIIIZZ(7);
            }
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            size = this.LLFF;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            size2 = this.LLFF;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.LLIIJLIL || this.LLILII == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    this.LLILII.LLLLLZL(motionEvent, this.LLIIIILZ);
                    this.LLILII.LLLLLZ(motionEvent, this.LLIIIILZ);
                }
            } else {
                this.LLILII.LLLLZI(motionEvent, this.LLIIIILZ);
                this.LLILII.LLLLLLZZ(motionEvent, this.LLIIIILZ);
            }
        } else {
            this.LLILII.LLLLZ(motionEvent, this.LLIIIILZ);
        }
        return false;
    }
}
