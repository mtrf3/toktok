package X;

import Y.ALAdapterS11S0100000_14;
import Y.ALAdapterS5S0110000_14;
import Y.ARunnableS50S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VdA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80164VdA extends ViewGroup implements InterfaceC78979Uz9, InterfaceC16670l5 {
    public static final ViewGroup.MarginLayoutParams LLLFZ = new ViewGroup.MarginLayoutParams(-1, -1);
    public final int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public final float LJLLILLLL;
    public char LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public final int LL;
    public int LLD;
    public final Scroller LLF;
    public final VelocityTracker LLFF;
    public final InterpolatorC80153Vcz LLFFF;
    public final int[] LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public final boolean LLIFFJFJJ;
    public final boolean LLII;
    public final boolean LLIIII;
    public final boolean LLIIIILZ;
    public final boolean LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;
    public final boolean LLIIJI;
    public boolean LLIIJLIL;
    public final boolean LLIIL;
    public final boolean LLIILII;
    public final boolean LLIILZL;
    public final boolean LLIIZ;
    public boolean LLIL;
    public final boolean LLILII;
    public final boolean LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public InterfaceC79840VVc LLILZIL;
    public InterfaceC79839VVb LLILZLL;
    public InterfaceC80179VdP LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final int[] LLJI;
    public final C16610kz LLJIJIL;
    public final C16690l7 LLJILJIL;
    public int LLJILJILJ;
    public C80181VdR LLJILLL;
    public int LLJJ;
    public C80181VdR LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final float LLJJIJIIJIL;
    public final float LLJJIJIL;
    public final float LLJJJ;
    public final float LLJJJIL;
    public InterfaceC80161Vd7 LLJJJJ;
    public InterfaceC80186VdW LLJJJJJIL;
    public C80157Vd3 LLJJJJLIIL;
    public Paint LLJJL;
    public final Handler LLJJLIIIJLLLLLLLZ;
    public final C80165VdB LLJL;
    public EnumC80174VdK LLJLIL;
    public EnumC80174VdK LLJLILLLLZIIL;
    public long LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public MotionEvent LLLF;
    public Runnable LLLFF;
    public ValueAnimator LLLFFI;

    public static void setDefaultRefreshFooterCreator(InterfaceC80187VdX interfaceC80187VdX) {
    }

    public static void setDefaultRefreshHeaderCreator(InterfaceC80188VdY interfaceC80188VdY) {
    }

    public static void setDefaultRefreshInitializer(InterfaceC80189VdZ interfaceC80189VdZ) {
    }

    public ViewGroup getLayout() {
        return this;
    }

    public final void LJIILLIIL() {
        EnumC80174VdK enumC80174VdK = this.LLJLIL;
        EnumC80174VdK enumC80174VdK2 = EnumC80174VdK.TwoLevel;
        if (enumC80174VdK == enumC80174VdK2) {
            if (this.LLD > -1000 && this.LJLILLLLZI > getMeasuredHeight() / 2) {
                ValueAnimator LIZ = this.LLJL.LIZ(getMeasuredHeight());
                if (LIZ != null) {
                    LIZ.setDuration(this.LJLJJL);
                    return;
                }
                return;
            }
            if (!this.LJLLL) {
                return;
            }
            C80165VdB c80165VdB = this.LLJL;
            C80164VdA c80164VdA = c80165VdB.LIZ;
            if (c80164VdA.LLJLIL != enumC80174VdK2) {
                return;
            }
            c80164VdA.LLJL.LIZJ(EnumC80174VdK.TwoLevelFinish);
            if (c80165VdB.LIZ.LJLILLLLZI == 0) {
                c80165VdB.LIZIZ(0, false);
                c80165VdB.LIZ.LJIILIIL(EnumC80174VdK.None);
                return;
            } else {
                c80165VdB.LIZ(0).setDuration(c80165VdB.LIZ.LJLJJL);
                return;
            }
        }
        EnumC80174VdK enumC80174VdK3 = EnumC80174VdK.Loading;
        if (enumC80174VdK == enumC80174VdK3 || (this.LLIIIJ && this.LLILL && this.LLILLIZIL && this.LJLILLLLZI < 0 && LJIIJ(this.LLI))) {
            int i = this.LJLILLLLZI;
            int i2 = -this.LLJJ;
            if (i < i2) {
                this.LLJL.LIZ(i2);
                return;
            } else {
                if (i <= 0) {
                    return;
                }
                this.LLJL.LIZ(0);
                return;
            }
        }
        EnumC80174VdK enumC80174VdK4 = this.LLJLIL;
        EnumC80174VdK enumC80174VdK5 = EnumC80174VdK.Refreshing;
        if (enumC80174VdK4 == enumC80174VdK5) {
            int i3 = this.LJLILLLLZI;
            int i4 = this.LLJILJILJ;
            if (i3 > i4) {
                this.LLJL.LIZ(i4);
                return;
            } else {
                if (i3 >= 0) {
                    return;
                }
                this.LLJL.LIZ(0);
                return;
            }
        }
        if (enumC80174VdK4 == EnumC80174VdK.PullDownToRefresh) {
            this.LLJL.LIZJ(EnumC80174VdK.PullDownCanceled);
            return;
        }
        if (enumC80174VdK4 == EnumC80174VdK.PullUpToLoad) {
            this.LLJL.LIZJ(EnumC80174VdK.PullUpCanceled);
            return;
        }
        if (enumC80174VdK4 == EnumC80174VdK.ReleaseToRefresh) {
            this.LLJL.LIZJ(enumC80174VdK5);
            return;
        }
        if (enumC80174VdK4 == EnumC80174VdK.ReleaseToLoad) {
            this.LLJL.LIZJ(enumC80174VdK3);
            return;
        }
        if (enumC80174VdK4 == EnumC80174VdK.ReleaseToTwoLevel) {
            this.LLJL.LIZJ(EnumC80174VdK.TwoLevelReleased);
            return;
        }
        if (enumC80174VdK4 == EnumC80174VdK.RefreshReleased) {
            if (this.LLLFFI != null) {
                return;
            }
            this.LLJL.LIZ(this.LLJILJILJ);
        } else if (enumC80174VdK4 == EnumC80174VdK.LoadReleased) {
            if (this.LLLFFI != null) {
                return;
            }
            this.LLJL.LIZ(-this.LLJJ);
        } else {
            if (this.LJLILLLLZI == 0) {
                return;
            }
            this.LLJL.LIZ(0);
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        float currVelocity;
        EnumC80174VdK enumC80174VdK;
        this.LLF.getCurrY();
        if (this.LLF.computeScrollOffset()) {
            int finalY = this.LLF.getFinalY();
            if (finalY >= 0 ? finalY <= 0 || ((!this.LLI && !this.LLIIJI) || !this.LLJJJJLIIL.LJIILJJIL()) : (!this.LLFZ && !this.LLIIJI) || !this.LLJJJJLIIL.LIZ()) {
                this.LLL = true;
                invalidate();
                return;
            }
            if (this.LLL) {
                if (finalY > 0) {
                    currVelocity = -this.LLF.getCurrVelocity();
                } else {
                    currVelocity = this.LLF.getCurrVelocity();
                }
                if (this.LLLFFI == null) {
                    if (currVelocity > 0.0f && ((enumC80174VdK = this.LLJLIL) == EnumC80174VdK.Refreshing || enumC80174VdK == EnumC80174VdK.TwoLevel)) {
                        this.LLLFF = new RunnableC80170VdG(this, currVelocity, this.LLJILJILJ);
                    } else if (currVelocity < 0.0f && (this.LLJLIL == EnumC80174VdK.Loading || ((this.LLIIIJ && this.LLILL && this.LLILLIZIL && LJIIJ(this.LLI)) || (this.LLIIJLIL && !this.LLILL && LJIIJ(this.LLI) && this.LLJLIL != EnumC80174VdK.Refreshing)))) {
                        this.LLLFF = new RunnableC80170VdG(this, currVelocity, -this.LLJJ);
                    } else if (this.LJLILLLLZI == 0 && this.LLIIIZ) {
                        this.LLLFF = new RunnableC80170VdG(this, currVelocity, 0);
                    }
                }
            }
            this.LLF.forceFinished(true);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LLJILJIL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    public InterfaceC80186VdW getRefreshFooter() {
        InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
        if (interfaceC80186VdW instanceof InterfaceC80186VdW) {
            return interfaceC80186VdW;
        }
        return null;
    }

    public InterfaceC80161Vd7 getRefreshHeader() {
        InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
        if (interfaceC80161Vd7 instanceof InterfaceC80161Vd7) {
            return interfaceC80161Vd7;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        if (this.LLIL && (this.LLIIJI || this.LLFZ || this.LLI)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC80186VdW interfaceC80186VdW;
        super.onAttachedToWindow();
        boolean z = true;
        this.LLJZ = true;
        if (!isInEditMode()) {
            if (this.LLJJJJ == null) {
                LJIJJ(new C80171VdH(getContext()));
            }
            if (this.LLJJJJJIL == null) {
                boolean z2 = this.LLI;
                LJIJI(new C80169VdF(getContext()));
                this.LLI = z2;
            } else {
                if (!this.LLI && this.LLILLJJLI) {
                    z = false;
                }
                this.LLI = z;
            }
            if (this.LLJJJJLIIL == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
                    if ((interfaceC80161Vd7 == null || childAt != interfaceC80161Vd7.getView()) && ((interfaceC80186VdW = this.LLJJJJJIL) == null || childAt != interfaceC80186VdW.getView())) {
                        this.LLJJJJLIIL = new C80157Vd3(childAt);
                    }
                }
            }
            if (this.LLJJJJLIIL == null) {
                int LIZJ = InterpolatorC80153Vcz.LIZJ(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.rj9);
                super.addView(textView, 0, new C80176VdM(-1));
                C80157Vd3 c80157Vd3 = new C80157Vd3(textView);
                this.LLJJJJLIIL = c80157Vd3;
                c80157Vd3.LJLIL.setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
            }
            View findViewById = findViewById(this.LJLLLLLL);
            View findViewById2 = findViewById(this.LJLZ);
            this.LLJJJJLIIL.LJFF();
            C80157Vd3 c80157Vd32 = this.LLJJJJLIIL;
            c80157Vd32.LJLJLLL.LIZJ = this.LLIIZ;
            c80157Vd32.LJI(this.LLJL, findViewById, findViewById2);
            if (this.LJLILLLLZI != 0) {
                LJIILIIL(EnumC80174VdK.None);
                C80157Vd3 c80157Vd33 = this.LLJJJJLIIL;
                this.LJLILLLLZI = 0;
                c80157Vd33.LIZLLL(0, this.LJZ, this.LJZI);
            }
        }
        int[] iArr = this.LLFII;
        if (iArr != null) {
            InterfaceC80161Vd7 interfaceC80161Vd72 = this.LLJJJJ;
            if (interfaceC80161Vd72 != null) {
                interfaceC80161Vd72.setPrimaryColors(iArr);
            }
            InterfaceC80186VdW interfaceC80186VdW2 = this.LLJJJJJIL;
            if (interfaceC80186VdW2 != null) {
                interfaceC80186VdW2.setPrimaryColors(this.LLFII);
            }
        }
        C80157Vd3 c80157Vd34 = this.LLJJJJLIIL;
        if (c80157Vd34 != null) {
            super.bringChildToFront(c80157Vd34.LJLIL);
        }
        InterfaceC80161Vd7 interfaceC80161Vd73 = this.LLJJJJ;
        if (interfaceC80161Vd73 != null && interfaceC80161Vd73.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLJJJJ.getView());
        }
        InterfaceC80186VdW interfaceC80186VdW3 = this.LLJJJJJIL;
        if (interfaceC80186VdW3 != null && interfaceC80186VdW3.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLJJJJJIL.getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJZ = false;
        this.LLJL.LIZIZ(0, true);
        LJIILIIL(EnumC80174VdK.None);
        Handler handler = this.LLJJLIIIJLLLLLLLZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LLILLJJLI = true;
        this.LLLFF = null;
        ValueAnimator valueAnimator = this.LLLFFI;
        if (valueAnimator != null) {
            C16880lQ.LJLJJI(valueAnimator);
            this.LLLFFI.removeAllUpdateListeners();
            this.LLLFFI.cancel();
            this.LLLFFI = null;
        }
        this.LLJZIJLIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinishInflate() {
        /*
            r10 = this;
            super.onFinishInflate()
            int r6 = super.getChildCount()
            r9 = 3
            if (r6 > r9) goto L9b
            r5 = -1
            r8 = 0
            r7 = -1
            r3 = 0
        Le:
            r4 = 2
            r2 = 1
            if (r8 >= r6) goto L32
            android.view.View r1 = super.getChildAt(r8)
            boolean r0 = X.InterpolatorC80153Vcz.LIZLLL(r1)
            if (r0 == 0) goto L25
            if (r3 < r4) goto L20
            if (r8 != r2) goto L25
        L20:
            r7 = r8
            r3 = 2
        L22:
            int r8 = r8 + 1
            goto Le
        L25:
            boolean r0 = r1 instanceof X.InterfaceC80178VdO
            if (r0 != 0) goto L22
            if (r3 >= r2) goto L22
            if (r8 <= 0) goto L30
            r3 = 1
        L2e:
            r7 = r8
            goto L22
        L30:
            r3 = 0
            goto L2e
        L32:
            if (r7 < 0) goto L95
            X.Vd3 r1 = new X.Vd3
            android.view.View r0 = super.getChildAt(r7)
            r1.<init>(r0)
            r10.LLJJJJLIIL = r1
            if (r7 != r2) goto L90
            if (r6 != r9) goto L97
            r3 = 0
        L44:
            r2 = 0
        L45:
            if (r2 >= r6) goto L9a
            android.view.View r1 = super.getChildAt(r2)
            if (r2 == r3) goto L59
            if (r2 == r4) goto L6b
            if (r3 != r5) goto L6b
            X.Vd7 r0 = r10.LLJJJJ
            if (r0 != 0) goto L6b
            boolean r0 = r1 instanceof X.InterfaceC80161Vd7
            if (r0 == 0) goto L6b
        L59:
            boolean r0 = r1 instanceof X.InterfaceC80161Vd7
            if (r0 == 0) goto L64
            X.Vd7 r1 = (X.InterfaceC80161Vd7) r1
        L5f:
            r10.LLJJJJ = r1
        L61:
            int r2 = r2 + 1
            goto L45
        L64:
            X.VdU r0 = new X.VdU
            r0.<init>(r1)
            r1 = r0
            goto L5f
        L6b:
            if (r2 == r4) goto L73
            if (r4 != r5) goto L61
            boolean r0 = r1 instanceof X.InterfaceC80186VdW
            if (r0 == 0) goto L61
        L73:
            boolean r0 = r10.LLI
            if (r0 != 0) goto L7b
            boolean r0 = r10.LLILLJJLI
            if (r0 != 0) goto L8e
        L7b:
            r0 = 1
        L7c:
            r10.LLI = r0
            boolean r0 = r1 instanceof X.InterfaceC80186VdW
            if (r0 == 0) goto L87
            X.VdW r1 = (X.InterfaceC80186VdW) r1
        L84:
            r10.LLJJJJJIL = r1
            goto L61
        L87:
            X.VdT r0 = new X.VdT
            r0.<init>(r1)
            r1 = r0
            goto L84
        L8e:
            r0 = 0
            goto L7c
        L90:
            if (r6 != r4) goto L95
            r3 = -1
            r4 = 1
            goto L44
        L95:
            r3 = -1
            goto L98
        L97:
            r3 = 0
        L98:
            r4 = -1
            goto L44
        L9a:
            return
        L9b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Most only support three sub view"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80164VdA.onFinishInflate():void");
    }

    public EnumC80174VdK getState() {
        return this.LLJLIL;
    }

    public C80164VdA(Context context) {
        super(context, null);
        boolean z;
        boolean z2;
        boolean z3;
        C80181VdR c80181VdR;
        C80181VdR c80181VdR2;
        this.LJLJJL = 300;
        this.LJLJJLL = 300;
        this.LJLLILLLL = 0.5f;
        this.LJLLJ = 'n';
        this.LJLLLLLL = -1;
        this.LJLZ = -1;
        this.LJZ = -1;
        this.LJZI = -1;
        this.LLFZ = true;
        this.LLIFFJFJJ = true;
        this.LLII = true;
        this.LLIIII = true;
        this.LLIIIILZ = true;
        this.LLIIIL = true;
        this.LLIIIZ = true;
        this.LLIIJLIL = true;
        this.LLIILII = true;
        this.LLIILZL = true;
        this.LLIIZ = true;
        this.LLIL = true;
        this.LLJI = new int[2];
        C16610kz c16610kz = new C16610kz(this);
        this.LLJIJIL = c16610kz;
        this.LLJILJIL = new C16690l7();
        C80181VdR c80181VdR3 = C80181VdR.LIZJ;
        this.LLJILLL = c80181VdR3;
        this.LLJJI = c80181VdR3;
        this.LLJJIJIIJIL = 2.5f;
        this.LLJJIJIL = 2.5f;
        this.LLJJJ = 1.0f;
        this.LLJJJIL = 1.0f;
        this.LLJL = new C80165VdB(this);
        EnumC80174VdK enumC80174VdK = EnumC80174VdK.None;
        this.LLJLIL = enumC80174VdK;
        this.LLJLILLLLZIIL = enumC80174VdK;
        this.LLJLL = 0L;
        this.LLJLLIL = 0;
        this.LLJLLL = 0;
        this.LLJZIJLIL = false;
        this.LLL = false;
        this.LLLF = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLJJLIIIJLLLLLLLZ = new Handler(C16880lQ.LLJJJJ());
        this.LLF = new Scroller(context);
        this.LLFF = VelocityTracker.obtain();
        this.LJLJL = context.getResources().getDisplayMetrics().heightPixels;
        this.LLFFF = new InterpolatorC80153Vcz(0);
        this.LJLIL = viewConfiguration.getScaledTouchSlop();
        this.LJZL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLJJ = InterpolatorC80153Vcz.LIZJ(60.0f);
        this.LLJILJILJ = InterpolatorC80153Vcz.LIZJ(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{android.R.attr.clipChildren, android.R.attr.clipToPadding, R.attr.bcb, R.attr.bce, R.attr.bcf, R.attr.bcg, R.attr.bcn, R.attr.bco, R.attr.bcp, R.attr.bcq, R.attr.bcr, R.attr.bcs, R.attr.bct, R.attr.bcw, R.attr.bcx, R.attr.bcy, R.attr.bcz, R.attr.bd0, R.attr.bd1, R.attr.bd3, R.attr.bd4, R.attr.bd5, R.attr.bd6, R.attr.bd9, R.attr.bd_, R.attr.bdc, R.attr.bdd, R.attr.bde, R.attr.bdf, R.attr.bdg, R.attr.bdh, R.attr.bdi, R.attr.bdj, R.attr.bdk, R.attr.bdl, R.attr.bdo, R.attr.bdp});
        if (!obtainStyledAttributes.hasValue(1)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(0)) {
            super.setClipChildren(false);
        }
        this.LJLLILLLL = obtainStyledAttributes.getFloat(5, 0.5f);
        this.LLJJIJIIJIL = obtainStyledAttributes.getFloat(32, 2.5f);
        this.LLJJIJIL = obtainStyledAttributes.getFloat(27, 2.5f);
        this.LLJJJ = obtainStyledAttributes.getFloat(34, 1.0f);
        this.LLJJJIL = obtainStyledAttributes.getFloat(29, 1.0f);
        this.LLFZ = obtainStyledAttributes.getBoolean(20, this.LLFZ);
        this.LJLJJLL = obtainStyledAttributes.getInt(36, 300);
        this.LLI = obtainStyledAttributes.getBoolean(13, this.LLI);
        this.LLJILJILJ = obtainStyledAttributes.getDimensionPixelOffset(30, this.LLJILJILJ);
        this.LLJJ = obtainStyledAttributes.getDimensionPixelOffset(25, this.LLJJ);
        this.LLJJIII = obtainStyledAttributes.getDimensionPixelOffset(31, this.LLJJIII);
        this.LLJJIJI = obtainStyledAttributes.getDimensionPixelOffset(26, this.LLJJIJI);
        this.LLILII = obtainStyledAttributes.getBoolean(4, this.LLILII);
        this.LLILIL = obtainStyledAttributes.getBoolean(3, this.LLILIL);
        this.LLIIII = obtainStyledAttributes.getBoolean(12, true);
        this.LLIIIILZ = obtainStyledAttributes.getBoolean(11, true);
        this.LLIIIL = obtainStyledAttributes.getBoolean(18, true);
        this.LLIIJLIL = obtainStyledAttributes.getBoolean(6, this.LLIIJLIL);
        this.LLIIIZ = obtainStyledAttributes.getBoolean(16, true);
        boolean z4 = obtainStyledAttributes.getBoolean(19, this.LLIIL);
        this.LLIIL = z4;
        this.LLIILII = obtainStyledAttributes.getBoolean(21, true);
        this.LLIILZL = obtainStyledAttributes.getBoolean(22, true);
        this.LLIIZ = obtainStyledAttributes.getBoolean(14, true);
        boolean z5 = obtainStyledAttributes.getBoolean(9, this.LLIIIJ);
        this.LLIIIJ = z5;
        this.LLIIIJ = obtainStyledAttributes.getBoolean(10, z5);
        this.LLIFFJFJJ = obtainStyledAttributes.getBoolean(8, true);
        this.LLII = obtainStyledAttributes.getBoolean(7, true);
        this.LLIIJI = obtainStyledAttributes.getBoolean(17, this.LLIIJI);
        this.LJLLLLLL = obtainStyledAttributes.getResourceId(24, -1);
        this.LJLZ = obtainStyledAttributes.getResourceId(23, -1);
        this.LJZ = obtainStyledAttributes.getResourceId(33, -1);
        this.LJZI = obtainStyledAttributes.getResourceId(28, -1);
        boolean z6 = obtainStyledAttributes.getBoolean(15, this.LLIL);
        this.LLIL = z6;
        c16610kz.LJIIJ(z6);
        if (this.LLILLJJLI || obtainStyledAttributes.hasValue(13)) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLJJLI = z;
        if (this.LLILLL || obtainStyledAttributes.hasValue(12)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLILLL = z2;
        if (this.LLILZ || obtainStyledAttributes.hasValue(11)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLILZ = z3;
        if (obtainStyledAttributes.hasValue(30)) {
            c80181VdR = C80181VdR.LJFF;
        } else {
            c80181VdR = this.LLJILLL;
        }
        this.LLJILLL = c80181VdR;
        if (obtainStyledAttributes.hasValue(25)) {
            c80181VdR2 = C80181VdR.LJFF;
        } else {
            c80181VdR2 = this.LLJJI;
        }
        this.LLJJI = c80181VdR2;
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(35, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.LLFII = new int[]{color2, color};
            } else {
                this.LLFII = new int[]{color2};
            }
        } else if (color != 0) {
            this.LLFII = new int[]{0, color};
        }
        if (z4 && !this.LLILLJJLI && !this.LLI) {
            this.LLI = true;
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean LJIIIZ(int i) {
        if (i == 0) {
            if (this.LLLFFI != null) {
                EnumC80174VdK enumC80174VdK = this.LLJLIL;
                if (enumC80174VdK.isFinishing || enumC80174VdK == EnumC80174VdK.TwoLevelReleased) {
                    return true;
                }
                if (enumC80174VdK == EnumC80174VdK.PullDownCanceled) {
                    this.LLJL.LIZJ(EnumC80174VdK.PullDownToRefresh);
                } else if (enumC80174VdK == EnumC80174VdK.PullUpCanceled) {
                    this.LLJL.LIZJ(EnumC80174VdK.PullUpToLoad);
                }
                this.LLLFFI.cancel();
                this.LLLFFI = null;
            }
            this.LLLFF = null;
        }
        if (this.LLLFFI != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ(boolean z) {
        if (z && !this.LLIIL) {
            return true;
        }
        return false;
    }

    public final void LJIIL(float f) {
        EnumC80174VdK enumC80174VdK;
        if (this.LLJ && !this.LLIIZ && f < 0.0f && !this.LLJJJJLIIL.LJIILJJIL()) {
            f = 0.0f;
        }
        EnumC80174VdK enumC80174VdK2 = this.LLJLIL;
        if (enumC80174VdK2 == EnumC80174VdK.TwoLevel && f > 0.0f) {
            this.LLJL.LIZIZ(Math.min((int) f, getMeasuredHeight()), true);
        } else if (enumC80174VdK2 == EnumC80174VdK.Refreshing && f >= 0.0f) {
            float f2 = this.LLJILJILJ;
            if (f < f2) {
                this.LLJL.LIZIZ((int) f, true);
            } else {
                double d = (this.LLJJIJIIJIL - 1.0f) * f2;
                int max = Math.max((this.LJLJL * 4) / 3, getHeight());
                int i = this.LLJILJILJ;
                double d2 = max - i;
                double max2 = Math.max(0.0f, (f - i) * this.LJLLILLLL);
                double d3 = -max2;
                if (d2 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d2 = 1.0d;
                }
                this.LLJL.LIZIZ(((int) Math.min((1.0d - Math.pow(100.0d, d3 / d2)) * d, max2)) + this.LLJILJILJ, true);
            }
        } else if (f < 0.0f && (enumC80174VdK2 == EnumC80174VdK.Loading || ((this.LLIIIJ && this.LLILL && this.LLILLIZIL && LJIIJ(this.LLI)) || (this.LLIIJLIL && !this.LLILL && LJIIJ(this.LLI))))) {
            int i2 = this.LLJJ;
            if (f > (-i2)) {
                this.LLJL.LIZIZ((int) f, true);
            } else {
                double d4 = (this.LLJJIJIL - 1.0f) * i2;
                int max3 = Math.max((this.LJLJL * 4) / 3, getHeight());
                int i3 = this.LLJJ;
                double d5 = max3 - i3;
                double d6 = -Math.min(0.0f, (i3 + f) * this.LJLLILLLL);
                double d7 = -d6;
                if (d5 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d5 = 1.0d;
                }
                this.LLJL.LIZIZ(((int) (-Math.min((1.0d - Math.pow(100.0d, d7 / d5)) * d4, d6))) - this.LLJJ, true);
            }
        } else if (f >= 0.0f) {
            double d8 = this.LLJJIJIIJIL * this.LLJILJILJ;
            double max4 = Math.max(this.LJLJL / 2, getHeight());
            double max5 = Math.max(0.0f, this.LJLLILLLL * f);
            double d9 = -max5;
            if (max4 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                max4 = 1.0d;
            }
            this.LLJL.LIZIZ((int) Math.min((1.0d - Math.pow(100.0d, d9 / max4)) * d8, max5), true);
        } else {
            double d10 = this.LLJJIJIL * this.LLJJ;
            double max6 = Math.max(this.LJLJL / 2, getHeight());
            double d11 = -Math.min(0.0f, this.LJLLILLLL * f);
            double d12 = -d11;
            if (max6 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                max6 = 1.0d;
            }
            this.LLJL.LIZIZ((int) (-Math.min((1.0d - Math.pow(100.0d, d12 / max6)) * d10, d11)), true);
        }
        if (this.LLIIJLIL && !this.LLILL && LJIIJ(this.LLI) && f < 0.0f && (enumC80174VdK = this.LLJLIL) != EnumC80174VdK.Refreshing && enumC80174VdK != EnumC80174VdK.Loading && enumC80174VdK != EnumC80174VdK.LoadFinish) {
            if (this.LLILIL) {
                this.LLLFF = null;
                this.LLJL.LIZ(-this.LLJJ);
            }
            setStateDirectLoading(false);
            this.LLJJLIIIJLLLLLLLZ.postDelayed(new ARunnableS50S0100000_14(this, 256), this.LJLJJLL);
        }
    }

    public final void LJIILIIL(EnumC80174VdK enumC80174VdK) {
        EnumC80174VdK enumC80174VdK2 = this.LLJLIL;
        if (enumC80174VdK2 != enumC80174VdK) {
            this.LLJLIL = enumC80174VdK;
            this.LLJLILLLLZIIL = enumC80174VdK;
            InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
            InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
            InterfaceC80179VdP interfaceC80179VdP = this.LLIZ;
            if (interfaceC80161Vd7 != null) {
                interfaceC80161Vd7.LIZIZ(this, enumC80174VdK2, enumC80174VdK);
            }
            if (interfaceC80186VdW != null) {
                interfaceC80186VdW.LIZIZ(this, enumC80174VdK2, enumC80174VdK);
            }
            if (interfaceC80179VdP != null) {
                interfaceC80179VdP.LIZIZ(this, enumC80174VdK2, enumC80174VdK);
            }
            if (enumC80174VdK == EnumC80174VdK.LoadFinish) {
                this.LLJZIJLIL = false;
                return;
            }
            return;
        }
        if (this.LLJLILLLLZIIL == enumC80174VdK2) {
            return;
        }
        this.LLJLILLLLZIIL = enumC80174VdK2;
    }

    public final void LJIIZILJ(boolean z) {
        EnumC80174VdK enumC80174VdK = this.LLJLIL;
        if (enumC80174VdK == EnumC80174VdK.Refreshing && z) {
            LJIIIIZZ(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.LLJLL))), 300) << 16, true, Boolean.TRUE);
            return;
        }
        if (enumC80174VdK == EnumC80174VdK.Loading && z) {
            LJII(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.LLJLL))), 300) << 16, true);
            return;
        }
        if (this.LLILL == z) {
            return;
        }
        this.LLILL = z;
        InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
        if (!(interfaceC80186VdW instanceof InterfaceC80186VdW)) {
            return;
        }
        if (interfaceC80186VdW.LJIIJJI(z)) {
            this.LLILLIZIL = true;
            if (!this.LLILL || !this.LLIIIJ || this.LJLILLLLZI <= 0 || this.LLJJJJJIL.getSpinnerStyle() != C80182VdS.LIZJ || !LJIIJ(this.LLI) || !LJIIJJI(this.LLFZ, this.LLJJJJ)) {
                return;
            }
            this.LLJJJJJIL.getView().setTranslationY(this.LJLILLLLZI);
            return;
        }
        this.LLILLIZIL = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Footer:");
        LIZ.append(this.LLJJJJJIL);
        LIZ.append(" NoMoreData is not supported");
        new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public InterfaceC78979Uz9 LJIJ(View view) {
        C80157Vd3 c80157Vd3 = this.LLJJJJLIIL;
        if (c80157Vd3 != null) {
            super.removeView(c80157Vd3.LJLIL);
        }
        this.LLJJJJLIIL = new C80157Vd3(view);
        super.addView(view, getChildCount(), new C80176VdM(-1));
        if (this.LLJZ) {
            View findViewById = findViewById(this.LJLLLLLL);
            View findViewById2 = findViewById(this.LJLZ);
            this.LLJJJJLIIL.LJFF();
            C80157Vd3 c80157Vd32 = this.LLJJJJLIIL;
            c80157Vd32.LJLJLLL.LIZJ = this.LLIIZ;
            c80157Vd32.LJI(this.LLJL, findViewById, findViewById2);
        }
        InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
        if (interfaceC80161Vd7 != null && interfaceC80161Vd7.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLJJJJ.getView());
        }
        InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
        if (interfaceC80186VdW != null && interfaceC80186VdW.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLJJJJJIL.getView());
        }
        return this;
    }

    public final void LJIJI(InterfaceC80186VdW interfaceC80186VdW) {
        boolean z;
        InterfaceC80186VdW interfaceC80186VdW2;
        InterfaceC80186VdW interfaceC80186VdW3 = this.LLJJJJJIL;
        if (interfaceC80186VdW3 != null) {
            super.removeView(interfaceC80186VdW3.getView());
        }
        this.LLJJJJJIL = interfaceC80186VdW;
        this.LLJZIJLIL = false;
        this.LLJLLL = 0;
        this.LLILLIZIL = false;
        C80181VdR c80181VdR = this.LLJJI;
        if (c80181VdR.LIZIZ) {
            c80181VdR = C80181VdR.LJII[c80181VdR.LIZ - 1];
            if (c80181VdR.LIZIZ) {
                c80181VdR = C80181VdR.LIZJ;
            }
        }
        this.LLJJI = c80181VdR;
        if (!this.LLILLJJLI || this.LLI) {
            z = true;
        } else {
            z = false;
        }
        this.LLI = z;
        if (interfaceC80186VdW.getSpinnerStyle().LIZ) {
            super.addView(this.LLJJJJJIL.getView(), getChildCount(), new C80176VdM(-2));
        } else {
            super.addView(this.LLJJJJJIL.getView(), 0, new C80176VdM(-2));
        }
        int[] iArr = this.LLFII;
        if (iArr != null && (interfaceC80186VdW2 = this.LLJJJJJIL) != null) {
            interfaceC80186VdW2.setPrimaryColors(iArr);
        }
    }

    public final void LJIJJ(InterfaceC80161Vd7 interfaceC80161Vd7) {
        InterfaceC80161Vd7 interfaceC80161Vd72;
        InterfaceC80161Vd7 interfaceC80161Vd73 = this.LLJJJJ;
        if (interfaceC80161Vd73 != null) {
            super.removeView(interfaceC80161Vd73.getView());
        }
        this.LLJJJJ = interfaceC80161Vd7;
        this.LLJLLIL = 0;
        C80181VdR c80181VdR = this.LLJILLL;
        if (c80181VdR.LIZIZ) {
            c80181VdR = C80181VdR.LJII[c80181VdR.LIZ - 1];
            if (c80181VdR.LIZIZ) {
                c80181VdR = C80181VdR.LIZJ;
            }
        }
        this.LLJILLL = c80181VdR;
        if (interfaceC80161Vd7.getSpinnerStyle().LIZ) {
            super.addView(this.LLJJJJ.getView(), getChildCount(), new C80176VdM(-2));
        } else {
            super.addView(this.LLJJJJ.getView(), 0, new C80176VdM(-2));
        }
        int[] iArr = this.LLFII;
        if (iArr != null && (interfaceC80161Vd72 = this.LLJJJJ) != null) {
            interfaceC80161Vd72.setPrimaryColors(iArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        if (r9 <= r4.LLJILJILJ) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        if (r9 >= (-r4.LLJJ)) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(float r21) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80164VdA.LJIJJLI(float):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dd, code lost:
    
        if (r8 != 3) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02db  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80164VdA.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80176VdM(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LLJILJIL.LIZIZ(0);
        this.LLJ = false;
        this.LLIZLLLIL = 0;
        LJIILLIIL();
        this.LLJIJIL.LJIIL(0);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLIL = z;
        this.LLJIJIL.LJIIJ(z);
    }

    public void setStateDirectLoading(boolean z) {
        EnumC80174VdK enumC80174VdK = this.LLJLIL;
        EnumC80174VdK enumC80174VdK2 = EnumC80174VdK.Loading;
        if (enumC80174VdK != enumC80174VdK2) {
            this.LLJLL = System.currentTimeMillis();
            this.LLJZIJLIL = true;
            LJIILIIL(enumC80174VdK2);
            InterfaceC79839VVb interfaceC79839VVb = this.LLILZLL;
            if (interfaceC79839VVb != null) {
                if (z) {
                    interfaceC79839VVb.LJIIJ(this);
                }
            } else if (this.LLIZ == null) {
                LJII(LiveNetAdaptiveHurryTimeSetting.DEFAULT, false);
            }
            InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
            if (interfaceC80186VdW != null) {
                int i = this.LLJJ;
                interfaceC80186VdW.LJJI(this, i, (int) (this.LLJJIJIL * i));
            }
            InterfaceC80179VdP interfaceC80179VdP = this.LLIZ;
            if (interfaceC80179VdP != null && (this.LLJJJJJIL instanceof InterfaceC80186VdW)) {
                if (z) {
                    interfaceC80179VdP.LJIIJ(this);
                }
                this.LLIZ.LJIJJ();
            }
        }
    }

    public void setStateLoading(boolean z) {
        ALAdapterS5S0110000_14 aLAdapterS5S0110000_14 = new ALAdapterS5S0110000_14(this, z, 4);
        LJIILIIL(EnumC80174VdK.LoadReleased);
        ValueAnimator LIZ = this.LLJL.LIZ(-this.LLJJ);
        if (LIZ != null) {
            LIZ.addListener(aLAdapterS5S0110000_14);
        }
        InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
        if (interfaceC80186VdW != null) {
            int i = this.LLJJ;
            interfaceC80186VdW.LJIJ(this, i, (int) (this.LLJJIJIL * i));
        }
        InterfaceC80179VdP interfaceC80179VdP = this.LLIZ;
        if (interfaceC80179VdP != null && (this.LLJJJJJIL instanceof InterfaceC80186VdW)) {
            interfaceC80179VdP.LJJ();
        }
        if (LIZ == null) {
            aLAdapterS5S0110000_14.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        ALAdapterS5S0110000_14 aLAdapterS5S0110000_14 = new ALAdapterS5S0110000_14(this, z, 5);
        LJIILIIL(EnumC80174VdK.RefreshReleased);
        ValueAnimator LIZ = this.LLJL.LIZ(this.LLJILJILJ);
        if (LIZ != null) {
            LIZ.addListener(aLAdapterS5S0110000_14);
        }
        InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
        if (interfaceC80161Vd7 != null) {
            int i = this.LLJILJILJ;
            interfaceC80161Vd7.LJIJ(this, i, (int) (this.LLJJIJIIJIL * i));
        }
        InterfaceC80179VdP interfaceC80179VdP = this.LLIZ;
        if (interfaceC80179VdP != null && (this.LLJJJJ instanceof InterfaceC80161Vd7)) {
            interfaceC80179VdP.LJIILIIL();
        }
        if (LIZ == null) {
            aLAdapterS5S0110000_14.onAnimationEnd(null);
        }
    }

    public void setViceState(EnumC80174VdK enumC80174VdK) {
        EnumC80174VdK enumC80174VdK2 = this.LLJLIL;
        if (enumC80174VdK2.isDragging && enumC80174VdK2.isHeader != enumC80174VdK.isHeader) {
            LJIILIIL(EnumC80174VdK.None);
        }
        if (this.LLJLILLLLZIIL != enumC80174VdK) {
            this.LLJLILLLLZIIL = enumC80174VdK;
        }
    }

    public final void LJII(int i, boolean z) {
        int i2 = (i << 16) >> 16;
        RunnableC80167VdD runnableC80167VdD = new RunnableC80167VdD(this, i >> 16, z);
        if (i2 > 0) {
            this.LLJJLIIIJLLLLLLLZ.postDelayed(runnableC80167VdD, i2);
        } else {
            runnableC80167VdD.run();
        }
    }

    public final boolean LJIIJJI(boolean z, InterfaceC80178VdO interfaceC80178VdO) {
        if (z || this.LLIIL || interfaceC80178VdO == null || interfaceC80178VdO.getSpinnerStyle() == C80182VdS.LIZLLL) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        LJIJ(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80164VdA.onMeasure(int, int):void");
    }

    public final void LJIIIIZZ(int i, boolean z, Boolean bool) {
        int i2 = (i << 16) >> 16;
        RunnableC80166VdC runnableC80166VdC = new RunnableC80166VdC(this, i >> 16, bool, z);
        if (i2 > 0) {
            this.LLJJLIIIJLLLLLLLZ.postDelayed(runnableC80166VdC, i2);
        } else {
            runnableC80166VdC.run();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        View view2;
        Paint paint;
        Paint paint2;
        C80157Vd3 c80157Vd3 = this.LLJJJJLIIL;
        if (c80157Vd3 != null) {
            view2 = c80157Vd3.LJLIL;
        } else {
            view2 = null;
        }
        InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
        if (interfaceC80161Vd7 != null && interfaceC80161Vd7.getView() == view) {
            if (!LJIIJ(this.LLFZ) || (!this.LLIIIL && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getPaddingTop() + view2.getTop() + this.LJLILLLLZI, view.getTop());
                int i = this.LLJLLIL;
                if (i != 0 && (paint2 = this.LLJJL) != null) {
                    paint2.setColor(i);
                    if (this.LLJJJJ.getSpinnerStyle().LIZIZ) {
                        max = view.getBottom();
                    } else if (this.LLJJJJ.getSpinnerStyle() == C80182VdS.LIZJ) {
                        max = view.getBottom() + this.LJLILLLLZI;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), max, this.LLJJL);
                }
                if (this.LLIFFJFJJ && this.LLJJJJ.getSpinnerStyle() == C80182VdS.LIZLLL) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
        if (interfaceC80186VdW != null && interfaceC80186VdW.getView() == view) {
            if (!LJIIJ(this.LLI) || (!this.LLIIIL && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int min = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.LJLILLLLZI, view.getBottom());
                int i2 = this.LLJLLL;
                if (i2 != 0 && (paint = this.LLJJL) != null) {
                    paint.setColor(i2);
                    if (this.LLJJJJJIL.getSpinnerStyle().LIZIZ) {
                        min = view.getTop();
                    } else if (this.LLJJJJJIL.getSpinnerStyle() == C80182VdS.LIZJ) {
                        min = view.getTop() + this.LJLILLLLZI;
                    }
                    canvas.drawRect(0.0f, min, getWidth(), view.getBottom(), this.LLJJL);
                }
                if (this.LLII && this.LLJJJJJIL.getSpinnerStyle() == C80182VdS.LIZLLL) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if ((this.LLJZIJLIL && f2 > 0.0f) || LJIJJLI(-f2) || this.LLJIJIL.LIZIZ(f, f2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC16670l5
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LLJILJIL.LIZ(i, 0);
        this.LLJIJIL.LJIIJJI(i & 2, 0);
        this.LLIZLLLIL = this.LJLILLLLZI;
        this.LLJ = true;
        LJIIIZ(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0 && (this.LLIIJI || this.LLFZ || this.LLI)) {
            return true;
        }
        return false;
    }

    public final ValueAnimator LJI(int i, int i2, int i3, Interpolator interpolator) {
        if (this.LJLILLLLZI == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.LLLFFI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLFF = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.LJLILLLLZI, i);
        this.LLLFFI = ofInt;
        ofInt.setDuration(i3);
        this.LLLFFI.setInterpolator(interpolator);
        this.LLLFFI.addListener(new ALAdapterS11S0100000_14(this, 59));
        this.LLLFFI.addUpdateListener(new AUListenerS101S0100000_14(this, 63));
        this.LLLFFI.setStartDelay(i2);
        this.LLLFFI.start();
        return this.LLLFFI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.LLJIJIL.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = this.LLIZLLLIL;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.LLIZLLLIL)) {
                int i5 = this.LLIZLLLIL;
                this.LLIZLLLIL = 0;
                i4 = i5;
            } else {
                this.LLIZLLLIL -= i2;
                i4 = i2;
            }
            LJIIL(this.LLIZLLLIL);
        } else if (i2 > 0 && this.LLJZIJLIL) {
            int i6 = i3 - i2;
            this.LLIZLLLIL = i6;
            LJIIL(i6);
            i4 = i2;
        }
        this.LLJIJIL.LIZLLL(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = super.getChildAt(i8);
            if (childAt.getVisibility() != 8 && childAt.getTag(R.string.rj8) != childAt) {
                C80157Vd3 c80157Vd3 = this.LLJJJJLIIL;
                boolean z4 = true;
                if (c80157Vd3 != null && c80157Vd3.LJLIL == childAt) {
                    if (isInEditMode() && this.LLIIIL && LJIIJ(this.LLFZ) && this.LLJJJJ != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    View view = this.LLJJJJLIIL.LJLIL;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = LLLFZ;
                    }
                    int i9 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i10 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i9;
                    int measuredHeight = view.getMeasuredHeight() + i10;
                    if (z3 && LJIIJJI(this.LLIIII, this.LLJJJJ)) {
                        int i11 = this.LLJILJILJ;
                        i10 += i11;
                        measuredHeight += i11;
                    }
                    view.layout(i9, i10, measuredWidth, measuredHeight);
                }
                InterfaceC80161Vd7 interfaceC80161Vd7 = this.LLJJJJ;
                if (interfaceC80161Vd7 != null && interfaceC80161Vd7.getView() == childAt) {
                    if (isInEditMode() && this.LLIIIL && LJIIJ(this.LLFZ)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    View view2 = this.LLJJJJ.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = LLLFZ;
                    }
                    int i12 = marginLayoutParams2.leftMargin;
                    int i13 = marginLayoutParams2.topMargin + this.LLJJIII;
                    int measuredWidth2 = view2.getMeasuredWidth() + i12;
                    int measuredHeight2 = view2.getMeasuredHeight() + i13;
                    if (!z2 && this.LLJJJJ.getSpinnerStyle() == C80182VdS.LIZJ) {
                        int i14 = this.LLJILJILJ;
                        i13 -= i14;
                        measuredHeight2 -= i14;
                    }
                    view2.layout(i12, i13, measuredWidth2, measuredHeight2);
                }
                InterfaceC80186VdW interfaceC80186VdW = this.LLJJJJJIL;
                if (interfaceC80186VdW != null && interfaceC80186VdW.getView() == childAt) {
                    if (!isInEditMode() || !this.LLIIIL || !LJIIJ(this.LLI)) {
                        z4 = false;
                    }
                    View view3 = this.LLJJJJJIL.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = LLLFZ;
                    }
                    C80182VdS spinnerStyle = this.LLJJJJJIL.getSpinnerStyle();
                    int i15 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (getMeasuredHeight() + marginLayoutParams.topMargin) - this.LLJJIJI;
                    if (this.LLILL && this.LLILLIZIL && this.LLIIIJ && this.LLJJJJLIIL != null && this.LLJJJJJIL.getSpinnerStyle() == C80182VdS.LIZJ && LJIIJ(this.LLI)) {
                        View view4 = this.LLJJJJLIIL.LJLIL;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i7 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i7 = 0;
                        }
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + i7;
                    }
                    if (spinnerStyle == C80182VdS.LJFF) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.LLJJIJI;
                    } else {
                        if (z4 || spinnerStyle == C80182VdS.LJ || spinnerStyle == C80182VdS.LIZLLL) {
                            i5 = this.LLJJ;
                        } else if (spinnerStyle.LIZIZ && this.LJLILLLLZI < 0) {
                            if (LJIIJ(this.LLI)) {
                                i6 = -this.LJLILLLLZI;
                            } else {
                                i6 = 0;
                            }
                            i5 = Math.max(i6, 0);
                        }
                        measuredHeight3 -= i5;
                    }
                    C17M.LIZIZ(view3, measuredHeight3, i15, measuredHeight3, view3.getMeasuredWidth() + i15);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        EnumC80174VdK enumC80174VdK;
        boolean LJFF = this.LLJIJIL.LJFF(i, i2, i3, i4, this.LLJI);
        int i5 = i4 + this.LLJI[1];
        if (i5 >= 0 ? !(i5 <= 0 || (!this.LLI && !this.LLIIJI)) : !(!this.LLFZ && !this.LLIIJI)) {
            EnumC80174VdK enumC80174VdK2 = this.LLJLILLLLZIIL;
            if (enumC80174VdK2 == EnumC80174VdK.None || enumC80174VdK2.isOpening) {
                C80165VdB c80165VdB = this.LLJL;
                if (i5 > 0) {
                    enumC80174VdK = EnumC80174VdK.PullUpToLoad;
                } else {
                    enumC80174VdK = EnumC80174VdK.PullDownToRefresh;
                }
                c80165VdB.LIZJ(enumC80174VdK);
                if (!LJFF) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.LLIZLLLIL - i5;
            this.LLIZLLLIL = i6;
            LJIIL(i6);
        }
        if (this.LLJZIJLIL && i2 < 0) {
            this.LLJZIJLIL = false;
        }
    }
}
