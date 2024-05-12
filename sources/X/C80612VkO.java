package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.VkO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80612VkO extends FrameLayout implements InterfaceC80617VkT {
    public C80611VkN LJLIL;
    public C80611VkN LJLILLLLZI;
    public C80611VkN LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public Paint LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public String[] LJLJLLL;
    public final String[] LJLL;
    public C8TY LJLLI;
    public final float LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public int LJLLLLLL;
    public float LJLZ;

    public static String LIZIZ(int i) {
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(i);
        if (valueOf.length() < 2) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        return C0EH.LIZJ(sb, valueOf, "sb.toString()");
    }

    private final void setupNumberPickerView(C80611VkN c80611VkN) {
        float f = this.LJLLILLLL;
        c80611VkN.setPadding(0, (int) (14 * f), 0, (int) (f * 11.5d));
        c80611VkN.setLayoutParams(new ViewGroup.LayoutParams((int) (60 * this.LJLLILLLL), -2));
    }

    public final int[] LIZJ(int i) {
        int i2;
        int[] iArr = new int[3];
        this.LJLJJI = i;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 - (i4 * 60);
        if (this.LJLJL) {
            i2 = i4 % 12;
        } else {
            i2 = i4 % 24;
        }
        String[] strArr = this.LJLJLLL;
        if (strArr != null) {
            int indexOf = Arrays.asList(Arrays.copyOf(strArr, strArr.length)).indexOf(LIZIZ(i2));
            String[] strArr2 = this.LJLL;
            int indexOf2 = Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)).indexOf(LIZIZ(i5));
            iArr[0] = indexOf;
            iArr[1] = indexOf2;
            return iArr;
        }
        o.LJIJI("hours");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.dispatchDraw(canvas);
        C80611VkN c80611VkN = this.LJLJI;
        o.LJI(c80611VkN);
        RectF rectF = c80611VkN.LLF;
        o.LJI(rectF);
        float f = rectF.top;
        C80611VkN c80611VkN2 = this.LJLJI;
        o.LJI(c80611VkN2);
        RectF rectF2 = c80611VkN2.LLF;
        o.LJI(rectF2);
        float f2 = rectF2.bottom;
        Paint paint = this.LJLJJLL;
        float width = getWidth();
        o.LJI(paint);
        canvas.drawLine(0.0f, f, width, f, paint);
        canvas.drawLine(0.0f, f2, getWidth(), f2, paint);
    }

    public final void setNonRecurrent(boolean z) {
        C80611VkN c80611VkN = this.LJLILLLLZI;
        o.LJI(c80611VkN);
        c80611VkN.setNonRecurrent(z);
        C80611VkN c80611VkN2 = this.LJLJI;
        o.LJI(c80611VkN2);
        c80611VkN2.setNonRecurrent(z);
    }

    public final void setTime(int i) {
        int i2;
        int[] LIZJ = LIZJ(i);
        if (this.LJLJL) {
            C80611VkN c80611VkN = this.LJLIL;
            o.LJI(c80611VkN);
            if (i < this.LJLJJL) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c80611VkN.LJFF(i2);
        }
        C80611VkN c80611VkN2 = this.LJLILLLLZI;
        o.LJI(c80611VkN2);
        c80611VkN2.LJFF(LIZJ[0]);
        C80611VkN c80611VkN3 = this.LJLJI;
        o.LJI(c80611VkN3);
        c80611VkN3.LJFF(LIZJ[1]);
    }

    public static void LJ(C80611VkN c80611VkN, int i) {
        ViewGroup.LayoutParams layoutParams = c80611VkN.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(i);
        c80611VkN.setLayoutParams(layoutParams2);
    }

    @Override // X.InterfaceC80617VkT
    public final void LIZ(C80611VkN c80611VkN, int i, int i2) {
        if (o.LJ(c80611VkN, this.LJLIL)) {
            if (i == 0) {
                if (i2 == 1) {
                    this.LJLJJI += this.LJLJJL;
                }
            } else if (i == 1 && i2 == 0) {
                this.LJLJJI -= this.LJLJJL;
            }
        } else if (o.LJ(c80611VkN, this.LJLILLLLZI)) {
            this.LJLJJI += (i2 - i) * 60 * 60;
        } else if (o.LJ(c80611VkN, this.LJLJI)) {
            this.LJLJJI += (i2 - i) * 60;
        }
        C8TY c8ty = this.LJLLI;
        if (c8ty != null) {
            c8ty.LIZ(this.LJLJJI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80612VkO(Context context, int i, boolean z, boolean z2) {
        super(context, null, 0);
        int i2;
        a1.LJFF(context, "context");
        this.LJLJJL = 43200;
        String[] strArr = new String[60];
        for (int i3 = 0; i3 < 60; i3++) {
            strArr[i3] = "";
        }
        for (int i4 = 0; i4 < 60; i4++) {
            if (i4 < 10) {
                strArr[i4] = C169696lJ.LIZIZ('0', i4);
            } else {
                strArr[i4] = String.valueOf(i4);
            }
        }
        this.LJLL = strArr;
        float f = getResources().getDisplayMetrics().density;
        this.LJLLILLLL = f;
        this.LJLJL = z;
        this.LJLJLJ = z2;
        this.LJLJJI = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.a_c, R.attr.a_m, R.attr.b4f, R.attr.b4g}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…lPicker, defStyleAttr, 0)");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dz, typedValue, true);
        this.LJLLL = obtainStyledAttributes.getColor(0, typedValue.data);
        this.LJLLLL = obtainStyledAttributes.getDimension(1, 1.0f * f);
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.go, typedValue2, true);
        int i5 = typedValue2.data;
        this.LJLLJ = i5;
        this.LJLLLLLL = obtainStyledAttributes.getColor(2, i5);
        this.LJLZ = obtainStyledAttributes.getDimension(3, f * 17.0f);
        obtainStyledAttributes.recycle();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        this.LJLILLLLZI = new C80611VkN(context2);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        this.LJLJI = new C80611VkN(context3);
        C80611VkN c80611VkN = this.LJLILLLLZI;
        o.LJI(c80611VkN);
        setupNumberPickerView(c80611VkN);
        C80611VkN c80611VkN2 = this.LJLJI;
        o.LJI(c80611VkN2);
        setupNumberPickerView(c80611VkN2);
        if (z) {
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            C80611VkN c80611VkN3 = new C80611VkN(context4);
            this.LJLIL = c80611VkN3;
            setupNumberPickerView(c80611VkN3);
            LIZLLL(relativeLayout, layoutParams, 65, z);
            String[] strArr2 = new String[12];
            int i6 = 0;
            do {
                strArr2[i6] = "";
                i6++;
            } while (i6 < 12);
            strArr2[0] = "12";
            int i7 = 1;
            loop3: while (true) {
                strArr2[i7] = C169696lJ.LIZIZ('0', i7);
                while (true) {
                    i7++;
                    if (i7 >= 12) {
                        break loop3;
                    } else if (i7 < 10) {
                        break;
                    } else {
                        strArr2[i7] = String.valueOf(i7);
                    }
                }
            }
            this.LJLJLLL = strArr2;
            if (this.LJLJLJ) {
                C80611VkN c80611VkN4 = this.LJLILLLLZI;
                o.LJI(c80611VkN4);
                LJ(c80611VkN4, 20);
                C80611VkN c80611VkN5 = this.LJLJI;
                o.LJI(c80611VkN5);
                LJ(c80611VkN5, 14);
                C80611VkN c80611VkN6 = this.LJLIL;
                o.LJI(c80611VkN6);
                LJ(c80611VkN6, 21);
                addView(relativeLayout);
            } else {
                C80611VkN c80611VkN7 = this.LJLIL;
                o.LJI(c80611VkN7);
                LJ(c80611VkN7, 20);
                C80611VkN c80611VkN8 = this.LJLILLLLZI;
                o.LJI(c80611VkN8);
                LJ(c80611VkN8, 14);
                C80611VkN c80611VkN9 = this.LJLJI;
                o.LJI(c80611VkN9);
                LJ(c80611VkN9, 21);
                addView(relativeLayout);
            }
            C80611VkN c80611VkN10 = this.LJLIL;
            o.LJI(c80611VkN10);
            c80611VkN10.LLIIJLIL = this;
            String[] strArr3 = {getContext().getResources().getString(R.string.p4_), getContext().getResources().getString(R.string.p4a)};
            C80611VkN c80611VkN11 = this.LJLIL;
            o.LJI(c80611VkN11);
            c80611VkN11.LLIIJLIL = this;
            C80611VkN c80611VkN12 = this.LJLIL;
            o.LJI(c80611VkN12);
            C80614VkQ c80614VkQ = new C80614VkQ(c80611VkN12);
            c80611VkN12.setMTextArray(strArr3);
            c80611VkN12.setMEndNumber(1);
            c80611VkN12.LLILII = true;
            if (this.LJLJJI < this.LJLJJL) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c80611VkN12.LJLLLL = i2;
            this.LJLIL = c80614VkQ.LIZ();
        } else {
            String[] strArr4 = new String[24];
            int i8 = 0;
            do {
                strArr4[i8] = "";
                i8++;
            } while (i8 < 24);
            int i9 = 0;
            loop6: while (true) {
                strArr4[i9] = C169696lJ.LIZIZ('0', i9);
                while (true) {
                    i9++;
                    if (i9 >= 24) {
                        break loop6;
                    } else if (i9 < 10) {
                        break;
                    } else {
                        strArr4[i9] = String.valueOf(i9);
                    }
                }
            }
            this.LJLJLLL = strArr4;
            LIZLLL(relativeLayout, layoutParams, 112, this.LJLJL);
            C80611VkN c80611VkN13 = this.LJLILLLLZI;
            o.LJI(c80611VkN13);
            LJ(c80611VkN13, 20);
            C80611VkN c80611VkN14 = this.LJLJI;
            o.LJI(c80611VkN14);
            LJ(c80611VkN14, 21);
            addView(relativeLayout);
        }
        int[] LIZJ = LIZJ(this.LJLJJI);
        C80611VkN c80611VkN15 = this.LJLILLLLZI;
        o.LJI(c80611VkN15);
        c80611VkN15.LLIIJLIL = this;
        C80611VkN c80611VkN16 = this.LJLJI;
        o.LJI(c80611VkN16);
        c80611VkN16.LLIIJLIL = this;
        C80611VkN c80611VkN17 = this.LJLILLLLZI;
        o.LJI(c80611VkN17);
        C80614VkQ c80614VkQ2 = new C80614VkQ(c80611VkN17);
        String[] strArr5 = this.LJLJLLL;
        if (strArr5 != null) {
            c80611VkN17.setMTextArray(strArr5);
            String[] strArr6 = this.LJLJLLL;
            if (strArr6 != null) {
                c80611VkN17.setMEndNumber(strArr6.length - 1);
                c80611VkN17.LLILII = false;
                c80611VkN17.LJLLLL = LIZJ[0];
                this.LJLILLLLZI = c80614VkQ2.LIZ();
                C80611VkN c80611VkN18 = this.LJLJI;
                o.LJI(c80611VkN18);
                C80614VkQ c80614VkQ3 = new C80614VkQ(c80611VkN18);
                c80611VkN18.setMTextArray(this.LJLL);
                c80611VkN18.setMEndNumber(this.LJLL.length - 1);
                c80611VkN18.LLILII = false;
                c80611VkN18.LJLLLL = LIZJ[1];
                this.LJLJI = c80614VkQ3.LIZ();
                if (this.LJLJL) {
                    C80611VkN c80611VkN19 = this.LJLILLLLZI;
                    o.LJI(c80611VkN19);
                    c80611VkN19.LLIIL = new C80613VkP(this);
                }
                int i10 = this.LJLLLLLL;
                if (i10 != this.LJLLJ) {
                    if (this.LJLJL) {
                        C80611VkN c80611VkN20 = this.LJLIL;
                        o.LJI(c80611VkN20);
                        c80611VkN20.LJLL = i10;
                        c80611VkN20.LIZLLL();
                        c80611VkN20.invalidate();
                    }
                    C80611VkN c80611VkN21 = this.LJLILLLLZI;
                    o.LJI(c80611VkN21);
                    c80611VkN21.LJLL = i10;
                    c80611VkN21.LIZLLL();
                    c80611VkN21.invalidate();
                    C80611VkN c80611VkN22 = this.LJLJI;
                    o.LJI(c80611VkN22);
                    c80611VkN22.LJLL = i10;
                    c80611VkN22.LIZLLL();
                    c80611VkN22.invalidate();
                }
                float f2 = this.LJLZ;
                if (f2 != this.LJLLILLLL * 17.0f) {
                    if (this.LJLJL) {
                        C80611VkN c80611VkN23 = this.LJLIL;
                        o.LJI(c80611VkN23);
                        c80611VkN23.LJLLI = f2;
                        c80611VkN23.LIZJ();
                        c80611VkN23.invalidate();
                    }
                    C80611VkN c80611VkN24 = this.LJLILLLLZI;
                    o.LJI(c80611VkN24);
                    c80611VkN24.LJLLI = f2;
                    c80611VkN24.LIZJ();
                    c80611VkN24.invalidate();
                    C80611VkN c80611VkN25 = this.LJLJI;
                    o.LJI(c80611VkN25);
                    c80611VkN25.LJLLI = f2;
                    c80611VkN25.LIZJ();
                    c80611VkN25.invalidate();
                }
                Paint paint = new Paint();
                this.LJLJJLL = paint;
                paint.setColor(this.LJLLL);
                Paint paint2 = this.LJLJJLL;
                o.LJI(paint2);
                paint2.setStrokeWidth(this.LJLLLL);
                return;
            }
            o.LJIJI("hours");
            throw null;
        }
        o.LJIJI("hours");
        throw null;
    }

    public final void LIZLLL(RelativeLayout relativeLayout, RelativeLayout.LayoutParams layoutParams, int i, boolean z) {
        int i2 = (int) (i * this.LJLLILLLL);
        layoutParams.setMargins(i2, 0, i2, 0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(this.LJLILLLLZI);
        relativeLayout.addView(this.LJLJI);
        if (z) {
            relativeLayout.addView(this.LJLIL);
        }
    }
}
