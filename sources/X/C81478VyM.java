package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VyM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81478VyM extends RelativeLayout {
    public static final float LJLLLL = C32151Nz.LJIIZILJ(12);
    public EnumC81480VyO LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public AbstractC26257ASf LJLJL;
    public GradientDrawable LJLJLJ;
    public final RectF LJLJLLL;
    public final Path LJLL;
    public float[] LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public C53860LBw LJLLJ;
    public BottomSheetBehavior<?> LJLLL;

    private final int getMinHeightPx() {
        return ((Number) this.LJLLILLLL.getValue()).intValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        EnumC81480VyO enumC81480VyO = this.LJLIL;
        EnumC81480VyO enumC81480VyO2 = EnumC81480VyO.DYNAMIC;
        int i = 0;
        if (enumC81480VyO == enumC81480VyO2 || enumC81480VyO == EnumC81480VyO.FULLSCREEN) {
            z = true;
        } else {
            z = false;
        }
        C53860LBw c53860LBw = this.LJLLJ;
        if (c53860LBw != null) {
            if (!z) {
                i = 8;
            }
            c53860LBw.setVisibility(i);
        }
        BottomSheetBehavior<?> from = BottomSheetBehavior.from(this);
        this.LJLLL = from;
        if (from != null) {
            from.setBottomSheetCallback(new C81479VyN(z, this));
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJLLL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(this.LJLILLLLZI);
            EnumC81480VyO enumC81480VyO3 = this.LJLIL;
            if (enumC81480VyO3 == EnumC81480VyO.FIXED) {
                bottomSheetBehavior.setPeekHeight(this.LJLJI);
            } else {
                if (enumC81480VyO3 != enumC81480VyO2) {
                    return;
                }
                bottomSheetBehavior.setPeekHeight(this.LJLJJI);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLLJ = (C53860LBw) findViewById(R.id.jw1);
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.LJLLL;
    }

    public final AbstractC26257ASf getBottomSheetCallback() {
        return this.LJLJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getDismissFunc() {
        return this.LJLJJLL;
    }

    public final int getDynamicMaxHeightPx() {
        return this.LJLJJL;
    }

    public final int getDynamicPeekHeightPx() {
        return this.LJLJJI;
    }

    public final int getFixedHeightPx() {
        return this.LJLJI;
    }

    public final C53860LBw getHandleView() {
        return this.LJLLJ;
    }

    public final EnumC81480VyO getVariant() {
        return this.LJLIL;
    }

    public final GradientDrawable LIZ(Integer num) {
        C110614Vt c110614Vt = new C110614Vt();
        if (num == null) {
            num = 0;
        }
        c110614Vt.LIZIZ = num;
        float f = LJLLLL;
        c110614Vt.LJIIIIZZ = Float.valueOf(f);
        c110614Vt.LJIIIZ = Float.valueOf(f);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return (GradientDrawable) c110614Vt.LIZ(context);
    }

    public final void LIZIZ(boolean z) {
        float f;
        if (z) {
            f = LJLLLL;
        } else {
            f = 0.0f;
        }
        float[] fArr = {f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LJLLI = fArr;
        GradientDrawable gradientDrawable = this.LJLJLJ;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLJLLL.set(0.0f, 0.0f, getWidth(), getHeight());
        float[] fArr = this.LJLLI;
        if (fArr != null) {
            this.LJLL.reset();
            this.LJLL.addRoundRect(this.LJLJLLL, fArr, Path.Direction.CW);
            canvas.clipPath(this.LJLL);
        } else {
            canvas.clipRect(this.LJLJLLL);
        }
        super.draw(canvas);
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.LJLLL = bottomSheetBehavior;
    }

    public final void setBottomSheetBackground$tools_creative_sheet_scene_release(GradientDrawable gradientDrawable) {
        if (gradientDrawable == null) {
            gradientDrawable = LIZ(null);
        }
        this.LJLJLJ = gradientDrawable;
        setBackground(gradientDrawable);
    }

    public final void setBottomSheetBackgroundColor$tools_creative_sheet_scene_release(Integer num) {
        GradientDrawable LIZ = LIZ(num);
        this.LJLJLJ = LIZ;
        setBackground(LIZ);
    }

    public final void setBottomSheetCallback(AbstractC26257ASf abstractC26257ASf) {
        this.LJLJL = abstractC26257ASf;
    }

    public final void setDismissFunc(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJLL = interfaceC65784Pro;
    }

    public final void setDynamicMaxHeightPx(int i) {
        this.LJLJJL = i;
    }

    public final void setDynamicPeekHeightPx(int i) {
        this.LJLJJI = i;
    }

    public final void setFixedHeightPx(int i) {
        this.LJLJI = i;
    }

    public final void setHandleView(C53860LBw c53860LBw) {
        this.LJLLJ = c53860LBw;
    }

    public final void setHideable(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setVariant(EnumC81480VyO enumC81480VyO) {
        o.LJIIIZ(enumC81480VyO, "<set-?>");
        this.LJLIL = enumC81480VyO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81478VyM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = EnumC81480VyO.AUTO_SIZE;
        this.LJLILLLLZI = true;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLJJL = -1;
        this.LJLJLLL = new RectF();
        this.LJLL = new Path();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 270));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r6 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r6 > r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r6 > r0) goto L41;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L46
            int r2 = X.C63081OpJ.LJJJJJL(r0)
            int r5 = r9.getMeasuredHeight()
            X.VyO r0 = r9.LJLIL
            int[] r1 = X.C81481VyP.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 2
            r7 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            r4 = 0
            if (r1 == r0) goto L71
            r0 = 3
            if (r1 == r0) goto L7f
            r0 = 4
            if (r1 == r0) goto L64
            r0 = 5
            if (r1 == r0) goto L58
        L2d:
            r6 = r5
        L2e:
            if (r6 == r5) goto L40
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r10, r0)
            int r0 = r9.getMeasuredWidth()
            r9.setMeasuredDimension(r0, r6)
        L40:
            if (r4 == 0) goto L4f
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r9.LJLLL
            if (r1 != 0) goto L47
        L46:
            return
        L47:
            int r0 = r4.intValue()
            r1.setPeekHeight(r0)
            goto L46
        L4f:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r9.LJLLL
            if (r0 != 0) goto L54
            goto L46
        L54:
            r0.setPeekHeight(r6)
            goto L46
        L58:
            int r6 = android.view.View.MeasureSpec.getSize(r11)
            double r1 = (double) r6
            double r1 = r1 * r7
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L2e
        L64:
            int r0 = r9.LJLJJI
            if (r0 <= 0) goto L6c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L6c:
            int r6 = r9.LJLJJL
            if (r6 <= 0) goto L2d
            goto L2e
        L71:
            int r6 = r9.getMinHeightPx()
            if (r5 >= r6) goto L7d
        L77:
            double r1 = (double) r2
            double r1 = r1 * r7
            int r0 = (int) r1
            if (r6 <= r0) goto L2e
            goto L8d
        L7d:
            r6 = r5
            goto L77
        L7f:
            int r6 = r9.LJLJI
            if (r6 <= 0) goto L8f
        L83:
            double r2 = (double) r2
            r0 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r2 = r2 * r0
            int r0 = (int) r2
            if (r6 <= r0) goto L2e
        L8d:
            r6 = r0
            goto L2e
        L8f:
            r6 = r5
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81478VyM.onMeasure(int, int):void");
    }
}
