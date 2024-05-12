package X;

import Y.ACListenerS34S0100000_14;
import Y.IDRunnableS6S0101000;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WUp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnTouchListenerC82375WUp extends FrameLayout implements View.OnTouchListener {
    public static final Long LLLF = 200L;
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public C82622Wbi LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public long LLD;
    public boolean LLF;
    public Paint LLFF;
    public Paint LLFFF;
    public Paint LLFII;
    public Paint LLFZ;
    public Paint LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public final boolean LLILL;
    public long LLILLIZIL;
    public long LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final RectF LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public final int[] LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public HXI LLJJIJI;
    public Activity LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public DashPathEffect LLJJJIL;
    public WV1 LLJJJJ;
    public ImageView LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public Long LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public WVC LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public ScaleGestureDetector LLJLL;
    public WXG LLJLLIL;
    public WV0 LLJLLL;
    public final IDRunnableS6S0101000 LLJZ;
    public final ACListenerS34S0100000_14 LLJZIJLIL;
    public boolean LLL;

    public static int LIZJ(float f, int i, int i2) {
        double d = f;
        double d2 = 1.0d - d;
        double d3 = d * d;
        double d4 = d2 * d2;
        return i + ((int) ((i2 - i) * ((d3 * d * 1.0d) + C67399Qcl.LIZ(d2, 3.0d, d3, 1.0d, C67399Qcl.LIZ(d4, 3.0d, d, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, d4 * d2 * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)))));
    }

    private double getPhotoShrinkScale() {
        if (this.LJLLLLLL > 0) {
            return 0.8d;
        }
        return 0.92d;
    }

    private boolean getShouldDrawBorderInner() {
        int i;
        if (this.LJLILLLLZI && (i = this.LJLLILLLL) != 3 && i != 2 && i != 4) {
            return true;
        }
        return false;
    }

    public final int LIZLLL() {
        int i;
        if (this.LLJJIII) {
            i = this.LLIFFJFJJ;
        } else if (this.LLJJI) {
            i = this.LLIIII;
        } else {
            i = this.LLIIII;
        }
        SystemClock.uptimeMillis();
        return i;
    }

    public final int LJII() {
        int i;
        if (this.LLJJIII) {
            i = this.LLII;
        } else if (this.LLJJI) {
            i = this.LLIIIILZ;
        } else {
            i = this.LLIIIILZ;
        }
        SystemClock.uptimeMillis();
        return i;
    }

    public final void LJIIJJI() {
        ImageView imageView = this.LLJJJJJIL;
        if (imageView != null && this.LLJJJJ == WV1.PLAN_C) {
            imageView.setVisibility(8);
        }
    }

    public final boolean LJIILIIL() {
        if (this.LLJJL.longValue() == 0 || this.LJLJI > this.LLJJL.longValue()) {
            return true;
        }
        return false;
    }

    public final void LJIILL() {
        int i = this.LLILLL;
        if (i != -1) {
            this.LJLLJ = i;
            this.LLILLL = -1;
            invalidate();
        }
        this.LJZL = false;
        int i2 = this.LJLLILLLL;
        if (i2 == 3 || i2 == 2 || i2 == 11 || i2 == 13 || i2 == 14) {
            if (this.LJLJI > 0 && i2 != 13 && i2 != 14) {
                LJIIIZ(9);
            } else {
                LJIIIZ(4);
            }
            invalidate();
            this.LLL = false;
        }
    }

    public final void LJIILLIIL() {
        if (this.LLJJJJLIIL != null) {
            WV1 wv1 = this.LLJJJJ;
            if (wv1 == WV1.PLAN_B) {
                int i = this.LJLLJ;
                if (i == 3) {
                    this.LLJJJJLIIL.setBackground(C78127UlP.LIZ(this.LLIIIILZ, 0, (int) V2B.LJI(getContext(), 8.0f)));
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    this.LLJJJJLIIL.setBackground(C78127UlP.LIZ(0, this.LLIFFJFJJ, 0));
                    return;
                }
            }
            if (wv1 != WV1.PLAN_C) {
                return;
            }
            int i2 = this.LJLLJ;
            if (i2 == 3) {
                this.LLJJJJLIIL.setBackground(C78127UlP.LIZ(0, this.LLIIII, 0));
            } else {
                if (i2 != 1) {
                    return;
                }
                this.LLJJJJLIIL.setBackground(C78127UlP.LIZ(0, this.LLIFFJFJJ, 0));
            }
        }
    }

    public final void LJIIZILJ() {
        ImageView imageView = this.LLJJJJJIL;
        if (imageView != null && this.LLJJJJ == WV1.PLAN_C) {
            int i = this.LJLLJ;
            if (i == 3) {
                imageView.setImageResource(R.drawable.v2);
            } else {
                if (i != 1) {
                    return;
                }
                imageView.setImageResource(R.drawable.v1);
            }
        }
    }

    public final void LJIJI() {
        Paint paint = this.LLFF;
        if (paint == null || this.LLFFF == null) {
            return;
        }
        paint.setColor(this.LLIFFJFJJ);
        this.LLFFF.setColor(this.LLII);
    }

    public final void LJIJJ() {
        Paint paint = this.LLFF;
        if (paint == null || this.LLFFF == null || this.LLFZ == null || this.LLFII == null) {
            return;
        }
        paint.setColor(this.LLIIII);
        this.LLFZ.setColor(this.LLIIIL);
        this.LLFII.setColor(this.LLIIIJ);
        this.LLFFF.setColor(this.LLIIIILZ);
    }

    public final void LJIJJLI() {
        FrameLayout frameLayout = this.LLJJJJLIIL;
        if (frameLayout != null) {
            WV1 wv1 = this.LLJJJJ;
            if (wv1 == WV1.PLAN_B || wv1 == WV1.PLAN_C) {
                frameLayout.setVisibility(0);
            }
        }
    }

    public final void LJIL() {
        ImageView imageView = this.LLJJJJJIL;
        if (imageView != null && this.LLJJJJ == WV1.PLAN_C) {
            imageView.setVisibility(0);
        }
    }

    public DashPathEffect getDashPathEffect() {
        if (this.LLJJJIL == null) {
            this.LLJJJIL = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        }
        return this.LLJJJIL;
    }

    private LinearGradient getLinearGradient() {
        return new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), new int[]{C79045V0n.LJI(R.attr.gh, getContext()).intValue(), C79045V0n.LJI(R.attr.gg, getContext()).intValue(), C79045V0n.LJI(R.attr.gf, getContext()).intValue()}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final boolean LJIIL() {
        if (System.currentTimeMillis() - this.LLJ < 300) {
            return true;
        }
        return false;
    }

    public int getCurrentScaleMode() {
        return this.LJLLL;
    }

    public int getMode() {
        return this.LJLLJ;
    }

    public final void LJIIIIZZ(int i) {
        this.LJLLLL = i;
        this.LLILLJJLI = SystemClock.uptimeMillis();
    }

    public final void LJIIIZ(int i) {
        this.LJLLILLLL = i;
        this.LLILLIZIL = SystemClock.uptimeMillis();
    }

    public final void LJIILJJIL(int i) {
        super.setOnClickListener(this.LLJZIJLIL);
        this.LLILLL = this.LJLLJ;
        this.LJLLJ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x065b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82375WUp.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0037, code lost:
    
        if (r4 == 0) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82375WUp.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setActionDownTime(long j) {
        this.LLJILJILJ = j;
    }

    public void setActivity(Activity activity) {
        this.LLJJIJIIJIL = activity;
    }

    public void setCanTouch(Boolean bool) {
        this.LLJJIJIL = bool.booleanValue();
    }

    public void setColorSchemeBackground(FrameLayout frameLayout) {
        this.LLJJJJLIIL = frameLayout;
        LJIILLIIL();
        LJIJJLI();
    }

    public void setColorSchemeIcon(ImageView imageView) {
        this.LLJJJJJIL = imageView;
        LJIIZILJ();
        LJIL();
    }

    public void setCombineTakePhoto(boolean z) {
        this.LLF = z;
    }

    public void setCurrentScaleMode(int i) {
        this.LJLLL = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setHasBeenMoveScaled(boolean z) {
        this.LLIZLLLIL = z;
        this.LLJ = System.currentTimeMillis();
    }

    public void setObjectContainer(C82622Wbi c82622Wbi) {
        this.LJLJLJ = c82622Wbi;
        if (this.LLJJIJI == null && c82622Wbi != null) {
            this.LLJJIJI = new HXI(c82622Wbi);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setOnGestureListener(WXG wxg) {
        this.LLJLLIL = wxg;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        throw new UnsupportedOperationException();
    }

    public void setPhotoCenterColor(int i) {
        this.LLIFFJFJJ = AnonymousClass636.LJIIIIZZ(i, getContext());
    }

    public void setPhotoIdleStyle(int i) {
        int i2 = this.LJLLLLLL;
        if (i == i2) {
            return;
        }
        if (i == 0) {
            if (i2 == 1) {
                LJIJJ();
            }
            if (this.LJLLLLLL > 0 && !this.LLILL) {
                this.LLFFF.setColor(this.LLIIIILZ);
            }
            this.LJLLLLLL = 0;
            invalidate();
            return;
        }
        this.LJLLLLLL = i;
        invalidate();
    }

    public void setRecordLayoutUIChangedListener(WVC wvc) {
        this.LLJL = wvc;
    }

    public void setRecordListener(WV0 wv0) {
        this.LLJLLL = new C82383WUx(this, wv0);
    }

    public void setRecordMinLimit(Long l) {
        this.LLJJL = l;
    }

    public void setRecordingTime(long j) {
        this.LJLJI = j;
    }

    public void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.LLJLL = scaleGestureDetector;
    }

    public void setShouldDrawBorder(boolean z) {
        boolean z2 = this.LJLILLLLZI;
        this.LJLILLLLZI = z;
        if (z2 != z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            LJIIJJI();
        }
    }

    public ViewOnTouchListenerC82375WUp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f;
        int LIZIZ;
        this.LJLIL = true;
        this.LJLILLLLZI = true;
        this.LJLLJ = 3;
        this.LJZI = true;
        this.LLD = -1L;
        boolean LIZ = C52286Kfa.LIZ();
        this.LLILL = LIZ;
        this.LLILLL = -1;
        this.LLILZ = (int) KL2.LIZJ(getContext(), 100.0f);
        this.LLILZIL = (int) KL2.LIZJ(getContext(), 34.0f);
        this.LLILZLL = (int) KL2.LIZJ(getContext(), 28.0f);
        this.LLIZ = new RectF();
        this.LLJ = 0L;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJJ = new int[]{0, 0};
        this.LLJJIJIL = true;
        this.LLJJJ = true;
        new ArgbEvaluator();
        this.LLJJJJ = WV1.DEFAULT;
        this.LLJJL = 0L;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = new WVA();
        this.LLJLIL = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
        this.LLJLILLLLZIIL = C04330Ez.LIZIZ(getContext(), R.color.sh);
        this.LLJLLL = new WVB();
        this.LLJZ = new IDRunnableS6S0101000(4, this, 12);
        this.LLJZIJLIL = new ACListenerS34S0100000_14(this, 39);
        KL2.LIZJ(context, 55.0f);
        this.LLIIIZ = (int) KL2.LIZJ(context, 40.0f);
        this.LLIIJI = (int) KL2.LIZJ(context, 40.0f);
        this.LLIIJLIL = (int) KL2.LIZJ(context, 58.0f);
        this.LLIIL = (int) KL2.LIZJ(context, 48.0f);
        this.LLIILII = (int) KL2.LIZJ(context, 40.0f);
        if (LIZ) {
            f = 5.0f;
        } else {
            f = 6.0f;
        }
        this.LLIILZL = (int) KL2.LIZJ(context, f);
        this.LLIIZ = (int) KL2.LIZJ(context, 8.0f);
        this.LLIL = (int) KL2.LIZJ(context, 18.0f);
        this.LLILII = (int) KL2.LIZJ(context, 32.0f);
        this.LLILIL = (int) KL2.LIZJ(context, 18.0f);
        this.LJLJJL = (int) KL2.LIZJ(context, 8.0f);
        this.LJLJL = (int) KL2.LIZJ(context, 2.0f);
        this.LJLJJLL = (int) KL2.LIZJ(context, 20.0f);
        this.LJLLILLLL = 1;
        Paint paint = new Paint();
        this.LLFF = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.LLFF.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LLFFF = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.LLFFF.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.LLFII = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.LLFII.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.LLFZ = paint4;
        paint4.setStyle(Paint.Style.FILL);
        this.LLFZ.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.LLI = paint5;
        paint5.setStyle(Paint.Style.FILL);
        this.LLI.setAntiAlias(true);
        this.LLI.setColor(C04330Ez.LIZIZ(getContext(), R.color.c7));
        WV1 wv1 = WV1.PLAN_LIGHTENING;
        this.LLJJJJ = wv1;
        int i = WV2.LIZ[wv1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.LLIIII = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
                            if (LIZ) {
                                LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.bc);
                            } else {
                                LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.sh);
                            }
                            this.LLIIIILZ = LIZIZ;
                            this.LLIFFJFJJ = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                            this.LLII = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                            this.LLIIIL = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                            this.LLIIIJ = C04330Ez.LIZIZ(getContext(), R.color.s0);
                        }
                    } else {
                        this.LLIIII = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
                        this.LLIIIILZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
                        this.LLIFFJFJJ = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
                        this.LLII = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
                        this.LLIIIL = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                        this.LLIIIJ = C04330Ez.LIZIZ(getContext(), R.color.s0);
                    }
                } else {
                    this.LLIIII = 0;
                    this.LLIIIILZ = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                    this.LLIFFJFJJ = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                    this.LLII = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                    this.LLIIIL = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                    this.LLIIIJ = C04330Ez.LIZIZ(getContext(), R.color.s0);
                }
            } else {
                this.LLIIII = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
                this.LLIIIILZ = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                this.LLIFFJFJJ = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                this.LLII = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                this.LLIIIL = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
                this.LLIIIJ = C04330Ez.LIZIZ(getContext(), R.color.s0);
            }
        } else {
            this.LLIIII = AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext());
            this.LLIIIILZ = C04330Ez.LIZIZ(getContext(), R.color.sh);
            this.LLIFFJFJJ = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
            this.LLII = C04330Ez.LIZIZ(getContext(), R.color.v3);
            this.LLIIIL = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
            this.LLIIIJ = C04330Ez.LIZIZ(getContext(), R.color.s0);
        }
        LJIJJ();
        setOnTouchListener(this);
        this.LL = C90193gN.LIZIZ(context);
    }

    public final int LIZ(int i, long j) {
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - j)) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8 || i == 13 || i == 14) {
            int i2 = this.LLIILII;
            this.LLJL.LIZ(i2);
            return i2;
        }
        if (i == 2) {
            int LIZJ = LIZJ(uptimeMillis, this.LLIILII, this.LLIIJLIL);
            this.LLJL.LIZ(LIZJ);
            return LIZJ;
        }
        if (i == 3) {
            int i3 = this.LLIIJLIL;
            this.LLJL.LIZ(i3);
            return i3;
        }
        if (i == 9) {
            int LIZJ2 = LIZJ(uptimeMillis, this.LLIIJLIL, this.LLIIL);
            this.LLJL.LIZ(LIZJ2);
            return LIZJ2;
        }
        if (i == 10) {
            int i4 = this.LLIIL;
            this.LLJL.LIZ(i4);
            return i4;
        }
        if (i == 11) {
            int LIZJ3 = LIZJ(uptimeMillis, this.LLIIL, this.LLIIJLIL);
            this.LLJL.LIZ(LIZJ3);
            return LIZJ3;
        }
        if (i == 12) {
            int LIZJ4 = LIZJ(uptimeMillis, this.LLIIL, this.LLIILII);
            this.LLJL.LIZ(LIZJ4);
            return LIZJ4;
        }
        if (i == 4) {
            int LIZJ5 = LIZJ(uptimeMillis, this.LLIIJLIL, this.LLIIL);
            this.LLJL.LIZ(LIZJ5);
            return LIZJ5;
        }
        return 0;
    }

    public final int LIZIZ(int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.LLIILII - this.LLIILZL;
        float f = ((float) (uptimeMillis - j)) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8 || i == 13 || i == 14) {
            return i2;
        }
        if (i == 2) {
            return LIZJ(f, i2, 0);
        }
        if (i == 12) {
            return LIZJ(f, 0, i2);
        }
        if (i != 4) {
            return 0;
        }
        return LIZJ(f, 0, i2);
    }

    public final int LJ(int i, long j) {
        float uptimeMillis = (((float) SystemClock.uptimeMillis()) - ((float) j)) / 50.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8) {
            return this.LLILII;
        }
        if (i == 13) {
            int i2 = this.LLILII;
            return LIZJ(uptimeMillis, i2, (int) (i2 * getPhotoShrinkScale()));
        }
        if (i == 14) {
            return LIZJ(uptimeMillis, (int) (this.LLILII * getPhotoShrinkScale()), this.LLILII);
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            size = this.LLILZ;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            size2 = this.LLILZ;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.LLJJIJIL || this.LLJLLIL == null || motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                if (action == 6) {
                    this.LLJLLIL.LLLLLZL(motionEvent, this.LLJJ);
                    this.LLJLLIL.LLLLLZ(motionEvent, this.LLJJ);
                }
            } else {
                this.LLJLLIL.LLLLZI(motionEvent, this.LLJJ);
                this.LLJLLIL.LLLLLLZZ(motionEvent, this.LLJJ);
            }
        } else {
            this.LLJLLIL.LLLLZ(motionEvent, this.LLJJ);
        }
        return false;
    }

    public final int LJI(long j, int i, int i2) {
        float uptimeMillis = (((float) (SystemClock.uptimeMillis() - j)) * 1.0f) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8 || i == 10 || i == 12) {
            return this.LLILII;
        }
        if (i == 2 || i == 11) {
            if (this.LLILL) {
                return LIZJ(uptimeMillis, this.LLILII, this.LJLJJLL);
            }
            return LIZJ(uptimeMillis, this.LLILII, this.LLILIL);
        }
        if (i == 3) {
            if (this.LLILL) {
                if (i2 == 2) {
                    return LIZJ(uptimeMillis, this.LJLJJLL, this.LLIL);
                }
                if (i2 == 0) {
                    return this.LJLJJLL;
                }
            }
            return this.LLILIL;
        }
        if (i == 4 || i == 9) {
            if (this.LLILL && this.LJLLLL != 1) {
                return LIZJ(uptimeMillis, this.LJLJJLL, this.LLILII);
            }
            return LIZJ(uptimeMillis, this.LLILIL, this.LLILII);
        }
        return 0;
    }

    public final void LJIJ(int i, boolean z, boolean z2) {
        this.LJLJJI = z2;
        this.LLJJI = this.LLJJIII;
        int i2 = this.LJLLJ;
        this.LJLLJ = i;
        this.LLJJIII = z;
        this.LLJJJ = true;
        if (!this.LLJI) {
            invalidate();
            super.setOnClickListener(this.LLJZIJLIL);
            this.LLJI = !this.LLJI;
            return;
        }
        if (i == i2) {
            return;
        }
        LJIIZILJ();
        LJIL();
        LJIILLIIL();
        LJIJJLI();
        if (i == 1) {
            LJIJI();
            super.setOnClickListener(this.LLJZIJLIL);
            LJIIIZ(6);
        } else if (i == 0) {
            this.LLFF.setColor(this.LLIIII);
            this.LLFFF.setColor(this.LLIIIILZ);
            super.setOnClickListener(null);
            LJIIIZ(8);
        } else if (i == 3) {
            LJIJJ();
            super.setOnClickListener(this.LLJZIJLIL);
            LJIIIZ(7);
        }
        invalidate();
    }

    public final int LJFF(long j, int i, int i2, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = (((float) (uptimeMillis - j)) * 1.0f) / 350.0f;
        float f2 = (((float) (uptimeMillis - j2)) * 1.0f) / 350.0f;
        if (i == 1 || i == 6 || i == 7 || i == 8) {
            return this.LLILII;
        }
        if (i == 2 || i == 11) {
            if (this.LLILL) {
                return LIZJ(f, this.LLILII, this.LJLJJLL);
            }
            return LIZJ(f, this.LLILII, this.LLIIZ);
        }
        if (i == 3) {
            if (i2 == 0) {
                if (this.LLILL) {
                    return this.LJLJJLL;
                }
                return this.LLIIZ;
            }
            if (i2 == 2) {
                if (this.LLILL) {
                    return LIZJ(f, this.LJLJJLL, this.LLIL);
                }
                return LIZJ(f2, this.LLIIZ, this.LLIL);
            }
            if (i2 == 1) {
                return this.LLIL;
            }
        }
        if (i == 9 || i == 4) {
            if (i2 == 0) {
                if (this.LLILL) {
                    return LIZJ(f, this.LJLJJLL, this.LLILII);
                }
                return LIZJ(f, this.LLIIZ, this.LLILII);
            }
            if (i2 == 2) {
                if (!this.LLILL) {
                    return 0;
                }
                return LIZJ(f, this.LJLJJLL, this.LLILII);
            }
            if (i2 == 1) {
                return LIZJ(f, this.LLIL, this.LLILII);
            }
        } else {
            if (i == 10) {
                return this.LLILII;
            }
            if (i == 12) {
                return this.LLILII;
            }
        }
        return 0;
    }

    public final void LJIIJ(Canvas canvas, float f, int i, int i2) {
        canvas.drawRoundRect(this.LLIZ, f, f, this.LLFZ);
        RectF rectF = this.LLIZ;
        int i3 = this.LJLJJL;
        rectF.left = i - i3;
        rectF.top = i2 - i3;
        rectF.right = i + i3;
        rectF.bottom = i2 + i3;
        int i4 = this.LJLJL;
        canvas.drawRoundRect(rectF, i4, i4, this.LLFF);
    }
}
